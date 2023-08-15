package org.oceanops.api;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cayenne.BaseContext;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.ashwood.WeightedAshwoodEntitySorter;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.dba.PkGenerator;
import org.apache.cayenne.map.EntitySorter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.oceanops.api.db.PGPkGeneratorCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/**
 * Class defining utility/helper functions and access to properties
 */
public class Utils {
	private static Logger logger = LoggerFactory.getLogger(Utils.class); 
	private static Properties properties;
	private static String projectName, projectVersion, rootUrl, programUrl, inspectPtfUrl, helpEditionDate,
			versionQualifier, entityPath;
	private static boolean betaVersion;
	public static final String CSV_SEPARATOR = ";";
	public static final DateTimeFormatter ISO_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
	public static final DateTimeFormatter ISO_DATE_NO_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static final Integer OCEANOPS_AGENCY_ID = 61;
	public static final Integer SOT_NETWORK_ID = 1000622;

	private Utils() {
	}

	/**
	 * Initializes the properties used by the API.
	 */
	public static void init() {
		if (Utils.properties == null) {
			properties = new Properties();
			try {
				properties.load(Utils.class.getClassLoader().getResourceAsStream("properties"));
				projectVersion = properties.getProperty("PROJECT_VERSION");
				projectName = properties.getProperty("PROJECT_NAME");
				rootUrl = properties.getProperty("ROOT_URL");
				programUrl = properties.getProperty("PROGRAM_URL");
				entityPath = properties.getProperty("ENTITY_PATH");
				inspectPtfUrl = properties.getProperty("INSPECT_PTF_URL");
				helpEditionDate = properties.getProperty("HELP_EDITION_DATE");
				betaVersion = projectVersion.substring(0, 1).equals("0") || projectVersion.endsWith("-SNAPSHOT")
						|| projectVersion.endsWith("beta") || projectVersion.endsWith("alpha");
				if (betaVersion)
					versionQualifier = "preview";
				if (betaVersion)
					rootUrl = rootUrl.replace(projectVersion, "preview");
			} catch (IOException e) {
				projectVersion = "X.Y";
				projectName = "ERROR";
			}
		}
	}

	public static String getEntityPath() {
		Utils.init();
		return entityPath;
	}

	public static String getProgramUrl() {
		Utils.init();
		return programUrl;
	}

	public static String getInspectPtfUrl() {
		Utils.init();
		return inspectPtfUrl;
	}

	public static String getProjectName() {
		Utils.init();
		return projectName;
	}

	public static String getProjectVersion() {
		Utils.init();
		return projectVersion;
	}

	public static String getRootUrl() {
		Utils.init();
		return rootUrl;
	}

	public static void setRootUrl(String rootUrl) {
		Utils.rootUrl = rootUrl;
	}

	public static String getHelpEditionDate() {

		Utils.init();
		return helpEditionDate;
	}

	public static void setHelpEditionDate(String buildDate) {
		Utils.helpEditionDate = buildDate;
	}

	public static boolean isBetaVersion() {
		Utils.init();
		return betaVersion;
	}

	public static void setBetaVersion(boolean betaVersion) {
		Utils.betaVersion = betaVersion;
	}

	public static String getVersionQualifier() {
		Utils.init();
		return versionQualifier;
	}

	public static void setVersionQualifier(String versionQualifier) {
		Utils.versionQualifier = versionQualifier;
	}

	/**
	 * Get an ISO 8601 string representation of the input date.
	 * @param localDateTime the input date
	 * @return an ISO 8601 representation string
	 */
	public static String GetIsoDate(LocalDateTime localDateTime) {
		String dateISO = null;
		if (localDateTime != null)
			dateISO = ISO_DATE_FORMAT.format(localDateTime);
		return dateISO;
	}
	
	/**
	 * Get an ISO 8601 string representation (without the time part) of the input date.
	 * @param localDateTime the input date
	 * @return an ISO 8601 representation string (without the time part)
	 */
	public static String GetIsoDateNoTime(LocalDateTime localDateTime) {
		String dateISO = null;
		if (localDateTime != null)
			dateISO = ISO_DATE_NO_TIME_FORMAT.format(localDateTime);
		return dateISO;
	}

	/**
	 * Parses an ISO 8601 string representation and return the corresponding {@link LocalDateTime}.
	 * @param s ISO 8601 string representation
	 * @return the corresponding {@link LocalDateTime} object
	 */
	public static LocalDateTime parseDate(String s) {
		return LocalDateTime.parse(s, ISO_DATE_FORMAT);
	}
	
	/**
	 * Convert a {@link LocalDateTime} to a {@link XMLGregorianCalendar}.
	 * @param localDateTime input date
	 * @return output {@link XMLGregorianCalendar} object
	 */
	public static XMLGregorianCalendar getDateAsXmlGregCal(LocalDateTime localDateTime){
		try {
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(localDateTime.getYear(),
					localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(),
					localDateTime.getSecond(), 0, 0);
			return date;
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	/**
	 * Get the thread Cayenne context
	 * @return a {@link ObjectContext} object
	 */
	public static ObjectContext getCayenneContext() {
		return BaseContext.getThreadObjectContext();
	}

	/**
	 * Generate and return a Cayenne Server Runtime
	 * @return a {@link ServerRuntime} object
	 */
	public static ServerRuntime getCayenneServerRuntime(String pathToCayenneConfFile){
		PGPkGeneratorCustom pkgen = new PGPkGeneratorCustom();
		pkgen.setPkCacheSize(1);

        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-OceanOPS-API.xml")
				.addModule(b -> b
					.bind(PkGenerator.class).toInstance(pkgen)
				)
				.addModule(b -> b
					.bind(EntitySorter.class).to(WeightedAshwoodEntitySorter.class))
                .build();
		// Controlling that modules are applied
		PkGenerator pk = cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().getPkGenerator();
		if(!(pk instanceof PGPkGeneratorCustom)){
			logger.warn("PkGenerator is not an instance of PGPkGeneratorCustom");
			logger.debug(pk.toString());
			logger.debug(cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().toString());
		}

		return cayenneRuntime;
	}

	/**
	 * Determines wether a string could be parsed into an Integer (true) or not (false)
	 * @param str string of a potential Integer
	 * @return
	 */
	public static boolean isInteger(String str) {  
		try {  
			Integer i = Integer.parseInt(str);  
		}  
		catch(NumberFormatException nfe) {  
			return false;  
		}  
		return true;  
	}

	/**
	 * Builds a response with formatted JSON including a data array with only one entity
	 * @param o The single formatted JSON object to include in the data array
	 * @return
	 */
	public static Response buildDataResponseForOneObject(JSONObject o){
		JSONObject r = new JSONObject();
		JSONArray a = new JSONArray();
		a.put(o);
		r.put("success", true);
		r.put("data", a);
		r.put("total", 1);
		return Response.status(Status.OK).entity(r.toString()).type(MediaType.APPLICATION_JSON).build();
	}

	/**
	 * Builds an error response with formatted JSON  
	 * @param status response status (includes statusCode and reasonPhrase)
	 * @param msg error message for user
	 * @return
	 */
	public static Response buildErrorResponse(Status status, String msg){
		JSONObject r = new JSONObject();
			r.put("success", false);
			r.put("errorMessage", msg);
		return Response.status(status).entity(r.toString()).type(MediaType.APPLICATION_JSON).build();
	}

	/**
	 * Loads file with schema into JSONSchema object
	 * @param name name of file (without extension) where schema is kept within src/main/schemas
	 * @return
	 */
	public static JsonSchema getJsonSchemaFromClasspath(String name) {
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4);
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("json-schemas/" + name + ".json");
        return factory.getSchema(is);
    }
	

	/**
	 * 
	 * @param jsonContentObject JSON data object to test
	 * @param schemaFileName Name of Schema file without it's .json extension
	 * @return
	 */
	public static String validateJson(JSONObject jsonContentObject, String schemaName){ 
		Set<ValidationMessage> errors = null;
		JsonSchema schema = Utils.getJsonSchemaFromClasspath(schemaName);
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode node =  objectMapper.readTree(jsonContentObject.toString());
			errors = schema.validate(node);
		}catch(Exception e){

		}
		String msg = "";
		if(errors == null){
			msg = "Unable to validate JSON data.";
		}else if(errors.size() > 0){
			msg = "The provided " + schemaName + " JSON data is not valid: ";
			for (ValidationMessage error : errors) {
				msg += " - " + error.getMessage() ;
			}
		}else{
			msg = "NONE";
		}
		return msg;
	}
}

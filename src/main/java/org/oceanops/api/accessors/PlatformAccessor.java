package org.oceanops.api.accessors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.cayenne.DataRow;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.ObjectSelect;
import org.apache.cayenne.query.SQLSelect;
import org.apache.cayenne.query.SelectById;
import org.oceanops.api.Authorization;
import org.oceanops.api.Utils;
import org.oceanops.api.entities.PlatformEntity;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.PtfIdentifiers;

import io.agrest.Ag;
import io.agrest.AgRequest;
import io.agrest.DataResponse;
import io.agrest.SelectBuilder;

import org.oceanops.api.exceptions.EntityNotFoundException;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
@Path("/")
public class PlatformAccessor {
	// private final Logger logger =
	// LoggerFactory.getLogger(PlatformAccessor.class);
	private ObjectContext context;
	@Context
	private Configuration config;

	public PlatformAccessor() {
		this.context = Utils.getCayenneContext();
	}

	@GET
	@Path("platform")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getAll(@Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = Ag.select(Ptf.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).get();
	}

	@GET
	@Path("platform/{id}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = Ag.select(Ptf.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).getOne();
	}

	@GET
	@Path("platform/ref/{ref}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOneByRef(@PathParam("ref") String ref, @Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = Ag.select(Ptf.class, config);

		AgRequest agRequest = Ag.request(config).andExp(Ptf.REF.eq(ref).toString()).build();
		
		Authorization.applySelectAuthorization(sBuilder);

		sBuilder.request(agRequest);

		return sBuilder.uri(uriInfo).getOne();
	}
	
	@GET
	@Path("platform/wigosid/{wigosid}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOneByWigosId(@PathParam("wigosid") String wigosid, @Context UriInfo uriInfo){		
		SelectBuilder<Ptf> sBuilder = Ag.select(Ptf.class, config);
		
		AgRequest agRequest = Ag.request(config).andExp(
			Ptf.PTF_IDENTIFIERS.dot(PtfIdentifiers.WIGOS_REF).eq(wigosid).toString()
		).build(); 
		
		Authorization.applySelectAuthorization(sBuilder);
		sBuilder.request(agRequest);

		return sBuilder.uri(uriInfo).getOne();
	}

	/**
	 * Query the database to retrieve a platform's details, based on its database
	 * ID.
	 * 
	 * @param id long The database identifier
	 * @return A ORM Ptf object
	 * @throws EntityNotFoundException
	 */
	public Ptf getPtfbyID(long id) throws EntityNotFoundException {
		// Find the platform
		Ptf ptf = SelectById.query(Ptf.class, id).selectOne(this.context);
		if (ptf == null)
			throw new EntityNotFoundException("No platform found for ID = " + String.valueOf(id));
		return ptf;
	}
	
	/**
	 * Query the database to retrieve a platform's details, based on its database
	 * ID.
	 * 
	 * @param id long The database identifier
	 * @return A ORM Ptf object
	 * @throws EntityNotFoundException
	 */
	public Ptf getPtfbyRef(String ref) throws EntityNotFoundException {
		// Find the platform
		Ptf ptf = ObjectSelect.query(Ptf.class, Ptf.REF.eq(ref)).selectOne(this.context);
		if (ptf == null)
			throw new EntityNotFoundException("No platform found for ref = " + ref);
		return ptf;
	}

	/**
	 * Query the database to retrieve a platform's details, based on its WIGOS ID
	 * 
	 * @param wigosid the WIGOS identifier
	 * @return A ORM Ptf object
	 * @throws EntityNotFoundException
	 */
	public Ptf getPtfbyWigosID(String wigosid) throws EntityNotFoundException {
		// Find the platform
		Ptf ptf = ObjectSelect.query(Ptf.class, Ptf.PTF_IDENTIFIERS.dot(PtfIdentifiers.WIGOS_REF).eq(wigosid)).selectOne(this.context);

		if (ptf == null)
			throw new EntityNotFoundException("No platform found for WIGOS ID = " + wigosid);
		
		return ptf;
	}


	/**
	 * Build the list of platform IDs/REFs.
	 * 
	 * @return The list of Platform objects, filled with ID and REF only.
	 */
	public ArrayList<PlatformEntity> getAllPtfIdsRefs() {
		ObjectSelect<Ptf> query = ObjectSelect.query(Ptf.class);
		query.columns(Ptf.ID, Ptf.REF);
		List<Ptf> rows = query.select(context);

		ArrayList<PlatformEntity> ptfs_list = new ArrayList<PlatformEntity>();

		Iterator<Ptf> ptf_itr = rows.iterator();

		while (ptf_itr.hasNext()) {
			Ptf row = ptf_itr.next();
			PlatformEntity ptf = new PlatformEntity();
			ptf.setId(row.getId().intValue());
			ptf.setRef(row.getRef());
			ptfs_list.add(ptf);
		}

		return ptfs_list;

	}

	/**
	 * Filters and returns a subset of platform based on the given parameters.
	 * Parameters can be multi-valued. For and intersection, "." symbol will be
	 * used. For an union, "," symbol will be used (where applicable)
	 * 
	 * @param ptfStatus
	 * @param ptfFamily
	 * @param ptfType
	 * @param ptfModel
	 * @param program
	 * @param network
	 * @param variable
	 * @param sensorModel
	 * @param sensorType
	 * @param ship
	 * @param country
	 * @param insertDate 
	 * @param updateDate 
	 * @return A HashMap containing the database identifiers as keys, the OceanOPS reference as values
	 */
	public HashMap<Integer, HashMap<String, String>> getPtfbySelectedParam(String ptfStatus, String ptfFamily, String ptfType,
			String ptfModel, String gtsid, String program, String network, String variable, String sensorModel,
			String sensorType, String ship, String country, String wigosReady, String updateDate, String insertDate) {
		
		// Sanitize all parameters
		ptfStatus = Utils.basicSanitize(ptfStatus);
		ptfFamily = Utils.basicSanitize(ptfFamily);
		ptfType = Utils.basicSanitize(ptfType);
		ptfModel = Utils.basicSanitize(ptfModel);
		gtsid = Utils.basicSanitize(gtsid);
		program = Utils.basicSanitize(program);
		network = Utils.basicSanitize(network);
		variable = Utils.basicSanitize(variable);
		sensorModel = Utils.basicSanitize(sensorModel);
		sensorType = Utils.basicSanitize(sensorType);
		ship = Utils.basicSanitize(ship);
		country = Utils.basicSanitize(country);
		wigosReady = Utils.basicSanitize(wigosReady);
		updateDate = Utils.basicSanitize(updateDate);
		insertDate = Utils.basicSanitize(insertDate);

		// QUERY PARAMETERS
		String intersectionSymbol = ".", unionSymbol = ",";
		StringBuilder query = new StringBuilder("select ptf.id, ptf.ref, ptfids.wigos_ref from ptf left join ptf_identifiers ptfids on (ptfids.id = ptf.ptf_identifiers_id) where 1=1");
		StringBuilder whereClause = new StringBuilder();
		boolean usingID = false;
		
		// Dates
		if(updateDate != null){
			whereClause.append(buildWhereClauseForDateParam(updateDate, "ptf.update_date"));
		}
		if(insertDate != null){
			whereClause.append(buildWhereClauseForDateParam(insertDate, "ptf.insert_date"));
		}
		
		// WIGOS filtering
		if(wigosReady != null) {
			whereClause.append(" and (ptfids.wigos_ref is not null)");
		}

		// GTS ID
		if(gtsid != null){
			whereClause.append(" and (exists (select null from wmo where wmo.ptf_id = ptf.id and wmo.wmo = '");
			whereClause.append(gtsid);
			whereClause.append("'))");
		}

		// Platform status
		if (ptfStatus != null && !ptfStatus.isEmpty()) {
			String[] parts = ptfStatus.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_status_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_status_id in (select id from ptf_status where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))");
			if (!usingID)
				whereClause.append(")");
		}

		// Platform family
		if (ptfFamily != null && !ptfFamily.isEmpty()) {
			String[] parts = ptfFamily.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (select id from ptf_type where ptf_family_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (select id from ptf_type where ptf_family_id in (select id from ptf_family where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))))");
			if (!usingID)
				whereClause.append(")");
		}

		// Platform Type
		if (ptfType != null && !ptfType.isEmpty()) {
			String[] parts = ptfType.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (select id from ptf_type where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append(")))");
			if (!usingID)
				whereClause.append(")");
		}

		// Platform Model
		if (ptfModel != null && !ptfModel.isEmpty()) {
			String[] parts = ptfModel.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_model_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))");
			if (!usingID)
				whereClause.append(")");
		}

		// Program
		if (program != null && !program.isEmpty()) {
			String[] parts = program.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.program_id in (");
			} else {
				whereClause.append(" and (ptf.program_id in (select id from program where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))");
			if (!usingID)
				whereClause.append(")");
		}

		// Network
		if (network != null && !network.isEmpty()) {
			// Intersection
			if (network.contains(intersectionSymbol)) {
				String[] parts = network.split("\\" + intersectionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from network_ptf np where np.ptf_id = ptf.id and np.network_id =");
					if (!usingID) {
						whereClause.append("(select id from network where lower(name_short) = '");
					}

					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("')");

					whereClause.append(")");
				}

			}
			// Union
			else {
				String[] parts = network.split(unionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);
				whereClause.append(" and exists (select null from network_ptf np where np.ptf_id = ptf.id and np.network_id in (");
				if (!usingID) {
					whereClause.append("select id from network where lower(name_short) in (");
				}

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					if (!usingID)
						whereClause.append("'");
					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("'");
				}
				whereClause.append("))");
				if (!usingID)
					whereClause.append(")");
			}
		}

		// Variable
		if (variable != null && !variable.isEmpty()) {
			// Intersection
			if (variable.contains(intersectionSymbol)) {
				String[] parts = variable.split("\\" + intersectionSymbol);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from ptf_variable pv where pv.ptf_id = ptf.id and pv.variable_id =");
					whereClause.append(parts[i].toLowerCase());
					whereClause.append(")");
				}

			}
			// Union
			else {
				String[] parts = variable.split(unionSymbol);

				whereClause.append(" and exists (select null from ptf_variable pv where pv.ptf_id = ptf.id and pv.variable_id in (");

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					whereClause.append(parts[i].toLowerCase());
				}
				whereClause.append("))");
			}
		}

		// Sensor Model
		if (sensorModel != null && !sensorModel.isEmpty()) {
			// Intersection
			if (sensorModel.contains(intersectionSymbol)) {
				String[] parts = sensorModel.split("\\" + intersectionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id =");
					if (!usingID) {
						whereClause.append("(select id from sensor_model where lower(name_short) = '");
					}

					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("')");

					whereClause.append(")");
				}

			}
			// Union
			else {
				String[] parts = sensorModel.split(unionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);
				whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id in (");
				if (!usingID) {
					whereClause.append("select id from sensor_model where lower(name_short) in (");
				}

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					if (!usingID)
						whereClause.append("'");
					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("'");
				}
				whereClause.append("))");
				if (!usingID)
					whereClause.append(")");
			}
		}

		// Sensor Type
		if (sensorType != null && !sensorType.isEmpty()) {
			// Intersection
			if (sensorType.contains(intersectionSymbol)) {
				String[] parts = sensorType.split("\\" + intersectionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id = (select sensor_model_id from sensor_model_sensor_type smst where smst.sensor_model_id = psm.sensor_model_id and smst.sensot_type_id = ");
					if (!usingID) {
						whereClause.append("(select id from sensor_type where lower(name_short) = '");
					}

					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("')");

					whereClause.append("))");
				}

			}
			// Union
			else {
				String[] parts = sensorType.split(unionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);
				whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id = (select sensor_model_id from sensor_model_sensor_type smst where smst.sensor_model_id = psm.sensor_model_id and smst.sensot_type_id in (");
				if (!usingID) {
					whereClause.append("select id from sensor_type where lower(name_short) in (");
				}

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					if (!usingID)
						whereClause.append("'");
					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("'");
				}
				if (!usingID)
					whereClause.append(")");
				whereClause.append(")))");
			}
		}

		// Ship
		if (ship != null && !ship.isEmpty()) {
			String[] parts = ship.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			whereClause.append(" and ((select d.ship_id from ptf_deployment d where d.id = ptf.ptf_depl_id) in (");
			if (!usingID) {
				whereClause.append("select id from ship where ref in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i]);
				if (!usingID)
					whereClause.append("'");
			}
			if (!usingID)
				whereClause.append(")");
			whereClause.append("))");
		}

		// Ship
		if (country != null && !country.isEmpty()) {
			String[] parts = country.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			whereClause.append(" and ((select pr.country_id from program pr where pr.id = ptf.program_id) in (");
			if (!usingID) {
				whereClause.append("select id from country where code2 in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i]);
				if (!usingID)
					whereClause.append("'");
			}
			if (!usingID)
				whereClause.append(")");
			whereClause.append("))");
		}

		query.append(whereClause);
		
		/*SQLTemplate query_search = new SQLTemplate(Ptf.class, query.toString());
		query_search.setFetchingDataRows(true);
		List<DataRow> rows = context.performQuery(query_search);*/

		SQLSelect<DataRow> query_search = SQLSelect.dataRowQuery(query.toString());
		List<DataRow> rows = query_search.select(context);

		HashMap<Integer, HashMap<String, String>> ptfList = new HashMap<>();

		Iterator<DataRow> ptf_itr = rows.iterator();

		while (ptf_itr.hasNext()) {
			HashMap<String, String> ptfIds = new HashMap<String, String>();
			DataRow row = ptf_itr.next();
			ptfIds.put("ref", (String)row.get("REF"));
			if(row.get("WIGOS_REF") != null)
				ptfIds.put("wigos_ref", (String)row.get("WIGOS_REF"));
			else
				ptfIds.put("wigos_ref", "");
				
				
			ptfList.put((Integer) row.get("ID"), ptfIds);
		}

		return ptfList;
	}

	public String WritePtfCSV(long id) throws EntityNotFoundException {
		String csv = null;
		
		PlatformEntity ptfm = new PlatformEntity(getPtfbyID(id));
		csv = ptfm.toCSV();
		
		return csv;

	}
	
	
	/**
	 * From an input date parameter query string and a database path, computes the corresponding where clause.
	 * @param dateParam	Date query string parameter, following the mathematical ineterval syntax
	 * @param sqlParam	Database path for the concerned field
	 * @return	String	The expected where clause
	 * @throws BadRequestException	When the date format is incorrect
	 */
	public String buildWhereClauseForDateParam(String dateParam, String sqlParam) throws BadRequestException{
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		StringBuilder whereClause = new StringBuilder();
		
		if(dateParam != null){
			String startSymbol = null, endSymbol = null;
			String sqlStartSymbol = null, sqlEndSymbol = null;
			String[] updateDatesString;
			
			// Identifying symbols
			if(dateParam.startsWith("[") || dateParam.startsWith("]")){
				startSymbol = dateParam.substring(0, 1);
				if(startSymbol.equals("["))
					sqlStartSymbol = ">=";
				else if (startSymbol.equals("]"))
					sqlStartSymbol = ">";
				dateParam = dateParam.substring(1);
			}

			if(dateParam.endsWith("[") ||  dateParam.endsWith("]")){
				endSymbol = dateParam.substring(dateParam.length()-1);
				if(endSymbol.equals("]"))
					sqlEndSymbol = "<=";
				else if (endSymbol.equals("["))
					sqlEndSymbol = "<";
				dateParam = dateParam.substring(0, dateParam.length() - 1);
			}
			
			// Default: considering date as a left side bounder (looking for more recent or equal to that date)
			if(startSymbol == null && endSymbol == null){
				sqlStartSymbol = ">=";
			}
			
			// Guessing if there is one date or an interval
			if(dateParam.contains(",")){
				updateDatesString = dateParam.split(",");
			}
			else{
				updateDatesString = new String[1];
				updateDatesString[0] = dateParam;
			}

			try{
				// Tryinig to parse the date-s
				if(updateDatesString.length == 1){
					dateFormatter.parse(updateDatesString[0]);
					if(sqlStartSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlStartSymbol);
						whereClause.append(" to_date('" + updateDatesString[0] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
					if(sqlEndSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlEndSymbol);
						whereClause.append(" to_date('" + updateDatesString[0] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
				}
				else if(updateDatesString.length == 2){
					dateFormatter.parse(updateDatesString[0]);
					dateFormatter.parse(updateDatesString[1]);
					if(sqlStartSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlStartSymbol);
						whereClause.append(" to_date('" + updateDatesString[0] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
					if(sqlEndSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlEndSymbol);
						whereClause.append(" to_date('" + updateDatesString[1] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
				}
			}
			catch (ParseException e) {
				throw new BadRequestException("Date parameter is not well formatted. Date should be given in the following format: YYYY-MM-DDTHH:MI:SS");
			}
		}
		
		return whereClause.toString();
	}
}

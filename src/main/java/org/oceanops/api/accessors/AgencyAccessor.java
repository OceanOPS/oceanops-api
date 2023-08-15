package org.oceanops.api.accessors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Configuration;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.SelectById;
import org.json.JSONObject;
import org.oceanops.api.Authorization;
import org.oceanops.orm.Agency;
import org.oceanops.orm.AgencyRole;
import org.oceanops.orm.Country;
import org.oceanops.orm.Weblink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.agrest.DataResponse;
import io.agrest.SelectBuilder;
import io.agrest.jaxrs3.AgJaxrs;

import org.oceanops.api.Utils;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class AgencyAccessor {
    private static Logger logger = LoggerFactory.getLogger(AgencyAccessor.class);

	@Context
    private Configuration config;
    
	@GET
    @Path("agency")
    public DataResponse<Agency> getAll(@Context UriInfo uriInfo) {
		SelectBuilder<Agency> sBuilder = AgJaxrs.select(Agency.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
    }
	
    @GET
    @Path("agency/{id}")
	public DataResponse<Agency> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Agency> sBuilder = AgJaxrs.select(Agency.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}  

    
	@GET
    @Path("agencyrole")
    public DataResponse<AgencyRole> getAllRoles(@Context UriInfo uriInfo) {
		SelectBuilder<AgencyRole> sBuilder = AgJaxrs.select(AgencyRole.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
    }

	/**
	 * Create a new Agency or Update an existing Agency's, with properties and relationships
	 * 
	 * @param data JSON to parse for properties and nested objects
	 * Include an "id" property in data JSONObject to perform an update
	 * If no id is provided it creates a new entity
	 * @return
	 */

	@POST
	@Path("agency")
	public Response createOrUpdateAgency(String data) {
		boolean isValid = false;
		JSONObject providedData = new JSONObject(data);
		String msg = "";

		if(Authorization.hasAdminRights()){
			try{
				String invalidDataMessage = Utils.validateJson(providedData, "agency");
				if(invalidDataMessage == "NONE"){
					isValid = true;
				}else{
					msg = invalidDataMessage;
				}
			}catch(Exception e){
				msg = "Unable to validate JSON data.";
			}
		}

		if(!Authorization.hasAdminRights()){
			msg = "The user is unauthorized to process the request.";
			return Utils.buildErrorResponse(Status.FORBIDDEN, msg);
		}else if(!isValid){
			return Utils.buildErrorResponse(Status.BAD_REQUEST, msg);
		}else{
			ObjectContext context = Utils.getCayenneContext();
			Agency agency = null;
			if(!providedData.has("id")){
				// CREATE NEW AGENCY
				agency = new Agency();
				context.registerNewObject(agency);
			}else{
				// GET AGENCY TO UPDATE
				Integer id = providedData.getInt("id");
				agency = SelectById.query(Agency.class, id).selectOne(context);
			}
			setAgencyPropertiesWithRecievedValues(providedData, agency, context);
			context.commitChanges();
			return Utils.buildDataResponseForOneObject(agency.buildJSON());
		}
	}
	
	/**
	 * Set's the agency's properties by calling all the set methods
	 * @param receivedData provided JSON to parse to get the properties
	 * @param agency entity
	 * @param context
	 */
	private void setAgencyPropertiesWithRecievedValues(JSONObject receivedData, Agency agency, ObjectContext context){
			setTheNonNestedProperties(receivedData, agency, context);
			setCountryIfPresent(receivedData, agency, context);
			setWeblinkIfPresent(receivedData, agency, context);

			// Other update methods ...
    }


	/**
	 * Set's the agency's properties, all except the nested properties/relationships
	 * @param jsonData provided JSON to parse to get the properties
	 * @param agency entity
	 * @param context
	 */
	private void setTheNonNestedProperties(JSONObject jsonData, Agency agency, ObjectContext context){
		if(jsonData.has("name")){
        	agency.setName(jsonData.get("name").toString());
		}
		if(jsonData.has("nameShort")){
        	agency.setNameShort(jsonData.get("nameShort").toString());
		}
		if(jsonData.has("lat")){
        	agency.setLat(Double.parseDouble(jsonData.get("lat").toString()));
		}
		if(jsonData.has("lon")){
        	agency.setLon(Double.parseDouble(jsonData.get("lon").toString()));
		}
		if(jsonData.has("fax")){
        	agency.setFax(jsonData.get("fax").toString());
		}
		if(jsonData.has("address")){
        	agency.setAddress(jsonData.get("address").toString());
		}
    }


	/**
	 * Set's the agency's country from a provided id
	 * @param jsonData provided JSON to parse to get the country id
	 * @param agency entity
	 * @param context
	 */
	private void setCountryIfPresent(JSONObject jsonData, Agency agency, ObjectContext context) {
		if (jsonData.has("country")) {
			JSONObject countryJson = jsonData.getJSONObject("country");
			if (countryJson.has("id") && Utils.isInteger(countryJson.get("id").toString())) {
				int countryId = countryJson.getInt("id");
				Country country = SelectById.query(Country.class, countryId).selectOne(context);
				if(country != null){
					agency.setCountry(country);
				}
			}
		}
	}


	/**
	 * Set's the agency's weblink (an existing weblink if provided an id, or create a weblink from other params)
	 * @param jsonData provided JSON to parse
	 * @param agency entity
	 * @param context
	 */
	private void setWeblinkIfPresent(JSONObject jsonData, Agency agency, ObjectContext context) {
		if (jsonData.has("weblink")) {
			JSONObject weblinkJson = jsonData.getJSONObject("weblink");
			if (weblinkJson.has("id")) {
				int weblinkId = weblinkJson.getInt("id");
				Weblink weblink = SelectById.query(Weblink.class, weblinkId).selectOne(context);
				agency.setWeblink(weblink);
			}else{
				Weblink weblink = Weblink.createWeblinkFromJson(weblinkJson, context);
				agency.setWeblink(weblink);
			}
		}
	}
}

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
			agency.setAgencyPropertiesWithRecievedValues(providedData, context);
			context.commitChanges();
			return Utils.buildDataResponseForOneObject(agency.buildJSON());
		}
	}

}

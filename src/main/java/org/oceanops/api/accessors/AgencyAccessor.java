package org.oceanops.api.accessors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Configuration;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.MediaType;
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

	@POST
	@Path("agency")
	public DataResponse<Agency> createAgency(@Context UriInfo uri, String data) {
		return AgJaxrs.create(Agency.class, config) 
				.clientParams(uri.getQueryParameters()) 
				.syncAndSelect(data); 
	}

	@PUT
	@Path("agency/{id}")
	public DataResponse<Agency> updateAgency(@PathParam("id") int id, @Context UriInfo uri, String data) {
		ObjectContext context = Utils.getCayenneContext();
		Agency agency = SelectById.query(Agency.class, id).selectOne(context);
		JSONObject jsonData = new JSONObject(data);
		
		setCountryIfPresent(jsonData, agency, context);
		setWeblinkIfPresent(jsonData, agency, context);

		// Other updates ...

		context.commitChanges();
		return AgJaxrs.update(Agency.class, config) 
	 			.clientParams(uri.getQueryParameters()) 
	 			.syncAndSelect(data); 
	}

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

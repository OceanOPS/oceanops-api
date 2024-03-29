package org.oceanops.api.accessors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Configuration;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.MediaType;

import org.oceanops.api.Authorization;
import org.oceanops.orm.Agency;
import org.oceanops.orm.AgencyRole;

import io.agrest.DataResponse;
import io.agrest.SelectBuilder;
import io.agrest.jaxrs3.AgJaxrs;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class AgencyAccessor {
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
}

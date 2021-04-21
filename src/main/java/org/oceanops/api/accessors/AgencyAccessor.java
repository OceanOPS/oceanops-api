package org.oceanops.api.accessors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;

import org.oceanops.api.Authorization;
import org.oceanops.api.orm.Agency;
import org.oceanops.api.orm.AgencyRole;

import io.agrest.DataResponse;
import io.agrest.SelectBuilder;
import io.agrest.Ag;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class AgencyAccessor {
	@Context
    private Configuration config;
    
	@GET
    @Path("agency")
    public DataResponse<Agency> getAll(@Context UriInfo uriInfo) {
		SelectBuilder<Agency> sBuilder = Ag.select(Agency.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).get();
    }
	
    @GET
    @Path("agency/{id}")
	public DataResponse<Agency> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Agency> sBuilder = Ag.select(Agency.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).getOne();
	}  

    
	@GET
    @Path("agencyrole")
    public DataResponse<AgencyRole> getAllRoles(@Context UriInfo uriInfo) {
		SelectBuilder<AgencyRole> sBuilder = Ag.select(AgencyRole.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).get();
    }
}

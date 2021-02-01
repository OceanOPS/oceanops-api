package org.oceanops.api.accessors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;

import org.oceanops.api.orm.Agency;

import io.agrest.DataResponse;
import io.agrest.Ag;

@Path("agency")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class AgencyAccessor {
	@Context
    private Configuration config;
    
	@GET
    public DataResponse<Agency> getAll(@Context UriInfo uriInfo) {
        return Ag.select(Agency.class, config).uri(uriInfo).get();
    }
	
    @GET
    @Path("{id}")
	public DataResponse<Agency> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		return Ag.select(Agency.class, config).byId(id).uri(uriInfo).getOne();
	}    
}

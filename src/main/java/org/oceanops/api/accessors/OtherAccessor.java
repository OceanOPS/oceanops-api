package org.oceanops.api.accessors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Configuration;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

import org.oceanops.api.Authorization;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.oceanops.orm.MapType;

import io.agrest.jaxrs3.AgJaxrs;
import io.agrest.DataResponse;
import io.agrest.SelectBuilder;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class OtherAccessor {
    @Context
    private Configuration config;

    public OtherAccessor(){
	}

    @GET
	@Path("maptype")
    public DataResponse<MapType> getMapTypes(@Context UriInfo uriInfo) {
		SelectBuilder<MapType> sBuilder = AgJaxrs.select(MapType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("maptype/{id}")
    public DataResponse<MapType> getMapType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<MapType> sBuilder = AgJaxrs.select(MapType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
}
package org.oceanops.api.accessors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.oceanops.api.Authorization;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.oceanops.api.orm.MapType;

import io.agrest.Ag;
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
		SelectBuilder<MapType> sBuilder = Ag.select(MapType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).get();
	}
	@GET
	@Path("maptype/{id}")
    public DataResponse<MapType> getMapType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<MapType> sBuilder = Ag.select(MapType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.uri(uriInfo).getOne();
	}
}
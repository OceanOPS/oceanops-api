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
import org.oceanops.api.orm.Ship;
import org.oceanops.api.orm.ShipType;

import io.agrest.DataResponse;
import io.agrest.SelectBuilder;
import io.agrest.jaxrs2.AgJaxrs;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class ShipAccessor {
	//private final Logger logger = LoggerFactory.getLogger(ShipAccessor.class);

	@Context
    private Configuration config;

    @GET
    @Path("ship")
    public DataResponse<Ship> getAll(@Context UriInfo uriInfo) {
		SelectBuilder<Ship> sBuilder = AgJaxrs.select(Ship.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	
    @GET
    @Path("ship/{id}")
	public DataResponse<Ship> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Ship> sBuilder = AgJaxrs.select(Ship.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}

    @GET
    @Path("shiptype")
    public DataResponse<ShipType> getAllShipTypes(@Context UriInfo uriInfo) {
		SelectBuilder<ShipType> sBuilder = AgJaxrs.select(ShipType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	
    @GET
    @Path("shiptype/{id}")
	public DataResponse<ShipType> getOneShipType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<ShipType> sBuilder = AgJaxrs.select(ShipType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}

	public ShipAccessor() {
	}
}

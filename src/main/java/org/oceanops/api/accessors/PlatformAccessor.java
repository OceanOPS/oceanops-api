package org.oceanops.api.accessors;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.ObjectSelect;
import org.apache.cayenne.query.SelectById;
import org.oceanops.api.Authorization;
import org.oceanops.api.Utils;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.PtfIdentifiers;

import io.agrest.jaxrs2.AgJaxrs;
import io.agrest.AgRequest;
import io.agrest.DataResponse;
import io.agrest.SelectBuilder;

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
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}

	@GET
	@Path("platform/{id}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}

	@GET
	@Path("platform/ref/{ref}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOneByRef(@PathParam("ref") String ref, @Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config);

		AgRequest agRequest = AgJaxrs.request(config).andExp(Ptf.REF.eq(ref).toString()).build();
		
		Authorization.applySelectAuthorization(sBuilder);

		sBuilder.request(agRequest);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	
	@GET
	@Path("platform/wigosid/{wigosid}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOneByWigosId(@PathParam("wigosid") String wigosid, @Context UriInfo uriInfo){		
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config);
		
		AgRequest agRequest = AgJaxrs.request(config).andExp(
			Ptf.PTF_IDENTIFIERS.dot(PtfIdentifiers.WIGOS_REF).eq(wigosid).toString()
		).build(); 
		
		Authorization.applySelectAuthorization(sBuilder);
		sBuilder.request(agRequest);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}

	/**
	 * Query the database to retrieve a platform's details, based on its database
	 * ID.
	 * 
	 * @param id long The database identifier
	 * @return A ORM Ptf object
	 * @throws NotFoundException
	 */
	public Ptf getPtfbyID(long id) throws NotFoundException {
		// Find the platform
		Ptf ptf = SelectById.query(Ptf.class, id).selectOne(this.context);
		if (ptf == null)
			throw new NotFoundException("No platform found for ID = " + String.valueOf(id));
		return ptf;
	}
	
	/**
	 * Query the database to retrieve a platform's details, based on its database
	 * ID.
	 * 
	 * @param id long The database identifier
	 * @return A ORM Ptf object
	 * @throws NotFoundException
	 */
	public Ptf getPtfbyRef(String ref) throws NotFoundException {
		// Find the platform
		Ptf ptf = ObjectSelect.query(Ptf.class, Ptf.REF.eq(ref)).selectOne(this.context);
		if (ptf == null)
			throw new NotFoundException("No platform found for ref = " + ref);
		return ptf;
	}

	/**
	 * Query the database to retrieve a platform's details, based on its WIGOS ID
	 * 
	 * @param wigosid the WIGOS identifier
	 * @return A ORM Ptf object
	 * @throws NotFoundException
	 */
	public Ptf getPtfbyWigosID(String wigosid) throws NotFoundException {
		// Find the platform
		Ptf ptf = ObjectSelect.query(Ptf.class, Ptf.PTF_IDENTIFIERS.dot(PtfIdentifiers.WIGOS_REF).eq(wigosid)).selectOne(this.context);

		if (ptf == null)
			throw new NotFoundException("No platform found for WIGOS ID = " + wigosid);
		
		return ptf;
	}
}

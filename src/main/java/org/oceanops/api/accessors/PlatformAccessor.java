package org.oceanops.api.accessors;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Configuration;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.Response.Status;
import jakarta.xml.bind.JAXBException;

import java.io.InputStream;
import javax.xml.datatype.DatatypeConfigurationException;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.json.JSONObject;
import org.oceanops.api.Authorization;
import org.oceanops.api.entities.wmdr.Platform;
import org.oceanops.api.loaders.PlatformLoader;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.PtfIdentifiers;

import io.agrest.jaxrs3.AgJaxrs;
import io.agrest.AgRequest;
import io.agrest.DataResponse;
import io.agrest.EntityUpdate;
import io.agrest.SelectBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Path("/platform")
public class PlatformAccessor {
	private final Logger logger = LoggerFactory.getLogger(PlatformAccessor.class);
	@Context
	private Configuration config;

	public PlatformAccessor() {
		//this.context = Utils.getCayenneContext();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getAll(@Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOne(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}

	@GET
	@Path("ref/{ref}")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> getOneByRef(@PathParam("ref") String ref, @Context UriInfo uriInfo) {
		SelectBuilder<Ptf> sBuilder = AgJaxrs.select(Ptf.class, config);

		AgRequest agRequest = AgJaxrs.request(config).andExp(Ptf.REF.eq(ref).toString()).build();
		
		Authorization.applySelectAuthorization(sBuilder);

		sBuilder.request(agRequest);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	
	@GET
	@Path("wigosid/{wigosid}")
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

	@GET
	@Path("wmdr/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrById(@PathParam("id") int id)
			throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		Ptf ptf = AgJaxrs.select(Ptf.class, config).byId(id).getOne().getData().get(0);
		if (ptf == null)
			throw new NotFoundException("No platform found for ID = " + String.valueOf(id));
		Platform wmdr = new Platform(ptf);

		return wmdr.toString();
	}

	@GET
	@Path("wmdr/ref/{ref}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrByRef(@PathParam("ref") String ref)
			throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		AgRequest agRequest = AgJaxrs.request(config).andExp(Ptf.REF.eq(ref).toString()).build();
		Ptf ptf = AgJaxrs.select(Ptf.class, config).request(agRequest).getOne().getData().get(0);
		if (ptf == null)
			throw new NotFoundException("No platform found for ref = " + ref);
		Platform wmdr = new Platform(ptf);

		return wmdr.toString();
	}

	@GET
	@Path("wmdr/wigosid/{wigosid}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrByWIGOSID(@PathParam("wigosid") String wigosid)
			throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		AgRequest agRequest = AgJaxrs.request(config).andExp(
			Ptf.PTF_IDENTIFIERS.dot(PtfIdentifiers.WIGOS_REF).eq(wigosid).toString()
		).build(); 
		Ptf ptf = AgJaxrs.select(Ptf.class, config).request(agRequest).getOne().getData().get(0);

		if (ptf == null)
			throw new NotFoundException("No platform found for WIGOS ID = " + wigosid);
		Platform wmdr = new Platform(ptf);
		
		return wmdr.toString();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> create(EntityUpdate<Ptf> data) {
		if(Authorization.hasAdminRights())
			return AgJaxrs.create(Ptf.class, config).syncAndSelect(data); 
		else
			throw new NotAuthorizedException("Not authorized to perform the requested operation", Response.status(Status.UNAUTHORIZED));
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public DataResponse<Ptf> update(EntityUpdate<Ptf> data) { 
		if(Authorization.hasAdminRights())
			return AgJaxrs.update(Ptf.class, config).syncAndSelect(data);
		else
			throw new NotAuthorizedException("Not authorized to perform the requested operation", Response.status(Status.UNAUTHORIZED));
	}

	@POST
	@Path("file")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public String upload(@FormDataParam("file") InputStream uploadedInputStream, 
		@FormDataParam("file") FormDataContentDisposition fileDetail, 
		@FormDataParam("file") final FormDataBodyPart body, 
		@Context UriInfo uriInfo) {
		logger.debug(body.getMediaType().toString());
		String fileType;
		switch(body.getMediaType().toString()){
			case "text/csv":
				logger.trace("CSV file");
				fileType = "csv";
				break;
			case "application/x-netcdf":
				logger.trace("NetCDF file");
				fileType = "netcdf";
				break;
			case MediaType.TEXT_PLAIN:
				logger.trace("Text file");
				fileType = "plaintext";
				break;
			default:
				logger.trace(String.format("Unsupported file type: %s", body.getMediaType().toString()));
				throw new BadRequestException(String.format("Unsupported file type: %s", body.getMediaType().toString()));
		}

		JSONObject platformLoadingLogs = PlatformLoader.loadFile(uploadedInputStream, fileType);
		
		return platformLoadingLogs.toString();
	}
}

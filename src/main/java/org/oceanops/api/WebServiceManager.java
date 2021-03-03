package org.oceanops.api;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.oceanops.api.accessors.PlatformAccessor;
import org.oceanops.api.entities.wmdr.Platform;
import org.oceanops.api.exceptions.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class WebServiceManager {
	private final Logger logger = LoggerFactory.getLogger(WebServiceManager.class);

	@GET
	@Path("platform/wmdr/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrById(@PathParam("id") String id)
			throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		Platform wmdr;
		try {
			wmdr = new Platform(m.getPtfbyID(Integer.parseInt(id)));
		} catch (EntityNotFoundException e) {
			logger.trace("No platform found for ID = " + id);
			throw new NotFoundException("No platform found for ID = " + id);
		}

		return wmdr.toString();
	}

	@GET
	@Path("platform/wmdr/ref/{ref}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrByRef(@PathParam("ref") String ref)
			throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		Platform wmdr;
		try {
			wmdr = new Platform(m.getPtfbyRef(ref));
		} catch (EntityNotFoundException e) {
			logger.trace("No platform found for ref = " + ref);
			throw new NotFoundException("No platform found for ref = " + ref);
		}

		return wmdr.toString();
	}

	@GET
	@Path("platform/wmdr/wigosid/{wigosid}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrByWIGOSID(@PathParam("wigosid") String wigosid)
			throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		Platform wmdr;
		try {
			wmdr = new Platform(m.getPtfbyWigosID(wigosid));
		} catch (EntityNotFoundException e) {
			logger.trace("No platform found for WIGOS ID = " + wigosid);
			throw new NotFoundException("No platform found for WIGOS ID = " + wigosid);
		}
		
		return wmdr.toString();
	}
}

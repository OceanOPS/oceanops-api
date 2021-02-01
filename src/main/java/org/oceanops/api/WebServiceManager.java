package org.oceanops.api;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.oceanops.api.accessors.PlatformAccessor;
import org.oceanops.api.entities.PlatformEntity;
import org.oceanops.api.entities.wmdr.Platform;
import org.oceanops.api.exceptions.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class WebServiceManager {
	private final Logger logger = LoggerFactory.getLogger(WebServiceManager.class);

	@Deprecated
	@GET
	@Path("platforms.csv")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSelectedPlatformsCSV(@QueryParam("status") String status, @QueryParam("family") String family,
			@QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("gtsid") String gtsid, @QueryParam("program") String program,
			@QueryParam("network") String network, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country,
			@QueryParam("wigosReady") String wigosReady, @QueryParam("updateDate") String updateDate,
			@QueryParam("insertDate") String insertDate) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, HashMap<String, String>> foundPlatforms = null;

		StringBuilder csv = new StringBuilder();

		foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, gtsid, program, network, variable, sensormod,
				sensortyp, ship, country, wigosReady, updateDate, insertDate);

		if(gtsid != null){
			csv.append("id" + Utils.CSV_SEPARATOR + "ref" + Utils.CSV_SEPARATOR + "wigos_ref" + Utils.CSV_SEPARATOR + "requested_gtsid");
			for (Integer id : foundPlatforms.keySet()) {
				csv.append("\n" + id + Utils.CSV_SEPARATOR + foundPlatforms.get(id).get("ref") + Utils.CSV_SEPARATOR
						+ foundPlatforms.get(id).get("wigos_ref") + Utils.CSV_SEPARATOR
						+ gtsid);
			}
		}
		else{			
			csv.append("id" + Utils.CSV_SEPARATOR + "ref" + Utils.CSV_SEPARATOR + "wigos_ref");
			for (Integer id : foundPlatforms.keySet()) {
				csv.append("\n" + id + Utils.CSV_SEPARATOR + foundPlatforms.get(id).get("ref") + Utils.CSV_SEPARATOR
						+ foundPlatforms.get(id).get("wigos_ref"));
			}
		}
		return csv.toString();
	}

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

	@Deprecated
	@GET
	@Path("platforms.csv/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPtfbyIdCSV(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm;
		try {
			ptfm = new PlatformEntity(m.getPtfbyID(id));
		} catch (EntityNotFoundException e) {
			logger.trace("No platform found for ID = " + id);
			throw new NotFoundException("No platform found for ID = " + id);
		}
		StringBuilder csv = new StringBuilder();
		csv.append(PlatformEntity.getCSVHeader());
		csv.append("\n" + ptfm.toCSV());

		return csv.toString();
	}

	@Deprecated
	@GET
	@Path("platforms.csv/ref/{ref}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlatformCSVByRef(@PathParam("ref") String ref) throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm;
		try {
			ptfm = new PlatformEntity(m.getPtfbyRef(ref));
		} catch (EntityNotFoundException e) {
			logger.trace("No platform found for ref = " + ref);
			throw new NotFoundException("No platform found for ref = " + ref);
		}
		StringBuilder csv = new StringBuilder();
		csv.append(PlatformEntity.getCSVHeader());
		csv.append("\n" + ptfm.toCSV());

		return csv.toString();
	}

	@Deprecated
	@GET
	@Path("platforms.csv/wigosid/{wigosid}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlatformCSVByWigosID(@PathParam("wigosid") String wigosid) throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm;
		try {
			ptfm = new PlatformEntity(m.getPtfbyWigosID(wigosid));
		} catch (EntityNotFoundException e) {
			logger.trace("No platform found for WIGOS ID = " + wigosid);
			throw new NotFoundException("No platform found for WIGOS ID = " + wigosid);
		}
		StringBuilder csv = new StringBuilder();
		csv.append(PlatformEntity.getCSVHeader());
		csv.append("\n" + ptfm.toCSV());

		return csv.toString();
	}
}

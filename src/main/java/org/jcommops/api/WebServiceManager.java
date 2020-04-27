package org.jcommops.api;

import java.util.ArrayList;
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

import org.apache.cayenne.CayenneRuntimeException;
import org.jcommops.api.accessors.PlatformAccessor;
import org.jcommops.api.entities.CountryEntity;
import org.jcommops.api.entities.NetworkEntity;
import org.jcommops.api.entities.PlatformEntity;
import org.jcommops.api.entities.PlatformFamilyEntity;
import org.jcommops.api.entities.PlatformModelEntity;
import org.jcommops.api.entities.PlatformStatusEntity;
import org.jcommops.api.entities.PlatformTypeEntity;
import org.jcommops.api.entities.ProgramEntity;
import org.jcommops.api.entities.SensorModelEntity;
import org.jcommops.api.entities.SensorTypeEntity;
import org.jcommops.api.entities.VariableEntity;
import org.jcommops.api.entities.wmdr.Platform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class WebServiceManager {
	private final Logger logger = LoggerFactory.getLogger(WebServiceManager.class);

	@GET
	@Path("platforms.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<PlatformEntity> getAllPtfsJSON(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country, @QueryParam("wigosReady") String wigosReady, 
			@QueryParam("updateDate") String updateDate, @QueryParam("insertDate") String insertDate) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, HashMap<String, String>> foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program,
				network, variable, sensormod, sensortyp, ship, country, wigosReady, updateDate, insertDate);
		
		ArrayList<PlatformEntity> result = new ArrayList<PlatformEntity>();
		for (Integer id : foundPlatforms.keySet()) {
			PlatformEntity ptf = new PlatformEntity();
			ptf.setId(id);
			ptf.setJcommopsRef(foundPlatforms.get(id).get("ref"));
			ptf.setWigosRef(foundPlatforms.get(id).get("wigos_ref"));
			result.add(ptf);
		}
		return result;
	}

	@GET
	@Path("platforms.csv")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSelectedPlatformsCSV(@QueryParam("status") String status, @QueryParam("family") String family,
			@QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program,
			@QueryParam("network") String network, 
			@QueryParam("variable") String variable, @QueryParam("sensorModel") String sensormod,
			@QueryParam("sensorType") String sensortyp, @QueryParam("ship") String ship,
			@QueryParam("country") String country, @QueryParam("wigosReady") String wigosReady, 
			@QueryParam("updateDate") String updateDate, @QueryParam("insertDate") String insertDate) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, HashMap<String, String>> foundPlatforms = null;

		StringBuilder csv = new StringBuilder();

		foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, variable,
				sensormod, sensortyp, ship, country, wigosReady, updateDate, insertDate);

		csv.append("id" + Utils.CSV_SEPARATOR + "ref" + Utils.CSV_SEPARATOR + "wigos_ref");
		for (Integer id : foundPlatforms.keySet()) {
			csv.append("\n" + id + Utils.CSV_SEPARATOR + foundPlatforms.get(id).get("ref") + Utils.CSV_SEPARATOR + foundPlatforms.get(id).get("wigos_ref"));
		}
		return csv.toString();
	}
	
	@GET
	@Path("platforms.xml/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrById(@PathParam("id") String id) throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		Platform wmdr = new Platform(m.getPtfbyID(Integer.parseInt(id)));
		
		return wmdr.toString();
	}
	
	@GET
	@Path("platforms.xml/ref/{ref}")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformWmdrByRef(@PathParam("ref") String ref) throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		Platform wmdr = new Platform(m.getPtfbyRef(ref));
		
		return wmdr.toString();
	}
	
	@GET
	@Path("platforms/{id}/observations.xml")
	@Produces(MediaType.APPLICATION_XML)
	public String getPlatformObservationsWmdrById(@PathParam("id") String id) throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		/*PlatformObservations wmdr = new PlatformObservations(Integer.parseInt(id));
		
		return wmdr.toString();*/
		logger.trace("XML document is not yet supported");
		throw new NotFoundException("XML document is not yet supported");
	}


	@GET
	@Path("platforms.json/{id}")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public PlatformEntity getPtfbyIdJSON(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = m.getPlatformEntitybyID(id);

		if (ptfm == null) {
			logger.trace("No platform found for ID = " + id);
			throw new NotFoundException("No platform found for ID = " + id);
		}

		return ptfm;
	}
	

	@GET
	@Path("platforms.json/ref/{ref}")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public PlatformEntity getPlatformJSONByRef(@PathParam("ref") String ref) throws JAXBException, NumberFormatException, DatatypeConfigurationException {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = m.getPlatformEntitybyRef(ref);

		if (ptfm == null) {
			logger.trace("No platform found for ref = " + ref);
			throw new NotFoundException("No platform found for ref = " + ref);
		}

		return ptfm;
	}

	@GET
	@Path("platforms.csv/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPtfbyIdCSV(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = m.getPlatformEntitybyID(id);
		StringBuilder csv = new StringBuilder();

		if (ptfm == null) {
			logger.trace("No platform found for ID = " + id);
			throw new NotFoundException("No platform found for ID = " + id);
		} else {
			csv.append(PlatformEntity.getCSVHeader());
			csv.append("\n" + ptfm.toCSV());
		}

		return csv.toString();
	}


	@GET
	@Path("ptf_statuses.xml")
	public ArrayList<PlatformStatusEntity> getAllPtfStatusesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformStatusEntity> List = new ArrayList<PlatformStatusEntity>();
		try {
			List = m.getPtfStatuses();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("ptf_statuses.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<PlatformStatusEntity> getAllPtfStatusesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformStatusEntity> List = new ArrayList<PlatformStatusEntity>();
		try {
			List = m.getPtfStatuses();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("ptf_families.xml")
	public ArrayList<PlatformFamilyEntity> getAllPtfFamiliesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformFamilyEntity> List = new ArrayList<PlatformFamilyEntity>();
		try {
			List = m.getPtfFamilies();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("ptf_families.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<PlatformFamilyEntity> getAllPtfFamiliesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformFamilyEntity> List = new ArrayList<PlatformFamilyEntity>();
		try {
			List = m.getPtfFamilies();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;

	}

	@GET
	@Path("ptf_types.xml")
	public ArrayList<PlatformTypeEntity> getAllPtfTypesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformTypeEntity> List = new ArrayList<PlatformTypeEntity>();
		try {
			List = m.getPtfTypes();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("ptf_types.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<PlatformTypeEntity> getAllPtfTypesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformTypeEntity> List = new ArrayList<PlatformTypeEntity>();
		try {
			List = m.getPtfTypes();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("ptf_models.xml")
	public ArrayList<PlatformModelEntity> getAllPtfModelsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformModelEntity> List = new ArrayList<PlatformModelEntity>();
		try {
			List = m.getPtfModels();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("ptf_models.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<PlatformModelEntity> getAllPtfModelsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformModelEntity> List = new ArrayList<PlatformModelEntity>();
		try {
			List = m.getPtfModels();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;

	}

	@GET
	@Path("programs.xml")
	public ArrayList<ProgramEntity> getAllPtfProgramsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<ProgramEntity> List = new ArrayList<ProgramEntity>();
		try {
			List = m.getProgram();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("programs.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<ProgramEntity> getAllPtfProgramsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<ProgramEntity> List = new ArrayList<ProgramEntity>();
		try {
			List = m.getProgram();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("countries.xml")
	public ArrayList<CountryEntity> getAllCountriesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<CountryEntity> List = new ArrayList<CountryEntity>();
		try {
			List = m.getPtfCountries();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("countries.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<CountryEntity> getAllCountriesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<CountryEntity> List = new ArrayList<CountryEntity>();
		try {
			List = m.getPtfCountries();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("master_networks.xml")
	public ArrayList<NetworkEntity> getAllPtfPtfMasterNetworksXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkEntity> List = new ArrayList<NetworkEntity>();
		try {
			List = m.getMasterNetworks();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("master_networks.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<NetworkEntity> getAllPtfMasterNetworksJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkEntity> List = new ArrayList<NetworkEntity>();
		try {
			List = m.getMasterNetworks();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("networks.xml")
	public ArrayList<NetworkEntity> getAllPtfNetworksXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkEntity> List = new ArrayList<NetworkEntity>();
		try {
			List = m.getPtfNetworks();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("networks.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<NetworkEntity> getAllPtfNetworksJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkEntity> List = new ArrayList<NetworkEntity>();
		try {
			List = m.getPtfNetworks();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("sensor_models.xml")
	public ArrayList<SensorModelEntity> getAllPtfSensorModelsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorModelEntity> List = new ArrayList<SensorModelEntity>();
		try {
			List = m.getPtfSensorModel();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("sensor_models.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<SensorModelEntity> getAllPtfSensorModelsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorModelEntity> List = new ArrayList<SensorModelEntity>();
		try {
			List = m.getPtfSensorModel();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("sensor_types.xml")
	public ArrayList<SensorTypeEntity> getAllPtfSensorTypesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorTypeEntity> List = new ArrayList<SensorTypeEntity>();
		try {
			List = m.getPtfSensorType();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("sensor_types.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<SensorTypeEntity> getAllPtfSensorTypesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorTypeEntity> List = new ArrayList<SensorTypeEntity>();
		try {
			List = m.getPtfSensorType();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("variables.xml")
	public ArrayList<VariableEntity> getAllVariablesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<VariableEntity> List = new ArrayList<VariableEntity>();
		try {
			List = m.getPtfVariables();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

	@GET
	@Path("variables.json")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ArrayList<VariableEntity> getAllVariablesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<VariableEntity> List = new ArrayList<VariableEntity>();
		try {
			List = m.getPtfVariables();
		} catch (CayenneRuntimeException CRE) {
			logger.error("Error while fetching information");
		}
		return List;
	}

}

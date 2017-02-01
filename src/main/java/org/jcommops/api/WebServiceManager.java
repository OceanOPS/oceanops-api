package org.jcommops.api;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.cayenne.CayenneRuntimeException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jcommops.api.accessors.PlatformAccessor;
import org.jcommops.api.entities.CountryEntity;
import org.jcommops.api.entities.MasterProgramEntity;
import org.jcommops.api.entities.NetworkPtfEntity;
import org.jcommops.api.entities.PlatformEntity;
import org.jcommops.api.entities.PlatformFamilyEntity;
import org.jcommops.api.entities.PlatformModelEntity;
import org.jcommops.api.entities.PlatformStatusEntity;
import org.jcommops.api.entities.PlatformTypeEntity;
import org.jcommops.api.entities.ProgramEntity;
import org.jcommops.api.entities.SensorModelEntity;
import org.jcommops.api.entities.SensorTypeEntity;
import org.jcommops.api.entities.VariableEntity;

@Path("/")
public class WebServiceManager {
	private Log log = LogFactory.getLog(WebServiceManager.class);

	@GET
	@Path("platforms.xml")
	public ArrayList<PlatformEntity> getAllPtfsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> ptfmList = m.getAllPtfIdsRefs();

		return ptfmList;
	}

	@GET
	@Path("platforms.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformEntity> getAllPtfsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> ptfmList = m.getAllPtfIdsRefs();

		return ptfmList;
	}

	@GET
	@Path("platforms.csv")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllPtfsCSV() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> foundPlatforms = m.getAllPtfIdsRefs();
		StringBuilder csv = new StringBuilder();

		if (foundPlatforms.size() > 0) {
			csv.append("id" + Utils.CSV_SEPARATOR + "ref");
			for (int i = 0; i < foundPlatforms.size(); i++) {
				csv.append("\n" + foundPlatforms.get(i).getId() + Utils.CSV_SEPARATOR
						+ foundPlatforms.get(i).getJcommopsRef());
			}
		} else {
			throw new NotFoundException();
		}

		return csv.toString();
	}

	@GET
	@Path("platform.xml/{id}")
	public PlatformEntity getPtfbyIdXML(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = m.getPtfbyID(id);

		if (ptfm == null) {
			throw new NotFoundException("No platform found for ID = " + id);
		}

		return ptfm;
	}

	@GET
	@Path("platform.json/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PlatformEntity getPtfbyIdJSON(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = m.getPtfbyID(id);

		if (ptfm == null) {
			throw new NotFoundException("No platform found for ID = " + id);
		}

		return ptfm;
	}

	@GET
	@Path("platform.csv/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPtfbyIdCSV(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = m.getPtfbyID(id);
		StringBuilder csv = new StringBuilder();

		if (ptfm == null) {
			throw new NotFoundException("No platform found for ID = " + id);
		} else {
			csv.append(PlatformEntity.getCSVHeader());
			csv.append("\n" + ptfm.toCSV());
		}

		return csv.toString();
	}

	@GET
	@Path("platforms.xml/find")
	public ArrayList<PlatformEntity> getSelectedPlatformsXML(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, String> foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program,
				network, masterprg, variable, sensormod, sensortyp, ship, country);
		
		ArrayList<PlatformEntity> result = new ArrayList<PlatformEntity>();
		for (Integer id : foundPlatforms.keySet()) {
			PlatformEntity ptf = new PlatformEntity();
			ptf.setId(id);
			ptf.setJcommopsRef(foundPlatforms.get(id));
			result.add(ptf);
		}
		return result;
	}

	@GET
	@Path("platforms.json/find")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformEntity> getSelectedPlatformsJSON(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, String> foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program,
				network, masterprg, variable, sensormod, sensortyp, ship, country);
		
		ArrayList<PlatformEntity> result = new ArrayList<PlatformEntity>();
		for (Integer id : foundPlatforms.keySet()) {
			PlatformEntity ptf = new PlatformEntity();
			ptf.setId(id);
			ptf.setJcommopsRef(foundPlatforms.get(id));
			result.add(ptf);
		}
		return result;
	}

	@GET
	@Path("platforms.csv/find")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSelectedPlatformsCSV(@QueryParam("status") String status, @QueryParam("family") String family,
			@QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program,
			@QueryParam("network") String network, @QueryParam("masterProgram") String masterprg,
			@QueryParam("variable") String variable, @QueryParam("sensorModel") String sensormod,
			@QueryParam("sensorType") String sensortyp, @QueryParam("ship") String ship,
			@QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, String> foundPlatforms = null;

		StringBuilder csv = new StringBuilder();

		foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
				sensormod, sensortyp, ship, country);

		csv.append("id" + Utils.CSV_SEPARATOR + "ref");
		for (Integer id : foundPlatforms.keySet()) {
			csv.append("\n" + id + Utils.CSV_SEPARATOR + foundPlatforms.get(id));
		}
		return csv.toString();
	}

	@GET
	@Path("platforms.xml/details/find")
	public ArrayList<PlatformEntity> getSelectedPlatformsDetailsXML(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, String> foundPlatforms = null;
		ArrayList<PlatformEntity> foundPlatformsDisplay = new ArrayList<PlatformEntity>();

		foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
				sensormod, sensortyp, ship, country);

		for (Integer id: foundPlatforms.keySet()) {
			PlatformEntity a = m.getPtfbyID(id);
			foundPlatformsDisplay.add(a);
		}

		return foundPlatformsDisplay;
	}

	@GET
	@Path("platforms.json/details/find")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformEntity> getSelectedPlatformsDetailsJSON(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, String> foundPlatforms = null;
		ArrayList<PlatformEntity> foundPlatformsDisplay = new ArrayList<PlatformEntity>();

		foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
				sensormod, sensortyp, ship, country);


		for(Integer id: foundPlatforms.keySet()) {
			foundPlatformsDisplay.add(m.getPtfbyID(id));
		}

		return foundPlatformsDisplay;
	}

	@GET
	@Path("platforms.csv/details/find")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSelectedPlatformsDetailsCSV(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		HashMap<Integer, String> foundPlatforms = null;
		StringBuilder csv = new StringBuilder();
		csv.append(PlatformEntity.getCSVHeader());

		foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
				sensormod, sensortyp, ship, country);
		for (Integer id : foundPlatforms.keySet()) {
			PlatformEntity a = m.getPtfbyID(id);
			csv.append("\n" + a.toCSV());
		}

		return csv.toString();
	}

	@GET
	@Path("ptfStatuses.xml")
	public ArrayList<PlatformStatusEntity> getAllPtfStatusesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformStatusEntity> List = new ArrayList<PlatformStatusEntity>();
		try {
			List = m.getPtfStatuses();
		} catch (CayenneRuntimeException CRE) {
			PlatformStatusEntity ptf0 = new PlatformStatusEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfStatuses.xml
	}

	@GET
	@Path("ptfStatuses.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformStatusEntity> getAllPtfStatusesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformStatusEntity> List = new ArrayList<PlatformStatusEntity>();
		try {
			List = m.getPtfStatuses();
		} catch (CayenneRuntimeException CRE) {
			PlatformStatusEntity ptf0 = new PlatformStatusEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfStatuses.json
	}

	@GET
	@Path("ptfFamilies.xml")
	public ArrayList<PlatformFamilyEntity> getAllPtfFamiliesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformFamilyEntity> List = new ArrayList<PlatformFamilyEntity>();
		try {
			List = m.getPtfFamilies();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * PlatformFamily ptf0 = new PlatformFamily(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfFamilies.xml
	}

	@GET
	@Path("ptfFamilies.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformFamilyEntity> getAllPtfFamiliesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformFamilyEntity> List = new ArrayList<PlatformFamilyEntity>();
		try {
			List = m.getPtfFamilies();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * PlatformFamily ptf0 = new PlatformFamily(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfFamilies.json

	}

	@GET
	@Path("ptfTypes.xml")
	public ArrayList<PlatformTypeEntity> getAllPtfTypesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformTypeEntity> List = new ArrayList<PlatformTypeEntity>();
		try {
			List = m.getPtfTypes();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * PlatformType ptf0 = new PlatformType(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfTypes.xml
	}

	@GET
	@Path("ptfTypes.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformTypeEntity> getAllPtfTypesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformTypeEntity> List = new ArrayList<PlatformTypeEntity>();
		try {
			List = m.getPtfTypes();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * PlatformType ptf0 = new PlatformType(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfTypes.json

	}

	@GET
	@Path("ptfModels.xml")
	public ArrayList<PlatformModelEntity> getAllPtfModelsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformModelEntity> List = new ArrayList<PlatformModelEntity>();
		try {
			List = m.getPtfModels();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * PlatformModel ptf0 = new PlatformModel(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfModels.xml
	}

	@GET
	@Path("ptfModels.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformModelEntity> getAllPtfModelsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformModelEntity> List = new ArrayList<PlatformModelEntity>();
		try {
			List = m.getPtfModels();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * PlatformModel ptf0 = new PlatformModel(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfModels.json

	}

	@GET
	@Path("programs.xml")
	public ArrayList<ProgramEntity> getAllPtfProgramsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<ProgramEntity> List = new ArrayList<ProgramEntity>();
		try {
			List = m.getProgram();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * Program ptf0 = new Program(); ptf0.setId(-1); List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/programs.xml
	}

	@GET
	@Path("programs.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<ProgramEntity> getAllPtfProgramsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<ProgramEntity> List = new ArrayList<ProgramEntity>();
		try {
			List = m.getProgram();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * Program ptf0 = new Program(); ptf0.setId(-1); List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/programs.json
	}

	@GET
	@Path("countries.xml")
	public ArrayList<CountryEntity> getAllCountriesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<CountryEntity> List = new ArrayList<CountryEntity>();
		try {
			List = m.getPtfCountries();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * Country ptf0 = new Country(); ptf0.setId(-1); List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/countries.xml
	}

	@GET
	@Path("countries.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<CountryEntity> getAllCountriesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<CountryEntity> List = new ArrayList<CountryEntity>();
		try {
			List = m.getPtfCountries();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * Country ptf0 = new Country(); ptf0.setId(-1); List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/countries.json
	}

	@GET
	@Path("masterPrograms.xml")
	public ArrayList<MasterProgramEntity> getAllPtfPtfMasterProgramsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<MasterProgramEntity> List = new ArrayList<MasterProgramEntity>();
		try {
			List = m.getMasterProgram();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * MasterProgram ptf0 = new MasterProgram(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/masterPrograms.xml
	}

	@GET
	@Path("masterPrograms.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<MasterProgramEntity> getAllPtfMasterProgramsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<MasterProgramEntity> List = new ArrayList<MasterProgramEntity>();
		try {
			List = m.getMasterProgram();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * MasterProgram ptf0 = new MasterProgram(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/masterPrograms.json
	}

	@GET
	@Path("networks.xml")
	public ArrayList<NetworkPtfEntity> getAllPtfNetworksXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkPtfEntity> List = new ArrayList<NetworkPtfEntity>();
		try {
			List = m.getPtfNetworks();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * NetworkPtf ptf0 = new NetworkPtf(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfNetworks.xml
	}

	@GET
	@Path("networks.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<NetworkPtfEntity> getAllPtfNetworksJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkPtfEntity> List = new ArrayList<NetworkPtfEntity>();
		try {
			List = m.getPtfNetworks();
		} catch (CayenneRuntimeException CRE) {
			/*
			 * NetworkPtf ptf0 = new NetworkPtf(); ptf0.setId(-1);
			 * List.add(ptf0);
			 */
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/network.json
	}

	@GET
	@Path("sensorModels.xml")
	public ArrayList<SensorModelEntity> getAllPtfSensorModelsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorModelEntity> List = new ArrayList<SensorModelEntity>();
		try {
			List = m.getPtfSensorModel();
		} catch (CayenneRuntimeException CRE) {
			SensorModelEntity ptf0 = new SensorModelEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorModels.xml
	}

	@GET
	@Path("sensorModels.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<SensorModelEntity> getAllPtfSensorModelsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorModelEntity> List = new ArrayList<SensorModelEntity>();
		try {
			List = m.getPtfSensorModel();
		} catch (CayenneRuntimeException CRE) {
			SensorModelEntity ptf0 = new SensorModelEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorModels.json
	}

	@GET
	@Path("sensorTypes.xml")
	public ArrayList<SensorTypeEntity> getAllPtfSensorTypesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorTypeEntity> List = new ArrayList<SensorTypeEntity>();
		try {
			List = m.getPtfSensorType();
		} catch (CayenneRuntimeException CRE) {
			SensorTypeEntity ptf0 = new SensorTypeEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorTypes.xml
	}

	@GET
	@Path("sensorTypes.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<SensorTypeEntity> getAllPtfSensorTypesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorTypeEntity> List = new ArrayList<SensorTypeEntity>();
		try {
			List = m.getPtfSensorType();
		} catch (CayenneRuntimeException CRE) {
			SensorTypeEntity ptf0 = new SensorTypeEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorTypes.json
	}

	@GET
	@Path("variables.xml")
	public ArrayList<VariableEntity> getAllVariablesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<VariableEntity> List = new ArrayList<VariableEntity>();
		try {
			List = m.getPtfVariables();
		} catch (CayenneRuntimeException CRE) {
			VariableEntity ptf0 = new VariableEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/variables.xml
	}

	@GET
	@Path("variables.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<VariableEntity> getAllVariablesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<VariableEntity> List = new ArrayList<VariableEntity>();
		try {
			List = m.getPtfVariables();
		} catch (CayenneRuntimeException CRE) {
			VariableEntity ptf0 = new VariableEntity();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/variables.json
	}

}

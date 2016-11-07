package org.jcommops.api;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.cayenne.CayenneRuntimeException;
import org.jcommops.api.accessors.PlatformAccessor;
import org.jcommops.api.entities.MasterProgramPtf;
import org.jcommops.api.entities.NetworkPtf;
import org.jcommops.api.entities.Platform;
import org.jcommops.api.entities.PlatformFamily;
import org.jcommops.api.entities.PlatformModel;
import org.jcommops.api.entities.PlatformStatus;
import org.jcommops.api.entities.PlatformType;
import org.jcommops.api.entities.ProgramPtf;
import org.jcommops.api.entities.SensorModel;
import org.jcommops.api.entities.SensorType;
import org.jcommops.api.entities.Variable;

@Path("/")
public class WebServiceManager {
	@GET
	@Path("platforms.xml")
	public ArrayList<Platform> getAllPtfsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> ptfmList = new ArrayList<Platform>();
		try {
			ptfmList = m.getAllPtfs();
		}

		catch (CayenneRuntimeException CRE) {
			Platform ptf0 = new Platform();
			ptf0.setId(-1);
			ptf0.setError_message(" Database temporarily inaccessible.");
			ptfmList.add(ptf0);
		}
		return ptfmList;
		// example http://localhost:8081/jcommops-api/api/rest/1.0/platforms.xml
	}

	@GET
	@Path("platforms.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Platform> getAllPtfsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> ptfmList = new ArrayList<Platform>();
		try {
			ptfmList = m.getAllPtfs();
		}

		catch (CayenneRuntimeException CRE) {
			Platform ptf0 = new Platform();
			ptf0.setId(-1);
			ptf0.setError_message(" Database temporarily inaccessible.");
			ptfmList.add(ptf0);
		}
		return ptfmList;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.json

	}

	@GET
	@Path("platform.xml/{id}")
	public Platform getPtfbyIdXML(@PathParam("id") long id) {

		PlatformAccessor m = new PlatformAccessor();
		Platform ptfm = new Platform();
		try {
			ptfm = m.getPtfbyID(id);
		}

		catch (CayenneRuntimeException CRE) {
			ptfm.setId(-1);
			ptfm.setError_message(" Database temporarily inaccessible.");

		}

		return ptfm;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platform.xml/501356

	}

	@GET
	@Path("platform.json/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Platform getPtfbyIdJSON(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		Platform ptfm = new Platform();
		try {
			ptfm = m.getPtfbyID(id);
		}

		catch (CayenneRuntimeException CRE) {
			ptfm.setId(-1);
			ptfm.setError_message(" Database temporarily inaccessible.");

		}

		return ptfm;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platform.json/501356

	}

	@GET
	@Path("platforms.xml/find")
	public ArrayList<Platform> getSelectedPlatformsXML(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterprg") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensormod") String sensormod, @QueryParam("sensortyp") String sensortyp) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> foundPlatforms = new ArrayList<Platform>();
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp);
			if (foundPlatforms.size() == 0) {
				Platform ptf0 = new Platform();
				ptf0.setId(-1);
				ptf0.setError_message("No platform found.");
				foundPlatforms.add(ptf0);
			}
		}

		catch (StringIndexOutOfBoundsException str) {
			Platform ptf0 = new Platform();
			ptf0.setId(-1);
			ptf0.setError_message(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterprg', 'variable', 'sensormod' "
							+ "or 'sensortyp' parameter.");
			foundPlatforms.add(ptf0);

		}

		catch (CayenneRuntimeException CRE) {
			Platform ptf0 = new Platform();
			ptf0.setId(-1);
			ptf0.setError_message(" Database temporarily inaccessible.");
			foundPlatforms.add(ptf0);
		}

		return foundPlatforms;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.xml/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterprg=DBCP&variable=SST
	}

	@GET
	@Path("platforms.json/find")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Platform> getSelectedPlatformsJSON(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterprg") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensormod") String sensormod, @QueryParam("sensortyp") String sensortyp) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> foundPlatforms = new ArrayList<Platform>();
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp);
			if (foundPlatforms.size() == 0) {
				Platform ptf0 = new Platform();
				ptf0.setId(-1);
				ptf0.setError_message("No platform found.");
				foundPlatforms.add(ptf0);
			}
		}

		catch (StringIndexOutOfBoundsException str) {
			Platform ptf0 = new Platform();
			ptf0.setId(-1);
			ptf0.setError_message(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterprg', 'variable', 'sensormod' "
							+ "or 'sensortyp' parameter.");
			foundPlatforms.add(ptf0);

		}

		catch (CayenneRuntimeException CRE) {
			Platform ptf0 = new Platform();
			ptf0.setId(-1);
			ptf0.setError_message(" Database temporarily inaccessible.");
			foundPlatforms.add(ptf0);
		}

		return foundPlatforms;

		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.json/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterprg=DBCP&variable=SST
	}

	@GET
	@Path("PtfStatuses.xml")
	public ArrayList<PlatformStatus> getAllPtfStatusesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformStatus> List = new ArrayList<PlatformStatus>();
		try {
			List = m.getPtfStatuses();
		} catch (CayenneRuntimeException CRE) {
			PlatformStatus ptf0 = new PlatformStatus();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfStatuses.xml
	}

	@GET
	@Path("PtfStatuses.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformStatus> getAllPtfStatusesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformStatus> List = new ArrayList<PlatformStatus>();
		try {
			List = m.getPtfStatuses();
		} catch (CayenneRuntimeException CRE) {
			PlatformStatus ptf0 = new PlatformStatus();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfStatuses.json
	}

	@GET
	@Path("PtfFamilies.xml")
	public ArrayList<PlatformFamily> getAllPtfFamiliesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformFamily> List = new ArrayList<PlatformFamily>();
		try {
			List = m.getPtfFamilies();
		} catch (CayenneRuntimeException CRE) {
			PlatformFamily ptf0 = new PlatformFamily();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfFamilies.xml
	}

	@GET
	@Path("PtfFamilies.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformFamily> getAllPtfFamiliesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformFamily> List = new ArrayList<PlatformFamily>();
		try {
			List = m.getPtfFamilies();
		} catch (CayenneRuntimeException CRE) {
			PlatformFamily ptf0 = new PlatformFamily();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfFamilies.json

	}

	@GET
	@Path("Types.xml")
	public ArrayList<PlatformType> getAllPtfTypesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformType> List = new ArrayList<PlatformType>();
		try {
			List = m.getPtfTypes();
		} catch (CayenneRuntimeException CRE) {
			PlatformType ptf0 = new PlatformType();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfTypes.xml
	}

	@GET
	@Path("Types.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformType> getAllPtfTypesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformType> List = new ArrayList<PlatformType>();
		try {
			List = m.getPtfTypes();
		} catch (CayenneRuntimeException CRE) {
			PlatformType ptf0 = new PlatformType();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfTypes.json

	}

	@GET
	@Path("Models.xml")
	public ArrayList<PlatformModel> getAllPtfModelsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformModel> List = new ArrayList<PlatformModel>();
		try {
			List = m.getPtfModels();
		} catch (CayenneRuntimeException CRE) {
			PlatformModel ptf0 = new PlatformModel();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfModels.xml
	}

	@GET
	@Path("Models.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformModel> getAllPtfModelsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformModel> List = new ArrayList<PlatformModel>();
		try {
			List = m.getPtfModels();
		} catch (CayenneRuntimeException CRE) {
			PlatformModel ptf0 = new PlatformModel();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfModels.json

	}

	@GET
	@Path("Programs.xml")
	public ArrayList<ProgramPtf> getAllPtfProgramsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<ProgramPtf> List = new ArrayList<ProgramPtf>();
		try {
			List = m.getProgramPtf();
		} catch (CayenneRuntimeException CRE) {
			ProgramPtf ptf0 = new ProgramPtf();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfPrograms.xml
	}

	@GET
	@Path("Programs.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<ProgramPtf> getAllPtfProgramsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<ProgramPtf> List = new ArrayList<ProgramPtf>();
		try {
			List = m.getProgramPtf();
		} catch (CayenneRuntimeException CRE) {
			ProgramPtf ptf0 = new ProgramPtf();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfPrograms.json
	}
	
	@GET
	@Path("MasterPrograms.xml")
	public ArrayList<MasterProgramPtf> getAllPtfPtfMasterProgramsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<MasterProgramPtf> List = new ArrayList<MasterProgramPtf>();
		try {
			List = m.getMasterProgram();
		} catch (CayenneRuntimeException CRE) {
			MasterProgramPtf ptf0 = new MasterProgramPtf();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfMasterPrograms.xml
	}

	@GET
	@Path("MasterPrograms.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<MasterProgramPtf> getAllPtfMasterProgramsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<MasterProgramPtf> List = new ArrayList<MasterProgramPtf>();
		try {
			List = m.getMasterProgram();
		} catch (CayenneRuntimeException CRE) {
			MasterProgramPtf ptf0 = new MasterProgramPtf();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfMasterPrograms.json
	}
	
	@GET
	@Path("Networks.xml")
	public ArrayList<NetworkPtf> getAllPtfNetworksXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkPtf> List = new ArrayList<NetworkPtf>();
		try {
			List = m.getPtfNetworks();
		} catch (CayenneRuntimeException CRE) {
			NetworkPtf ptf0 = new NetworkPtf();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfNetworks.xml
	}

	@GET
	@Path("Networks.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<NetworkPtf> getAllPtfNetworksJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<NetworkPtf> List = new ArrayList<NetworkPtf>();
		try {
			List = m.getPtfNetworks();
		} catch (CayenneRuntimeException CRE) {
			NetworkPtf ptf0 = new NetworkPtf();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfNetworks.json
	}
	
	
	@GET
	@Path("SensorModels.xml")
	public ArrayList<SensorModel> getAllPtfSensorModelsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorModel> List = new ArrayList<SensorModel>();
		try {
			List = m.getPtfSensorModel();
		} catch (CayenneRuntimeException CRE) {
			SensorModel ptf0 = new SensorModel();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfSensorModels.xml
	}

	@GET
	@Path("SensorModels.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<SensorModel> getAllPtfSensorModelsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorModel> List = new ArrayList<SensorModel>();
		try {
			List = m.getPtfSensorModel();
		} catch (CayenneRuntimeException CRE) {
			SensorModel ptf0 = new SensorModel();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfSensorModels.json
	}
	
	@GET
	@Path("SensorTypes.xml")
	public ArrayList<SensorType> getAllPtfSensorTypesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorType> List = new ArrayList<SensorType>();
		try {
			List = m.getPtfSensorType();
		} catch (CayenneRuntimeException CRE) {
			SensorType ptf0 = new SensorType();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfSensorTypes.xml
	}

	@GET
	@Path("SensorTypes.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<SensorType> getAllPtfSensorTypesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<SensorType> List = new ArrayList<SensorType>();
		try {
			List = m.getPtfSensorType();
		} catch (CayenneRuntimeException CRE) {
			SensorType ptf0 = new SensorType();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/PtfSensorTypes.json
	}
	
	@GET
	@Path("Variables.xml")
	public ArrayList<Variable> getAllVariablesXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Variable> List = new ArrayList<Variable>();
		try {
			List = m.getPtfVariables();
		} catch (CayenneRuntimeException CRE) {
			Variable ptf0 = new Variable();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/Variables.xml
	}

	@GET
	@Path("Variables.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Variable> getAllVariablesJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Variable> List = new ArrayList<Variable>();
		try {
			List = m.getPtfVariables();
		} catch (CayenneRuntimeException CRE) {
			Variable ptf0 = new Variable();
			ptf0.setId(-1);
			List.add(ptf0);
		}
		return List;
		//http://localhost:8081/jcommops-api/api/rest/1.0/Variables.json
	}

	
}

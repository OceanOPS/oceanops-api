package org.jcommops.api;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

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
	@Path("platforms.csv")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllPtfsCSV() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> foundPlatforms = new ArrayList<Platform>();
		StringWriter strW = new StringWriter();
		strW.write("platformId" + ";" + "jcommpsRef" + "\n");
		try {
			foundPlatforms = m.getAllPtfs();
			Iterator<Platform> ptf_itr = foundPlatforms.iterator();

			while (ptf_itr.hasNext()) {
				Platform a = ptf_itr.next();
				strW.write(a.getId() + ";" + a.getJcommopsRef() + "\n");
			}
		}

		catch (CayenneRuntimeException CRE) {
			strW.write(" Error: Database temporarily inaccessible.");
		}
		String strFoundPlatforms = strW.toString();
		return strFoundPlatforms;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.csv

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
	@Path("platform.csv/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPtfbyIdCSV(@PathParam("id") long id) {

		PlatformAccessor m = new PlatformAccessor();
		Platform ptfm = new Platform();
		StringWriter strW = new StringWriter();

		try {
			strW.write("platformId" + ";" + "jcommpsRef" + ";" + "ptfFamily" + ";" + "ptfType" + ";" + "ptfModel" + ";"
					+ "deployementDate" + ";" + "lastLocationDate" + ";" + "lastLocationLatitude" + ";"
					+ "lastLocationLongitude" + ";" + "program" + ";" + "country" + ";" + "masterProgramme" + ";"
					+ "variables" + "\n");
			ptfm = m.getPtfbyID(id);

			strW.write(ptfm.getId() + ";" + ptfm.getJcommopsRef() + ";" + ptfm.getPtfFamily().getNameShort() + ";"
					+ ptfm.getPtfType().getNameShort() + ";" + ptfm.getPtfModel().getNameShort() + ";"
					+ ptfm.getDeployement().getDeployementDate() + ";" + ptfm.getLastLocation().getLastLocationDate()
					+ ";" + ptfm.getLastLocation().getLat() + ";" + ptfm.getLastLocation().getLon() + ";"
					+ ptfm.getProgram().getName() + ";" + ptfm.getCountry().getName() + ";"
					+ ptfm.getMasterProgramme().getName() + ";" + Utils.GetVariablesListToString(ptfm.getVariables())
					+ "\n");

		}

		catch (CayenneRuntimeException CRE) {
			strW.write("Error: Database temporarily inaccessible.");
		} catch (NullPointerException n) {

			strW.write(ptfm.getError_message());

		}
		String strptfm = strW.toString();
		return strptfm;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platform.xml/501356

	}

	@GET
	@Path("platforms.xml/find")
	public ArrayList<Platform> getSelectedPlatformsXML(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> foundPlatforms = new ArrayList<Platform>();
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);
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
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.xml/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
	}

	@GET
	@Path("platforms.json/find")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Platform> getSelectedPlatformsJSON(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model,
			@QueryParam("program") String program, @QueryParam("network") String network,
			@QueryParam("masterProgram") String masterprg, @QueryParam("variable") String variable,
			@QueryParam("sensorModel") String sensormod, @QueryParam("sensorType") String sensortyp,
			@QueryParam("ship") String ship, @QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<Platform> foundPlatforms = new ArrayList<Platform>();
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);
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
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.json/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
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
		ArrayList<Platform> foundPlatforms = new ArrayList<Platform>();
		StringWriter strW = new StringWriter();
		strW.write("platformId" + ";" + "jcommpsRef" + "\n");
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);

			Iterator<Platform> ptf_itr = foundPlatforms.iterator();

			while (ptf_itr.hasNext()) {
				Platform a = ptf_itr.next();
				strW.write(a.getId() + ";" + a.getJcommopsRef() + "\n");
			}

			if (foundPlatforms.size() == 0) {
				strW.write("No platform found.");

			}
		}

		catch (StringIndexOutOfBoundsException str) {
			strW.write(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");

		}

		catch (CayenneRuntimeException CRE) {
			strW.write(" Error: Database temporarily inaccessible.");
		}
		String strFoundPlatforms = strW.toString();
		return strFoundPlatforms;

		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.csv/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
	}

	@GET
	@Path("ptfStatuses.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfStatuses.xml
	}

	@GET
	@Path("ptfStatuses.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfStatuses.json
	}

	@GET
	@Path("ptfFamilies.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfFamilies.xml
	}

	@GET
	@Path("ptfFamilies.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfFamilies.json

	}

	@GET
	@Path("ptfTypes.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfTypes.xml
	}

	@GET
	@Path("ptfTypes.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfTypes.json

	}

	@GET
	@Path("ptfModels.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfModels.xml
	}

	@GET
	@Path("ptfModels.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/ptfModels.json

	}

	@GET
	@Path("programs.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/programs.xml
	}

	@GET
	@Path("programs.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/programs.json
	}

	@GET
	@Path("masterPrograms.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/masterPrograms.xml
	}

	@GET
	@Path("masterPrograms.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/masterPrograms.json
	}

	@GET
	@Path("networks.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/PtfNetworks.xml
	}

	@GET
	@Path("networks.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/network.json
	}

	@GET
	@Path("sensorModels.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorModels.xml
	}

	@GET
	@Path("sensorModels.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorModels.json
	}

	@GET
	@Path("sensorTypes.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorTypes.xml
	}

	@GET
	@Path("sensorTypes.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/sensorTypes.json
	}

	@GET
	@Path("variables.xml")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/variables.xml
	}

	@GET
	@Path("variables.json")
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
		// http://localhost:8081/jcommops-api/api/rest/1.0/variables.json
	}

}

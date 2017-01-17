package org.jcommops.api;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.cayenne.CayenneRuntimeException;
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
	@GET
	@Path("platforms.xml")
	public ArrayList<PlatformEntity> getAllPtfsXML() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> ptfmList = new ArrayList<PlatformEntity>();
		try {
			ptfmList = m.getAllPtfIdsRefs();
		}
		catch (CayenneRuntimeException CRE) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(" Database temporarily inaccessible.");
			ptfmList.add(ptf0);
		}
		return ptfmList;
	}

	@GET
	@Path("platforms.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformEntity> getAllPtfsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> ptfmList = new ArrayList<PlatformEntity>();
		try {
			ptfmList = m.getAllPtfIdsRefs();
		}
		catch (CayenneRuntimeException CRE) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(" Database temporarily inaccessible.");
			ptfmList.add(ptf0);
		}
		return ptfmList;

	}

	@GET
	@Path("platforms.csv")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllPtfsCSV() {
		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		StringWriter strW = new StringWriter();
		strW.write("id" + ";" + "jcommopsRef" + "\n");
		try {
			foundPlatforms = m.getAllPtfIdsRefs();
			Iterator<PlatformEntity> ptf_itr = foundPlatforms.iterator();

			while (ptf_itr.hasNext()) {
				PlatformEntity a = ptf_itr.next();
				strW.write(a.getId() + ";" + a.getJcommopsRef() + "\n");
			}
		}

		catch (CayenneRuntimeException CRE) {
			strW.write(" Error: Database temporarily inaccessible.");
		}
		String strFoundPlatforms = strW.toString();
		return strFoundPlatforms;

	}

	@GET
	@Path("platform.xml/{id}")
	public PlatformEntity getPtfbyIdXML(@PathParam("id") long id) {
		

		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = new PlatformEntity();
		try {
			ptfm = m.getPtfbyID(id);
		}

		catch (CayenneRuntimeException CRE) {
			ptfm.setId(-1);
			ptfm.setErrorMessage(" Database temporarily inaccessible.");

		}

		return ptfm;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platform.xml/501356

	}

	@GET
	@Path("platform.json/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PlatformEntity getPtfbyIdJSON(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		PlatformEntity ptfm = new PlatformEntity();
		try {
			ptfm = m.getPtfbyID(id);
		}

		catch (CayenneRuntimeException CRE) {
			ptfm.setId(-1);
			ptfm.setErrorMessage(" Database temporarily inaccessible.");

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
		PlatformEntity ptfm = new PlatformEntity();
		StringWriter strW = new StringWriter();
		strW.write("platformId" + ";" + "jcommopsRef" + ";" + "telecomId"+ ";" + "telecomType"+ ";" + "internalRef"+ ";"+ "serialRef"+";"
				+ "ptfFamily" + ";" + "ptfType" + ";" + "ptfModel" + ";"
				+ "program" + ";" + "country" + ";" + "masterProgramme" + ";"
				+ "deployementDate" + ";" + "deployementLatitude" + ";"+ "deployementLongitude" + ";"+ "deployementScore" + ";"+ "deployementDensity" + ";"
				+"notificationDate"+ ";"+"shipName"+";"+"shipRef"+";"
				+ "lastLocationDate" + ";" + "lastLocationLatitude" + ";"+ "lastLocationLongitude" + ";" +"Age"+ ";"
				+ "cycleTime"+ ";"	+ "driftPressure"+";"+"profilePressure"+";"+"iceDetection"+";"
				+ "sensorModel"+ ";"+ "sensorTypes"+ ";"+"variables" + "\n");

		try {
			strW.write(m.WritePtfCSV(id));
			
		
		} catch (CayenneRuntimeException CRE) {
			strW.write("Error: Database temporarily inaccessible.");
		} catch (NullPointerException n) {

			strW.write(ptfm.getErrorMessage());

		}
		String strptfm = strW.toString();
		return strptfm;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platform.xml/501356

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
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);
			if (foundPlatforms.size() == 0) {
				PlatformEntity ptf0 = new PlatformEntity();
				ptf0.setId(-1);
				ptf0.setErrorMessage("No platform found.");
				foundPlatforms.add(ptf0);
			}
		}

		catch (StringIndexOutOfBoundsException str) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");
			foundPlatforms.add(ptf0);

		}

		catch (CayenneRuntimeException CRE) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(" Database temporarily inaccessible.");
			foundPlatforms.add(ptf0);
		}

		return foundPlatforms;
		// example
		// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.xml/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
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
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);
			if (foundPlatforms.size() == 0) {
				PlatformEntity ptf0 = new PlatformEntity();
				ptf0.setId(-1);
				ptf0.setErrorMessage("No platform found.");
				foundPlatforms.add(ptf0);
			}
		}

		catch (StringIndexOutOfBoundsException str) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");
			foundPlatforms.add(ptf0);

		}

		catch (CayenneRuntimeException CRE) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(" Database temporarily inaccessible.");
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
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		StringWriter strW = new StringWriter();
		strW.write("platformId" + ";" + "jcommpsRef" + "\n");
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);

			Iterator<PlatformEntity> ptf_itr = foundPlatforms.iterator();

			while (ptf_itr.hasNext()) {
				PlatformEntity a = ptf_itr.next();
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
	@Path("platforms.xml/details/find")
	public ArrayList<PlatformEntity> getSelectedPlatformsDetailsXML(@QueryParam("status") String status, @QueryParam("family") String family,
			@QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program,
			@QueryParam("network") String network, @QueryParam("masterProgram") String masterprg,
			@QueryParam("variable") String variable, @QueryParam("sensorModel") String sensormod,
			@QueryParam("sensorType") String sensortyp, @QueryParam("ship") String ship,
			@QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		ArrayList<PlatformEntity> foundPlatformsDisplay = new ArrayList<PlatformEntity>();
		
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);

			Iterator<PlatformEntity> ptf_itr = foundPlatforms.iterator();
			foundPlatformsDisplay = foundPlatforms;

			/*while (ptf_itr.hasNext()) {
				Platform a = ptf_itr.next();
				foundPlatformsDisplay.add(m.getPtfbyID(a.getId()));
			}*/
		
			
			if (foundPlatforms.size() == 0) {
				PlatformEntity ptf0 = new PlatformEntity();
				ptf0.setId(-1);
				ptf0.setErrorMessage("No platform found.");
				foundPlatformsDisplay.add(ptf0);

			}
		}

		catch (StringIndexOutOfBoundsException str) {
		
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");
			foundPlatformsDisplay.add(ptf0);

		}

		catch (CayenneRuntimeException CRE) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(" Database temporarily inaccessible.");
			foundPlatformsDisplay.add(ptf0);
		}
		
		return foundPlatformsDisplay;
		// example
				// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.xml/details/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
	}
	
	@GET
	@Path("platforms.json/details/find")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PlatformEntity> getSelectedPlatformsDetailsJSON(@QueryParam("status") String status, @QueryParam("family") String family,
			@QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program,
			@QueryParam("network") String network, @QueryParam("masterProgram") String masterprg,
			@QueryParam("variable") String variable, @QueryParam("sensorModel") String sensormod,
			@QueryParam("sensorType") String sensortyp, @QueryParam("ship") String ship,
			@QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		ArrayList<PlatformEntity> foundPlatformsDisplay = new ArrayList<PlatformEntity>();
		
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);

			Iterator<PlatformEntity> ptf_itr = foundPlatforms.iterator();

			while (ptf_itr.hasNext()) {
				PlatformEntity a = ptf_itr.next();
				foundPlatformsDisplay.add(m.getPtfbyID(a.getId()));
			}
		
			
			if (foundPlatforms.size() == 0) {
				PlatformEntity ptf0 = new PlatformEntity();
				ptf0.setId(-1);
				ptf0.setErrorMessage("No platform found.");
				foundPlatformsDisplay.add(ptf0);

			}
		}

		catch (StringIndexOutOfBoundsException str) {
		
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(
					"Invalid request. Missing the 'status', 'family', 'type', 'model', 'program', 'network', 'masterProgram', 'variable', 'sensorModel', "
							+ "'sensorType', 'country' or 'ship'  parameter.");
			foundPlatformsDisplay.add(ptf0);

		}

		catch (CayenneRuntimeException CRE) {
			PlatformEntity ptf0 = new PlatformEntity();
			ptf0.setId(-1);
			ptf0.setErrorMessage(" Database temporarily inaccessible.");
			foundPlatformsDisplay.add(ptf0);
		}
		
		return foundPlatformsDisplay;
		// example
				// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.json/details/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
	}
	
	@GET
	@Path("platforms.csv/details/find")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSelectedPlatformsDetailsCSV(@QueryParam("status") String status, @QueryParam("family") String family,
			@QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program,
			@QueryParam("network") String network, @QueryParam("masterProgram") String masterprg,
			@QueryParam("variable") String variable, @QueryParam("sensorModel") String sensormod,
			@QueryParam("sensorType") String sensortyp, @QueryParam("ship") String ship,
			@QueryParam("country") String country) {

		PlatformAccessor m = new PlatformAccessor();
		ArrayList<PlatformEntity> foundPlatforms = new ArrayList<PlatformEntity>();
		StringWriter strW = new StringWriter();
		strW.write("platformId" + ";" + "jcommopsRef" + ";" + "telecomId"+ ";" + "telecomType"+ ";" + "internalRef"+ ";"+ "serialRef"+";"
				+ "ptfFamily" + ";" + "ptfType" + ";" + "ptfModel" + ";"
				+ "program" + ";" + "country" + ";" + "masterProgramme" + ";"
				+ "deployementDate" + ";" + "deployementLatitude" + ";"+ "deployementLongitude" + ";"+ "deployementScore" + ";"+ "deployementDensity" + ";"
				+"notificationDate"+ ";"+"shipName"+";"+"shipRef"+";"
				+ "lastLocationDate" + ";" + "lastLocationLatitude" + ";"+ "lastLocationLongitude" + ";" +"Age"+ ";"
				+ "cycleTime"+ ";"	+ "driftPressure"+";"+"profilePressure"+";"+"iceDetection"+";"
				+ "sensorModel"+ ";"+ "sensorTypes"+ ";"+"variables" + "\n");
		try {
			foundPlatforms = m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable,
					sensormod, sensortyp, ship, country);

			Iterator<PlatformEntity> ptf_itr = foundPlatforms.iterator();

			while (ptf_itr.hasNext()) {
				PlatformEntity a = ptf_itr.next();
				strW.write(m.WritePtfCSV(a.getId()));
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
				// http://localhost:8081/jcommops-api/api/rest/1.0/platforms.csv/details/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterProgram=DBCP&variable=SST
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
			/*PlatformFamily ptf0 = new PlatformFamily();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*PlatformFamily ptf0 = new PlatformFamily();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*PlatformType ptf0 = new PlatformType();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*PlatformType ptf0 = new PlatformType();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*PlatformModel ptf0 = new PlatformModel();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*PlatformModel ptf0 = new PlatformModel();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*Program ptf0 = new Program();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*Program ptf0 = new Program();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*Country ptf0 = new Country();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*Country ptf0 = new Country();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*MasterProgram ptf0 = new MasterProgram();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*MasterProgram ptf0 = new MasterProgram();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*NetworkPtf ptf0 = new NetworkPtf();
			ptf0.setId(-1);
			List.add(ptf0);*/
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
			/*NetworkPtf ptf0 = new NetworkPtf();
			ptf0.setId(-1);
			List.add(ptf0);*/
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

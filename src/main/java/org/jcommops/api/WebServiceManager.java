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
import org.jcommops.api.entities.Platform;

@Path("api/rest/1.0")
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

}

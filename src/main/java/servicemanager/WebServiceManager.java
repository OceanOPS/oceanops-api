package servicemanager;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import servicemethods.PlatformAccessor;
import serviceentities.Platform;

@Path("api/rest/1.0")
public class WebServiceManager {
	@GET
	@Path("platforms.xml")
	public ArrayList<Platform> getAllPtfsXML() {
		PlatformAccessor m = new PlatformAccessor();
		return m.getAllPtfs();
		// example http://localhost:8081/rest/api/rest/1.0/platforms.xml
	}

	@GET
	@Path("platforms.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Platform> getAllPtfsJSON() {
		PlatformAccessor m = new PlatformAccessor();
		return m.getAllPtfs();
		// example http://localhost:8081/rest/api/rest/1.0/platforms.json

	}

	@GET
	@Path("platform.xml/{id}")
	public Platform getPtfbyIdXML(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		return m.getPtfbyID(id);
		// example http://localhost:8081/rest/api/rest/1.0/platform/xml/501356

	}

	@GET
	@Path("platform.json/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Platform getPtfbyIdJSON(@PathParam("id") long id) {
		PlatformAccessor m = new PlatformAccessor();
		return m.getPtfbyID(id);
		// example http://localhost:8081/rest/api/rest/1.0/platform/json/501356

	}


	@GET
	@Path("platforms.xml/find")
	public ArrayList<Platform> getSelectedPlatformsXML(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program, 
			@QueryParam("network") String network, @QueryParam("masterprg") String masterprg, @QueryParam("variable") String variable) {

		PlatformAccessor m = new PlatformAccessor();
		return m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable);
		// example http://localhost:8081/rest/api/rest/1.0/platforms.xml/find?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterprg=DBCP&variable=SST
	}

	@GET
	@Path("platforms.json/find")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Platform> getSelectedPlatformsJSON(@QueryParam("status") String status,
			@QueryParam("family") String family, @QueryParam("type") String type, @QueryParam("model") String model, @QueryParam("program") String program, 
			@QueryParam("network") String network, @QueryParam("masterprg") String masterprg, @QueryParam("variable") String variable) {

		PlatformAccessor m = new PlatformAccessor();
		return m.getPtfbySelectedParam(status, family, type, model, program, network, masterprg, variable);		// example http://localhost:8081/rest/api/rest/1.0/platforms.json?status=ACTIVE&family=ICE_BUOYS&type=AXIB&model=AXIB&masterprg=DBCP&variable=SST
	}

}

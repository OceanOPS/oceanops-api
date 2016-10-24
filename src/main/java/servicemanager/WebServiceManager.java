package servicemanager;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import servicemethods.PlatformAccessor;
import serviceentities.Platform;

@Path ("API")
public class WebServiceManager  {
	@GET
	@Path ("xml/platforms")
	public ArrayList<Platform> getAllPtfsXML () {
		PlatformAccessor  m= new PlatformAccessor ();
		return m.getAllPtfs();
		//http://localhost:8081/rest/API/xml/platforms
	}
	
	@GET
	@Path ("json/platforms")
	@Produces (MediaType.APPLICATION_JSON)
	public ArrayList<Platform> getAllPtfsJSON () {
		PlatformAccessor  m= new PlatformAccessor ();
		return m.getAllPtfs();
		//http://localhost:8081/rest/API/json/platforms
		
	}
	
	@GET
	@Path ("xml/platform/{id}")
	public Platform getPtfbyIdXML(@PathParam("id") long id) {
		PlatformAccessor  m= new PlatformAccessor ();
		Platform p= m.getPtfbyID(id);
		return p;
		
		//exemple http://localhost:8081/rest/API/xml/platform/501356
		
	}
	
	
	@GET
	@Path ("json/platform/{id}")
	@Produces (MediaType.APPLICATION_JSON)
	public Platform getPtfbyIdJSON(@PathParam("id") long id) {
		PlatformAccessor  m= new PlatformAccessor ();
		return m.getPtfbyID(id);
		//exemple http://localhost:8081/rest/API/xml/platform/501356
		
	}
	

}

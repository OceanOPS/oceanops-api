package org.oceanops.api.accessors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;

import org.oceanops.api.Authorization;
import org.oceanops.api.orm.DataProcessingMethod;
import org.oceanops.api.orm.Latency;
import org.oceanops.api.orm.PtfAutomation;
import org.oceanops.api.orm.PtfBattery;
import org.oceanops.api.orm.PtfSoftwareType;
import org.oceanops.api.orm.SensorExposure;
import org.oceanops.api.orm.SensorLocation;
import org.oceanops.api.orm.SensorModel;
import org.oceanops.api.orm.SensorStatus;
import org.oceanops.api.orm.SensorType;
import org.oceanops.api.orm.ServiceType;
import org.oceanops.api.orm.TelecomFormat;
import org.oceanops.api.orm.TelecomService;
import org.oceanops.api.orm.TelecomType;
import org.oceanops.api.orm.TrackingSystem;

import io.agrest.DataResponse;
import io.agrest.SelectBuilder;
import io.agrest.jaxrs2.AgJaxrs;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class HardwareAccessor {
	@Context
    private Configuration config;
    
    @GET
	@Path("sensormodel")
    public DataResponse<SensorModel> getSensorModels(@Context UriInfo uriInfo) {
		SelectBuilder<SensorModel> sBuilder = AgJaxrs.select(SensorModel.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("sensormodel/{id}")
    public DataResponse<SensorModel> getSensorModel(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<SensorModel> sBuilder = AgJaxrs.select(SensorModel.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("sensortype")
    public DataResponse<SensorType> getSensorTypes(@Context UriInfo uriInfo) {
		SelectBuilder<SensorType> sBuilder = AgJaxrs.select(SensorType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("sensortype/{id}")
    public DataResponse<SensorType> getSensorType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<SensorType> sBuilder = AgJaxrs.select(SensorType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("sensorlocation")
    public DataResponse<SensorLocation> getSensorLocations(@Context UriInfo uriInfo) {
		SelectBuilder<SensorLocation> sBuilder = AgJaxrs.select(SensorLocation.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("sensorlocation/{id}")
    public DataResponse<SensorLocation> getSensorLocation(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<SensorLocation> sBuilder = AgJaxrs.select(SensorLocation.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("sensorexposure")
    public DataResponse<SensorExposure> getSensorExposures(@Context UriInfo uriInfo) {
		SelectBuilder<SensorExposure> sBuilder = AgJaxrs.select(SensorExposure.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("sensorexposure/{id}")
    public DataResponse<SensorExposure> getSensorExposure(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<SensorExposure> sBuilder = AgJaxrs.select(SensorExposure.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("sensorstatus")
    public DataResponse<SensorStatus> getSensorStatuses(@Context UriInfo uriInfo) {
		SelectBuilder<SensorStatus> sBuilder = AgJaxrs.select(SensorStatus.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("sensorstatus/{id}")
    public DataResponse<SensorStatus> getSensorStatus(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<SensorStatus> sBuilder = AgJaxrs.select(SensorStatus.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("dataprocessingmethod")
    public DataResponse<DataProcessingMethod> getDataProcessingMethodes(@Context UriInfo uriInfo) {
		SelectBuilder<DataProcessingMethod> sBuilder = AgJaxrs.select(DataProcessingMethod.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("dataprocessingmethod/{id}")
    public DataResponse<DataProcessingMethod> getDataProcessingMethod(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<DataProcessingMethod> sBuilder = AgJaxrs.select(DataProcessingMethod.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("telecomtype")
    public DataResponse<TelecomType> getTelecomTypes(@Context UriInfo uriInfo) {
		SelectBuilder<TelecomType> sBuilder = AgJaxrs.select(TelecomType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("telecomtype/{id}")
    public DataResponse<TelecomType> getTelecomType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<TelecomType> sBuilder = AgJaxrs.select(TelecomType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("telecomservice")
    public DataResponse<TelecomService> getTelecomServices(@Context UriInfo uriInfo) {
		SelectBuilder<TelecomService> sBuilder = AgJaxrs.select(TelecomService.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("telecomservice/{id}")
    public DataResponse<TelecomService> getTelecomService(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<TelecomService> sBuilder = AgJaxrs.select(TelecomService.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("telecomformat")
    public DataResponse<TelecomFormat> getTelecomFormats(@Context UriInfo uriInfo) {
		SelectBuilder<TelecomFormat> sBuilder = AgJaxrs.select(TelecomFormat.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("telecomformat/{id}")
    public DataResponse<TelecomFormat> getTelecomFormat(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<TelecomFormat> sBuilder = AgJaxrs.select(TelecomFormat.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("latency")
    public DataResponse<Latency> getLatencies(@Context UriInfo uriInfo) {
		SelectBuilder<Latency> sBuilder = AgJaxrs.select(Latency.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("latency/{id}")
    public DataResponse<Latency> getLatency(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<Latency> sBuilder = AgJaxrs.select(Latency.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("platformautomation")
    public DataResponse<PtfAutomation> getPtfAutomations(@Context UriInfo uriInfo) {
		SelectBuilder<PtfAutomation> sBuilder = AgJaxrs.select(PtfAutomation.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("platformautomation/{id}")
    public DataResponse<PtfAutomation> getPtfAutomation(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<PtfAutomation> sBuilder = AgJaxrs.select(PtfAutomation.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("servicetype")
    public DataResponse<ServiceType> getServiceTypes(@Context UriInfo uriInfo) {
		SelectBuilder<ServiceType> sBuilder = AgJaxrs.select(ServiceType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("servicetype/{id}")
    public DataResponse<ServiceType> getServiceType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<ServiceType> sBuilder = AgJaxrs.select(ServiceType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("platformbattery")
    public DataResponse<PtfBattery> getPtfBatterys(@Context UriInfo uriInfo) {
		SelectBuilder<PtfBattery> sBuilder = AgJaxrs.select(PtfBattery.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("platformbattery/{id}")
    public DataResponse<PtfBattery> getPtfBattery(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<PtfBattery> sBuilder = AgJaxrs.select(PtfBattery.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("platformsoftwaretype")
    public DataResponse<PtfSoftwareType> getPtfSoftwareTypes(@Context UriInfo uriInfo) {
		SelectBuilder<PtfSoftwareType> sBuilder = AgJaxrs.select(PtfSoftwareType.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("platformsoftwaretype/{id}")
    public DataResponse<PtfSoftwareType> getPtfSoftwareType(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<PtfSoftwareType> sBuilder = AgJaxrs.select(PtfSoftwareType.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
	@GET
	@Path("trackingsystem")
    public DataResponse<TrackingSystem> getTrackingSystems(@Context UriInfo uriInfo) {
		SelectBuilder<TrackingSystem> sBuilder = AgJaxrs.select(TrackingSystem.class, config);

		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).get();
	}
	@GET
	@Path("trackingsystem/{id}")
    public DataResponse<TrackingSystem> getTrackingSystem(@PathParam("id") int id, @Context UriInfo uriInfo) {
		SelectBuilder<TrackingSystem> sBuilder = AgJaxrs.select(TrackingSystem.class, config).byId(id);
		
		Authorization.applySelectAuthorization(sBuilder);

		return sBuilder.clientParams(uriInfo.getQueryParameters()).getOne();
	}
}

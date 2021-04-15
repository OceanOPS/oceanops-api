package org.oceanops.api.accessors;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.Network;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.PtfFamily;
import org.oceanops.api.orm.PtfModel;
import org.oceanops.api.orm.PtfStatus;
import org.oceanops.api.orm.PtfType;
import org.oceanops.api.orm.Role;
import org.oceanops.api.orm.SensorModel;
import org.oceanops.api.orm.SensorType;
import org.oceanops.api.orm.Variable;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import io.agrest.Ag;
import io.agrest.AgRequest;
import io.agrest.DataResponse;
import io.agrest.SelectBuilder;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
public class VocabAccessor {
    //private final Logger logger = LoggerFactory.getLogger(PlatformAccessor.class);
	@Context
    private Configuration config;

    public VocabAccessor(){
	}
	
	@GET
	@Path("platformstatus")
    public DataResponse<PtfStatus> getPtfStatuses(@Context UriInfo uriInfo) {
        return Ag.select(PtfStatus.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("platformstatus/{id}")
    public DataResponse<PtfStatus> getPtfStatus(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(PtfStatus.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("platformfamily")
    public DataResponse<PtfFamily> getPtfFamilies(@Context UriInfo uriInfo) {
        return Ag.select(PtfFamily.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("platformfamily/{id}")
    public DataResponse<PtfFamily> getPtfFamily(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(PtfFamily.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("platformtype")
    public DataResponse<PtfType> getPtfTypes(@Context UriInfo uriInfo) {
        return Ag.select(PtfType.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("platformtype/{id}")
    public DataResponse<PtfType> getPtfType(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(PtfType.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("platformmodel")
    public DataResponse<PtfModel> getPtfModels(@Context UriInfo uriInfo) {
        return Ag.select(PtfModel.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("platformmodel/{id}")
    public DataResponse<PtfModel> getPtfModel(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(PtfModel.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("program")
    public DataResponse<Program> getPrograms(@Context UriInfo uriInfo) {
        return Ag.select(Program.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("program/{id}")
    public DataResponse<Program> getProgram(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(Program.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("network")
    public DataResponse<Network> getNetworks(@Context UriInfo uriInfo) {
        return Ag.select(Network.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("network/{id}")
    public DataResponse<Network> getNetwork(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(Network.class, config).uri(uriInfo).getOne();
	}

	@GET
	@Path("observingnetwork")
    public DataResponse<Network> getObservingNetworks(@Context UriInfo uriInfo) {
		SelectBuilder<Network> select = Ag.select(Network.class, config);
		AgRequest agRequest = Ag.request(config).andExp(Network.RANK.eq(new BigDecimal(0)).toString()).build(); 
		select.request(agRequest);
		
		return select.uri(uriInfo).get();
	}
	@GET
	@Path("observingnetwork/{id}")
    public DataResponse<Network> getObservingNetwork(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(Network.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("sensormodel")
    public DataResponse<SensorModel> getSensorModels(@Context UriInfo uriInfo) {
        return Ag.select(SensorModel.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("sensormodel/{id}")
    public DataResponse<SensorModel> getSensorModel(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(SensorModel.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("sensortype")
    public DataResponse<SensorType> getSensorTypes(@Context UriInfo uriInfo) {
        return Ag.select(SensorType.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("sensortype/{id}")
    public DataResponse<SensorType> getSensorType(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(SensorType.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("variable")
    public DataResponse<Variable> getVariables(@Context UriInfo uriInfo) {
		SelectBuilder<Variable> sBuilder = Ag.select(Variable.class, config);
		
		AgRequest agRequest = Ag.request(config).andExp(
			Variable.WIGOS_CODE.isNotNull().toString()
		).build(); 
		sBuilder.request(agRequest);

		return sBuilder.uri(uriInfo).get();
	}
	@GET
	@Path("variable/{id}")
    public DataResponse<Variable> getVariable(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(Variable.class, config).uri(uriInfo).getOne();
	}
	@GET
	@Path("country")
    public DataResponse<Country> getCountries(@Context UriInfo uriInfo) {
        return Ag.select(Country.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("country/{id}")
    public DataResponse<Country> getCountry(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(Country.class, config).uri(uriInfo).getOne();
	}

	@GET
	@Path("contactrole")
    public DataResponse<Role> getRoles(@Context UriInfo uriInfo) {
        return Ag.select(Role.class, config).uri(uriInfo).get();
	}
	@GET
	@Path("contactrole/{id}")
    public DataResponse<Role> getRole(@PathParam("id") int id, @Context UriInfo uriInfo) {
        return Ag.select(Role.class, config).uri(uriInfo).getOne();
	}
}

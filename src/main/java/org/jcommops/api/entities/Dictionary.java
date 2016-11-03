package org.jcommops.api.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "statuses", "families", "types", "models", "programs", "masterPrograms", "networks", "variables", "sensorModels", "sensorTypes", "error_message" })
public class Dictionary {
	private ArrayList<PlatformStatus> statuses;
	private ArrayList<PlatformFamily> families;
	private ArrayList<PlatformType> types;
	private ArrayList<PlatformModel> models;
	private ArrayList<ProgramPtf> programs;
	private ArrayList<MasterProgram> masterPrograms;
	private ArrayList<Network> networks;
	private ArrayList<Variable> variables;
	private ArrayList<SensorModel> sensorModels;
	private ArrayList<SensorType> sensorTypes;
	private String error_message;

	public Dictionary() {

	}

	public Dictionary(ArrayList<PlatformStatus> ptfstatus, ArrayList<PlatformFamily> ptffamily,
			ArrayList<PlatformModel> ptfmodel, ArrayList<PlatformType> ptftype, ArrayList<ProgramPtf> prgm,
			ArrayList<MasterProgram> mstrprgm, ArrayList<Network> network, ArrayList<Variable> variable,
			ArrayList<SensorModel> sensormod, ArrayList<SensorType> sensortyp,
			String error_message) {
		this.setPtfStatus(ptfstatus);
		this.setPtfFamily(ptffamily);
		this.setPtfModel(ptfmodel);
		this.setPtfType(ptftype);
		this.setProgram(prgm);
		this.setNetwork(network);
		this.setMasterProgram(mstrprgm);
		this.setVariable(variable);
		this.setSensorModel(sensormod);
		this.setSensorType(sensortyp);
		this.setError_message(error_message);

	}

	@XmlElementWrapper(name = "statuses")
	@XmlElements(@XmlElement(name = "ptfstatus", type = PlatformStatus.class))
	public ArrayList<PlatformStatus> getPtfStatus() {
		return statuses;
	}

	public void setPtfStatus(ArrayList<PlatformStatus> statuses) {
		this.statuses = statuses;
	}

	@XmlElementWrapper(name = "families")
	@XmlElements(@XmlElement(name = "ptfFamily", type = PlatformFamily.class))
	public ArrayList<PlatformFamily> getPtfFamily() {
		return families;
	}

	public void setPtfFamily(ArrayList<PlatformFamily> families) {
		this.families = families;
	}

	@XmlElementWrapper(name = "types")
	@XmlElements(@XmlElement(name = "ptfType", type = PlatformType.class))
	public ArrayList<PlatformType> getPtfType() {
		return types;
	}

	public void setPtfType(ArrayList<PlatformType> types) {
		this.types = types;
	}

	@XmlElementWrapper(name = "models")
	@XmlElements(@XmlElement(name = "ptfModel", type = PlatformModel.class))
	public ArrayList<PlatformModel> getPtfModel() {
		return models;
	}

	public void setPtfModel(ArrayList<PlatformModel> models) {
		this.models = models;
	}

	@XmlElementWrapper(name = "programs")
	@XmlElements(@XmlElement(name = "program", type = ProgramPtf.class))
	public ArrayList<ProgramPtf> getProgram() {
		return programs;
	}

	public void setProgram(ArrayList<ProgramPtf> programs) {
		this.programs = programs;
	}

	@XmlElementWrapper(name = "masterPrograms")
	@XmlElements(@XmlElement(name = "masterProgram", type = ProgramPtf.class))
	public ArrayList<MasterProgram> getMasterProgram() {
		return masterPrograms;
	}

	public void setMasterProgram(ArrayList<MasterProgram> masterPrograms) {
		this.masterPrograms = masterPrograms;
	}
	
	@XmlElementWrapper(name = "networks")
	@XmlElements(@XmlElement(name = "network", type = Network.class))
	public ArrayList<Network> getNetwork() {
		return networks;
	}

	public void setNetwork(ArrayList<Network> networks) {
		this.networks = networks;
	}

	@XmlElementWrapper(name = "variables")
	@XmlElements(@XmlElement(name = "variable", type = Variable.class))
	public ArrayList<Variable> getVariables() {
		return variables;
	}

	public void setVariable(ArrayList<Variable> variables) {
		this.variables = variables;
	}

	@XmlElementWrapper(name = "sensorModels")
	@XmlElements(@XmlElement(name = "sensorModel", type = SensorModel.class))
	public ArrayList<SensorModel> getSensorModel() {
		return sensorModels;
	}

	public void setSensorModel(ArrayList<SensorModel> sensorModels) {
		this.sensorModels = sensorModels;
	}

	@XmlElementWrapper(name = "sensorTypes")
	@XmlElements(@XmlElement(name = "sensorType", type = SensorType.class))
	public ArrayList<SensorType> getSensorType() {
		return sensorTypes;
	}

	public void setSensorType(ArrayList<SensorType> sensorTypes) {
		this.sensorTypes = sensorTypes;
	}
	
	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}


}

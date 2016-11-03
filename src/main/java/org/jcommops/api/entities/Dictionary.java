package org.jcommops.api.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "status", "family", "type", "model", "program", "masterprg", "network", "variables", "sensormod",
		"sensortyp" })
public class Dictionary {
	private ArrayList<PlatformStatus> ptfstatus;
	private ArrayList<PlatformFamily> ptffamily;
	private ArrayList<PlatformType> ptftype;
	private ArrayList<PlatformModel> ptfmodel;
	private ArrayList<ProgramPtf> prgm;
	private ArrayList<MasterProgram> mstrprgm;
	private ArrayList<Network> network;
	private ArrayList<Variable> variable;
	private ArrayList<SensorModel> sensormod;
	private ArrayList<SensorType> sensortyp;

	public Dictionary() {

	}

	public Dictionary(ArrayList<PlatformStatus> ptfstatus, ArrayList<PlatformFamily> ptffamily,
			ArrayList<PlatformModel> ptfmodel, ArrayList<PlatformType> ptftype, ArrayList<ProgramPtf> prgm,
			ArrayList<MasterProgram> mstrprgm, ArrayList<Network> network, ArrayList<Variable> variable,
			ArrayList<SensorModel> sensormod, ArrayList<SensorType> sensortyp) {
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

	}

	@XmlElementWrapper(name = "Statuses")
	@XmlElements(@XmlElement(name = "ptfstatus", type = PlatformStatus.class))
	public ArrayList<PlatformStatus> getPtfStatus() {
		return ptfstatus;
	}

	public void setPtfStatus(ArrayList<PlatformStatus> ptfstatus) {
		this.ptfstatus = ptfstatus;
	}

	@XmlElementWrapper(name = "Families")
	@XmlElements(@XmlElement(name = "ptfFamily", type = PlatformFamily.class))
	public ArrayList<PlatformFamily> getPtfFamily() {
		return ptffamily;
	}

	public void setPtfFamily(ArrayList<PlatformFamily> ptffamily) {
		this.ptffamily = ptffamily;
	}

	@XmlElementWrapper(name = "Types")
	@XmlElements(@XmlElement(name = "ptfType", type = PlatformType.class))
	public ArrayList<PlatformType> getPtfType() {
		return ptftype;
	}

	public void setPtfType(ArrayList<PlatformType> ptftype) {
		this.ptftype = ptftype;
	}

	@XmlElementWrapper(name = "Models")
	@XmlElements(@XmlElement(name = "ptfModel", type = PlatformModel.class))
	public ArrayList<PlatformModel> getPtfModel() {
		return ptfmodel;
	}

	public void setPtfModel(ArrayList<PlatformModel> ptfmodel) {
		this.ptfmodel = ptfmodel;
	}

	@XmlElementWrapper(name = "Programs")
	@XmlElements(@XmlElement(name = "program", type = ProgramPtf.class))
	public ArrayList<ProgramPtf> getProgram() {
		return prgm;
	}

	public void setProgram(ArrayList<ProgramPtf> prgm) {
		this.prgm = prgm;
	}

	@XmlElementWrapper(name = "Networks")
	@XmlElements(@XmlElement(name = "network", type = Network.class))
	public ArrayList<Network> getNetwork() {
		return network;
	}

	public void setNetwork(ArrayList<Network> network) {
		this.network = network;
	}

	@XmlElementWrapper(name = "MasterPrograms")
	@XmlElements(@XmlElement(name = "masterProgram", type = ProgramPtf.class))
	public ArrayList<MasterProgram> getMasterProgram() {
		return mstrprgm;
	}

	public void setMasterProgram(ArrayList<MasterProgram> mstrprgm) {
		this.mstrprgm = mstrprgm;
	}

	@XmlElementWrapper(name = "Variables")
	@XmlElements(@XmlElement(name = "variable", type = Variable.class))
	public ArrayList<Variable> getVariables() {
		return variable;
	}

	public void setVariable(ArrayList<Variable> variable) {
		this.variable = variable;
	}

	@XmlElementWrapper(name = "SensorModels")
	@XmlElements(@XmlElement(name = "sensorModel", type = SensorModel.class))
	public ArrayList<SensorModel> getSensorModel() {
		return sensormod;
	}

	public void setSensorModel(ArrayList<SensorModel> sensormod) {
		this.sensormod = sensormod;
	}

	@XmlElementWrapper(name = "SensorTypes")
	@XmlElements(@XmlElement(name = "sensorType", type = SensorType.class))
	public ArrayList<SensorType> getSensorType() {
		return sensortyp;
	}

	public void setSensorType(ArrayList<SensorType> sensortyp) {
		this.sensortyp = sensortyp;
	}

}

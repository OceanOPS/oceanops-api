package org.jcommops.api.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "error_message", "jcommopsRef", "telecom", "internalRef", "serialRef", "age", "ptfFamily",
		"ptfType", "ptfModel", "ptfStatus", "notificationDate", "deployement", "lastLocation", "endingDate", "program",
		"country", "masterProgramme", "contacts", "configuration", "sensorModel" , "variables" })

public class Platform {

	private long id;
	private String jcommopsRef;
	private Telecom telecom;
	private String internalRef;
	private String serialRef;
	private String age;
	private PlatformStatus ptfStatus;
	private PlatformFamily ptfFamily;
	private PlatformModel ptfModel;
	private PlatformType ptfType;
	private String notificationDate;
	private PlatformDeploy deployement;
	private PlatformLastLoc lastLocation;
	private String endingDate;
	private ProgramPtf program;
	private CountryPtf country;
	private MasterProgramPtf masterProgramme;
	private ArrayList<ContactPrg> contacts;
	private Configuration configuration;
	private SensorModel sensorModel;
	private ArrayList<Variable> variables;
	private String errorMessage;

	public Platform() {
	}

	public Platform(long id, String ref, Telecom telc, String internalref, String serialref, String age,
			PlatformStatus ptfstatus, PlatformFamily ptffamily, PlatformModel ptfmodel, PlatformType ptftype,
			String notifdate, PlatformDeploy ptfdpl, String endingdate, PlatformLastLoc ptfll, ProgramPtf prgm,
			CountryPtf cntr, MasterProgramPtf mstrprgm, ArrayList<ContactPrg> contacts, Configuration config, SensorModel sensm,  ArrayList<Variable> variables,
			String error_message) {
		this.setId(id);
		this.setJcommopsRef(ref);
		this.setTelecom(telc);
		this.setInternalRef(internalref);
		this.setSerialRef(internalref);
		this.setAge(age);
		this.setPtfStatus(ptfstatus);
		this.setPtfFamily(ptffamily);
		this.setPtfModel(ptfmodel);
		this.setPtfType(ptftype);
		this.setDeployement(ptfdpl);
		this.setEndingDate(endingdate);
		this.setLastLocation(ptfll);
		this.setProgram(prgm);
		this.setCountry(cntr);
		this.setMasterProgramme(mstrprgm);
		this.setContacts(contacts);
		this.setConfiguration(config);
		this.setVariables(variables);
		this.setNotificationDate(notifdate);
		this.setError_message(error_message);

	}

	@XmlAttribute // @XmlAttribute to bring "id =XXXX" to the beacon
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@XmlElement
	public String getJcommopsRef() {
		return jcommopsRef;
	}

	public void setJcommopsRef(String jcommopsRef) {
		this.jcommopsRef = jcommopsRef;
	}

	@XmlElement
	public Telecom getTelecom() {
		return telecom;
	}

	public void setTelecom(Telecom telecom) {
		this.telecom = telecom;
	}

	@XmlElement
	public String getInternalRef() {
		return internalRef;
	}

	public void setInternalRef(String internalRef) {
		this.internalRef = internalRef;
	}

	@XmlElement
	public String getSerialRef() {
		return serialRef;
	}

	public void setSerialRef(String serialRef) {
		this.serialRef = serialRef;
	}

	@XmlElement
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@XmlElement
	public PlatformStatus getPtfStatus() {
		return ptfStatus;
	}

	public void setPtfStatus(PlatformStatus ptfStatus) {
		this.ptfStatus = ptfStatus;
	}

	@XmlElement
	public PlatformFamily getPtfFamily() {
		return ptfFamily;
	}

	public void setPtfFamily(PlatformFamily ptfFamily) {
		this.ptfFamily = ptfFamily;
	}

	@XmlElement
	public PlatformModel getPtfModel() {
		return ptfModel;
	}

	public void setPtfModel(PlatformModel ptfModel) {
		this.ptfModel = ptfModel;
	}

	@XmlElement
	public PlatformType getPtfType() {
		return ptfType;
	}

	public void setPtfType(PlatformType ptfType) {
		this.ptfType = ptfType;
	}

	@XmlElement
	public String getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}

	@XmlElement
	public PlatformDeploy getDeployement() {
		return deployement;
	}

	public void setDeployement(PlatformDeploy deployement) {
		this.deployement = deployement;
	}

	@XmlElement
	public String getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	@XmlElement
	public PlatformLastLoc getLastLocation() {
		return lastLocation;
	}

	public void setLastLocation(PlatformLastLoc lastLocation) {
		this.lastLocation = lastLocation;
	}

	@XmlElement
	public ProgramPtf getProgram() {
		return program;
	}

	public void setProgram(ProgramPtf program) {
		this.program = program;
	}

	@XmlElement
	public CountryPtf getCountry() {
		return country;
	}

	public void setCountry(CountryPtf country) {
		this.country = country;
	}

	@XmlElement
	public MasterProgramPtf getMasterProgramme() {
		return masterProgramme;
	}

	public void setMasterProgramme(MasterProgramPtf masterProgramme) {
		this.masterProgramme = masterProgramme;
	}

	@XmlElementWrapper(name = "contacts")
	@XmlElements(@XmlElement(name = "contact", type = ContactPrg.class))
	public ArrayList<ContactPrg> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<ContactPrg> contacts) {
		this.contacts = contacts;
	}

	
	@XmlElement
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

		
	@XmlElement
	public SensorModel getSensorModel() {
		return sensorModel;
	}

	public void setSensorModel(SensorModel sensorModel) {
		this.sensorModel = sensorModel;
	}

	@XmlElementWrapper(name = "variables")
	@XmlElements(@XmlElement(name = "variable", type = Variable.class))
	public ArrayList<Variable> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<Variable> variables) {
		this.variables = variables;
	}

	public String getError_message() {
		return errorMessage;
	}

	public void setError_message(String error_message) {
		this.errorMessage = error_message;
	}

}

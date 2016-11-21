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

	private long Id;
	private String JcommopsRef;
	private Telecom Telecom;
	private String InternalRef;
	private String SerialRef;
	private String Age;
	private PlatformStatus PtfStatus;
	private PlatformFamily PtfFamily;
	private PlatformModel PtfModel;
	private PlatformType PtfType;
	private String NotificationDate;
	private PlatformDeploy Deployement;
	private PlatformLastLoc LastLocation;
	private String EndingDate;
	private ProgramPtf Program;
	private CountryPtf Country;
	private MasterProgramPtf MasterProgramme;
	private ArrayList<ContactPrg> contacts;
	private Configuration configuration;
	private SensorModel SensorModel;
	private ArrayList<Variable> variables;
	private String error_message;

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
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@XmlElement
	public String getJcommopsRef() {
		return JcommopsRef;
	}

	public void setJcommopsRef(String jcommopsRef) {
		JcommopsRef = jcommopsRef;
	}

	@XmlElement
	public Telecom getTelecom() {
		return Telecom;
	}

	public void setTelecom(Telecom telecom) {
		Telecom = telecom;
	}

	@XmlElement
	public String getInternalRef() {
		return InternalRef;
	}

	public void setInternalRef(String internalRef) {
		InternalRef = internalRef;
	}

	@XmlElement
	public String getSerialRef() {
		return SerialRef;
	}

	public void setSerialRef(String serialRef) {
		SerialRef = serialRef;
	}

	@XmlElement
	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	@XmlElement
	public PlatformStatus getPtfStatus() {
		return PtfStatus;
	}

	public void setPtfStatus(PlatformStatus ptfStatus) {
		PtfStatus = ptfStatus;
	}

	@XmlElement
	public PlatformFamily getPtfFamily() {
		return PtfFamily;
	}

	public void setPtfFamily(PlatformFamily ptfFamily) {
		PtfFamily = ptfFamily;
	}

	@XmlElement
	public PlatformModel getPtfModel() {
		return PtfModel;
	}

	public void setPtfModel(PlatformModel ptfModel) {
		PtfModel = ptfModel;
	}

	@XmlElement
	public PlatformType getPtfType() {
		return PtfType;
	}

	public void setPtfType(PlatformType ptfType) {
		PtfType = ptfType;
	}

	@XmlElement
	public String getNotificationDate() {
		return NotificationDate;
	}

	public void setNotificationDate(String notificationDate) {
		NotificationDate = notificationDate;
	}

	@XmlElement
	public PlatformDeploy getDeployement() {
		return Deployement;
	}

	public void setDeployement(PlatformDeploy deployement) {
		Deployement = deployement;
	}

	@XmlElement
	public String getEndingDate() {
		return EndingDate;
	}

	public void setEndingDate(String endingDate) {
		EndingDate = endingDate;
	}

	@XmlElement
	public PlatformLastLoc getLastLocation() {
		return LastLocation;
	}

	public void setLastLocation(PlatformLastLoc lastLocation) {
		LastLocation = lastLocation;
	}

	@XmlElement
	public ProgramPtf getProgram() {
		return Program;
	}

	public void setProgram(ProgramPtf program) {
		Program = program;
	}

	@XmlElement
	public CountryPtf getCountry() {
		return Country;
	}

	public void setCountry(CountryPtf country) {
		Country = country;
	}

	@XmlElement
	public MasterProgramPtf getMasterProgramme() {
		return MasterProgramme;
	}

	public void setMasterProgramme(MasterProgramPtf masterProgramme) {
		MasterProgramme = masterProgramme;
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
		return SensorModel;
	}

	public void setSensorModel(SensorModel sensorModel) {
		SensorModel = sensorModel;
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
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

}

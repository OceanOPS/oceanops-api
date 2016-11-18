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
@XmlType(propOrder = { "error_message", "jcommpsRef", "telecom", "internalRef", "serialRef", "age", "ptfFamily",
		"ptfType", "ptfModel", "ptfStatus", "notificationDate", "deployement", "lastLocation", "endingDate", "program",
		"country", "masterProgramme", "contacts", "configuration", "sensorModel" , "variables" })

public class Platform {

	private long Id;
	private String JcommpsRef;
	private Telecom Telecom;
	private String InternalRef;
	private String SerialRef;
	private int Age;
	private PlatformStatus PtfStatus;
	private PlatformFamily PtfFamily;
	private PlatformModel PtfModel;
	private PlatformType PtfType;
	private Date NotificationDate;
	private PlatformDeploy Deployement;
	private PlatformLastLoc LastLocation;
	private Date EndingDate;
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

	public Platform(long id, String ref, Telecom telc, String internalref, String serialref, int age,
			PlatformStatus ptfstatus, PlatformFamily ptffamily, PlatformModel ptfmodel, PlatformType ptftype,
			Date notifdate, PlatformDeploy ptfdpl, Date endingdate, PlatformLastLoc ptfll, ProgramPtf prgm,
			CountryPtf cntr, MasterProgramPtf mstrprgm, ArrayList<ContactPrg> contacts, Configuration config, SensorModel sensm,  ArrayList<Variable> variables,
			String error_message) {
		this.setId(id);
		this.setJcommpsRef(ref);
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
	public String getJcommpsRef() {
		return JcommpsRef;
	}

	public void setJcommpsRef(String jcommpsRef) {
		JcommpsRef = jcommpsRef;
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
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
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
	public Date getNotificationDate() {
		return NotificationDate;
	}

	public void setNotificationDate(Date notificationDate) {
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
	public Date getEndingDate() {
		return EndingDate;
	}

	public void setEndingDate(Date endingDate) {
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

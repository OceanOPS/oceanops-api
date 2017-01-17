package org.jcommops.api.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.Utils;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfConfig;

@XmlRootElement
@XmlType(propOrder = { "error_message", "jcommopsRef", "telecom", "internalRef", "serialRef", "age", "ptfFamily",
		"ptfType", "ptfModel", "ptfStatus", "notificationDate", "deployement", "lastLocation", "endingDate", "program",
		"country", "masterProgramme", "contacts", "configuration", "sensorModel" , "variables" })

public class PlatformEntity {
	

	private long id;
	private String jcommopsRef;
	private TelecomEntity telecom;
	private String internalRef;
	private String serialRef;
	private Integer age;
	private PlatformStatusEntity ptfStatus;
	private PlatformFamilyEntity ptfFamily;
	private PlatformModelEntity ptfModel;
	private PlatformTypeEntity ptfType;
	private String notificationDate;
	private PlatformDeployment deployement;
	private PlatformLocEntity latestLocation;
	private String endingDate;
	private ProgramEntity program;
	private ConfigurationEntity configuration;
	private SensorModelEntity sensorModel;
	private ArrayList<VariableEntity> variables;
	private String errorMessage;

	public PlatformEntity() {
	}

	public PlatformEntity(Ptf ptf) {
		this.setId(Integer.parseInt(ptf.getObjectId().toString()));
		
		this.setJcommopsRef(ptf.getRef());
		this.setTelecom(new TelecomEntity(ptf.getToTelecom()));
		this.setInternalRef(ptf.getToPtfIdentifiers().getInternalRef());
		this.setSerialRef(ptf.getToPtfHardware().getSerialRef());
		this.setAge(ptf.getAge());
		this.setPtfStatus(new PlatformStatusEntity(ptf.getToPtfStatus()));
		this.setPtfModel(new PlatformModelEntity(ptf.getToPtfModel()));
		this.setDeployement(new PlatformDeployment(ptf.getToPtfDeployment()));
		this.setEndingDate(Utils.GetIsoDate(ptf.getEndingDate()));
		this.setLatestLocation(new PlatformLocEntity(ptf.getToPtfLoc()));
		this.setProgram(new ProgramEntity(ptf.getToProgram()));
		this.setNotificationDate(Utils.GetIsoDate(ptf.getENotificationDate()));
		
		List<PtfConfig> ptfConfigs = ptf.getPtfConfigArray().stream().filter(ptfConfig -> ptfConfig.getCycle() == -1).collect(Collectors.toList());
		this.setConfiguration(new ConfigurationEntity(ptfConfigs.get(0).getToConfig()));
		
		this.variables = new ArrayList<VariableEntity>();
    	for(int i = 0; i<ptf.getToVariables().size();i++){
    		this.variables.add(new VariableEntity(ptf.getToVariables().get(i)));
    	}
		
		/*this.setVariables(variables);
		this.setErrorMessage(error_message);*/
	}

	public PlatformEntity(long id, String ref, TelecomEntity telc, String internalref, String serialref, Integer age,
			PlatformStatusEntity ptfstatus, PlatformFamilyEntity ptffamily, PlatformModelEntity ptfmodel, PlatformTypeEntity ptftype,
			String notifdate, PlatformDeployment ptfdpl, String endingdate, PlatformLocEntity ptfll, ProgramEntity prgm,
			CountryEntity cntr, MasterProgramEntity mstrprgm, ArrayList<ContactEntity> contacts, ConfigurationEntity config, SensorModelEntity sensm,  ArrayList<VariableEntity> variables,
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
		this.setLatestLocation(ptfll);
		this.setProgram(prgm);
		this.setConfiguration(config);
		this.setVariables(variables);
		this.setNotificationDate(notifdate);
		this.setErrorMessage(error_message);

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
	public TelecomEntity getTelecom() {
		return telecom;
	}

	public void setTelecom(TelecomEntity telecom) {
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
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer integer) {
		this.age = integer;
	}

	@XmlElement
	public PlatformStatusEntity getPtfStatus() {
		return ptfStatus;
	}

	public void setPtfStatus(PlatformStatusEntity ptfStatus) {
		this.ptfStatus = ptfStatus;
	}

	@XmlElement
	public PlatformFamilyEntity getPtfFamily() {
		return ptfFamily;
	}

	public void setPtfFamily(PlatformFamilyEntity ptfFamily) {
		this.ptfFamily = ptfFamily;
	}

	@XmlElement
	public PlatformModelEntity getPtfModel() {
		return ptfModel;
	}

	public void setPtfModel(PlatformModelEntity ptfModel) {
		this.ptfModel = ptfModel;
	}

	@XmlElement
	public PlatformTypeEntity getPtfType() {
		return ptfType;
	}

	public void setPtfType(PlatformTypeEntity ptfType) {
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
	public PlatformDeployment getDeployement() {
		return deployement;
	}

	public void setDeployement(PlatformDeployment deployement) {
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
	public PlatformLocEntity getLatestLocation() {
		return latestLocation;
	}

	public void setLatestLocation(PlatformLocEntity latestLocation) {
		this.latestLocation = latestLocation;
	}

	@XmlElement
	public ProgramEntity getProgram() {
		return program;
	}

	public void setProgram(ProgramEntity program) {
		this.program = program;
	}
	
	@XmlElement
	public ConfigurationEntity getConfiguration() {
		return configuration;
	}

	public void setConfiguration(ConfigurationEntity configuration) {
		this.configuration = configuration;
	}

		
	@XmlElement
	public SensorModelEntity getSensorModel() {
		return sensorModel;
	}

	public void setSensorModel(SensorModelEntity sensorModel) {
		this.sensorModel = sensorModel;
	}

	@XmlElementWrapper(name = "variables")
	@XmlElements(@XmlElement(name = "variable", type = VariableEntity.class))
	public ArrayList<VariableEntity> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<VariableEntity> variables) {
		this.variables = variables;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}

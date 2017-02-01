package org.jcommops.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.jcommops.api.Utils;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfConfig;

@XmlRootElement
public class PlatformEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -754408337242938591L;
	private Integer id;
	private String jcommopsRef;
	private TelecomEntity telecom;
	private String internalRef;
	private String serialRef;
	private Integer age;
	private PlatformStatusEntity ptfStatus;
	private PlatformModelEntity ptfModel;
	private String notificationDate;
	private PlatformDeploymentEntity deployment;
	private PlatformLocEntity latestLocation;
	private String endingDate;
	private ProgramEntity program;
	private ConfigurationEntity configuration;
	private ArrayList<SensorModelEntity> sensorModels;
	private ArrayList<VariableEntity> variables;

	public PlatformEntity() {
	}

	public PlatformEntity(Ptf ptf) {
		this.setId(Integer.parseInt(ptf.getObjectId().getIdSnapshot().get("ID").toString()));
		
		this.setJcommopsRef(ptf.getRef());
		if(ptf.getToTelecom() != null)
			this.setTelecom(new TelecomEntity(ptf.getToTelecom()));
		if(ptf.getToPtfIdentifiers() != null)
			this.setInternalRef(ptf.getToPtfIdentifiers().getInternalRef());
		if(ptf.getToPtfHardware() != null)
			this.setSerialRef(ptf.getToPtfHardware().getSerialRef());
		this.setAge(ptf.getAge());
		this.setPtfStatus(new PlatformStatusEntity(ptf.getToPtfStatus()));
		this.setPtfModel(new PlatformModelEntity(ptf.getToPtfModel()));
		this.setDeployment(new PlatformDeploymentEntity(ptf.getToPtfDeployment()));
		this.setEndingDate(Utils.GetIsoDate(ptf.getEndingDate()));
		if(ptf.getToPtfLoc() != null)
			this.setLatestLocation(new PlatformLocEntity(ptf.getToPtfLoc()));
		this.setProgram(new ProgramEntity(ptf.getToProgram()));
		this.setNotificationDate(Utils.GetIsoDate(ptf.getENotificationDate()));
		
		List<PtfConfig> ptfConfigs = ptf.getPtfConfigArray().stream().filter(ptfConfig -> ptfConfig.getCycle() == -1).collect(Collectors.toList());
		if(ptfConfigs != null && ptfConfigs.size() > 0)
			this.setConfiguration(new ConfigurationEntity(ptfConfigs.get(0).getToConfig()));

		this.sensorModels = new ArrayList<SensorModelEntity>();
    	for(int i = 0; i<ptf.getPtfSensorModelArray().size();i++){
    		this.sensorModels.add(new SensorModelEntity(ptf.getPtfSensorModelArray().get(i).getToSensorModel()));
    	}
    	
		this.variables = new ArrayList<VariableEntity>();
    	for(int i = 0; i<ptf.getToVariables().size();i++){
    		this.variables.add(new VariableEntity(ptf.getToVariables().get(i)));
    	}
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	public PlatformModelEntity getPtfModel() {
		return ptfModel;
	}

	public void setPtfModel(PlatformModelEntity ptfModel) {
		this.ptfModel = ptfModel;
	}

	@XmlElement
	public String getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}

	@XmlElement
	public PlatformDeploymentEntity getDeployment() {
		return deployment;
	}

	public void setDeployment(PlatformDeploymentEntity deployement) {
		this.deployment = deployement;
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
	public ArrayList<SensorModelEntity> getSensorModel() {
		return sensorModels;
	}

	public void setSensorModel(ArrayList<SensorModelEntity> sensorModels) {
		this.sensorModels = sensorModels;
	}

	@XmlElementWrapper(name = "variables")
	@XmlElements(@XmlElement(name = "variable", type = VariableEntity.class))
	public ArrayList<VariableEntity> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<VariableEntity> variables) {
		this.variables = variables;
	}
	
	/**
	 * Returns the CSV header used in the CSV serialization of a platform object. 
	 * @return
	 */
	public static String getCSVHeader(){
		String header = "id" + Utils.CSV_SEPARATOR + "ref" + Utils.CSV_SEPARATOR + "telecomId" + Utils.CSV_SEPARATOR
				+ "telecomType" + Utils.CSV_SEPARATOR + "internalRef" + Utils.CSV_SEPARATOR + "serialRef"
				+ Utils.CSV_SEPARATOR + "ptfFamily" + Utils.CSV_SEPARATOR + "ptfType" + Utils.CSV_SEPARATOR + "ptfModel"
				+ Utils.CSV_SEPARATOR + "program" + Utils.CSV_SEPARATOR + "country" + Utils.CSV_SEPARATOR
				+ "masterProgramme" + Utils.CSV_SEPARATOR + "deploymentDate" + Utils.CSV_SEPARATOR
				+ "deploymentLatitude" + Utils.CSV_SEPARATOR + "deploymentLongitude" + Utils.CSV_SEPARATOR
				+ "deploymentScore" + Utils.CSV_SEPARATOR + "deploymentDensity" + Utils.CSV_SEPARATOR
				+ "shipName" + Utils.CSV_SEPARATOR + "shipRef" + Utils.CSV_SEPARATOR + "notificationDate" 
				+ Utils.CSV_SEPARATOR + "lastLocationDate" + Utils.CSV_SEPARATOR + "lastLocationLatitude"
				+ Utils.CSV_SEPARATOR + "lastLocationLongitude" + Utils.CSV_SEPARATOR + "age" + Utils.CSV_SEPARATOR
				+ "cycleTime" + Utils.CSV_SEPARATOR + "driftPressure" + Utils.CSV_SEPARATOR + "profilePressure"
				+ Utils.CSV_SEPARATOR + "iceDetection" + Utils.CSV_SEPARATOR + "sensorModel" + Utils.CSV_SEPARATOR
				+ "sensorTypes" + Utils.CSV_SEPARATOR + "variables";
		
		return header;
	}
	
	/**
	 * Writes a CSV row for this instance of a platform. 
	 * @return A String object representing this platform.
	 */
	public String toCSV(){
		StringBuilder csv = new StringBuilder();
		
		csv.append(this.getId() + Utils.CSV_SEPARATOR + this.getJcommopsRef() + Utils.CSV_SEPARATOR);
		
		if(this.getTelecom() != null){
			csv.append((this.getTelecom().getTelecomNum() != null ? this.getTelecom().getTelecomNum() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getTelecom().getTelecomType() != null ? this.getTelecom().getTelecomType() : "") + Utils.CSV_SEPARATOR);
		}
		else{
			csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		}
		
		csv.append((this.getInternalRef() != null ? this.getInternalRef() : "") + Utils.CSV_SEPARATOR);
		csv.append((this.getSerialRef() != null ? this.getSerialRef() : "") + Utils.CSV_SEPARATOR);
		
		if(this.getPtfModel().getPlatformType() != null){
			if(this.getPtfModel().getPlatformType().getPlatformFamily() != null)
				csv.append(this.getPtfModel().getPlatformType().getPlatformFamily().getNameShort() + Utils.CSV_SEPARATOR);
			else
				csv.append(Utils.CSV_SEPARATOR);
			
			csv.append(this.getPtfModel().getPlatformType().getNameShort() + Utils.CSV_SEPARATOR);
		}
		else
			csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		
		csv.append((this.getPtfModel() != null ? this.getPtfModel().getNameShort() : "") + Utils.CSV_SEPARATOR);
		
		csv.append((this.getProgram().getName() != null ? this.getProgram().getName() : "") + Utils.CSV_SEPARATOR);
		if(this.getProgram().getCountry() != null)
			csv.append((this.getProgram().getCountry().getIsoCode2() != null ? this.getProgram().getCountry().getIsoCode2() : "") + Utils.CSV_SEPARATOR);
		else
			csv.append(Utils.CSV_SEPARATOR);
		
		csv.append((this.getProgram().getMasterProgram().getNameShort() != null ? this.getProgram().getMasterProgram().getNameShort() : "") + Utils.CSV_SEPARATOR);
		
		if(this.getDeployment() != null){
			csv.append((this.getDeployment().getDeploymentDate() != null ? this.getDeployment().getDeploymentDate() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getDeployment().getLat() != null ? this.getDeployment().getLat() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getDeployment().getLon() != null ? this.getDeployment().getLon() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getDeployment().getDeploymentScore() != null ? this.getDeployment().getDeploymentScore() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getDeployment().getDeploymentDensity() != null ? this.getDeployment().getDeploymentDensity() : "") + Utils.CSV_SEPARATOR);
			if(this.getDeployment().getShip() != null){
				csv.append((this.getDeployment().getShip().getName() != null ? this.getDeployment().getShip().getName() : "") + Utils.CSV_SEPARATOR);
				csv.append((this.getDeployment().getShip().getRef() != null ? this.getDeployment().getShip().getRef() : "") + Utils.CSV_SEPARATOR);
			}
			else
				csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		}
		else
			csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		
		csv.append((this.getNotificationDate() != null ? this.getNotificationDate() : "") + Utils.CSV_SEPARATOR);
		
		if(this.getLatestLocation() != null){
			csv.append((this.getLatestLocation().getDate() != null ? this.getLatestLocation().getDate() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getLatestLocation().getLat() != null ? this.getLatestLocation().getLat() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getLatestLocation().getLon() != null ? this.getLatestLocation().getLon() : "") + Utils.CSV_SEPARATOR);
		}
		else
			csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		
		csv.append((this.getAge() != null ? this.getAge() : "") + Utils.CSV_SEPARATOR);
		
		if(this.getConfiguration() != null){
			csv.append((this.getConfiguration().getCycleTime() != null ? this.getConfiguration().getCycleTime() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getConfiguration().getProfilePressure() != null ? this.getConfiguration().getProfilePressure() : "") + Utils.CSV_SEPARATOR);
			csv.append((this.getConfiguration().getDriftPressure() != null ? this.getConfiguration().getDriftPressure() : "") + Utils.CSV_SEPARATOR);
			csv.append(this.getConfiguration().getIceDetection() + Utils.CSV_SEPARATOR);
		}
		else
			csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		
		if(this.getSensorModel() != null && this.getSensorModel().size() > 0){
			csv.append("\"");
			for(int i = 0; i < this.getSensorModel().size(); i++){
				if(i > 0)
					csv.append(Utils.CSV_SEPARATOR);
				csv.append(this.getSensorModel().get(i).getNameShort() != null ? this.getSensorModel().get(i).getNameShort() : "");
			}
			csv.append("\"" + Utils.CSV_SEPARATOR);
			
			StringBuilder st = new StringBuilder();
			for(int i = 0; i < this.getSensorModel().size(); i++){
				SensorModelEntity sm = this.getSensorModel().get(i);
				
				for(int j= 0; j<sm.getSensorTypes().size();j++){
					if(i > 0 || j > 0)
						st.append(Utils.CSV_SEPARATOR);
					st.append(sm.getSensorTypes().get(j).getNameShort() != null ? sm.getSensorTypes().get(j).getNameShort() : "");
				}
			}
			
			if(st.length() > 0)
				csv.append("\"" + st.toString() + "\"" + Utils.CSV_SEPARATOR);
			else
				csv.append(Utils.CSV_SEPARATOR);
			
		}
		else
			csv.append(Utils.CSV_SEPARATOR + Utils.CSV_SEPARATOR);
		
		if(this.getVariables() != null && this.getVariables().size() > 0){
			csv.append("\"");
			for(int i = 0; i < this.getVariables().size(); i++){
				if(i > 0)
					csv.append(Utils.CSV_SEPARATOR);
				csv.append(this.getVariables().get(i).getNameShort() != null ? this.getVariables().get(i).getNameShort() : "");
			}
			csv.append("\"" + Utils.CSV_SEPARATOR);
		}
		
		
		
		return csv.toString();
	}

}

package org.oceanops.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.SensorModel;

@XmlRootElement
public class SensorModelEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3478136978018082393L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;
	private List<SensorTypeEntity> sensorTypes;
	
	
	public SensorModelEntity (){	
	}

	public SensorModelEntity ( SensorModel sensorModel ){	
		this.setId(Integer.parseInt(sensorModel.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setNameShort(sensorModel.getNameShort());
		this.setName(sensorModel.getName());
		this.setDescription(sensorModel.getDescription());
		this.sensorTypes = new ArrayList<SensorTypeEntity>();
    	for(int i = 0; i< sensorModel.getSensorModelSensorTypes().size();i++){
    		this.sensorTypes.add(new SensorTypeEntity(sensorModel.getSensorModelSensorTypes().get(i).getSensorType()));
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
	public String getNameShort() {
		return nameShort;
	}

	public void setNameShort(String nameShort) {
		this.nameShort = nameShort;
	}
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElementWrapper(name = "sensorTypes")
	@XmlElements(@XmlElement(name = "sensorType", type = SensorTypeEntity.class))
	public List<SensorTypeEntity> getSensorTypes() {
		return sensorTypes;
	}

	public void setSensorTypes(List<SensorTypeEntity> sensortypes) {
		this.sensorTypes = sensortypes;
	}

}



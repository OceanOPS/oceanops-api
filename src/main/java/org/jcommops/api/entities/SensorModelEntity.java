package org.jcommops.api.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.SensorModel;

@XmlRootElement
@XmlType(propOrder={ "name", "nameShort","description", "sensorTypes"})
public class SensorModelEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3478136978018082393L;
	private long id;
	private String nameShort;
	private String name;
	private String description;
	private ArrayList<SensorTypeEntity> sensorTypes;
	
	
	public SensorModelEntity (){	
	}

	public SensorModelEntity ( SensorModel sensorModel ){	
		this.setId(Integer.parseInt(sensorModel.getObjectId().toString()));
		this.setNameShort(sensorModel.getNameShort());
		this.setName(sensorModel.getName());
		this.setDescription(sensorModel.getDescription());
		this.sensorTypes = new ArrayList<SensorTypeEntity>();
    	for(int i = 0; i< sensorModel.getToSensorTypes().size();i++){
    		this.sensorTypes.add(new SensorTypeEntity(sensorModel.getToSensorTypes().get(i)));
    	}
	}
	
	public SensorModelEntity ( long id, String nameshort, String name, String description, ArrayList<SensorTypeEntity> sensortypes ){	
		this.setId(id);
		this.setNameShort(nameshort);
		this.setName(name);
		this.setDescription(description);
		this.setSensorTypes(sensortypes);
	}

	
	@XmlAttribute
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	public ArrayList<SensorTypeEntity> getSensorTypes() {
		return sensorTypes;
	}

	public void setSensorTypes(ArrayList<SensorTypeEntity> sensortypes) {
		this.sensorTypes = sensortypes;
	}

}



package org.jcommops.api.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={ "name", "nameShort","description", "sensorTypes"})
public class SensorModel {
	private long Id;
	private String NameShort;
	private String Name;
	private String description;
	private ArrayList<SensorType> SensorType;
	
	
	public SensorModel (){	
	}

	public SensorModel ( long id, String nameshort, String name, String description, ArrayList<SensorType> sensortypes ){	
		this.setId(id);
		this.setNameShort(nameshort);
		this.setName(name);
		this.setDescription(description);
		this.setSensorTypes(sensortypes);
	}

	
	@XmlAttribute
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@XmlElement
	public String getNameShort() {
		return NameShort;
	}

	public void setNameShort(String nameShort) {
		NameShort = nameShort;
	}
	@XmlElement
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElementWrapper(name = "sensorTypes")
	@XmlElements(@XmlElement(name = "sensorType", type = SensorType.class))
	public ArrayList<SensorType> getSensorTypes() {
		return SensorType;
	}

	public void setSensorTypes(ArrayList<SensorType> sensortypes) {
		this.SensorType = sensortypes;
	}

}



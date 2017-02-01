package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jcommops.api.orm.SensorType;

@XmlRootElement
public class SensorTypeEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6709670090803296386L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;

	public SensorTypeEntity() {
	}

	public SensorTypeEntity(SensorType sensorType) {
		this.setId(Integer.parseInt(sensorType.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setNameShort(sensorType.getNameShort());
		this.setName(sensorType.getName());
		this.setDescription(sensorType.getDescription());
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

}

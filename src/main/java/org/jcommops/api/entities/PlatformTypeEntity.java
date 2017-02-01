package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.PtfType;
@XmlRootElement
public class PlatformTypeEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7911872558173492767L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;
	private PlatformFamilyEntity platformFamily;

	public PlatformTypeEntity (){	
	}
	
	public PlatformTypeEntity (PtfType ptfType){	
		this.setId(Integer.parseInt(ptfType.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setName(ptfType.getName());
		this.setNameShort(ptfType.getNameShort());
		this.setDescription(ptfType.getDescription());
		this.setPlatformFamily(new PlatformFamilyEntity(ptfType.getToPtfFamily()));
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

	@XmlElement
	public PlatformFamilyEntity getPlatformFamily() {
		return platformFamily;
	}


	public void setPlatformFamily(PlatformFamilyEntity platformFamily) {
		this.platformFamily = platformFamily;
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}

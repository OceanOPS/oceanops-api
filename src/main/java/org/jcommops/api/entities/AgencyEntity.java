package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={ "name", "nameShort","description"})

public class AgencyEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8727647385120864496L;
	private String nameShort;
	private String name;
	private String description;
	
	public AgencyEntity (){	
	}

	public AgencyEntity (org.jcommops.api.orm.Agency agency){
		this.setName(agency.getName());
		this.setNameShort(agency.getNameShort());
		this.setDescription(agency.getDescription());
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


package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.PtfModel;

@XmlRootElement
public class PlatformModelEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8253121326385147246L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;
	private PlatformTypeEntity platformType;
	private AgencyEntity manufacturer;
	
	
	public PlatformModelEntity (){	
	}
	
	public PlatformModelEntity (PtfModel ptfModel){	
		this.setId(Integer.parseInt(ptfModel.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setName(ptfModel.getName());
		this.setNameShort(ptfModel.getNameShort());
		this.setDescription(ptfModel.getDescription());
		if(ptfModel.getPtfType() != null)
			this.setPlatformType(new PlatformTypeEntity(ptfModel.getPtfType()));
		if(ptfModel.getAgency() != null)
			this.setManufacturer(new AgencyEntity(ptfModel.getAgency()));
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
	public PlatformTypeEntity getPlatformType() {
		return platformType;
	}

	public void setPlatformType(PlatformTypeEntity platformType) {
		this.platformType = platformType;
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement
	public AgencyEntity getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(AgencyEntity manufacturer) {
		this.manufacturer = manufacturer;
	}
	

}

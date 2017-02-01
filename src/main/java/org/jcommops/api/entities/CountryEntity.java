package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CountryEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3442124618719919778L;
	private Integer id;
	private String nameShort;
	private String name;
	private String isoCode2;
	private String isoCode3;
	
	public CountryEntity() {
		
	}
	
	public CountryEntity(org.jcommops.api.orm.Country country) {
		this.setId(Integer.parseInt(country.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setIsoCode2(country.getCode2());
		this.setIsoCode3(country.getCode3());
		this.setName(country.getName());
		this.setNameShort(country.getNameShort());
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
	public String getIsoCode2() {
		return isoCode2;
	}

	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}

	@XmlElement
	public String getIsoCode3() {
		return isoCode3;
	}

	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
}

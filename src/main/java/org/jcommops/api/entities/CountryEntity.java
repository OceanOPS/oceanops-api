package org.jcommops.api.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder={"nameShort", "name", "isoCode2", "isoCode3"})
public class CountryEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3442124618719919778L;
	private String NameShort;
	private String Name;
	private String IsoCode2;
	private String IsoCode3;
	
	public CountryEntity() {
		
	}
	
	public CountryEntity(org.jcommops.api.orm.Country country) {
		this.setIsoCode2(country.getCode2());
		this.setIsoCode3(country.getCode3());
		this.setName(country.getName());
		this.setNameShort(country.getNameShort());
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
	public String getIsoCode2() {
		return IsoCode2;
	}

	public void setIsoCode2(String isoCode2) {
		IsoCode2 = isoCode2;
	}

	@XmlElement
	public String getIsoCode3() {
		return IsoCode3;
	}

	public void setIsoCode3(String isoCode3) {
		IsoCode3 = isoCode3;
	}

	
	
}

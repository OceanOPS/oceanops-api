package org.jcommops.api.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder={"nameShort", "name", "isoCode2", "isoCode3"})
public class CountryPtf {
	
	private long Id;
	private String NameShort;
	private String Name;
	private String IsoCode2;
	private String IsoCode3;
	
	public CountryPtf() {
		
	}
	
	public CountryPtf( long id, String namesh, String name, String isoCode2, String isoCode3) {
		this.setId(id);
		this.setNameShort(namesh);
		this.setName(name);
		this.setIsoCode2(isoCode2);
		this.setIsoCode3(isoCode3);
		
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

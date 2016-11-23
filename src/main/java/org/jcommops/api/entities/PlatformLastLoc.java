package org.jcommops.api.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"lastLocationDate", "lat", "lon"})
public class PlatformLastLoc {
	
	private long Id;
	private String LastLocationDate;
	private BigDecimal Lat;
	private BigDecimal Lon;

	public PlatformLastLoc (){	
	}
	
	

	public PlatformLastLoc ( long id, String locdate, BigDecimal lat, BigDecimal lon ){	
		this.setId(id);
		this.setLastLocationDate(locdate);
		this.setLat(lat);
		this.setLon(lon);

	}

	
	@XmlAttribute
	public long getId() {
		return Id;
	}

	public void setId(long iD) {
		Id = iD;
	}

	@XmlElement
	public String getLastLocationDate() {
		return LastLocationDate;
	}

	public void setLastLocationDate(String dateOfLastLocation) {
		LastLocationDate = dateOfLastLocation;
	}
	@XmlElement
	public BigDecimal getLat() {
		return Lat;
	}

	public void setLat(BigDecimal lat) {
		Lat = lat;
	}
	@XmlElement
	public BigDecimal getLon() {
		return Lon;
	}

	public void setLon(BigDecimal lon) {
		Lon = lon;
	}



}

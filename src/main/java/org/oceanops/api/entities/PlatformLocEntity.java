package org.oceanops.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.Utils;
import org.oceanops.api.orm.PtfLoc;

@XmlRootElement
public class PlatformLocEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8809318656640217484L;
	private String date;
	private BigDecimal lat;
	private BigDecimal lon;

	public PlatformLocEntity() {
	}

	public PlatformLocEntity(PtfLoc loc) {
		this.setDate(Utils.GetIsoDate(loc.getLocDate()));
		this.setLat(loc.getLat());
		this.setLon(loc.getLon());
	}

	@XmlElement
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@XmlElement
	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	@XmlElement
	public BigDecimal getLon() {
		return lon;
	}

	public void setLon(BigDecimal lon) {
		this.lon = lon;
	}
}

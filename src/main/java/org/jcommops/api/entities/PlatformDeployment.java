package org.jcommops.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.Utils;
import org.jcommops.api.orm.PtfDeployment;
@XmlRootElement
@XmlType(propOrder = { "deployementDate", "lat", "lon", "deployementDensity", "deployementScore",
		"ship","cruiseName" })
public class PlatformDeployment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 137840533989152311L;
	private String deployementDate;
	private BigDecimal lat;
	private BigDecimal lon;
	private BigDecimal deployementScore;
	private BigDecimal deployementDensity;
	private ShipEntity ship;
	private String cruiseName;

	public PlatformDeployment() {
	}
	

	public PlatformDeployment(PtfDeployment depl) {
		this.setDeployementDate(Utils.GetIsoDate(depl.getDeplDate()));
		if(depl.getToCruise() != null && depl.getToCruise().getNameLong() != null)
			this.setCruiseName(depl.getToCruise().getNameLong());
		else
			this.setCruiseName(depl.getCruiseName());
		this.setDeployementDensity(depl.getDensity());
		this.setDeployementScore(depl.getScore());
		this.setLat(depl.getLat());
		this.setLon(depl.getLon());
		this.setShip(new ShipEntity(depl.getToShip()));
	}

	@XmlElement
	public String getDeployementDate() {
		return deployementDate;
	}

	public void setDeployementDate(String deployementDate) {
		this.deployementDate = deployementDate;
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

	public BigDecimal getDeployementScore() {
		return deployementScore;
	}

	@XmlElement
	public void setDeployementScore(BigDecimal deployementScore) {
		this.deployementScore = deployementScore;
	}

	public BigDecimal getDeployementDensity() {
		return deployementDensity;
	}

	@XmlElement
	public void setDeployementDensity(BigDecimal deployementDensity) {
		this.deployementDensity = deployementDensity;
	}

	@XmlElement
	public String getCruiseName() {
		return cruiseName;
	}

	public void setCruiseName(String cruiseName) {
		this.cruiseName = cruiseName;
	}

	@XmlElement
	public ShipEntity getShip() {
		return ship;
	}

	public void setShip(ShipEntity ship) {
		this.ship = ship;
	}
	
	

}

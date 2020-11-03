package org.oceanops.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.Utils;
import org.oceanops.api.orm.PtfDeployment;
@XmlRootElement
public class PlatformDeploymentEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 137840533989152311L;
	private String deploymentDate;
	private BigDecimal lat;
	private BigDecimal lon;
	private BigDecimal deploymentScore;
	private BigDecimal deploymentDensity;
	private ShipEntity ship;
	private String cruiseName;

	public PlatformDeploymentEntity() {
	}
	

	public PlatformDeploymentEntity(PtfDeployment depl) {
		this.setDeploymentDate(Utils.GetIsoDate(depl.getDeplDate()));
		if(depl.getCruise() != null && depl.getCruise().getNameLong() != null)
			this.setCruiseName(depl.getCruise().getNameLong());
		else
			this.setCruiseName(depl.getCruiseName());
		this.setDeploymentDensity(depl.getDensity());
		this.setDeploymentScore(depl.getScore());
		this.setLat(depl.getLat());
		this.setLon(depl.getLon());
		if(depl.getShip() != null)
			this.setShip(new ShipEntity(depl.getShip()));
	}

	@XmlElement
	public String getDeploymentDate() {
		return deploymentDate;
	}

	public void setDeploymentDate(String deployementDate) {
		this.deploymentDate = deployementDate;
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

	public BigDecimal getDeploymentScore() {
		return deploymentScore;
	}

	@XmlElement
	public void setDeploymentScore(BigDecimal deployementScore) {
		this.deploymentScore = deployementScore;
	}

	public BigDecimal getDeploymentDensity() {
		return deploymentDensity;
	}

	@XmlElement
	public void setDeploymentDensity(BigDecimal deployementDensity) {
		this.deploymentDensity = deployementDensity;
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

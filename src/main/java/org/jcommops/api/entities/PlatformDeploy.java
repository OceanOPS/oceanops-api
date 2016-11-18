package org.jcommops.api.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "deployementDate", "lat", "lon", "notificationDate", "deployementDensity", "deployementScore",
		"shipName", "shipRef", "cruiseName" })
public class PlatformDeploy {
	private long Id;
	private Date DeployementDate;
	private BigDecimal Lat;
	private BigDecimal Lon;
	private BigDecimal DeployementScore;
	private BigDecimal DeployementDensity;
	private Date NotificationDate;
	private String ShipName;
	private String ShipRef;
	private String CruiseName;

	public PlatformDeploy() {
	}

	public PlatformDeploy(long id, Date dpldate, BigDecimal lat, BigDecimal lon, BigDecimal deplscore,
			BigDecimal depldensity, Date notifdate, String shipname, String shipref, String cruisename) {
		this.setDeployementDate(dpldate);
		this.setId(id);
		this.setLat(lat);
		this.setLon(lon);
		this.setDeployementScore(deplscore);
		this.setDeployementDensity(depldensity);
		this.setNotificationDate(notifdate);
		this.setShipName(shipname);
		this.setShipRef(shipref);
		this.setCruiseName(cruisename);
	}

	@XmlAttribute
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@XmlElement
	public Date getDeployementDate() {
		return DeployementDate;
	}

	public void setDeployementDate(Date deployementDate) {
		DeployementDate = deployementDate;
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

	public BigDecimal getDeployementScore() {
		return DeployementScore;
	}

	@XmlElement
	public void setDeployementScore(BigDecimal deployementScore) {
		DeployementScore = deployementScore;
	}

	public BigDecimal getDeployementDensity() {
		return DeployementDensity;
	}

	@XmlElement
	public void setDeployementDensity(BigDecimal deployementDensity) {
		DeployementDensity = deployementDensity;
	}

	@XmlElement
	public Date getNotificationDate() {
		return NotificationDate;
	}

	public void setNotificationDate(Date notificationDate) {
		NotificationDate = notificationDate;
	}
	@XmlElement
	public String getShipName() {
		return ShipName;
	}

	public void setShipName(String shipName) {
		ShipName = shipName;
	}
	@XmlElement
	public String getShipRef() {
		return ShipRef;
	}

	public void setShipRef(String shipRef) {
		ShipRef = shipRef;
	}
	@XmlElement
	public String getCruiseName() {
		return CruiseName;
	}

	public void setCruiseName(String cruiseName) {
		CruiseName = cruiseName;
	}
	
	

}

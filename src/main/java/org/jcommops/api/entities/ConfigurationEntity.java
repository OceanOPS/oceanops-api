package org.jcommops.api.entities;

import java.math.BigDecimal;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.Config;

@XmlRootElement
@XmlType(propOrder={ "cycleTime", "driftPressure", "profilePressure", "iceDetection"})


public class ConfigurationEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6959682108023745029L;
	private BigDecimal CycleTime;
    private BigDecimal DriftPressure;
    private BigDecimal ProfilePressure;
    private int IceDetection;


    public ConfigurationEntity() {

    }
    
    public ConfigurationEntity(Config config) {
    	this.setCycleTime(config.getCycleTime());
    	this.setDriftPressure(config.getDriftPress());
    	this.setIceDetection(config.getIceDetection());
    	this.setProfilePressure(config.getProfilePress());
    }

    @XmlElement
	public BigDecimal getCycleTime() {
		return CycleTime;
	}

	public void setCycleTime(BigDecimal cycleTime) {
		CycleTime = cycleTime;
	}

	@XmlElement
	public BigDecimal getDriftPressure() {
		return DriftPressure;
	}

	public void setDriftPressure(BigDecimal driftPressure) {
		DriftPressure = driftPressure;
	}

	@XmlElement
	public BigDecimal getProfilePressure() {
		return ProfilePressure;
	}

	public void setProfilePressure(BigDecimal profilePressure) {
		ProfilePressure = profilePressure;
	}
	
	@XmlElement
	public int getIceDetection() {
		return IceDetection;
	}

	public void setIceDetection(int iceDetection) {
		IceDetection = iceDetection;
	}
   
    

} 
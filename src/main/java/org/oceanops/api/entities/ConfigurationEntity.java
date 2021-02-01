package org.oceanops.api.entities;

import java.math.BigDecimal;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.Config;

@XmlRootElement
public class ConfigurationEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6959682108023745029L;
	private BigDecimal cycleTime;
    private BigDecimal driftPressure;
    private BigDecimal profilePressure;
    private Integer iceDetection;


    public ConfigurationEntity() {

    }
    
    public ConfigurationEntity(Config config) {
    	this.setCycleTime(config.getCycleTime());
    	this.setDriftPressure(config.getDriftPress());
    	//this.setIceDetection(config.getIceDetection());
    	this.setProfilePressure(config.getProfilePress());
    }

    @XmlElement
	public BigDecimal getCycleTime() {
		return cycleTime;
	}

	public void setCycleTime(BigDecimal cycleTime) {
		this.cycleTime = cycleTime;
	}

	@XmlElement
	public BigDecimal getDriftPressure() {
		return driftPressure;
	}

	public void setDriftPressure(BigDecimal driftPressure) {
		this.driftPressure = driftPressure;
	}

	@XmlElement
	public BigDecimal getProfilePressure() {
		return profilePressure;
	}

	public void setProfilePressure(BigDecimal profilePressure) {
		this.profilePressure = profilePressure;
	}
	
	@XmlElement
	public Integer getIceDetection() {
		return iceDetection;
	}

	public void setIceDetection(Integer iceDetection) {
		this.iceDetection = iceDetection;
	}
   
    

} 
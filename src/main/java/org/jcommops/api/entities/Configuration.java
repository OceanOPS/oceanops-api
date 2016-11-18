package org.jcommops.api.entities;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={ "cycleTime", "driftPressure", "profilePressure", "iceDetection"})


public class Configuration  {

	private long Id;
    private BigDecimal CycleTime;
    private BigDecimal DriftPressure;
    private BigDecimal ProfilePressure;
    private int IceDetection;


    public Configuration() {

    }

    public Configuration ( long id, BigDecimal ctime, BigDecimal driftp, BigDecimal profilep, int icedetec ){
        this.setId(id);
        this.setCycleTime(ctime);
        this.setDriftPressure(driftp);
        this.setProfilePressure(profilep);
        this.setIceDetection(icedetec);
        }


	@XmlAttribute
    public long getId() {
        return Id;
   }

    public void setId(long id) {
        Id = id;
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
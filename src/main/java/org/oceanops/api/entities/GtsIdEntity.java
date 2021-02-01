package org.oceanops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.Utils;
import org.oceanops.api.orm.Wmo;

@XmlRootElement
public class GtsIdEntity implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String gtsid;
    private String startDate;
    private String endDate;

    public GtsIdEntity(){

    }
    public GtsIdEntity(Wmo wmo){
        //this.setId(wmo.getId());
        this.setGtsid(wmo.getWmo());
        this.setStartDate(Utils.GetIsoDate(wmo.getStartDate()));
        this.setEndDate(Utils.GetIsoDate(wmo.getEndDate()));
    }

    public GtsIdEntity(String requestedGtsId) {
        this.setGtsid(requestedGtsId);
    }
    
	@XmlAttribute
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement
    public String getGtsid() {
        return this.gtsid;
    }

    public void setGtsid(String gtsid) {
        this.gtsid = gtsid;
    }

    @XmlElement
    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @XmlElement
    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
}
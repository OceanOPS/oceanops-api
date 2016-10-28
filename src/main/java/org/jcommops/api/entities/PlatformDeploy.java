package org.jcommops.api.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;


public class PlatformDeploy {
	private long Id;
	private Date DeployementDate;

	
	
	public PlatformDeploy (){	
	}

	public PlatformDeploy ( long id, Date dpldate ){	
		this.setDeployementDate(dpldate);
		this.setId(id);

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
	

}

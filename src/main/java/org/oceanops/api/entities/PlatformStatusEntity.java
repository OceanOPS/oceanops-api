package org.oceanops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.PtfStatus;

@XmlRootElement
public class PlatformStatusEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7369996670935372181L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;
	
	
	public PlatformStatusEntity (){	
	}
	
	public PlatformStatusEntity (PtfStatus ptfStatus){	
		this.setId(Integer.parseInt(ptfStatus.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setNameShort(ptfStatus.getNameShort());
		this.setName(ptfStatus.getName());
		this.setDescription(ptfStatus.getDescription());
	}

	
	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement
	public String getNameShort() {
		return nameShort;
	}

	public void setNameShort(String nameShort) {
		this.nameShort = nameShort;
	}
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}

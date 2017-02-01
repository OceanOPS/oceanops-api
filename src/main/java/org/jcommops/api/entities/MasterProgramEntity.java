package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.MasterProg;

@XmlRootElement
public class MasterProgramEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4384125921227520900L;
	private Integer id;
	private String name;
	private String nameShort;
	private String description;

	public MasterProgramEntity() {

	}
	

	public MasterProgramEntity(MasterProg masterProg) {
		this.setId(Integer.parseInt(masterProg.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setName(masterProg.getName());
		this.setNameShort(masterProg.getNameShort());
		this.setDescription(masterProg.getDescription());
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getNameShort() {
		return nameShort;
	}

	public void setNameShort(String nameShort) {
		this.nameShort = nameShort;
	}

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@XmlAttribute
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

}

package org.oceanops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.Role;

@XmlRootElement
public class RoleEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7794466759753703046L;
	private Integer id;
	private String name;
	private String nameShort;

	
	
	public RoleEntity() {
		
	}
	
	public RoleEntity (Role role){	
		this.setId(Integer.parseInt(role.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setName(role.getName());
		this.setNameShort(role.getNameShort());
	}
	
	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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



}

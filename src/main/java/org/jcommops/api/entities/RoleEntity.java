package org.jcommops.api.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.Role;

@XmlType(propOrder={ "name", "nameShort"})
public class RoleEntity {
	private long id;
	private String name;
	private String nameShort;

	
	
	public RoleEntity() {
		
	}
	
	public RoleEntity (Role role){	
		this.setId(Integer.parseInt(role.getObjectId().toString()));
		this.setName(role.getName());
		this.setNameShort(role.getNameShort());
	}
	
	@XmlAttribute
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

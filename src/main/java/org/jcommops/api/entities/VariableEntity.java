package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.Variable;

@XmlRootElement
@XmlType(propOrder={ "name", "nameShort", "description"})
public class VariableEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8922662622540263102L;
	private long id;
	private String name;
	private String nameShort;
	private String description;
	private String cfRef;
	private String argoRef;
	private Integer wigosRef;
	private String p01Ref;

	
	
	public VariableEntity() {
		
	}
	

	public VariableEntity(Variable var) {
		this.setId(Integer.parseInt(var.getObjectId().toString()));
		this.setArgoRef(var.getArgoRef());
		this.setCfRef(var.getCfRef());
		this.setDescription(var.getDescription());
		this.setName(var.getName());
		this.setNameShort(var.getNameShort());
		this.setP01Ref(var.getP01Ref());
		this.setWigosRef(var.getWigosRef());
	}
	
	@XmlElement
	public String getCfRef() {
		return cfRef;
	}


	public void setCfRef(String cfRef) {
		this.cfRef = cfRef;
	}

	@XmlElement
	public String getArgoRef() {
		return argoRef;
	}


	public void setArgoRef(String argoRef) {
		this.argoRef = argoRef;
	}

	@XmlElement
	public Integer getWigosRef() {
		return wigosRef;
	}


	public void setWigosRef(Integer wigosRef) {
		this.wigosRef = wigosRef;
	}

	@XmlElement
	public String getP01Ref() {
		return p01Ref;
	}


	public void setP01Ref(String p01Ref) {
		this.p01Ref = p01Ref;
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

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	
	

}

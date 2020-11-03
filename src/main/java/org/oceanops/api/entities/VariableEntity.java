package org.oceanops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.Variable;

@XmlRootElement
public class VariableEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8922662622540263102L;
	private Integer id;
	private String name;
	private String nameShort;
	private String cfRef;
	private String argoRef;
	private String wigosCode;
	private String p01Ref;

	
	
	public VariableEntity() {
		
	}
	

	public VariableEntity(Variable var) {
		this.setId(Integer.parseInt(var.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setArgoRef(var.getArgoRef());
		this.setCfRef(var.getCfRef());
		this.setName(var.getName());
		this.setNameShort(var.getNameShort());
		this.setP01Ref(var.getP01Ref());
		this.setWigosCode(var.getWigosCode());
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
	public String getWigosCode() {
		return wigosCode;
	}


	public void setWigosCode(String wigosCode) {
		this.wigosCode = wigosCode;
	}

	@XmlElement
	public String getP01Ref() {
		return p01Ref;
	}


	public void setP01Ref(String p01Ref) {
		this.p01Ref = p01Ref;
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
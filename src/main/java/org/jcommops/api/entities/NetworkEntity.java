package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.Network;

@XmlRootElement
public class NetworkEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3997127540846173151L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;
	
	
	public NetworkEntity (){	
	}

	public NetworkEntity (Network network){	
		this.setId(Integer.parseInt(network.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setDescription(network.getDescription());
		this.setName(network.getName());
		this.setNameShort(network.getNameShort());
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

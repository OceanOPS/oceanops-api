package org.oceanops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.PtfFamily;
@XmlRootElement
public class PlatformFamilyEntity  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9152085383423538016L;
	private Integer id;
	private String nameShort;
	private String name;
	private String description;
	
	
	public PlatformFamilyEntity (){	
	}
	
	public PlatformFamilyEntity (PtfFamily ptfFamily){
		this.setId(Integer.parseInt(ptfFamily.getObjectId().getIdSnapshot().get("ID").toString()));
		this.setName(ptfFamily.getName());
		this.setNameShort(ptfFamily.getNameShort());
		this.setDescription(ptfFamily.getDescription());
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

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

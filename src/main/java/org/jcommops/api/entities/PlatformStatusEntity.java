package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.PtfStatus;

@XmlRootElement
@XmlType(propOrder={ "name", "nameShort","description"})
public class PlatformStatusEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7369996670935372181L;
	private long Id;
	private String NameShort;
	private String Name;
	private String description;
	
	
	public PlatformStatusEntity (){	
	}
	
	public PlatformStatusEntity (PtfStatus ptfStatus){	
		this.setId(Integer.parseInt(ptfStatus.getObjectId().toString()));
		this.setNameShort(ptfStatus.getNameShort());
		this.setName(ptfStatus.getName());
		this.setDescription(ptfStatus.getDescription());
	}

	public PlatformStatusEntity ( long id, String nameshort, String name, String description ){	
		this.setId(id);
		this.setNameShort(nameshort);
		this.setName(name);
		this.setDescription(description);
	}

	
	@XmlAttribute
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@XmlElement
	public String getNameShort() {
		return NameShort;
	}

	public void setNameShort(String nameShort) {
		NameShort = nameShort;
	}
	@XmlElement
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}

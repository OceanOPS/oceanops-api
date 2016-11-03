package org.jcommops.api.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={ "name", "nameShort","description"})
public class Network {
	private long Id;
	private String NameShort;
	private String Name;
	private String description;
	
	
	public Network (){	
	}

	public Network ( long id, String nameshort, String name, String description ){	
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

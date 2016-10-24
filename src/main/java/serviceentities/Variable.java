package serviceentities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder={ "name", "nameShort", "description"})
public class Variable {
	private long Id;
	private String Name;
	private String NameShort;
	private String Description;

	
	
	public Variable() {
		
	}

	public Variable ( long id, String name, String nameshort, String description ){	
	this.setId(id);
	this.setName(name);
	this.setNameShort(nameshort);
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
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@XmlElement
	public String getNameShort() {
		return NameShort;
	}

	public void setNameShort(String nameShort) {
		NameShort = nameShort;
	}

	@XmlElement
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}


	
	

}

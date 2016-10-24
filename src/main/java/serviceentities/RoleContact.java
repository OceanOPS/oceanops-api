package serviceentities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={ "name", "nameShort"})
public class RoleContact {
	private long Id;
	private String Name;
	private String NameShort;

	
	
	public RoleContact() {
		
	}

	public RoleContact ( long id, String name, String nameshort){	
	this.setId(id);
	this.setName(name);
	this.setNameShort(nameshort);
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



}

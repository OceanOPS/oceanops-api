package serviceentities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={ "name", "nameShort"})
public class MasterProgram {
	@XmlAttribute
	private long Id;
	
	private String Name;
	private String NameShort;

	
	
	public MasterProgram() {
		
	}

	public MasterProgram ( long id, String name, String nameshort){	
	this.setId(id);
	this.setName(name);
	this.setNameShort(nameshort);
	}

//	public long getId() {
//		return Id;
//	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNameShort() {
		return NameShort;
	}

	public void setNameShort(String nameShort) {
		NameShort = nameShort;
	}

	


	
	

}

package serviceentities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={ "name", "description", "active", "agency"})
public class ProgramPtf {
	@XmlAttribute
	private long Id;
	
	private String Name;
	private String Description;
	private int Active;
	private ArrayList<AgencyPrg> Agency;
	
	
	public ProgramPtf() {
		
	}

	public ProgramPtf ( long id, String name, String description, int active, ArrayList<AgencyPrg> agency ){	
	this.setId(id);
	this.setName(name);
	this.setDescription(description);
	this.setActive(active);
	this.setAgency(agency);


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

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getActive() {
		return Active;
	}

	public void setActive(int active) {
		Active = active;
	}

	public ArrayList<AgencyPrg> getAgency() {
		return Agency;
	}

	public void setAgency(ArrayList<AgencyPrg> agency) {
		Agency = agency;
	}
	
	

}

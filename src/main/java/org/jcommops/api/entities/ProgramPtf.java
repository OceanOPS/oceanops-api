package org.jcommops.api.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={ "name", "nameShort", "description", "active", "agencies"})

public class ProgramPtf  {

	private long Id;
    private String Name;
	private String NameShort;
    private String Description;
    private int Active;
    private ArrayList<AgencyPrg> agencies;


    public ProgramPtf() {

    }

    public ProgramPtf ( long id, String name, String nameshort, String description, int active, ArrayList<AgencyPrg> agencies ){
    this.setId(id);
    this.setName(name);
	this.setNameShort(nameshort);
    this.setDescription(description);
    this.setActive(active);
    this.setAgencies(agencies);


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
    @XmlElement
    public int getActive() {
        return Active;
    }

    public void setActive(int active) {
        Active = active;
    }

    
    @XmlElementWrapper(name="agencies")
    @XmlElements(@XmlElement(name="agency",type=AgencyPrg.class))
    public ArrayList<AgencyPrg> getAgencies() {
        return agencies;
    }

    public void setAgencies(ArrayList<AgencyPrg> agencies) {
        this.agencies = agencies;
    }



} 
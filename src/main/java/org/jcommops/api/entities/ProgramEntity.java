package org.jcommops.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.Role;


@XmlRootElement
public class ProgramEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4782778949366043382L;
	private Integer id;
	private String name;
	private String nameShort;
    private String description;
    private MasterProgramEntity masterProgram;
    private List<AgencyEntity> agencies;
    private List<ContactEntity> contacts;
    private CountryEntity country;

	public ProgramEntity() {

    }
    
    public ProgramEntity(org.jcommops.api.orm.Program program) {
    	this.setId(Integer.parseInt(program.getObjectId().getIdSnapshot().get("ID").toString()));
    	this.setName(program.getName());
    	this.setNameShort(program.getNameShort());
    	this.setDescription(program.getDescription());
    	this.setMasterProgram(new MasterProgramEntity(program.getToMasterProg()));
    	this.agencies = new ArrayList<AgencyEntity>();
    	for(int i = 0; i<program.getToAgencies().size();i++){
    		this.agencies.add(new AgencyEntity(program.getToAgencies().get(i)));
    	}
    	this.contacts = new ArrayList<ContactEntity>();
    	
    	ArrayList<Integer> alreadyAddedContacts = new ArrayList<Integer>();
    	for(int i = 0; i<program.getProgramContactArray().size();i++){
    		if(!alreadyAddedContacts.contains(program.getProgramContactArray().get(i).getContactId())){
    			alreadyAddedContacts.add(program.getProgramContactArray().get(i).getContactId());
    			
    			ArrayList<Role> roles = new ArrayList<>();
    			for(int j = 0; j<program.getProgramContactArray().size();j++){
    				if(program.getProgramContactArray().get(i).getContactId() == program.getProgramContactArray().get(j).getContactId()){
    					roles.add(program.getProgramContactArray().get(j).getToRole());
    				}
    			}
        		this.contacts.add(new ContactEntity(program.getProgramContactArray().get(i).getToContact(), roles));
    		}
    	}
    	if(program.getToCountry() != null)
    		this.setCountry(new CountryEntity(program.getToCountry()));
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
	
    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @XmlElementWrapper(name="agencies")
    @XmlElements(@XmlElement(name="agency",type=AgencyEntity.class))
    public List<AgencyEntity> getAgencies() {
        return agencies;
    }

    public void setAgencies(ArrayList<AgencyEntity> agencies) {
        this.agencies = agencies;
    }

    @XmlElement
	public MasterProgramEntity getMasterProgram() {
		return masterProgram;
	}

	public void setMasterProgram(MasterProgramEntity masterProgram) {
		this.masterProgram = masterProgram;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

	@XmlAttribute
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElementWrapper(name = "contacts")
	@XmlElements(@XmlElement(name = "contact", type = ContactEntity.class))
	public List<ContactEntity> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactEntity> contacts) {
		this.contacts = contacts;
	}

} 
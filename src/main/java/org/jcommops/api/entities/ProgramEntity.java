package org.jcommops.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
    private ArrayList<AgencyEntity> agencies;
    private HashMap<String, ContactEntity> contactsRoles;
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
    	this.contactsRoles = new HashMap<String, ContactEntity>();
    	for(int i = 0; i<program.getProgramContactArray().size();i++){
    		this.contactsRoles.put(program.getProgramContactArray().get(i).getToRole().getName(), new ContactEntity(program.getProgramContactArray().get(i).getToContact()));
    	}
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
    public ArrayList<AgencyEntity> getAgencies() {
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


	@XmlElementWrapper(name="contacts")
    @XmlElements({@XmlElement(name="role",type=String.class), @XmlElement(name="contact",type=ContactEntity.class)})
    public HashMap<String, ContactEntity> getContactsRoles() {
		return contactsRoles;
	}

	public void setContactsRoles(HashMap<String, ContactEntity> contactsRoles) {
		this.contactsRoles = contactsRoles;
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

} 
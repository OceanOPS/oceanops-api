package org.oceanops.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Role;


@XmlRootElement
public class ContactEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6682353819380254426L;
	private Integer id;
	private String firstName;
    private String lastName;
    private String email;
    private AgencyEntity agency;
    private List<RoleEntity> roles;


    public ContactEntity() {
    	
    }
    public ContactEntity(Contact contact) {
    	this.setId(Integer.parseInt(contact.getObjectId().getIdSnapshot().get("ID").toString()));
    	this.setEmail(contact.getEmail());
    	this.setFirstName(contact.getFirstName());
    	this.setLastName(contact.getLastName());
    	if(contact.getAgency() != null)
    		this.setAgency(new AgencyEntity(contact.getAgency()));
    }
    

    public ContactEntity(Contact contact, List<Role> roles) {
    	this(contact);
    	this.setRoles(new ArrayList<RoleEntity>());
    	for(Role role: roles){
    		this.getRoles().add(new RoleEntity(role));
    	}
    }

    @XmlElement
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this. email = email;
	}
	
	@XmlAttribute
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@XmlElement
	public AgencyEntity getAgency() {
		return agency;
	}
	public void setAgency(AgencyEntity agency) {
		this.agency = agency;
	}
	
	@XmlElementWrapper(name = "roles")
	@XmlElements(@XmlElement(name = "role", type = RoleEntity.class))
	public List<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
} 
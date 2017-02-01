package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jcommops.api.orm.Contact;


@XmlRootElement
public class ContactEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6682353819380254426L;
	private String firstName;
    private String lastName;
    private String email;


    public ContactEntity() {

    }
    public ContactEntity(Contact contact) {
    	this.setEmail(contact.getEmail());
    	this.setFirstName(contact.getFirstName());
    	this.setLastName(contact.getLastName());
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
} 
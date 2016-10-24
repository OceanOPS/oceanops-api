package serviceentities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder={ "firstName", "lastName", "email", "agencies", "roles"})

public class ContactPrg {
    private long Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private ArrayList<AgencyPrg> agencies;
    private ArrayList<RoleContact> roles;


    public ContactPrg() {

    }

    public ContactPrg ( long id, String lastname, String firstname, String email, ArrayList<AgencyPrg> agencies, ArrayList<RoleContact> roles ){
    this.setId(id);
    this.setLastName(lastname);
    this.setFirstName(firstname);
    this.setEmail(email);
    this.setAgencies(agencies);
    this.setRoles(roles);


    }


	@XmlAttribute
    public long getId() {
        return Id;
   }

    public void setId(long id) {
        Id = id;
    }
    
    @XmlElement
    public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	@XmlElement
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@XmlElement
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@XmlElementWrapper(name="agencies")
	@XmlElements(@XmlElement(name="agency",type=AgencyPrg.class))
    public ArrayList<AgencyPrg> getAgencies() {
        return agencies;
    }

    public void setAgencies(ArrayList<AgencyPrg> agencies) {
        this.agencies = agencies;
    }

    @XmlElementWrapper(name="roles")
	@XmlElements(@XmlElement(name="role",type=RoleContact.class))
    public ArrayList<RoleContact> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<RoleContact> roles) {
        this.roles = roles;
    }



} 
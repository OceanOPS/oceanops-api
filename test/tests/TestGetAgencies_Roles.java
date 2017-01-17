package tests;

import java.util.ArrayList;

import org.apache.cayenne.Cayenne;
import org.jcommops.api.accessors.MethodsAssociativeTables;
import org.jcommops.api.entities.ContactEntity;

public class TestGetAgencies_Roles {
	public static void main(String[] args) {
	MethodsAssociativeTables MAT = new MethodsAssociativeTables();
	ArrayList<ContactEntity> contacts = new ArrayList<ContactEntity>();
	long id_contact=11432;
	contacts= MAT.FindProgramContacts(5314);
	long id_agency= contacts.get(0).getAgencies().get(0).getId();
	long id_role=contacts.get(0).getRoles().get(0).getId();
	
	System.out.println("contact: "+id_contact+ ", role: "+id_role);
//	System.out.println("contact: "+id_contact+ ", agence:  " +id_agency+  ", role: "+id_role);
	}
	}



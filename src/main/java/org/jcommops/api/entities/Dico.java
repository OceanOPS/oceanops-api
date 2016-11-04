package org.jcommops.api.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "error_message", "families" })
//, "variables"
public class Dico {
	private ArrayList<PlatformFamily> families;
//	private ArrayList<Variable> variables;
	private String error_message;

	public Dico() {

	}

	public Dico(ArrayList<PlatformFamily> families, ArrayList<Variable> variables, String error_message) {
		this.setPtfFamily(families);
//		this.setVariables(variables);
		this.setError_message(error_message);

	}

	
	@XmlElementWrapper(name = "families")
	@XmlElements(@XmlElement(name = "ptfFamily", type = PlatformFamily.class))
	public ArrayList<PlatformFamily> getPtfFamily() {
		return families;
	}

	public void setPtfFamily(ArrayList<PlatformFamily> families) {
		this.families = families;
	}
	
	/**
	@XmlElementWrapper(name = "variables")
	@XmlElements(@XmlElement(name = "variable", type = Variable.class))
	public ArrayList<Variable> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<Variable> variables) {
		this.variables = variables;
	}
**/
	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	


}

package serviceentities;


import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder={"error_message","jcommpsRef", "ptfFamily", "ptfType", "ptfModel", "ptfStatus",  "deployement", "endingDate", "lastLocation","program", "country", "masterProgramme", "contacts", "variables"})


	public class Platform {

	private long Id;
	private String JcommpsRef;
	private PlatformStatus PtfStatus;
	private PlatformFamily PtfFamily;
	private PlatformModel PtfModel;
	private PlatformType PtfType;
	private PlatformDeploy Deployement;
	private PlatformLastLoc LastLocation;
	private Date EndingDate;
	private ProgramPtf Program;
	private CountryPtf Country;
	private MasterProgram MasterProgramme;
	private ArrayList<ContactPrg> contacts;
	private ArrayList<Variable> variables;
	private String error_message;

	public Platform (){	
	}

	public Platform ( long id, String ref, PlatformStatus ptfstatus, PlatformFamily ptffamily, PlatformModel ptfmodel, PlatformType ptftype,PlatformDeploy ptfdpl, 
			Date endingdate, PlatformLastLoc ptfll, ProgramPtf prgm, CountryPtf cntr, MasterProgram mstrprgm, ArrayList<ContactPrg> contacts, ArrayList<Variable> variables,
			String error_message){	
		this.setId(id);
		this.setJcommpsRef(ref);
		this.setPtfStatus (ptfstatus);
		this.setPtfFamily (ptffamily);
		this.setPtfModel (ptfmodel);
		this.setPtfType (ptftype);
		this.setDeployement (ptfdpl);
		this.setEndingDate(endingdate);
		this.setLastLocation(ptfll);
		this.setProgram(prgm);
		this.setCountry(cntr);
		this.setMasterProgramme(mstrprgm);
		this.setContacts(contacts);
		this.setVariables(variables);
		this.setError_message(error_message);
		
	}

	@XmlAttribute //@XmlAttribute to bring  "id =XXXX" to the beacon
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@XmlElement
	public String getJcommpsRef() {
		return JcommpsRef;
	}

	public void setJcommpsRef(String jcommpsRef) {
		JcommpsRef = jcommpsRef;
	}

	@XmlElement
	public PlatformStatus getPtfStatus() {
		return PtfStatus;
	}

	public void setPtfStatus(PlatformStatus ptfStatus) {
		PtfStatus = ptfStatus;
	}

	@XmlElement
	public PlatformFamily getPtfFamily() {
		return PtfFamily;
	}

	public void setPtfFamily(PlatformFamily ptfFamily) {
		PtfFamily = ptfFamily;
	}

	@XmlElement
	public PlatformModel getPtfModel() {
		return PtfModel;
	}

	public void setPtfModel(PlatformModel ptfModel) {
		PtfModel = ptfModel;
	}

	@XmlElement
	public PlatformType getPtfType() {
		return PtfType;
	}

	public void setPtfType(PlatformType ptfType) {
		PtfType = ptfType;
	}

	@XmlElement
	public PlatformDeploy getDeployement() {
		return Deployement;	}

	public void setDeployement(PlatformDeploy deployement) {
		Deployement = deployement;
	}
	
	@XmlElement
	public Date getEndingDate() {
		return EndingDate;
	}

	public void setEndingDate(Date endingDate) {
		EndingDate = endingDate;
	}

	@XmlElement
	public PlatformLastLoc getLastLocation() {
		return LastLocation;
	}

	public void setLastLocation(PlatformLastLoc lastLocation) {
		LastLocation = lastLocation;
	}
	
	@XmlElement
	public ProgramPtf getProgram() {
		return Program;
	}

	public void setProgram(ProgramPtf program) {
		Program = program;
	}

	@XmlElement
	public CountryPtf getCountry() {
		return Country;
	}

	public void setCountry(CountryPtf country) {
		Country = country;
	}

	@XmlElement
	public MasterProgram getMasterProgramme() {
		return MasterProgramme;
	}

	public void setMasterProgramme(MasterProgram masterProgramme) {
		MasterProgramme = masterProgramme;
	}

    @XmlElementWrapper(name="contacts")
	@XmlElements(@XmlElement(name="contact",type=ContactPrg.class))
    public ArrayList<ContactPrg> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<ContactPrg> contacts) {
        this.contacts = contacts;
    }
    
    @XmlElementWrapper(name="variables")
	@XmlElements(@XmlElement(name="variable",type=Variable.class))
    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    
	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}



}

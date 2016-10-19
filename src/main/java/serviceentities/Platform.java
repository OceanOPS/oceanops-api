package serviceentities;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder={"jcommpsRef", "ptfFamily", "ptfType", "ptfModel", "ptfStatus",  "deployement","lastLocation","program", "country", "masterProgramme"})

public class Platform {
	@XmlAttribute
	private long Id;//@XmlAttribute to bring  "id =XXXX" to the beacon
	
	private String JcommpsRef;
	private PlatformStatus PtfStatus;
	private PlatformFamily PtfFamily;
	private PlatformModel PtfModel;
	private PlatformType PtfType;
	private PlatformDeploy Deployement;
	private PlatformLastLoc LastLocation;
	private ProgramPtf Program;
	private CountryPtf Country;
	private MasterProgram MasterProgramme;
	
	public Platform (){	
	}

	public Platform ( long id, String ref, PlatformStatus ptfstatus, PlatformFamily ptffamily, PlatformModel ptfmodel, PlatformType ptftype,
			PlatformDeploy ptfdpl, PlatformLastLoc ptfll, ProgramPtf prgm, CountryPtf cntr, MasterProgram mstrprgm){	
		this.setId(id);
		this.setJcommpsRef(ref);
		this.setPtfStatus (ptfstatus);
		this.setPtfFamily (ptffamily);
		this.setPtfModel (ptfmodel);
		this.setPtfType (ptftype);
		this.setDeployement (ptfdpl);
		this.setLastLocation(ptfll);
		this.setProgram(prgm);
		this.setCountry(cntr);
		this.setMasterProgramme(mstrprgm);
		
	}
//to bring  "id =XXXX" to the beacon
/**	public long getId() {
		return Id;
	}**/

	public void setId(long id) {
		Id = id;
	}

	public String getJcommpsRef() {
		return JcommpsRef;
	}

	public void setJcommpsRef(String jcommpsRef) {
		JcommpsRef = jcommpsRef;
	}

	public PlatformStatus getPtfStatus() {
		return PtfStatus;
	}

	public void setPtfStatus(PlatformStatus ptfStatus) {
		PtfStatus = ptfStatus;
	}

	public PlatformFamily getPtfFamily() {
		return PtfFamily;
	}

	public void setPtfFamily(PlatformFamily ptfFamily) {
		PtfFamily = ptfFamily;
	}

	public PlatformModel getPtfModel() {
		return PtfModel;
	}

	public void setPtfModel(PlatformModel ptfModel) {
		PtfModel = ptfModel;
	}

	public PlatformType getPtfType() {
		return PtfType;
	}

	public void setPtfType(PlatformType ptfType) {
		PtfType = ptfType;
	}

	public PlatformDeploy getDeployement() {
		return Deployement;	}

	public void setDeployement(PlatformDeploy deployement) {
		Deployement = deployement;
	}

	public PlatformLastLoc getLastLocation() {
		return LastLocation;
	}

	public void setLastLocation(PlatformLastLoc lastLocation) {
		LastLocation = lastLocation;
	}

	public ProgramPtf getProgram() {
		return Program;
	}

	public void setProgram(ProgramPtf program) {
		Program = program;
	}

	public CountryPtf getCountry() {
		return Country;
	}

	public void setCountry(CountryPtf country) {
		Country = country;
	}

	public MasterProgram getMasterProgramme() {
		return MasterProgramme;
	}

	public void setMasterProgramme(MasterProgram masterProgramme) {
		MasterProgramme = masterProgramme;
	}

	


}

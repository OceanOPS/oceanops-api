package serviceentities;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.cayenne.Cayenne;

import jcommops.db.orm.rest.Ptf;
import jcommops.db.orm.rest.PtfStatus;


@XmlRootElement
public class Platform {
	private long Id;
	private String JcommpsRef;
	private PlatformStatus Ptfstatus;
	private PlatformFamily Ptffamily;
	private PlatformModel Ptfmodel;
	private PlatformType Ptftype;
	private PlatformDeploy Ptfdpl;
	private PlatformLastLoc Ptfll;
	
	public Platform (){	
	}

	public Platform ( long id, String ref, PlatformStatus ptfstatus, PlatformFamily ptffamily, PlatformModel ptfmodel, PlatformType ptftype, PlatformDeploy ptfdpl, PlatformLastLoc ptfll){	
		this.setId(id);
		this.setJcommpsRef(ref);
		this.setPtfstatus (ptfstatus);
		this.setPtffamily (ptffamily);
		this.setPtfmodel (ptfmodel);
		this.setPtftype (ptftype);
		this.setPtfll (ptfll);
		this.setPtfdpl(ptfdpl);
		
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getJcommpsRef() {
		return JcommpsRef;
	}

	public void setJcommpsRef(String jcommpsRef) {
		JcommpsRef = jcommpsRef;
	}

	public PlatformStatus getPtfstatus() {
		return Ptfstatus;
	}

	public void setPtfstatus(PlatformStatus ptfstatus) {
		Ptfstatus = ptfstatus;
	}

	public PlatformFamily getPtffamily() {
		return Ptffamily;
	}

	public void setPtffamily(PlatformFamily ptffamily) {
		Ptffamily = ptffamily;
	}

	public PlatformModel getPtfmodel() {
		return Ptfmodel;
	}

	public void setPtfmodel(PlatformModel ptfmodel) {
		Ptfmodel = ptfmodel;
	}

	public PlatformType getPtftype() {
		return Ptftype;
	}

	public void setPtftype(PlatformType ptftype) {
		Ptftype = ptftype;
	}

	public PlatformDeploy getPtfdpl() {
		return Ptfdpl;
	}

	public void setPtfdpl(PlatformDeploy ptfdpl) {
		Ptfdpl = ptfdpl;
	}

	public PlatformLastLoc getPtfll() {
		return Ptfll;
	}

	public void setPtfll(PlatformLastLoc ptfll) {
		Ptfll = ptfll;
	}


}

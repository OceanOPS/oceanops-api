package serviceentities;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PlatformDeploy {
	@XmlAttribute
	private long Id;
	private Date DeployementDate;

	
	
	public PlatformDeploy (){	
	}

	public PlatformDeploy ( long id, Date dpldate ){	
		this.setDeployementDate(dpldate);
		this.setId(id);

	}

//	public long getId() {
//		return Id;
//	}

	public void setId(long id) {
		Id = id;
	}

	public Date getDeployementDate() {
		return DeployementDate;
	}

	public void setDeployementDate(Date deployementDate) {
		DeployementDate = deployementDate;
	}
	

}

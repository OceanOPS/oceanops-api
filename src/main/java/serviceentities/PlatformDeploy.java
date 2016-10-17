package serviceentities;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PlatformDeploy {
	private Date DeployementDate;

	
	
	public PlatformDeploy (){	
	}

	public PlatformDeploy ( Date dpldate ){	
		this.setDeployementDate(dpldate);

	}

	public Date getDeployementDate() {
		return DeployementDate;
	}

	public void setDeployementDate(Date deployementDate) {
		DeployementDate = deployementDate;
	}
	

}

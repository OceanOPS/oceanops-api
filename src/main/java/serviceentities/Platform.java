package serviceentities;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.cayenne.Cayenne;

import jcommops.db.orm.rest.Ptf;


@XmlRootElement
public class Platform {


	private long Id;
	
	
	public Platform (){	
	}

	public Platform (long id){	
		this.setId(id);
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	
//	public long getId(Ptf ptf) {
//		Id=Cayenne.longPKForObject(ptf);
//		return Id;	
//	}
//	
	
}

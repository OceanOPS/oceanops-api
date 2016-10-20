package serviceentities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PlatformStatus {
		
		private long Id;
		private String Status;
		
		
		public PlatformStatus (){	
		}

		public PlatformStatus ( long id, String status ){	
			this.setId(id);
			this.setStatus(status);
		}
		
		@XmlAttribute
		public long getId() {
		 return Id;
		}

		public void setId(long l) {
			Id = l;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}
	
	}




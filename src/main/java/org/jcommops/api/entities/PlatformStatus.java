package org.jcommops.api.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;


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

		@XmlElement
		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}
	
	}




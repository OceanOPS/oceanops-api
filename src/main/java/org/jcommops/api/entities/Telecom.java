package org.jcommops.api.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Telecom {
	private long Id;
	private String TelecomType;

	public Telecom() {
	}

	public Telecom(long id, String telectype) {
		this.setTelecomType(telectype);
		this.setId(id);

	}

	@XmlAttribute
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@XmlElement
	public String getTelecomType() {
		return TelecomType;
	}

	public void setTelecomType(String telecomType) {
		TelecomType = telecomType;
	}

}

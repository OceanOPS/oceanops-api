package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TelecomEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -387475111315457968L;
	private String telecomNum;
	private String telecomType;

	public TelecomEntity() {
	}
	
	public TelecomEntity(org.jcommops.api.orm.Telecom tel) {
		this.setTelecomNum(tel.getNum());
		this.setTelecomType(tel.getTelecomType().getName());
	}

	@XmlElement
	public String getTelecomType() {
		return telecomType;
	}

	public void setTelecomType(String telecomType) {
		this.telecomType = telecomType;
	}
	
	@XmlElement
	public String getTelecomNum() {
		return telecomNum;
	}

	public void setTelecomNum(String telecomNum) {
		this.telecomNum = telecomNum;
	}

}

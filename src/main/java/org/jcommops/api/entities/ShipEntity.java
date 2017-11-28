package org.jcommops.api.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.jcommops.api.Utils;
import org.jcommops.api.orm.Ship;

@XmlRootElement
public class ShipEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5261718439815352297L;
	private String ref;
	private String name;
	private String shipType;
	private String commissionedDate;
	private String decommissionedDate;
	private CountryEntity country;
	private String imo;
	private String callSign;

	public ShipEntity() {
	}
	
	public ShipEntity(Ship ship) {
		this.setCallSign(ship.getCallSign());
		this.setCommissionedDate(Utils.GetIsoDate(ship.getCommissionedDate()));
		if(ship.getCountry() != null)
			this.setCountry(new CountryEntity(ship.getCountry()));
		this.setDecommissionedDate(Utils.GetIsoDate(ship.getDecommissionedDate()));
		this.setImo(ship.getImo());
		this.setName(ship.getName());
		this.setRef(ship.getRef());
		if(ship.getShipType() != null)
			this.setShipType(ship.getShipType().getName());
	}
	
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShipType() {
		return shipType;
	}
	public void setShipType(String shipType) {
		this.shipType = shipType;
	}
	public String getCommissionedDate() {
		return commissionedDate;
	}
	public void setCommissionedDate(String commissionedDate) {
		this.commissionedDate = commissionedDate;
	}
	public String getDecommissionedDate() {
		return decommissionedDate;
	}
	public void setDecommissionedDate(String decommissionedDate) {
		this.decommissionedDate = decommissionedDate;
	}
	public CountryEntity getCountry() {
		return country;
	}
	public void setCountry(CountryEntity country) {
		this.country = country;
	}
	public String getImo() {
		return imo;
	}
	public void setImo(String imo) {
		this.imo = imo;
	}
	public String getCallSign() {
		return callSign;
	}
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}
	
}

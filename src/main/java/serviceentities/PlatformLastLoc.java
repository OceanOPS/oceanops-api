package serviceentities;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"lastLocationDate", "lat", "lon"})
public class PlatformLastLoc {
	@XmlAttribute
	private long Id;
	
	private Date LastLocationDate;
	private BigDecimal Lat;
	private BigDecimal Lon;

	
	
	

	public PlatformLastLoc ( long id, Date locdate, BigDecimal lat, BigDecimal lon ){	
		this.setId(id);
		this.setLastLocationDate(locdate);
		this.setLat(lat);
		this.setLon(lon);

	}

//	public long getId() {
//		return Id;
//	}

	public void setId(long iD) {
		Id = iD;
	}


	public Date getLastLocationDate() {
		return LastLocationDate;
	}

	public void setLastLocationDate(Date dateOfLastLocation) {
		LastLocationDate = dateOfLastLocation;
	}

	public BigDecimal getLat() {
		return Lat;
	}

	public void setLat(BigDecimal lat) {
		Lat = lat;
	}

	public BigDecimal getLon() {
		return Lon;
	}

	public void setLon(BigDecimal lon) {
		Lon = lon;
	}

	public PlatformLastLoc (){	
	}

}

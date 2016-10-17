package serviceentities;

import java.math.BigDecimal;
import java.util.Date;

public class PlatformLastLoc {
	private long Id;
	private Date DateOfLastLocation;
	private BigDecimal Lat;
	private BigDecimal Lon;

	
	
	

	public PlatformLastLoc ( long id, Date locdate, BigDecimal lat, BigDecimal lon ){	
		this.setID(id);
		this.setDateOfLastLocation(locdate);
		this.setLat(lat);
		this.setLon(lon);

	}

	public long getID() {
		return Id;
	}

	public void setID(long iD) {
		Id = iD;
	}


	public Date getDateOfLastLocation() {
		return DateOfLastLocation;
	}

	public void setDateOfLastLocation(Date dateOfLastLocation) {
		DateOfLastLocation = dateOfLastLocation;
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

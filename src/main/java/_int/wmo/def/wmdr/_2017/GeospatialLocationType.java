
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.GeometryPropertyType;
import net.opengis.gml.v_3_2_1.ReferenceType;
import net.opengis.gml.v_3_2_1.TimePeriodPropertyType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for GeospatialLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeospatialLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoLocation" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/&gt;
 *         &lt;element name="geopositioningMethod" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeospatialLocationType", propOrder = {
    "geoLocation",
    "geopositioningMethod",
    "validPeriod"
})
public class GeospatialLocationType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected GeometryPropertyType geoLocation;
    protected ReferenceType geopositioningMethod;
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setGeoLocation(GeometryPropertyType value) {
        this.geoLocation = value;
    }

    public boolean isSetGeoLocation() {
        return (this.geoLocation!= null);
    }

    /**
     * Gets the value of the geopositioningMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGeopositioningMethod() {
        return geopositioningMethod;
    }

    /**
     * Sets the value of the geopositioningMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGeopositioningMethod(ReferenceType value) {
        this.geopositioningMethod = value;
    }

    public boolean isSetGeopositioningMethod() {
        return (this.geopositioningMethod!= null);
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setValidPeriod(TimePeriodPropertyType value) {
        this.validPeriod = value;
    }

    public boolean isSetValidPeriod() {
        return (this.validPeriod!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            GeometryPropertyType theGeoLocation;
            theGeoLocation = this.getGeoLocation();
            strategy.appendField(locator, this, "geoLocation", buffer, theGeoLocation, this.isSetGeoLocation());
        }
        {
            ReferenceType theGeopositioningMethod;
            theGeopositioningMethod = this.getGeopositioningMethod();
            strategy.appendField(locator, this, "geopositioningMethod", buffer, theGeopositioningMethod, this.isSetGeopositioningMethod());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            strategy.appendField(locator, this, "validPeriod", buffer, theValidPeriod, this.isSetValidPeriod());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeospatialLocationType that = ((GeospatialLocationType) object);
        {
            GeometryPropertyType lhsGeoLocation;
            lhsGeoLocation = this.getGeoLocation();
            GeometryPropertyType rhsGeoLocation;
            rhsGeoLocation = that.getGeoLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoLocation", lhsGeoLocation), LocatorUtils.property(thatLocator, "geoLocation", rhsGeoLocation), lhsGeoLocation, rhsGeoLocation, this.isSetGeoLocation(), that.isSetGeoLocation())) {
                return false;
            }
        }
        {
            ReferenceType lhsGeopositioningMethod;
            lhsGeopositioningMethod = this.getGeopositioningMethod();
            ReferenceType rhsGeopositioningMethod;
            rhsGeopositioningMethod = that.getGeopositioningMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geopositioningMethod", lhsGeopositioningMethod), LocatorUtils.property(thatLocator, "geopositioningMethod", rhsGeopositioningMethod), lhsGeopositioningMethod, rhsGeopositioningMethod, this.isSetGeopositioningMethod(), that.isSetGeopositioningMethod())) {
                return false;
            }
        }
        {
            TimePeriodPropertyType lhsValidPeriod;
            lhsValidPeriod = this.getValidPeriod();
            TimePeriodPropertyType rhsValidPeriod;
            rhsValidPeriod = that.getValidPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validPeriod", lhsValidPeriod), LocatorUtils.property(thatLocator, "validPeriod", rhsValidPeriod), lhsValidPeriod, rhsValidPeriod, this.isSetValidPeriod(), that.isSetValidPeriod())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            GeometryPropertyType theGeoLocation;
            theGeoLocation = this.getGeoLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geoLocation", theGeoLocation), currentHashCode, theGeoLocation, this.isSetGeoLocation());
        }
        {
            ReferenceType theGeopositioningMethod;
            theGeopositioningMethod = this.getGeopositioningMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geopositioningMethod", theGeopositioningMethod), currentHashCode, theGeopositioningMethod, this.isSetGeopositioningMethod());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeospatialLocationType) {
            final GeospatialLocationType copy = ((GeospatialLocationType) draftCopy);
            {
                Boolean geoLocationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeoLocation());
                if (geoLocationShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeometryPropertyType sourceGeoLocation;
                    sourceGeoLocation = this.getGeoLocation();
                    GeometryPropertyType copyGeoLocation = ((GeometryPropertyType) strategy.copy(LocatorUtils.property(locator, "geoLocation", sourceGeoLocation), sourceGeoLocation, this.isSetGeoLocation()));
                    copy.setGeoLocation(copyGeoLocation);
                } else {
                    if (geoLocationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoLocation = null;
                    }
                }
            }
            {
                Boolean geopositioningMethodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeopositioningMethod());
                if (geopositioningMethodShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceGeopositioningMethod;
                    sourceGeopositioningMethod = this.getGeopositioningMethod();
                    ReferenceType copyGeopositioningMethod = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "geopositioningMethod", sourceGeopositioningMethod), sourceGeopositioningMethod, this.isSetGeopositioningMethod()));
                    copy.setGeopositioningMethod(copyGeopositioningMethod);
                } else {
                    if (geopositioningMethodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geopositioningMethod = null;
                    }
                }
            }
            {
                Boolean validPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetValidPeriod());
                if (validPeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodPropertyType sourceValidPeriod;
                    sourceValidPeriod = this.getValidPeriod();
                    TimePeriodPropertyType copyValidPeriod = ((TimePeriodPropertyType) strategy.copy(LocatorUtils.property(locator, "validPeriod", sourceValidPeriod), sourceValidPeriod, this.isSetValidPeriod()));
                    copy.setValidPeriod(copyValidPeriod);
                } else {
                    if (validPeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validPeriod = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeospatialLocationType();
    }

}

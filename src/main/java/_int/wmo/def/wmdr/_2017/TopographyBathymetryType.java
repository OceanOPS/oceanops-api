
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.ReferenceType;
import net.opengis.gml.v_3_2.TimePeriodPropertyType;
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
 * <p>Java class for TopographyBathymetryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopographyBathymetryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localTopography" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="relativeElevation" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="topographicContext" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="altitudeOrDepth" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "TopographyBathymetryType", propOrder = {
    "localTopography",
    "relativeElevation",
    "topographicContext",
    "altitudeOrDepth",
    "validPeriod"
})
public class TopographyBathymetryType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected ReferenceType localTopography;
    protected ReferenceType relativeElevation;
    protected ReferenceType topographicContext;
    protected ReferenceType altitudeOrDepth;
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the localTopography property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocalTopography() {
        return localTopography;
    }

    /**
     * Sets the value of the localTopography property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLocalTopography(ReferenceType value) {
        this.localTopography = value;
    }

    public boolean isSetLocalTopography() {
        return (this.localTopography!= null);
    }

    /**
     * Gets the value of the relativeElevation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRelativeElevation() {
        return relativeElevation;
    }

    /**
     * Sets the value of the relativeElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRelativeElevation(ReferenceType value) {
        this.relativeElevation = value;
    }

    public boolean isSetRelativeElevation() {
        return (this.relativeElevation!= null);
    }

    /**
     * Gets the value of the topographicContext property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTopographicContext() {
        return topographicContext;
    }

    /**
     * Sets the value of the topographicContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTopographicContext(ReferenceType value) {
        this.topographicContext = value;
    }

    public boolean isSetTopographicContext() {
        return (this.topographicContext!= null);
    }

    /**
     * Gets the value of the altitudeOrDepth property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAltitudeOrDepth() {
        return altitudeOrDepth;
    }

    /**
     * Sets the value of the altitudeOrDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAltitudeOrDepth(ReferenceType value) {
        this.altitudeOrDepth = value;
    }

    public boolean isSetAltitudeOrDepth() {
        return (this.altitudeOrDepth!= null);
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
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
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
            ReferenceType theLocalTopography;
            theLocalTopography = this.getLocalTopography();
            strategy.appendField(locator, this, "localTopography", buffer, theLocalTopography, this.isSetLocalTopography());
        }
        {
            ReferenceType theRelativeElevation;
            theRelativeElevation = this.getRelativeElevation();
            strategy.appendField(locator, this, "relativeElevation", buffer, theRelativeElevation, this.isSetRelativeElevation());
        }
        {
            ReferenceType theTopographicContext;
            theTopographicContext = this.getTopographicContext();
            strategy.appendField(locator, this, "topographicContext", buffer, theTopographicContext, this.isSetTopographicContext());
        }
        {
            ReferenceType theAltitudeOrDepth;
            theAltitudeOrDepth = this.getAltitudeOrDepth();
            strategy.appendField(locator, this, "altitudeOrDepth", buffer, theAltitudeOrDepth, this.isSetAltitudeOrDepth());
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
        final TopographyBathymetryType that = ((TopographyBathymetryType) object);
        {
            ReferenceType lhsLocalTopography;
            lhsLocalTopography = this.getLocalTopography();
            ReferenceType rhsLocalTopography;
            rhsLocalTopography = that.getLocalTopography();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localTopography", lhsLocalTopography), LocatorUtils.property(thatLocator, "localTopography", rhsLocalTopography), lhsLocalTopography, rhsLocalTopography, this.isSetLocalTopography(), that.isSetLocalTopography())) {
                return false;
            }
        }
        {
            ReferenceType lhsRelativeElevation;
            lhsRelativeElevation = this.getRelativeElevation();
            ReferenceType rhsRelativeElevation;
            rhsRelativeElevation = that.getRelativeElevation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relativeElevation", lhsRelativeElevation), LocatorUtils.property(thatLocator, "relativeElevation", rhsRelativeElevation), lhsRelativeElevation, rhsRelativeElevation, this.isSetRelativeElevation(), that.isSetRelativeElevation())) {
                return false;
            }
        }
        {
            ReferenceType lhsTopographicContext;
            lhsTopographicContext = this.getTopographicContext();
            ReferenceType rhsTopographicContext;
            rhsTopographicContext = that.getTopographicContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topographicContext", lhsTopographicContext), LocatorUtils.property(thatLocator, "topographicContext", rhsTopographicContext), lhsTopographicContext, rhsTopographicContext, this.isSetTopographicContext(), that.isSetTopographicContext())) {
                return false;
            }
        }
        {
            ReferenceType lhsAltitudeOrDepth;
            lhsAltitudeOrDepth = this.getAltitudeOrDepth();
            ReferenceType rhsAltitudeOrDepth;
            rhsAltitudeOrDepth = that.getAltitudeOrDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altitudeOrDepth", lhsAltitudeOrDepth), LocatorUtils.property(thatLocator, "altitudeOrDepth", rhsAltitudeOrDepth), lhsAltitudeOrDepth, rhsAltitudeOrDepth, this.isSetAltitudeOrDepth(), that.isSetAltitudeOrDepth())) {
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
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theLocalTopography;
            theLocalTopography = this.getLocalTopography();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localTopography", theLocalTopography), currentHashCode, theLocalTopography, this.isSetLocalTopography());
        }
        {
            ReferenceType theRelativeElevation;
            theRelativeElevation = this.getRelativeElevation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relativeElevation", theRelativeElevation), currentHashCode, theRelativeElevation, this.isSetRelativeElevation());
        }
        {
            ReferenceType theTopographicContext;
            theTopographicContext = this.getTopographicContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topographicContext", theTopographicContext), currentHashCode, theTopographicContext, this.isSetTopographicContext());
        }
        {
            ReferenceType theAltitudeOrDepth;
            theAltitudeOrDepth = this.getAltitudeOrDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altitudeOrDepth", theAltitudeOrDepth), currentHashCode, theAltitudeOrDepth, this.isSetAltitudeOrDepth());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE2;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof TopographyBathymetryType) {
            final TopographyBathymetryType copy = ((TopographyBathymetryType) draftCopy);
            {
                Boolean localTopographyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLocalTopography());
                if (localTopographyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceLocalTopography;
                    sourceLocalTopography = this.getLocalTopography();
                    ReferenceType copyLocalTopography = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "localTopography", sourceLocalTopography), sourceLocalTopography, this.isSetLocalTopography()));
                    copy.setLocalTopography(copyLocalTopography);
                } else {
                    if (localTopographyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.localTopography = null;
                    }
                }
            }
            {
                Boolean relativeElevationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRelativeElevation());
                if (relativeElevationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceRelativeElevation;
                    sourceRelativeElevation = this.getRelativeElevation();
                    ReferenceType copyRelativeElevation = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "relativeElevation", sourceRelativeElevation), sourceRelativeElevation, this.isSetRelativeElevation()));
                    copy.setRelativeElevation(copyRelativeElevation);
                } else {
                    if (relativeElevationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relativeElevation = null;
                    }
                }
            }
            {
                Boolean topographicContextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTopographicContext());
                if (topographicContextShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceTopographicContext;
                    sourceTopographicContext = this.getTopographicContext();
                    ReferenceType copyTopographicContext = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "topographicContext", sourceTopographicContext), sourceTopographicContext, this.isSetTopographicContext()));
                    copy.setTopographicContext(copyTopographicContext);
                } else {
                    if (topographicContextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.topographicContext = null;
                    }
                }
            }
            {
                Boolean altitudeOrDepthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAltitudeOrDepth());
                if (altitudeOrDepthShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceAltitudeOrDepth;
                    sourceAltitudeOrDepth = this.getAltitudeOrDepth();
                    ReferenceType copyAltitudeOrDepth = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "altitudeOrDepth", sourceAltitudeOrDepth), sourceAltitudeOrDepth, this.isSetAltitudeOrDepth()));
                    copy.setAltitudeOrDepth(copyAltitudeOrDepth);
                } else {
                    if (altitudeOrDepthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.altitudeOrDepth = null;
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
        return new TopographyBathymetryType();
    }

}

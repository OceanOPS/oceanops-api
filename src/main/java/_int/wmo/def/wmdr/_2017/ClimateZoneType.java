
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ClimateZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClimateZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="climateZone" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
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
@XmlType(name = "ClimateZoneType", propOrder = {
    "climateZone",
    "validPeriod"
})
public class ClimateZoneType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType climateZone;
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the climateZone property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClimateZone() {
        return climateZone;
    }

    /**
     * Sets the value of the climateZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClimateZone(ReferenceType value) {
        this.climateZone = value;
    }

    public boolean isSetClimateZone() {
        return (this.climateZone!= null);
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

    @Override
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            ReferenceType theClimateZone;
            theClimateZone = this.getClimateZone();
            strategy.appendField(locator, this, "climateZone", buffer, theClimateZone, this.isSetClimateZone());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            strategy.appendField(locator, this, "validPeriod", buffer, theValidPeriod, this.isSetValidPeriod());
        }
        return buffer;
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClimateZoneType that = ((ClimateZoneType) object);
        {
            ReferenceType lhsClimateZone;
            lhsClimateZone = this.getClimateZone();
            ReferenceType rhsClimateZone;
            rhsClimateZone = that.getClimateZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "climateZone", lhsClimateZone), LocatorUtils.property(thatLocator, "climateZone", rhsClimateZone), lhsClimateZone, rhsClimateZone, this.isSetClimateZone(), that.isSetClimateZone())) {
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

    @Override
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theClimateZone;
            theClimateZone = this.getClimateZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "climateZone", theClimateZone), currentHashCode, theClimateZone, this.isSetClimateZone());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
        }
        return currentHashCode;
    }

    @Override
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.getInstance();
        return this.hashCode(null, strategy);
    }

    @Override
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ClimateZoneType) {
            final ClimateZoneType copy = ((ClimateZoneType) draftCopy);
            {
                Boolean climateZoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetClimateZone());
                if (climateZoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceClimateZone;
                    sourceClimateZone = this.getClimateZone();
                    ReferenceType copyClimateZone = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "climateZone", sourceClimateZone), sourceClimateZone, this.isSetClimateZone()));
                    copy.setClimateZone(copyClimateZone);
                } else {
                    if (climateZoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.climateZone = null;
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

    @Override
    public Object createNewInstance() {
        return new ClimateZoneType();
    }

}

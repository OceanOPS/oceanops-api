
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
 * <p>Java class for SurfaceCoverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceCoverType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="surfaceCover" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="surfaceCoverClassification" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
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
@XmlType(name = "SurfaceCoverType", propOrder = {
    "surfaceCover",
    "surfaceCoverClassification",
    "validPeriod"
})
public class SurfaceCoverType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType surfaceCover;
    @XmlElement(required = true)
    protected ReferenceType surfaceCoverClassification;
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the surfaceCover property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSurfaceCover() {
        return surfaceCover;
    }

    /**
     * Sets the value of the surfaceCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSurfaceCover(ReferenceType value) {
        this.surfaceCover = value;
    }

    public boolean isSetSurfaceCover() {
        return (this.surfaceCover!= null);
    }

    /**
     * Gets the value of the surfaceCoverClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSurfaceCoverClassification() {
        return surfaceCoverClassification;
    }

    /**
     * Sets the value of the surfaceCoverClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSurfaceCoverClassification(ReferenceType value) {
        this.surfaceCoverClassification = value;
    }

    public boolean isSetSurfaceCoverClassification() {
        return (this.surfaceCoverClassification!= null);
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
            ReferenceType theSurfaceCover;
            theSurfaceCover = this.getSurfaceCover();
            strategy.appendField(locator, this, "surfaceCover", buffer, theSurfaceCover, this.isSetSurfaceCover());
        }
        {
            ReferenceType theSurfaceCoverClassification;
            theSurfaceCoverClassification = this.getSurfaceCoverClassification();
            strategy.appendField(locator, this, "surfaceCoverClassification", buffer, theSurfaceCoverClassification, this.isSetSurfaceCoverClassification());
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
        final SurfaceCoverType that = ((SurfaceCoverType) object);
        {
            ReferenceType lhsSurfaceCover;
            lhsSurfaceCover = this.getSurfaceCover();
            ReferenceType rhsSurfaceCover;
            rhsSurfaceCover = that.getSurfaceCover();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceCover", lhsSurfaceCover), LocatorUtils.property(thatLocator, "surfaceCover", rhsSurfaceCover), lhsSurfaceCover, rhsSurfaceCover, this.isSetSurfaceCover(), that.isSetSurfaceCover())) {
                return false;
            }
        }
        {
            ReferenceType lhsSurfaceCoverClassification;
            lhsSurfaceCoverClassification = this.getSurfaceCoverClassification();
            ReferenceType rhsSurfaceCoverClassification;
            rhsSurfaceCoverClassification = that.getSurfaceCoverClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceCoverClassification", lhsSurfaceCoverClassification), LocatorUtils.property(thatLocator, "surfaceCoverClassification", rhsSurfaceCoverClassification), lhsSurfaceCoverClassification, rhsSurfaceCoverClassification, this.isSetSurfaceCoverClassification(), that.isSetSurfaceCoverClassification())) {
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
            ReferenceType theSurfaceCover;
            theSurfaceCover = this.getSurfaceCover();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceCover", theSurfaceCover), currentHashCode, theSurfaceCover, this.isSetSurfaceCover());
        }
        {
            ReferenceType theSurfaceCoverClassification;
            theSurfaceCoverClassification = this.getSurfaceCoverClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceCoverClassification", theSurfaceCoverClassification), currentHashCode, theSurfaceCoverClassification, this.isSetSurfaceCoverClassification());
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
        if (draftCopy instanceof SurfaceCoverType) {
            final SurfaceCoverType copy = ((SurfaceCoverType) draftCopy);
            {
                Boolean surfaceCoverShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSurfaceCover());
                if (surfaceCoverShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceSurfaceCover;
                    sourceSurfaceCover = this.getSurfaceCover();
                    ReferenceType copySurfaceCover = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "surfaceCover", sourceSurfaceCover), sourceSurfaceCover, this.isSetSurfaceCover()));
                    copy.setSurfaceCover(copySurfaceCover);
                } else {
                    if (surfaceCoverShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.surfaceCover = null;
                    }
                }
            }
            {
                Boolean surfaceCoverClassificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSurfaceCoverClassification());
                if (surfaceCoverClassificationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceSurfaceCoverClassification;
                    sourceSurfaceCoverClassification = this.getSurfaceCoverClassification();
                    ReferenceType copySurfaceCoverClassification = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "surfaceCoverClassification", sourceSurfaceCoverClassification), sourceSurfaceCoverClassification, this.isSetSurfaceCoverClassification()));
                    copy.setSurfaceCoverClassification(copySurfaceCoverClassification);
                } else {
                    if (surfaceCoverClassificationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.surfaceCoverClassification = null;
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
        return new SurfaceCoverType();
    }

}

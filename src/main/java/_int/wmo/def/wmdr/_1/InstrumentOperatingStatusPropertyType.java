
package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for InstrumentOperatingStatusPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentOperatingStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://def.wmo.int/wmdr/1.0}InstrumentOperatingStatus"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentOperatingStatusPropertyType", propOrder = {
    "instrumentOperatingStatus"
})
public class InstrumentOperatingStatusPropertyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InstrumentOperatingStatus", required = true)
    protected InstrumentOperatingStatusType instrumentOperatingStatus;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the instrumentOperatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentOperatingStatusType }
     *     
     */
    public InstrumentOperatingStatusType getInstrumentOperatingStatus() {
        return instrumentOperatingStatus;
    }

    /**
     * Sets the value of the instrumentOperatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentOperatingStatusType }
     *     
     */
    public void setInstrumentOperatingStatus(InstrumentOperatingStatusType value) {
        this.instrumentOperatingStatus = value;
    }

    public boolean isSetInstrumentOperatingStatus() {
        return (this.instrumentOperatingStatus!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
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
            InstrumentOperatingStatusType theInstrumentOperatingStatus;
            theInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
            strategy.appendField(locator, this, "instrumentOperatingStatus", buffer, theInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theOwns, this.isSetOwns());
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
        final InstrumentOperatingStatusPropertyType that = ((InstrumentOperatingStatusPropertyType) object);
        {
            InstrumentOperatingStatusType lhsInstrumentOperatingStatus;
            lhsInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
            InstrumentOperatingStatusType rhsInstrumentOperatingStatus;
            rhsInstrumentOperatingStatus = that.getInstrumentOperatingStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrumentOperatingStatus", lhsInstrumentOperatingStatus), LocatorUtils.property(thatLocator, "instrumentOperatingStatus", rhsInstrumentOperatingStatus), lhsInstrumentOperatingStatus, rhsInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus(), that.isSetInstrumentOperatingStatus())) {
                return false;
            }
        }
        {
            boolean lhsOwns;
            lhsOwns = (this.isSetOwns()?this.isOwns():false);
            boolean rhsOwns;
            rhsOwns = (that.isSetOwns()?that.isOwns():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owns", lhsOwns), LocatorUtils.property(thatLocator, "owns", rhsOwns), lhsOwns, rhsOwns, this.isSetOwns(), that.isSetOwns())) {
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
            InstrumentOperatingStatusType theInstrumentOperatingStatus;
            theInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrumentOperatingStatus", theInstrumentOperatingStatus), currentHashCode, theInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns, this.isSetOwns());
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
        if (draftCopy instanceof InstrumentOperatingStatusPropertyType) {
            final InstrumentOperatingStatusPropertyType copy = ((InstrumentOperatingStatusPropertyType) draftCopy);
            {
                Boolean instrumentOperatingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetInstrumentOperatingStatus());
                if (instrumentOperatingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    InstrumentOperatingStatusType sourceInstrumentOperatingStatus;
                    sourceInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
                    InstrumentOperatingStatusType copyInstrumentOperatingStatus = ((InstrumentOperatingStatusType) strategy.copy(LocatorUtils.property(locator, "instrumentOperatingStatus", sourceInstrumentOperatingStatus), sourceInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus()));
                    copy.setInstrumentOperatingStatus(copyInstrumentOperatingStatus);
                } else {
                    if (instrumentOperatingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.instrumentOperatingStatus = null;
                    }
                }
            }
            {
                Boolean ownsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOwns());
                if (ownsShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceOwns;
                    sourceOwns = (this.isSetOwns()?this.isOwns():false);
                    boolean copyOwns = strategy.copy(LocatorUtils.property(locator, "owns", sourceOwns), sourceOwns, this.isSetOwns());
                    copy.setOwns(copyOwns);
                } else {
                    if (ownsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetOwns();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InstrumentOperatingStatusPropertyType();
    }

}

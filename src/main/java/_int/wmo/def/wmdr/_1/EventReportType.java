
package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for EventReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/wmdr/1.0}LogEntryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfEvent" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventReportType", propOrder = {
    "typeOfEvent",
    "validPeriod"
})
public class EventReportType
    extends LogEntryType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType typeOfEvent;
    @XmlElement(required = true)
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the typeOfEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTypeOfEvent() {
        return typeOfEvent;
    }

    /**
     * Sets the value of the typeOfEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTypeOfEvent(ReferenceType value) {
        this.typeOfEvent = value;
    }

    public boolean isSetTypeOfEvent() {
        return (this.typeOfEvent!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            ReferenceType theTypeOfEvent;
            theTypeOfEvent = this.getTypeOfEvent();
            strategy.appendField(locator, this, "typeOfEvent", buffer, theTypeOfEvent, this.isSetTypeOfEvent());
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EventReportType that = ((EventReportType) object);
        {
            ReferenceType lhsTypeOfEvent;
            lhsTypeOfEvent = this.getTypeOfEvent();
            ReferenceType rhsTypeOfEvent;
            rhsTypeOfEvent = that.getTypeOfEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeOfEvent", lhsTypeOfEvent), LocatorUtils.property(thatLocator, "typeOfEvent", rhsTypeOfEvent), lhsTypeOfEvent, rhsTypeOfEvent, this.isSetTypeOfEvent(), that.isSetTypeOfEvent())) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ReferenceType theTypeOfEvent;
            theTypeOfEvent = this.getTypeOfEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeOfEvent", theTypeOfEvent), currentHashCode, theTypeOfEvent, this.isSetTypeOfEvent());
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof EventReportType) {
            final EventReportType copy = ((EventReportType) draftCopy);
            {
                Boolean typeOfEventShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTypeOfEvent());
                if (typeOfEventShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceTypeOfEvent;
                    sourceTypeOfEvent = this.getTypeOfEvent();
                    ReferenceType copyTypeOfEvent = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "typeOfEvent", sourceTypeOfEvent), sourceTypeOfEvent, this.isSetTypeOfEvent()));
                    copy.setTypeOfEvent(copyTypeOfEvent);
                } else {
                    if (typeOfEventShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.typeOfEvent = null;
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
        return new EventReportType();
    }

}

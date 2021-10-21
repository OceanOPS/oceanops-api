
package _int.wmo.def.metce._2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for EruptingVolcanoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EruptingVolcanoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/metce/2013}VolcanoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eruptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EruptingVolcanoType", propOrder = {
    "eruptionDate"
})
public class EruptingVolcanoType
    extends VolcanoType
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eruptionDate;

    /**
     * Gets the value of the eruptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEruptionDate() {
        return eruptionDate;
    }

    /**
     * Sets the value of the eruptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEruptionDate(XMLGregorianCalendar value) {
        this.eruptionDate = value;
    }

    public boolean isSetEruptionDate() {
        return (this.eruptionDate!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            XMLGregorianCalendar theEruptionDate;
            theEruptionDate = this.getEruptionDate();
            strategy.appendField(locator, this, "eruptionDate", buffer, theEruptionDate, this.isSetEruptionDate());
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
        final EruptingVolcanoType that = ((EruptingVolcanoType) object);
        {
            XMLGregorianCalendar lhsEruptionDate;
            lhsEruptionDate = this.getEruptionDate();
            XMLGregorianCalendar rhsEruptionDate;
            rhsEruptionDate = that.getEruptionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eruptionDate", lhsEruptionDate), LocatorUtils.property(thatLocator, "eruptionDate", rhsEruptionDate), lhsEruptionDate, rhsEruptionDate, this.isSetEruptionDate(), that.isSetEruptionDate())) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            XMLGregorianCalendar theEruptionDate;
            theEruptionDate = this.getEruptionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eruptionDate", theEruptionDate), currentHashCode, theEruptionDate, this.isSetEruptionDate());
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof EruptingVolcanoType) {
            final EruptingVolcanoType copy = ((EruptingVolcanoType) draftCopy);
            {
                Boolean eruptionDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEruptionDate());
                if (eruptionDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceEruptionDate;
                    sourceEruptionDate = this.getEruptionDate();
                    XMLGregorianCalendar copyEruptionDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "eruptionDate", sourceEruptionDate), sourceEruptionDate, this.isSetEruptionDate()));
                    copy.setEruptionDate(copyEruptionDate);
                } else {
                    if (eruptionDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eruptionDate = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EruptingVolcanoType();
    }

}

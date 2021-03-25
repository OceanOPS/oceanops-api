
package _int.wmo.def.wmdr._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.ReferenceType;
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
 * <p>Java class for EquipmentLogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentLogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}LogType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipment" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentLogType", propOrder = {
    "equipment"
})
public class EquipmentLogType
    extends LogType
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType equipment;

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEquipment(ReferenceType value) {
        this.equipment = value;
    }

    public boolean isSetEquipment() {
        return (this.equipment!= null);
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
            ReferenceType theEquipment;
            theEquipment = this.getEquipment();
            strategy.appendField(locator, this, "equipment", buffer, theEquipment, this.isSetEquipment());
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
        final EquipmentLogType that = ((EquipmentLogType) object);
        {
            ReferenceType lhsEquipment;
            lhsEquipment = this.getEquipment();
            ReferenceType rhsEquipment;
            rhsEquipment = that.getEquipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipment", lhsEquipment), LocatorUtils.property(thatLocator, "equipment", rhsEquipment), lhsEquipment, rhsEquipment, this.isSetEquipment(), that.isSetEquipment())) {
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
            ReferenceType theEquipment;
            theEquipment = this.getEquipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipment", theEquipment), currentHashCode, theEquipment, this.isSetEquipment());
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
        if (draftCopy instanceof EquipmentLogType) {
            final EquipmentLogType copy = ((EquipmentLogType) draftCopy);
            {
                Boolean equipmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipment());
                if (equipmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceEquipment;
                    sourceEquipment = this.getEquipment();
                    ReferenceType copyEquipment = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "equipment", sourceEquipment), sourceEquipment, this.isSetEquipment()));
                    copy.setEquipment(copyEquipment);
                } else {
                    if (equipmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.equipment = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EquipmentLogType();
    }

}

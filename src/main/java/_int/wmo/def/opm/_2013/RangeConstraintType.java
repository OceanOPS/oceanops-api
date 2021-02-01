
package _int.wmo.def.opm._2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.UnitOfMeasureType;
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
 * <p>Java class for RangeConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeConstraintType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/opm/2013}ConstraintType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.opengis.net/gml/3.2}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://def.wmo.int/opm/2013}RangeBoundsPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeConstraintType", propOrder = {
    "unitOfMeasure",
    "value"
})
public class RangeConstraintType
    extends ConstraintType
{

    private final static long serialVersionUID = 1L;
    protected UnitOfMeasureType unitOfMeasure;
    @XmlElement(required = true)
    protected List<RangeBoundsPropertyType> value;

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    public boolean isSetUnitOfMeasure() {
        return (this.unitOfMeasure!= null);
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeBoundsPropertyType }
     * 
     * 
     */
    public List<RangeBoundsPropertyType> getValue() {
        if (value == null) {
            value = new ArrayList<RangeBoundsPropertyType>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
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
            UnitOfMeasureType theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, this.isSetUnitOfMeasure());
        }
        {
            List<RangeBoundsPropertyType> theValue;
            theValue = (this.isSetValue()?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theValue, this.isSetValue());
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
        final RangeConstraintType that = ((RangeConstraintType) object);
        {
            UnitOfMeasureType lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasureType rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, this.isSetUnitOfMeasure(), that.isSetUnitOfMeasure())) {
                return false;
            }
        }
        {
            List<RangeBoundsPropertyType> lhsValue;
            lhsValue = (this.isSetValue()?this.getValue():null);
            List<RangeBoundsPropertyType> rhsValue;
            rhsValue = (that.isSetValue()?that.getValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, this.isSetValue(), that.isSetValue())) {
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
            UnitOfMeasureType theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, this.isSetUnitOfMeasure());
        }
        {
            List<RangeBoundsPropertyType> theValue;
            theValue = (this.isSetValue()?this.getValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, this.isSetValue());
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
        if (draftCopy instanceof RangeConstraintType) {
            final RangeConstraintType copy = ((RangeConstraintType) draftCopy);
            {
                Boolean unitOfMeasureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetUnitOfMeasure());
                if (unitOfMeasureShouldBeCopiedAndSet == Boolean.TRUE) {
                    UnitOfMeasureType sourceUnitOfMeasure;
                    sourceUnitOfMeasure = this.getUnitOfMeasure();
                    UnitOfMeasureType copyUnitOfMeasure = ((UnitOfMeasureType) strategy.copy(LocatorUtils.property(locator, "unitOfMeasure", sourceUnitOfMeasure), sourceUnitOfMeasure, this.isSetUnitOfMeasure()));
                    copy.setUnitOfMeasure(copyUnitOfMeasure);
                } else {
                    if (unitOfMeasureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unitOfMeasure = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetValue());
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<RangeBoundsPropertyType> sourceValue;
                    sourceValue = (this.isSetValue()?this.getValue():null);
                    @SuppressWarnings("unchecked")
                    List<RangeBoundsPropertyType> copyValue = ((List<RangeBoundsPropertyType> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, this.isSetValue()));
                    copy.unsetValue();
                    if (copyValue!= null) {
                        List<RangeBoundsPropertyType> uniqueValuel = copy.getValue();
                        uniqueValuel.addAll(copyValue);
                    }
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetValue();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RangeConstraintType();
    }

}

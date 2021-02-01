
package _int.wmo.def.opm._2013;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for CompositeObservablePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeObservablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/opm/2013}AbstractObservablePropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="property" type="{http://def.wmo.int/opm/2013}AbstractObservablePropertyPropertyType" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeObservablePropertyType", propOrder = {
    "property"
})
public class CompositeObservablePropertyType
    extends AbstractObservablePropertyType
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<AbstractObservablePropertyPropertyType> property;
    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObservablePropertyPropertyType }
     * 
     * 
     */
    public List<AbstractObservablePropertyPropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<AbstractObservablePropertyPropertyType>();
        }
        return this.property;
    }

    public boolean isSetProperty() {
        return ((this.property!= null)&&(!this.property.isEmpty()));
    }

    public void unsetProperty() {
        this.property = null;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    public boolean isSetCount() {
        return (this.count!= null);
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
            List<AbstractObservablePropertyPropertyType> theProperty;
            theProperty = (this.isSetProperty()?this.getProperty():null);
            strategy.appendField(locator, this, "property", buffer, theProperty, this.isSetProperty());
        }
        {
            BigInteger theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount, this.isSetCount());
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
        final CompositeObservablePropertyType that = ((CompositeObservablePropertyType) object);
        {
            List<AbstractObservablePropertyPropertyType> lhsProperty;
            lhsProperty = (this.isSetProperty()?this.getProperty():null);
            List<AbstractObservablePropertyPropertyType> rhsProperty;
            rhsProperty = (that.isSetProperty()?that.getProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty, this.isSetProperty(), that.isSetProperty())) {
                return false;
            }
        }
        {
            BigInteger lhsCount;
            lhsCount = this.getCount();
            BigInteger rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount, this.isSetCount(), that.isSetCount())) {
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
            List<AbstractObservablePropertyPropertyType> theProperty;
            theProperty = (this.isSetProperty()?this.getProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "property", theProperty), currentHashCode, theProperty, this.isSetProperty());
        }
        {
            BigInteger theCount;
            theCount = this.getCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "count", theCount), currentHashCode, theCount, this.isSetCount());
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
        if (draftCopy instanceof CompositeObservablePropertyType) {
            final CompositeObservablePropertyType copy = ((CompositeObservablePropertyType) draftCopy);
            {
                Boolean propertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProperty());
                if (propertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AbstractObservablePropertyPropertyType> sourceProperty;
                    sourceProperty = (this.isSetProperty()?this.getProperty():null);
                    @SuppressWarnings("unchecked")
                    List<AbstractObservablePropertyPropertyType> copyProperty = ((List<AbstractObservablePropertyPropertyType> ) strategy.copy(LocatorUtils.property(locator, "property", sourceProperty), sourceProperty, this.isSetProperty()));
                    copy.unsetProperty();
                    if (copyProperty!= null) {
                        List<AbstractObservablePropertyPropertyType> uniquePropertyl = copy.getProperty();
                        uniquePropertyl.addAll(copyProperty);
                    }
                } else {
                    if (propertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetProperty();
                    }
                }
            }
            {
                Boolean countShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCount());
                if (countShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCount;
                    sourceCount = this.getCount();
                    BigInteger copyCount = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "count", sourceCount), sourceCount, this.isSetCount()));
                    copy.setCount(copyCount);
                } else {
                    if (countShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.count = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CompositeObservablePropertyType();
    }

}


package _int.wmo.def.opm._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constraintProperty" type="{http://def.wmo.int/opm/2013}ObservablePropertyPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintType", propOrder = {
    "description",
    "constraintProperty"
})
@XmlSeeAlso({
    ScalarConstraintType.class,
    CategoryConstraintType.class,
    RangeConstraintType.class
})
public class ConstraintType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String description;
    @XmlElement(required = true)
    protected ObservablePropertyPropertyType constraintProperty;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the constraintProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public ObservablePropertyPropertyType getConstraintProperty() {
        return constraintProperty;
    }

    /**
     * Sets the value of the constraintProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public void setConstraintProperty(ObservablePropertyPropertyType value) {
        this.constraintProperty = value;
    }

    public boolean isSetConstraintProperty() {
        return (this.constraintProperty!= null);
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, this.isSetDescription());
        }
        {
            ObservablePropertyPropertyType theConstraintProperty;
            theConstraintProperty = this.getConstraintProperty();
            strategy.appendField(locator, this, "constraintProperty", buffer, theConstraintProperty, this.isSetConstraintProperty());
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
        final ConstraintType that = ((ConstraintType) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, this.isSetDescription(), that.isSetDescription())) {
                return false;
            }
        }
        {
            ObservablePropertyPropertyType lhsConstraintProperty;
            lhsConstraintProperty = this.getConstraintProperty();
            ObservablePropertyPropertyType rhsConstraintProperty;
            rhsConstraintProperty = that.getConstraintProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constraintProperty", lhsConstraintProperty), LocatorUtils.property(thatLocator, "constraintProperty", rhsConstraintProperty), lhsConstraintProperty, rhsConstraintProperty, this.isSetConstraintProperty(), that.isSetConstraintProperty())) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, this.isSetDescription());
        }
        {
            ObservablePropertyPropertyType theConstraintProperty;
            theConstraintProperty = this.getConstraintProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constraintProperty", theConstraintProperty), currentHashCode, theConstraintProperty, this.isSetConstraintProperty());
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
        if (draftCopy instanceof ConstraintType) {
            final ConstraintType copy = ((ConstraintType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDescription());
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, this.isSetDescription()));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean constraintPropertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetConstraintProperty());
                if (constraintPropertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObservablePropertyPropertyType sourceConstraintProperty;
                    sourceConstraintProperty = this.getConstraintProperty();
                    ObservablePropertyPropertyType copyConstraintProperty = ((ObservablePropertyPropertyType) strategy.copy(LocatorUtils.property(locator, "constraintProperty", sourceConstraintProperty), sourceConstraintProperty, this.isSetConstraintProperty()));
                    copy.setConstraintProperty(copyConstraintProperty);
                } else {
                    if (constraintPropertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constraintProperty = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ConstraintType();
    }

}

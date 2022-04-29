
package _int.wmo.def.opm._2013;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.UnitOfMeasureType;
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
 * <p>Java class for QualifiedObservablePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedObservablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/opm/2013}ObservablePropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.opengis.net/gml/3.2}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="constraint" type="{http://def.wmo.int/opm/2013}ConstraintPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="qualifier" type="{http://def.wmo.int/opm/2013}StatisticalQualifierPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="baseProperty" type="{http://def.wmo.int/opm/2013}ObservablePropertyPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedObservablePropertyType", propOrder = {
    "unitOfMeasure",
    "constraint",
    "qualifier",
    "baseProperty"
})
public class QualifiedObservablePropertyType
    extends ObservablePropertyType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected UnitOfMeasureType unitOfMeasure;
    protected List<ConstraintPropertyType> constraint;
    protected List<StatisticalQualifierPropertyType> qualifier;
    @XmlElement(required = true)
    protected ObservablePropertyPropertyType baseProperty;

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
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintPropertyType }
     * 
     * 
     */
    public List<ConstraintPropertyType> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ConstraintPropertyType>();
        }
        return this.constraint;
    }

    public boolean isSetConstraint() {
        return ((this.constraint!= null)&&(!this.constraint.isEmpty()));
    }

    public void unsetConstraint() {
        this.constraint = null;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticalQualifierPropertyType }
     * 
     * 
     */
    public List<StatisticalQualifierPropertyType> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<StatisticalQualifierPropertyType>();
        }
        return this.qualifier;
    }

    public boolean isSetQualifier() {
        return ((this.qualifier!= null)&&(!this.qualifier.isEmpty()));
    }

    public void unsetQualifier() {
        this.qualifier = null;
    }

    /**
     * Gets the value of the baseProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public ObservablePropertyPropertyType getBaseProperty() {
        return baseProperty;
    }

    /**
     * Sets the value of the baseProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public void setBaseProperty(ObservablePropertyPropertyType value) {
        this.baseProperty = value;
    }

    public boolean isSetBaseProperty() {
        return (this.baseProperty!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            UnitOfMeasureType theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, this.isSetUnitOfMeasure());
        }
        {
            List<ConstraintPropertyType> theConstraint;
            theConstraint = (this.isSetConstraint()?this.getConstraint():null);
            strategy.appendField(locator, this, "constraint", buffer, theConstraint, this.isSetConstraint());
        }
        {
            List<StatisticalQualifierPropertyType> theQualifier;
            theQualifier = (this.isSetQualifier()?this.getQualifier():null);
            strategy.appendField(locator, this, "qualifier", buffer, theQualifier, this.isSetQualifier());
        }
        {
            ObservablePropertyPropertyType theBaseProperty;
            theBaseProperty = this.getBaseProperty();
            strategy.appendField(locator, this, "baseProperty", buffer, theBaseProperty, this.isSetBaseProperty());
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final QualifiedObservablePropertyType that = ((QualifiedObservablePropertyType) object);
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
            List<ConstraintPropertyType> lhsConstraint;
            lhsConstraint = (this.isSetConstraint()?this.getConstraint():null);
            List<ConstraintPropertyType> rhsConstraint;
            rhsConstraint = (that.isSetConstraint()?that.getConstraint():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constraint", lhsConstraint), LocatorUtils.property(thatLocator, "constraint", rhsConstraint), lhsConstraint, rhsConstraint, this.isSetConstraint(), that.isSetConstraint())) {
                return false;
            }
        }
        {
            List<StatisticalQualifierPropertyType> lhsQualifier;
            lhsQualifier = (this.isSetQualifier()?this.getQualifier():null);
            List<StatisticalQualifierPropertyType> rhsQualifier;
            rhsQualifier = (that.isSetQualifier()?that.getQualifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualifier", lhsQualifier), LocatorUtils.property(thatLocator, "qualifier", rhsQualifier), lhsQualifier, rhsQualifier, this.isSetQualifier(), that.isSetQualifier())) {
                return false;
            }
        }
        {
            ObservablePropertyPropertyType lhsBaseProperty;
            lhsBaseProperty = this.getBaseProperty();
            ObservablePropertyPropertyType rhsBaseProperty;
            rhsBaseProperty = that.getBaseProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseProperty", lhsBaseProperty), LocatorUtils.property(thatLocator, "baseProperty", rhsBaseProperty), lhsBaseProperty, rhsBaseProperty, this.isSetBaseProperty(), that.isSetBaseProperty())) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            UnitOfMeasureType theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, this.isSetUnitOfMeasure());
        }
        {
            List<ConstraintPropertyType> theConstraint;
            theConstraint = (this.isSetConstraint()?this.getConstraint():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constraint", theConstraint), currentHashCode, theConstraint, this.isSetConstraint());
        }
        {
            List<StatisticalQualifierPropertyType> theQualifier;
            theQualifier = (this.isSetQualifier()?this.getQualifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualifier", theQualifier), currentHashCode, theQualifier, this.isSetQualifier());
        }
        {
            ObservablePropertyPropertyType theBaseProperty;
            theBaseProperty = this.getBaseProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseProperty", theBaseProperty), currentHashCode, theBaseProperty, this.isSetBaseProperty());
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof QualifiedObservablePropertyType) {
            final QualifiedObservablePropertyType copy = ((QualifiedObservablePropertyType) draftCopy);
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
                Boolean constraintShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetConstraint());
                if (constraintShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ConstraintPropertyType> sourceConstraint;
                    sourceConstraint = (this.isSetConstraint()?this.getConstraint():null);
                    @SuppressWarnings("unchecked")
                    List<ConstraintPropertyType> copyConstraint = ((List<ConstraintPropertyType> ) strategy.copy(LocatorUtils.property(locator, "constraint", sourceConstraint), sourceConstraint, this.isSetConstraint()));
                    copy.unsetConstraint();
                    if (copyConstraint!= null) {
                        List<ConstraintPropertyType> uniqueConstraintl = copy.getConstraint();
                        uniqueConstraintl.addAll(copyConstraint);
                    }
                } else {
                    if (constraintShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetConstraint();
                    }
                }
            }
            {
                Boolean qualifierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetQualifier());
                if (qualifierShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<StatisticalQualifierPropertyType> sourceQualifier;
                    sourceQualifier = (this.isSetQualifier()?this.getQualifier():null);
                    @SuppressWarnings("unchecked")
                    List<StatisticalQualifierPropertyType> copyQualifier = ((List<StatisticalQualifierPropertyType> ) strategy.copy(LocatorUtils.property(locator, "qualifier", sourceQualifier), sourceQualifier, this.isSetQualifier()));
                    copy.unsetQualifier();
                    if (copyQualifier!= null) {
                        List<StatisticalQualifierPropertyType> uniqueQualifierl = copy.getQualifier();
                        uniqueQualifierl.addAll(copyQualifier);
                    }
                } else {
                    if (qualifierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetQualifier();
                    }
                }
            }
            {
                Boolean basePropertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetBaseProperty());
                if (basePropertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObservablePropertyPropertyType sourceBaseProperty;
                    sourceBaseProperty = this.getBaseProperty();
                    ObservablePropertyPropertyType copyBaseProperty = ((ObservablePropertyPropertyType) strategy.copy(LocatorUtils.property(locator, "baseProperty", sourceBaseProperty), sourceBaseProperty, this.isSetBaseProperty()));
                    copy.setBaseProperty(copyBaseProperty);
                } else {
                    if (basePropertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baseProperty = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new QualifiedObservablePropertyType();
    }

}

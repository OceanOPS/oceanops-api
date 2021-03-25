
package _int.wmo.def.opm._2013;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractGMLType;
import net.opengis.gml.v_3_2.CodeType;
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
 * <p>Java class for AbstractObservablePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObservablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altLabel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notation" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObservablePropertyType", propOrder = {
    "label",
    "altLabel",
    "notation"
})
@XmlSeeAlso({
    CompositeObservablePropertyType.class,
    ObservablePropertyType.class
})
public abstract class AbstractObservablePropertyType
    extends AbstractGMLType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String label;
    protected List<String> altLabel;
    protected List<CodeType> notation;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    public boolean isSetLabel() {
        return (this.label!= null);
    }

    /**
     * Gets the value of the altLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAltLabel() {
        if (altLabel == null) {
            altLabel = new ArrayList<String>();
        }
        return this.altLabel;
    }

    public boolean isSetAltLabel() {
        return ((this.altLabel!= null)&&(!this.altLabel.isEmpty()));
    }

    public void unsetAltLabel() {
        this.altLabel = null;
    }

    /**
     * Gets the value of the notation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getNotation() {
        if (notation == null) {
            notation = new ArrayList<CodeType>();
        }
        return this.notation;
    }

    public boolean isSetNotation() {
        return ((this.notation!= null)&&(!this.notation.isEmpty()));
    }

    public void unsetNotation() {
        this.notation = null;
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
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, this.isSetLabel());
        }
        {
            List<String> theAltLabel;
            theAltLabel = (this.isSetAltLabel()?this.getAltLabel():null);
            strategy.appendField(locator, this, "altLabel", buffer, theAltLabel, this.isSetAltLabel());
        }
        {
            List<CodeType> theNotation;
            theNotation = (this.isSetNotation()?this.getNotation():null);
            strategy.appendField(locator, this, "notation", buffer, theNotation, this.isSetNotation());
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
        final AbstractObservablePropertyType that = ((AbstractObservablePropertyType) object);
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, this.isSetLabel(), that.isSetLabel())) {
                return false;
            }
        }
        {
            List<String> lhsAltLabel;
            lhsAltLabel = (this.isSetAltLabel()?this.getAltLabel():null);
            List<String> rhsAltLabel;
            rhsAltLabel = (that.isSetAltLabel()?that.getAltLabel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altLabel", lhsAltLabel), LocatorUtils.property(thatLocator, "altLabel", rhsAltLabel), lhsAltLabel, rhsAltLabel, this.isSetAltLabel(), that.isSetAltLabel())) {
                return false;
            }
        }
        {
            List<CodeType> lhsNotation;
            lhsNotation = (this.isSetNotation()?this.getNotation():null);
            List<CodeType> rhsNotation;
            rhsNotation = (that.isSetNotation()?that.getNotation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notation", lhsNotation), LocatorUtils.property(thatLocator, "notation", rhsNotation), lhsNotation, rhsNotation, this.isSetNotation(), that.isSetNotation())) {
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
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel, this.isSetLabel());
        }
        {
            List<String> theAltLabel;
            theAltLabel = (this.isSetAltLabel()?this.getAltLabel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altLabel", theAltLabel), currentHashCode, theAltLabel, this.isSetAltLabel());
        }
        {
            List<CodeType> theNotation;
            theNotation = (this.isSetNotation()?this.getNotation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notation", theNotation), currentHashCode, theNotation, this.isSetNotation());
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AbstractObservablePropertyType) {
            final AbstractObservablePropertyType copy = ((AbstractObservablePropertyType) target);
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLabel());
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, this.isSetLabel()));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
            {
                Boolean altLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAltLabel());
                if (altLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceAltLabel;
                    sourceAltLabel = (this.isSetAltLabel()?this.getAltLabel():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyAltLabel = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "altLabel", sourceAltLabel), sourceAltLabel, this.isSetAltLabel()));
                    copy.unsetAltLabel();
                    if (copyAltLabel!= null) {
                        List<String> uniqueAltLabell = copy.getAltLabel();
                        uniqueAltLabell.addAll(copyAltLabel);
                    }
                } else {
                    if (altLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetAltLabel();
                    }
                }
            }
            {
                Boolean notationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetNotation());
                if (notationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CodeType> sourceNotation;
                    sourceNotation = (this.isSetNotation()?this.getNotation():null);
                    @SuppressWarnings("unchecked")
                    List<CodeType> copyNotation = ((List<CodeType> ) strategy.copy(LocatorUtils.property(locator, "notation", sourceNotation), sourceNotation, this.isSetNotation()));
                    copy.unsetNotation();
                    if (copyNotation!= null) {
                        List<CodeType> uniqueNotationl = copy.getNotation();
                        uniqueNotationl.addAll(copyNotation);
                    }
                } else {
                    if (notationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetNotation();
                    }
                }
            }
        }
        return target;
    }

}

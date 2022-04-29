
package _int.wmo.def.opm._2013;

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
 * <p>Java class for StatisticalQualifierPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalQualifierPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://def.wmo.int/opm/2013}StatisticalQualifier"/&gt;
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
@XmlType(name = "StatisticalQualifierPropertyType", propOrder = {
    "statisticalQualifier"
})
public class StatisticalQualifierPropertyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StatisticalQualifier", required = true)
    protected StatisticalQualifierType statisticalQualifier;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the statisticalQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalQualifierType }
     *     
     */
    public StatisticalQualifierType getStatisticalQualifier() {
        return statisticalQualifier;
    }

    /**
     * Sets the value of the statisticalQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalQualifierType }
     *     
     */
    public void setStatisticalQualifier(StatisticalQualifierType value) {
        this.statisticalQualifier = value;
    }

    public boolean isSetStatisticalQualifier() {
        return (this.statisticalQualifier!= null);
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
            StatisticalQualifierType theStatisticalQualifier;
            theStatisticalQualifier = this.getStatisticalQualifier();
            strategy.appendField(locator, this, "statisticalQualifier", buffer, theStatisticalQualifier, this.isSetStatisticalQualifier());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theOwns, this.isSetOwns());
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
        final StatisticalQualifierPropertyType that = ((StatisticalQualifierPropertyType) object);
        {
            StatisticalQualifierType lhsStatisticalQualifier;
            lhsStatisticalQualifier = this.getStatisticalQualifier();
            StatisticalQualifierType rhsStatisticalQualifier;
            rhsStatisticalQualifier = that.getStatisticalQualifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statisticalQualifier", lhsStatisticalQualifier), LocatorUtils.property(thatLocator, "statisticalQualifier", rhsStatisticalQualifier), lhsStatisticalQualifier, rhsStatisticalQualifier, this.isSetStatisticalQualifier(), that.isSetStatisticalQualifier())) {
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

    @Override
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            StatisticalQualifierType theStatisticalQualifier;
            theStatisticalQualifier = this.getStatisticalQualifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statisticalQualifier", theStatisticalQualifier), currentHashCode, theStatisticalQualifier, this.isSetStatisticalQualifier());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns, this.isSetOwns());
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
        if (draftCopy instanceof StatisticalQualifierPropertyType) {
            final StatisticalQualifierPropertyType copy = ((StatisticalQualifierPropertyType) draftCopy);
            {
                Boolean statisticalQualifierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStatisticalQualifier());
                if (statisticalQualifierShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatisticalQualifierType sourceStatisticalQualifier;
                    sourceStatisticalQualifier = this.getStatisticalQualifier();
                    StatisticalQualifierType copyStatisticalQualifier = ((StatisticalQualifierType) strategy.copy(LocatorUtils.property(locator, "statisticalQualifier", sourceStatisticalQualifier), sourceStatisticalQualifier, this.isSetStatisticalQualifier()));
                    copy.setStatisticalQualifier(copyStatisticalQualifier);
                } else {
                    if (statisticalQualifierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statisticalQualifier = null;
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

    @Override
    public Object createNewInstance() {
        return new StatisticalQualifierPropertyType();
    }

}

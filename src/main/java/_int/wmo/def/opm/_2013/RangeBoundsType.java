
package _int.wmo.def.opm._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for RangeBoundsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeBoundsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rangeStart" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rangeEnd" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="startComparison" use="required" type="{http://def.wmo.int/opm/2013}ComparisonOperatorType" /&gt;
 *       &lt;attribute name="endComparison" use="required" type="{http://def.wmo.int/opm/2013}ComparisonOperatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeBoundsType", propOrder = {
    "rangeStart",
    "rangeEnd"
})
public class RangeBoundsType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected double rangeStart;
    protected double rangeEnd;
    @XmlAttribute(name = "startComparison", required = true)
    protected ComparisonOperatorType startComparison;
    @XmlAttribute(name = "endComparison", required = true)
    protected ComparisonOperatorType endComparison;

    /**
     * Gets the value of the rangeStart property.
     * 
     */
    public double getRangeStart() {
        return rangeStart;
    }

    /**
     * Sets the value of the rangeStart property.
     * 
     */
    public void setRangeStart(double value) {
        this.rangeStart = value;
    }

    public boolean isSetRangeStart() {
        return true;
    }

    /**
     * Gets the value of the rangeEnd property.
     * 
     */
    public double getRangeEnd() {
        return rangeEnd;
    }

    /**
     * Sets the value of the rangeEnd property.
     * 
     */
    public void setRangeEnd(double value) {
        this.rangeEnd = value;
    }

    public boolean isSetRangeEnd() {
        return true;
    }

    /**
     * Gets the value of the startComparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public ComparisonOperatorType getStartComparison() {
        return startComparison;
    }

    /**
     * Sets the value of the startComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public void setStartComparison(ComparisonOperatorType value) {
        this.startComparison = value;
    }

    public boolean isSetStartComparison() {
        return (this.startComparison!= null);
    }

    /**
     * Gets the value of the endComparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public ComparisonOperatorType getEndComparison() {
        return endComparison;
    }

    /**
     * Sets the value of the endComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public void setEndComparison(ComparisonOperatorType value) {
        this.endComparison = value;
    }

    public boolean isSetEndComparison() {
        return (this.endComparison!= null);
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
        {
            double theRangeStart;
            theRangeStart = this.getRangeStart();
            strategy.appendField(locator, this, "rangeStart", buffer, theRangeStart, true);
        }
        {
            double theRangeEnd;
            theRangeEnd = this.getRangeEnd();
            strategy.appendField(locator, this, "rangeEnd", buffer, theRangeEnd, true);
        }
        {
            ComparisonOperatorType theStartComparison;
            theStartComparison = this.getStartComparison();
            strategy.appendField(locator, this, "startComparison", buffer, theStartComparison, this.isSetStartComparison());
        }
        {
            ComparisonOperatorType theEndComparison;
            theEndComparison = this.getEndComparison();
            strategy.appendField(locator, this, "endComparison", buffer, theEndComparison, this.isSetEndComparison());
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
        final RangeBoundsType that = ((RangeBoundsType) object);
        {
            double lhsRangeStart;
            lhsRangeStart = this.getRangeStart();
            double rhsRangeStart;
            rhsRangeStart = that.getRangeStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeStart", lhsRangeStart), LocatorUtils.property(thatLocator, "rangeStart", rhsRangeStart), lhsRangeStart, rhsRangeStart, true, true)) {
                return false;
            }
        }
        {
            double lhsRangeEnd;
            lhsRangeEnd = this.getRangeEnd();
            double rhsRangeEnd;
            rhsRangeEnd = that.getRangeEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeEnd", lhsRangeEnd), LocatorUtils.property(thatLocator, "rangeEnd", rhsRangeEnd), lhsRangeEnd, rhsRangeEnd, true, true)) {
                return false;
            }
        }
        {
            ComparisonOperatorType lhsStartComparison;
            lhsStartComparison = this.getStartComparison();
            ComparisonOperatorType rhsStartComparison;
            rhsStartComparison = that.getStartComparison();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startComparison", lhsStartComparison), LocatorUtils.property(thatLocator, "startComparison", rhsStartComparison), lhsStartComparison, rhsStartComparison, this.isSetStartComparison(), that.isSetStartComparison())) {
                return false;
            }
        }
        {
            ComparisonOperatorType lhsEndComparison;
            lhsEndComparison = this.getEndComparison();
            ComparisonOperatorType rhsEndComparison;
            rhsEndComparison = that.getEndComparison();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endComparison", lhsEndComparison), LocatorUtils.property(thatLocator, "endComparison", rhsEndComparison), lhsEndComparison, rhsEndComparison, this.isSetEndComparison(), that.isSetEndComparison())) {
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
        int currentHashCode = 1;
        {
            double theRangeStart;
            theRangeStart = this.getRangeStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeStart", theRangeStart), currentHashCode, theRangeStart, true);
        }
        {
            double theRangeEnd;
            theRangeEnd = this.getRangeEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeEnd", theRangeEnd), currentHashCode, theRangeEnd, true);
        }
        {
            ComparisonOperatorType theStartComparison;
            theStartComparison = this.getStartComparison();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startComparison", theStartComparison), currentHashCode, theStartComparison, this.isSetStartComparison());
        }
        {
            ComparisonOperatorType theEndComparison;
            theEndComparison = this.getEndComparison();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endComparison", theEndComparison), currentHashCode, theEndComparison, this.isSetEndComparison());
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
        if (draftCopy instanceof RangeBoundsType) {
            final RangeBoundsType copy = ((RangeBoundsType) draftCopy);
            {
                Boolean rangeStartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (rangeStartShouldBeCopiedAndSet == Boolean.TRUE) {
                    double sourceRangeStart;
                    sourceRangeStart = this.getRangeStart();
                    double copyRangeStart = strategy.copy(LocatorUtils.property(locator, "rangeStart", sourceRangeStart), sourceRangeStart, true);
                    copy.setRangeStart(copyRangeStart);
                } else {
                    if (rangeStartShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean rangeEndShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (rangeEndShouldBeCopiedAndSet == Boolean.TRUE) {
                    double sourceRangeEnd;
                    sourceRangeEnd = this.getRangeEnd();
                    double copyRangeEnd = strategy.copy(LocatorUtils.property(locator, "rangeEnd", sourceRangeEnd), sourceRangeEnd, true);
                    copy.setRangeEnd(copyRangeEnd);
                } else {
                    if (rangeEndShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean startComparisonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStartComparison());
                if (startComparisonShouldBeCopiedAndSet == Boolean.TRUE) {
                    ComparisonOperatorType sourceStartComparison;
                    sourceStartComparison = this.getStartComparison();
                    ComparisonOperatorType copyStartComparison = ((ComparisonOperatorType) strategy.copy(LocatorUtils.property(locator, "startComparison", sourceStartComparison), sourceStartComparison, this.isSetStartComparison()));
                    copy.setStartComparison(copyStartComparison);
                } else {
                    if (startComparisonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startComparison = null;
                    }
                }
            }
            {
                Boolean endComparisonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEndComparison());
                if (endComparisonShouldBeCopiedAndSet == Boolean.TRUE) {
                    ComparisonOperatorType sourceEndComparison;
                    sourceEndComparison = this.getEndComparison();
                    ComparisonOperatorType copyEndComparison = ((ComparisonOperatorType) strategy.copy(LocatorUtils.property(locator, "endComparison", sourceEndComparison), sourceEndComparison, this.isSetEndComparison()));
                    copy.setEndComparison(copyEndComparison);
                } else {
                    if (endComparisonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endComparison = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RangeBoundsType();
    }

}


package _int.wmo.def.metce._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
            double theRangeStart;
            theRangeStart = this.getRangeStart();
            strategy.appendField(locator, this, "rangeStart", buffer, theRangeStart, true);
        }
        {
            double theRangeEnd;
            theRangeEnd = this.getRangeEnd();
            strategy.appendField(locator, this, "rangeEnd", buffer, theRangeEnd, true);
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
            double theRangeStart;
            theRangeStart = this.getRangeStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeStart", theRangeStart), currentHashCode, theRangeStart, true);
        }
        {
            double theRangeEnd;
            theRangeEnd = this.getRangeEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeEnd", theRangeEnd), currentHashCode, theRangeEnd, true);
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new RangeBoundsType();
    }

}

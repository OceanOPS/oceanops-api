
package _int.wmo.def.metce._2013;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _int.wmo.def.opm._2013.ObservablePropertyPropertyType;
import net.opengis.gml.v_3_2.AbstractGMLType;
import net.opengis.gml.v_3_2.UnitOfMeasureType;
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
 * <p>Java class for MeasurementContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.opengis.net/gml/3.2}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="measurand" type="{http://def.wmo.int/opm/2013}ObservablePropertyPropertyType"/&gt;
 *         &lt;element name="measuringInterval" type="{http://def.wmo.int/metce/2013}RangeBoundsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="resolutionScale" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementContextType", propOrder = {
    "unitOfMeasure",
    "measurand",
    "measuringInterval",
    "resolutionScale"
})
public class MeasurementContextType
    extends AbstractGMLType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected UnitOfMeasureType unitOfMeasure;
    @XmlElement(required = true)
    protected ObservablePropertyPropertyType measurand;
    protected RangeBoundsPropertyType measuringInterval;
    protected BigInteger resolutionScale;

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
     * Gets the value of the measurand property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public ObservablePropertyPropertyType getMeasurand() {
        return measurand;
    }

    /**
     * Sets the value of the measurand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public void setMeasurand(ObservablePropertyPropertyType value) {
        this.measurand = value;
    }

    public boolean isSetMeasurand() {
        return (this.measurand!= null);
    }

    /**
     * Gets the value of the measuringInterval property.
     * 
     * @return
     *     possible object is
     *     {@link RangeBoundsPropertyType }
     *     
     */
    public RangeBoundsPropertyType getMeasuringInterval() {
        return measuringInterval;
    }

    /**
     * Sets the value of the measuringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeBoundsPropertyType }
     *     
     */
    public void setMeasuringInterval(RangeBoundsPropertyType value) {
        this.measuringInterval = value;
    }

    public boolean isSetMeasuringInterval() {
        return (this.measuringInterval!= null);
    }

    /**
     * Gets the value of the resolutionScale property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolutionScale() {
        return resolutionScale;
    }

    /**
     * Sets the value of the resolutionScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolutionScale(BigInteger value) {
        this.resolutionScale = value;
    }

    public boolean isSetResolutionScale() {
        return (this.resolutionScale!= null);
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
            ObservablePropertyPropertyType theMeasurand;
            theMeasurand = this.getMeasurand();
            strategy.appendField(locator, this, "measurand", buffer, theMeasurand, this.isSetMeasurand());
        }
        {
            RangeBoundsPropertyType theMeasuringInterval;
            theMeasuringInterval = this.getMeasuringInterval();
            strategy.appendField(locator, this, "measuringInterval", buffer, theMeasuringInterval, this.isSetMeasuringInterval());
        }
        {
            BigInteger theResolutionScale;
            theResolutionScale = this.getResolutionScale();
            strategy.appendField(locator, this, "resolutionScale", buffer, theResolutionScale, this.isSetResolutionScale());
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
        final MeasurementContextType that = ((MeasurementContextType) object);
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
            ObservablePropertyPropertyType lhsMeasurand;
            lhsMeasurand = this.getMeasurand();
            ObservablePropertyPropertyType rhsMeasurand;
            rhsMeasurand = that.getMeasurand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurand", lhsMeasurand), LocatorUtils.property(thatLocator, "measurand", rhsMeasurand), lhsMeasurand, rhsMeasurand, this.isSetMeasurand(), that.isSetMeasurand())) {
                return false;
            }
        }
        {
            RangeBoundsPropertyType lhsMeasuringInterval;
            lhsMeasuringInterval = this.getMeasuringInterval();
            RangeBoundsPropertyType rhsMeasuringInterval;
            rhsMeasuringInterval = that.getMeasuringInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measuringInterval", lhsMeasuringInterval), LocatorUtils.property(thatLocator, "measuringInterval", rhsMeasuringInterval), lhsMeasuringInterval, rhsMeasuringInterval, this.isSetMeasuringInterval(), that.isSetMeasuringInterval())) {
                return false;
            }
        }
        {
            BigInteger lhsResolutionScale;
            lhsResolutionScale = this.getResolutionScale();
            BigInteger rhsResolutionScale;
            rhsResolutionScale = that.getResolutionScale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolutionScale", lhsResolutionScale), LocatorUtils.property(thatLocator, "resolutionScale", rhsResolutionScale), lhsResolutionScale, rhsResolutionScale, this.isSetResolutionScale(), that.isSetResolutionScale())) {
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
            ObservablePropertyPropertyType theMeasurand;
            theMeasurand = this.getMeasurand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurand", theMeasurand), currentHashCode, theMeasurand, this.isSetMeasurand());
        }
        {
            RangeBoundsPropertyType theMeasuringInterval;
            theMeasuringInterval = this.getMeasuringInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measuringInterval", theMeasuringInterval), currentHashCode, theMeasuringInterval, this.isSetMeasuringInterval());
        }
        {
            BigInteger theResolutionScale;
            theResolutionScale = this.getResolutionScale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolutionScale", theResolutionScale), currentHashCode, theResolutionScale, this.isSetResolutionScale());
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
        if (draftCopy instanceof MeasurementContextType) {
            final MeasurementContextType copy = ((MeasurementContextType) draftCopy);
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
                Boolean measurandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMeasurand());
                if (measurandShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObservablePropertyPropertyType sourceMeasurand;
                    sourceMeasurand = this.getMeasurand();
                    ObservablePropertyPropertyType copyMeasurand = ((ObservablePropertyPropertyType) strategy.copy(LocatorUtils.property(locator, "measurand", sourceMeasurand), sourceMeasurand, this.isSetMeasurand()));
                    copy.setMeasurand(copyMeasurand);
                } else {
                    if (measurandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurand = null;
                    }
                }
            }
            {
                Boolean measuringIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMeasuringInterval());
                if (measuringIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    RangeBoundsPropertyType sourceMeasuringInterval;
                    sourceMeasuringInterval = this.getMeasuringInterval();
                    RangeBoundsPropertyType copyMeasuringInterval = ((RangeBoundsPropertyType) strategy.copy(LocatorUtils.property(locator, "measuringInterval", sourceMeasuringInterval), sourceMeasuringInterval, this.isSetMeasuringInterval()));
                    copy.setMeasuringInterval(copyMeasuringInterval);
                } else {
                    if (measuringIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measuringInterval = null;
                    }
                }
            }
            {
                Boolean resolutionScaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetResolutionScale());
                if (resolutionScaleShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceResolutionScale;
                    sourceResolutionScale = this.getResolutionScale();
                    BigInteger copyResolutionScale = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "resolutionScale", sourceResolutionScale), sourceResolutionScale, this.isSetResolutionScale()));
                    copy.setResolutionScale(copyResolutionScale);
                } else {
                    if (resolutionScaleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.resolutionScale = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MeasurementContextType();
    }

}


package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractFeatureType;
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
 * <p>Java class for FrequenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequenciesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="frequencyUnit" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="bandwidthUnit" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="purposeOfFrequencyUse" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="frequencyUse" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="transmissionMode" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequenciesType", propOrder = {
    "frequency",
    "frequencyUnit",
    "bandwidth",
    "bandwidthUnit",
    "purposeOfFrequencyUse",
    "frequencyUse",
    "transmissionMode"
})
public class FrequenciesType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected double frequency;
    protected ReferenceType frequencyUnit;
    protected Double bandwidth;
    protected ReferenceType bandwidthUnit;
    @XmlElement(required = true)
    protected ReferenceType purposeOfFrequencyUse;
    @XmlElement(required = true)
    protected ReferenceType frequencyUse;
    protected ReferenceType transmissionMode;

    /**
     * Gets the value of the frequency property.
     * 
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(double value) {
        this.frequency = value;
    }

    public boolean isSetFrequency() {
        return true;
    }

    /**
     * Gets the value of the frequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFrequencyUnit() {
        return frequencyUnit;
    }

    /**
     * Sets the value of the frequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFrequencyUnit(ReferenceType value) {
        this.frequencyUnit = value;
    }

    public boolean isSetFrequencyUnit() {
        return (this.frequencyUnit!= null);
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBandwidth(Double value) {
        this.bandwidth = value;
    }

    public boolean isSetBandwidth() {
        return (this.bandwidth!= null);
    }

    /**
     * Gets the value of the bandwidthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getBandwidthUnit() {
        return bandwidthUnit;
    }

    /**
     * Sets the value of the bandwidthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setBandwidthUnit(ReferenceType value) {
        this.bandwidthUnit = value;
    }

    public boolean isSetBandwidthUnit() {
        return (this.bandwidthUnit!= null);
    }

    /**
     * Gets the value of the purposeOfFrequencyUse property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPurposeOfFrequencyUse() {
        return purposeOfFrequencyUse;
    }

    /**
     * Sets the value of the purposeOfFrequencyUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPurposeOfFrequencyUse(ReferenceType value) {
        this.purposeOfFrequencyUse = value;
    }

    public boolean isSetPurposeOfFrequencyUse() {
        return (this.purposeOfFrequencyUse!= null);
    }

    /**
     * Gets the value of the frequencyUse property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFrequencyUse() {
        return frequencyUse;
    }

    /**
     * Sets the value of the frequencyUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFrequencyUse(ReferenceType value) {
        this.frequencyUse = value;
    }

    public boolean isSetFrequencyUse() {
        return (this.frequencyUse!= null);
    }

    /**
     * Gets the value of the transmissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTransmissionMode() {
        return transmissionMode;
    }

    /**
     * Sets the value of the transmissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTransmissionMode(ReferenceType value) {
        this.transmissionMode = value;
    }

    public boolean isSetTransmissionMode() {
        return (this.transmissionMode!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            double theFrequency;
            theFrequency = this.getFrequency();
            strategy.appendField(locator, this, "frequency", buffer, theFrequency, true);
        }
        {
            ReferenceType theFrequencyUnit;
            theFrequencyUnit = this.getFrequencyUnit();
            strategy.appendField(locator, this, "frequencyUnit", buffer, theFrequencyUnit, this.isSetFrequencyUnit());
        }
        {
            Double theBandwidth;
            theBandwidth = this.getBandwidth();
            strategy.appendField(locator, this, "bandwidth", buffer, theBandwidth, this.isSetBandwidth());
        }
        {
            ReferenceType theBandwidthUnit;
            theBandwidthUnit = this.getBandwidthUnit();
            strategy.appendField(locator, this, "bandwidthUnit", buffer, theBandwidthUnit, this.isSetBandwidthUnit());
        }
        {
            ReferenceType thePurposeOfFrequencyUse;
            thePurposeOfFrequencyUse = this.getPurposeOfFrequencyUse();
            strategy.appendField(locator, this, "purposeOfFrequencyUse", buffer, thePurposeOfFrequencyUse, this.isSetPurposeOfFrequencyUse());
        }
        {
            ReferenceType theFrequencyUse;
            theFrequencyUse = this.getFrequencyUse();
            strategy.appendField(locator, this, "frequencyUse", buffer, theFrequencyUse, this.isSetFrequencyUse());
        }
        {
            ReferenceType theTransmissionMode;
            theTransmissionMode = this.getTransmissionMode();
            strategy.appendField(locator, this, "transmissionMode", buffer, theTransmissionMode, this.isSetTransmissionMode());
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
        final FrequenciesType that = ((FrequenciesType) object);
        {
            double lhsFrequency;
            lhsFrequency = this.getFrequency();
            double rhsFrequency;
            rhsFrequency = that.getFrequency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequency", lhsFrequency), LocatorUtils.property(thatLocator, "frequency", rhsFrequency), lhsFrequency, rhsFrequency, true, true)) {
                return false;
            }
        }
        {
            ReferenceType lhsFrequencyUnit;
            lhsFrequencyUnit = this.getFrequencyUnit();
            ReferenceType rhsFrequencyUnit;
            rhsFrequencyUnit = that.getFrequencyUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequencyUnit", lhsFrequencyUnit), LocatorUtils.property(thatLocator, "frequencyUnit", rhsFrequencyUnit), lhsFrequencyUnit, rhsFrequencyUnit, this.isSetFrequencyUnit(), that.isSetFrequencyUnit())) {
                return false;
            }
        }
        {
            Double lhsBandwidth;
            lhsBandwidth = this.getBandwidth();
            Double rhsBandwidth;
            rhsBandwidth = that.getBandwidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bandwidth", lhsBandwidth), LocatorUtils.property(thatLocator, "bandwidth", rhsBandwidth), lhsBandwidth, rhsBandwidth, this.isSetBandwidth(), that.isSetBandwidth())) {
                return false;
            }
        }
        {
            ReferenceType lhsBandwidthUnit;
            lhsBandwidthUnit = this.getBandwidthUnit();
            ReferenceType rhsBandwidthUnit;
            rhsBandwidthUnit = that.getBandwidthUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bandwidthUnit", lhsBandwidthUnit), LocatorUtils.property(thatLocator, "bandwidthUnit", rhsBandwidthUnit), lhsBandwidthUnit, rhsBandwidthUnit, this.isSetBandwidthUnit(), that.isSetBandwidthUnit())) {
                return false;
            }
        }
        {
            ReferenceType lhsPurposeOfFrequencyUse;
            lhsPurposeOfFrequencyUse = this.getPurposeOfFrequencyUse();
            ReferenceType rhsPurposeOfFrequencyUse;
            rhsPurposeOfFrequencyUse = that.getPurposeOfFrequencyUse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purposeOfFrequencyUse", lhsPurposeOfFrequencyUse), LocatorUtils.property(thatLocator, "purposeOfFrequencyUse", rhsPurposeOfFrequencyUse), lhsPurposeOfFrequencyUse, rhsPurposeOfFrequencyUse, this.isSetPurposeOfFrequencyUse(), that.isSetPurposeOfFrequencyUse())) {
                return false;
            }
        }
        {
            ReferenceType lhsFrequencyUse;
            lhsFrequencyUse = this.getFrequencyUse();
            ReferenceType rhsFrequencyUse;
            rhsFrequencyUse = that.getFrequencyUse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequencyUse", lhsFrequencyUse), LocatorUtils.property(thatLocator, "frequencyUse", rhsFrequencyUse), lhsFrequencyUse, rhsFrequencyUse, this.isSetFrequencyUse(), that.isSetFrequencyUse())) {
                return false;
            }
        }
        {
            ReferenceType lhsTransmissionMode;
            lhsTransmissionMode = this.getTransmissionMode();
            ReferenceType rhsTransmissionMode;
            rhsTransmissionMode = that.getTransmissionMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transmissionMode", lhsTransmissionMode), LocatorUtils.property(thatLocator, "transmissionMode", rhsTransmissionMode), lhsTransmissionMode, rhsTransmissionMode, this.isSetTransmissionMode(), that.isSetTransmissionMode())) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            double theFrequency;
            theFrequency = this.getFrequency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequency", theFrequency), currentHashCode, theFrequency, true);
        }
        {
            ReferenceType theFrequencyUnit;
            theFrequencyUnit = this.getFrequencyUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequencyUnit", theFrequencyUnit), currentHashCode, theFrequencyUnit, this.isSetFrequencyUnit());
        }
        {
            Double theBandwidth;
            theBandwidth = this.getBandwidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bandwidth", theBandwidth), currentHashCode, theBandwidth, this.isSetBandwidth());
        }
        {
            ReferenceType theBandwidthUnit;
            theBandwidthUnit = this.getBandwidthUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bandwidthUnit", theBandwidthUnit), currentHashCode, theBandwidthUnit, this.isSetBandwidthUnit());
        }
        {
            ReferenceType thePurposeOfFrequencyUse;
            thePurposeOfFrequencyUse = this.getPurposeOfFrequencyUse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purposeOfFrequencyUse", thePurposeOfFrequencyUse), currentHashCode, thePurposeOfFrequencyUse, this.isSetPurposeOfFrequencyUse());
        }
        {
            ReferenceType theFrequencyUse;
            theFrequencyUse = this.getFrequencyUse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequencyUse", theFrequencyUse), currentHashCode, theFrequencyUse, this.isSetFrequencyUse());
        }
        {
            ReferenceType theTransmissionMode;
            theTransmissionMode = this.getTransmissionMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transmissionMode", theTransmissionMode), currentHashCode, theTransmissionMode, this.isSetTransmissionMode());
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof FrequenciesType) {
            final FrequenciesType copy = ((FrequenciesType) draftCopy);
            {
                Boolean frequencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (frequencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    double sourceFrequency;
                    sourceFrequency = this.getFrequency();
                    double copyFrequency = strategy.copy(LocatorUtils.property(locator, "frequency", sourceFrequency), sourceFrequency, true);
                    copy.setFrequency(copyFrequency);
                } else {
                    if (frequencyShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean frequencyUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFrequencyUnit());
                if (frequencyUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceFrequencyUnit;
                    sourceFrequencyUnit = this.getFrequencyUnit();
                    ReferenceType copyFrequencyUnit = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "frequencyUnit", sourceFrequencyUnit), sourceFrequencyUnit, this.isSetFrequencyUnit()));
                    copy.setFrequencyUnit(copyFrequencyUnit);
                } else {
                    if (frequencyUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.frequencyUnit = null;
                    }
                }
            }
            {
                Boolean bandwidthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetBandwidth());
                if (bandwidthShouldBeCopiedAndSet == Boolean.TRUE) {
                    Double sourceBandwidth;
                    sourceBandwidth = this.getBandwidth();
                    Double copyBandwidth = ((Double) strategy.copy(LocatorUtils.property(locator, "bandwidth", sourceBandwidth), sourceBandwidth, this.isSetBandwidth()));
                    copy.setBandwidth(copyBandwidth);
                } else {
                    if (bandwidthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bandwidth = null;
                    }
                }
            }
            {
                Boolean bandwidthUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetBandwidthUnit());
                if (bandwidthUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceBandwidthUnit;
                    sourceBandwidthUnit = this.getBandwidthUnit();
                    ReferenceType copyBandwidthUnit = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "bandwidthUnit", sourceBandwidthUnit), sourceBandwidthUnit, this.isSetBandwidthUnit()));
                    copy.setBandwidthUnit(copyBandwidthUnit);
                } else {
                    if (bandwidthUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bandwidthUnit = null;
                    }
                }
            }
            {
                Boolean purposeOfFrequencyUseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPurposeOfFrequencyUse());
                if (purposeOfFrequencyUseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourcePurposeOfFrequencyUse;
                    sourcePurposeOfFrequencyUse = this.getPurposeOfFrequencyUse();
                    ReferenceType copyPurposeOfFrequencyUse = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "purposeOfFrequencyUse", sourcePurposeOfFrequencyUse), sourcePurposeOfFrequencyUse, this.isSetPurposeOfFrequencyUse()));
                    copy.setPurposeOfFrequencyUse(copyPurposeOfFrequencyUse);
                } else {
                    if (purposeOfFrequencyUseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.purposeOfFrequencyUse = null;
                    }
                }
            }
            {
                Boolean frequencyUseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFrequencyUse());
                if (frequencyUseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceFrequencyUse;
                    sourceFrequencyUse = this.getFrequencyUse();
                    ReferenceType copyFrequencyUse = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "frequencyUse", sourceFrequencyUse), sourceFrequencyUse, this.isSetFrequencyUse()));
                    copy.setFrequencyUse(copyFrequencyUse);
                } else {
                    if (frequencyUseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.frequencyUse = null;
                    }
                }
            }
            {
                Boolean transmissionModeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTransmissionMode());
                if (transmissionModeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceTransmissionMode;
                    sourceTransmissionMode = this.getTransmissionMode();
                    ReferenceType copyTransmissionMode = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "transmissionMode", sourceTransmissionMode), sourceTransmissionMode, this.isSetTransmissionMode()));
                    copy.setTransmissionMode(copyTransmissionMode);
                } else {
                    if (transmissionModeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transmissionMode = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FrequenciesType();
    }

}

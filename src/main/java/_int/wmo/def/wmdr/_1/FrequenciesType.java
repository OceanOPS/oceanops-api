
package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.MeasureType;
import net.opengis.gml.v_3_2_1.ReferenceType;
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
 * <p>Java class for FrequenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequenciesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frequency" type="{http://www.opengis.net/gml/3.2}MeasureType"/&gt;
 *         &lt;element name="bandwidth" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="polarization" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
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
    "channel",
    "frequency",
    "bandwidth",
    "polarization",
    "purposeOfFrequencyUse",
    "frequencyUse",
    "transmissionMode"
})
public class FrequenciesType
    extends AbstractFeatureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String channel;
    @XmlElement(required = true)
    protected MeasureType frequency;
    protected MeasureType bandwidth;
    protected ReferenceType polarization;
    @XmlElement(required = true)
    protected ReferenceType purposeOfFrequencyUse;
    @XmlElement(required = true)
    protected ReferenceType frequencyUse;
    protected ReferenceType transmissionMode;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    public boolean isSetChannel() {
        return (this.channel!= null);
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setFrequency(MeasureType value) {
        this.frequency = value;
    }

    public boolean isSetFrequency() {
        return (this.frequency!= null);
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBandwidth(MeasureType value) {
        this.bandwidth = value;
    }

    public boolean isSetBandwidth() {
        return (this.bandwidth!= null);
    }

    /**
     * Gets the value of the polarization property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPolarization() {
        return polarization;
    }

    /**
     * Sets the value of the polarization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPolarization(ReferenceType value) {
        this.polarization = value;
    }

    public boolean isSetPolarization() {
        return (this.polarization!= null);
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
            String theChannel;
            theChannel = this.getChannel();
            strategy.appendField(locator, this, "channel", buffer, theChannel, this.isSetChannel());
        }
        {
            MeasureType theFrequency;
            theFrequency = this.getFrequency();
            strategy.appendField(locator, this, "frequency", buffer, theFrequency, this.isSetFrequency());
        }
        {
            MeasureType theBandwidth;
            theBandwidth = this.getBandwidth();
            strategy.appendField(locator, this, "bandwidth", buffer, theBandwidth, this.isSetBandwidth());
        }
        {
            ReferenceType thePolarization;
            thePolarization = this.getPolarization();
            strategy.appendField(locator, this, "polarization", buffer, thePolarization, this.isSetPolarization());
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
            String lhsChannel;
            lhsChannel = this.getChannel();
            String rhsChannel;
            rhsChannel = that.getChannel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channel", lhsChannel), LocatorUtils.property(thatLocator, "channel", rhsChannel), lhsChannel, rhsChannel, this.isSetChannel(), that.isSetChannel())) {
                return false;
            }
        }
        {
            MeasureType lhsFrequency;
            lhsFrequency = this.getFrequency();
            MeasureType rhsFrequency;
            rhsFrequency = that.getFrequency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequency", lhsFrequency), LocatorUtils.property(thatLocator, "frequency", rhsFrequency), lhsFrequency, rhsFrequency, this.isSetFrequency(), that.isSetFrequency())) {
                return false;
            }
        }
        {
            MeasureType lhsBandwidth;
            lhsBandwidth = this.getBandwidth();
            MeasureType rhsBandwidth;
            rhsBandwidth = that.getBandwidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bandwidth", lhsBandwidth), LocatorUtils.property(thatLocator, "bandwidth", rhsBandwidth), lhsBandwidth, rhsBandwidth, this.isSetBandwidth(), that.isSetBandwidth())) {
                return false;
            }
        }
        {
            ReferenceType lhsPolarization;
            lhsPolarization = this.getPolarization();
            ReferenceType rhsPolarization;
            rhsPolarization = that.getPolarization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "polarization", lhsPolarization), LocatorUtils.property(thatLocator, "polarization", rhsPolarization), lhsPolarization, rhsPolarization, this.isSetPolarization(), that.isSetPolarization())) {
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
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theChannel;
            theChannel = this.getChannel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channel", theChannel), currentHashCode, theChannel, this.isSetChannel());
        }
        {
            MeasureType theFrequency;
            theFrequency = this.getFrequency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequency", theFrequency), currentHashCode, theFrequency, this.isSetFrequency());
        }
        {
            MeasureType theBandwidth;
            theBandwidth = this.getBandwidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bandwidth", theBandwidth), currentHashCode, theBandwidth, this.isSetBandwidth());
        }
        {
            ReferenceType thePolarization;
            thePolarization = this.getPolarization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "polarization", thePolarization), currentHashCode, thePolarization, this.isSetPolarization());
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
        if (draftCopy instanceof FrequenciesType) {
            final FrequenciesType copy = ((FrequenciesType) draftCopy);
            {
                Boolean channelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetChannel());
                if (channelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceChannel;
                    sourceChannel = this.getChannel();
                    String copyChannel = ((String) strategy.copy(LocatorUtils.property(locator, "channel", sourceChannel), sourceChannel, this.isSetChannel()));
                    copy.setChannel(copyChannel);
                } else {
                    if (channelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.channel = null;
                    }
                }
            }
            {
                Boolean frequencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFrequency());
                if (frequencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceFrequency;
                    sourceFrequency = this.getFrequency();
                    MeasureType copyFrequency = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "frequency", sourceFrequency), sourceFrequency, this.isSetFrequency()));
                    copy.setFrequency(copyFrequency);
                } else {
                    if (frequencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.frequency = null;
                    }
                }
            }
            {
                Boolean bandwidthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetBandwidth());
                if (bandwidthShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceBandwidth;
                    sourceBandwidth = this.getBandwidth();
                    MeasureType copyBandwidth = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "bandwidth", sourceBandwidth), sourceBandwidth, this.isSetBandwidth()));
                    copy.setBandwidth(copyBandwidth);
                } else {
                    if (bandwidthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bandwidth = null;
                    }
                }
            }
            {
                Boolean polarizationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPolarization());
                if (polarizationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourcePolarization;
                    sourcePolarization = this.getPolarization();
                    ReferenceType copyPolarization = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "polarization", sourcePolarization), sourcePolarization, this.isSetPolarization()));
                    copy.setPolarization(copyPolarization);
                } else {
                    if (polarizationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.polarization = null;
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

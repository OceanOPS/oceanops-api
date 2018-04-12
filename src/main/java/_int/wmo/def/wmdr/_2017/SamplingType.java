
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 * <p>Java class for SamplingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamplingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samplingStrategy" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="samplingProcedure" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="samplingProcedureDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sampleTreatment" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="temporalSamplingInterval" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="samplingTimePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="spatialSamplingResolution" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="spatialSamplingResolutionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="samplesPerTimePeriod" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplingType", propOrder = {
    "samplingStrategy",
    "samplingProcedure",
    "samplingProcedureDescription",
    "sampleTreatment",
    "temporalSamplingInterval",
    "samplingTimePeriod",
    "spatialSamplingResolution",
    "spatialSamplingResolutionDetails",
    "samplesPerTimePeriod"
})
public class SamplingType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected ReferenceType samplingStrategy;
    protected ReferenceType samplingProcedure;
    protected String samplingProcedureDescription;
    protected ReferenceType sampleTreatment;
    protected Duration temporalSamplingInterval;
    protected Duration samplingTimePeriod;
    protected MeasureType spatialSamplingResolution;
    protected String spatialSamplingResolutionDetails;
    protected MeasureType samplesPerTimePeriod;

    /**
     * Gets the value of the samplingStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSamplingStrategy() {
        return samplingStrategy;
    }

    /**
     * Sets the value of the samplingStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSamplingStrategy(ReferenceType value) {
        this.samplingStrategy = value;
    }

    public boolean isSetSamplingStrategy() {
        return (this.samplingStrategy!= null);
    }

    /**
     * Gets the value of the samplingProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSamplingProcedure() {
        return samplingProcedure;
    }

    /**
     * Sets the value of the samplingProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSamplingProcedure(ReferenceType value) {
        this.samplingProcedure = value;
    }

    public boolean isSetSamplingProcedure() {
        return (this.samplingProcedure!= null);
    }

    /**
     * Gets the value of the samplingProcedureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingProcedureDescription() {
        return samplingProcedureDescription;
    }

    /**
     * Sets the value of the samplingProcedureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingProcedureDescription(String value) {
        this.samplingProcedureDescription = value;
    }

    public boolean isSetSamplingProcedureDescription() {
        return (this.samplingProcedureDescription!= null);
    }

    /**
     * Gets the value of the sampleTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSampleTreatment() {
        return sampleTreatment;
    }

    /**
     * Sets the value of the sampleTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSampleTreatment(ReferenceType value) {
        this.sampleTreatment = value;
    }

    public boolean isSetSampleTreatment() {
        return (this.sampleTreatment!= null);
    }

    /**
     * Gets the value of the temporalSamplingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTemporalSamplingInterval() {
        return temporalSamplingInterval;
    }

    /**
     * Sets the value of the temporalSamplingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTemporalSamplingInterval(Duration value) {
        this.temporalSamplingInterval = value;
    }

    public boolean isSetTemporalSamplingInterval() {
        return (this.temporalSamplingInterval!= null);
    }

    /**
     * Gets the value of the samplingTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSamplingTimePeriod() {
        return samplingTimePeriod;
    }

    /**
     * Sets the value of the samplingTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSamplingTimePeriod(Duration value) {
        this.samplingTimePeriod = value;
    }

    public boolean isSetSamplingTimePeriod() {
        return (this.samplingTimePeriod!= null);
    }

    /**
     * Gets the value of the spatialSamplingResolution property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpatialSamplingResolution() {
        return spatialSamplingResolution;
    }

    /**
     * Sets the value of the spatialSamplingResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpatialSamplingResolution(MeasureType value) {
        this.spatialSamplingResolution = value;
    }

    public boolean isSetSpatialSamplingResolution() {
        return (this.spatialSamplingResolution!= null);
    }

    /**
     * Gets the value of the spatialSamplingResolutionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpatialSamplingResolutionDetails() {
        return spatialSamplingResolutionDetails;
    }

    /**
     * Sets the value of the spatialSamplingResolutionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpatialSamplingResolutionDetails(String value) {
        this.spatialSamplingResolutionDetails = value;
    }

    public boolean isSetSpatialSamplingResolutionDetails() {
        return (this.spatialSamplingResolutionDetails!= null);
    }

    /**
     * Gets the value of the samplesPerTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSamplesPerTimePeriod() {
        return samplesPerTimePeriod;
    }

    /**
     * Sets the value of the samplesPerTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSamplesPerTimePeriod(MeasureType value) {
        this.samplesPerTimePeriod = value;
    }

    public boolean isSetSamplesPerTimePeriod() {
        return (this.samplesPerTimePeriod!= null);
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
        {
            ReferenceType theSamplingStrategy;
            theSamplingStrategy = this.getSamplingStrategy();
            strategy.appendField(locator, this, "samplingStrategy", buffer, theSamplingStrategy, this.isSetSamplingStrategy());
        }
        {
            ReferenceType theSamplingProcedure;
            theSamplingProcedure = this.getSamplingProcedure();
            strategy.appendField(locator, this, "samplingProcedure", buffer, theSamplingProcedure, this.isSetSamplingProcedure());
        }
        {
            String theSamplingProcedureDescription;
            theSamplingProcedureDescription = this.getSamplingProcedureDescription();
            strategy.appendField(locator, this, "samplingProcedureDescription", buffer, theSamplingProcedureDescription, this.isSetSamplingProcedureDescription());
        }
        {
            ReferenceType theSampleTreatment;
            theSampleTreatment = this.getSampleTreatment();
            strategy.appendField(locator, this, "sampleTreatment", buffer, theSampleTreatment, this.isSetSampleTreatment());
        }
        {
            Duration theTemporalSamplingInterval;
            theTemporalSamplingInterval = this.getTemporalSamplingInterval();
            strategy.appendField(locator, this, "temporalSamplingInterval", buffer, theTemporalSamplingInterval, this.isSetTemporalSamplingInterval());
        }
        {
            Duration theSamplingTimePeriod;
            theSamplingTimePeriod = this.getSamplingTimePeriod();
            strategy.appendField(locator, this, "samplingTimePeriod", buffer, theSamplingTimePeriod, this.isSetSamplingTimePeriod());
        }
        {
            MeasureType theSpatialSamplingResolution;
            theSpatialSamplingResolution = this.getSpatialSamplingResolution();
            strategy.appendField(locator, this, "spatialSamplingResolution", buffer, theSpatialSamplingResolution, this.isSetSpatialSamplingResolution());
        }
        {
            String theSpatialSamplingResolutionDetails;
            theSpatialSamplingResolutionDetails = this.getSpatialSamplingResolutionDetails();
            strategy.appendField(locator, this, "spatialSamplingResolutionDetails", buffer, theSpatialSamplingResolutionDetails, this.isSetSpatialSamplingResolutionDetails());
        }
        {
            MeasureType theSamplesPerTimePeriod;
            theSamplesPerTimePeriod = this.getSamplesPerTimePeriod();
            strategy.appendField(locator, this, "samplesPerTimePeriod", buffer, theSamplesPerTimePeriod, this.isSetSamplesPerTimePeriod());
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
        final SamplingType that = ((SamplingType) object);
        {
            ReferenceType lhsSamplingStrategy;
            lhsSamplingStrategy = this.getSamplingStrategy();
            ReferenceType rhsSamplingStrategy;
            rhsSamplingStrategy = that.getSamplingStrategy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "samplingStrategy", lhsSamplingStrategy), LocatorUtils.property(thatLocator, "samplingStrategy", rhsSamplingStrategy), lhsSamplingStrategy, rhsSamplingStrategy, this.isSetSamplingStrategy(), that.isSetSamplingStrategy())) {
                return false;
            }
        }
        {
            ReferenceType lhsSamplingProcedure;
            lhsSamplingProcedure = this.getSamplingProcedure();
            ReferenceType rhsSamplingProcedure;
            rhsSamplingProcedure = that.getSamplingProcedure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "samplingProcedure", lhsSamplingProcedure), LocatorUtils.property(thatLocator, "samplingProcedure", rhsSamplingProcedure), lhsSamplingProcedure, rhsSamplingProcedure, this.isSetSamplingProcedure(), that.isSetSamplingProcedure())) {
                return false;
            }
        }
        {
            String lhsSamplingProcedureDescription;
            lhsSamplingProcedureDescription = this.getSamplingProcedureDescription();
            String rhsSamplingProcedureDescription;
            rhsSamplingProcedureDescription = that.getSamplingProcedureDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "samplingProcedureDescription", lhsSamplingProcedureDescription), LocatorUtils.property(thatLocator, "samplingProcedureDescription", rhsSamplingProcedureDescription), lhsSamplingProcedureDescription, rhsSamplingProcedureDescription, this.isSetSamplingProcedureDescription(), that.isSetSamplingProcedureDescription())) {
                return false;
            }
        }
        {
            ReferenceType lhsSampleTreatment;
            lhsSampleTreatment = this.getSampleTreatment();
            ReferenceType rhsSampleTreatment;
            rhsSampleTreatment = that.getSampleTreatment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleTreatment", lhsSampleTreatment), LocatorUtils.property(thatLocator, "sampleTreatment", rhsSampleTreatment), lhsSampleTreatment, rhsSampleTreatment, this.isSetSampleTreatment(), that.isSetSampleTreatment())) {
                return false;
            }
        }
        {
            Duration lhsTemporalSamplingInterval;
            lhsTemporalSamplingInterval = this.getTemporalSamplingInterval();
            Duration rhsTemporalSamplingInterval;
            rhsTemporalSamplingInterval = that.getTemporalSamplingInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "temporalSamplingInterval", lhsTemporalSamplingInterval), LocatorUtils.property(thatLocator, "temporalSamplingInterval", rhsTemporalSamplingInterval), lhsTemporalSamplingInterval, rhsTemporalSamplingInterval, this.isSetTemporalSamplingInterval(), that.isSetTemporalSamplingInterval())) {
                return false;
            }
        }
        {
            Duration lhsSamplingTimePeriod;
            lhsSamplingTimePeriod = this.getSamplingTimePeriod();
            Duration rhsSamplingTimePeriod;
            rhsSamplingTimePeriod = that.getSamplingTimePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "samplingTimePeriod", lhsSamplingTimePeriod), LocatorUtils.property(thatLocator, "samplingTimePeriod", rhsSamplingTimePeriod), lhsSamplingTimePeriod, rhsSamplingTimePeriod, this.isSetSamplingTimePeriod(), that.isSetSamplingTimePeriod())) {
                return false;
            }
        }
        {
            MeasureType lhsSpatialSamplingResolution;
            lhsSpatialSamplingResolution = this.getSpatialSamplingResolution();
            MeasureType rhsSpatialSamplingResolution;
            rhsSpatialSamplingResolution = that.getSpatialSamplingResolution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spatialSamplingResolution", lhsSpatialSamplingResolution), LocatorUtils.property(thatLocator, "spatialSamplingResolution", rhsSpatialSamplingResolution), lhsSpatialSamplingResolution, rhsSpatialSamplingResolution, this.isSetSpatialSamplingResolution(), that.isSetSpatialSamplingResolution())) {
                return false;
            }
        }
        {
            String lhsSpatialSamplingResolutionDetails;
            lhsSpatialSamplingResolutionDetails = this.getSpatialSamplingResolutionDetails();
            String rhsSpatialSamplingResolutionDetails;
            rhsSpatialSamplingResolutionDetails = that.getSpatialSamplingResolutionDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spatialSamplingResolutionDetails", lhsSpatialSamplingResolutionDetails), LocatorUtils.property(thatLocator, "spatialSamplingResolutionDetails", rhsSpatialSamplingResolutionDetails), lhsSpatialSamplingResolutionDetails, rhsSpatialSamplingResolutionDetails, this.isSetSpatialSamplingResolutionDetails(), that.isSetSpatialSamplingResolutionDetails())) {
                return false;
            }
        }
        {
            MeasureType lhsSamplesPerTimePeriod;
            lhsSamplesPerTimePeriod = this.getSamplesPerTimePeriod();
            MeasureType rhsSamplesPerTimePeriod;
            rhsSamplesPerTimePeriod = that.getSamplesPerTimePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "samplesPerTimePeriod", lhsSamplesPerTimePeriod), LocatorUtils.property(thatLocator, "samplesPerTimePeriod", rhsSamplesPerTimePeriod), lhsSamplesPerTimePeriod, rhsSamplesPerTimePeriod, this.isSetSamplesPerTimePeriod(), that.isSetSamplesPerTimePeriod())) {
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
        int currentHashCode = 1;
        {
            ReferenceType theSamplingStrategy;
            theSamplingStrategy = this.getSamplingStrategy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplingStrategy", theSamplingStrategy), currentHashCode, theSamplingStrategy, this.isSetSamplingStrategy());
        }
        {
            ReferenceType theSamplingProcedure;
            theSamplingProcedure = this.getSamplingProcedure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplingProcedure", theSamplingProcedure), currentHashCode, theSamplingProcedure, this.isSetSamplingProcedure());
        }
        {
            String theSamplingProcedureDescription;
            theSamplingProcedureDescription = this.getSamplingProcedureDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplingProcedureDescription", theSamplingProcedureDescription), currentHashCode, theSamplingProcedureDescription, this.isSetSamplingProcedureDescription());
        }
        {
            ReferenceType theSampleTreatment;
            theSampleTreatment = this.getSampleTreatment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleTreatment", theSampleTreatment), currentHashCode, theSampleTreatment, this.isSetSampleTreatment());
        }
        {
            Duration theTemporalSamplingInterval;
            theTemporalSamplingInterval = this.getTemporalSamplingInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "temporalSamplingInterval", theTemporalSamplingInterval), currentHashCode, theTemporalSamplingInterval, this.isSetTemporalSamplingInterval());
        }
        {
            Duration theSamplingTimePeriod;
            theSamplingTimePeriod = this.getSamplingTimePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplingTimePeriod", theSamplingTimePeriod), currentHashCode, theSamplingTimePeriod, this.isSetSamplingTimePeriod());
        }
        {
            MeasureType theSpatialSamplingResolution;
            theSpatialSamplingResolution = this.getSpatialSamplingResolution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spatialSamplingResolution", theSpatialSamplingResolution), currentHashCode, theSpatialSamplingResolution, this.isSetSpatialSamplingResolution());
        }
        {
            String theSpatialSamplingResolutionDetails;
            theSpatialSamplingResolutionDetails = this.getSpatialSamplingResolutionDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spatialSamplingResolutionDetails", theSpatialSamplingResolutionDetails), currentHashCode, theSpatialSamplingResolutionDetails, this.isSetSpatialSamplingResolutionDetails());
        }
        {
            MeasureType theSamplesPerTimePeriod;
            theSamplesPerTimePeriod = this.getSamplesPerTimePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "samplesPerTimePeriod", theSamplesPerTimePeriod), currentHashCode, theSamplesPerTimePeriod, this.isSetSamplesPerTimePeriod());
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
        if (draftCopy instanceof SamplingType) {
            final SamplingType copy = ((SamplingType) draftCopy);
            {
                Boolean samplingStrategyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSamplingStrategy());
                if (samplingStrategyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceSamplingStrategy;
                    sourceSamplingStrategy = this.getSamplingStrategy();
                    ReferenceType copySamplingStrategy = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "samplingStrategy", sourceSamplingStrategy), sourceSamplingStrategy, this.isSetSamplingStrategy()));
                    copy.setSamplingStrategy(copySamplingStrategy);
                } else {
                    if (samplingStrategyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.samplingStrategy = null;
                    }
                }
            }
            {
                Boolean samplingProcedureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSamplingProcedure());
                if (samplingProcedureShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceSamplingProcedure;
                    sourceSamplingProcedure = this.getSamplingProcedure();
                    ReferenceType copySamplingProcedure = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "samplingProcedure", sourceSamplingProcedure), sourceSamplingProcedure, this.isSetSamplingProcedure()));
                    copy.setSamplingProcedure(copySamplingProcedure);
                } else {
                    if (samplingProcedureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.samplingProcedure = null;
                    }
                }
            }
            {
                Boolean samplingProcedureDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSamplingProcedureDescription());
                if (samplingProcedureDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSamplingProcedureDescription;
                    sourceSamplingProcedureDescription = this.getSamplingProcedureDescription();
                    String copySamplingProcedureDescription = ((String) strategy.copy(LocatorUtils.property(locator, "samplingProcedureDescription", sourceSamplingProcedureDescription), sourceSamplingProcedureDescription, this.isSetSamplingProcedureDescription()));
                    copy.setSamplingProcedureDescription(copySamplingProcedureDescription);
                } else {
                    if (samplingProcedureDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.samplingProcedureDescription = null;
                    }
                }
            }
            {
                Boolean sampleTreatmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSampleTreatment());
                if (sampleTreatmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceSampleTreatment;
                    sourceSampleTreatment = this.getSampleTreatment();
                    ReferenceType copySampleTreatment = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "sampleTreatment", sourceSampleTreatment), sourceSampleTreatment, this.isSetSampleTreatment()));
                    copy.setSampleTreatment(copySampleTreatment);
                } else {
                    if (sampleTreatmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sampleTreatment = null;
                    }
                }
            }
            {
                Boolean temporalSamplingIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTemporalSamplingInterval());
                if (temporalSamplingIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceTemporalSamplingInterval;
                    sourceTemporalSamplingInterval = this.getTemporalSamplingInterval();
                    Duration copyTemporalSamplingInterval = ((Duration) strategy.copy(LocatorUtils.property(locator, "temporalSamplingInterval", sourceTemporalSamplingInterval), sourceTemporalSamplingInterval, this.isSetTemporalSamplingInterval()));
                    copy.setTemporalSamplingInterval(copyTemporalSamplingInterval);
                } else {
                    if (temporalSamplingIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.temporalSamplingInterval = null;
                    }
                }
            }
            {
                Boolean samplingTimePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSamplingTimePeriod());
                if (samplingTimePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceSamplingTimePeriod;
                    sourceSamplingTimePeriod = this.getSamplingTimePeriod();
                    Duration copySamplingTimePeriod = ((Duration) strategy.copy(LocatorUtils.property(locator, "samplingTimePeriod", sourceSamplingTimePeriod), sourceSamplingTimePeriod, this.isSetSamplingTimePeriod()));
                    copy.setSamplingTimePeriod(copySamplingTimePeriod);
                } else {
                    if (samplingTimePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.samplingTimePeriod = null;
                    }
                }
            }
            {
                Boolean spatialSamplingResolutionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSpatialSamplingResolution());
                if (spatialSamplingResolutionShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceSpatialSamplingResolution;
                    sourceSpatialSamplingResolution = this.getSpatialSamplingResolution();
                    MeasureType copySpatialSamplingResolution = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "spatialSamplingResolution", sourceSpatialSamplingResolution), sourceSpatialSamplingResolution, this.isSetSpatialSamplingResolution()));
                    copy.setSpatialSamplingResolution(copySpatialSamplingResolution);
                } else {
                    if (spatialSamplingResolutionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.spatialSamplingResolution = null;
                    }
                }
            }
            {
                Boolean spatialSamplingResolutionDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSpatialSamplingResolutionDetails());
                if (spatialSamplingResolutionDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSpatialSamplingResolutionDetails;
                    sourceSpatialSamplingResolutionDetails = this.getSpatialSamplingResolutionDetails();
                    String copySpatialSamplingResolutionDetails = ((String) strategy.copy(LocatorUtils.property(locator, "spatialSamplingResolutionDetails", sourceSpatialSamplingResolutionDetails), sourceSpatialSamplingResolutionDetails, this.isSetSpatialSamplingResolutionDetails()));
                    copy.setSpatialSamplingResolutionDetails(copySpatialSamplingResolutionDetails);
                } else {
                    if (spatialSamplingResolutionDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.spatialSamplingResolutionDetails = null;
                    }
                }
            }
            {
                Boolean samplesPerTimePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSamplesPerTimePeriod());
                if (samplesPerTimePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceSamplesPerTimePeriod;
                    sourceSamplesPerTimePeriod = this.getSamplesPerTimePeriod();
                    MeasureType copySamplesPerTimePeriod = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "samplesPerTimePeriod", sourceSamplesPerTimePeriod), sourceSamplesPerTimePeriod, this.isSetSamplesPerTimePeriod()));
                    copy.setSamplesPerTimePeriod(copySamplesPerTimePeriod);
                } else {
                    if (samplesPerTimePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.samplesPerTimePeriod = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SamplingType();
    }

}

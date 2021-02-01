
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.TimePeriodPropertyType;
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
 * <p>Java class for DataGenerationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataGenerationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *         &lt;element name="schedule" type="{http://def.wmo.int/wmdr/2017}SchedulePropertyType"/&gt;
 *         &lt;element name="sampling" type="{http://def.wmo.int/wmdr/2017}SamplingPropertyType"/&gt;
 *         &lt;element name="processing" type="{http://def.wmo.int/wmdr/2017}ProcessingPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="reporting" type="{http://def.wmo.int/wmdr/2017}ReportingPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataGenerationType", propOrder = {
    "validPeriod",
    "schedule",
    "sampling",
    "processing",
    "reporting"
})
public class DataGenerationType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TimePeriodPropertyType validPeriod;
    @XmlElement(required = true)
    protected SchedulePropertyType schedule;
    @XmlElement(required = true)
    protected SamplingPropertyType sampling;
    protected ProcessingPropertyType processing;
    @XmlElement(required = true)
    protected ReportingPropertyType reporting;

    /**
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setValidPeriod(TimePeriodPropertyType value) {
        this.validPeriod = value;
    }

    public boolean isSetValidPeriod() {
        return (this.validPeriod!= null);
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link SchedulePropertyType }
     *     
     */
    public SchedulePropertyType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchedulePropertyType }
     *     
     */
    public void setSchedule(SchedulePropertyType value) {
        this.schedule = value;
    }

    public boolean isSetSchedule() {
        return (this.schedule!= null);
    }

    /**
     * Gets the value of the sampling property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingPropertyType }
     *     
     */
    public SamplingPropertyType getSampling() {
        return sampling;
    }

    /**
     * Sets the value of the sampling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingPropertyType }
     *     
     */
    public void setSampling(SamplingPropertyType value) {
        this.sampling = value;
    }

    public boolean isSetSampling() {
        return (this.sampling!= null);
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPropertyType }
     *     
     */
    public ProcessingPropertyType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPropertyType }
     *     
     */
    public void setProcessing(ProcessingPropertyType value) {
        this.processing = value;
    }

    public boolean isSetProcessing() {
        return (this.processing!= null);
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPropertyType }
     *     
     */
    public ReportingPropertyType getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPropertyType }
     *     
     */
    public void setReporting(ReportingPropertyType value) {
        this.reporting = value;
    }

    public boolean isSetReporting() {
        return (this.reporting!= null);
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
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            strategy.appendField(locator, this, "validPeriod", buffer, theValidPeriod, this.isSetValidPeriod());
        }
        {
            SchedulePropertyType theSchedule;
            theSchedule = this.getSchedule();
            strategy.appendField(locator, this, "schedule", buffer, theSchedule, this.isSetSchedule());
        }
        {
            SamplingPropertyType theSampling;
            theSampling = this.getSampling();
            strategy.appendField(locator, this, "sampling", buffer, theSampling, this.isSetSampling());
        }
        {
            ProcessingPropertyType theProcessing;
            theProcessing = this.getProcessing();
            strategy.appendField(locator, this, "processing", buffer, theProcessing, this.isSetProcessing());
        }
        {
            ReportingPropertyType theReporting;
            theReporting = this.getReporting();
            strategy.appendField(locator, this, "reporting", buffer, theReporting, this.isSetReporting());
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
        final DataGenerationType that = ((DataGenerationType) object);
        {
            TimePeriodPropertyType lhsValidPeriod;
            lhsValidPeriod = this.getValidPeriod();
            TimePeriodPropertyType rhsValidPeriod;
            rhsValidPeriod = that.getValidPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validPeriod", lhsValidPeriod), LocatorUtils.property(thatLocator, "validPeriod", rhsValidPeriod), lhsValidPeriod, rhsValidPeriod, this.isSetValidPeriod(), that.isSetValidPeriod())) {
                return false;
            }
        }
        {
            SchedulePropertyType lhsSchedule;
            lhsSchedule = this.getSchedule();
            SchedulePropertyType rhsSchedule;
            rhsSchedule = that.getSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedule", lhsSchedule), LocatorUtils.property(thatLocator, "schedule", rhsSchedule), lhsSchedule, rhsSchedule, this.isSetSchedule(), that.isSetSchedule())) {
                return false;
            }
        }
        {
            SamplingPropertyType lhsSampling;
            lhsSampling = this.getSampling();
            SamplingPropertyType rhsSampling;
            rhsSampling = that.getSampling();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampling", lhsSampling), LocatorUtils.property(thatLocator, "sampling", rhsSampling), lhsSampling, rhsSampling, this.isSetSampling(), that.isSetSampling())) {
                return false;
            }
        }
        {
            ProcessingPropertyType lhsProcessing;
            lhsProcessing = this.getProcessing();
            ProcessingPropertyType rhsProcessing;
            rhsProcessing = that.getProcessing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processing", lhsProcessing), LocatorUtils.property(thatLocator, "processing", rhsProcessing), lhsProcessing, rhsProcessing, this.isSetProcessing(), that.isSetProcessing())) {
                return false;
            }
        }
        {
            ReportingPropertyType lhsReporting;
            lhsReporting = this.getReporting();
            ReportingPropertyType rhsReporting;
            rhsReporting = that.getReporting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reporting", lhsReporting), LocatorUtils.property(thatLocator, "reporting", rhsReporting), lhsReporting, rhsReporting, this.isSetReporting(), that.isSetReporting())) {
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
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
        }
        {
            SchedulePropertyType theSchedule;
            theSchedule = this.getSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedule", theSchedule), currentHashCode, theSchedule, this.isSetSchedule());
        }
        {
            SamplingPropertyType theSampling;
            theSampling = this.getSampling();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampling", theSampling), currentHashCode, theSampling, this.isSetSampling());
        }
        {
            ProcessingPropertyType theProcessing;
            theProcessing = this.getProcessing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processing", theProcessing), currentHashCode, theProcessing, this.isSetProcessing());
        }
        {
            ReportingPropertyType theReporting;
            theReporting = this.getReporting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reporting", theReporting), currentHashCode, theReporting, this.isSetReporting());
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
        if (draftCopy instanceof DataGenerationType) {
            final DataGenerationType copy = ((DataGenerationType) draftCopy);
            {
                Boolean validPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetValidPeriod());
                if (validPeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodPropertyType sourceValidPeriod;
                    sourceValidPeriod = this.getValidPeriod();
                    TimePeriodPropertyType copyValidPeriod = ((TimePeriodPropertyType) strategy.copy(LocatorUtils.property(locator, "validPeriod", sourceValidPeriod), sourceValidPeriod, this.isSetValidPeriod()));
                    copy.setValidPeriod(copyValidPeriod);
                } else {
                    if (validPeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validPeriod = null;
                    }
                }
            }
            {
                Boolean scheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSchedule());
                if (scheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    SchedulePropertyType sourceSchedule;
                    sourceSchedule = this.getSchedule();
                    SchedulePropertyType copySchedule = ((SchedulePropertyType) strategy.copy(LocatorUtils.property(locator, "schedule", sourceSchedule), sourceSchedule, this.isSetSchedule()));
                    copy.setSchedule(copySchedule);
                } else {
                    if (scheduleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schedule = null;
                    }
                }
            }
            {
                Boolean samplingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSampling());
                if (samplingShouldBeCopiedAndSet == Boolean.TRUE) {
                    SamplingPropertyType sourceSampling;
                    sourceSampling = this.getSampling();
                    SamplingPropertyType copySampling = ((SamplingPropertyType) strategy.copy(LocatorUtils.property(locator, "sampling", sourceSampling), sourceSampling, this.isSetSampling()));
                    copy.setSampling(copySampling);
                } else {
                    if (samplingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sampling = null;
                    }
                }
            }
            {
                Boolean processingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProcessing());
                if (processingShouldBeCopiedAndSet == Boolean.TRUE) {
                    ProcessingPropertyType sourceProcessing;
                    sourceProcessing = this.getProcessing();
                    ProcessingPropertyType copyProcessing = ((ProcessingPropertyType) strategy.copy(LocatorUtils.property(locator, "processing", sourceProcessing), sourceProcessing, this.isSetProcessing()));
                    copy.setProcessing(copyProcessing);
                } else {
                    if (processingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.processing = null;
                    }
                }
            }
            {
                Boolean reportingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetReporting());
                if (reportingShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReportingPropertyType sourceReporting;
                    sourceReporting = this.getReporting();
                    ReportingPropertyType copyReporting = ((ReportingPropertyType) strategy.copy(LocatorUtils.property(locator, "reporting", sourceReporting), sourceReporting, this.isSetReporting()));
                    copy.setReporting(copyReporting);
                } else {
                    if (reportingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reporting = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DataGenerationType();
    }

}

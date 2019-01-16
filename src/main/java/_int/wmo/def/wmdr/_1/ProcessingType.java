
package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 * <p>Java class for ProcessingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processingCentre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aggregationPeriod" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="dataProcessing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="softwareDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="softwareURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingType", propOrder = {
    "processingCentre",
    "aggregationPeriod",
    "dataProcessing",
    "softwareDetails",
    "softwareURL"
})
public class ProcessingType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String processingCentre;
    protected Duration aggregationPeriod;
    protected String dataProcessing;
    protected String softwareDetails;
    @XmlSchemaType(name = "anyURI")
    protected String softwareURL;

    /**
     * Gets the value of the processingCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCentre() {
        return processingCentre;
    }

    /**
     * Sets the value of the processingCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCentre(String value) {
        this.processingCentre = value;
    }

    public boolean isSetProcessingCentre() {
        return (this.processingCentre!= null);
    }

    /**
     * Gets the value of the aggregationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAggregationPeriod() {
        return aggregationPeriod;
    }

    /**
     * Sets the value of the aggregationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAggregationPeriod(Duration value) {
        this.aggregationPeriod = value;
    }

    public boolean isSetAggregationPeriod() {
        return (this.aggregationPeriod!= null);
    }

    /**
     * Gets the value of the dataProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProcessing() {
        return dataProcessing;
    }

    /**
     * Sets the value of the dataProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProcessing(String value) {
        this.dataProcessing = value;
    }

    public boolean isSetDataProcessing() {
        return (this.dataProcessing!= null);
    }

    /**
     * Gets the value of the softwareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareDetails() {
        return softwareDetails;
    }

    /**
     * Sets the value of the softwareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareDetails(String value) {
        this.softwareDetails = value;
    }

    public boolean isSetSoftwareDetails() {
        return (this.softwareDetails!= null);
    }

    /**
     * Gets the value of the softwareURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareURL() {
        return softwareURL;
    }

    /**
     * Sets the value of the softwareURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareURL(String value) {
        this.softwareURL = value;
    }

    public boolean isSetSoftwareURL() {
        return (this.softwareURL!= null);
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
            String theProcessingCentre;
            theProcessingCentre = this.getProcessingCentre();
            strategy.appendField(locator, this, "processingCentre", buffer, theProcessingCentre, this.isSetProcessingCentre());
        }
        {
            Duration theAggregationPeriod;
            theAggregationPeriod = this.getAggregationPeriod();
            strategy.appendField(locator, this, "aggregationPeriod", buffer, theAggregationPeriod, this.isSetAggregationPeriod());
        }
        {
            String theDataProcessing;
            theDataProcessing = this.getDataProcessing();
            strategy.appendField(locator, this, "dataProcessing", buffer, theDataProcessing, this.isSetDataProcessing());
        }
        {
            String theSoftwareDetails;
            theSoftwareDetails = this.getSoftwareDetails();
            strategy.appendField(locator, this, "softwareDetails", buffer, theSoftwareDetails, this.isSetSoftwareDetails());
        }
        {
            String theSoftwareURL;
            theSoftwareURL = this.getSoftwareURL();
            strategy.appendField(locator, this, "softwareURL", buffer, theSoftwareURL, this.isSetSoftwareURL());
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
        final ProcessingType that = ((ProcessingType) object);
        {
            String lhsProcessingCentre;
            lhsProcessingCentre = this.getProcessingCentre();
            String rhsProcessingCentre;
            rhsProcessingCentre = that.getProcessingCentre();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processingCentre", lhsProcessingCentre), LocatorUtils.property(thatLocator, "processingCentre", rhsProcessingCentre), lhsProcessingCentre, rhsProcessingCentre, this.isSetProcessingCentre(), that.isSetProcessingCentre())) {
                return false;
            }
        }
        {
            Duration lhsAggregationPeriod;
            lhsAggregationPeriod = this.getAggregationPeriod();
            Duration rhsAggregationPeriod;
            rhsAggregationPeriod = that.getAggregationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationPeriod", lhsAggregationPeriod), LocatorUtils.property(thatLocator, "aggregationPeriod", rhsAggregationPeriod), lhsAggregationPeriod, rhsAggregationPeriod, this.isSetAggregationPeriod(), that.isSetAggregationPeriod())) {
                return false;
            }
        }
        {
            String lhsDataProcessing;
            lhsDataProcessing = this.getDataProcessing();
            String rhsDataProcessing;
            rhsDataProcessing = that.getDataProcessing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataProcessing", lhsDataProcessing), LocatorUtils.property(thatLocator, "dataProcessing", rhsDataProcessing), lhsDataProcessing, rhsDataProcessing, this.isSetDataProcessing(), that.isSetDataProcessing())) {
                return false;
            }
        }
        {
            String lhsSoftwareDetails;
            lhsSoftwareDetails = this.getSoftwareDetails();
            String rhsSoftwareDetails;
            rhsSoftwareDetails = that.getSoftwareDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "softwareDetails", lhsSoftwareDetails), LocatorUtils.property(thatLocator, "softwareDetails", rhsSoftwareDetails), lhsSoftwareDetails, rhsSoftwareDetails, this.isSetSoftwareDetails(), that.isSetSoftwareDetails())) {
                return false;
            }
        }
        {
            String lhsSoftwareURL;
            lhsSoftwareURL = this.getSoftwareURL();
            String rhsSoftwareURL;
            rhsSoftwareURL = that.getSoftwareURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "softwareURL", lhsSoftwareURL), LocatorUtils.property(thatLocator, "softwareURL", rhsSoftwareURL), lhsSoftwareURL, rhsSoftwareURL, this.isSetSoftwareURL(), that.isSetSoftwareURL())) {
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
            String theProcessingCentre;
            theProcessingCentre = this.getProcessingCentre();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processingCentre", theProcessingCentre), currentHashCode, theProcessingCentre, this.isSetProcessingCentre());
        }
        {
            Duration theAggregationPeriod;
            theAggregationPeriod = this.getAggregationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationPeriod", theAggregationPeriod), currentHashCode, theAggregationPeriod, this.isSetAggregationPeriod());
        }
        {
            String theDataProcessing;
            theDataProcessing = this.getDataProcessing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataProcessing", theDataProcessing), currentHashCode, theDataProcessing, this.isSetDataProcessing());
        }
        {
            String theSoftwareDetails;
            theSoftwareDetails = this.getSoftwareDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "softwareDetails", theSoftwareDetails), currentHashCode, theSoftwareDetails, this.isSetSoftwareDetails());
        }
        {
            String theSoftwareURL;
            theSoftwareURL = this.getSoftwareURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "softwareURL", theSoftwareURL), currentHashCode, theSoftwareURL, this.isSetSoftwareURL());
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
        if (draftCopy instanceof ProcessingType) {
            final ProcessingType copy = ((ProcessingType) draftCopy);
            {
                Boolean processingCentreShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProcessingCentre());
                if (processingCentreShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProcessingCentre;
                    sourceProcessingCentre = this.getProcessingCentre();
                    String copyProcessingCentre = ((String) strategy.copy(LocatorUtils.property(locator, "processingCentre", sourceProcessingCentre), sourceProcessingCentre, this.isSetProcessingCentre()));
                    copy.setProcessingCentre(copyProcessingCentre);
                } else {
                    if (processingCentreShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.processingCentre = null;
                    }
                }
            }
            {
                Boolean aggregationPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAggregationPeriod());
                if (aggregationPeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceAggregationPeriod;
                    sourceAggregationPeriod = this.getAggregationPeriod();
                    Duration copyAggregationPeriod = ((Duration) strategy.copy(LocatorUtils.property(locator, "aggregationPeriod", sourceAggregationPeriod), sourceAggregationPeriod, this.isSetAggregationPeriod()));
                    copy.setAggregationPeriod(copyAggregationPeriod);
                } else {
                    if (aggregationPeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aggregationPeriod = null;
                    }
                }
            }
            {
                Boolean dataProcessingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataProcessing());
                if (dataProcessingShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDataProcessing;
                    sourceDataProcessing = this.getDataProcessing();
                    String copyDataProcessing = ((String) strategy.copy(LocatorUtils.property(locator, "dataProcessing", sourceDataProcessing), sourceDataProcessing, this.isSetDataProcessing()));
                    copy.setDataProcessing(copyDataProcessing);
                } else {
                    if (dataProcessingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataProcessing = null;
                    }
                }
            }
            {
                Boolean softwareDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSoftwareDetails());
                if (softwareDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSoftwareDetails;
                    sourceSoftwareDetails = this.getSoftwareDetails();
                    String copySoftwareDetails = ((String) strategy.copy(LocatorUtils.property(locator, "softwareDetails", sourceSoftwareDetails), sourceSoftwareDetails, this.isSetSoftwareDetails()));
                    copy.setSoftwareDetails(copySoftwareDetails);
                } else {
                    if (softwareDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.softwareDetails = null;
                    }
                }
            }
            {
                Boolean softwareURLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSoftwareURL());
                if (softwareURLShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSoftwareURL;
                    sourceSoftwareURL = this.getSoftwareURL();
                    String copySoftwareURL = ((String) strategy.copy(LocatorUtils.property(locator, "softwareURL", sourceSoftwareURL), sourceSoftwareURL, this.isSetSoftwareURL()));
                    copy.setSoftwareURL(copySoftwareURL);
                } else {
                    if (softwareURLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.softwareURL = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProcessingType();
    }

}

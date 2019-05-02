
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import net.opengis.gml.v_3_2_1.AbstractMemberType;
import net.opengis.gml.v_3_2_1.MeasureType;
import net.opengis.gml.v_3_2_1.ReferenceType;
import net.opengis.gml.v_3_2_1.VerticalDatumType;
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
 * <p>Java class for ReportingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internationalExchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="uom" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="spatialReportingInterval" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="temporalReportingInterval" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="timeStampMeaning" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="referenceDatum" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}VerticalDatum"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataPolicy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}DataPolicy"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numberOfObservationsInReportingInterval" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="referenceTimeSource" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="levelOfData" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="dataFormat" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="officialStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dataFormatVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeliness" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="numericalResolution" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingType", propOrder = {
    "internationalExchange",
    "uom",
    "spatialReportingInterval",
    "temporalReportingInterval",
    "timeStampMeaning",
    "referenceDatum",
    "dataPolicy",
    "numberOfObservationsInReportingInterval",
    "referenceTimeSource",
    "levelOfData",
    "dataFormat",
    "officialStatus",
    "dataFormatVersion",
    "timeliness",
    "numericalResolution"
})
public class ReportingType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected boolean internationalExchange;
    @XmlElement(required = true)
    protected ReferenceType uom;
    protected MeasureType spatialReportingInterval;
    @XmlElement(required = true)
    protected Duration temporalReportingInterval;
    protected ReferenceType timeStampMeaning;
    protected ReportingType.ReferenceDatum referenceDatum;
    protected ReportingType.DataPolicy dataPolicy;
    protected BigInteger numberOfObservationsInReportingInterval;
    protected ReferenceType referenceTimeSource;
    protected ReferenceType levelOfData;
    protected ReferenceType dataFormat;
    protected Boolean officialStatus;
    protected String dataFormatVersion;
    protected Duration timeliness;
    protected MeasureType numericalResolution;

    /**
     * Gets the value of the internationalExchange property.
     * 
     */
    public boolean isInternationalExchange() {
        return internationalExchange;
    }

    /**
     * Sets the value of the internationalExchange property.
     * 
     */
    public void setInternationalExchange(boolean value) {
        this.internationalExchange = value;
    }

    public boolean isSetInternationalExchange() {
        return true;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUom(ReferenceType value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
    }

    /**
     * Gets the value of the spatialReportingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpatialReportingInterval() {
        return spatialReportingInterval;
    }

    /**
     * Sets the value of the spatialReportingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpatialReportingInterval(MeasureType value) {
        this.spatialReportingInterval = value;
    }

    public boolean isSetSpatialReportingInterval() {
        return (this.spatialReportingInterval!= null);
    }

    /**
     * Gets the value of the temporalReportingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTemporalReportingInterval() {
        return temporalReportingInterval;
    }

    /**
     * Sets the value of the temporalReportingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTemporalReportingInterval(Duration value) {
        this.temporalReportingInterval = value;
    }

    public boolean isSetTemporalReportingInterval() {
        return (this.temporalReportingInterval!= null);
    }

    /**
     * Gets the value of the timeStampMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTimeStampMeaning() {
        return timeStampMeaning;
    }

    /**
     * Sets the value of the timeStampMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTimeStampMeaning(ReferenceType value) {
        this.timeStampMeaning = value;
    }

    public boolean isSetTimeStampMeaning() {
        return (this.timeStampMeaning!= null);
    }

    /**
     * Gets the value of the referenceDatum property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingType.ReferenceDatum }
     *     
     */
    public ReportingType.ReferenceDatum getReferenceDatum() {
        return referenceDatum;
    }

    /**
     * Sets the value of the referenceDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingType.ReferenceDatum }
     *     
     */
    public void setReferenceDatum(ReportingType.ReferenceDatum value) {
        this.referenceDatum = value;
    }

    public boolean isSetReferenceDatum() {
        return (this.referenceDatum!= null);
    }

    /**
     * Gets the value of the dataPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingType.DataPolicy }
     *     
     */
    public ReportingType.DataPolicy getDataPolicy() {
        return dataPolicy;
    }

    /**
     * Sets the value of the dataPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingType.DataPolicy }
     *     
     */
    public void setDataPolicy(ReportingType.DataPolicy value) {
        this.dataPolicy = value;
    }

    public boolean isSetDataPolicy() {
        return (this.dataPolicy!= null);
    }

    /**
     * Gets the value of the numberOfObservationsInReportingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfObservationsInReportingInterval() {
        return numberOfObservationsInReportingInterval;
    }

    /**
     * Sets the value of the numberOfObservationsInReportingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfObservationsInReportingInterval(BigInteger value) {
        this.numberOfObservationsInReportingInterval = value;
    }

    public boolean isSetNumberOfObservationsInReportingInterval() {
        return (this.numberOfObservationsInReportingInterval!= null);
    }

    /**
     * Gets the value of the referenceTimeSource property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReferenceTimeSource() {
        return referenceTimeSource;
    }

    /**
     * Sets the value of the referenceTimeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReferenceTimeSource(ReferenceType value) {
        this.referenceTimeSource = value;
    }

    public boolean isSetReferenceTimeSource() {
        return (this.referenceTimeSource!= null);
    }

    /**
     * Gets the value of the levelOfData property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLevelOfData() {
        return levelOfData;
    }

    /**
     * Sets the value of the levelOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLevelOfData(ReferenceType value) {
        this.levelOfData = value;
    }

    public boolean isSetLevelOfData() {
        return (this.levelOfData!= null);
    }

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDataFormat(ReferenceType value) {
        this.dataFormat = value;
    }

    public boolean isSetDataFormat() {
        return (this.dataFormat!= null);
    }

    /**
     * Gets the value of the officialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficialStatus() {
        return officialStatus;
    }

    /**
     * Sets the value of the officialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficialStatus(Boolean value) {
        this.officialStatus = value;
    }

    public boolean isSetOfficialStatus() {
        return (this.officialStatus!= null);
    }

    /**
     * Gets the value of the dataFormatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormatVersion() {
        return dataFormatVersion;
    }

    /**
     * Sets the value of the dataFormatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormatVersion(String value) {
        this.dataFormatVersion = value;
    }

    public boolean isSetDataFormatVersion() {
        return (this.dataFormatVersion!= null);
    }

    /**
     * Gets the value of the timeliness property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeliness() {
        return timeliness;
    }

    /**
     * Sets the value of the timeliness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeliness(Duration value) {
        this.timeliness = value;
    }

    public boolean isSetTimeliness() {
        return (this.timeliness!= null);
    }

    /**
     * Gets the value of the numericalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNumericalResolution() {
        return numericalResolution;
    }

    /**
     * Sets the value of the numericalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNumericalResolution(MeasureType value) {
        this.numericalResolution = value;
    }

    public boolean isSetNumericalResolution() {
        return (this.numericalResolution!= null);
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
            boolean theInternationalExchange;
            theInternationalExchange = this.isInternationalExchange();
            strategy.appendField(locator, this, "internationalExchange", buffer, theInternationalExchange, true);
        }
        {
            ReferenceType theUom;
            theUom = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theUom, this.isSetUom());
        }
        {
            MeasureType theSpatialReportingInterval;
            theSpatialReportingInterval = this.getSpatialReportingInterval();
            strategy.appendField(locator, this, "spatialReportingInterval", buffer, theSpatialReportingInterval, this.isSetSpatialReportingInterval());
        }
        {
            Duration theTemporalReportingInterval;
            theTemporalReportingInterval = this.getTemporalReportingInterval();
            strategy.appendField(locator, this, "temporalReportingInterval", buffer, theTemporalReportingInterval, this.isSetTemporalReportingInterval());
        }
        {
            ReferenceType theTimeStampMeaning;
            theTimeStampMeaning = this.getTimeStampMeaning();
            strategy.appendField(locator, this, "timeStampMeaning", buffer, theTimeStampMeaning, this.isSetTimeStampMeaning());
        }
        {
            ReportingType.ReferenceDatum theReferenceDatum;
            theReferenceDatum = this.getReferenceDatum();
            strategy.appendField(locator, this, "referenceDatum", buffer, theReferenceDatum, this.isSetReferenceDatum());
        }
        {
            ReportingType.DataPolicy theDataPolicy;
            theDataPolicy = this.getDataPolicy();
            strategy.appendField(locator, this, "dataPolicy", buffer, theDataPolicy, this.isSetDataPolicy());
        }
        {
            BigInteger theNumberOfObservationsInReportingInterval;
            theNumberOfObservationsInReportingInterval = this.getNumberOfObservationsInReportingInterval();
            strategy.appendField(locator, this, "numberOfObservationsInReportingInterval", buffer, theNumberOfObservationsInReportingInterval, this.isSetNumberOfObservationsInReportingInterval());
        }
        {
            ReferenceType theReferenceTimeSource;
            theReferenceTimeSource = this.getReferenceTimeSource();
            strategy.appendField(locator, this, "referenceTimeSource", buffer, theReferenceTimeSource, this.isSetReferenceTimeSource());
        }
        {
            ReferenceType theLevelOfData;
            theLevelOfData = this.getLevelOfData();
            strategy.appendField(locator, this, "levelOfData", buffer, theLevelOfData, this.isSetLevelOfData());
        }
        {
            ReferenceType theDataFormat;
            theDataFormat = this.getDataFormat();
            strategy.appendField(locator, this, "dataFormat", buffer, theDataFormat, this.isSetDataFormat());
        }
        {
            Boolean theOfficialStatus;
            theOfficialStatus = this.isOfficialStatus();
            strategy.appendField(locator, this, "officialStatus", buffer, theOfficialStatus, this.isSetOfficialStatus());
        }
        {
            String theDataFormatVersion;
            theDataFormatVersion = this.getDataFormatVersion();
            strategy.appendField(locator, this, "dataFormatVersion", buffer, theDataFormatVersion, this.isSetDataFormatVersion());
        }
        {
            Duration theTimeliness;
            theTimeliness = this.getTimeliness();
            strategy.appendField(locator, this, "timeliness", buffer, theTimeliness, this.isSetTimeliness());
        }
        {
            MeasureType theNumericalResolution;
            theNumericalResolution = this.getNumericalResolution();
            strategy.appendField(locator, this, "numericalResolution", buffer, theNumericalResolution, this.isSetNumericalResolution());
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
        final ReportingType that = ((ReportingType) object);
        {
            boolean lhsInternationalExchange;
            lhsInternationalExchange = this.isInternationalExchange();
            boolean rhsInternationalExchange;
            rhsInternationalExchange = that.isInternationalExchange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internationalExchange", lhsInternationalExchange), LocatorUtils.property(thatLocator, "internationalExchange", rhsInternationalExchange), lhsInternationalExchange, rhsInternationalExchange, true, true)) {
                return false;
            }
        }
        {
            ReferenceType lhsUom;
            lhsUom = this.getUom();
            ReferenceType rhsUom;
            rhsUom = that.getUom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uom", lhsUom), LocatorUtils.property(thatLocator, "uom", rhsUom), lhsUom, rhsUom, this.isSetUom(), that.isSetUom())) {
                return false;
            }
        }
        {
            MeasureType lhsSpatialReportingInterval;
            lhsSpatialReportingInterval = this.getSpatialReportingInterval();
            MeasureType rhsSpatialReportingInterval;
            rhsSpatialReportingInterval = that.getSpatialReportingInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spatialReportingInterval", lhsSpatialReportingInterval), LocatorUtils.property(thatLocator, "spatialReportingInterval", rhsSpatialReportingInterval), lhsSpatialReportingInterval, rhsSpatialReportingInterval, this.isSetSpatialReportingInterval(), that.isSetSpatialReportingInterval())) {
                return false;
            }
        }
        {
            Duration lhsTemporalReportingInterval;
            lhsTemporalReportingInterval = this.getTemporalReportingInterval();
            Duration rhsTemporalReportingInterval;
            rhsTemporalReportingInterval = that.getTemporalReportingInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "temporalReportingInterval", lhsTemporalReportingInterval), LocatorUtils.property(thatLocator, "temporalReportingInterval", rhsTemporalReportingInterval), lhsTemporalReportingInterval, rhsTemporalReportingInterval, this.isSetTemporalReportingInterval(), that.isSetTemporalReportingInterval())) {
                return false;
            }
        }
        {
            ReferenceType lhsTimeStampMeaning;
            lhsTimeStampMeaning = this.getTimeStampMeaning();
            ReferenceType rhsTimeStampMeaning;
            rhsTimeStampMeaning = that.getTimeStampMeaning();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStampMeaning", lhsTimeStampMeaning), LocatorUtils.property(thatLocator, "timeStampMeaning", rhsTimeStampMeaning), lhsTimeStampMeaning, rhsTimeStampMeaning, this.isSetTimeStampMeaning(), that.isSetTimeStampMeaning())) {
                return false;
            }
        }
        {
            ReportingType.ReferenceDatum lhsReferenceDatum;
            lhsReferenceDatum = this.getReferenceDatum();
            ReportingType.ReferenceDatum rhsReferenceDatum;
            rhsReferenceDatum = that.getReferenceDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDatum", lhsReferenceDatum), LocatorUtils.property(thatLocator, "referenceDatum", rhsReferenceDatum), lhsReferenceDatum, rhsReferenceDatum, this.isSetReferenceDatum(), that.isSetReferenceDatum())) {
                return false;
            }
        }
        {
            ReportingType.DataPolicy lhsDataPolicy;
            lhsDataPolicy = this.getDataPolicy();
            ReportingType.DataPolicy rhsDataPolicy;
            rhsDataPolicy = that.getDataPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataPolicy", lhsDataPolicy), LocatorUtils.property(thatLocator, "dataPolicy", rhsDataPolicy), lhsDataPolicy, rhsDataPolicy, this.isSetDataPolicy(), that.isSetDataPolicy())) {
                return false;
            }
        }
        {
            BigInteger lhsNumberOfObservationsInReportingInterval;
            lhsNumberOfObservationsInReportingInterval = this.getNumberOfObservationsInReportingInterval();
            BigInteger rhsNumberOfObservationsInReportingInterval;
            rhsNumberOfObservationsInReportingInterval = that.getNumberOfObservationsInReportingInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfObservationsInReportingInterval", lhsNumberOfObservationsInReportingInterval), LocatorUtils.property(thatLocator, "numberOfObservationsInReportingInterval", rhsNumberOfObservationsInReportingInterval), lhsNumberOfObservationsInReportingInterval, rhsNumberOfObservationsInReportingInterval, this.isSetNumberOfObservationsInReportingInterval(), that.isSetNumberOfObservationsInReportingInterval())) {
                return false;
            }
        }
        {
            ReferenceType lhsReferenceTimeSource;
            lhsReferenceTimeSource = this.getReferenceTimeSource();
            ReferenceType rhsReferenceTimeSource;
            rhsReferenceTimeSource = that.getReferenceTimeSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceTimeSource", lhsReferenceTimeSource), LocatorUtils.property(thatLocator, "referenceTimeSource", rhsReferenceTimeSource), lhsReferenceTimeSource, rhsReferenceTimeSource, this.isSetReferenceTimeSource(), that.isSetReferenceTimeSource())) {
                return false;
            }
        }
        {
            ReferenceType lhsLevelOfData;
            lhsLevelOfData = this.getLevelOfData();
            ReferenceType rhsLevelOfData;
            rhsLevelOfData = that.getLevelOfData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "levelOfData", lhsLevelOfData), LocatorUtils.property(thatLocator, "levelOfData", rhsLevelOfData), lhsLevelOfData, rhsLevelOfData, this.isSetLevelOfData(), that.isSetLevelOfData())) {
                return false;
            }
        }
        {
            ReferenceType lhsDataFormat;
            lhsDataFormat = this.getDataFormat();
            ReferenceType rhsDataFormat;
            rhsDataFormat = that.getDataFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataFormat", lhsDataFormat), LocatorUtils.property(thatLocator, "dataFormat", rhsDataFormat), lhsDataFormat, rhsDataFormat, this.isSetDataFormat(), that.isSetDataFormat())) {
                return false;
            }
        }
        {
            Boolean lhsOfficialStatus;
            lhsOfficialStatus = this.isOfficialStatus();
            Boolean rhsOfficialStatus;
            rhsOfficialStatus = that.isOfficialStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "officialStatus", lhsOfficialStatus), LocatorUtils.property(thatLocator, "officialStatus", rhsOfficialStatus), lhsOfficialStatus, rhsOfficialStatus, this.isSetOfficialStatus(), that.isSetOfficialStatus())) {
                return false;
            }
        }
        {
            String lhsDataFormatVersion;
            lhsDataFormatVersion = this.getDataFormatVersion();
            String rhsDataFormatVersion;
            rhsDataFormatVersion = that.getDataFormatVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataFormatVersion", lhsDataFormatVersion), LocatorUtils.property(thatLocator, "dataFormatVersion", rhsDataFormatVersion), lhsDataFormatVersion, rhsDataFormatVersion, this.isSetDataFormatVersion(), that.isSetDataFormatVersion())) {
                return false;
            }
        }
        {
            Duration lhsTimeliness;
            lhsTimeliness = this.getTimeliness();
            Duration rhsTimeliness;
            rhsTimeliness = that.getTimeliness();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeliness", lhsTimeliness), LocatorUtils.property(thatLocator, "timeliness", rhsTimeliness), lhsTimeliness, rhsTimeliness, this.isSetTimeliness(), that.isSetTimeliness())) {
                return false;
            }
        }
        {
            MeasureType lhsNumericalResolution;
            lhsNumericalResolution = this.getNumericalResolution();
            MeasureType rhsNumericalResolution;
            rhsNumericalResolution = that.getNumericalResolution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numericalResolution", lhsNumericalResolution), LocatorUtils.property(thatLocator, "numericalResolution", rhsNumericalResolution), lhsNumericalResolution, rhsNumericalResolution, this.isSetNumericalResolution(), that.isSetNumericalResolution())) {
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
            boolean theInternationalExchange;
            theInternationalExchange = this.isInternationalExchange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "internationalExchange", theInternationalExchange), currentHashCode, theInternationalExchange, true);
        }
        {
            ReferenceType theUom;
            theUom = this.getUom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uom", theUom), currentHashCode, theUom, this.isSetUom());
        }
        {
            MeasureType theSpatialReportingInterval;
            theSpatialReportingInterval = this.getSpatialReportingInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spatialReportingInterval", theSpatialReportingInterval), currentHashCode, theSpatialReportingInterval, this.isSetSpatialReportingInterval());
        }
        {
            Duration theTemporalReportingInterval;
            theTemporalReportingInterval = this.getTemporalReportingInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "temporalReportingInterval", theTemporalReportingInterval), currentHashCode, theTemporalReportingInterval, this.isSetTemporalReportingInterval());
        }
        {
            ReferenceType theTimeStampMeaning;
            theTimeStampMeaning = this.getTimeStampMeaning();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStampMeaning", theTimeStampMeaning), currentHashCode, theTimeStampMeaning, this.isSetTimeStampMeaning());
        }
        {
            ReportingType.ReferenceDatum theReferenceDatum;
            theReferenceDatum = this.getReferenceDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceDatum", theReferenceDatum), currentHashCode, theReferenceDatum, this.isSetReferenceDatum());
        }
        {
            ReportingType.DataPolicy theDataPolicy;
            theDataPolicy = this.getDataPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataPolicy", theDataPolicy), currentHashCode, theDataPolicy, this.isSetDataPolicy());
        }
        {
            BigInteger theNumberOfObservationsInReportingInterval;
            theNumberOfObservationsInReportingInterval = this.getNumberOfObservationsInReportingInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfObservationsInReportingInterval", theNumberOfObservationsInReportingInterval), currentHashCode, theNumberOfObservationsInReportingInterval, this.isSetNumberOfObservationsInReportingInterval());
        }
        {
            ReferenceType theReferenceTimeSource;
            theReferenceTimeSource = this.getReferenceTimeSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceTimeSource", theReferenceTimeSource), currentHashCode, theReferenceTimeSource, this.isSetReferenceTimeSource());
        }
        {
            ReferenceType theLevelOfData;
            theLevelOfData = this.getLevelOfData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "levelOfData", theLevelOfData), currentHashCode, theLevelOfData, this.isSetLevelOfData());
        }
        {
            ReferenceType theDataFormat;
            theDataFormat = this.getDataFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataFormat", theDataFormat), currentHashCode, theDataFormat, this.isSetDataFormat());
        }
        {
            Boolean theOfficialStatus;
            theOfficialStatus = this.isOfficialStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "officialStatus", theOfficialStatus), currentHashCode, theOfficialStatus, this.isSetOfficialStatus());
        }
        {
            String theDataFormatVersion;
            theDataFormatVersion = this.getDataFormatVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataFormatVersion", theDataFormatVersion), currentHashCode, theDataFormatVersion, this.isSetDataFormatVersion());
        }
        {
            Duration theTimeliness;
            theTimeliness = this.getTimeliness();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeliness", theTimeliness), currentHashCode, theTimeliness, this.isSetTimeliness());
        }
        {
            MeasureType theNumericalResolution;
            theNumericalResolution = this.getNumericalResolution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numericalResolution", theNumericalResolution), currentHashCode, theNumericalResolution, this.isSetNumericalResolution());
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
        if (draftCopy instanceof ReportingType) {
            final ReportingType copy = ((ReportingType) draftCopy);
            {
                Boolean internationalExchangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (internationalExchangeShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceInternationalExchange;
                    sourceInternationalExchange = this.isInternationalExchange();
                    boolean copyInternationalExchange = strategy.copy(LocatorUtils.property(locator, "internationalExchange", sourceInternationalExchange), sourceInternationalExchange, true);
                    copy.setInternationalExchange(copyInternationalExchange);
                } else {
                    if (internationalExchangeShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean uomShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetUom());
                if (uomShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceUom;
                    sourceUom = this.getUom();
                    ReferenceType copyUom = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "uom", sourceUom), sourceUom, this.isSetUom()));
                    copy.setUom(copyUom);
                } else {
                    if (uomShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uom = null;
                    }
                }
            }
            {
                Boolean spatialReportingIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSpatialReportingInterval());
                if (spatialReportingIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceSpatialReportingInterval;
                    sourceSpatialReportingInterval = this.getSpatialReportingInterval();
                    MeasureType copySpatialReportingInterval = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "spatialReportingInterval", sourceSpatialReportingInterval), sourceSpatialReportingInterval, this.isSetSpatialReportingInterval()));
                    copy.setSpatialReportingInterval(copySpatialReportingInterval);
                } else {
                    if (spatialReportingIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.spatialReportingInterval = null;
                    }
                }
            }
            {
                Boolean temporalReportingIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTemporalReportingInterval());
                if (temporalReportingIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceTemporalReportingInterval;
                    sourceTemporalReportingInterval = this.getTemporalReportingInterval();
                    Duration copyTemporalReportingInterval = ((Duration) strategy.copy(LocatorUtils.property(locator, "temporalReportingInterval", sourceTemporalReportingInterval), sourceTemporalReportingInterval, this.isSetTemporalReportingInterval()));
                    copy.setTemporalReportingInterval(copyTemporalReportingInterval);
                } else {
                    if (temporalReportingIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.temporalReportingInterval = null;
                    }
                }
            }
            {
                Boolean timeStampMeaningShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTimeStampMeaning());
                if (timeStampMeaningShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceTimeStampMeaning;
                    sourceTimeStampMeaning = this.getTimeStampMeaning();
                    ReferenceType copyTimeStampMeaning = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "timeStampMeaning", sourceTimeStampMeaning), sourceTimeStampMeaning, this.isSetTimeStampMeaning()));
                    copy.setTimeStampMeaning(copyTimeStampMeaning);
                } else {
                    if (timeStampMeaningShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeStampMeaning = null;
                    }
                }
            }
            {
                Boolean referenceDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetReferenceDatum());
                if (referenceDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReportingType.ReferenceDatum sourceReferenceDatum;
                    sourceReferenceDatum = this.getReferenceDatum();
                    ReportingType.ReferenceDatum copyReferenceDatum = ((ReportingType.ReferenceDatum) strategy.copy(LocatorUtils.property(locator, "referenceDatum", sourceReferenceDatum), sourceReferenceDatum, this.isSetReferenceDatum()));
                    copy.setReferenceDatum(copyReferenceDatum);
                } else {
                    if (referenceDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenceDatum = null;
                    }
                }
            }
            {
                Boolean dataPolicyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataPolicy());
                if (dataPolicyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReportingType.DataPolicy sourceDataPolicy;
                    sourceDataPolicy = this.getDataPolicy();
                    ReportingType.DataPolicy copyDataPolicy = ((ReportingType.DataPolicy) strategy.copy(LocatorUtils.property(locator, "dataPolicy", sourceDataPolicy), sourceDataPolicy, this.isSetDataPolicy()));
                    copy.setDataPolicy(copyDataPolicy);
                } else {
                    if (dataPolicyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataPolicy = null;
                    }
                }
            }
            {
                Boolean numberOfObservationsInReportingIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetNumberOfObservationsInReportingInterval());
                if (numberOfObservationsInReportingIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceNumberOfObservationsInReportingInterval;
                    sourceNumberOfObservationsInReportingInterval = this.getNumberOfObservationsInReportingInterval();
                    BigInteger copyNumberOfObservationsInReportingInterval = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numberOfObservationsInReportingInterval", sourceNumberOfObservationsInReportingInterval), sourceNumberOfObservationsInReportingInterval, this.isSetNumberOfObservationsInReportingInterval()));
                    copy.setNumberOfObservationsInReportingInterval(copyNumberOfObservationsInReportingInterval);
                } else {
                    if (numberOfObservationsInReportingIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfObservationsInReportingInterval = null;
                    }
                }
            }
            {
                Boolean referenceTimeSourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetReferenceTimeSource());
                if (referenceTimeSourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceReferenceTimeSource;
                    sourceReferenceTimeSource = this.getReferenceTimeSource();
                    ReferenceType copyReferenceTimeSource = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "referenceTimeSource", sourceReferenceTimeSource), sourceReferenceTimeSource, this.isSetReferenceTimeSource()));
                    copy.setReferenceTimeSource(copyReferenceTimeSource);
                } else {
                    if (referenceTimeSourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenceTimeSource = null;
                    }
                }
            }
            {
                Boolean levelOfDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLevelOfData());
                if (levelOfDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceLevelOfData;
                    sourceLevelOfData = this.getLevelOfData();
                    ReferenceType copyLevelOfData = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "levelOfData", sourceLevelOfData), sourceLevelOfData, this.isSetLevelOfData()));
                    copy.setLevelOfData(copyLevelOfData);
                } else {
                    if (levelOfDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.levelOfData = null;
                    }
                }
            }
            {
                Boolean dataFormatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataFormat());
                if (dataFormatShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceDataFormat;
                    sourceDataFormat = this.getDataFormat();
                    ReferenceType copyDataFormat = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "dataFormat", sourceDataFormat), sourceDataFormat, this.isSetDataFormat()));
                    copy.setDataFormat(copyDataFormat);
                } else {
                    if (dataFormatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataFormat = null;
                    }
                }
            }
            {
                Boolean officialStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOfficialStatus());
                if (officialStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOfficialStatus;
                    sourceOfficialStatus = this.isOfficialStatus();
                    Boolean copyOfficialStatus = ((Boolean) strategy.copy(LocatorUtils.property(locator, "officialStatus", sourceOfficialStatus), sourceOfficialStatus, this.isSetOfficialStatus()));
                    copy.setOfficialStatus(copyOfficialStatus);
                } else {
                    if (officialStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.officialStatus = null;
                    }
                }
            }
            {
                Boolean dataFormatVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataFormatVersion());
                if (dataFormatVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDataFormatVersion;
                    sourceDataFormatVersion = this.getDataFormatVersion();
                    String copyDataFormatVersion = ((String) strategy.copy(LocatorUtils.property(locator, "dataFormatVersion", sourceDataFormatVersion), sourceDataFormatVersion, this.isSetDataFormatVersion()));
                    copy.setDataFormatVersion(copyDataFormatVersion);
                } else {
                    if (dataFormatVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataFormatVersion = null;
                    }
                }
            }
            {
                Boolean timelinessShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTimeliness());
                if (timelinessShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceTimeliness;
                    sourceTimeliness = this.getTimeliness();
                    Duration copyTimeliness = ((Duration) strategy.copy(LocatorUtils.property(locator, "timeliness", sourceTimeliness), sourceTimeliness, this.isSetTimeliness()));
                    copy.setTimeliness(copyTimeliness);
                } else {
                    if (timelinessShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeliness = null;
                    }
                }
            }
            {
                Boolean numericalResolutionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetNumericalResolution());
                if (numericalResolutionShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceNumericalResolution;
                    sourceNumericalResolution = this.getNumericalResolution();
                    MeasureType copyNumericalResolution = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "numericalResolution", sourceNumericalResolution), sourceNumericalResolution, this.isSetNumericalResolution()));
                    copy.setNumericalResolution(copyNumericalResolution);
                } else {
                    if (numericalResolutionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numericalResolution = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ReportingType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}DataPolicy"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataPolicy"
    })
    public static class DataPolicy
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DataPolicy", required = true)
        protected DataPolicyType dataPolicy;

        /**
         * Gets the value of the dataPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link DataPolicyType }
         *     
         */
        public DataPolicyType getDataPolicy() {
            return dataPolicy;
        }

        /**
         * Sets the value of the dataPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataPolicyType }
         *     
         */
        public void setDataPolicy(DataPolicyType value) {
            this.dataPolicy = value;
        }

        public boolean isSetDataPolicy() {
            return (this.dataPolicy!= null);
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
                DataPolicyType theDataPolicy;
                theDataPolicy = this.getDataPolicy();
                strategy.appendField(locator, this, "dataPolicy", buffer, theDataPolicy, this.isSetDataPolicy());
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
            final ReportingType.DataPolicy that = ((ReportingType.DataPolicy) object);
            {
                DataPolicyType lhsDataPolicy;
                lhsDataPolicy = this.getDataPolicy();
                DataPolicyType rhsDataPolicy;
                rhsDataPolicy = that.getDataPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dataPolicy", lhsDataPolicy), LocatorUtils.property(thatLocator, "dataPolicy", rhsDataPolicy), lhsDataPolicy, rhsDataPolicy, this.isSetDataPolicy(), that.isSetDataPolicy())) {
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
                DataPolicyType theDataPolicy;
                theDataPolicy = this.getDataPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataPolicy", theDataPolicy), currentHashCode, theDataPolicy, this.isSetDataPolicy());
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
            if (draftCopy instanceof ReportingType.DataPolicy) {
                final ReportingType.DataPolicy copy = ((ReportingType.DataPolicy) draftCopy);
                {
                    Boolean dataPolicyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataPolicy());
                    if (dataPolicyShouldBeCopiedAndSet == Boolean.TRUE) {
                        DataPolicyType sourceDataPolicy;
                        sourceDataPolicy = this.getDataPolicy();
                        DataPolicyType copyDataPolicy = ((DataPolicyType) strategy.copy(LocatorUtils.property(locator, "dataPolicy", sourceDataPolicy), sourceDataPolicy, this.isSetDataPolicy()));
                        copy.setDataPolicy(copyDataPolicy);
                    } else {
                        if (dataPolicyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.dataPolicy = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ReportingType.DataPolicy();
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}VerticalDatum"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "verticalDatum"
    })
    public static class ReferenceDatum
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "VerticalDatum", namespace = "http://www.opengis.net/gml/3.2", required = true)
        protected VerticalDatumType verticalDatum;

        /**
         * Gets the value of the verticalDatum property.
         * 
         * @return
         *     possible object is
         *     {@link VerticalDatumType }
         *     
         */
        public VerticalDatumType getVerticalDatum() {
            return verticalDatum;
        }

        /**
         * Sets the value of the verticalDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link VerticalDatumType }
         *     
         */
        public void setVerticalDatum(VerticalDatumType value) {
            this.verticalDatum = value;
        }

        public boolean isSetVerticalDatum() {
            return (this.verticalDatum!= null);
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
                VerticalDatumType theVerticalDatum;
                theVerticalDatum = this.getVerticalDatum();
                strategy.appendField(locator, this, "verticalDatum", buffer, theVerticalDatum, this.isSetVerticalDatum());
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
            final ReportingType.ReferenceDatum that = ((ReportingType.ReferenceDatum) object);
            {
                VerticalDatumType lhsVerticalDatum;
                lhsVerticalDatum = this.getVerticalDatum();
                VerticalDatumType rhsVerticalDatum;
                rhsVerticalDatum = that.getVerticalDatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalDatum", lhsVerticalDatum), LocatorUtils.property(thatLocator, "verticalDatum", rhsVerticalDatum), lhsVerticalDatum, rhsVerticalDatum, this.isSetVerticalDatum(), that.isSetVerticalDatum())) {
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
                VerticalDatumType theVerticalDatum;
                theVerticalDatum = this.getVerticalDatum();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalDatum", theVerticalDatum), currentHashCode, theVerticalDatum, this.isSetVerticalDatum());
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
            if (draftCopy instanceof ReportingType.ReferenceDatum) {
                final ReportingType.ReferenceDatum copy = ((ReportingType.ReferenceDatum) draftCopy);
                {
                    Boolean verticalDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVerticalDatum());
                    if (verticalDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                        VerticalDatumType sourceVerticalDatum;
                        sourceVerticalDatum = this.getVerticalDatum();
                        VerticalDatumType copyVerticalDatum = ((VerticalDatumType) strategy.copy(LocatorUtils.property(locator, "verticalDatum", sourceVerticalDatum), sourceVerticalDatum, this.isSetVerticalDatum()));
                        copy.setVerticalDatum(copyVerticalDatum);
                    } else {
                        if (verticalDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.verticalDatum = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ReportingType.ReferenceDatum();
        }

    }

}

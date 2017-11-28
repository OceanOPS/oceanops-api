//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 05:47:39 PM CET 
//


package _int.wmo.def.wmdr._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import net.opengis.gml.v_3_2_1.ReferenceType;


/**
 * <p>Java class for ControlCheckReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlCheckReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}LogEntryType">
 *       &lt;sequence>
 *         &lt;element name="checkLocation" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="periodOfValidity" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="controlCheckResult" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="standardType" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="standardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withinVerificationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alternateURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlCheckReportType", propOrder = {
    "checkLocation",
    "periodOfValidity",
    "controlCheckResult",
    "standardType",
    "standardName",
    "standardSerialNumber",
    "withinVerificationLimit",
    "alternateURI"
})
public class ControlCheckReportType
    extends LogEntryType
{

    protected ReferenceType checkLocation;
    protected Duration periodOfValidity;
    protected ReferenceType controlCheckResult;
    protected ReferenceType standardType;
    protected String standardName;
    protected String standardSerialNumber;
    protected Boolean withinVerificationLimit;
    @XmlSchemaType(name = "anyURI")
    protected String alternateURI;

    /**
     * Gets the value of the checkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCheckLocation() {
        return checkLocation;
    }

    /**
     * Sets the value of the checkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCheckLocation(ReferenceType value) {
        this.checkLocation = value;
    }

    /**
     * Gets the value of the periodOfValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriodOfValidity() {
        return periodOfValidity;
    }

    /**
     * Sets the value of the periodOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriodOfValidity(Duration value) {
        this.periodOfValidity = value;
    }

    /**
     * Gets the value of the controlCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getControlCheckResult() {
        return controlCheckResult;
    }

    /**
     * Sets the value of the controlCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setControlCheckResult(ReferenceType value) {
        this.controlCheckResult = value;
    }

    /**
     * Gets the value of the standardType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getStandardType() {
        return standardType;
    }

    /**
     * Sets the value of the standardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setStandardType(ReferenceType value) {
        this.standardType = value;
    }

    /**
     * Gets the value of the standardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardName() {
        return standardName;
    }

    /**
     * Sets the value of the standardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardName(String value) {
        this.standardName = value;
    }

    /**
     * Gets the value of the standardSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardSerialNumber() {
        return standardSerialNumber;
    }

    /**
     * Sets the value of the standardSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardSerialNumber(String value) {
        this.standardSerialNumber = value;
    }

    /**
     * Gets the value of the withinVerificationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithinVerificationLimit() {
        return withinVerificationLimit;
    }

    /**
     * Sets the value of the withinVerificationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithinVerificationLimit(Boolean value) {
        this.withinVerificationLimit = value;
    }

    /**
     * Gets the value of the alternateURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateURI() {
        return alternateURI;
    }

    /**
     * Sets the value of the alternateURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateURI(String value) {
        this.alternateURI = value;
    }

}

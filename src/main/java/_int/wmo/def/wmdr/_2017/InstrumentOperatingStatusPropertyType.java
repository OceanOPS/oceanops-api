//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 05:47:39 PM CET 
//


package _int.wmo.def.wmdr._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentOperatingStatusPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentOperatingStatusPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://def.wmo.int/wmdr/2017}InstrumentOperatingStatus"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentOperatingStatusPropertyType", propOrder = {
    "instrumentOperatingStatus"
})
public class InstrumentOperatingStatusPropertyType {

    @XmlElement(name = "InstrumentOperatingStatus", required = true)
    protected InstrumentOperatingStatusType instrumentOperatingStatus;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the instrumentOperatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentOperatingStatusType }
     *     
     */
    public InstrumentOperatingStatusType getInstrumentOperatingStatus() {
        return instrumentOperatingStatus;
    }

    /**
     * Sets the value of the instrumentOperatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentOperatingStatusType }
     *     
     */
    public void setInstrumentOperatingStatus(InstrumentOperatingStatusType value) {
        this.instrumentOperatingStatus = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

}

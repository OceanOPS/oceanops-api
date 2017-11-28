//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 05:47:39 PM CET 
//


package _int.wmo.def.wmdr._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.v_3_2_1.AbstractMetadataPropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIResponsiblePartyType;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recordOwner" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "fileDateTime",
    "recordOwner"
})
public class HeaderType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileDateTime;
    protected HeaderType.RecordOwner recordOwner;

    /**
     * Gets the value of the fileDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDateTime() {
        return fileDateTime;
    }

    /**
     * Sets the value of the fileDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDateTime(XMLGregorianCalendar value) {
        this.fileDateTime = value;
    }

    /**
     * Gets the value of the recordOwner property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType.RecordOwner }
     *     
     */
    public HeaderType.RecordOwner getRecordOwner() {
        return recordOwner;
    }

    /**
     * Sets the value of the recordOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType.RecordOwner }
     *     
     */
    public void setRecordOwner(HeaderType.RecordOwner value) {
        this.recordOwner = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ciResponsibleParty"
    })
    public static class RecordOwner
        extends AbstractMetadataPropertyType
    {

        @XmlElement(name = "CI_ResponsibleParty", namespace = "http://www.isotc211.org/2005/gmd", required = true)
        protected CIResponsiblePartyType ciResponsibleParty;

        /**
         * Gets the value of the ciResponsibleParty property.
         * 
         * @return
         *     possible object is
         *     {@link CIResponsiblePartyType }
         *     
         */
        public CIResponsiblePartyType getCIResponsibleParty() {
            return ciResponsibleParty;
        }

        /**
         * Sets the value of the ciResponsibleParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link CIResponsiblePartyType }
         *     
         */
        public void setCIResponsibleParty(CIResponsiblePartyType value) {
            this.ciResponsibleParty = value;
        }

		@Override
		public Object createNewInstance() {
			// TODO Auto-generated method stub
			return null;
		}

    }

}

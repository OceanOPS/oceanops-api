//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.14 at 09:14:09 AM CEST 
//


package _int.wmo.def.wmdr._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AbstractMemberType;


/**
 * <p>Java class for LogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="logEntry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}LogEntry"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogType", propOrder = {
    "logEntry"
})
@XmlSeeAlso({
    EquipmentLogType.class,
    FacilityLogType.class
})
public abstract class LogType
    extends AbstractFeatureType
{

    protected List<LogType.LogEntry> logEntry;

    /**
     * Gets the value of the logEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogType.LogEntry }
     * 
     * 
     */
    public List<LogType.LogEntry> getLogEntry() {
        if (logEntry == null) {
            logEntry = new ArrayList<LogType.LogEntry>();
        }
        return this.logEntry;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType">
     *       &lt;sequence>
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}LogEntry"/>
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
        "logEntry"
    })
    public static class LogEntry
        extends AbstractMemberType
    {

        @XmlElementRef(name = "LogEntry", namespace = "http://def.wmo.int/wmdr/2017", type = JAXBElement.class)
        protected JAXBElement<? extends LogEntryType> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     
         */
        public JAXBElement<? extends LogEntryType> getLogEntry() {
            return logEntry;
        }

        /**
         * Sets the value of the logEntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     
         */
        public void setLogEntry(JAXBElement<? extends LogEntryType> value) {
            this.logEntry = value;
        }

		@Override
		public Object createNewInstance() {
			// TODO Auto-generated method stub
			return null;
		}

    }

}

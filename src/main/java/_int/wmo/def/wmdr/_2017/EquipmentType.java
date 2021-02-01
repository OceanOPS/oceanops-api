
package _int.wmo.def.wmdr._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.ReferenceType;
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
 * <p>Java class for EquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}AbstractEnvironmentalMonitoringFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facility" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observingMethod" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="observingMethodDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observableRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specifiedAbsoluteUncertainty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specifiedRelativeUncertainty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driftPerUnitTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specificationLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="frequency" type="{http://def.wmo.int/wmdr/2017}FrequenciesPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="equipmentLog" type="{http://def.wmo.int/wmdr/2017}EquipmentLogPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
    "facility",
    "manufacturer",
    "model",
    "firmwareVersion",
    "serialNumber",
    "observingMethod",
    "observingMethodDetails",
    "observableRange",
    "specifiedAbsoluteUncertainty",
    "specifiedRelativeUncertainty",
    "driftPerUnitTime",
    "specificationLink",
    "frequency",
    "equipmentLog"
})
public class EquipmentType
    extends AbstractEnvironmentalMonitoringFacilityType
{

    private final static long serialVersionUID = 1L;
    protected ReferenceType facility;
    protected String manufacturer;
    protected String model;
    protected String firmwareVersion;
    protected String serialNumber;
    @XmlElement(required = true)
    protected ReferenceType observingMethod;
    protected String observingMethodDetails;
    protected String observableRange;
    protected String specifiedAbsoluteUncertainty;
    protected String specifiedRelativeUncertainty;
    protected String driftPerUnitTime;
    @XmlSchemaType(name = "anyURI")
    protected String specificationLink;
    protected List<FrequenciesPropertyType> frequency;
    protected EquipmentLogPropertyType equipmentLog;

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFacility(ReferenceType value) {
        this.facility = value;
    }

    public boolean isSetFacility() {
        return (this.facility!= null);
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    public boolean isSetManufacturer() {
        return (this.manufacturer!= null);
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    public boolean isSetModel() {
        return (this.model!= null);
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    public boolean isSetFirmwareVersion() {
        return (this.firmwareVersion!= null);
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    public boolean isSetSerialNumber() {
        return (this.serialNumber!= null);
    }

    /**
     * Gets the value of the observingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getObservingMethod() {
        return observingMethod;
    }

    /**
     * Sets the value of the observingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setObservingMethod(ReferenceType value) {
        this.observingMethod = value;
    }

    public boolean isSetObservingMethod() {
        return (this.observingMethod!= null);
    }

    /**
     * Gets the value of the observingMethodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservingMethodDetails() {
        return observingMethodDetails;
    }

    /**
     * Sets the value of the observingMethodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservingMethodDetails(String value) {
        this.observingMethodDetails = value;
    }

    public boolean isSetObservingMethodDetails() {
        return (this.observingMethodDetails!= null);
    }

    /**
     * Gets the value of the observableRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservableRange() {
        return observableRange;
    }

    /**
     * Sets the value of the observableRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservableRange(String value) {
        this.observableRange = value;
    }

    public boolean isSetObservableRange() {
        return (this.observableRange!= null);
    }

    /**
     * Gets the value of the specifiedAbsoluteUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifiedAbsoluteUncertainty() {
        return specifiedAbsoluteUncertainty;
    }

    /**
     * Sets the value of the specifiedAbsoluteUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecifiedAbsoluteUncertainty(String value) {
        this.specifiedAbsoluteUncertainty = value;
    }

    public boolean isSetSpecifiedAbsoluteUncertainty() {
        return (this.specifiedAbsoluteUncertainty!= null);
    }

    /**
     * Gets the value of the specifiedRelativeUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifiedRelativeUncertainty() {
        return specifiedRelativeUncertainty;
    }

    /**
     * Sets the value of the specifiedRelativeUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecifiedRelativeUncertainty(String value) {
        this.specifiedRelativeUncertainty = value;
    }

    public boolean isSetSpecifiedRelativeUncertainty() {
        return (this.specifiedRelativeUncertainty!= null);
    }

    /**
     * Gets the value of the driftPerUnitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriftPerUnitTime() {
        return driftPerUnitTime;
    }

    /**
     * Sets the value of the driftPerUnitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriftPerUnitTime(String value) {
        this.driftPerUnitTime = value;
    }

    public boolean isSetDriftPerUnitTime() {
        return (this.driftPerUnitTime!= null);
    }

    /**
     * Gets the value of the specificationLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationLink() {
        return specificationLink;
    }

    /**
     * Sets the value of the specificationLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationLink(String value) {
        this.specificationLink = value;
    }

    public boolean isSetSpecificationLink() {
        return (this.specificationLink!= null);
    }

    /**
     * Gets the value of the frequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequenciesPropertyType }
     * 
     * 
     */
    public List<FrequenciesPropertyType> getFrequency() {
        if (frequency == null) {
            frequency = new ArrayList<FrequenciesPropertyType>();
        }
        return this.frequency;
    }

    public boolean isSetFrequency() {
        return ((this.frequency!= null)&&(!this.frequency.isEmpty()));
    }

    public void unsetFrequency() {
        this.frequency = null;
    }

    /**
     * Gets the value of the equipmentLog property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentLogPropertyType }
     *     
     */
    public EquipmentLogPropertyType getEquipmentLog() {
        return equipmentLog;
    }

    /**
     * Sets the value of the equipmentLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentLogPropertyType }
     *     
     */
    public void setEquipmentLog(EquipmentLogPropertyType value) {
        this.equipmentLog = value;
    }

    public boolean isSetEquipmentLog() {
        return (this.equipmentLog!= null);
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
            ReferenceType theFacility;
            theFacility = this.getFacility();
            strategy.appendField(locator, this, "facility", buffer, theFacility, this.isSetFacility());
        }
        {
            String theManufacturer;
            theManufacturer = this.getManufacturer();
            strategy.appendField(locator, this, "manufacturer", buffer, theManufacturer, this.isSetManufacturer());
        }
        {
            String theModel;
            theModel = this.getModel();
            strategy.appendField(locator, this, "model", buffer, theModel, this.isSetModel());
        }
        {
            String theFirmwareVersion;
            theFirmwareVersion = this.getFirmwareVersion();
            strategy.appendField(locator, this, "firmwareVersion", buffer, theFirmwareVersion, this.isSetFirmwareVersion());
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, this.isSetSerialNumber());
        }
        {
            ReferenceType theObservingMethod;
            theObservingMethod = this.getObservingMethod();
            strategy.appendField(locator, this, "observingMethod", buffer, theObservingMethod, this.isSetObservingMethod());
        }
        {
            String theObservingMethodDetails;
            theObservingMethodDetails = this.getObservingMethodDetails();
            strategy.appendField(locator, this, "observingMethodDetails", buffer, theObservingMethodDetails, this.isSetObservingMethodDetails());
        }
        {
            String theObservableRange;
            theObservableRange = this.getObservableRange();
            strategy.appendField(locator, this, "observableRange", buffer, theObservableRange, this.isSetObservableRange());
        }
        {
            String theSpecifiedAbsoluteUncertainty;
            theSpecifiedAbsoluteUncertainty = this.getSpecifiedAbsoluteUncertainty();
            strategy.appendField(locator, this, "specifiedAbsoluteUncertainty", buffer, theSpecifiedAbsoluteUncertainty, this.isSetSpecifiedAbsoluteUncertainty());
        }
        {
            String theSpecifiedRelativeUncertainty;
            theSpecifiedRelativeUncertainty = this.getSpecifiedRelativeUncertainty();
            strategy.appendField(locator, this, "specifiedRelativeUncertainty", buffer, theSpecifiedRelativeUncertainty, this.isSetSpecifiedRelativeUncertainty());
        }
        {
            String theDriftPerUnitTime;
            theDriftPerUnitTime = this.getDriftPerUnitTime();
            strategy.appendField(locator, this, "driftPerUnitTime", buffer, theDriftPerUnitTime, this.isSetDriftPerUnitTime());
        }
        {
            String theSpecificationLink;
            theSpecificationLink = this.getSpecificationLink();
            strategy.appendField(locator, this, "specificationLink", buffer, theSpecificationLink, this.isSetSpecificationLink());
        }
        {
            List<FrequenciesPropertyType> theFrequency;
            theFrequency = (this.isSetFrequency()?this.getFrequency():null);
            strategy.appendField(locator, this, "frequency", buffer, theFrequency, this.isSetFrequency());
        }
        {
            EquipmentLogPropertyType theEquipmentLog;
            theEquipmentLog = this.getEquipmentLog();
            strategy.appendField(locator, this, "equipmentLog", buffer, theEquipmentLog, this.isSetEquipmentLog());
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
        final EquipmentType that = ((EquipmentType) object);
        {
            ReferenceType lhsFacility;
            lhsFacility = this.getFacility();
            ReferenceType rhsFacility;
            rhsFacility = that.getFacility();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facility", lhsFacility), LocatorUtils.property(thatLocator, "facility", rhsFacility), lhsFacility, rhsFacility, this.isSetFacility(), that.isSetFacility())) {
                return false;
            }
        }
        {
            String lhsManufacturer;
            lhsManufacturer = this.getManufacturer();
            String rhsManufacturer;
            rhsManufacturer = that.getManufacturer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturer", lhsManufacturer), LocatorUtils.property(thatLocator, "manufacturer", rhsManufacturer), lhsManufacturer, rhsManufacturer, this.isSetManufacturer(), that.isSetManufacturer())) {
                return false;
            }
        }
        {
            String lhsModel;
            lhsModel = this.getModel();
            String rhsModel;
            rhsModel = that.getModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "model", lhsModel), LocatorUtils.property(thatLocator, "model", rhsModel), lhsModel, rhsModel, this.isSetModel(), that.isSetModel())) {
                return false;
            }
        }
        {
            String lhsFirmwareVersion;
            lhsFirmwareVersion = this.getFirmwareVersion();
            String rhsFirmwareVersion;
            rhsFirmwareVersion = that.getFirmwareVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmwareVersion", lhsFirmwareVersion), LocatorUtils.property(thatLocator, "firmwareVersion", rhsFirmwareVersion), lhsFirmwareVersion, rhsFirmwareVersion, this.isSetFirmwareVersion(), that.isSetFirmwareVersion())) {
                return false;
            }
        }
        {
            String lhsSerialNumber;
            lhsSerialNumber = this.getSerialNumber();
            String rhsSerialNumber;
            rhsSerialNumber = that.getSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(thatLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber, this.isSetSerialNumber(), that.isSetSerialNumber())) {
                return false;
            }
        }
        {
            ReferenceType lhsObservingMethod;
            lhsObservingMethod = this.getObservingMethod();
            ReferenceType rhsObservingMethod;
            rhsObservingMethod = that.getObservingMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "observingMethod", lhsObservingMethod), LocatorUtils.property(thatLocator, "observingMethod", rhsObservingMethod), lhsObservingMethod, rhsObservingMethod, this.isSetObservingMethod(), that.isSetObservingMethod())) {
                return false;
            }
        }
        {
            String lhsObservingMethodDetails;
            lhsObservingMethodDetails = this.getObservingMethodDetails();
            String rhsObservingMethodDetails;
            rhsObservingMethodDetails = that.getObservingMethodDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "observingMethodDetails", lhsObservingMethodDetails), LocatorUtils.property(thatLocator, "observingMethodDetails", rhsObservingMethodDetails), lhsObservingMethodDetails, rhsObservingMethodDetails, this.isSetObservingMethodDetails(), that.isSetObservingMethodDetails())) {
                return false;
            }
        }
        {
            String lhsObservableRange;
            lhsObservableRange = this.getObservableRange();
            String rhsObservableRange;
            rhsObservableRange = that.getObservableRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "observableRange", lhsObservableRange), LocatorUtils.property(thatLocator, "observableRange", rhsObservableRange), lhsObservableRange, rhsObservableRange, this.isSetObservableRange(), that.isSetObservableRange())) {
                return false;
            }
        }
        {
            String lhsSpecifiedAbsoluteUncertainty;
            lhsSpecifiedAbsoluteUncertainty = this.getSpecifiedAbsoluteUncertainty();
            String rhsSpecifiedAbsoluteUncertainty;
            rhsSpecifiedAbsoluteUncertainty = that.getSpecifiedAbsoluteUncertainty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedAbsoluteUncertainty", lhsSpecifiedAbsoluteUncertainty), LocatorUtils.property(thatLocator, "specifiedAbsoluteUncertainty", rhsSpecifiedAbsoluteUncertainty), lhsSpecifiedAbsoluteUncertainty, rhsSpecifiedAbsoluteUncertainty, this.isSetSpecifiedAbsoluteUncertainty(), that.isSetSpecifiedAbsoluteUncertainty())) {
                return false;
            }
        }
        {
            String lhsSpecifiedRelativeUncertainty;
            lhsSpecifiedRelativeUncertainty = this.getSpecifiedRelativeUncertainty();
            String rhsSpecifiedRelativeUncertainty;
            rhsSpecifiedRelativeUncertainty = that.getSpecifiedRelativeUncertainty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedRelativeUncertainty", lhsSpecifiedRelativeUncertainty), LocatorUtils.property(thatLocator, "specifiedRelativeUncertainty", rhsSpecifiedRelativeUncertainty), lhsSpecifiedRelativeUncertainty, rhsSpecifiedRelativeUncertainty, this.isSetSpecifiedRelativeUncertainty(), that.isSetSpecifiedRelativeUncertainty())) {
                return false;
            }
        }
        {
            String lhsDriftPerUnitTime;
            lhsDriftPerUnitTime = this.getDriftPerUnitTime();
            String rhsDriftPerUnitTime;
            rhsDriftPerUnitTime = that.getDriftPerUnitTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "driftPerUnitTime", lhsDriftPerUnitTime), LocatorUtils.property(thatLocator, "driftPerUnitTime", rhsDriftPerUnitTime), lhsDriftPerUnitTime, rhsDriftPerUnitTime, this.isSetDriftPerUnitTime(), that.isSetDriftPerUnitTime())) {
                return false;
            }
        }
        {
            String lhsSpecificationLink;
            lhsSpecificationLink = this.getSpecificationLink();
            String rhsSpecificationLink;
            rhsSpecificationLink = that.getSpecificationLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificationLink", lhsSpecificationLink), LocatorUtils.property(thatLocator, "specificationLink", rhsSpecificationLink), lhsSpecificationLink, rhsSpecificationLink, this.isSetSpecificationLink(), that.isSetSpecificationLink())) {
                return false;
            }
        }
        {
            List<FrequenciesPropertyType> lhsFrequency;
            lhsFrequency = (this.isSetFrequency()?this.getFrequency():null);
            List<FrequenciesPropertyType> rhsFrequency;
            rhsFrequency = (that.isSetFrequency()?that.getFrequency():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequency", lhsFrequency), LocatorUtils.property(thatLocator, "frequency", rhsFrequency), lhsFrequency, rhsFrequency, this.isSetFrequency(), that.isSetFrequency())) {
                return false;
            }
        }
        {
            EquipmentLogPropertyType lhsEquipmentLog;
            lhsEquipmentLog = this.getEquipmentLog();
            EquipmentLogPropertyType rhsEquipmentLog;
            rhsEquipmentLog = that.getEquipmentLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipmentLog", lhsEquipmentLog), LocatorUtils.property(thatLocator, "equipmentLog", rhsEquipmentLog), lhsEquipmentLog, rhsEquipmentLog, this.isSetEquipmentLog(), that.isSetEquipmentLog())) {
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
            ReferenceType theFacility;
            theFacility = this.getFacility();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facility", theFacility), currentHashCode, theFacility, this.isSetFacility());
        }
        {
            String theManufacturer;
            theManufacturer = this.getManufacturer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturer", theManufacturer), currentHashCode, theManufacturer, this.isSetManufacturer());
        }
        {
            String theModel;
            theModel = this.getModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "model", theModel), currentHashCode, theModel, this.isSetModel());
        }
        {
            String theFirmwareVersion;
            theFirmwareVersion = this.getFirmwareVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firmwareVersion", theFirmwareVersion), currentHashCode, theFirmwareVersion, this.isSetFirmwareVersion());
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNumber", theSerialNumber), currentHashCode, theSerialNumber, this.isSetSerialNumber());
        }
        {
            ReferenceType theObservingMethod;
            theObservingMethod = this.getObservingMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observingMethod", theObservingMethod), currentHashCode, theObservingMethod, this.isSetObservingMethod());
        }
        {
            String theObservingMethodDetails;
            theObservingMethodDetails = this.getObservingMethodDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observingMethodDetails", theObservingMethodDetails), currentHashCode, theObservingMethodDetails, this.isSetObservingMethodDetails());
        }
        {
            String theObservableRange;
            theObservableRange = this.getObservableRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observableRange", theObservableRange), currentHashCode, theObservableRange, this.isSetObservableRange());
        }
        {
            String theSpecifiedAbsoluteUncertainty;
            theSpecifiedAbsoluteUncertainty = this.getSpecifiedAbsoluteUncertainty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedAbsoluteUncertainty", theSpecifiedAbsoluteUncertainty), currentHashCode, theSpecifiedAbsoluteUncertainty, this.isSetSpecifiedAbsoluteUncertainty());
        }
        {
            String theSpecifiedRelativeUncertainty;
            theSpecifiedRelativeUncertainty = this.getSpecifiedRelativeUncertainty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedRelativeUncertainty", theSpecifiedRelativeUncertainty), currentHashCode, theSpecifiedRelativeUncertainty, this.isSetSpecifiedRelativeUncertainty());
        }
        {
            String theDriftPerUnitTime;
            theDriftPerUnitTime = this.getDriftPerUnitTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "driftPerUnitTime", theDriftPerUnitTime), currentHashCode, theDriftPerUnitTime, this.isSetDriftPerUnitTime());
        }
        {
            String theSpecificationLink;
            theSpecificationLink = this.getSpecificationLink();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificationLink", theSpecificationLink), currentHashCode, theSpecificationLink, this.isSetSpecificationLink());
        }
        {
            List<FrequenciesPropertyType> theFrequency;
            theFrequency = (this.isSetFrequency()?this.getFrequency():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequency", theFrequency), currentHashCode, theFrequency, this.isSetFrequency());
        }
        {
            EquipmentLogPropertyType theEquipmentLog;
            theEquipmentLog = this.getEquipmentLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipmentLog", theEquipmentLog), currentHashCode, theEquipmentLog, this.isSetEquipmentLog());
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
        if (draftCopy instanceof EquipmentType) {
            final EquipmentType copy = ((EquipmentType) draftCopy);
            {
                Boolean facilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacility());
                if (facilityShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceFacility;
                    sourceFacility = this.getFacility();
                    ReferenceType copyFacility = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "facility", sourceFacility), sourceFacility, this.isSetFacility()));
                    copy.setFacility(copyFacility);
                } else {
                    if (facilityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.facility = null;
                    }
                }
            }
            {
                Boolean manufacturerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetManufacturer());
                if (manufacturerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceManufacturer;
                    sourceManufacturer = this.getManufacturer();
                    String copyManufacturer = ((String) strategy.copy(LocatorUtils.property(locator, "manufacturer", sourceManufacturer), sourceManufacturer, this.isSetManufacturer()));
                    copy.setManufacturer(copyManufacturer);
                } else {
                    if (manufacturerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.manufacturer = null;
                    }
                }
            }
            {
                Boolean modelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetModel());
                if (modelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceModel;
                    sourceModel = this.getModel();
                    String copyModel = ((String) strategy.copy(LocatorUtils.property(locator, "model", sourceModel), sourceModel, this.isSetModel()));
                    copy.setModel(copyModel);
                } else {
                    if (modelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.model = null;
                    }
                }
            }
            {
                Boolean firmwareVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFirmwareVersion());
                if (firmwareVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirmwareVersion;
                    sourceFirmwareVersion = this.getFirmwareVersion();
                    String copyFirmwareVersion = ((String) strategy.copy(LocatorUtils.property(locator, "firmwareVersion", sourceFirmwareVersion), sourceFirmwareVersion, this.isSetFirmwareVersion()));
                    copy.setFirmwareVersion(copyFirmwareVersion);
                } else {
                    if (firmwareVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firmwareVersion = null;
                    }
                }
            }
            {
                Boolean serialNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSerialNumber());
                if (serialNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSerialNumber;
                    sourceSerialNumber = this.getSerialNumber();
                    String copySerialNumber = ((String) strategy.copy(LocatorUtils.property(locator, "serialNumber", sourceSerialNumber), sourceSerialNumber, this.isSetSerialNumber()));
                    copy.setSerialNumber(copySerialNumber);
                } else {
                    if (serialNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serialNumber = null;
                    }
                }
            }
            {
                Boolean observingMethodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservingMethod());
                if (observingMethodShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceObservingMethod;
                    sourceObservingMethod = this.getObservingMethod();
                    ReferenceType copyObservingMethod = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "observingMethod", sourceObservingMethod), sourceObservingMethod, this.isSetObservingMethod()));
                    copy.setObservingMethod(copyObservingMethod);
                } else {
                    if (observingMethodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.observingMethod = null;
                    }
                }
            }
            {
                Boolean observingMethodDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservingMethodDetails());
                if (observingMethodDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceObservingMethodDetails;
                    sourceObservingMethodDetails = this.getObservingMethodDetails();
                    String copyObservingMethodDetails = ((String) strategy.copy(LocatorUtils.property(locator, "observingMethodDetails", sourceObservingMethodDetails), sourceObservingMethodDetails, this.isSetObservingMethodDetails()));
                    copy.setObservingMethodDetails(copyObservingMethodDetails);
                } else {
                    if (observingMethodDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.observingMethodDetails = null;
                    }
                }
            }
            {
                Boolean observableRangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservableRange());
                if (observableRangeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceObservableRange;
                    sourceObservableRange = this.getObservableRange();
                    String copyObservableRange = ((String) strategy.copy(LocatorUtils.property(locator, "observableRange", sourceObservableRange), sourceObservableRange, this.isSetObservableRange()));
                    copy.setObservableRange(copyObservableRange);
                } else {
                    if (observableRangeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.observableRange = null;
                    }
                }
            }
            {
                Boolean specifiedAbsoluteUncertaintyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSpecifiedAbsoluteUncertainty());
                if (specifiedAbsoluteUncertaintyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSpecifiedAbsoluteUncertainty;
                    sourceSpecifiedAbsoluteUncertainty = this.getSpecifiedAbsoluteUncertainty();
                    String copySpecifiedAbsoluteUncertainty = ((String) strategy.copy(LocatorUtils.property(locator, "specifiedAbsoluteUncertainty", sourceSpecifiedAbsoluteUncertainty), sourceSpecifiedAbsoluteUncertainty, this.isSetSpecifiedAbsoluteUncertainty()));
                    copy.setSpecifiedAbsoluteUncertainty(copySpecifiedAbsoluteUncertainty);
                } else {
                    if (specifiedAbsoluteUncertaintyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specifiedAbsoluteUncertainty = null;
                    }
                }
            }
            {
                Boolean specifiedRelativeUncertaintyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSpecifiedRelativeUncertainty());
                if (specifiedRelativeUncertaintyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSpecifiedRelativeUncertainty;
                    sourceSpecifiedRelativeUncertainty = this.getSpecifiedRelativeUncertainty();
                    String copySpecifiedRelativeUncertainty = ((String) strategy.copy(LocatorUtils.property(locator, "specifiedRelativeUncertainty", sourceSpecifiedRelativeUncertainty), sourceSpecifiedRelativeUncertainty, this.isSetSpecifiedRelativeUncertainty()));
                    copy.setSpecifiedRelativeUncertainty(copySpecifiedRelativeUncertainty);
                } else {
                    if (specifiedRelativeUncertaintyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specifiedRelativeUncertainty = null;
                    }
                }
            }
            {
                Boolean driftPerUnitTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDriftPerUnitTime());
                if (driftPerUnitTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDriftPerUnitTime;
                    sourceDriftPerUnitTime = this.getDriftPerUnitTime();
                    String copyDriftPerUnitTime = ((String) strategy.copy(LocatorUtils.property(locator, "driftPerUnitTime", sourceDriftPerUnitTime), sourceDriftPerUnitTime, this.isSetDriftPerUnitTime()));
                    copy.setDriftPerUnitTime(copyDriftPerUnitTime);
                } else {
                    if (driftPerUnitTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.driftPerUnitTime = null;
                    }
                }
            }
            {
                Boolean specificationLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSpecificationLink());
                if (specificationLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSpecificationLink;
                    sourceSpecificationLink = this.getSpecificationLink();
                    String copySpecificationLink = ((String) strategy.copy(LocatorUtils.property(locator, "specificationLink", sourceSpecificationLink), sourceSpecificationLink, this.isSetSpecificationLink()));
                    copy.setSpecificationLink(copySpecificationLink);
                } else {
                    if (specificationLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificationLink = null;
                    }
                }
            }
            {
                Boolean frequencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFrequency());
                if (frequencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FrequenciesPropertyType> sourceFrequency;
                    sourceFrequency = (this.isSetFrequency()?this.getFrequency():null);
                    @SuppressWarnings("unchecked")
                    List<FrequenciesPropertyType> copyFrequency = ((List<FrequenciesPropertyType> ) strategy.copy(LocatorUtils.property(locator, "frequency", sourceFrequency), sourceFrequency, this.isSetFrequency()));
                    copy.unsetFrequency();
                    if (copyFrequency!= null) {
                        List<FrequenciesPropertyType> uniqueFrequencyl = copy.getFrequency();
                        uniqueFrequencyl.addAll(copyFrequency);
                    }
                } else {
                    if (frequencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFrequency();
                    }
                }
            }
            {
                Boolean equipmentLogShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipmentLog());
                if (equipmentLogShouldBeCopiedAndSet == Boolean.TRUE) {
                    EquipmentLogPropertyType sourceEquipmentLog;
                    sourceEquipmentLog = this.getEquipmentLog();
                    EquipmentLogPropertyType copyEquipmentLog = ((EquipmentLogPropertyType) strategy.copy(LocatorUtils.property(locator, "equipmentLog", sourceEquipmentLog), sourceEquipmentLog, this.isSetEquipmentLog()));
                    copy.setEquipmentLog(copyEquipmentLog);
                } else {
                    if (equipmentLogShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.equipmentLog = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EquipmentType();
    }

}


package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AbstractMemberType;
import net.opengis.gml.v_3_2_1.MeasureType;
import net.opengis.gml.v_3_2_1.ReferenceType;
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
 * <p>Java class for DeploymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeploymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deployedEquipment" type="{http://def.wmo.int/wmdr/2017}EquipmentPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="dataGeneration" type="{http://def.wmo.int/wmdr/2017}DataGenerationPropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *         &lt;element name="heightAboveLocalReferenceSurface" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="localReferenceSurface" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="applicationArea" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="sourceOfObservation" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="communicationMethod" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="exposure" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="representativeness" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="configuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instrumentOperatingStatus" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}InstrumentOperatingStatus"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeploymentType", propOrder = {
    "deployedEquipment",
    "dataGeneration",
    "validPeriod",
    "heightAboveLocalReferenceSurface",
    "localReferenceSurface",
    "applicationArea",
    "sourceOfObservation",
    "communicationMethod",
    "exposure",
    "representativeness",
    "configuration",
    "maintenanceSchedule",
    "controlSchedule",
    "instrumentOperatingStatus"
})
public class DeploymentType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected EquipmentPropertyType deployedEquipment;
    @XmlElement(required = true)
    protected List<DataGenerationPropertyType> dataGeneration;
    @XmlElement(required = true)
    protected TimePeriodPropertyType validPeriod;
    protected MeasureType heightAboveLocalReferenceSurface;
    protected ReferenceType localReferenceSurface;
    @XmlElement(required = true)
    protected List<ReferenceType> applicationArea;
    @XmlElement(required = true)
    protected ReferenceType sourceOfObservation;
    protected ReferenceType communicationMethod;
    protected ReferenceType exposure;
    protected ReferenceType representativeness;
    protected String configuration;
    protected String maintenanceSchedule;
    protected String controlSchedule;
    protected List<DeploymentType.InstrumentOperatingStatus> instrumentOperatingStatus;

    /**
     * Gets the value of the deployedEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPropertyType }
     *     
     */
    public EquipmentPropertyType getDeployedEquipment() {
        return deployedEquipment;
    }

    /**
     * Sets the value of the deployedEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPropertyType }
     *     
     */
    public void setDeployedEquipment(EquipmentPropertyType value) {
        this.deployedEquipment = value;
    }

    public boolean isSetDeployedEquipment() {
        return (this.deployedEquipment!= null);
    }

    /**
     * Gets the value of the dataGeneration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataGeneration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataGeneration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataGenerationPropertyType }
     * 
     * 
     */
    public List<DataGenerationPropertyType> getDataGeneration() {
        if (dataGeneration == null) {
            dataGeneration = new ArrayList<DataGenerationPropertyType>();
        }
        return this.dataGeneration;
    }

    public boolean isSetDataGeneration() {
        return ((this.dataGeneration!= null)&&(!this.dataGeneration.isEmpty()));
    }

    public void unsetDataGeneration() {
        this.dataGeneration = null;
    }

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
     * Gets the value of the heightAboveLocalReferenceSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightAboveLocalReferenceSurface() {
        return heightAboveLocalReferenceSurface;
    }

    /**
     * Sets the value of the heightAboveLocalReferenceSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightAboveLocalReferenceSurface(MeasureType value) {
        this.heightAboveLocalReferenceSurface = value;
    }

    public boolean isSetHeightAboveLocalReferenceSurface() {
        return (this.heightAboveLocalReferenceSurface!= null);
    }

    /**
     * Gets the value of the localReferenceSurface property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocalReferenceSurface() {
        return localReferenceSurface;
    }

    /**
     * Sets the value of the localReferenceSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLocalReferenceSurface(ReferenceType value) {
        this.localReferenceSurface = value;
    }

    public boolean isSetLocalReferenceSurface() {
        return (this.localReferenceSurface!= null);
    }

    /**
     * Gets the value of the applicationArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getApplicationArea() {
        if (applicationArea == null) {
            applicationArea = new ArrayList<ReferenceType>();
        }
        return this.applicationArea;
    }

    public boolean isSetApplicationArea() {
        return ((this.applicationArea!= null)&&(!this.applicationArea.isEmpty()));
    }

    public void unsetApplicationArea() {
        this.applicationArea = null;
    }

    /**
     * Gets the value of the sourceOfObservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSourceOfObservation() {
        return sourceOfObservation;
    }

    /**
     * Sets the value of the sourceOfObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSourceOfObservation(ReferenceType value) {
        this.sourceOfObservation = value;
    }

    public boolean isSetSourceOfObservation() {
        return (this.sourceOfObservation!= null);
    }

    /**
     * Gets the value of the communicationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCommunicationMethod() {
        return communicationMethod;
    }

    /**
     * Sets the value of the communicationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCommunicationMethod(ReferenceType value) {
        this.communicationMethod = value;
    }

    public boolean isSetCommunicationMethod() {
        return (this.communicationMethod!= null);
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setExposure(ReferenceType value) {
        this.exposure = value;
    }

    public boolean isSetExposure() {
        return (this.exposure!= null);
    }

    /**
     * Gets the value of the representativeness property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRepresentativeness() {
        return representativeness;
    }

    /**
     * Sets the value of the representativeness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRepresentativeness(ReferenceType value) {
        this.representativeness = value;
    }

    public boolean isSetRepresentativeness() {
        return (this.representativeness!= null);
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    public boolean isSetConfiguration() {
        return (this.configuration!= null);
    }

    /**
     * Gets the value of the maintenanceSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceSchedule() {
        return maintenanceSchedule;
    }

    /**
     * Sets the value of the maintenanceSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceSchedule(String value) {
        this.maintenanceSchedule = value;
    }

    public boolean isSetMaintenanceSchedule() {
        return (this.maintenanceSchedule!= null);
    }

    /**
     * Gets the value of the controlSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlSchedule() {
        return controlSchedule;
    }

    /**
     * Sets the value of the controlSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlSchedule(String value) {
        this.controlSchedule = value;
    }

    public boolean isSetControlSchedule() {
        return (this.controlSchedule!= null);
    }

    /**
     * Gets the value of the instrumentOperatingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentOperatingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentOperatingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeploymentType.InstrumentOperatingStatus }
     * 
     * 
     */
    public List<DeploymentType.InstrumentOperatingStatus> getInstrumentOperatingStatus() {
        if (instrumentOperatingStatus == null) {
            instrumentOperatingStatus = new ArrayList<DeploymentType.InstrumentOperatingStatus>();
        }
        return this.instrumentOperatingStatus;
    }

    public boolean isSetInstrumentOperatingStatus() {
        return ((this.instrumentOperatingStatus!= null)&&(!this.instrumentOperatingStatus.isEmpty()));
    }

    public void unsetInstrumentOperatingStatus() {
        this.instrumentOperatingStatus = null;
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
            EquipmentPropertyType theDeployedEquipment;
            theDeployedEquipment = this.getDeployedEquipment();
            strategy.appendField(locator, this, "deployedEquipment", buffer, theDeployedEquipment, this.isSetDeployedEquipment());
        }
        {
            List<DataGenerationPropertyType> theDataGeneration;
            theDataGeneration = (this.isSetDataGeneration()?this.getDataGeneration():null);
            strategy.appendField(locator, this, "dataGeneration", buffer, theDataGeneration, this.isSetDataGeneration());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            strategy.appendField(locator, this, "validPeriod", buffer, theValidPeriod, this.isSetValidPeriod());
        }
        {
            MeasureType theHeightAboveLocalReferenceSurface;
            theHeightAboveLocalReferenceSurface = this.getHeightAboveLocalReferenceSurface();
            strategy.appendField(locator, this, "heightAboveLocalReferenceSurface", buffer, theHeightAboveLocalReferenceSurface, this.isSetHeightAboveLocalReferenceSurface());
        }
        {
            ReferenceType theLocalReferenceSurface;
            theLocalReferenceSurface = this.getLocalReferenceSurface();
            strategy.appendField(locator, this, "localReferenceSurface", buffer, theLocalReferenceSurface, this.isSetLocalReferenceSurface());
        }
        {
            List<ReferenceType> theApplicationArea;
            theApplicationArea = (this.isSetApplicationArea()?this.getApplicationArea():null);
            strategy.appendField(locator, this, "applicationArea", buffer, theApplicationArea, this.isSetApplicationArea());
        }
        {
            ReferenceType theSourceOfObservation;
            theSourceOfObservation = this.getSourceOfObservation();
            strategy.appendField(locator, this, "sourceOfObservation", buffer, theSourceOfObservation, this.isSetSourceOfObservation());
        }
        {
            ReferenceType theCommunicationMethod;
            theCommunicationMethod = this.getCommunicationMethod();
            strategy.appendField(locator, this, "communicationMethod", buffer, theCommunicationMethod, this.isSetCommunicationMethod());
        }
        {
            ReferenceType theExposure;
            theExposure = this.getExposure();
            strategy.appendField(locator, this, "exposure", buffer, theExposure, this.isSetExposure());
        }
        {
            ReferenceType theRepresentativeness;
            theRepresentativeness = this.getRepresentativeness();
            strategy.appendField(locator, this, "representativeness", buffer, theRepresentativeness, this.isSetRepresentativeness());
        }
        {
            String theConfiguration;
            theConfiguration = this.getConfiguration();
            strategy.appendField(locator, this, "configuration", buffer, theConfiguration, this.isSetConfiguration());
        }
        {
            String theMaintenanceSchedule;
            theMaintenanceSchedule = this.getMaintenanceSchedule();
            strategy.appendField(locator, this, "maintenanceSchedule", buffer, theMaintenanceSchedule, this.isSetMaintenanceSchedule());
        }
        {
            String theControlSchedule;
            theControlSchedule = this.getControlSchedule();
            strategy.appendField(locator, this, "controlSchedule", buffer, theControlSchedule, this.isSetControlSchedule());
        }
        {
            List<DeploymentType.InstrumentOperatingStatus> theInstrumentOperatingStatus;
            theInstrumentOperatingStatus = (this.isSetInstrumentOperatingStatus()?this.getInstrumentOperatingStatus():null);
            strategy.appendField(locator, this, "instrumentOperatingStatus", buffer, theInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus());
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
        final DeploymentType that = ((DeploymentType) object);
        {
            EquipmentPropertyType lhsDeployedEquipment;
            lhsDeployedEquipment = this.getDeployedEquipment();
            EquipmentPropertyType rhsDeployedEquipment;
            rhsDeployedEquipment = that.getDeployedEquipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deployedEquipment", lhsDeployedEquipment), LocatorUtils.property(thatLocator, "deployedEquipment", rhsDeployedEquipment), lhsDeployedEquipment, rhsDeployedEquipment, this.isSetDeployedEquipment(), that.isSetDeployedEquipment())) {
                return false;
            }
        }
        {
            List<DataGenerationPropertyType> lhsDataGeneration;
            lhsDataGeneration = (this.isSetDataGeneration()?this.getDataGeneration():null);
            List<DataGenerationPropertyType> rhsDataGeneration;
            rhsDataGeneration = (that.isSetDataGeneration()?that.getDataGeneration():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataGeneration", lhsDataGeneration), LocatorUtils.property(thatLocator, "dataGeneration", rhsDataGeneration), lhsDataGeneration, rhsDataGeneration, this.isSetDataGeneration(), that.isSetDataGeneration())) {
                return false;
            }
        }
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
            MeasureType lhsHeightAboveLocalReferenceSurface;
            lhsHeightAboveLocalReferenceSurface = this.getHeightAboveLocalReferenceSurface();
            MeasureType rhsHeightAboveLocalReferenceSurface;
            rhsHeightAboveLocalReferenceSurface = that.getHeightAboveLocalReferenceSurface();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heightAboveLocalReferenceSurface", lhsHeightAboveLocalReferenceSurface), LocatorUtils.property(thatLocator, "heightAboveLocalReferenceSurface", rhsHeightAboveLocalReferenceSurface), lhsHeightAboveLocalReferenceSurface, rhsHeightAboveLocalReferenceSurface, this.isSetHeightAboveLocalReferenceSurface(), that.isSetHeightAboveLocalReferenceSurface())) {
                return false;
            }
        }
        {
            ReferenceType lhsLocalReferenceSurface;
            lhsLocalReferenceSurface = this.getLocalReferenceSurface();
            ReferenceType rhsLocalReferenceSurface;
            rhsLocalReferenceSurface = that.getLocalReferenceSurface();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localReferenceSurface", lhsLocalReferenceSurface), LocatorUtils.property(thatLocator, "localReferenceSurface", rhsLocalReferenceSurface), lhsLocalReferenceSurface, rhsLocalReferenceSurface, this.isSetLocalReferenceSurface(), that.isSetLocalReferenceSurface())) {
                return false;
            }
        }
        {
            List<ReferenceType> lhsApplicationArea;
            lhsApplicationArea = (this.isSetApplicationArea()?this.getApplicationArea():null);
            List<ReferenceType> rhsApplicationArea;
            rhsApplicationArea = (that.isSetApplicationArea()?that.getApplicationArea():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicationArea", lhsApplicationArea), LocatorUtils.property(thatLocator, "applicationArea", rhsApplicationArea), lhsApplicationArea, rhsApplicationArea, this.isSetApplicationArea(), that.isSetApplicationArea())) {
                return false;
            }
        }
        {
            ReferenceType lhsSourceOfObservation;
            lhsSourceOfObservation = this.getSourceOfObservation();
            ReferenceType rhsSourceOfObservation;
            rhsSourceOfObservation = that.getSourceOfObservation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceOfObservation", lhsSourceOfObservation), LocatorUtils.property(thatLocator, "sourceOfObservation", rhsSourceOfObservation), lhsSourceOfObservation, rhsSourceOfObservation, this.isSetSourceOfObservation(), that.isSetSourceOfObservation())) {
                return false;
            }
        }
        {
            ReferenceType lhsCommunicationMethod;
            lhsCommunicationMethod = this.getCommunicationMethod();
            ReferenceType rhsCommunicationMethod;
            rhsCommunicationMethod = that.getCommunicationMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "communicationMethod", lhsCommunicationMethod), LocatorUtils.property(thatLocator, "communicationMethod", rhsCommunicationMethod), lhsCommunicationMethod, rhsCommunicationMethod, this.isSetCommunicationMethod(), that.isSetCommunicationMethod())) {
                return false;
            }
        }
        {
            ReferenceType lhsExposure;
            lhsExposure = this.getExposure();
            ReferenceType rhsExposure;
            rhsExposure = that.getExposure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exposure", lhsExposure), LocatorUtils.property(thatLocator, "exposure", rhsExposure), lhsExposure, rhsExposure, this.isSetExposure(), that.isSetExposure())) {
                return false;
            }
        }
        {
            ReferenceType lhsRepresentativeness;
            lhsRepresentativeness = this.getRepresentativeness();
            ReferenceType rhsRepresentativeness;
            rhsRepresentativeness = that.getRepresentativeness();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "representativeness", lhsRepresentativeness), LocatorUtils.property(thatLocator, "representativeness", rhsRepresentativeness), lhsRepresentativeness, rhsRepresentativeness, this.isSetRepresentativeness(), that.isSetRepresentativeness())) {
                return false;
            }
        }
        {
            String lhsConfiguration;
            lhsConfiguration = this.getConfiguration();
            String rhsConfiguration;
            rhsConfiguration = that.getConfiguration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configuration", lhsConfiguration), LocatorUtils.property(thatLocator, "configuration", rhsConfiguration), lhsConfiguration, rhsConfiguration, this.isSetConfiguration(), that.isSetConfiguration())) {
                return false;
            }
        }
        {
            String lhsMaintenanceSchedule;
            lhsMaintenanceSchedule = this.getMaintenanceSchedule();
            String rhsMaintenanceSchedule;
            rhsMaintenanceSchedule = that.getMaintenanceSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maintenanceSchedule", lhsMaintenanceSchedule), LocatorUtils.property(thatLocator, "maintenanceSchedule", rhsMaintenanceSchedule), lhsMaintenanceSchedule, rhsMaintenanceSchedule, this.isSetMaintenanceSchedule(), that.isSetMaintenanceSchedule())) {
                return false;
            }
        }
        {
            String lhsControlSchedule;
            lhsControlSchedule = this.getControlSchedule();
            String rhsControlSchedule;
            rhsControlSchedule = that.getControlSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "controlSchedule", lhsControlSchedule), LocatorUtils.property(thatLocator, "controlSchedule", rhsControlSchedule), lhsControlSchedule, rhsControlSchedule, this.isSetControlSchedule(), that.isSetControlSchedule())) {
                return false;
            }
        }
        {
            List<DeploymentType.InstrumentOperatingStatus> lhsInstrumentOperatingStatus;
            lhsInstrumentOperatingStatus = (this.isSetInstrumentOperatingStatus()?this.getInstrumentOperatingStatus():null);
            List<DeploymentType.InstrumentOperatingStatus> rhsInstrumentOperatingStatus;
            rhsInstrumentOperatingStatus = (that.isSetInstrumentOperatingStatus()?that.getInstrumentOperatingStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrumentOperatingStatus", lhsInstrumentOperatingStatus), LocatorUtils.property(thatLocator, "instrumentOperatingStatus", rhsInstrumentOperatingStatus), lhsInstrumentOperatingStatus, rhsInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus(), that.isSetInstrumentOperatingStatus())) {
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
            EquipmentPropertyType theDeployedEquipment;
            theDeployedEquipment = this.getDeployedEquipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deployedEquipment", theDeployedEquipment), currentHashCode, theDeployedEquipment, this.isSetDeployedEquipment());
        }
        {
            List<DataGenerationPropertyType> theDataGeneration;
            theDataGeneration = (this.isSetDataGeneration()?this.getDataGeneration():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataGeneration", theDataGeneration), currentHashCode, theDataGeneration, this.isSetDataGeneration());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
        }
        {
            MeasureType theHeightAboveLocalReferenceSurface;
            theHeightAboveLocalReferenceSurface = this.getHeightAboveLocalReferenceSurface();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "heightAboveLocalReferenceSurface", theHeightAboveLocalReferenceSurface), currentHashCode, theHeightAboveLocalReferenceSurface, this.isSetHeightAboveLocalReferenceSurface());
        }
        {
            ReferenceType theLocalReferenceSurface;
            theLocalReferenceSurface = this.getLocalReferenceSurface();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localReferenceSurface", theLocalReferenceSurface), currentHashCode, theLocalReferenceSurface, this.isSetLocalReferenceSurface());
        }
        {
            List<ReferenceType> theApplicationArea;
            theApplicationArea = (this.isSetApplicationArea()?this.getApplicationArea():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicationArea", theApplicationArea), currentHashCode, theApplicationArea, this.isSetApplicationArea());
        }
        {
            ReferenceType theSourceOfObservation;
            theSourceOfObservation = this.getSourceOfObservation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceOfObservation", theSourceOfObservation), currentHashCode, theSourceOfObservation, this.isSetSourceOfObservation());
        }
        {
            ReferenceType theCommunicationMethod;
            theCommunicationMethod = this.getCommunicationMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "communicationMethod", theCommunicationMethod), currentHashCode, theCommunicationMethod, this.isSetCommunicationMethod());
        }
        {
            ReferenceType theExposure;
            theExposure = this.getExposure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exposure", theExposure), currentHashCode, theExposure, this.isSetExposure());
        }
        {
            ReferenceType theRepresentativeness;
            theRepresentativeness = this.getRepresentativeness();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "representativeness", theRepresentativeness), currentHashCode, theRepresentativeness, this.isSetRepresentativeness());
        }
        {
            String theConfiguration;
            theConfiguration = this.getConfiguration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configuration", theConfiguration), currentHashCode, theConfiguration, this.isSetConfiguration());
        }
        {
            String theMaintenanceSchedule;
            theMaintenanceSchedule = this.getMaintenanceSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maintenanceSchedule", theMaintenanceSchedule), currentHashCode, theMaintenanceSchedule, this.isSetMaintenanceSchedule());
        }
        {
            String theControlSchedule;
            theControlSchedule = this.getControlSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "controlSchedule", theControlSchedule), currentHashCode, theControlSchedule, this.isSetControlSchedule());
        }
        {
            List<DeploymentType.InstrumentOperatingStatus> theInstrumentOperatingStatus;
            theInstrumentOperatingStatus = (this.isSetInstrumentOperatingStatus()?this.getInstrumentOperatingStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrumentOperatingStatus", theInstrumentOperatingStatus), currentHashCode, theInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus());
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
        if (draftCopy instanceof DeploymentType) {
            final DeploymentType copy = ((DeploymentType) draftCopy);
            {
                Boolean deployedEquipmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDeployedEquipment());
                if (deployedEquipmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    EquipmentPropertyType sourceDeployedEquipment;
                    sourceDeployedEquipment = this.getDeployedEquipment();
                    EquipmentPropertyType copyDeployedEquipment = ((EquipmentPropertyType) strategy.copy(LocatorUtils.property(locator, "deployedEquipment", sourceDeployedEquipment), sourceDeployedEquipment, this.isSetDeployedEquipment()));
                    copy.setDeployedEquipment(copyDeployedEquipment);
                } else {
                    if (deployedEquipmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deployedEquipment = null;
                    }
                }
            }
            {
                Boolean dataGenerationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataGeneration());
                if (dataGenerationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DataGenerationPropertyType> sourceDataGeneration;
                    sourceDataGeneration = (this.isSetDataGeneration()?this.getDataGeneration():null);
                    @SuppressWarnings("unchecked")
                    List<DataGenerationPropertyType> copyDataGeneration = ((List<DataGenerationPropertyType> ) strategy.copy(LocatorUtils.property(locator, "dataGeneration", sourceDataGeneration), sourceDataGeneration, this.isSetDataGeneration()));
                    copy.unsetDataGeneration();
                    if (copyDataGeneration!= null) {
                        List<DataGenerationPropertyType> uniqueDataGenerationl = copy.getDataGeneration();
                        uniqueDataGenerationl.addAll(copyDataGeneration);
                    }
                } else {
                    if (dataGenerationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetDataGeneration();
                    }
                }
            }
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
                Boolean heightAboveLocalReferenceSurfaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHeightAboveLocalReferenceSurface());
                if (heightAboveLocalReferenceSurfaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasureType sourceHeightAboveLocalReferenceSurface;
                    sourceHeightAboveLocalReferenceSurface = this.getHeightAboveLocalReferenceSurface();
                    MeasureType copyHeightAboveLocalReferenceSurface = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "heightAboveLocalReferenceSurface", sourceHeightAboveLocalReferenceSurface), sourceHeightAboveLocalReferenceSurface, this.isSetHeightAboveLocalReferenceSurface()));
                    copy.setHeightAboveLocalReferenceSurface(copyHeightAboveLocalReferenceSurface);
                } else {
                    if (heightAboveLocalReferenceSurfaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heightAboveLocalReferenceSurface = null;
                    }
                }
            }
            {
                Boolean localReferenceSurfaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLocalReferenceSurface());
                if (localReferenceSurfaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceLocalReferenceSurface;
                    sourceLocalReferenceSurface = this.getLocalReferenceSurface();
                    ReferenceType copyLocalReferenceSurface = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "localReferenceSurface", sourceLocalReferenceSurface), sourceLocalReferenceSurface, this.isSetLocalReferenceSurface()));
                    copy.setLocalReferenceSurface(copyLocalReferenceSurface);
                } else {
                    if (localReferenceSurfaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.localReferenceSurface = null;
                    }
                }
            }
            {
                Boolean applicationAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetApplicationArea());
                if (applicationAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ReferenceType> sourceApplicationArea;
                    sourceApplicationArea = (this.isSetApplicationArea()?this.getApplicationArea():null);
                    @SuppressWarnings("unchecked")
                    List<ReferenceType> copyApplicationArea = ((List<ReferenceType> ) strategy.copy(LocatorUtils.property(locator, "applicationArea", sourceApplicationArea), sourceApplicationArea, this.isSetApplicationArea()));
                    copy.unsetApplicationArea();
                    if (copyApplicationArea!= null) {
                        List<ReferenceType> uniqueApplicationAreal = copy.getApplicationArea();
                        uniqueApplicationAreal.addAll(copyApplicationArea);
                    }
                } else {
                    if (applicationAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetApplicationArea();
                    }
                }
            }
            {
                Boolean sourceOfObservationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSourceOfObservation());
                if (sourceOfObservationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceSourceOfObservation;
                    sourceSourceOfObservation = this.getSourceOfObservation();
                    ReferenceType copySourceOfObservation = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "sourceOfObservation", sourceSourceOfObservation), sourceSourceOfObservation, this.isSetSourceOfObservation()));
                    copy.setSourceOfObservation(copySourceOfObservation);
                } else {
                    if (sourceOfObservationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sourceOfObservation = null;
                    }
                }
            }
            {
                Boolean communicationMethodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCommunicationMethod());
                if (communicationMethodShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceCommunicationMethod;
                    sourceCommunicationMethod = this.getCommunicationMethod();
                    ReferenceType copyCommunicationMethod = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "communicationMethod", sourceCommunicationMethod), sourceCommunicationMethod, this.isSetCommunicationMethod()));
                    copy.setCommunicationMethod(copyCommunicationMethod);
                } else {
                    if (communicationMethodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.communicationMethod = null;
                    }
                }
            }
            {
                Boolean exposureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetExposure());
                if (exposureShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceExposure;
                    sourceExposure = this.getExposure();
                    ReferenceType copyExposure = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "exposure", sourceExposure), sourceExposure, this.isSetExposure()));
                    copy.setExposure(copyExposure);
                } else {
                    if (exposureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.exposure = null;
                    }
                }
            }
            {
                Boolean representativenessShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRepresentativeness());
                if (representativenessShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceRepresentativeness;
                    sourceRepresentativeness = this.getRepresentativeness();
                    ReferenceType copyRepresentativeness = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "representativeness", sourceRepresentativeness), sourceRepresentativeness, this.isSetRepresentativeness()));
                    copy.setRepresentativeness(copyRepresentativeness);
                } else {
                    if (representativenessShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.representativeness = null;
                    }
                }
            }
            {
                Boolean configurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetConfiguration());
                if (configurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceConfiguration;
                    sourceConfiguration = this.getConfiguration();
                    String copyConfiguration = ((String) strategy.copy(LocatorUtils.property(locator, "configuration", sourceConfiguration), sourceConfiguration, this.isSetConfiguration()));
                    copy.setConfiguration(copyConfiguration);
                } else {
                    if (configurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.configuration = null;
                    }
                }
            }
            {
                Boolean maintenanceScheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMaintenanceSchedule());
                if (maintenanceScheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMaintenanceSchedule;
                    sourceMaintenanceSchedule = this.getMaintenanceSchedule();
                    String copyMaintenanceSchedule = ((String) strategy.copy(LocatorUtils.property(locator, "maintenanceSchedule", sourceMaintenanceSchedule), sourceMaintenanceSchedule, this.isSetMaintenanceSchedule()));
                    copy.setMaintenanceSchedule(copyMaintenanceSchedule);
                } else {
                    if (maintenanceScheduleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maintenanceSchedule = null;
                    }
                }
            }
            {
                Boolean controlScheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetControlSchedule());
                if (controlScheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceControlSchedule;
                    sourceControlSchedule = this.getControlSchedule();
                    String copyControlSchedule = ((String) strategy.copy(LocatorUtils.property(locator, "controlSchedule", sourceControlSchedule), sourceControlSchedule, this.isSetControlSchedule()));
                    copy.setControlSchedule(copyControlSchedule);
                } else {
                    if (controlScheduleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.controlSchedule = null;
                    }
                }
            }
            {
                Boolean instrumentOperatingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetInstrumentOperatingStatus());
                if (instrumentOperatingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DeploymentType.InstrumentOperatingStatus> sourceInstrumentOperatingStatus;
                    sourceInstrumentOperatingStatus = (this.isSetInstrumentOperatingStatus()?this.getInstrumentOperatingStatus():null);
                    @SuppressWarnings("unchecked")
                    List<DeploymentType.InstrumentOperatingStatus> copyInstrumentOperatingStatus = ((List<DeploymentType.InstrumentOperatingStatus> ) strategy.copy(LocatorUtils.property(locator, "instrumentOperatingStatus", sourceInstrumentOperatingStatus), sourceInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus()));
                    copy.unsetInstrumentOperatingStatus();
                    if (copyInstrumentOperatingStatus!= null) {
                        List<DeploymentType.InstrumentOperatingStatus> uniqueInstrumentOperatingStatusl = copy.getInstrumentOperatingStatus();
                        uniqueInstrumentOperatingStatusl.addAll(copyInstrumentOperatingStatus);
                    }
                } else {
                    if (instrumentOperatingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetInstrumentOperatingStatus();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DeploymentType();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}InstrumentOperatingStatus"/&gt;
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
        "instrumentOperatingStatus"
    })
    public static class InstrumentOperatingStatus
        extends AbstractMemberType
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "InstrumentOperatingStatus", required = true)
        protected InstrumentOperatingStatusType instrumentOperatingStatus;

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

        public boolean isSetInstrumentOperatingStatus() {
            return (this.instrumentOperatingStatus!= null);
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
                InstrumentOperatingStatusType theInstrumentOperatingStatus;
                theInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
                strategy.appendField(locator, this, "instrumentOperatingStatus", buffer, theInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus());
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
            final DeploymentType.InstrumentOperatingStatus that = ((DeploymentType.InstrumentOperatingStatus) object);
            {
                InstrumentOperatingStatusType lhsInstrumentOperatingStatus;
                lhsInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
                InstrumentOperatingStatusType rhsInstrumentOperatingStatus;
                rhsInstrumentOperatingStatus = that.getInstrumentOperatingStatus();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "instrumentOperatingStatus", lhsInstrumentOperatingStatus), LocatorUtils.property(thatLocator, "instrumentOperatingStatus", rhsInstrumentOperatingStatus), lhsInstrumentOperatingStatus, rhsInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus(), that.isSetInstrumentOperatingStatus())) {
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
                InstrumentOperatingStatusType theInstrumentOperatingStatus;
                theInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrumentOperatingStatus", theInstrumentOperatingStatus), currentHashCode, theInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus());
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
            if (draftCopy instanceof DeploymentType.InstrumentOperatingStatus) {
                final DeploymentType.InstrumentOperatingStatus copy = ((DeploymentType.InstrumentOperatingStatus) draftCopy);
                {
                    Boolean instrumentOperatingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetInstrumentOperatingStatus());
                    if (instrumentOperatingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                        InstrumentOperatingStatusType sourceInstrumentOperatingStatus;
                        sourceInstrumentOperatingStatus = this.getInstrumentOperatingStatus();
                        InstrumentOperatingStatusType copyInstrumentOperatingStatus = ((InstrumentOperatingStatusType) strategy.copy(LocatorUtils.property(locator, "instrumentOperatingStatus", sourceInstrumentOperatingStatus), sourceInstrumentOperatingStatus, this.isSetInstrumentOperatingStatus()));
                        copy.setInstrumentOperatingStatus(copyInstrumentOperatingStatus);
                    } else {
                        if (instrumentOperatingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.instrumentOperatingStatus = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new DeploymentType.InstrumentOperatingStatus();
        }

    }

}

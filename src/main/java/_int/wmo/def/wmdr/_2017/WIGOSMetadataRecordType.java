
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import _int.wmo.def.metce._2013.EruptingVolcanoType;
import _int.wmo.def.metce._2013.MeasurementContextType;
import _int.wmo.def.metce._2013.TropicalCycloneType;
import _int.wmo.def.metce._2013.VolcanoType;
import _int.wmo.def.opm._2013.AbstractObservablePropertyType;
import _int.wmo.def.opm._2013.CategoryConstraintType;
import _int.wmo.def.opm._2013.CompositeObservablePropertyType;
import _int.wmo.def.opm._2013.ConstraintType;
import _int.wmo.def.opm._2013.ObservablePropertyType;
import _int.wmo.def.opm._2013.QualifiedObservablePropertyType;
import _int.wmo.def.opm._2013.RangeConstraintType;
import _int.wmo.def.opm._2013.ScalarConstraintType;
import _int.wmo.def.opm._2013.StatisticalQualifierType;
import net.opengis.gml.v_3_2_1.AbstractDatumType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AbstractGMLType;
import net.opengis.gml.v_3_2_1.AbstractMemberType;
import net.opengis.gml.v_3_2_1.DefinitionType;
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
 * <p>Java class for WIGOSMetadataRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WIGOSMetadataRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}Header"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="facilitySet" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}FacilitySet"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="facility" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}ObservingFacility"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="observation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}ObservingCapability"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deployment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}Deployment"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="equipment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}Equipment"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="facilityLog" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}FacilityLog"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="equipmentLog" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}EquipmentLog"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractObject"/&gt;
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
@XmlType(name = "WIGOSMetadataRecordType", propOrder = {
    "headerInformation",
    "facilitySet",
    "facility",
    "observation",
    "deployment",
    "equipment",
    "facilityLog",
    "equipmentLog",
    "extension"
})
public class WIGOSMetadataRecordType
    extends AbstractFeatureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected WIGOSMetadataRecordType.HeaderInformation headerInformation;
    protected List<WIGOSMetadataRecordType.FacilitySet> facilitySet;
    protected List<WIGOSMetadataRecordType.Facility> facility;
    protected List<WIGOSMetadataRecordType.Observation> observation;
    protected List<WIGOSMetadataRecordType.Deployment> deployment;
    protected List<WIGOSMetadataRecordType.Equipment> equipment;
    protected List<WIGOSMetadataRecordType.FacilityLog> facilityLog;
    protected List<WIGOSMetadataRecordType.EquipmentLog> equipmentLog;
    protected List<WIGOSMetadataRecordType.Extension> extension;

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WIGOSMetadataRecordType.HeaderInformation }
     *     
     */
    public WIGOSMetadataRecordType.HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WIGOSMetadataRecordType.HeaderInformation }
     *     
     */
    public void setHeaderInformation(WIGOSMetadataRecordType.HeaderInformation value) {
        this.headerInformation = value;
    }

    public boolean isSetHeaderInformation() {
        return (this.headerInformation!= null);
    }

    /**
     * Gets the value of the facilitySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilitySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilitySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.FacilitySet }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.FacilitySet> getFacilitySet() {
        if (facilitySet == null) {
            facilitySet = new ArrayList<WIGOSMetadataRecordType.FacilitySet>();
        }
        return this.facilitySet;
    }

    public boolean isSetFacilitySet() {
        return ((this.facilitySet!= null)&&(!this.facilitySet.isEmpty()));
    }

    public void unsetFacilitySet() {
        this.facilitySet = null;
    }

    /**
     * Gets the value of the facility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.Facility }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.Facility> getFacility() {
        if (facility == null) {
            facility = new ArrayList<WIGOSMetadataRecordType.Facility>();
        }
        return this.facility;
    }

    public boolean isSetFacility() {
        return ((this.facility!= null)&&(!this.facility.isEmpty()));
    }

    public void unsetFacility() {
        this.facility = null;
    }

    /**
     * Gets the value of the observation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.Observation }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.Observation> getObservation() {
        if (observation == null) {
            observation = new ArrayList<WIGOSMetadataRecordType.Observation>();
        }
        return this.observation;
    }

    public boolean isSetObservation() {
        return ((this.observation!= null)&&(!this.observation.isEmpty()));
    }

    public void unsetObservation() {
        this.observation = null;
    }

    /**
     * Gets the value of the deployment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deployment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeployment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.Deployment }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.Deployment> getDeployment() {
        if (deployment == null) {
            deployment = new ArrayList<WIGOSMetadataRecordType.Deployment>();
        }
        return this.deployment;
    }

    public boolean isSetDeployment() {
        return ((this.deployment!= null)&&(!this.deployment.isEmpty()));
    }

    public void unsetDeployment() {
        this.deployment = null;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.Equipment }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.Equipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<WIGOSMetadataRecordType.Equipment>();
        }
        return this.equipment;
    }

    public boolean isSetEquipment() {
        return ((this.equipment!= null)&&(!this.equipment.isEmpty()));
    }

    public void unsetEquipment() {
        this.equipment = null;
    }

    /**
     * Gets the value of the facilityLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.FacilityLog }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.FacilityLog> getFacilityLog() {
        if (facilityLog == null) {
            facilityLog = new ArrayList<WIGOSMetadataRecordType.FacilityLog>();
        }
        return this.facilityLog;
    }

    public boolean isSetFacilityLog() {
        return ((this.facilityLog!= null)&&(!this.facilityLog.isEmpty()));
    }

    public void unsetFacilityLog() {
        this.facilityLog = null;
    }

    /**
     * Gets the value of the equipmentLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.EquipmentLog }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.EquipmentLog> getEquipmentLog() {
        if (equipmentLog == null) {
            equipmentLog = new ArrayList<WIGOSMetadataRecordType.EquipmentLog>();
        }
        return this.equipmentLog;
    }

    public boolean isSetEquipmentLog() {
        return ((this.equipmentLog!= null)&&(!this.equipmentLog.isEmpty()));
    }

    public void unsetEquipmentLog() {
        this.equipmentLog = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WIGOSMetadataRecordType.Extension }
     * 
     * 
     */
    public List<WIGOSMetadataRecordType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<WIGOSMetadataRecordType.Extension>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
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
            WIGOSMetadataRecordType.HeaderInformation theHeaderInformation;
            theHeaderInformation = this.getHeaderInformation();
            strategy.appendField(locator, this, "headerInformation", buffer, theHeaderInformation, this.isSetHeaderInformation());
        }
        {
            List<WIGOSMetadataRecordType.FacilitySet> theFacilitySet;
            theFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
            strategy.appendField(locator, this, "facilitySet", buffer, theFacilitySet, this.isSetFacilitySet());
        }
        {
            List<WIGOSMetadataRecordType.Facility> theFacility;
            theFacility = (this.isSetFacility()?this.getFacility():null);
            strategy.appendField(locator, this, "facility", buffer, theFacility, this.isSetFacility());
        }
        {
            List<WIGOSMetadataRecordType.Observation> theObservation;
            theObservation = (this.isSetObservation()?this.getObservation():null);
            strategy.appendField(locator, this, "observation", buffer, theObservation, this.isSetObservation());
        }
        {
            List<WIGOSMetadataRecordType.Deployment> theDeployment;
            theDeployment = (this.isSetDeployment()?this.getDeployment():null);
            strategy.appendField(locator, this, "deployment", buffer, theDeployment, this.isSetDeployment());
        }
        {
            List<WIGOSMetadataRecordType.Equipment> theEquipment;
            theEquipment = (this.isSetEquipment()?this.getEquipment():null);
            strategy.appendField(locator, this, "equipment", buffer, theEquipment, this.isSetEquipment());
        }
        {
            List<WIGOSMetadataRecordType.FacilityLog> theFacilityLog;
            theFacilityLog = (this.isSetFacilityLog()?this.getFacilityLog():null);
            strategy.appendField(locator, this, "facilityLog", buffer, theFacilityLog, this.isSetFacilityLog());
        }
        {
            List<WIGOSMetadataRecordType.EquipmentLog> theEquipmentLog;
            theEquipmentLog = (this.isSetEquipmentLog()?this.getEquipmentLog():null);
            strategy.appendField(locator, this, "equipmentLog", buffer, theEquipmentLog, this.isSetEquipmentLog());
        }
        {
            List<WIGOSMetadataRecordType.Extension> theExtension;
            theExtension = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theExtension, this.isSetExtension());
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
        final WIGOSMetadataRecordType that = ((WIGOSMetadataRecordType) object);
        {
            WIGOSMetadataRecordType.HeaderInformation lhsHeaderInformation;
            lhsHeaderInformation = this.getHeaderInformation();
            WIGOSMetadataRecordType.HeaderInformation rhsHeaderInformation;
            rhsHeaderInformation = that.getHeaderInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headerInformation", lhsHeaderInformation), LocatorUtils.property(thatLocator, "headerInformation", rhsHeaderInformation), lhsHeaderInformation, rhsHeaderInformation, this.isSetHeaderInformation(), that.isSetHeaderInformation())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.FacilitySet> lhsFacilitySet;
            lhsFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
            List<WIGOSMetadataRecordType.FacilitySet> rhsFacilitySet;
            rhsFacilitySet = (that.isSetFacilitySet()?that.getFacilitySet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilitySet", lhsFacilitySet), LocatorUtils.property(thatLocator, "facilitySet", rhsFacilitySet), lhsFacilitySet, rhsFacilitySet, this.isSetFacilitySet(), that.isSetFacilitySet())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.Facility> lhsFacility;
            lhsFacility = (this.isSetFacility()?this.getFacility():null);
            List<WIGOSMetadataRecordType.Facility> rhsFacility;
            rhsFacility = (that.isSetFacility()?that.getFacility():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facility", lhsFacility), LocatorUtils.property(thatLocator, "facility", rhsFacility), lhsFacility, rhsFacility, this.isSetFacility(), that.isSetFacility())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.Observation> lhsObservation;
            lhsObservation = (this.isSetObservation()?this.getObservation():null);
            List<WIGOSMetadataRecordType.Observation> rhsObservation;
            rhsObservation = (that.isSetObservation()?that.getObservation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "observation", lhsObservation), LocatorUtils.property(thatLocator, "observation", rhsObservation), lhsObservation, rhsObservation, this.isSetObservation(), that.isSetObservation())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.Deployment> lhsDeployment;
            lhsDeployment = (this.isSetDeployment()?this.getDeployment():null);
            List<WIGOSMetadataRecordType.Deployment> rhsDeployment;
            rhsDeployment = (that.isSetDeployment()?that.getDeployment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deployment", lhsDeployment), LocatorUtils.property(thatLocator, "deployment", rhsDeployment), lhsDeployment, rhsDeployment, this.isSetDeployment(), that.isSetDeployment())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.Equipment> lhsEquipment;
            lhsEquipment = (this.isSetEquipment()?this.getEquipment():null);
            List<WIGOSMetadataRecordType.Equipment> rhsEquipment;
            rhsEquipment = (that.isSetEquipment()?that.getEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipment", lhsEquipment), LocatorUtils.property(thatLocator, "equipment", rhsEquipment), lhsEquipment, rhsEquipment, this.isSetEquipment(), that.isSetEquipment())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.FacilityLog> lhsFacilityLog;
            lhsFacilityLog = (this.isSetFacilityLog()?this.getFacilityLog():null);
            List<WIGOSMetadataRecordType.FacilityLog> rhsFacilityLog;
            rhsFacilityLog = (that.isSetFacilityLog()?that.getFacilityLog():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityLog", lhsFacilityLog), LocatorUtils.property(thatLocator, "facilityLog", rhsFacilityLog), lhsFacilityLog, rhsFacilityLog, this.isSetFacilityLog(), that.isSetFacilityLog())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.EquipmentLog> lhsEquipmentLog;
            lhsEquipmentLog = (this.isSetEquipmentLog()?this.getEquipmentLog():null);
            List<WIGOSMetadataRecordType.EquipmentLog> rhsEquipmentLog;
            rhsEquipmentLog = (that.isSetEquipmentLog()?that.getEquipmentLog():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipmentLog", lhsEquipmentLog), LocatorUtils.property(thatLocator, "equipmentLog", rhsEquipmentLog), lhsEquipmentLog, rhsEquipmentLog, this.isSetEquipmentLog(), that.isSetEquipmentLog())) {
                return false;
            }
        }
        {
            List<WIGOSMetadataRecordType.Extension> lhsExtension;
            lhsExtension = (this.isSetExtension()?this.getExtension():null);
            List<WIGOSMetadataRecordType.Extension> rhsExtension;
            rhsExtension = (that.isSetExtension()?that.getExtension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extension", lhsExtension), LocatorUtils.property(thatLocator, "extension", rhsExtension), lhsExtension, rhsExtension, this.isSetExtension(), that.isSetExtension())) {
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
            WIGOSMetadataRecordType.HeaderInformation theHeaderInformation;
            theHeaderInformation = this.getHeaderInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headerInformation", theHeaderInformation), currentHashCode, theHeaderInformation, this.isSetHeaderInformation());
        }
        {
            List<WIGOSMetadataRecordType.FacilitySet> theFacilitySet;
            theFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilitySet", theFacilitySet), currentHashCode, theFacilitySet, this.isSetFacilitySet());
        }
        {
            List<WIGOSMetadataRecordType.Facility> theFacility;
            theFacility = (this.isSetFacility()?this.getFacility():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facility", theFacility), currentHashCode, theFacility, this.isSetFacility());
        }
        {
            List<WIGOSMetadataRecordType.Observation> theObservation;
            theObservation = (this.isSetObservation()?this.getObservation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observation", theObservation), currentHashCode, theObservation, this.isSetObservation());
        }
        {
            List<WIGOSMetadataRecordType.Deployment> theDeployment;
            theDeployment = (this.isSetDeployment()?this.getDeployment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deployment", theDeployment), currentHashCode, theDeployment, this.isSetDeployment());
        }
        {
            List<WIGOSMetadataRecordType.Equipment> theEquipment;
            theEquipment = (this.isSetEquipment()?this.getEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipment", theEquipment), currentHashCode, theEquipment, this.isSetEquipment());
        }
        {
            List<WIGOSMetadataRecordType.FacilityLog> theFacilityLog;
            theFacilityLog = (this.isSetFacilityLog()?this.getFacilityLog():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilityLog", theFacilityLog), currentHashCode, theFacilityLog, this.isSetFacilityLog());
        }
        {
            List<WIGOSMetadataRecordType.EquipmentLog> theEquipmentLog;
            theEquipmentLog = (this.isSetEquipmentLog()?this.getEquipmentLog():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipmentLog", theEquipmentLog), currentHashCode, theEquipmentLog, this.isSetEquipmentLog());
        }
        {
            List<WIGOSMetadataRecordType.Extension> theExtension;
            theExtension = (this.isSetExtension()?this.getExtension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extension", theExtension), currentHashCode, theExtension, this.isSetExtension());
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
        if (draftCopy instanceof WIGOSMetadataRecordType) {
            final WIGOSMetadataRecordType copy = ((WIGOSMetadataRecordType) draftCopy);
            {
                Boolean headerInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHeaderInformation());
                if (headerInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    WIGOSMetadataRecordType.HeaderInformation sourceHeaderInformation;
                    sourceHeaderInformation = this.getHeaderInformation();
                    WIGOSMetadataRecordType.HeaderInformation copyHeaderInformation = ((WIGOSMetadataRecordType.HeaderInformation) strategy.copy(LocatorUtils.property(locator, "headerInformation", sourceHeaderInformation), sourceHeaderInformation, this.isSetHeaderInformation()));
                    copy.setHeaderInformation(copyHeaderInformation);
                } else {
                    if (headerInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.headerInformation = null;
                    }
                }
            }
            {
                Boolean facilitySetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilitySet());
                if (facilitySetShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.FacilitySet> sourceFacilitySet;
                    sourceFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.FacilitySet> copyFacilitySet = ((List<WIGOSMetadataRecordType.FacilitySet> ) strategy.copy(LocatorUtils.property(locator, "facilitySet", sourceFacilitySet), sourceFacilitySet, this.isSetFacilitySet()));
                    copy.unsetFacilitySet();
                    if (copyFacilitySet!= null) {
                        List<WIGOSMetadataRecordType.FacilitySet> uniqueFacilitySetl = copy.getFacilitySet();
                        uniqueFacilitySetl.addAll(copyFacilitySet);
                    }
                } else {
                    if (facilitySetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFacilitySet();
                    }
                }
            }
            {
                Boolean facilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacility());
                if (facilityShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.Facility> sourceFacility;
                    sourceFacility = (this.isSetFacility()?this.getFacility():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.Facility> copyFacility = ((List<WIGOSMetadataRecordType.Facility> ) strategy.copy(LocatorUtils.property(locator, "facility", sourceFacility), sourceFacility, this.isSetFacility()));
                    copy.unsetFacility();
                    if (copyFacility!= null) {
                        List<WIGOSMetadataRecordType.Facility> uniqueFacilityl = copy.getFacility();
                        uniqueFacilityl.addAll(copyFacility);
                    }
                } else {
                    if (facilityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFacility();
                    }
                }
            }
            {
                Boolean observationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservation());
                if (observationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.Observation> sourceObservation;
                    sourceObservation = (this.isSetObservation()?this.getObservation():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.Observation> copyObservation = ((List<WIGOSMetadataRecordType.Observation> ) strategy.copy(LocatorUtils.property(locator, "observation", sourceObservation), sourceObservation, this.isSetObservation()));
                    copy.unsetObservation();
                    if (copyObservation!= null) {
                        List<WIGOSMetadataRecordType.Observation> uniqueObservationl = copy.getObservation();
                        uniqueObservationl.addAll(copyObservation);
                    }
                } else {
                    if (observationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetObservation();
                    }
                }
            }
            {
                Boolean deploymentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDeployment());
                if (deploymentShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.Deployment> sourceDeployment;
                    sourceDeployment = (this.isSetDeployment()?this.getDeployment():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.Deployment> copyDeployment = ((List<WIGOSMetadataRecordType.Deployment> ) strategy.copy(LocatorUtils.property(locator, "deployment", sourceDeployment), sourceDeployment, this.isSetDeployment()));
                    copy.unsetDeployment();
                    if (copyDeployment!= null) {
                        List<WIGOSMetadataRecordType.Deployment> uniqueDeploymentl = copy.getDeployment();
                        uniqueDeploymentl.addAll(copyDeployment);
                    }
                } else {
                    if (deploymentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetDeployment();
                    }
                }
            }
            {
                Boolean equipmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipment());
                if (equipmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.Equipment> sourceEquipment;
                    sourceEquipment = (this.isSetEquipment()?this.getEquipment():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.Equipment> copyEquipment = ((List<WIGOSMetadataRecordType.Equipment> ) strategy.copy(LocatorUtils.property(locator, "equipment", sourceEquipment), sourceEquipment, this.isSetEquipment()));
                    copy.unsetEquipment();
                    if (copyEquipment!= null) {
                        List<WIGOSMetadataRecordType.Equipment> uniqueEquipmentl = copy.getEquipment();
                        uniqueEquipmentl.addAll(copyEquipment);
                    }
                } else {
                    if (equipmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetEquipment();
                    }
                }
            }
            {
                Boolean facilityLogShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilityLog());
                if (facilityLogShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.FacilityLog> sourceFacilityLog;
                    sourceFacilityLog = (this.isSetFacilityLog()?this.getFacilityLog():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.FacilityLog> copyFacilityLog = ((List<WIGOSMetadataRecordType.FacilityLog> ) strategy.copy(LocatorUtils.property(locator, "facilityLog", sourceFacilityLog), sourceFacilityLog, this.isSetFacilityLog()));
                    copy.unsetFacilityLog();
                    if (copyFacilityLog!= null) {
                        List<WIGOSMetadataRecordType.FacilityLog> uniqueFacilityLogl = copy.getFacilityLog();
                        uniqueFacilityLogl.addAll(copyFacilityLog);
                    }
                } else {
                    if (facilityLogShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFacilityLog();
                    }
                }
            }
            {
                Boolean equipmentLogShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipmentLog());
                if (equipmentLogShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.EquipmentLog> sourceEquipmentLog;
                    sourceEquipmentLog = (this.isSetEquipmentLog()?this.getEquipmentLog():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.EquipmentLog> copyEquipmentLog = ((List<WIGOSMetadataRecordType.EquipmentLog> ) strategy.copy(LocatorUtils.property(locator, "equipmentLog", sourceEquipmentLog), sourceEquipmentLog, this.isSetEquipmentLog()));
                    copy.unsetEquipmentLog();
                    if (copyEquipmentLog!= null) {
                        List<WIGOSMetadataRecordType.EquipmentLog> uniqueEquipmentLogl = copy.getEquipmentLog();
                        uniqueEquipmentLogl.addAll(copyEquipmentLog);
                    }
                } else {
                    if (equipmentLogShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetEquipmentLog();
                    }
                }
            }
            {
                Boolean extensionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetExtension());
                if (extensionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WIGOSMetadataRecordType.Extension> sourceExtension;
                    sourceExtension = (this.isSetExtension()?this.getExtension():null);
                    @SuppressWarnings("unchecked")
                    List<WIGOSMetadataRecordType.Extension> copyExtension = ((List<WIGOSMetadataRecordType.Extension> ) strategy.copy(LocatorUtils.property(locator, "extension", sourceExtension), sourceExtension, this.isSetExtension()));
                    copy.unsetExtension();
                    if (copyExtension!= null) {
                        List<WIGOSMetadataRecordType.Extension> uniqueExtensionl = copy.getExtension();
                        uniqueExtensionl.addAll(copyExtension);
                    }
                } else {
                    if (extensionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetExtension();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WIGOSMetadataRecordType();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}Deployment"/&gt;
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
        "deployment"
    })
    public static class Deployment
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Deployment", required = true)
        protected DeploymentType deployment;

        /**
         * Gets the value of the deployment property.
         * 
         * @return
         *     possible object is
         *     {@link DeploymentType }
         *     
         */
        public DeploymentType getDeployment() {
            return deployment;
        }

        /**
         * Sets the value of the deployment property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeploymentType }
         *     
         */
        public void setDeployment(DeploymentType value) {
            this.deployment = value;
        }

        public boolean isSetDeployment() {
            return (this.deployment!= null);
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
                DeploymentType theDeployment;
                theDeployment = this.getDeployment();
                strategy.appendField(locator, this, "deployment", buffer, theDeployment, this.isSetDeployment());
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
            final WIGOSMetadataRecordType.Deployment that = ((WIGOSMetadataRecordType.Deployment) object);
            {
                DeploymentType lhsDeployment;
                lhsDeployment = this.getDeployment();
                DeploymentType rhsDeployment;
                rhsDeployment = that.getDeployment();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "deployment", lhsDeployment), LocatorUtils.property(thatLocator, "deployment", rhsDeployment), lhsDeployment, rhsDeployment, this.isSetDeployment(), that.isSetDeployment())) {
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
                DeploymentType theDeployment;
                theDeployment = this.getDeployment();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deployment", theDeployment), currentHashCode, theDeployment, this.isSetDeployment());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.Deployment) {
                final WIGOSMetadataRecordType.Deployment copy = ((WIGOSMetadataRecordType.Deployment) draftCopy);
                {
                    Boolean deploymentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDeployment());
                    if (deploymentShouldBeCopiedAndSet == Boolean.TRUE) {
                        DeploymentType sourceDeployment;
                        sourceDeployment = this.getDeployment();
                        DeploymentType copyDeployment = ((DeploymentType) strategy.copy(LocatorUtils.property(locator, "deployment", sourceDeployment), sourceDeployment, this.isSetDeployment()));
                        copy.setDeployment(copyDeployment);
                    } else {
                        if (deploymentShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.deployment = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.Deployment();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}Equipment"/&gt;
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
        "equipment"
    })
    public static class Equipment
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Equipment", required = true)
        protected EquipmentType equipment;

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link EquipmentType }
         *     
         */
        public EquipmentType getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentType }
         *     
         */
        public void setEquipment(EquipmentType value) {
            this.equipment = value;
        }

        public boolean isSetEquipment() {
            return (this.equipment!= null);
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
                EquipmentType theEquipment;
                theEquipment = this.getEquipment();
                strategy.appendField(locator, this, "equipment", buffer, theEquipment, this.isSetEquipment());
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
            final WIGOSMetadataRecordType.Equipment that = ((WIGOSMetadataRecordType.Equipment) object);
            {
                EquipmentType lhsEquipment;
                lhsEquipment = this.getEquipment();
                EquipmentType rhsEquipment;
                rhsEquipment = that.getEquipment();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "equipment", lhsEquipment), LocatorUtils.property(thatLocator, "equipment", rhsEquipment), lhsEquipment, rhsEquipment, this.isSetEquipment(), that.isSetEquipment())) {
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
                EquipmentType theEquipment;
                theEquipment = this.getEquipment();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipment", theEquipment), currentHashCode, theEquipment, this.isSetEquipment());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.Equipment) {
                final WIGOSMetadataRecordType.Equipment copy = ((WIGOSMetadataRecordType.Equipment) draftCopy);
                {
                    Boolean equipmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipment());
                    if (equipmentShouldBeCopiedAndSet == Boolean.TRUE) {
                        EquipmentType sourceEquipment;
                        sourceEquipment = this.getEquipment();
                        EquipmentType copyEquipment = ((EquipmentType) strategy.copy(LocatorUtils.property(locator, "equipment", sourceEquipment), sourceEquipment, this.isSetEquipment()));
                        copy.setEquipment(copyEquipment);
                    } else {
                        if (equipmentShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.equipment = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.Equipment();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}EquipmentLog"/&gt;
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
        "equipmentLog"
    })
    public static class EquipmentLog
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "EquipmentLog", required = true)
        protected EquipmentLogType equipmentLog;

        /**
         * Gets the value of the equipmentLog property.
         * 
         * @return
         *     possible object is
         *     {@link EquipmentLogType }
         *     
         */
        public EquipmentLogType getEquipmentLog() {
            return equipmentLog;
        }

        /**
         * Sets the value of the equipmentLog property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentLogType }
         *     
         */
        public void setEquipmentLog(EquipmentLogType value) {
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
                EquipmentLogType theEquipmentLog;
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
            final WIGOSMetadataRecordType.EquipmentLog that = ((WIGOSMetadataRecordType.EquipmentLog) object);
            {
                EquipmentLogType lhsEquipmentLog;
                lhsEquipmentLog = this.getEquipmentLog();
                EquipmentLogType rhsEquipmentLog;
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
                EquipmentLogType theEquipmentLog;
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
            if (draftCopy instanceof WIGOSMetadataRecordType.EquipmentLog) {
                final WIGOSMetadataRecordType.EquipmentLog copy = ((WIGOSMetadataRecordType.EquipmentLog) draftCopy);
                {
                    Boolean equipmentLogShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipmentLog());
                    if (equipmentLogShouldBeCopiedAndSet == Boolean.TRUE) {
                        EquipmentLogType sourceEquipmentLog;
                        sourceEquipmentLog = this.getEquipmentLog();
                        EquipmentLogType copyEquipmentLog = ((EquipmentLogType) strategy.copy(LocatorUtils.property(locator, "equipmentLog", sourceEquipmentLog), sourceEquipmentLog, this.isSetEquipmentLog()));
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
            return new WIGOSMetadataRecordType.EquipmentLog();
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
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractObject"/&gt;
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
        "abstractObject"
    })
    public static class Extension
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
        protected JAXBElement<?> abstractObject;

        /**
         * Gets the value of the abstractObject property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ProcessingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SurfaceCoverType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProgramAffiliationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResponsiblePartyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TerritoryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SamplingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ClimateZoneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataPolicyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StatisticalQualifierType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.opm._2013.RangeBoundsType }{@code >}
         *     {@link JAXBElement }{@code <}{@link InstrumentOperatingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.RangeBoundsType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.wmdr._2017.ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DeploymentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilityLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link WIGOSMetadataRecordType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataGenerationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractEnvironmentalMonitoringFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FrequenciesType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilitySetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingCapabilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MeasurementContextType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CompositeObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeospatialLocationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SurfaceRoughnessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResultSetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TopographyBathymetryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link Object }{@code >}
         *     
         */
        public JAXBElement<?> getAbstractObject() {
            return abstractObject;
        }

        /**
         * Sets the value of the abstractObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ProcessingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SurfaceCoverType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProgramAffiliationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResponsiblePartyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TerritoryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SamplingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ClimateZoneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataPolicyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StatisticalQualifierType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.opm._2013.RangeBoundsType }{@code >}
         *     {@link JAXBElement }{@code <}{@link InstrumentOperatingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.RangeBoundsType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.wmdr._2017.ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DeploymentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilityLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link WIGOSMetadataRecordType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataGenerationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractEnvironmentalMonitoringFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FrequenciesType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilitySetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingCapabilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MeasurementContextType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CompositeObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeospatialLocationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SurfaceRoughnessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResultSetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TopographyBathymetryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link Object }{@code >}
         *     
         */
        public void setAbstractObject(JAXBElement<?> value) {
            this.abstractObject = value;
        }

        public boolean isSetAbstractObject() {
            return (this.abstractObject!= null);
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
                JAXBElement<?> theAbstractObject;
                theAbstractObject = this.getAbstractObject();
                strategy.appendField(locator, this, "abstractObject", buffer, theAbstractObject, this.isSetAbstractObject());
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
            final WIGOSMetadataRecordType.Extension that = ((WIGOSMetadataRecordType.Extension) object);
            {
                JAXBElement<?> lhsAbstractObject;
                lhsAbstractObject = this.getAbstractObject();
                JAXBElement<?> rhsAbstractObject;
                rhsAbstractObject = that.getAbstractObject();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractObject", lhsAbstractObject), LocatorUtils.property(thatLocator, "abstractObject", rhsAbstractObject), lhsAbstractObject, rhsAbstractObject, this.isSetAbstractObject(), that.isSetAbstractObject())) {
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
                JAXBElement<?> theAbstractObject;
                theAbstractObject = this.getAbstractObject();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractObject", theAbstractObject), currentHashCode, theAbstractObject, this.isSetAbstractObject());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.Extension) {
                final WIGOSMetadataRecordType.Extension copy = ((WIGOSMetadataRecordType.Extension) draftCopy);
                {
                    Boolean abstractObjectShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAbstractObject());
                    if (abstractObjectShouldBeCopiedAndSet == Boolean.TRUE) {
                        JAXBElement<?> sourceAbstractObject;
                        sourceAbstractObject = this.getAbstractObject();
                        @SuppressWarnings("unchecked")
                        JAXBElement<?> copyAbstractObject = ((JAXBElement<?> ) strategy.copy(LocatorUtils.property(locator, "abstractObject", sourceAbstractObject), sourceAbstractObject, this.isSetAbstractObject()));
                        copy.setAbstractObject(copyAbstractObject);
                    } else {
                        if (abstractObjectShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.abstractObject = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.Extension();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ObservingFacility"/&gt;
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
        "observingFacility"
    })
    public static class Facility
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ObservingFacility", required = true)
        protected ObservingFacilityType observingFacility;

        /**
         * Gets the value of the observingFacility property.
         * 
         * @return
         *     possible object is
         *     {@link ObservingFacilityType }
         *     
         */
        public ObservingFacilityType getObservingFacility() {
            return observingFacility;
        }

        /**
         * Sets the value of the observingFacility property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObservingFacilityType }
         *     
         */
        public void setObservingFacility(ObservingFacilityType value) {
            this.observingFacility = value;
        }

        public boolean isSetObservingFacility() {
            return (this.observingFacility!= null);
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
                ObservingFacilityType theObservingFacility;
                theObservingFacility = this.getObservingFacility();
                strategy.appendField(locator, this, "observingFacility", buffer, theObservingFacility, this.isSetObservingFacility());
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
            final WIGOSMetadataRecordType.Facility that = ((WIGOSMetadataRecordType.Facility) object);
            {
                ObservingFacilityType lhsObservingFacility;
                lhsObservingFacility = this.getObservingFacility();
                ObservingFacilityType rhsObservingFacility;
                rhsObservingFacility = that.getObservingFacility();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "observingFacility", lhsObservingFacility), LocatorUtils.property(thatLocator, "observingFacility", rhsObservingFacility), lhsObservingFacility, rhsObservingFacility, this.isSetObservingFacility(), that.isSetObservingFacility())) {
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
                ObservingFacilityType theObservingFacility;
                theObservingFacility = this.getObservingFacility();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observingFacility", theObservingFacility), currentHashCode, theObservingFacility, this.isSetObservingFacility());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.Facility) {
                final WIGOSMetadataRecordType.Facility copy = ((WIGOSMetadataRecordType.Facility) draftCopy);
                {
                    Boolean observingFacilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservingFacility());
                    if (observingFacilityShouldBeCopiedAndSet == Boolean.TRUE) {
                        ObservingFacilityType sourceObservingFacility;
                        sourceObservingFacility = this.getObservingFacility();
                        ObservingFacilityType copyObservingFacility = ((ObservingFacilityType) strategy.copy(LocatorUtils.property(locator, "observingFacility", sourceObservingFacility), sourceObservingFacility, this.isSetObservingFacility()));
                        copy.setObservingFacility(copyObservingFacility);
                    } else {
                        if (observingFacilityShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.observingFacility = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.Facility();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}FacilityLog"/&gt;
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
        "facilityLog"
    })
    public static class FacilityLog
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FacilityLog", required = true)
        protected FacilityLogType facilityLog;

        /**
         * Gets the value of the facilityLog property.
         * 
         * @return
         *     possible object is
         *     {@link FacilityLogType }
         *     
         */
        public FacilityLogType getFacilityLog() {
            return facilityLog;
        }

        /**
         * Sets the value of the facilityLog property.
         * 
         * @param value
         *     allowed object is
         *     {@link FacilityLogType }
         *     
         */
        public void setFacilityLog(FacilityLogType value) {
            this.facilityLog = value;
        }

        public boolean isSetFacilityLog() {
            return (this.facilityLog!= null);
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
                FacilityLogType theFacilityLog;
                theFacilityLog = this.getFacilityLog();
                strategy.appendField(locator, this, "facilityLog", buffer, theFacilityLog, this.isSetFacilityLog());
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
            final WIGOSMetadataRecordType.FacilityLog that = ((WIGOSMetadataRecordType.FacilityLog) object);
            {
                FacilityLogType lhsFacilityLog;
                lhsFacilityLog = this.getFacilityLog();
                FacilityLogType rhsFacilityLog;
                rhsFacilityLog = that.getFacilityLog();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityLog", lhsFacilityLog), LocatorUtils.property(thatLocator, "facilityLog", rhsFacilityLog), lhsFacilityLog, rhsFacilityLog, this.isSetFacilityLog(), that.isSetFacilityLog())) {
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
                FacilityLogType theFacilityLog;
                theFacilityLog = this.getFacilityLog();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilityLog", theFacilityLog), currentHashCode, theFacilityLog, this.isSetFacilityLog());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.FacilityLog) {
                final WIGOSMetadataRecordType.FacilityLog copy = ((WIGOSMetadataRecordType.FacilityLog) draftCopy);
                {
                    Boolean facilityLogShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilityLog());
                    if (facilityLogShouldBeCopiedAndSet == Boolean.TRUE) {
                        FacilityLogType sourceFacilityLog;
                        sourceFacilityLog = this.getFacilityLog();
                        FacilityLogType copyFacilityLog = ((FacilityLogType) strategy.copy(LocatorUtils.property(locator, "facilityLog", sourceFacilityLog), sourceFacilityLog, this.isSetFacilityLog()));
                        copy.setFacilityLog(copyFacilityLog);
                    } else {
                        if (facilityLogShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.facilityLog = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.FacilityLog();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}FacilitySet"/&gt;
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
        "facilitySet"
    })
    public static class FacilitySet
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FacilitySet", required = true)
        protected FacilitySetType facilitySet;

        /**
         * Gets the value of the facilitySet property.
         * 
         * @return
         *     possible object is
         *     {@link FacilitySetType }
         *     
         */
        public FacilitySetType getFacilitySet() {
            return facilitySet;
        }

        /**
         * Sets the value of the facilitySet property.
         * 
         * @param value
         *     allowed object is
         *     {@link FacilitySetType }
         *     
         */
        public void setFacilitySet(FacilitySetType value) {
            this.facilitySet = value;
        }

        public boolean isSetFacilitySet() {
            return (this.facilitySet!= null);
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
                FacilitySetType theFacilitySet;
                theFacilitySet = this.getFacilitySet();
                strategy.appendField(locator, this, "facilitySet", buffer, theFacilitySet, this.isSetFacilitySet());
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
            final WIGOSMetadataRecordType.FacilitySet that = ((WIGOSMetadataRecordType.FacilitySet) object);
            {
                FacilitySetType lhsFacilitySet;
                lhsFacilitySet = this.getFacilitySet();
                FacilitySetType rhsFacilitySet;
                rhsFacilitySet = that.getFacilitySet();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "facilitySet", lhsFacilitySet), LocatorUtils.property(thatLocator, "facilitySet", rhsFacilitySet), lhsFacilitySet, rhsFacilitySet, this.isSetFacilitySet(), that.isSetFacilitySet())) {
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
                FacilitySetType theFacilitySet;
                theFacilitySet = this.getFacilitySet();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilitySet", theFacilitySet), currentHashCode, theFacilitySet, this.isSetFacilitySet());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.FacilitySet) {
                final WIGOSMetadataRecordType.FacilitySet copy = ((WIGOSMetadataRecordType.FacilitySet) draftCopy);
                {
                    Boolean facilitySetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilitySet());
                    if (facilitySetShouldBeCopiedAndSet == Boolean.TRUE) {
                        FacilitySetType sourceFacilitySet;
                        sourceFacilitySet = this.getFacilitySet();
                        FacilitySetType copyFacilitySet = ((FacilitySetType) strategy.copy(LocatorUtils.property(locator, "facilitySet", sourceFacilitySet), sourceFacilitySet, this.isSetFacilitySet()));
                        copy.setFacilitySet(copyFacilitySet);
                    } else {
                        if (facilitySetShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.facilitySet = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.FacilitySet();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}Header"/&gt;
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
        "header"
    })
    public static class HeaderInformation
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Header", required = true)
        protected HeaderType header;

        /**
         * Gets the value of the header property.
         * 
         * @return
         *     possible object is
         *     {@link HeaderType }
         *     
         */
        public HeaderType getHeader() {
            return header;
        }

        /**
         * Sets the value of the header property.
         * 
         * @param value
         *     allowed object is
         *     {@link HeaderType }
         *     
         */
        public void setHeader(HeaderType value) {
            this.header = value;
        }

        public boolean isSetHeader() {
            return (this.header!= null);
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
                HeaderType theHeader;
                theHeader = this.getHeader();
                strategy.appendField(locator, this, "header", buffer, theHeader, this.isSetHeader());
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
            final WIGOSMetadataRecordType.HeaderInformation that = ((WIGOSMetadataRecordType.HeaderInformation) object);
            {
                HeaderType lhsHeader;
                lhsHeader = this.getHeader();
                HeaderType rhsHeader;
                rhsHeader = that.getHeader();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "header", lhsHeader), LocatorUtils.property(thatLocator, "header", rhsHeader), lhsHeader, rhsHeader, this.isSetHeader(), that.isSetHeader())) {
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
                HeaderType theHeader;
                theHeader = this.getHeader();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "header", theHeader), currentHashCode, theHeader, this.isSetHeader());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.HeaderInformation) {
                final WIGOSMetadataRecordType.HeaderInformation copy = ((WIGOSMetadataRecordType.HeaderInformation) draftCopy);
                {
                    Boolean headerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHeader());
                    if (headerShouldBeCopiedAndSet == Boolean.TRUE) {
                        HeaderType sourceHeader;
                        sourceHeader = this.getHeader();
                        HeaderType copyHeader = ((HeaderType) strategy.copy(LocatorUtils.property(locator, "header", sourceHeader), sourceHeader, this.isSetHeader()));
                        copy.setHeader(copyHeader);
                    } else {
                        if (headerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.header = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.HeaderInformation();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ObservingCapability"/&gt;
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
        "observingCapability"
    })
    public static class Observation
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ObservingCapability", required = true)
        protected ObservingCapabilityType observingCapability;

        /**
         * Gets the value of the observingCapability property.
         * 
         * @return
         *     possible object is
         *     {@link ObservingCapabilityType }
         *     
         */
        public ObservingCapabilityType getObservingCapability() {
            return observingCapability;
        }

        /**
         * Sets the value of the observingCapability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObservingCapabilityType }
         *     
         */
        public void setObservingCapability(ObservingCapabilityType value) {
            this.observingCapability = value;
        }

        public boolean isSetObservingCapability() {
            return (this.observingCapability!= null);
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
                ObservingCapabilityType theObservingCapability;
                theObservingCapability = this.getObservingCapability();
                strategy.appendField(locator, this, "observingCapability", buffer, theObservingCapability, this.isSetObservingCapability());
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
            final WIGOSMetadataRecordType.Observation that = ((WIGOSMetadataRecordType.Observation) object);
            {
                ObservingCapabilityType lhsObservingCapability;
                lhsObservingCapability = this.getObservingCapability();
                ObservingCapabilityType rhsObservingCapability;
                rhsObservingCapability = that.getObservingCapability();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "observingCapability", lhsObservingCapability), LocatorUtils.property(thatLocator, "observingCapability", rhsObservingCapability), lhsObservingCapability, rhsObservingCapability, this.isSetObservingCapability(), that.isSetObservingCapability())) {
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
                ObservingCapabilityType theObservingCapability;
                theObservingCapability = this.getObservingCapability();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observingCapability", theObservingCapability), currentHashCode, theObservingCapability, this.isSetObservingCapability());
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
            if (draftCopy instanceof WIGOSMetadataRecordType.Observation) {
                final WIGOSMetadataRecordType.Observation copy = ((WIGOSMetadataRecordType.Observation) draftCopy);
                {
                    Boolean observingCapabilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservingCapability());
                    if (observingCapabilityShouldBeCopiedAndSet == Boolean.TRUE) {
                        ObservingCapabilityType sourceObservingCapability;
                        sourceObservingCapability = this.getObservingCapability();
                        ObservingCapabilityType copyObservingCapability = ((ObservingCapabilityType) strategy.copy(LocatorUtils.property(locator, "observingCapability", sourceObservingCapability), sourceObservingCapability, this.isSetObservingCapability()));
                        copy.setObservingCapability(copyObservingCapability);
                    } else {
                        if (observingCapabilityShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.observingCapability = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIGOSMetadataRecordType.Observation();
        }

    }

}


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
import net.opengis.gml.v_3_2.AbstractDatumType;
import net.opengis.gml.v_3_2.AbstractFeatureType;
import net.opengis.gml.v_3_2.AbstractGMLType;
import net.opengis.gml.v_3_2.AbstractMemberType;
import net.opengis.gml.v_3_2.DefinitionType;
import net.opengis.gml.v_3_2.VerticalDatumType;
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
 * <p>Java class for ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/metce/2013}ProcessType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deployment" type="{http://def.wmo.int/wmdr/2017}DeploymentPropertyType"/&gt;
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
@XmlType(name = "ProcessType", propOrder = {
    "deployment",
    "extension"
})
public class ProcessType
    extends _int.wmo.def.metce._2013.ProcessType
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DeploymentPropertyType deployment;
    protected List<ProcessType.Extension> extension;

    /**
     * Gets the value of the deployment property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentPropertyType }
     *     
     */
    public DeploymentPropertyType getDeployment() {
        return deployment;
    }

    /**
     * Sets the value of the deployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentPropertyType }
     *     
     */
    public void setDeployment(DeploymentPropertyType value) {
        this.deployment = value;
    }

    public boolean isSetDeployment() {
        return (this.deployment!= null);
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
     * {@link ProcessType.Extension }
     * 
     * 
     */
    public List<ProcessType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ProcessType.Extension>();
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
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
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
            DeploymentPropertyType theDeployment;
            theDeployment = this.getDeployment();
            strategy.appendField(locator, this, "deployment", buffer, theDeployment, this.isSetDeployment());
        }
        {
            List<ProcessType.Extension> theExtension;
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
        final ProcessType that = ((ProcessType) object);
        {
            DeploymentPropertyType lhsDeployment;
            lhsDeployment = this.getDeployment();
            DeploymentPropertyType rhsDeployment;
            rhsDeployment = that.getDeployment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deployment", lhsDeployment), LocatorUtils.property(thatLocator, "deployment", rhsDeployment), lhsDeployment, rhsDeployment, this.isSetDeployment(), that.isSetDeployment())) {
                return false;
            }
        }
        {
            List<ProcessType.Extension> lhsExtension;
            lhsExtension = (this.isSetExtension()?this.getExtension():null);
            List<ProcessType.Extension> rhsExtension;
            rhsExtension = (that.isSetExtension()?that.getExtension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extension", lhsExtension), LocatorUtils.property(thatLocator, "extension", rhsExtension), lhsExtension, rhsExtension, this.isSetExtension(), that.isSetExtension())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DeploymentPropertyType theDeployment;
            theDeployment = this.getDeployment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deployment", theDeployment), currentHashCode, theDeployment, this.isSetDeployment());
        }
        {
            List<ProcessType.Extension> theExtension;
            theExtension = (this.isSetExtension()?this.getExtension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extension", theExtension), currentHashCode, theExtension, this.isSetExtension());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE2;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ProcessType) {
            final ProcessType copy = ((ProcessType) draftCopy);
            {
                Boolean deploymentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDeployment());
                if (deploymentShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeploymentPropertyType sourceDeployment;
                    sourceDeployment = this.getDeployment();
                    DeploymentPropertyType copyDeployment = ((DeploymentPropertyType) strategy.copy(LocatorUtils.property(locator, "deployment", sourceDeployment), sourceDeployment, this.isSetDeployment()));
                    copy.setDeployment(copyDeployment);
                } else {
                    if (deploymentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deployment = null;
                    }
                }
            }
            {
                Boolean extensionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetExtension());
                if (extensionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ProcessType.Extension> sourceExtension;
                    sourceExtension = (this.isSetExtension()?this.getExtension():null);
                    @SuppressWarnings("unchecked")
                    List<ProcessType.Extension> copyExtension = ((List<ProcessType.Extension> ) strategy.copy(LocatorUtils.property(locator, "extension", sourceExtension), sourceExtension, this.isSetExtension()));
                    copy.unsetExtension();
                    if (copyExtension!= null) {
                        List<ProcessType.Extension> uniqueExtensionl = copy.getExtension();
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
        return new ProcessType();
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
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
        protected JAXBElement<?> abstractObject;

        /**
         * Gets the value of the abstractObject property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SurfaceCoverType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ClimateZoneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TopographyBathymetryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StatisticalQualifierType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeospatialLocationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataPolicyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResponsiblePartyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SurfaceRoughnessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProcessingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.opm._2013.RangeBoundsType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MeasurementContextType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FrequenciesType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingCapabilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DeploymentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractEnvironmentalMonitoringFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataGenerationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilityLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link WIGOSMetadataRecordType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilitySetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CompositeObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResultSetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SamplingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TerritoryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link InstrumentOperatingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProgramAffiliationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.RangeBoundsType }{@code >}
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
         *     {@link JAXBElement }{@code <}{@link SurfaceCoverType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ClimateZoneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TopographyBathymetryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StatisticalQualifierType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeospatialLocationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataPolicyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResponsiblePartyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SurfaceRoughnessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProcessingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.opm._2013.RangeBoundsType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MeasurementContextType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FrequenciesType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingCapabilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DeploymentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservingFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractEnvironmentalMonitoringFacilityType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DataGenerationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilityLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EquipmentLogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.ProcessType }{@code >}
         *     {@link JAXBElement }{@code <}{@link WIGOSMetadataRecordType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FacilitySetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link CompositeObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResultSetType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ReportingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SamplingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TerritoryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link InstrumentOperatingStatusType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProgramAffiliationType }{@code >}
         *     {@link JAXBElement }{@code <}{@link _int.wmo.def.metce._2013.RangeBoundsType }{@code >}
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
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
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
            final ProcessType.Extension that = ((ProcessType.Extension) object);
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
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
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
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE2;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof ProcessType.Extension) {
                final ProcessType.Extension copy = ((ProcessType.Extension) draftCopy);
                {
                    Boolean abstractObjectShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAbstractObject());
                    if (abstractObjectShouldBeCopiedAndSet == Boolean.TRUE) {
                        JAXBElement<?> sourceAbstractObject;
                        sourceAbstractObject = this.getAbstractObject();
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
            return new ProcessType.Extension();
        }

    }

}


package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
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
import net.opengis.gml.v_3_2_1.AbstractMetadataPropertyType;
import net.opengis.gml.v_3_2_1.DefinitionType;
import net.opengis.gml.v_3_2_1.VerticalDatumType;
import net.opengis.iso19139.gmd.v_20070417.CIOnlineResourceType;
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
 * <p>Java class for AbstractEnvironmentalMonitoringFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnvironmentalMonitoringFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responsibleParty" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}ResponsibleParty"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geospatialLocation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}GeospatialLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="onlineResource" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.isotc211.org/2005/gmd}CI_OnlineResource"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="description" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}Description"/&gt;
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
@XmlType(name = "AbstractEnvironmentalMonitoringFacilityType", propOrder = {
    "responsibleParty",
    "geospatialLocation",
    "onlineResource",
    "descriptionList",
    "extension"
})
@XmlSeeAlso({
    EquipmentType.class,
    ObservingFacilityType.class
})
public abstract class AbstractEnvironmentalMonitoringFacilityType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> responsibleParty;
    protected List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> geospatialLocation;
    protected List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> onlineResource;
    @XmlElement(name = "description")
    protected List<AbstractEnvironmentalMonitoringFacilityType.Description> descriptionList;
    protected List<AbstractEnvironmentalMonitoringFacilityType.Extension> extension;

    /**
     * Gets the value of the responsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty }
     * 
     * 
     */
    public List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> getResponsibleParty() {
        if (responsibleParty == null) {
            responsibleParty = new ArrayList<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty>();
        }
        return this.responsibleParty;
    }

    public boolean isSetResponsibleParty() {
        return ((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()));
    }

    public void unsetResponsibleParty() {
        this.responsibleParty = null;
    }

    /**
     * Gets the value of the geospatialLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geospatialLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeospatialLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation }
     * 
     * 
     */
    public List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> getGeospatialLocation() {
        if (geospatialLocation == null) {
            geospatialLocation = new ArrayList<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation>();
        }
        return this.geospatialLocation;
    }

    public boolean isSetGeospatialLocation() {
        return ((this.geospatialLocation!= null)&&(!this.geospatialLocation.isEmpty()));
    }

    public void unsetGeospatialLocation() {
        this.geospatialLocation = null;
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractEnvironmentalMonitoringFacilityType.OnlineResource }
     * 
     * 
     */
    public List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> getOnlineResource() {
        if (onlineResource == null) {
            onlineResource = new ArrayList<AbstractEnvironmentalMonitoringFacilityType.OnlineResource>();
        }
        return this.onlineResource;
    }

    public boolean isSetOnlineResource() {
        return ((this.onlineResource!= null)&&(!this.onlineResource.isEmpty()));
    }

    public void unsetOnlineResource() {
        this.onlineResource = null;
    }

    /**
     * Gets the value of the descriptionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractEnvironmentalMonitoringFacilityType.Description }
     * 
     * 
     */
    public List<AbstractEnvironmentalMonitoringFacilityType.Description> getDescriptionList() {
        if (descriptionList == null) {
            descriptionList = new ArrayList<AbstractEnvironmentalMonitoringFacilityType.Description>();
        }
        return this.descriptionList;
    }

    public boolean isSetDescriptionList() {
        return ((this.descriptionList!= null)&&(!this.descriptionList.isEmpty()));
    }

    public void unsetDescriptionList() {
        this.descriptionList = null;
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
     * {@link AbstractEnvironmentalMonitoringFacilityType.Extension }
     * 
     * 
     */
    public List<AbstractEnvironmentalMonitoringFacilityType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AbstractEnvironmentalMonitoringFacilityType.Extension>();
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
            List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> theResponsibleParty;
            theResponsibleParty = (this.isSetResponsibleParty()?this.getResponsibleParty():null);
            strategy.appendField(locator, this, "responsibleParty", buffer, theResponsibleParty, this.isSetResponsibleParty());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> theGeospatialLocation;
            theGeospatialLocation = (this.isSetGeospatialLocation()?this.getGeospatialLocation():null);
            strategy.appendField(locator, this, "geospatialLocation", buffer, theGeospatialLocation, this.isSetGeospatialLocation());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> theOnlineResource;
            theOnlineResource = (this.isSetOnlineResource()?this.getOnlineResource():null);
            strategy.appendField(locator, this, "onlineResource", buffer, theOnlineResource, this.isSetOnlineResource());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.Description> theDescriptionList;
            theDescriptionList = (this.isSetDescriptionList()?this.getDescriptionList():null);
            strategy.appendField(locator, this, "descriptionList", buffer, theDescriptionList, this.isSetDescriptionList());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.Extension> theExtension;
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
        final AbstractEnvironmentalMonitoringFacilityType that = ((AbstractEnvironmentalMonitoringFacilityType) object);
        {
            List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> lhsResponsibleParty;
            lhsResponsibleParty = (this.isSetResponsibleParty()?this.getResponsibleParty():null);
            List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> rhsResponsibleParty;
            rhsResponsibleParty = (that.isSetResponsibleParty()?that.getResponsibleParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsibleParty", lhsResponsibleParty), LocatorUtils.property(thatLocator, "responsibleParty", rhsResponsibleParty), lhsResponsibleParty, rhsResponsibleParty, this.isSetResponsibleParty(), that.isSetResponsibleParty())) {
                return false;
            }
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> lhsGeospatialLocation;
            lhsGeospatialLocation = (this.isSetGeospatialLocation()?this.getGeospatialLocation():null);
            List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> rhsGeospatialLocation;
            rhsGeospatialLocation = (that.isSetGeospatialLocation()?that.getGeospatialLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geospatialLocation", lhsGeospatialLocation), LocatorUtils.property(thatLocator, "geospatialLocation", rhsGeospatialLocation), lhsGeospatialLocation, rhsGeospatialLocation, this.isSetGeospatialLocation(), that.isSetGeospatialLocation())) {
                return false;
            }
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> lhsOnlineResource;
            lhsOnlineResource = (this.isSetOnlineResource()?this.getOnlineResource():null);
            List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> rhsOnlineResource;
            rhsOnlineResource = (that.isSetOnlineResource()?that.getOnlineResource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onlineResource", lhsOnlineResource), LocatorUtils.property(thatLocator, "onlineResource", rhsOnlineResource), lhsOnlineResource, rhsOnlineResource, this.isSetOnlineResource(), that.isSetOnlineResource())) {
                return false;
            }
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.Description> lhsDescriptionList;
            lhsDescriptionList = (this.isSetDescriptionList()?this.getDescriptionList():null);
            List<AbstractEnvironmentalMonitoringFacilityType.Description> rhsDescriptionList;
            rhsDescriptionList = (that.isSetDescriptionList()?that.getDescriptionList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionList", lhsDescriptionList), LocatorUtils.property(thatLocator, "descriptionList", rhsDescriptionList), lhsDescriptionList, rhsDescriptionList, this.isSetDescriptionList(), that.isSetDescriptionList())) {
                return false;
            }
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.Extension> lhsExtension;
            lhsExtension = (this.isSetExtension()?this.getExtension():null);
            List<AbstractEnvironmentalMonitoringFacilityType.Extension> rhsExtension;
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
            List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> theResponsibleParty;
            theResponsibleParty = (this.isSetResponsibleParty()?this.getResponsibleParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsibleParty", theResponsibleParty), currentHashCode, theResponsibleParty, this.isSetResponsibleParty());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> theGeospatialLocation;
            theGeospatialLocation = (this.isSetGeospatialLocation()?this.getGeospatialLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geospatialLocation", theGeospatialLocation), currentHashCode, theGeospatialLocation, this.isSetGeospatialLocation());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> theOnlineResource;
            theOnlineResource = (this.isSetOnlineResource()?this.getOnlineResource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onlineResource", theOnlineResource), currentHashCode, theOnlineResource, this.isSetOnlineResource());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.Description> theDescriptionList;
            theDescriptionList = (this.isSetDescriptionList()?this.getDescriptionList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "descriptionList", theDescriptionList), currentHashCode, theDescriptionList, this.isSetDescriptionList());
        }
        {
            List<AbstractEnvironmentalMonitoringFacilityType.Extension> theExtension;
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AbstractEnvironmentalMonitoringFacilityType) {
            final AbstractEnvironmentalMonitoringFacilityType copy = ((AbstractEnvironmentalMonitoringFacilityType) target);
            {
                Boolean responsiblePartyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetResponsibleParty());
                if (responsiblePartyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> sourceResponsibleParty;
                    sourceResponsibleParty = (this.isSetResponsibleParty()?this.getResponsibleParty():null);
                    @SuppressWarnings("unchecked")
                    List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> copyResponsibleParty = ((List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> ) strategy.copy(LocatorUtils.property(locator, "responsibleParty", sourceResponsibleParty), sourceResponsibleParty, this.isSetResponsibleParty()));
                    copy.unsetResponsibleParty();
                    if (copyResponsibleParty!= null) {
                        List<AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty> uniqueResponsiblePartyl = copy.getResponsibleParty();
                        uniqueResponsiblePartyl.addAll(copyResponsibleParty);
                    }
                } else {
                    if (responsiblePartyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetResponsibleParty();
                    }
                }
            }
            {
                Boolean geospatialLocationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeospatialLocation());
                if (geospatialLocationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> sourceGeospatialLocation;
                    sourceGeospatialLocation = (this.isSetGeospatialLocation()?this.getGeospatialLocation():null);
                    @SuppressWarnings("unchecked")
                    List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> copyGeospatialLocation = ((List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> ) strategy.copy(LocatorUtils.property(locator, "geospatialLocation", sourceGeospatialLocation), sourceGeospatialLocation, this.isSetGeospatialLocation()));
                    copy.unsetGeospatialLocation();
                    if (copyGeospatialLocation!= null) {
                        List<AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation> uniqueGeospatialLocationl = copy.getGeospatialLocation();
                        uniqueGeospatialLocationl.addAll(copyGeospatialLocation);
                    }
                } else {
                    if (geospatialLocationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetGeospatialLocation();
                    }
                }
            }
            {
                Boolean onlineResourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOnlineResource());
                if (onlineResourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> sourceOnlineResource;
                    sourceOnlineResource = (this.isSetOnlineResource()?this.getOnlineResource():null);
                    @SuppressWarnings("unchecked")
                    List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> copyOnlineResource = ((List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> ) strategy.copy(LocatorUtils.property(locator, "onlineResource", sourceOnlineResource), sourceOnlineResource, this.isSetOnlineResource()));
                    copy.unsetOnlineResource();
                    if (copyOnlineResource!= null) {
                        List<AbstractEnvironmentalMonitoringFacilityType.OnlineResource> uniqueOnlineResourcel = copy.getOnlineResource();
                        uniqueOnlineResourcel.addAll(copyOnlineResource);
                    }
                } else {
                    if (onlineResourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetOnlineResource();
                    }
                }
            }
            {
                Boolean descriptionListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDescriptionList());
                if (descriptionListShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AbstractEnvironmentalMonitoringFacilityType.Description> sourceDescriptionList;
                    sourceDescriptionList = (this.isSetDescriptionList()?this.getDescriptionList():null);
                    @SuppressWarnings("unchecked")
                    List<AbstractEnvironmentalMonitoringFacilityType.Description> copyDescriptionList = ((List<AbstractEnvironmentalMonitoringFacilityType.Description> ) strategy.copy(LocatorUtils.property(locator, "descriptionList", sourceDescriptionList), sourceDescriptionList, this.isSetDescriptionList()));
                    copy.unsetDescriptionList();
                    if (copyDescriptionList!= null) {
                        List<AbstractEnvironmentalMonitoringFacilityType.Description> uniqueDescriptionListl = copy.getDescriptionList();
                        uniqueDescriptionListl.addAll(copyDescriptionList);
                    }
                } else {
                    if (descriptionListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetDescriptionList();
                    }
                }
            }
            {
                Boolean extensionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetExtension());
                if (extensionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AbstractEnvironmentalMonitoringFacilityType.Extension> sourceExtension;
                    sourceExtension = (this.isSetExtension()?this.getExtension():null);
                    @SuppressWarnings("unchecked")
                    List<AbstractEnvironmentalMonitoringFacilityType.Extension> copyExtension = ((List<AbstractEnvironmentalMonitoringFacilityType.Extension> ) strategy.copy(LocatorUtils.property(locator, "extension", sourceExtension), sourceExtension, this.isSetExtension()));
                    copy.unsetExtension();
                    if (copyExtension!= null) {
                        List<AbstractEnvironmentalMonitoringFacilityType.Extension> uniqueExtensionl = copy.getExtension();
                        uniqueExtensionl.addAll(copyExtension);
                    }
                } else {
                    if (extensionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetExtension();
                    }
                }
            }
        }
        return target;
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}Description"/&gt;
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
        "description"
    })
    public static class Description
        extends AbstractMemberType
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Description", required = true)
        protected DescriptionType description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptionType }
         *     
         */
        public DescriptionType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptionType }
         *     
         */
        public void setDescription(DescriptionType value) {
            this.description = value;
        }

        public boolean isSetDescription() {
            return (this.description!= null);
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
                DescriptionType theDescription;
                theDescription = this.getDescription();
                strategy.appendField(locator, this, "description", buffer, theDescription, this.isSetDescription());
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
            final AbstractEnvironmentalMonitoringFacilityType.Description that = ((AbstractEnvironmentalMonitoringFacilityType.Description) object);
            {
                DescriptionType lhsDescription;
                lhsDescription = this.getDescription();
                DescriptionType rhsDescription;
                rhsDescription = that.getDescription();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, this.isSetDescription(), that.isSetDescription())) {
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
                DescriptionType theDescription;
                theDescription = this.getDescription();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, this.isSetDescription());
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
            if (draftCopy instanceof AbstractEnvironmentalMonitoringFacilityType.Description) {
                final AbstractEnvironmentalMonitoringFacilityType.Description copy = ((AbstractEnvironmentalMonitoringFacilityType.Description) draftCopy);
                {
                    Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDescription());
                    if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                        DescriptionType sourceDescription;
                        sourceDescription = this.getDescription();
                        DescriptionType copyDescription = ((DescriptionType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, this.isSetDescription()));
                        copy.setDescription(copyDescription);
                    } else {
                        if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.description = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AbstractEnvironmentalMonitoringFacilityType.Description();
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
            final AbstractEnvironmentalMonitoringFacilityType.Extension that = ((AbstractEnvironmentalMonitoringFacilityType.Extension) object);
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
            if (draftCopy instanceof AbstractEnvironmentalMonitoringFacilityType.Extension) {
                final AbstractEnvironmentalMonitoringFacilityType.Extension copy = ((AbstractEnvironmentalMonitoringFacilityType.Extension) draftCopy);
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
            return new AbstractEnvironmentalMonitoringFacilityType.Extension();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}GeospatialLocation"/&gt;
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
        "geospatialLocation"
    })
    public static class GeospatialLocation
        extends AbstractMemberType
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "GeospatialLocation", required = true)
        protected GeospatialLocationType geospatialLocation;

        /**
         * Gets the value of the geospatialLocation property.
         * 
         * @return
         *     possible object is
         *     {@link GeospatialLocationType }
         *     
         */
        public GeospatialLocationType getGeospatialLocation() {
            return geospatialLocation;
        }

        /**
         * Sets the value of the geospatialLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeospatialLocationType }
         *     
         */
        public void setGeospatialLocation(GeospatialLocationType value) {
            this.geospatialLocation = value;
        }

        public boolean isSetGeospatialLocation() {
            return (this.geospatialLocation!= null);
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
                GeospatialLocationType theGeospatialLocation;
                theGeospatialLocation = this.getGeospatialLocation();
                strategy.appendField(locator, this, "geospatialLocation", buffer, theGeospatialLocation, this.isSetGeospatialLocation());
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
            final AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation that = ((AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation) object);
            {
                GeospatialLocationType lhsGeospatialLocation;
                lhsGeospatialLocation = this.getGeospatialLocation();
                GeospatialLocationType rhsGeospatialLocation;
                rhsGeospatialLocation = that.getGeospatialLocation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "geospatialLocation", lhsGeospatialLocation), LocatorUtils.property(thatLocator, "geospatialLocation", rhsGeospatialLocation), lhsGeospatialLocation, rhsGeospatialLocation, this.isSetGeospatialLocation(), that.isSetGeospatialLocation())) {
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
                GeospatialLocationType theGeospatialLocation;
                theGeospatialLocation = this.getGeospatialLocation();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geospatialLocation", theGeospatialLocation), currentHashCode, theGeospatialLocation, this.isSetGeospatialLocation());
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
            if (draftCopy instanceof AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation) {
                final AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation copy = ((AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation) draftCopy);
                {
                    Boolean geospatialLocationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeospatialLocation());
                    if (geospatialLocationShouldBeCopiedAndSet == Boolean.TRUE) {
                        GeospatialLocationType sourceGeospatialLocation;
                        sourceGeospatialLocation = this.getGeospatialLocation();
                        GeospatialLocationType copyGeospatialLocation = ((GeospatialLocationType) strategy.copy(LocatorUtils.property(locator, "geospatialLocation", sourceGeospatialLocation), sourceGeospatialLocation, this.isSetGeospatialLocation()));
                        copy.setGeospatialLocation(copyGeospatialLocation);
                    } else {
                        if (geospatialLocationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.geospatialLocation = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation();
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
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.isotc211.org/2005/gmd}CI_OnlineResource"/&gt;
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
        "ciOnlineResource"
    })
    public static class OnlineResource
        extends AbstractMetadataPropertyType
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "CI_OnlineResource", namespace = "http://www.isotc211.org/2005/gmd", required = true)
        protected CIOnlineResourceType ciOnlineResource;

        /**
         * Gets the value of the ciOnlineResource property.
         * 
         * @return
         *     possible object is
         *     {@link CIOnlineResourceType }
         *     
         */
        public CIOnlineResourceType getCIOnlineResource() {
            return ciOnlineResource;
        }

        /**
         * Sets the value of the ciOnlineResource property.
         * 
         * @param value
         *     allowed object is
         *     {@link CIOnlineResourceType }
         *     
         */
        public void setCIOnlineResource(CIOnlineResourceType value) {
            this.ciOnlineResource = value;
        }

        public boolean isSetCIOnlineResource() {
            return (this.ciOnlineResource!= null);
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
                CIOnlineResourceType theCIOnlineResource;
                theCIOnlineResource = this.getCIOnlineResource();
                strategy.appendField(locator, this, "ciOnlineResource", buffer, theCIOnlineResource, this.isSetCIOnlineResource());
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
            final AbstractEnvironmentalMonitoringFacilityType.OnlineResource that = ((AbstractEnvironmentalMonitoringFacilityType.OnlineResource) object);
            {
                CIOnlineResourceType lhsCIOnlineResource;
                lhsCIOnlineResource = this.getCIOnlineResource();
                CIOnlineResourceType rhsCIOnlineResource;
                rhsCIOnlineResource = that.getCIOnlineResource();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "ciOnlineResource", lhsCIOnlineResource), LocatorUtils.property(thatLocator, "ciOnlineResource", rhsCIOnlineResource), lhsCIOnlineResource, rhsCIOnlineResource, this.isSetCIOnlineResource(), that.isSetCIOnlineResource())) {
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
                CIOnlineResourceType theCIOnlineResource;
                theCIOnlineResource = this.getCIOnlineResource();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ciOnlineResource", theCIOnlineResource), currentHashCode, theCIOnlineResource, this.isSetCIOnlineResource());
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
            if (draftCopy instanceof AbstractEnvironmentalMonitoringFacilityType.OnlineResource) {
                final AbstractEnvironmentalMonitoringFacilityType.OnlineResource copy = ((AbstractEnvironmentalMonitoringFacilityType.OnlineResource) draftCopy);
                {
                    Boolean ciOnlineResourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCIOnlineResource());
                    if (ciOnlineResourceShouldBeCopiedAndSet == Boolean.TRUE) {
                        CIOnlineResourceType sourceCIOnlineResource;
                        sourceCIOnlineResource = this.getCIOnlineResource();
                        CIOnlineResourceType copyCIOnlineResource = ((CIOnlineResourceType) strategy.copy(LocatorUtils.property(locator, "ciOnlineResource", sourceCIOnlineResource), sourceCIOnlineResource, this.isSetCIOnlineResource()));
                        copy.setCIOnlineResource(copyCIOnlineResource);
                    } else {
                        if (ciOnlineResourceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.ciOnlineResource = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AbstractEnvironmentalMonitoringFacilityType.OnlineResource();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ResponsibleParty"/&gt;
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
        "responsibleParty"
    })
    public static class ResponsibleParty
        extends AbstractMemberType
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ResponsibleParty", required = true)
        protected ResponsiblePartyType responsibleParty;

        /**
         * Gets the value of the responsibleParty property.
         * 
         * @return
         *     possible object is
         *     {@link ResponsiblePartyType }
         *     
         */
        public ResponsiblePartyType getResponsibleParty() {
            return responsibleParty;
        }

        /**
         * Sets the value of the responsibleParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponsiblePartyType }
         *     
         */
        public void setResponsibleParty(ResponsiblePartyType value) {
            this.responsibleParty = value;
        }

        public boolean isSetResponsibleParty() {
            return (this.responsibleParty!= null);
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
                ResponsiblePartyType theResponsibleParty;
                theResponsibleParty = this.getResponsibleParty();
                strategy.appendField(locator, this, "responsibleParty", buffer, theResponsibleParty, this.isSetResponsibleParty());
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
            final AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty that = ((AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty) object);
            {
                ResponsiblePartyType lhsResponsibleParty;
                lhsResponsibleParty = this.getResponsibleParty();
                ResponsiblePartyType rhsResponsibleParty;
                rhsResponsibleParty = that.getResponsibleParty();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "responsibleParty", lhsResponsibleParty), LocatorUtils.property(thatLocator, "responsibleParty", rhsResponsibleParty), lhsResponsibleParty, rhsResponsibleParty, this.isSetResponsibleParty(), that.isSetResponsibleParty())) {
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
                ResponsiblePartyType theResponsibleParty;
                theResponsibleParty = this.getResponsibleParty();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsibleParty", theResponsibleParty), currentHashCode, theResponsibleParty, this.isSetResponsibleParty());
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
            if (draftCopy instanceof AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty) {
                final AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty copy = ((AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty) draftCopy);
                {
                    Boolean responsiblePartyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetResponsibleParty());
                    if (responsiblePartyShouldBeCopiedAndSet == Boolean.TRUE) {
                        ResponsiblePartyType sourceResponsibleParty;
                        sourceResponsibleParty = this.getResponsibleParty();
                        ResponsiblePartyType copyResponsibleParty = ((ResponsiblePartyType) strategy.copy(LocatorUtils.property(locator, "responsibleParty", sourceResponsibleParty), sourceResponsibleParty, this.isSetResponsibleParty()));
                        copy.setResponsibleParty(copyResponsibleParty);
                    } else {
                        if (responsiblePartyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.responsibleParty = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty();
        }

    }

}

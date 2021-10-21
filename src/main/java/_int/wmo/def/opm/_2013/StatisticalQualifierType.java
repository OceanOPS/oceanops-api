
package _int.wmo.def.opm._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import net.opengis.gml.v_3_2.AreaType;
import net.opengis.gml.v_3_2.AssociationRoleType;
import net.opengis.gml.v_3_2.LengthType;
import net.opengis.gml.v_3_2.VolumeType;
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
 * <p>Java class for StatisticalQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aggregationArea" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/&gt;
 *         &lt;element name="aggregationLength" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="aggregationTimePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="aggregationVolume" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/&gt;
 *         &lt;element name="otherAggregation" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" minOccurs="0"/&gt;
 *         &lt;element name="statisticalFunction" type="{http://def.wmo.int/opm/2013}StatisticalFunctionCodeType"/&gt;
 *         &lt;element name="derivedFrom" type="{http://def.wmo.int/opm/2013}StatisticalQualifierPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticalQualifierType", propOrder = {
    "description",
    "aggregationArea",
    "aggregationLength",
    "aggregationTimePeriod",
    "aggregationVolume",
    "otherAggregation",
    "statisticalFunction",
    "derivedFrom"
})
public class StatisticalQualifierType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String description;
    protected AreaType aggregationArea;
    protected LengthType aggregationLength;
    protected Duration aggregationTimePeriod;
    protected VolumeType aggregationVolume;
    protected AssociationRoleType otherAggregation;
    @XmlElement(required = true)
    protected StatisticalFunctionCodeType statisticalFunction;
    protected StatisticalQualifierPropertyType derivedFrom;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the aggregationArea property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getAggregationArea() {
        return aggregationArea;
    }

    /**
     * Sets the value of the aggregationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setAggregationArea(AreaType value) {
        this.aggregationArea = value;
    }

    public boolean isSetAggregationArea() {
        return (this.aggregationArea!= null);
    }

    /**
     * Gets the value of the aggregationLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getAggregationLength() {
        return aggregationLength;
    }

    /**
     * Sets the value of the aggregationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setAggregationLength(LengthType value) {
        this.aggregationLength = value;
    }

    public boolean isSetAggregationLength() {
        return (this.aggregationLength!= null);
    }

    /**
     * Gets the value of the aggregationTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAggregationTimePeriod() {
        return aggregationTimePeriod;
    }

    /**
     * Sets the value of the aggregationTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAggregationTimePeriod(Duration value) {
        this.aggregationTimePeriod = value;
    }

    public boolean isSetAggregationTimePeriod() {
        return (this.aggregationTimePeriod!= null);
    }

    /**
     * Gets the value of the aggregationVolume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getAggregationVolume() {
        return aggregationVolume;
    }

    /**
     * Sets the value of the aggregationVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setAggregationVolume(VolumeType value) {
        this.aggregationVolume = value;
    }

    public boolean isSetAggregationVolume() {
        return (this.aggregationVolume!= null);
    }

    /**
     * Gets the value of the otherAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getOtherAggregation() {
        return otherAggregation;
    }

    /**
     * Sets the value of the otherAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setOtherAggregation(AssociationRoleType value) {
        this.otherAggregation = value;
    }

    public boolean isSetOtherAggregation() {
        return (this.otherAggregation!= null);
    }

    /**
     * Gets the value of the statisticalFunction property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalFunctionCodeType }
     *     
     */
    public StatisticalFunctionCodeType getStatisticalFunction() {
        return statisticalFunction;
    }

    /**
     * Sets the value of the statisticalFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalFunctionCodeType }
     *     
     */
    public void setStatisticalFunction(StatisticalFunctionCodeType value) {
        this.statisticalFunction = value;
    }

    public boolean isSetStatisticalFunction() {
        return (this.statisticalFunction!= null);
    }

    /**
     * Gets the value of the derivedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalQualifierPropertyType }
     *     
     */
    public StatisticalQualifierPropertyType getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * Sets the value of the derivedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalQualifierPropertyType }
     *     
     */
    public void setDerivedFrom(StatisticalQualifierPropertyType value) {
        this.derivedFrom = value;
    }

    public boolean isSetDerivedFrom() {
        return (this.derivedFrom!= null);
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
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, this.isSetDescription());
        }
        {
            AreaType theAggregationArea;
            theAggregationArea = this.getAggregationArea();
            strategy.appendField(locator, this, "aggregationArea", buffer, theAggregationArea, this.isSetAggregationArea());
        }
        {
            LengthType theAggregationLength;
            theAggregationLength = this.getAggregationLength();
            strategy.appendField(locator, this, "aggregationLength", buffer, theAggregationLength, this.isSetAggregationLength());
        }
        {
            Duration theAggregationTimePeriod;
            theAggregationTimePeriod = this.getAggregationTimePeriod();
            strategy.appendField(locator, this, "aggregationTimePeriod", buffer, theAggregationTimePeriod, this.isSetAggregationTimePeriod());
        }
        {
            VolumeType theAggregationVolume;
            theAggregationVolume = this.getAggregationVolume();
            strategy.appendField(locator, this, "aggregationVolume", buffer, theAggregationVolume, this.isSetAggregationVolume());
        }
        {
            AssociationRoleType theOtherAggregation;
            theOtherAggregation = this.getOtherAggregation();
            strategy.appendField(locator, this, "otherAggregation", buffer, theOtherAggregation, this.isSetOtherAggregation());
        }
        {
            StatisticalFunctionCodeType theStatisticalFunction;
            theStatisticalFunction = this.getStatisticalFunction();
            strategy.appendField(locator, this, "statisticalFunction", buffer, theStatisticalFunction, this.isSetStatisticalFunction());
        }
        {
            StatisticalQualifierPropertyType theDerivedFrom;
            theDerivedFrom = this.getDerivedFrom();
            strategy.appendField(locator, this, "derivedFrom", buffer, theDerivedFrom, this.isSetDerivedFrom());
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
        final StatisticalQualifierType that = ((StatisticalQualifierType) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, this.isSetDescription(), that.isSetDescription())) {
                return false;
            }
        }
        {
            AreaType lhsAggregationArea;
            lhsAggregationArea = this.getAggregationArea();
            AreaType rhsAggregationArea;
            rhsAggregationArea = that.getAggregationArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationArea", lhsAggregationArea), LocatorUtils.property(thatLocator, "aggregationArea", rhsAggregationArea), lhsAggregationArea, rhsAggregationArea, this.isSetAggregationArea(), that.isSetAggregationArea())) {
                return false;
            }
        }
        {
            LengthType lhsAggregationLength;
            lhsAggregationLength = this.getAggregationLength();
            LengthType rhsAggregationLength;
            rhsAggregationLength = that.getAggregationLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationLength", lhsAggregationLength), LocatorUtils.property(thatLocator, "aggregationLength", rhsAggregationLength), lhsAggregationLength, rhsAggregationLength, this.isSetAggregationLength(), that.isSetAggregationLength())) {
                return false;
            }
        }
        {
            Duration lhsAggregationTimePeriod;
            lhsAggregationTimePeriod = this.getAggregationTimePeriod();
            Duration rhsAggregationTimePeriod;
            rhsAggregationTimePeriod = that.getAggregationTimePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationTimePeriod", lhsAggregationTimePeriod), LocatorUtils.property(thatLocator, "aggregationTimePeriod", rhsAggregationTimePeriod), lhsAggregationTimePeriod, rhsAggregationTimePeriod, this.isSetAggregationTimePeriod(), that.isSetAggregationTimePeriod())) {
                return false;
            }
        }
        {
            VolumeType lhsAggregationVolume;
            lhsAggregationVolume = this.getAggregationVolume();
            VolumeType rhsAggregationVolume;
            rhsAggregationVolume = that.getAggregationVolume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationVolume", lhsAggregationVolume), LocatorUtils.property(thatLocator, "aggregationVolume", rhsAggregationVolume), lhsAggregationVolume, rhsAggregationVolume, this.isSetAggregationVolume(), that.isSetAggregationVolume())) {
                return false;
            }
        }
        {
            AssociationRoleType lhsOtherAggregation;
            lhsOtherAggregation = this.getOtherAggregation();
            AssociationRoleType rhsOtherAggregation;
            rhsOtherAggregation = that.getOtherAggregation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherAggregation", lhsOtherAggregation), LocatorUtils.property(thatLocator, "otherAggregation", rhsOtherAggregation), lhsOtherAggregation, rhsOtherAggregation, this.isSetOtherAggregation(), that.isSetOtherAggregation())) {
                return false;
            }
        }
        {
            StatisticalFunctionCodeType lhsStatisticalFunction;
            lhsStatisticalFunction = this.getStatisticalFunction();
            StatisticalFunctionCodeType rhsStatisticalFunction;
            rhsStatisticalFunction = that.getStatisticalFunction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statisticalFunction", lhsStatisticalFunction), LocatorUtils.property(thatLocator, "statisticalFunction", rhsStatisticalFunction), lhsStatisticalFunction, rhsStatisticalFunction, this.isSetStatisticalFunction(), that.isSetStatisticalFunction())) {
                return false;
            }
        }
        {
            StatisticalQualifierPropertyType lhsDerivedFrom;
            lhsDerivedFrom = this.getDerivedFrom();
            StatisticalQualifierPropertyType rhsDerivedFrom;
            rhsDerivedFrom = that.getDerivedFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "derivedFrom", lhsDerivedFrom), LocatorUtils.property(thatLocator, "derivedFrom", rhsDerivedFrom), lhsDerivedFrom, rhsDerivedFrom, this.isSetDerivedFrom(), that.isSetDerivedFrom())) {
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
        int currentHashCode = 1;
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, this.isSetDescription());
        }
        {
            AreaType theAggregationArea;
            theAggregationArea = this.getAggregationArea();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationArea", theAggregationArea), currentHashCode, theAggregationArea, this.isSetAggregationArea());
        }
        {
            LengthType theAggregationLength;
            theAggregationLength = this.getAggregationLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationLength", theAggregationLength), currentHashCode, theAggregationLength, this.isSetAggregationLength());
        }
        {
            Duration theAggregationTimePeriod;
            theAggregationTimePeriod = this.getAggregationTimePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationTimePeriod", theAggregationTimePeriod), currentHashCode, theAggregationTimePeriod, this.isSetAggregationTimePeriod());
        }
        {
            VolumeType theAggregationVolume;
            theAggregationVolume = this.getAggregationVolume();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationVolume", theAggregationVolume), currentHashCode, theAggregationVolume, this.isSetAggregationVolume());
        }
        {
            AssociationRoleType theOtherAggregation;
            theOtherAggregation = this.getOtherAggregation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherAggregation", theOtherAggregation), currentHashCode, theOtherAggregation, this.isSetOtherAggregation());
        }
        {
            StatisticalFunctionCodeType theStatisticalFunction;
            theStatisticalFunction = this.getStatisticalFunction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statisticalFunction", theStatisticalFunction), currentHashCode, theStatisticalFunction, this.isSetStatisticalFunction());
        }
        {
            StatisticalQualifierPropertyType theDerivedFrom;
            theDerivedFrom = this.getDerivedFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "derivedFrom", theDerivedFrom), currentHashCode, theDerivedFrom, this.isSetDerivedFrom());
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
        if (draftCopy instanceof StatisticalQualifierType) {
            final StatisticalQualifierType copy = ((StatisticalQualifierType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDescription());
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, this.isSetDescription()));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean aggregationAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAggregationArea());
                if (aggregationAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    AreaType sourceAggregationArea;
                    sourceAggregationArea = this.getAggregationArea();
                    AreaType copyAggregationArea = ((AreaType) strategy.copy(LocatorUtils.property(locator, "aggregationArea", sourceAggregationArea), sourceAggregationArea, this.isSetAggregationArea()));
                    copy.setAggregationArea(copyAggregationArea);
                } else {
                    if (aggregationAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aggregationArea = null;
                    }
                }
            }
            {
                Boolean aggregationLengthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAggregationLength());
                if (aggregationLengthShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceAggregationLength;
                    sourceAggregationLength = this.getAggregationLength();
                    LengthType copyAggregationLength = ((LengthType) strategy.copy(LocatorUtils.property(locator, "aggregationLength", sourceAggregationLength), sourceAggregationLength, this.isSetAggregationLength()));
                    copy.setAggregationLength(copyAggregationLength);
                } else {
                    if (aggregationLengthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aggregationLength = null;
                    }
                }
            }
            {
                Boolean aggregationTimePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAggregationTimePeriod());
                if (aggregationTimePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceAggregationTimePeriod;
                    sourceAggregationTimePeriod = this.getAggregationTimePeriod();
                    Duration copyAggregationTimePeriod = ((Duration) strategy.copy(LocatorUtils.property(locator, "aggregationTimePeriod", sourceAggregationTimePeriod), sourceAggregationTimePeriod, this.isSetAggregationTimePeriod()));
                    copy.setAggregationTimePeriod(copyAggregationTimePeriod);
                } else {
                    if (aggregationTimePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aggregationTimePeriod = null;
                    }
                }
            }
            {
                Boolean aggregationVolumeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAggregationVolume());
                if (aggregationVolumeShouldBeCopiedAndSet == Boolean.TRUE) {
                    VolumeType sourceAggregationVolume;
                    sourceAggregationVolume = this.getAggregationVolume();
                    VolumeType copyAggregationVolume = ((VolumeType) strategy.copy(LocatorUtils.property(locator, "aggregationVolume", sourceAggregationVolume), sourceAggregationVolume, this.isSetAggregationVolume()));
                    copy.setAggregationVolume(copyAggregationVolume);
                } else {
                    if (aggregationVolumeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aggregationVolume = null;
                    }
                }
            }
            {
                Boolean otherAggregationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOtherAggregation());
                if (otherAggregationShouldBeCopiedAndSet == Boolean.TRUE) {
                    AssociationRoleType sourceOtherAggregation;
                    sourceOtherAggregation = this.getOtherAggregation();
                    AssociationRoleType copyOtherAggregation = ((AssociationRoleType) strategy.copy(LocatorUtils.property(locator, "otherAggregation", sourceOtherAggregation), sourceOtherAggregation, this.isSetOtherAggregation()));
                    copy.setOtherAggregation(copyOtherAggregation);
                } else {
                    if (otherAggregationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.otherAggregation = null;
                    }
                }
            }
            {
                Boolean statisticalFunctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStatisticalFunction());
                if (statisticalFunctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatisticalFunctionCodeType sourceStatisticalFunction;
                    sourceStatisticalFunction = this.getStatisticalFunction();
                    StatisticalFunctionCodeType copyStatisticalFunction = ((StatisticalFunctionCodeType) strategy.copy(LocatorUtils.property(locator, "statisticalFunction", sourceStatisticalFunction), sourceStatisticalFunction, this.isSetStatisticalFunction()));
                    copy.setStatisticalFunction(copyStatisticalFunction);
                } else {
                    if (statisticalFunctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statisticalFunction = null;
                    }
                }
            }
            {
                Boolean derivedFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDerivedFrom());
                if (derivedFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatisticalQualifierPropertyType sourceDerivedFrom;
                    sourceDerivedFrom = this.getDerivedFrom();
                    StatisticalQualifierPropertyType copyDerivedFrom = ((StatisticalQualifierPropertyType) strategy.copy(LocatorUtils.property(locator, "derivedFrom", sourceDerivedFrom), sourceDerivedFrom, this.isSetDerivedFrom()));
                    copy.setDerivedFrom(copyDerivedFrom);
                } else {
                    if (derivedFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.derivedFrom = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StatisticalQualifierType();
    }

}

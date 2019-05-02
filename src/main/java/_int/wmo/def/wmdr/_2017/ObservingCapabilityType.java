
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.ReferenceType;
import net.opengis.om.v_2_0.OMObservationPropertyType;
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
 * <p>Java class for ObservingCapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservingCapabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facility" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="programAffiliation" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="observation" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservingCapabilityType", propOrder = {
    "facility",
    "programAffiliation",
    "observation"
})
public class ObservingCapabilityType
    extends AbstractFeatureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType facility;
    @XmlElement(required = true)
    protected List<ReferenceType> programAffiliation;
    @XmlElement(required = true)
    protected List<OMObservationPropertyType> observation;

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
     * Gets the value of the programAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getProgramAffiliation() {
        if (programAffiliation == null) {
            programAffiliation = new ArrayList<ReferenceType>();
        }
        return this.programAffiliation;
    }

    public boolean isSetProgramAffiliation() {
        return ((this.programAffiliation!= null)&&(!this.programAffiliation.isEmpty()));
    }

    public void unsetProgramAffiliation() {
        this.programAffiliation = null;
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
     * {@link OMObservationPropertyType }
     * 
     * 
     */
    public List<OMObservationPropertyType> getObservation() {
        if (observation == null) {
            observation = new ArrayList<OMObservationPropertyType>();
        }
        return this.observation;
    }

    public boolean isSetObservation() {
        return ((this.observation!= null)&&(!this.observation.isEmpty()));
    }

    public void unsetObservation() {
        this.observation = null;
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
            List<ReferenceType> theProgramAffiliation;
            theProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
            strategy.appendField(locator, this, "programAffiliation", buffer, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            List<OMObservationPropertyType> theObservation;
            theObservation = (this.isSetObservation()?this.getObservation():null);
            strategy.appendField(locator, this, "observation", buffer, theObservation, this.isSetObservation());
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
        final ObservingCapabilityType that = ((ObservingCapabilityType) object);
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
            List<ReferenceType> lhsProgramAffiliation;
            lhsProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
            List<ReferenceType> rhsProgramAffiliation;
            rhsProgramAffiliation = (that.isSetProgramAffiliation()?that.getProgramAffiliation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programAffiliation", lhsProgramAffiliation), LocatorUtils.property(thatLocator, "programAffiliation", rhsProgramAffiliation), lhsProgramAffiliation, rhsProgramAffiliation, this.isSetProgramAffiliation(), that.isSetProgramAffiliation())) {
                return false;
            }
        }
        {
            List<OMObservationPropertyType> lhsObservation;
            lhsObservation = (this.isSetObservation()?this.getObservation():null);
            List<OMObservationPropertyType> rhsObservation;
            rhsObservation = (that.isSetObservation()?that.getObservation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "observation", lhsObservation), LocatorUtils.property(thatLocator, "observation", rhsObservation), lhsObservation, rhsObservation, this.isSetObservation(), that.isSetObservation())) {
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
            List<ReferenceType> theProgramAffiliation;
            theProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programAffiliation", theProgramAffiliation), currentHashCode, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            List<OMObservationPropertyType> theObservation;
            theObservation = (this.isSetObservation()?this.getObservation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observation", theObservation), currentHashCode, theObservation, this.isSetObservation());
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
        if (draftCopy instanceof ObservingCapabilityType) {
            final ObservingCapabilityType copy = ((ObservingCapabilityType) draftCopy);
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
                Boolean programAffiliationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProgramAffiliation());
                if (programAffiliationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ReferenceType> sourceProgramAffiliation;
                    sourceProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
                    @SuppressWarnings("unchecked")
                    List<ReferenceType> copyProgramAffiliation = ((List<ReferenceType> ) strategy.copy(LocatorUtils.property(locator, "programAffiliation", sourceProgramAffiliation), sourceProgramAffiliation, this.isSetProgramAffiliation()));
                    copy.unsetProgramAffiliation();
                    if (copyProgramAffiliation!= null) {
                        List<ReferenceType> uniqueProgramAffiliationl = copy.getProgramAffiliation();
                        uniqueProgramAffiliationl.addAll(copyProgramAffiliation);
                    }
                } else {
                    if (programAffiliationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetProgramAffiliation();
                    }
                }
            }
            {
                Boolean observationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservation());
                if (observationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OMObservationPropertyType> sourceObservation;
                    sourceObservation = (this.isSetObservation()?this.getObservation():null);
                    @SuppressWarnings("unchecked")
                    List<OMObservationPropertyType> copyObservation = ((List<OMObservationPropertyType> ) strategy.copy(LocatorUtils.property(locator, "observation", sourceObservation), sourceObservation, this.isSetObservation()));
                    copy.unsetObservation();
                    if (copyObservation!= null) {
                        List<OMObservationPropertyType> uniqueObservationl = copy.getObservation();
                        uniqueObservationl.addAll(copyObservation);
                    }
                } else {
                    if (observationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetObservation();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ObservingCapabilityType();
    }

}

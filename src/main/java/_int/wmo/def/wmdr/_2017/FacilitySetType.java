
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractFeatureType;
import net.opengis.gml.v_3_2.ReferenceType;
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
 * <p>Java class for FacilitySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilitySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facility" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitySetType", propOrder = {
    "facility"
})
public class FacilitySetType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<ReferenceType> facility;

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
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getFacility() {
        if (facility == null) {
            facility = new ArrayList<ReferenceType>();
        }
        return this.facility;
    }

    public boolean isSetFacility() {
        return ((this.facility!= null)&&(!this.facility.isEmpty()));
    }

    public void unsetFacility() {
        this.facility = null;
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
            List<ReferenceType> theFacility;
            theFacility = (this.isSetFacility()?this.getFacility():null);
            strategy.appendField(locator, this, "facility", buffer, theFacility, this.isSetFacility());
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
        final FacilitySetType that = ((FacilitySetType) object);
        {
            List<ReferenceType> lhsFacility;
            lhsFacility = (this.isSetFacility()?this.getFacility():null);
            List<ReferenceType> rhsFacility;
            rhsFacility = (that.isSetFacility()?that.getFacility():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facility", lhsFacility), LocatorUtils.property(thatLocator, "facility", rhsFacility), lhsFacility, rhsFacility, this.isSetFacility(), that.isSetFacility())) {
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
            List<ReferenceType> theFacility;
            theFacility = (this.isSetFacility()?this.getFacility():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facility", theFacility), currentHashCode, theFacility, this.isSetFacility());
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
        if (draftCopy instanceof FacilitySetType) {
            final FacilitySetType copy = ((FacilitySetType) draftCopy);
            {
                Boolean facilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacility());
                if (facilityShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ReferenceType> sourceFacility;
                    sourceFacility = (this.isSetFacility()?this.getFacility():null);
                    @SuppressWarnings("unchecked")
                    List<ReferenceType> copyFacility = ((List<ReferenceType> ) strategy.copy(LocatorUtils.property(locator, "facility", sourceFacility), sourceFacility, this.isSetFacility()));
                    copy.unsetFacility();
                    if (copyFacility!= null) {
                        List<ReferenceType> uniqueFacilityl = copy.getFacility();
                        uniqueFacilityl.addAll(copyFacility);
                    }
                } else {
                    if (facilityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFacility();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FacilitySetType();
    }

}

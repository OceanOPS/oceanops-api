
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for ProgramAffiliationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramAffiliationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ProgramAffiliation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramAffiliationPropertyType", propOrder = {
    "programAffiliation"
})
public class ProgramAffiliationPropertyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProgramAffiliation", required = true)
    protected ProgramAffiliationType programAffiliation;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the programAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramAffiliationType }
     *     
     */
    public ProgramAffiliationType getProgramAffiliation() {
        return programAffiliation;
    }

    /**
     * Sets the value of the programAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramAffiliationType }
     *     
     */
    public void setProgramAffiliation(ProgramAffiliationType value) {
        this.programAffiliation = value;
    }

    public boolean isSetProgramAffiliation() {
        return (this.programAffiliation!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    @Override
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            ProgramAffiliationType theProgramAffiliation;
            theProgramAffiliation = this.getProgramAffiliation();
            strategy.appendField(locator, this, "programAffiliation", buffer, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theOwns, this.isSetOwns());
        }
        return buffer;
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProgramAffiliationPropertyType that = ((ProgramAffiliationPropertyType) object);
        {
            ProgramAffiliationType lhsProgramAffiliation;
            lhsProgramAffiliation = this.getProgramAffiliation();
            ProgramAffiliationType rhsProgramAffiliation;
            rhsProgramAffiliation = that.getProgramAffiliation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programAffiliation", lhsProgramAffiliation), LocatorUtils.property(thatLocator, "programAffiliation", rhsProgramAffiliation), lhsProgramAffiliation, rhsProgramAffiliation, this.isSetProgramAffiliation(), that.isSetProgramAffiliation())) {
                return false;
            }
        }
        {
            boolean lhsOwns;
            lhsOwns = (this.isSetOwns()?this.isOwns():false);
            boolean rhsOwns;
            rhsOwns = (that.isSetOwns()?that.isOwns():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owns", lhsOwns), LocatorUtils.property(thatLocator, "owns", rhsOwns), lhsOwns, rhsOwns, this.isSetOwns(), that.isSetOwns())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ProgramAffiliationType theProgramAffiliation;
            theProgramAffiliation = this.getProgramAffiliation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programAffiliation", theProgramAffiliation), currentHashCode, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns, this.isSetOwns());
        }
        return currentHashCode;
    }

    @Override
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.getInstance();
        return this.hashCode(null, strategy);
    }

    @Override
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ProgramAffiliationPropertyType) {
            final ProgramAffiliationPropertyType copy = ((ProgramAffiliationPropertyType) draftCopy);
            {
                Boolean programAffiliationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProgramAffiliation());
                if (programAffiliationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ProgramAffiliationType sourceProgramAffiliation;
                    sourceProgramAffiliation = this.getProgramAffiliation();
                    ProgramAffiliationType copyProgramAffiliation = ((ProgramAffiliationType) strategy.copy(LocatorUtils.property(locator, "programAffiliation", sourceProgramAffiliation), sourceProgramAffiliation, this.isSetProgramAffiliation()));
                    copy.setProgramAffiliation(copyProgramAffiliation);
                } else {
                    if (programAffiliationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.programAffiliation = null;
                    }
                }
            }
            {
                Boolean ownsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOwns());
                if (ownsShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceOwns;
                    sourceOwns = (this.isSetOwns()?this.isOwns():false);
                    boolean copyOwns = strategy.copy(LocatorUtils.property(locator, "owns", sourceOwns), sourceOwns, this.isSetOwns());
                    copy.setOwns(copyOwns);
                } else {
                    if (ownsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetOwns();
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ProgramAffiliationPropertyType();
    }

}

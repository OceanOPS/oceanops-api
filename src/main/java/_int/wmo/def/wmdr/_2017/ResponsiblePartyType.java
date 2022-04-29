
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractMetadataPropertyType;
import net.opengis.gml.v_3_2.TimePeriodPropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIResponsiblePartyType;
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
 * <p>Java class for ResponsiblePartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiblePartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responsibleParty"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiblePartyType", propOrder = {
    "responsibleParty",
    "validPeriod"
})
public class ResponsiblePartyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ResponsiblePartyType.ResponsibleParty responsibleParty;
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsiblePartyType.ResponsibleParty }
     *     
     */
    public ResponsiblePartyType.ResponsibleParty getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiblePartyType.ResponsibleParty }
     *     
     */
    public void setResponsibleParty(ResponsiblePartyType.ResponsibleParty value) {
        this.responsibleParty = value;
    }

    public boolean isSetResponsibleParty() {
        return (this.responsibleParty!= null);
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
            ResponsiblePartyType.ResponsibleParty theResponsibleParty;
            theResponsibleParty = this.getResponsibleParty();
            strategy.appendField(locator, this, "responsibleParty", buffer, theResponsibleParty, this.isSetResponsibleParty());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            strategy.appendField(locator, this, "validPeriod", buffer, theValidPeriod, this.isSetValidPeriod());
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
        final ResponsiblePartyType that = ((ResponsiblePartyType) object);
        {
            ResponsiblePartyType.ResponsibleParty lhsResponsibleParty;
            lhsResponsibleParty = this.getResponsibleParty();
            ResponsiblePartyType.ResponsibleParty rhsResponsibleParty;
            rhsResponsibleParty = that.getResponsibleParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsibleParty", lhsResponsibleParty), LocatorUtils.property(thatLocator, "responsibleParty", rhsResponsibleParty), lhsResponsibleParty, rhsResponsibleParty, this.isSetResponsibleParty(), that.isSetResponsibleParty())) {
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
            ResponsiblePartyType.ResponsibleParty theResponsibleParty;
            theResponsibleParty = this.getResponsibleParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsibleParty", theResponsibleParty), currentHashCode, theResponsibleParty, this.isSetResponsibleParty());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
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
        if (draftCopy instanceof ResponsiblePartyType) {
            final ResponsiblePartyType copy = ((ResponsiblePartyType) draftCopy);
            {
                Boolean responsiblePartyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetResponsibleParty());
                if (responsiblePartyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ResponsiblePartyType.ResponsibleParty sourceResponsibleParty;
                    sourceResponsibleParty = this.getResponsibleParty();
                    ResponsiblePartyType.ResponsibleParty copyResponsibleParty = ((ResponsiblePartyType.ResponsibleParty) strategy.copy(LocatorUtils.property(locator, "responsibleParty", sourceResponsibleParty), sourceResponsibleParty, this.isSetResponsibleParty()));
                    copy.setResponsibleParty(copyResponsibleParty);
                } else {
                    if (responsiblePartyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.responsibleParty = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ResponsiblePartyType();
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
     *         &lt;element ref="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty"/&gt;
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
        "ciResponsibleParty"
    })
    public static class ResponsibleParty
        extends AbstractMetadataPropertyType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "CI_ResponsibleParty", namespace = "http://www.isotc211.org/2005/gmd", required = true)
        protected CIResponsiblePartyType ciResponsibleParty;

        /**
         * Gets the value of the ciResponsibleParty property.
         * 
         * @return
         *     possible object is
         *     {@link CIResponsiblePartyType }
         *     
         */
        public CIResponsiblePartyType getCIResponsibleParty() {
            return ciResponsibleParty;
        }

        /**
         * Sets the value of the ciResponsibleParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link CIResponsiblePartyType }
         *     
         */
        public void setCIResponsibleParty(CIResponsiblePartyType value) {
            this.ciResponsibleParty = value;
        }

        public boolean isSetCIResponsibleParty() {
            return (this.ciResponsibleParty!= null);
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
            super.appendFields(locator, buffer, strategy);
            {
                CIResponsiblePartyType theCIResponsibleParty;
                theCIResponsibleParty = this.getCIResponsibleParty();
                strategy.appendField(locator, this, "ciResponsibleParty", buffer, theCIResponsibleParty, this.isSetCIResponsibleParty());
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
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final ResponsiblePartyType.ResponsibleParty that = ((ResponsiblePartyType.ResponsibleParty) object);
            {
                CIResponsiblePartyType lhsCIResponsibleParty;
                lhsCIResponsibleParty = this.getCIResponsibleParty();
                CIResponsiblePartyType rhsCIResponsibleParty;
                rhsCIResponsibleParty = that.getCIResponsibleParty();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "ciResponsibleParty", lhsCIResponsibleParty), LocatorUtils.property(thatLocator, "ciResponsibleParty", rhsCIResponsibleParty), lhsCIResponsibleParty, rhsCIResponsibleParty, this.isSetCIResponsibleParty(), that.isSetCIResponsibleParty())) {
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
            int currentHashCode = super.hashCode(locator, strategy);
            {
                CIResponsiblePartyType theCIResponsibleParty;
                theCIResponsibleParty = this.getCIResponsibleParty();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ciResponsibleParty", theCIResponsibleParty), currentHashCode, theCIResponsibleParty, this.isSetCIResponsibleParty());
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof ResponsiblePartyType.ResponsibleParty) {
                final ResponsiblePartyType.ResponsibleParty copy = ((ResponsiblePartyType.ResponsibleParty) draftCopy);
                {
                    Boolean ciResponsiblePartyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCIResponsibleParty());
                    if (ciResponsiblePartyShouldBeCopiedAndSet == Boolean.TRUE) {
                        CIResponsiblePartyType sourceCIResponsibleParty;
                        sourceCIResponsibleParty = this.getCIResponsibleParty();
                        CIResponsiblePartyType copyCIResponsibleParty = ((CIResponsiblePartyType) strategy.copy(LocatorUtils.property(locator, "ciResponsibleParty", sourceCIResponsibleParty), sourceCIResponsibleParty, this.isSetCIResponsibleParty()));
                        copy.setCIResponsibleParty(copyCIResponsibleParty);
                    } else {
                        if (ciResponsiblePartyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.ciResponsibleParty = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new ResponsiblePartyType.ResponsibleParty();
        }

    }

}

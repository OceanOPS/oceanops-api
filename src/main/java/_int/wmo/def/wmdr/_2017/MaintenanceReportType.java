
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractMetadataPropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIResponsiblePartyType;
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
 * <p>Java class for MaintenanceReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}LogEntryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maintenanceParty"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceReportType", propOrder = {
    "maintenanceParty"
})
public class MaintenanceReportType
    extends LogEntryType
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MaintenanceReportType.MaintenanceParty maintenanceParty;

    /**
     * Gets the value of the maintenanceParty property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceReportType.MaintenanceParty }
     *     
     */
    public MaintenanceReportType.MaintenanceParty getMaintenanceParty() {
        return maintenanceParty;
    }

    /**
     * Sets the value of the maintenanceParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceReportType.MaintenanceParty }
     *     
     */
    public void setMaintenanceParty(MaintenanceReportType.MaintenanceParty value) {
        this.maintenanceParty = value;
    }

    public boolean isSetMaintenanceParty() {
        return (this.maintenanceParty!= null);
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
            MaintenanceReportType.MaintenanceParty theMaintenanceParty;
            theMaintenanceParty = this.getMaintenanceParty();
            strategy.appendField(locator, this, "maintenanceParty", buffer, theMaintenanceParty, this.isSetMaintenanceParty());
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
        final MaintenanceReportType that = ((MaintenanceReportType) object);
        {
            MaintenanceReportType.MaintenanceParty lhsMaintenanceParty;
            lhsMaintenanceParty = this.getMaintenanceParty();
            MaintenanceReportType.MaintenanceParty rhsMaintenanceParty;
            rhsMaintenanceParty = that.getMaintenanceParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maintenanceParty", lhsMaintenanceParty), LocatorUtils.property(thatLocator, "maintenanceParty", rhsMaintenanceParty), lhsMaintenanceParty, rhsMaintenanceParty, this.isSetMaintenanceParty(), that.isSetMaintenanceParty())) {
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
            MaintenanceReportType.MaintenanceParty theMaintenanceParty;
            theMaintenanceParty = this.getMaintenanceParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maintenanceParty", theMaintenanceParty), currentHashCode, theMaintenanceParty, this.isSetMaintenanceParty());
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
        if (draftCopy instanceof MaintenanceReportType) {
            final MaintenanceReportType copy = ((MaintenanceReportType) draftCopy);
            {
                Boolean maintenancePartyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMaintenanceParty());
                if (maintenancePartyShouldBeCopiedAndSet == Boolean.TRUE) {
                    MaintenanceReportType.MaintenanceParty sourceMaintenanceParty;
                    sourceMaintenanceParty = this.getMaintenanceParty();
                    MaintenanceReportType.MaintenanceParty copyMaintenanceParty = ((MaintenanceReportType.MaintenanceParty) strategy.copy(LocatorUtils.property(locator, "maintenanceParty", sourceMaintenanceParty), sourceMaintenanceParty, this.isSetMaintenanceParty()));
                    copy.setMaintenanceParty(copyMaintenanceParty);
                } else {
                    if (maintenancePartyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maintenanceParty = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MaintenanceReportType();
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
    public static class MaintenanceParty
        extends AbstractMetadataPropertyType
        implements Serializable
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
                CIResponsiblePartyType theCIResponsibleParty;
                theCIResponsibleParty = this.getCIResponsibleParty();
                strategy.appendField(locator, this, "ciResponsibleParty", buffer, theCIResponsibleParty, this.isSetCIResponsibleParty());
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
            final MaintenanceReportType.MaintenanceParty that = ((MaintenanceReportType.MaintenanceParty) object);
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

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = super.hashCode(locator, strategy);
            {
                CIResponsiblePartyType theCIResponsibleParty;
                theCIResponsibleParty = this.getCIResponsibleParty();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ciResponsibleParty", theCIResponsibleParty), currentHashCode, theCIResponsibleParty, this.isSetCIResponsibleParty());
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
            if (draftCopy instanceof MaintenanceReportType.MaintenanceParty) {
                final MaintenanceReportType.MaintenanceParty copy = ((MaintenanceReportType.MaintenanceParty) draftCopy);
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

        public Object createNewInstance() {
            return new MaintenanceReportType.MaintenanceParty();
        }

    }

}

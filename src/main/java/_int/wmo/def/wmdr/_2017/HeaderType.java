
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.v_3_2_1.AbstractMetadataPropertyType;
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
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="recordOwner" minOccurs="0"&gt;
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
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "fileDateTime",
    "recordOwner",
    "version"
})
public class HeaderType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileDateTime;
    protected HeaderType.RecordOwner recordOwner;
    protected Integer version;

    /**
     * Gets the value of the fileDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDateTime() {
        return fileDateTime;
    }

    /**
     * Sets the value of the fileDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDateTime(XMLGregorianCalendar value) {
        this.fileDateTime = value;
    }

    public boolean isSetFileDateTime() {
        return (this.fileDateTime!= null);
    }

    /**
     * Gets the value of the recordOwner property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType.RecordOwner }
     *     
     */
    public HeaderType.RecordOwner getRecordOwner() {
        return recordOwner;
    }

    /**
     * Sets the value of the recordOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType.RecordOwner }
     *     
     */
    public void setRecordOwner(HeaderType.RecordOwner value) {
        this.recordOwner = value;
    }

    public boolean isSetRecordOwner() {
        return (this.recordOwner!= null);
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
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
        {
            XMLGregorianCalendar theFileDateTime;
            theFileDateTime = this.getFileDateTime();
            strategy.appendField(locator, this, "fileDateTime", buffer, theFileDateTime, this.isSetFileDateTime());
        }
        {
            HeaderType.RecordOwner theRecordOwner;
            theRecordOwner = this.getRecordOwner();
            strategy.appendField(locator, this, "recordOwner", buffer, theRecordOwner, this.isSetRecordOwner());
        }
        {
            Integer theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, this.isSetVersion());
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
        final HeaderType that = ((HeaderType) object);
        {
            XMLGregorianCalendar lhsFileDateTime;
            lhsFileDateTime = this.getFileDateTime();
            XMLGregorianCalendar rhsFileDateTime;
            rhsFileDateTime = that.getFileDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileDateTime", lhsFileDateTime), LocatorUtils.property(thatLocator, "fileDateTime", rhsFileDateTime), lhsFileDateTime, rhsFileDateTime, this.isSetFileDateTime(), that.isSetFileDateTime())) {
                return false;
            }
        }
        {
            HeaderType.RecordOwner lhsRecordOwner;
            lhsRecordOwner = this.getRecordOwner();
            HeaderType.RecordOwner rhsRecordOwner;
            rhsRecordOwner = that.getRecordOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordOwner", lhsRecordOwner), LocatorUtils.property(thatLocator, "recordOwner", rhsRecordOwner), lhsRecordOwner, rhsRecordOwner, this.isSetRecordOwner(), that.isSetRecordOwner())) {
                return false;
            }
        }
        {
            Integer lhsVersion;
            lhsVersion = this.getVersion();
            Integer rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, this.isSetVersion(), that.isSetVersion())) {
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
        int currentHashCode = 1;
        {
            XMLGregorianCalendar theFileDateTime;
            theFileDateTime = this.getFileDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileDateTime", theFileDateTime), currentHashCode, theFileDateTime, this.isSetFileDateTime());
        }
        {
            HeaderType.RecordOwner theRecordOwner;
            theRecordOwner = this.getRecordOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordOwner", theRecordOwner), currentHashCode, theRecordOwner, this.isSetRecordOwner());
        }
        {
            Integer theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, this.isSetVersion());
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
        if (draftCopy instanceof HeaderType) {
            final HeaderType copy = ((HeaderType) draftCopy);
            {
                Boolean fileDateTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFileDateTime());
                if (fileDateTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceFileDateTime;
                    sourceFileDateTime = this.getFileDateTime();
                    XMLGregorianCalendar copyFileDateTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "fileDateTime", sourceFileDateTime), sourceFileDateTime, this.isSetFileDateTime()));
                    copy.setFileDateTime(copyFileDateTime);
                } else {
                    if (fileDateTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fileDateTime = null;
                    }
                }
            }
            {
                Boolean recordOwnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRecordOwner());
                if (recordOwnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeaderType.RecordOwner sourceRecordOwner;
                    sourceRecordOwner = this.getRecordOwner();
                    HeaderType.RecordOwner copyRecordOwner = ((HeaderType.RecordOwner) strategy.copy(LocatorUtils.property(locator, "recordOwner", sourceRecordOwner), sourceRecordOwner, this.isSetRecordOwner()));
                    copy.setRecordOwner(copyRecordOwner);
                } else {
                    if (recordOwnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recordOwner = null;
                    }
                }
            }
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVersion());
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceVersion;
                    sourceVersion = this.getVersion();
                    Integer copyVersion = ((Integer) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion, this.isSetVersion()));
                    copy.setVersion(copyVersion);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HeaderType();
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
    public static class RecordOwner
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
            final HeaderType.RecordOwner that = ((HeaderType.RecordOwner) object);
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
            if (draftCopy instanceof HeaderType.RecordOwner) {
                final HeaderType.RecordOwner copy = ((HeaderType.RecordOwner) draftCopy);
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
            return new HeaderType.RecordOwner();
        }

    }

}

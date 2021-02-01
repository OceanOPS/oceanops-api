
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractMetadataPropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIOnlineResourceType;
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
 * <p>Java class for AttributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originator"&gt;
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
 *         &lt;element name="originatorURL" minOccurs="0"&gt;
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
 *         &lt;element name="source" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributionType", propOrder = {
    "title",
    "originator",
    "originatorURL",
    "source"
})
public class AttributionType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected String title;
    @XmlElement(required = true)
    protected AttributionType.Originator originator;
    protected AttributionType.OriginatorURL originatorURL;
    protected AttributionType.Source source;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link AttributionType.Originator }
     *     
     */
    public AttributionType.Originator getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributionType.Originator }
     *     
     */
    public void setOriginator(AttributionType.Originator value) {
        this.originator = value;
    }

    public boolean isSetOriginator() {
        return (this.originator!= null);
    }

    /**
     * Gets the value of the originatorURL property.
     * 
     * @return
     *     possible object is
     *     {@link AttributionType.OriginatorURL }
     *     
     */
    public AttributionType.OriginatorURL getOriginatorURL() {
        return originatorURL;
    }

    /**
     * Sets the value of the originatorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributionType.OriginatorURL }
     *     
     */
    public void setOriginatorURL(AttributionType.OriginatorURL value) {
        this.originatorURL = value;
    }

    public boolean isSetOriginatorURL() {
        return (this.originatorURL!= null);
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link AttributionType.Source }
     *     
     */
    public AttributionType.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributionType.Source }
     *     
     */
    public void setSource(AttributionType.Source value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
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
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, this.isSetTitle());
        }
        {
            AttributionType.Originator theOriginator;
            theOriginator = this.getOriginator();
            strategy.appendField(locator, this, "originator", buffer, theOriginator, this.isSetOriginator());
        }
        {
            AttributionType.OriginatorURL theOriginatorURL;
            theOriginatorURL = this.getOriginatorURL();
            strategy.appendField(locator, this, "originatorURL", buffer, theOriginatorURL, this.isSetOriginatorURL());
        }
        {
            AttributionType.Source theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource, this.isSetSource());
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
        final AttributionType that = ((AttributionType) object);
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, this.isSetTitle(), that.isSetTitle())) {
                return false;
            }
        }
        {
            AttributionType.Originator lhsOriginator;
            lhsOriginator = this.getOriginator();
            AttributionType.Originator rhsOriginator;
            rhsOriginator = that.getOriginator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originator", lhsOriginator), LocatorUtils.property(thatLocator, "originator", rhsOriginator), lhsOriginator, rhsOriginator, this.isSetOriginator(), that.isSetOriginator())) {
                return false;
            }
        }
        {
            AttributionType.OriginatorURL lhsOriginatorURL;
            lhsOriginatorURL = this.getOriginatorURL();
            AttributionType.OriginatorURL rhsOriginatorURL;
            rhsOriginatorURL = that.getOriginatorURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originatorURL", lhsOriginatorURL), LocatorUtils.property(thatLocator, "originatorURL", rhsOriginatorURL), lhsOriginatorURL, rhsOriginatorURL, this.isSetOriginatorURL(), that.isSetOriginatorURL())) {
                return false;
            }
        }
        {
            AttributionType.Source lhsSource;
            lhsSource = this.getSource();
            AttributionType.Source rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource, this.isSetSource(), that.isSetSource())) {
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
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, this.isSetTitle());
        }
        {
            AttributionType.Originator theOriginator;
            theOriginator = this.getOriginator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originator", theOriginator), currentHashCode, theOriginator, this.isSetOriginator());
        }
        {
            AttributionType.OriginatorURL theOriginatorURL;
            theOriginatorURL = this.getOriginatorURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originatorURL", theOriginatorURL), currentHashCode, theOriginatorURL, this.isSetOriginatorURL());
        }
        {
            AttributionType.Source theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource, this.isSetSource());
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
        if (draftCopy instanceof AttributionType) {
            final AttributionType copy = ((AttributionType) draftCopy);
            {
                Boolean titleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTitle());
                if (titleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitle;
                    sourceTitle = this.getTitle();
                    String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle, this.isSetTitle()));
                    copy.setTitle(copyTitle);
                } else {
                    if (titleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.title = null;
                    }
                }
            }
            {
                Boolean originatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOriginator());
                if (originatorShouldBeCopiedAndSet == Boolean.TRUE) {
                    AttributionType.Originator sourceOriginator;
                    sourceOriginator = this.getOriginator();
                    AttributionType.Originator copyOriginator = ((AttributionType.Originator) strategy.copy(LocatorUtils.property(locator, "originator", sourceOriginator), sourceOriginator, this.isSetOriginator()));
                    copy.setOriginator(copyOriginator);
                } else {
                    if (originatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.originator = null;
                    }
                }
            }
            {
                Boolean originatorURLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOriginatorURL());
                if (originatorURLShouldBeCopiedAndSet == Boolean.TRUE) {
                    AttributionType.OriginatorURL sourceOriginatorURL;
                    sourceOriginatorURL = this.getOriginatorURL();
                    AttributionType.OriginatorURL copyOriginatorURL = ((AttributionType.OriginatorURL) strategy.copy(LocatorUtils.property(locator, "originatorURL", sourceOriginatorURL), sourceOriginatorURL, this.isSetOriginatorURL()));
                    copy.setOriginatorURL(copyOriginatorURL);
                } else {
                    if (originatorURLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.originatorURL = null;
                    }
                }
            }
            {
                Boolean sourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSource());
                if (sourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    AttributionType.Source sourceSource;
                    sourceSource = this.getSource();
                    AttributionType.Source copySource = ((AttributionType.Source) strategy.copy(LocatorUtils.property(locator, "source", sourceSource), sourceSource, this.isSetSource()));
                    copy.setSource(copySource);
                } else {
                    if (sourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.source = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AttributionType();
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
    public static class Originator
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
            final AttributionType.Originator that = ((AttributionType.Originator) object);
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
            if (draftCopy instanceof AttributionType.Originator) {
                final AttributionType.Originator copy = ((AttributionType.Originator) draftCopy);
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
            return new AttributionType.Originator();
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
    public static class OriginatorURL
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
            final AttributionType.OriginatorURL that = ((AttributionType.OriginatorURL) object);
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
            if (draftCopy instanceof AttributionType.OriginatorURL) {
                final AttributionType.OriginatorURL copy = ((AttributionType.OriginatorURL) draftCopy);
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
            return new AttributionType.OriginatorURL();
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
    public static class Source
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
            final AttributionType.Source that = ((AttributionType.Source) object);
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
            if (draftCopy instanceof AttributionType.Source) {
                final AttributionType.Source copy = ((AttributionType.Source) draftCopy);
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
            return new AttributionType.Source();
        }

    }

}


package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for LogEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentationURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogEntryType", propOrder = {
    "datetime",
    "author",
    "description",
    "documentationURL"
})
@XmlSeeAlso({
    ControlCheckReportType.class,
    EventReportType.class,
    MaintenanceReportType.class
})
public abstract class LogEntryType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String description;
    @XmlSchemaType(name = "anyURI")
    protected String documentationURL;

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetime(XMLGregorianCalendar value) {
        this.datetime = value;
    }

    public boolean isSetDatetime() {
        return (this.datetime!= null);
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    public boolean isSetAuthor() {
        return (this.author!= null);
    }

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
     * Gets the value of the documentationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentationURL() {
        return documentationURL;
    }

    /**
     * Sets the value of the documentationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentationURL(String value) {
        this.documentationURL = value;
    }

    public boolean isSetDocumentationURL() {
        return (this.documentationURL!= null);
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
            XMLGregorianCalendar theDatetime;
            theDatetime = this.getDatetime();
            strategy.appendField(locator, this, "datetime", buffer, theDatetime, this.isSetDatetime());
        }
        {
            String theAuthor;
            theAuthor = this.getAuthor();
            strategy.appendField(locator, this, "author", buffer, theAuthor, this.isSetAuthor());
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, this.isSetDescription());
        }
        {
            String theDocumentationURL;
            theDocumentationURL = this.getDocumentationURL();
            strategy.appendField(locator, this, "documentationURL", buffer, theDocumentationURL, this.isSetDocumentationURL());
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
        final LogEntryType that = ((LogEntryType) object);
        {
            XMLGregorianCalendar lhsDatetime;
            lhsDatetime = this.getDatetime();
            XMLGregorianCalendar rhsDatetime;
            rhsDatetime = that.getDatetime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datetime", lhsDatetime), LocatorUtils.property(thatLocator, "datetime", rhsDatetime), lhsDatetime, rhsDatetime, this.isSetDatetime(), that.isSetDatetime())) {
                return false;
            }
        }
        {
            String lhsAuthor;
            lhsAuthor = this.getAuthor();
            String rhsAuthor;
            rhsAuthor = that.getAuthor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "author", lhsAuthor), LocatorUtils.property(thatLocator, "author", rhsAuthor), lhsAuthor, rhsAuthor, this.isSetAuthor(), that.isSetAuthor())) {
                return false;
            }
        }
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
            String lhsDocumentationURL;
            lhsDocumentationURL = this.getDocumentationURL();
            String rhsDocumentationURL;
            rhsDocumentationURL = that.getDocumentationURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentationURL", lhsDocumentationURL), LocatorUtils.property(thatLocator, "documentationURL", rhsDocumentationURL), lhsDocumentationURL, rhsDocumentationURL, this.isSetDocumentationURL(), that.isSetDocumentationURL())) {
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
            XMLGregorianCalendar theDatetime;
            theDatetime = this.getDatetime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datetime", theDatetime), currentHashCode, theDatetime, this.isSetDatetime());
        }
        {
            String theAuthor;
            theAuthor = this.getAuthor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "author", theAuthor), currentHashCode, theAuthor, this.isSetAuthor());
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, this.isSetDescription());
        }
        {
            String theDocumentationURL;
            theDocumentationURL = this.getDocumentationURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentationURL", theDocumentationURL), currentHashCode, theDocumentationURL, this.isSetDocumentationURL());
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof LogEntryType) {
            final LogEntryType copy = ((LogEntryType) target);
            {
                Boolean datetimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDatetime());
                if (datetimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceDatetime;
                    sourceDatetime = this.getDatetime();
                    XMLGregorianCalendar copyDatetime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "datetime", sourceDatetime), sourceDatetime, this.isSetDatetime()));
                    copy.setDatetime(copyDatetime);
                } else {
                    if (datetimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datetime = null;
                    }
                }
            }
            {
                Boolean authorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAuthor());
                if (authorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAuthor;
                    sourceAuthor = this.getAuthor();
                    String copyAuthor = ((String) strategy.copy(LocatorUtils.property(locator, "author", sourceAuthor), sourceAuthor, this.isSetAuthor()));
                    copy.setAuthor(copyAuthor);
                } else {
                    if (authorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.author = null;
                    }
                }
            }
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
                Boolean documentationURLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDocumentationURL());
                if (documentationURLShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDocumentationURL;
                    sourceDocumentationURL = this.getDocumentationURL();
                    String copyDocumentationURL = ((String) strategy.copy(LocatorUtils.property(locator, "documentationURL", sourceDocumentationURL), sourceDocumentationURL, this.isSetDocumentationURL()));
                    copy.setDocumentationURL(copyDocumentationURL);
                } else {
                    if (documentationURLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.documentationURL = null;
                    }
                }
            }
        }
        return target;
    }

}


package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractFeatureType;
import net.opengis.gml.v_3_2.AbstractMemberType;
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
 * <p>Java class for LogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="logEntry" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}LogEntry"/&gt;
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
@XmlType(name = "LogType", propOrder = {
    "logEntry"
})
@XmlSeeAlso({
    FacilityLogType.class,
    EquipmentLogType.class
})
public abstract class LogType
    extends AbstractFeatureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected List<LogType.LogEntry> logEntry;

    /**
     * Gets the value of the logEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogType.LogEntry }
     * 
     * 
     */
    public List<LogType.LogEntry> getLogEntry() {
        if (logEntry == null) {
            logEntry = new ArrayList<LogType.LogEntry>();
        }
        return this.logEntry;
    }

    public boolean isSetLogEntry() {
        return ((this.logEntry!= null)&&(!this.logEntry.isEmpty()));
    }

    public void unsetLogEntry() {
        this.logEntry = null;
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
            List<LogType.LogEntry> theLogEntry;
            theLogEntry = (this.isSetLogEntry()?this.getLogEntry():null);
            strategy.appendField(locator, this, "logEntry", buffer, theLogEntry, this.isSetLogEntry());
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
        final LogType that = ((LogType) object);
        {
            List<LogType.LogEntry> lhsLogEntry;
            lhsLogEntry = (this.isSetLogEntry()?this.getLogEntry():null);
            List<LogType.LogEntry> rhsLogEntry;
            rhsLogEntry = (that.isSetLogEntry()?that.getLogEntry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logEntry", lhsLogEntry), LocatorUtils.property(thatLocator, "logEntry", rhsLogEntry), lhsLogEntry, rhsLogEntry, this.isSetLogEntry(), that.isSetLogEntry())) {
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
            List<LogType.LogEntry> theLogEntry;
            theLogEntry = (this.isSetLogEntry()?this.getLogEntry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logEntry", theLogEntry), currentHashCode, theLogEntry, this.isSetLogEntry());
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
        super.copyTo(locator, target, strategy);
        if (target instanceof LogType) {
            final LogType copy = ((LogType) target);
            {
                Boolean logEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLogEntry());
                if (logEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LogType.LogEntry> sourceLogEntry;
                    sourceLogEntry = (this.isSetLogEntry()?this.getLogEntry():null);
                    @SuppressWarnings("unchecked")
                    List<LogType.LogEntry> copyLogEntry = ((List<LogType.LogEntry> ) strategy.copy(LocatorUtils.property(locator, "logEntry", sourceLogEntry), sourceLogEntry, this.isSetLogEntry()));
                    copy.unsetLogEntry();
                    if (copyLogEntry!= null) {
                        List<LogType.LogEntry> uniqueLogEntryl = copy.getLogEntry();
                        uniqueLogEntryl.addAll(copyLogEntry);
                    }
                } else {
                    if (logEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetLogEntry();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}LogEntry"/&gt;
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
        "logEntry"
    })
    public static class LogEntry
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "LogEntry", namespace = "http://def.wmo.int/wmdr/2017", type = JAXBElement.class)
        protected JAXBElement<? extends LogEntryType> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     
         */
        public JAXBElement<? extends LogEntryType> getLogEntry() {
            return logEntry;
        }

        /**
         * Sets the value of the logEntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
         *     
         */
        public void setLogEntry(JAXBElement<? extends LogEntryType> value) {
            this.logEntry = value;
        }

        public boolean isSetLogEntry() {
            return (this.logEntry!= null);
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
                JAXBElement<? extends LogEntryType> theLogEntry;
                theLogEntry = this.getLogEntry();
                strategy.appendField(locator, this, "logEntry", buffer, theLogEntry, this.isSetLogEntry());
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
            final LogType.LogEntry that = ((LogType.LogEntry) object);
            {
                JAXBElement<? extends LogEntryType> lhsLogEntry;
                lhsLogEntry = this.getLogEntry();
                JAXBElement<? extends LogEntryType> rhsLogEntry;
                rhsLogEntry = that.getLogEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "logEntry", lhsLogEntry), LocatorUtils.property(thatLocator, "logEntry", rhsLogEntry), lhsLogEntry, rhsLogEntry, this.isSetLogEntry(), that.isSetLogEntry())) {
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
                JAXBElement<? extends LogEntryType> theLogEntry;
                theLogEntry = this.getLogEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logEntry", theLogEntry), currentHashCode, theLogEntry, this.isSetLogEntry());
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
            if (draftCopy instanceof LogType.LogEntry) {
                final LogType.LogEntry copy = ((LogType.LogEntry) draftCopy);
                {
                    Boolean logEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLogEntry());
                    if (logEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                        JAXBElement<? extends LogEntryType> sourceLogEntry;
                        sourceLogEntry = this.getLogEntry();
                        @SuppressWarnings("unchecked")
                        JAXBElement<? extends LogEntryType> copyLogEntry = ((JAXBElement<? extends LogEntryType> ) strategy.copy(LocatorUtils.property(locator, "logEntry", sourceLogEntry), sourceLogEntry, this.isSetLogEntry()));
                        copy.setLogEntry(copyLogEntry);
                    } else {
                        if (logEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.logEntry = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new LogType.LogEntry();
        }

    }

}

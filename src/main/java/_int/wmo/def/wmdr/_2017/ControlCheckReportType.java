
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import net.opengis.gml.v_3_2_1.ReferenceType;
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
 * <p>Java class for ControlCheckReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlCheckReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}LogEntryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkLocation" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="periodOfValidity" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="controlCheckResult" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="standardType" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="standardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="withinVerificationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alternateURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlCheckReportType", propOrder = {
    "checkLocation",
    "periodOfValidity",
    "controlCheckResult",
    "standardType",
    "standardName",
    "standardSerialNumber",
    "withinVerificationLimit",
    "alternateURI"
})
public class ControlCheckReportType
    extends LogEntryType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected ReferenceType checkLocation;
    protected Duration periodOfValidity;
    protected ReferenceType controlCheckResult;
    protected ReferenceType standardType;
    protected String standardName;
    protected String standardSerialNumber;
    protected Boolean withinVerificationLimit;
    @XmlSchemaType(name = "anyURI")
    protected String alternateURI;

    /**
     * Gets the value of the checkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCheckLocation() {
        return checkLocation;
    }

    /**
     * Sets the value of the checkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCheckLocation(ReferenceType value) {
        this.checkLocation = value;
    }

    public boolean isSetCheckLocation() {
        return (this.checkLocation!= null);
    }

    /**
     * Gets the value of the periodOfValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriodOfValidity() {
        return periodOfValidity;
    }

    /**
     * Sets the value of the periodOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriodOfValidity(Duration value) {
        this.periodOfValidity = value;
    }

    public boolean isSetPeriodOfValidity() {
        return (this.periodOfValidity!= null);
    }

    /**
     * Gets the value of the controlCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getControlCheckResult() {
        return controlCheckResult;
    }

    /**
     * Sets the value of the controlCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setControlCheckResult(ReferenceType value) {
        this.controlCheckResult = value;
    }

    public boolean isSetControlCheckResult() {
        return (this.controlCheckResult!= null);
    }

    /**
     * Gets the value of the standardType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getStandardType() {
        return standardType;
    }

    /**
     * Sets the value of the standardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setStandardType(ReferenceType value) {
        this.standardType = value;
    }

    public boolean isSetStandardType() {
        return (this.standardType!= null);
    }

    /**
     * Gets the value of the standardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardName() {
        return standardName;
    }

    /**
     * Sets the value of the standardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardName(String value) {
        this.standardName = value;
    }

    public boolean isSetStandardName() {
        return (this.standardName!= null);
    }

    /**
     * Gets the value of the standardSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardSerialNumber() {
        return standardSerialNumber;
    }

    /**
     * Sets the value of the standardSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardSerialNumber(String value) {
        this.standardSerialNumber = value;
    }

    public boolean isSetStandardSerialNumber() {
        return (this.standardSerialNumber!= null);
    }

    /**
     * Gets the value of the withinVerificationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithinVerificationLimit() {
        return withinVerificationLimit;
    }

    /**
     * Sets the value of the withinVerificationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithinVerificationLimit(Boolean value) {
        this.withinVerificationLimit = value;
    }

    public boolean isSetWithinVerificationLimit() {
        return (this.withinVerificationLimit!= null);
    }

    /**
     * Gets the value of the alternateURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateURI() {
        return alternateURI;
    }

    /**
     * Sets the value of the alternateURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateURI(String value) {
        this.alternateURI = value;
    }

    public boolean isSetAlternateURI() {
        return (this.alternateURI!= null);
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
            ReferenceType theCheckLocation;
            theCheckLocation = this.getCheckLocation();
            strategy.appendField(locator, this, "checkLocation", buffer, theCheckLocation, this.isSetCheckLocation());
        }
        {
            Duration thePeriodOfValidity;
            thePeriodOfValidity = this.getPeriodOfValidity();
            strategy.appendField(locator, this, "periodOfValidity", buffer, thePeriodOfValidity, this.isSetPeriodOfValidity());
        }
        {
            ReferenceType theControlCheckResult;
            theControlCheckResult = this.getControlCheckResult();
            strategy.appendField(locator, this, "controlCheckResult", buffer, theControlCheckResult, this.isSetControlCheckResult());
        }
        {
            ReferenceType theStandardType;
            theStandardType = this.getStandardType();
            strategy.appendField(locator, this, "standardType", buffer, theStandardType, this.isSetStandardType());
        }
        {
            String theStandardName;
            theStandardName = this.getStandardName();
            strategy.appendField(locator, this, "standardName", buffer, theStandardName, this.isSetStandardName());
        }
        {
            String theStandardSerialNumber;
            theStandardSerialNumber = this.getStandardSerialNumber();
            strategy.appendField(locator, this, "standardSerialNumber", buffer, theStandardSerialNumber, this.isSetStandardSerialNumber());
        }
        {
            Boolean theWithinVerificationLimit;
            theWithinVerificationLimit = this.isWithinVerificationLimit();
            strategy.appendField(locator, this, "withinVerificationLimit", buffer, theWithinVerificationLimit, this.isSetWithinVerificationLimit());
        }
        {
            String theAlternateURI;
            theAlternateURI = this.getAlternateURI();
            strategy.appendField(locator, this, "alternateURI", buffer, theAlternateURI, this.isSetAlternateURI());
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
        final ControlCheckReportType that = ((ControlCheckReportType) object);
        {
            ReferenceType lhsCheckLocation;
            lhsCheckLocation = this.getCheckLocation();
            ReferenceType rhsCheckLocation;
            rhsCheckLocation = that.getCheckLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkLocation", lhsCheckLocation), LocatorUtils.property(thatLocator, "checkLocation", rhsCheckLocation), lhsCheckLocation, rhsCheckLocation, this.isSetCheckLocation(), that.isSetCheckLocation())) {
                return false;
            }
        }
        {
            Duration lhsPeriodOfValidity;
            lhsPeriodOfValidity = this.getPeriodOfValidity();
            Duration rhsPeriodOfValidity;
            rhsPeriodOfValidity = that.getPeriodOfValidity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "periodOfValidity", lhsPeriodOfValidity), LocatorUtils.property(thatLocator, "periodOfValidity", rhsPeriodOfValidity), lhsPeriodOfValidity, rhsPeriodOfValidity, this.isSetPeriodOfValidity(), that.isSetPeriodOfValidity())) {
                return false;
            }
        }
        {
            ReferenceType lhsControlCheckResult;
            lhsControlCheckResult = this.getControlCheckResult();
            ReferenceType rhsControlCheckResult;
            rhsControlCheckResult = that.getControlCheckResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "controlCheckResult", lhsControlCheckResult), LocatorUtils.property(thatLocator, "controlCheckResult", rhsControlCheckResult), lhsControlCheckResult, rhsControlCheckResult, this.isSetControlCheckResult(), that.isSetControlCheckResult())) {
                return false;
            }
        }
        {
            ReferenceType lhsStandardType;
            lhsStandardType = this.getStandardType();
            ReferenceType rhsStandardType;
            rhsStandardType = that.getStandardType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardType", lhsStandardType), LocatorUtils.property(thatLocator, "standardType", rhsStandardType), lhsStandardType, rhsStandardType, this.isSetStandardType(), that.isSetStandardType())) {
                return false;
            }
        }
        {
            String lhsStandardName;
            lhsStandardName = this.getStandardName();
            String rhsStandardName;
            rhsStandardName = that.getStandardName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardName", lhsStandardName), LocatorUtils.property(thatLocator, "standardName", rhsStandardName), lhsStandardName, rhsStandardName, this.isSetStandardName(), that.isSetStandardName())) {
                return false;
            }
        }
        {
            String lhsStandardSerialNumber;
            lhsStandardSerialNumber = this.getStandardSerialNumber();
            String rhsStandardSerialNumber;
            rhsStandardSerialNumber = that.getStandardSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardSerialNumber", lhsStandardSerialNumber), LocatorUtils.property(thatLocator, "standardSerialNumber", rhsStandardSerialNumber), lhsStandardSerialNumber, rhsStandardSerialNumber, this.isSetStandardSerialNumber(), that.isSetStandardSerialNumber())) {
                return false;
            }
        }
        {
            Boolean lhsWithinVerificationLimit;
            lhsWithinVerificationLimit = this.isWithinVerificationLimit();
            Boolean rhsWithinVerificationLimit;
            rhsWithinVerificationLimit = that.isWithinVerificationLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "withinVerificationLimit", lhsWithinVerificationLimit), LocatorUtils.property(thatLocator, "withinVerificationLimit", rhsWithinVerificationLimit), lhsWithinVerificationLimit, rhsWithinVerificationLimit, this.isSetWithinVerificationLimit(), that.isSetWithinVerificationLimit())) {
                return false;
            }
        }
        {
            String lhsAlternateURI;
            lhsAlternateURI = this.getAlternateURI();
            String rhsAlternateURI;
            rhsAlternateURI = that.getAlternateURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternateURI", lhsAlternateURI), LocatorUtils.property(thatLocator, "alternateURI", rhsAlternateURI), lhsAlternateURI, rhsAlternateURI, this.isSetAlternateURI(), that.isSetAlternateURI())) {
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
            ReferenceType theCheckLocation;
            theCheckLocation = this.getCheckLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkLocation", theCheckLocation), currentHashCode, theCheckLocation, this.isSetCheckLocation());
        }
        {
            Duration thePeriodOfValidity;
            thePeriodOfValidity = this.getPeriodOfValidity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "periodOfValidity", thePeriodOfValidity), currentHashCode, thePeriodOfValidity, this.isSetPeriodOfValidity());
        }
        {
            ReferenceType theControlCheckResult;
            theControlCheckResult = this.getControlCheckResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "controlCheckResult", theControlCheckResult), currentHashCode, theControlCheckResult, this.isSetControlCheckResult());
        }
        {
            ReferenceType theStandardType;
            theStandardType = this.getStandardType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardType", theStandardType), currentHashCode, theStandardType, this.isSetStandardType());
        }
        {
            String theStandardName;
            theStandardName = this.getStandardName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardName", theStandardName), currentHashCode, theStandardName, this.isSetStandardName());
        }
        {
            String theStandardSerialNumber;
            theStandardSerialNumber = this.getStandardSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardSerialNumber", theStandardSerialNumber), currentHashCode, theStandardSerialNumber, this.isSetStandardSerialNumber());
        }
        {
            Boolean theWithinVerificationLimit;
            theWithinVerificationLimit = this.isWithinVerificationLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "withinVerificationLimit", theWithinVerificationLimit), currentHashCode, theWithinVerificationLimit, this.isSetWithinVerificationLimit());
        }
        {
            String theAlternateURI;
            theAlternateURI = this.getAlternateURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternateURI", theAlternateURI), currentHashCode, theAlternateURI, this.isSetAlternateURI());
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
        if (draftCopy instanceof ControlCheckReportType) {
            final ControlCheckReportType copy = ((ControlCheckReportType) draftCopy);
            {
                Boolean checkLocationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCheckLocation());
                if (checkLocationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceCheckLocation;
                    sourceCheckLocation = this.getCheckLocation();
                    ReferenceType copyCheckLocation = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "checkLocation", sourceCheckLocation), sourceCheckLocation, this.isSetCheckLocation()));
                    copy.setCheckLocation(copyCheckLocation);
                } else {
                    if (checkLocationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.checkLocation = null;
                    }
                }
            }
            {
                Boolean periodOfValidityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPeriodOfValidity());
                if (periodOfValidityShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourcePeriodOfValidity;
                    sourcePeriodOfValidity = this.getPeriodOfValidity();
                    Duration copyPeriodOfValidity = ((Duration) strategy.copy(LocatorUtils.property(locator, "periodOfValidity", sourcePeriodOfValidity), sourcePeriodOfValidity, this.isSetPeriodOfValidity()));
                    copy.setPeriodOfValidity(copyPeriodOfValidity);
                } else {
                    if (periodOfValidityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.periodOfValidity = null;
                    }
                }
            }
            {
                Boolean controlCheckResultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetControlCheckResult());
                if (controlCheckResultShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceControlCheckResult;
                    sourceControlCheckResult = this.getControlCheckResult();
                    ReferenceType copyControlCheckResult = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "controlCheckResult", sourceControlCheckResult), sourceControlCheckResult, this.isSetControlCheckResult()));
                    copy.setControlCheckResult(copyControlCheckResult);
                } else {
                    if (controlCheckResultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.controlCheckResult = null;
                    }
                }
            }
            {
                Boolean standardTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStandardType());
                if (standardTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceStandardType;
                    sourceStandardType = this.getStandardType();
                    ReferenceType copyStandardType = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "standardType", sourceStandardType), sourceStandardType, this.isSetStandardType()));
                    copy.setStandardType(copyStandardType);
                } else {
                    if (standardTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.standardType = null;
                    }
                }
            }
            {
                Boolean standardNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStandardName());
                if (standardNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStandardName;
                    sourceStandardName = this.getStandardName();
                    String copyStandardName = ((String) strategy.copy(LocatorUtils.property(locator, "standardName", sourceStandardName), sourceStandardName, this.isSetStandardName()));
                    copy.setStandardName(copyStandardName);
                } else {
                    if (standardNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.standardName = null;
                    }
                }
            }
            {
                Boolean standardSerialNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStandardSerialNumber());
                if (standardSerialNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStandardSerialNumber;
                    sourceStandardSerialNumber = this.getStandardSerialNumber();
                    String copyStandardSerialNumber = ((String) strategy.copy(LocatorUtils.property(locator, "standardSerialNumber", sourceStandardSerialNumber), sourceStandardSerialNumber, this.isSetStandardSerialNumber()));
                    copy.setStandardSerialNumber(copyStandardSerialNumber);
                } else {
                    if (standardSerialNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.standardSerialNumber = null;
                    }
                }
            }
            {
                Boolean withinVerificationLimitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetWithinVerificationLimit());
                if (withinVerificationLimitShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWithinVerificationLimit;
                    sourceWithinVerificationLimit = this.isWithinVerificationLimit();
                    Boolean copyWithinVerificationLimit = ((Boolean) strategy.copy(LocatorUtils.property(locator, "withinVerificationLimit", sourceWithinVerificationLimit), sourceWithinVerificationLimit, this.isSetWithinVerificationLimit()));
                    copy.setWithinVerificationLimit(copyWithinVerificationLimit);
                } else {
                    if (withinVerificationLimitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.withinVerificationLimit = null;
                    }
                }
            }
            {
                Boolean alternateURIShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAlternateURI());
                if (alternateURIShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAlternateURI;
                    sourceAlternateURI = this.getAlternateURI();
                    String copyAlternateURI = ((String) strategy.copy(LocatorUtils.property(locator, "alternateURI", sourceAlternateURI), sourceAlternateURI, this.isSetAlternateURI()));
                    copy.setAlternateURI(copyAlternateURI);
                } else {
                    if (alternateURIShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternateURI = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ControlCheckReportType();
    }

}

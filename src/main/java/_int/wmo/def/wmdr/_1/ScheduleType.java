
package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startWeekday" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endWeekday" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startMinute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endMinute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="diurnalBaseTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleType", propOrder = {
    "startMonth",
    "endMonth",
    "startWeekday",
    "endWeekday",
    "startHour",
    "endHour",
    "startMinute",
    "endMinute",
    "diurnalBaseTime"
})
public class ScheduleType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected int startMonth;
    protected int endMonth;
    protected int startWeekday;
    protected int endWeekday;
    protected int startHour;
    protected int endHour;
    protected int startMinute;
    protected int endMinute;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar diurnalBaseTime;

    /**
     * Gets the value of the startMonth property.
     * 
     */
    public int getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     */
    public void setStartMonth(int value) {
        this.startMonth = value;
    }

    public boolean isSetStartMonth() {
        return true;
    }

    /**
     * Gets the value of the endMonth property.
     * 
     */
    public int getEndMonth() {
        return endMonth;
    }

    /**
     * Sets the value of the endMonth property.
     * 
     */
    public void setEndMonth(int value) {
        this.endMonth = value;
    }

    public boolean isSetEndMonth() {
        return true;
    }

    /**
     * Gets the value of the startWeekday property.
     * 
     */
    public int getStartWeekday() {
        return startWeekday;
    }

    /**
     * Sets the value of the startWeekday property.
     * 
     */
    public void setStartWeekday(int value) {
        this.startWeekday = value;
    }

    public boolean isSetStartWeekday() {
        return true;
    }

    /**
     * Gets the value of the endWeekday property.
     * 
     */
    public int getEndWeekday() {
        return endWeekday;
    }

    /**
     * Sets the value of the endWeekday property.
     * 
     */
    public void setEndWeekday(int value) {
        this.endWeekday = value;
    }

    public boolean isSetEndWeekday() {
        return true;
    }

    /**
     * Gets the value of the startHour property.
     * 
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     */
    public void setStartHour(int value) {
        this.startHour = value;
    }

    public boolean isSetStartHour() {
        return true;
    }

    /**
     * Gets the value of the endHour property.
     * 
     */
    public int getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     */
    public void setEndHour(int value) {
        this.endHour = value;
    }

    public boolean isSetEndHour() {
        return true;
    }

    /**
     * Gets the value of the startMinute property.
     * 
     */
    public int getStartMinute() {
        return startMinute;
    }

    /**
     * Sets the value of the startMinute property.
     * 
     */
    public void setStartMinute(int value) {
        this.startMinute = value;
    }

    public boolean isSetStartMinute() {
        return true;
    }

    /**
     * Gets the value of the endMinute property.
     * 
     */
    public int getEndMinute() {
        return endMinute;
    }

    /**
     * Sets the value of the endMinute property.
     * 
     */
    public void setEndMinute(int value) {
        this.endMinute = value;
    }

    public boolean isSetEndMinute() {
        return true;
    }

    /**
     * Gets the value of the diurnalBaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiurnalBaseTime() {
        return diurnalBaseTime;
    }

    /**
     * Sets the value of the diurnalBaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiurnalBaseTime(XMLGregorianCalendar value) {
        this.diurnalBaseTime = value;
    }

    public boolean isSetDiurnalBaseTime() {
        return (this.diurnalBaseTime!= null);
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
            int theStartMonth;
            theStartMonth = this.getStartMonth();
            strategy.appendField(locator, this, "startMonth", buffer, theStartMonth, true);
        }
        {
            int theEndMonth;
            theEndMonth = this.getEndMonth();
            strategy.appendField(locator, this, "endMonth", buffer, theEndMonth, true);
        }
        {
            int theStartWeekday;
            theStartWeekday = this.getStartWeekday();
            strategy.appendField(locator, this, "startWeekday", buffer, theStartWeekday, true);
        }
        {
            int theEndWeekday;
            theEndWeekday = this.getEndWeekday();
            strategy.appendField(locator, this, "endWeekday", buffer, theEndWeekday, true);
        }
        {
            int theStartHour;
            theStartHour = this.getStartHour();
            strategy.appendField(locator, this, "startHour", buffer, theStartHour, true);
        }
        {
            int theEndHour;
            theEndHour = this.getEndHour();
            strategy.appendField(locator, this, "endHour", buffer, theEndHour, true);
        }
        {
            int theStartMinute;
            theStartMinute = this.getStartMinute();
            strategy.appendField(locator, this, "startMinute", buffer, theStartMinute, true);
        }
        {
            int theEndMinute;
            theEndMinute = this.getEndMinute();
            strategy.appendField(locator, this, "endMinute", buffer, theEndMinute, true);
        }
        {
            XMLGregorianCalendar theDiurnalBaseTime;
            theDiurnalBaseTime = this.getDiurnalBaseTime();
            strategy.appendField(locator, this, "diurnalBaseTime", buffer, theDiurnalBaseTime, this.isSetDiurnalBaseTime());
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
        final ScheduleType that = ((ScheduleType) object);
        {
            int lhsStartMonth;
            lhsStartMonth = this.getStartMonth();
            int rhsStartMonth;
            rhsStartMonth = that.getStartMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startMonth", lhsStartMonth), LocatorUtils.property(thatLocator, "startMonth", rhsStartMonth), lhsStartMonth, rhsStartMonth, true, true)) {
                return false;
            }
        }
        {
            int lhsEndMonth;
            lhsEndMonth = this.getEndMonth();
            int rhsEndMonth;
            rhsEndMonth = that.getEndMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endMonth", lhsEndMonth), LocatorUtils.property(thatLocator, "endMonth", rhsEndMonth), lhsEndMonth, rhsEndMonth, true, true)) {
                return false;
            }
        }
        {
            int lhsStartWeekday;
            lhsStartWeekday = this.getStartWeekday();
            int rhsStartWeekday;
            rhsStartWeekday = that.getStartWeekday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startWeekday", lhsStartWeekday), LocatorUtils.property(thatLocator, "startWeekday", rhsStartWeekday), lhsStartWeekday, rhsStartWeekday, true, true)) {
                return false;
            }
        }
        {
            int lhsEndWeekday;
            lhsEndWeekday = this.getEndWeekday();
            int rhsEndWeekday;
            rhsEndWeekday = that.getEndWeekday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endWeekday", lhsEndWeekday), LocatorUtils.property(thatLocator, "endWeekday", rhsEndWeekday), lhsEndWeekday, rhsEndWeekday, true, true)) {
                return false;
            }
        }
        {
            int lhsStartHour;
            lhsStartHour = this.getStartHour();
            int rhsStartHour;
            rhsStartHour = that.getStartHour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startHour", lhsStartHour), LocatorUtils.property(thatLocator, "startHour", rhsStartHour), lhsStartHour, rhsStartHour, true, true)) {
                return false;
            }
        }
        {
            int lhsEndHour;
            lhsEndHour = this.getEndHour();
            int rhsEndHour;
            rhsEndHour = that.getEndHour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endHour", lhsEndHour), LocatorUtils.property(thatLocator, "endHour", rhsEndHour), lhsEndHour, rhsEndHour, true, true)) {
                return false;
            }
        }
        {
            int lhsStartMinute;
            lhsStartMinute = this.getStartMinute();
            int rhsStartMinute;
            rhsStartMinute = that.getStartMinute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startMinute", lhsStartMinute), LocatorUtils.property(thatLocator, "startMinute", rhsStartMinute), lhsStartMinute, rhsStartMinute, true, true)) {
                return false;
            }
        }
        {
            int lhsEndMinute;
            lhsEndMinute = this.getEndMinute();
            int rhsEndMinute;
            rhsEndMinute = that.getEndMinute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endMinute", lhsEndMinute), LocatorUtils.property(thatLocator, "endMinute", rhsEndMinute), lhsEndMinute, rhsEndMinute, true, true)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDiurnalBaseTime;
            lhsDiurnalBaseTime = this.getDiurnalBaseTime();
            XMLGregorianCalendar rhsDiurnalBaseTime;
            rhsDiurnalBaseTime = that.getDiurnalBaseTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diurnalBaseTime", lhsDiurnalBaseTime), LocatorUtils.property(thatLocator, "diurnalBaseTime", rhsDiurnalBaseTime), lhsDiurnalBaseTime, rhsDiurnalBaseTime, this.isSetDiurnalBaseTime(), that.isSetDiurnalBaseTime())) {
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
            int theStartMonth;
            theStartMonth = this.getStartMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startMonth", theStartMonth), currentHashCode, theStartMonth, true);
        }
        {
            int theEndMonth;
            theEndMonth = this.getEndMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endMonth", theEndMonth), currentHashCode, theEndMonth, true);
        }
        {
            int theStartWeekday;
            theStartWeekday = this.getStartWeekday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startWeekday", theStartWeekday), currentHashCode, theStartWeekday, true);
        }
        {
            int theEndWeekday;
            theEndWeekday = this.getEndWeekday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endWeekday", theEndWeekday), currentHashCode, theEndWeekday, true);
        }
        {
            int theStartHour;
            theStartHour = this.getStartHour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startHour", theStartHour), currentHashCode, theStartHour, true);
        }
        {
            int theEndHour;
            theEndHour = this.getEndHour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endHour", theEndHour), currentHashCode, theEndHour, true);
        }
        {
            int theStartMinute;
            theStartMinute = this.getStartMinute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startMinute", theStartMinute), currentHashCode, theStartMinute, true);
        }
        {
            int theEndMinute;
            theEndMinute = this.getEndMinute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endMinute", theEndMinute), currentHashCode, theEndMinute, true);
        }
        {
            XMLGregorianCalendar theDiurnalBaseTime;
            theDiurnalBaseTime = this.getDiurnalBaseTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diurnalBaseTime", theDiurnalBaseTime), currentHashCode, theDiurnalBaseTime, this.isSetDiurnalBaseTime());
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
        if (draftCopy instanceof ScheduleType) {
            final ScheduleType copy = ((ScheduleType) draftCopy);
            {
                Boolean startMonthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (startMonthShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceStartMonth;
                    sourceStartMonth = this.getStartMonth();
                    int copyStartMonth = strategy.copy(LocatorUtils.property(locator, "startMonth", sourceStartMonth), sourceStartMonth, true);
                    copy.setStartMonth(copyStartMonth);
                } else {
                    if (startMonthShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean endMonthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (endMonthShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceEndMonth;
                    sourceEndMonth = this.getEndMonth();
                    int copyEndMonth = strategy.copy(LocatorUtils.property(locator, "endMonth", sourceEndMonth), sourceEndMonth, true);
                    copy.setEndMonth(copyEndMonth);
                } else {
                    if (endMonthShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean startWeekdayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (startWeekdayShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceStartWeekday;
                    sourceStartWeekday = this.getStartWeekday();
                    int copyStartWeekday = strategy.copy(LocatorUtils.property(locator, "startWeekday", sourceStartWeekday), sourceStartWeekday, true);
                    copy.setStartWeekday(copyStartWeekday);
                } else {
                    if (startWeekdayShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean endWeekdayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (endWeekdayShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceEndWeekday;
                    sourceEndWeekday = this.getEndWeekday();
                    int copyEndWeekday = strategy.copy(LocatorUtils.property(locator, "endWeekday", sourceEndWeekday), sourceEndWeekday, true);
                    copy.setEndWeekday(copyEndWeekday);
                } else {
                    if (endWeekdayShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean startHourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (startHourShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceStartHour;
                    sourceStartHour = this.getStartHour();
                    int copyStartHour = strategy.copy(LocatorUtils.property(locator, "startHour", sourceStartHour), sourceStartHour, true);
                    copy.setStartHour(copyStartHour);
                } else {
                    if (startHourShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean endHourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (endHourShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceEndHour;
                    sourceEndHour = this.getEndHour();
                    int copyEndHour = strategy.copy(LocatorUtils.property(locator, "endHour", sourceEndHour), sourceEndHour, true);
                    copy.setEndHour(copyEndHour);
                } else {
                    if (endHourShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean startMinuteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (startMinuteShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceStartMinute;
                    sourceStartMinute = this.getStartMinute();
                    int copyStartMinute = strategy.copy(LocatorUtils.property(locator, "startMinute", sourceStartMinute), sourceStartMinute, true);
                    copy.setStartMinute(copyStartMinute);
                } else {
                    if (startMinuteShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean endMinuteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (endMinuteShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceEndMinute;
                    sourceEndMinute = this.getEndMinute();
                    int copyEndMinute = strategy.copy(LocatorUtils.property(locator, "endMinute", sourceEndMinute), sourceEndMinute, true);
                    copy.setEndMinute(copyEndMinute);
                } else {
                    if (endMinuteShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean diurnalBaseTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDiurnalBaseTime());
                if (diurnalBaseTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceDiurnalBaseTime;
                    sourceDiurnalBaseTime = this.getDiurnalBaseTime();
                    XMLGregorianCalendar copyDiurnalBaseTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "diurnalBaseTime", sourceDiurnalBaseTime), sourceDiurnalBaseTime, this.isSetDiurnalBaseTime()));
                    copy.setDiurnalBaseTime(copyDiurnalBaseTime);
                } else {
                    if (diurnalBaseTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.diurnalBaseTime = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ScheduleType();
    }

}

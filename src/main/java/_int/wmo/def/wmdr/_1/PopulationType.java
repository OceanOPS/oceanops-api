
package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.TimePeriodPropertyType;
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
 * <p>Java class for PopulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="population10km" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="population50km" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "PopulationType", propOrder = {
    "population10Km",
    "population50Km",
    "validPeriod"
})
public class PopulationType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "population10km")
    protected BigInteger population10Km;
    @XmlElement(name = "population50km")
    protected BigInteger population50Km;
    protected TimePeriodPropertyType validPeriod;

    /**
     * Gets the value of the population10Km property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopulation10Km() {
        return population10Km;
    }

    /**
     * Sets the value of the population10Km property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopulation10Km(BigInteger value) {
        this.population10Km = value;
    }

    public boolean isSetPopulation10Km() {
        return (this.population10Km!= null);
    }

    /**
     * Gets the value of the population50Km property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopulation50Km() {
        return population50Km;
    }

    /**
     * Sets the value of the population50Km property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopulation50Km(BigInteger value) {
        this.population50Km = value;
    }

    public boolean isSetPopulation50Km() {
        return (this.population50Km!= null);
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
            BigInteger thePopulation10Km;
            thePopulation10Km = this.getPopulation10Km();
            strategy.appendField(locator, this, "population10Km", buffer, thePopulation10Km, this.isSetPopulation10Km());
        }
        {
            BigInteger thePopulation50Km;
            thePopulation50Km = this.getPopulation50Km();
            strategy.appendField(locator, this, "population50Km", buffer, thePopulation50Km, this.isSetPopulation50Km());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            strategy.appendField(locator, this, "validPeriod", buffer, theValidPeriod, this.isSetValidPeriod());
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
        final PopulationType that = ((PopulationType) object);
        {
            BigInteger lhsPopulation10Km;
            lhsPopulation10Km = this.getPopulation10Km();
            BigInteger rhsPopulation10Km;
            rhsPopulation10Km = that.getPopulation10Km();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "population10Km", lhsPopulation10Km), LocatorUtils.property(thatLocator, "population10Km", rhsPopulation10Km), lhsPopulation10Km, rhsPopulation10Km, this.isSetPopulation10Km(), that.isSetPopulation10Km())) {
                return false;
            }
        }
        {
            BigInteger lhsPopulation50Km;
            lhsPopulation50Km = this.getPopulation50Km();
            BigInteger rhsPopulation50Km;
            rhsPopulation50Km = that.getPopulation50Km();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "population50Km", lhsPopulation50Km), LocatorUtils.property(thatLocator, "population50Km", rhsPopulation50Km), lhsPopulation50Km, rhsPopulation50Km, this.isSetPopulation50Km(), that.isSetPopulation50Km())) {
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

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            BigInteger thePopulation10Km;
            thePopulation10Km = this.getPopulation10Km();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "population10Km", thePopulation10Km), currentHashCode, thePopulation10Km, this.isSetPopulation10Km());
        }
        {
            BigInteger thePopulation50Km;
            thePopulation50Km = this.getPopulation50Km();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "population50Km", thePopulation50Km), currentHashCode, thePopulation50Km, this.isSetPopulation50Km());
        }
        {
            TimePeriodPropertyType theValidPeriod;
            theValidPeriod = this.getValidPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validPeriod", theValidPeriod), currentHashCode, theValidPeriod, this.isSetValidPeriod());
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
        if (draftCopy instanceof PopulationType) {
            final PopulationType copy = ((PopulationType) draftCopy);
            {
                Boolean population10KmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPopulation10Km());
                if (population10KmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourcePopulation10Km;
                    sourcePopulation10Km = this.getPopulation10Km();
                    BigInteger copyPopulation10Km = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "population10Km", sourcePopulation10Km), sourcePopulation10Km, this.isSetPopulation10Km()));
                    copy.setPopulation10Km(copyPopulation10Km);
                } else {
                    if (population10KmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.population10Km = null;
                    }
                }
            }
            {
                Boolean population50KmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPopulation50Km());
                if (population50KmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourcePopulation50Km;
                    sourcePopulation50Km = this.getPopulation50Km();
                    BigInteger copyPopulation50Km = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "population50Km", sourcePopulation50Km), sourcePopulation50Km, this.isSetPopulation50Km()));
                    copy.setPopulation50Km(copyPopulation50Km);
                } else {
                    if (population50KmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.population50Km = null;
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

    public Object createNewInstance() {
        return new PopulationType();
    }

}

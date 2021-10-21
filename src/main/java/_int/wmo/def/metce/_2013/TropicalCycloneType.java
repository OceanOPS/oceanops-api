
package _int.wmo.def.metce._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractFeatureType;
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
 * <p>Java class for TropicalCycloneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneType", propOrder = {
    "tropicalCycloneName"
})
public class TropicalCycloneType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "name", required = true)
    protected String tropicalCycloneName;

    /**
     * Gets the value of the tropicalCycloneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTropicalCycloneName() {
        return tropicalCycloneName;
    }

    /**
     * Sets the value of the tropicalCycloneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTropicalCycloneName(String value) {
        this.tropicalCycloneName = value;
    }

    public boolean isSetTropicalCycloneName() {
        return (this.tropicalCycloneName!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
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
            String theTropicalCycloneName;
            theTropicalCycloneName = this.getTropicalCycloneName();
            strategy.appendField(locator, this, "tropicalCycloneName", buffer, theTropicalCycloneName, this.isSetTropicalCycloneName());
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
        final TropicalCycloneType that = ((TropicalCycloneType) object);
        {
            String lhsTropicalCycloneName;
            lhsTropicalCycloneName = this.getTropicalCycloneName();
            String rhsTropicalCycloneName;
            rhsTropicalCycloneName = that.getTropicalCycloneName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tropicalCycloneName", lhsTropicalCycloneName), LocatorUtils.property(thatLocator, "tropicalCycloneName", rhsTropicalCycloneName), lhsTropicalCycloneName, rhsTropicalCycloneName, this.isSetTropicalCycloneName(), that.isSetTropicalCycloneName())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theTropicalCycloneName;
            theTropicalCycloneName = this.getTropicalCycloneName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tropicalCycloneName", theTropicalCycloneName), currentHashCode, theTropicalCycloneName, this.isSetTropicalCycloneName());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE2;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TropicalCycloneType) {
            final TropicalCycloneType copy = ((TropicalCycloneType) draftCopy);
            {
                Boolean tropicalCycloneNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTropicalCycloneName());
                if (tropicalCycloneNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTropicalCycloneName;
                    sourceTropicalCycloneName = this.getTropicalCycloneName();
                    String copyTropicalCycloneName = ((String) strategy.copy(LocatorUtils.property(locator, "tropicalCycloneName", sourceTropicalCycloneName), sourceTropicalCycloneName, this.isSetTropicalCycloneName()));
                    copy.setTropicalCycloneName(copyTropicalCycloneName);
                } else {
                    if (tropicalCycloneNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tropicalCycloneName = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TropicalCycloneType();
    }

}

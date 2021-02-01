
package _int.wmo.def.metce._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.PointPropertyType;
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
 * <p>Java class for VolcanoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanoType", propOrder = {
    "volcanoName",
    "position"
})
@XmlSeeAlso({
    EruptingVolcanoType.class
})
public class VolcanoType
    extends AbstractFeatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "name", required = true)
    protected String volcanoName;
    @XmlElement(required = true)
    protected PointPropertyType position;

    /**
     * Gets the value of the volcanoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolcanoName() {
        return volcanoName;
    }

    /**
     * Sets the value of the volcanoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolcanoName(String value) {
        this.volcanoName = value;
    }

    public boolean isSetVolcanoName() {
        return (this.volcanoName!= null);
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPosition(PointPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
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
            String theVolcanoName;
            theVolcanoName = this.getVolcanoName();
            strategy.appendField(locator, this, "volcanoName", buffer, theVolcanoName, this.isSetVolcanoName());
        }
        {
            PointPropertyType thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition, this.isSetPosition());
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
        final VolcanoType that = ((VolcanoType) object);
        {
            String lhsVolcanoName;
            lhsVolcanoName = this.getVolcanoName();
            String rhsVolcanoName;
            rhsVolcanoName = that.getVolcanoName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "volcanoName", lhsVolcanoName), LocatorUtils.property(thatLocator, "volcanoName", rhsVolcanoName), lhsVolcanoName, rhsVolcanoName, this.isSetVolcanoName(), that.isSetVolcanoName())) {
                return false;
            }
        }
        {
            PointPropertyType lhsPosition;
            lhsPosition = this.getPosition();
            PointPropertyType rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition, this.isSetPosition(), that.isSetPosition())) {
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
            String theVolcanoName;
            theVolcanoName = this.getVolcanoName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "volcanoName", theVolcanoName), currentHashCode, theVolcanoName, this.isSetVolcanoName());
        }
        {
            PointPropertyType thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition, this.isSetPosition());
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
        if (draftCopy instanceof VolcanoType) {
            final VolcanoType copy = ((VolcanoType) draftCopy);
            {
                Boolean volcanoNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVolcanoName());
                if (volcanoNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVolcanoName;
                    sourceVolcanoName = this.getVolcanoName();
                    String copyVolcanoName = ((String) strategy.copy(LocatorUtils.property(locator, "volcanoName", sourceVolcanoName), sourceVolcanoName, this.isSetVolcanoName()));
                    copy.setVolcanoName(copyVolcanoName);
                } else {
                    if (volcanoNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.volcanoName = null;
                    }
                }
            }
            {
                Boolean positionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPosition());
                if (positionShouldBeCopiedAndSet == Boolean.TRUE) {
                    PointPropertyType sourcePosition;
                    sourcePosition = this.getPosition();
                    PointPropertyType copyPosition = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition, this.isSetPosition()));
                    copy.setPosition(copyPosition);
                } else {
                    if (positionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.position = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VolcanoType();
    }

}


package _int.wmo.def.wmdr._1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractMemberType;
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
 * <p>Java class for DataPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataPolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataPolicy" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="attribution" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/1.0}Attribution"/&gt;
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
@XmlType(name = "DataPolicyType", propOrder = {
    "dataPolicy",
    "attribution"
})
public class DataPolicyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType dataPolicy;
    protected DataPolicyType.Attribution attribution;

    /**
     * Gets the value of the dataPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDataPolicy() {
        return dataPolicy;
    }

    /**
     * Sets the value of the dataPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDataPolicy(ReferenceType value) {
        this.dataPolicy = value;
    }

    public boolean isSetDataPolicy() {
        return (this.dataPolicy!= null);
    }

    /**
     * Gets the value of the attribution property.
     * 
     * @return
     *     possible object is
     *     {@link DataPolicyType.Attribution }
     *     
     */
    public DataPolicyType.Attribution getAttribution() {
        return attribution;
    }

    /**
     * Sets the value of the attribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPolicyType.Attribution }
     *     
     */
    public void setAttribution(DataPolicyType.Attribution value) {
        this.attribution = value;
    }

    public boolean isSetAttribution() {
        return (this.attribution!= null);
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
            ReferenceType theDataPolicy;
            theDataPolicy = this.getDataPolicy();
            strategy.appendField(locator, this, "dataPolicy", buffer, theDataPolicy, this.isSetDataPolicy());
        }
        {
            DataPolicyType.Attribution theAttribution;
            theAttribution = this.getAttribution();
            strategy.appendField(locator, this, "attribution", buffer, theAttribution, this.isSetAttribution());
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
        final DataPolicyType that = ((DataPolicyType) object);
        {
            ReferenceType lhsDataPolicy;
            lhsDataPolicy = this.getDataPolicy();
            ReferenceType rhsDataPolicy;
            rhsDataPolicy = that.getDataPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataPolicy", lhsDataPolicy), LocatorUtils.property(thatLocator, "dataPolicy", rhsDataPolicy), lhsDataPolicy, rhsDataPolicy, this.isSetDataPolicy(), that.isSetDataPolicy())) {
                return false;
            }
        }
        {
            DataPolicyType.Attribution lhsAttribution;
            lhsAttribution = this.getAttribution();
            DataPolicyType.Attribution rhsAttribution;
            rhsAttribution = that.getAttribution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attribution", lhsAttribution), LocatorUtils.property(thatLocator, "attribution", rhsAttribution), lhsAttribution, rhsAttribution, this.isSetAttribution(), that.isSetAttribution())) {
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
            ReferenceType theDataPolicy;
            theDataPolicy = this.getDataPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataPolicy", theDataPolicy), currentHashCode, theDataPolicy, this.isSetDataPolicy());
        }
        {
            DataPolicyType.Attribution theAttribution;
            theAttribution = this.getAttribution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attribution", theAttribution), currentHashCode, theAttribution, this.isSetAttribution());
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
        if (draftCopy instanceof DataPolicyType) {
            final DataPolicyType copy = ((DataPolicyType) draftCopy);
            {
                Boolean dataPolicyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataPolicy());
                if (dataPolicyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceDataPolicy;
                    sourceDataPolicy = this.getDataPolicy();
                    ReferenceType copyDataPolicy = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "dataPolicy", sourceDataPolicy), sourceDataPolicy, this.isSetDataPolicy()));
                    copy.setDataPolicy(copyDataPolicy);
                } else {
                    if (dataPolicyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataPolicy = null;
                    }
                }
            }
            {
                Boolean attributionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAttribution());
                if (attributionShouldBeCopiedAndSet == Boolean.TRUE) {
                    DataPolicyType.Attribution sourceAttribution;
                    sourceAttribution = this.getAttribution();
                    DataPolicyType.Attribution copyAttribution = ((DataPolicyType.Attribution) strategy.copy(LocatorUtils.property(locator, "attribution", sourceAttribution), sourceAttribution, this.isSetAttribution()));
                    copy.setAttribution(copyAttribution);
                } else {
                    if (attributionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attribution = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DataPolicyType();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/1.0}Attribution"/&gt;
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
        "attribution"
    })
    public static class Attribution
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Attribution", required = true)
        protected AttributionType attribution;

        /**
         * Gets the value of the attribution property.
         * 
         * @return
         *     possible object is
         *     {@link AttributionType }
         *     
         */
        public AttributionType getAttribution() {
            return attribution;
        }

        /**
         * Sets the value of the attribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributionType }
         *     
         */
        public void setAttribution(AttributionType value) {
            this.attribution = value;
        }

        public boolean isSetAttribution() {
            return (this.attribution!= null);
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
                AttributionType theAttribution;
                theAttribution = this.getAttribution();
                strategy.appendField(locator, this, "attribution", buffer, theAttribution, this.isSetAttribution());
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
            final DataPolicyType.Attribution that = ((DataPolicyType.Attribution) object);
            {
                AttributionType lhsAttribution;
                lhsAttribution = this.getAttribution();
                AttributionType rhsAttribution;
                rhsAttribution = that.getAttribution();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "attribution", lhsAttribution), LocatorUtils.property(thatLocator, "attribution", rhsAttribution), lhsAttribution, rhsAttribution, this.isSetAttribution(), that.isSetAttribution())) {
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
                AttributionType theAttribution;
                theAttribution = this.getAttribution();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attribution", theAttribution), currentHashCode, theAttribution, this.isSetAttribution());
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
            if (draftCopy instanceof DataPolicyType.Attribution) {
                final DataPolicyType.Attribution copy = ((DataPolicyType.Attribution) draftCopy);
                {
                    Boolean attributionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAttribution());
                    if (attributionShouldBeCopiedAndSet == Boolean.TRUE) {
                        AttributionType sourceAttribution;
                        sourceAttribution = this.getAttribution();
                        AttributionType copyAttribution = ((AttributionType) strategy.copy(LocatorUtils.property(locator, "attribution", sourceAttribution), sourceAttribution, this.isSetAttribution()));
                        copy.setAttribution(copyAttribution);
                    } else {
                        if (attributionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.attribution = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new DataPolicyType.Attribution();
        }

    }

}


package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractMetadataPropertyType;
import net.opengis.iso19139.gmd.v_20070417.MDDistributionType;
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
 * <p>Java class for ResultSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distributionInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_Distribution"/&gt;
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
@XmlType(name = "ResultSetType", propOrder = {
    "distributionInfo"
})
public class ResultSetType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected List<ResultSetType.DistributionInfo> distributionInfo;

    /**
     * Gets the value of the distributionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultSetType.DistributionInfo }
     * 
     * 
     */
    public List<ResultSetType.DistributionInfo> getDistributionInfo() {
        if (distributionInfo == null) {
            distributionInfo = new ArrayList<ResultSetType.DistributionInfo>();
        }
        return this.distributionInfo;
    }

    public boolean isSetDistributionInfo() {
        return ((this.distributionInfo!= null)&&(!this.distributionInfo.isEmpty()));
    }

    public void unsetDistributionInfo() {
        this.distributionInfo = null;
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
            List<ResultSetType.DistributionInfo> theDistributionInfo;
            theDistributionInfo = (this.isSetDistributionInfo()?this.getDistributionInfo():null);
            strategy.appendField(locator, this, "distributionInfo", buffer, theDistributionInfo, this.isSetDistributionInfo());
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
        final ResultSetType that = ((ResultSetType) object);
        {
            List<ResultSetType.DistributionInfo> lhsDistributionInfo;
            lhsDistributionInfo = (this.isSetDistributionInfo()?this.getDistributionInfo():null);
            List<ResultSetType.DistributionInfo> rhsDistributionInfo;
            rhsDistributionInfo = (that.isSetDistributionInfo()?that.getDistributionInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributionInfo", lhsDistributionInfo), LocatorUtils.property(thatLocator, "distributionInfo", rhsDistributionInfo), lhsDistributionInfo, rhsDistributionInfo, this.isSetDistributionInfo(), that.isSetDistributionInfo())) {
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
            List<ResultSetType.DistributionInfo> theDistributionInfo;
            theDistributionInfo = (this.isSetDistributionInfo()?this.getDistributionInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributionInfo", theDistributionInfo), currentHashCode, theDistributionInfo, this.isSetDistributionInfo());
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
        if (draftCopy instanceof ResultSetType) {
            final ResultSetType copy = ((ResultSetType) draftCopy);
            {
                Boolean distributionInfoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDistributionInfo());
                if (distributionInfoShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ResultSetType.DistributionInfo> sourceDistributionInfo;
                    sourceDistributionInfo = (this.isSetDistributionInfo()?this.getDistributionInfo():null);
                    @SuppressWarnings("unchecked")
                    List<ResultSetType.DistributionInfo> copyDistributionInfo = ((List<ResultSetType.DistributionInfo> ) strategy.copy(LocatorUtils.property(locator, "distributionInfo", sourceDistributionInfo), sourceDistributionInfo, this.isSetDistributionInfo()));
                    copy.unsetDistributionInfo();
                    if (copyDistributionInfo!= null) {
                        List<ResultSetType.DistributionInfo> uniqueDistributionInfol = copy.getDistributionInfo();
                        uniqueDistributionInfol.addAll(copyDistributionInfo);
                    }
                } else {
                    if (distributionInfoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetDistributionInfo();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ResultSetType();
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
     *         &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_Distribution"/&gt;
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
        "mdDistribution"
    })
    public static class DistributionInfo
        extends AbstractMetadataPropertyType
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "MD_Distribution", namespace = "http://www.isotc211.org/2005/gmd", required = true)
        protected MDDistributionType mdDistribution;

        /**
         * Gets the value of the mdDistribution property.
         * 
         * @return
         *     possible object is
         *     {@link MDDistributionType }
         *     
         */
        public MDDistributionType getMDDistribution() {
            return mdDistribution;
        }

        /**
         * Sets the value of the mdDistribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link MDDistributionType }
         *     
         */
        public void setMDDistribution(MDDistributionType value) {
            this.mdDistribution = value;
        }

        public boolean isSetMDDistribution() {
            return (this.mdDistribution!= null);
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
                MDDistributionType theMDDistribution;
                theMDDistribution = this.getMDDistribution();
                strategy.appendField(locator, this, "mdDistribution", buffer, theMDDistribution, this.isSetMDDistribution());
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
            final ResultSetType.DistributionInfo that = ((ResultSetType.DistributionInfo) object);
            {
                MDDistributionType lhsMDDistribution;
                lhsMDDistribution = this.getMDDistribution();
                MDDistributionType rhsMDDistribution;
                rhsMDDistribution = that.getMDDistribution();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mdDistribution", lhsMDDistribution), LocatorUtils.property(thatLocator, "mdDistribution", rhsMDDistribution), lhsMDDistribution, rhsMDDistribution, this.isSetMDDistribution(), that.isSetMDDistribution())) {
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
                MDDistributionType theMDDistribution;
                theMDDistribution = this.getMDDistribution();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdDistribution", theMDDistribution), currentHashCode, theMDDistribution, this.isSetMDDistribution());
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
            if (draftCopy instanceof ResultSetType.DistributionInfo) {
                final ResultSetType.DistributionInfo copy = ((ResultSetType.DistributionInfo) draftCopy);
                {
                    Boolean mdDistributionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMDDistribution());
                    if (mdDistributionShouldBeCopiedAndSet == Boolean.TRUE) {
                        MDDistributionType sourceMDDistribution;
                        sourceMDDistribution = this.getMDDistribution();
                        MDDistributionType copyMDDistribution = ((MDDistributionType) strategy.copy(LocatorUtils.property(locator, "mdDistribution", sourceMDDistribution), sourceMDDistribution, this.isSetMDDistribution()));
                        copy.setMDDistribution(copyMDDistribution);
                    } else {
                        if (mdDistributionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mdDistribution = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ResultSetType.DistributionInfo();
        }

    }

}

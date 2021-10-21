
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.hisrc.w3c.xlink.v_1_0.ActuateType;
import org.hisrc.w3c.xlink.v_1_0.ShowType;
import org.hisrc.w3c.xlink.v_1_0.TypeType;
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
 * <p>Java class for DataGenerationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataGenerationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://def.wmo.int/wmdr/2017}DataGeneration"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataGenerationPropertyType", propOrder = {
    "dataGeneration"
})
public class DataGenerationPropertyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataGeneration")
    protected DataGenerationType dataGeneration;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the dataGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link DataGenerationType }
     *     
     */
    public DataGenerationType getDataGeneration() {
        return dataGeneration;
    }

    /**
     * Sets the value of the dataGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataGenerationType }
     *     
     */
    public void setDataGeneration(DataGenerationType value) {
        this.dataGeneration = value;
    }

    public boolean isSetDataGeneration() {
        return (this.dataGeneration!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public boolean isSetNilReason() {
        return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
    }

    public void unsetNilReason() {
        this.nilReason = null;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setTYPE(TypeType value) {
        this.type = value;
    }

    public boolean isSetTYPE() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

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
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
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
        {
            DataGenerationType theDataGeneration;
            theDataGeneration = this.getDataGeneration();
            strategy.appendField(locator, this, "dataGeneration", buffer, theDataGeneration, this.isSetDataGeneration());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theOwns, this.isSetOwns());
        }
        {
            List<String> theNilReason;
            theNilReason = (this.isSetNilReason()?this.getNilReason():null);
            strategy.appendField(locator, this, "nilReason", buffer, theNilReason, this.isSetNilReason());
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theRemoteSchema, this.isSetRemoteSchema());
        }
        {
            TypeType theTYPE;
            theTYPE = this.getTYPE();
            strategy.appendField(locator, this, "type", buffer, theTYPE, this.isSetTYPE());
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref, this.isSetHref());
        }
        {
            String theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole, this.isSetRole());
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theArcrole, this.isSetArcrole());
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, this.isSetTitle());
        }
        {
            ShowType theShow;
            theShow = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theShow, this.isSetShow());
        }
        {
            ActuateType theActuate;
            theActuate = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theActuate, this.isSetActuate());
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
        final DataGenerationPropertyType that = ((DataGenerationPropertyType) object);
        {
            DataGenerationType lhsDataGeneration;
            lhsDataGeneration = this.getDataGeneration();
            DataGenerationType rhsDataGeneration;
            rhsDataGeneration = that.getDataGeneration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataGeneration", lhsDataGeneration), LocatorUtils.property(thatLocator, "dataGeneration", rhsDataGeneration), lhsDataGeneration, rhsDataGeneration, this.isSetDataGeneration(), that.isSetDataGeneration())) {
                return false;
            }
        }
        {
            boolean lhsOwns;
            lhsOwns = (this.isSetOwns()?this.isOwns():false);
            boolean rhsOwns;
            rhsOwns = (that.isSetOwns()?that.isOwns():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owns", lhsOwns), LocatorUtils.property(thatLocator, "owns", rhsOwns), lhsOwns, rhsOwns, this.isSetOwns(), that.isSetOwns())) {
                return false;
            }
        }
        {
            List<String> lhsNilReason;
            lhsNilReason = (this.isSetNilReason()?this.getNilReason():null);
            List<String> rhsNilReason;
            rhsNilReason = (that.isSetNilReason()?that.getNilReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nilReason", lhsNilReason), LocatorUtils.property(thatLocator, "nilReason", rhsNilReason), lhsNilReason, rhsNilReason, this.isSetNilReason(), that.isSetNilReason())) {
                return false;
            }
        }
        {
            String lhsRemoteSchema;
            lhsRemoteSchema = this.getRemoteSchema();
            String rhsRemoteSchema;
            rhsRemoteSchema = that.getRemoteSchema();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(thatLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema, this.isSetRemoteSchema(), that.isSetRemoteSchema())) {
                return false;
            }
        }
        {
            TypeType lhsTYPE;
            lhsTYPE = this.getTYPE();
            TypeType rhsTYPE;
            rhsTYPE = that.getTYPE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, this.isSetTYPE(), that.isSetTYPE())) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, this.isSetHref(), that.isSetHref())) {
                return false;
            }
        }
        {
            String lhsRole;
            lhsRole = this.getRole();
            String rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole, this.isSetRole(), that.isSetRole())) {
                return false;
            }
        }
        {
            String lhsArcrole;
            lhsArcrole = this.getArcrole();
            String rhsArcrole;
            rhsArcrole = that.getArcrole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arcrole", lhsArcrole), LocatorUtils.property(thatLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole, this.isSetArcrole(), that.isSetArcrole())) {
                return false;
            }
        }
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
            ShowType lhsShow;
            lhsShow = this.getShow();
            ShowType rhsShow;
            rhsShow = that.getShow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "show", lhsShow), LocatorUtils.property(thatLocator, "show", rhsShow), lhsShow, rhsShow, this.isSetShow(), that.isSetShow())) {
                return false;
            }
        }
        {
            ActuateType lhsActuate;
            lhsActuate = this.getActuate();
            ActuateType rhsActuate;
            rhsActuate = that.getActuate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actuate", lhsActuate), LocatorUtils.property(thatLocator, "actuate", rhsActuate), lhsActuate, rhsActuate, this.isSetActuate(), that.isSetActuate())) {
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
        int currentHashCode = 1;
        {
            DataGenerationType theDataGeneration;
            theDataGeneration = this.getDataGeneration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataGeneration", theDataGeneration), currentHashCode, theDataGeneration, this.isSetDataGeneration());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns, this.isSetOwns());
        }
        {
            List<String> theNilReason;
            theNilReason = (this.isSetNilReason()?this.getNilReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nilReason", theNilReason), currentHashCode, theNilReason, this.isSetNilReason());
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteSchema", theRemoteSchema), currentHashCode, theRemoteSchema, this.isSetRemoteSchema());
        }
        {
            TypeType theTYPE;
            theTYPE = this.getTYPE();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theTYPE), currentHashCode, theTYPE, this.isSetTYPE());
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref, this.isSetHref());
        }
        {
            String theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole, this.isSetRole());
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arcrole", theArcrole), currentHashCode, theArcrole, this.isSetArcrole());
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, this.isSetTitle());
        }
        {
            ShowType theShow;
            theShow = this.getShow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "show", theShow), currentHashCode, theShow, this.isSetShow());
        }
        {
            ActuateType theActuate;
            theActuate = this.getActuate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actuate", theActuate), currentHashCode, theActuate, this.isSetActuate());
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
        if (draftCopy instanceof DataGenerationPropertyType) {
            final DataGenerationPropertyType copy = ((DataGenerationPropertyType) draftCopy);
            {
                Boolean dataGenerationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDataGeneration());
                if (dataGenerationShouldBeCopiedAndSet == Boolean.TRUE) {
                    DataGenerationType sourceDataGeneration;
                    sourceDataGeneration = this.getDataGeneration();
                    DataGenerationType copyDataGeneration = ((DataGenerationType) strategy.copy(LocatorUtils.property(locator, "dataGeneration", sourceDataGeneration), sourceDataGeneration, this.isSetDataGeneration()));
                    copy.setDataGeneration(copyDataGeneration);
                } else {
                    if (dataGenerationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataGeneration = null;
                    }
                }
            }
            {
                Boolean ownsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOwns());
                if (ownsShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceOwns;
                    sourceOwns = (this.isSetOwns()?this.isOwns():false);
                    boolean copyOwns = strategy.copy(LocatorUtils.property(locator, "owns", sourceOwns), sourceOwns, this.isSetOwns());
                    copy.setOwns(copyOwns);
                } else {
                    if (ownsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetOwns();
                    }
                }
            }
            {
                Boolean nilReasonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetNilReason());
                if (nilReasonShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceNilReason;
                    sourceNilReason = (this.isSetNilReason()?this.getNilReason():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyNilReason = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "nilReason", sourceNilReason), sourceNilReason, this.isSetNilReason()));
                    copy.unsetNilReason();
                    if (copyNilReason!= null) {
                        List<String> uniqueNilReasonl = copy.getNilReason();
                        uniqueNilReasonl.addAll(copyNilReason);
                    }
                } else {
                    if (nilReasonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetNilReason();
                    }
                }
            }
            {
                Boolean remoteSchemaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRemoteSchema());
                if (remoteSchemaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRemoteSchema;
                    sourceRemoteSchema = this.getRemoteSchema();
                    String copyRemoteSchema = ((String) strategy.copy(LocatorUtils.property(locator, "remoteSchema", sourceRemoteSchema), sourceRemoteSchema, this.isSetRemoteSchema()));
                    copy.setRemoteSchema(copyRemoteSchema);
                } else {
                    if (remoteSchemaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.remoteSchema = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTYPE());
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    TypeType sourceTYPE;
                    sourceTYPE = this.getTYPE();
                    TypeType copyTYPE = ((TypeType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE, this.isSetTYPE()));
                    copy.setTYPE(copyTYPE);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHref());
                if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHref;
                    sourceHref = this.getHref();
                    String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, this.isSetHref()));
                    copy.setHref(copyHref);
                } else {
                    if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.href = null;
                    }
                }
            }
            {
                Boolean roleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRole());
                if (roleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRole;
                    sourceRole = this.getRole();
                    String copyRole = ((String) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole, this.isSetRole()));
                    copy.setRole(copyRole);
                } else {
                    if (roleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.role = null;
                    }
                }
            }
            {
                Boolean arcroleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetArcrole());
                if (arcroleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceArcrole;
                    sourceArcrole = this.getArcrole();
                    String copyArcrole = ((String) strategy.copy(LocatorUtils.property(locator, "arcrole", sourceArcrole), sourceArcrole, this.isSetArcrole()));
                    copy.setArcrole(copyArcrole);
                } else {
                    if (arcroleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.arcrole = null;
                    }
                }
            }
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
                Boolean showShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetShow());
                if (showShouldBeCopiedAndSet == Boolean.TRUE) {
                    ShowType sourceShow;
                    sourceShow = this.getShow();
                    ShowType copyShow = ((ShowType) strategy.copy(LocatorUtils.property(locator, "show", sourceShow), sourceShow, this.isSetShow()));
                    copy.setShow(copyShow);
                } else {
                    if (showShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.show = null;
                    }
                }
            }
            {
                Boolean actuateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetActuate());
                if (actuateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActuateType sourceActuate;
                    sourceActuate = this.getActuate();
                    ActuateType copyActuate = ((ActuateType) strategy.copy(LocatorUtils.property(locator, "actuate", sourceActuate), sourceActuate, this.isSetActuate()));
                    copy.setActuate(copyActuate);
                } else {
                    if (actuateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actuate = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DataGenerationPropertyType();
    }

}

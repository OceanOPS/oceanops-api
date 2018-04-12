
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for ProgramAffiliationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramAffiliationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="programAffiliation" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="programSpecificFacilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportingStatus" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}ReportingStatus"/&gt;
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
@XmlType(name = "ProgramAffiliationType", propOrder = {
    "programAffiliation",
    "programSpecificFacilityId",
    "reportingStatus"
})
public class ProgramAffiliationType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ReferenceType programAffiliation;
    protected String programSpecificFacilityId;
    protected List<ProgramAffiliationType.ReportingStatus> reportingStatus;

    /**
     * Gets the value of the programAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getProgramAffiliation() {
        return programAffiliation;
    }

    /**
     * Sets the value of the programAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setProgramAffiliation(ReferenceType value) {
        this.programAffiliation = value;
    }

    public boolean isSetProgramAffiliation() {
        return (this.programAffiliation!= null);
    }

    /**
     * Gets the value of the programSpecificFacilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramSpecificFacilityId() {
        return programSpecificFacilityId;
    }

    /**
     * Sets the value of the programSpecificFacilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramSpecificFacilityId(String value) {
        this.programSpecificFacilityId = value;
    }

    public boolean isSetProgramSpecificFacilityId() {
        return (this.programSpecificFacilityId!= null);
    }

    /**
     * Gets the value of the reportingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramAffiliationType.ReportingStatus }
     * 
     * 
     */
    public List<ProgramAffiliationType.ReportingStatus> getReportingStatus() {
        if (reportingStatus == null) {
            reportingStatus = new ArrayList<ProgramAffiliationType.ReportingStatus>();
        }
        return this.reportingStatus;
    }

    public boolean isSetReportingStatus() {
        return ((this.reportingStatus!= null)&&(!this.reportingStatus.isEmpty()));
    }

    public void unsetReportingStatus() {
        this.reportingStatus = null;
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
            ReferenceType theProgramAffiliation;
            theProgramAffiliation = this.getProgramAffiliation();
            strategy.appendField(locator, this, "programAffiliation", buffer, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            String theProgramSpecificFacilityId;
            theProgramSpecificFacilityId = this.getProgramSpecificFacilityId();
            strategy.appendField(locator, this, "programSpecificFacilityId", buffer, theProgramSpecificFacilityId, this.isSetProgramSpecificFacilityId());
        }
        {
            List<ProgramAffiliationType.ReportingStatus> theReportingStatus;
            theReportingStatus = (this.isSetReportingStatus()?this.getReportingStatus():null);
            strategy.appendField(locator, this, "reportingStatus", buffer, theReportingStatus, this.isSetReportingStatus());
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
        final ProgramAffiliationType that = ((ProgramAffiliationType) object);
        {
            ReferenceType lhsProgramAffiliation;
            lhsProgramAffiliation = this.getProgramAffiliation();
            ReferenceType rhsProgramAffiliation;
            rhsProgramAffiliation = that.getProgramAffiliation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programAffiliation", lhsProgramAffiliation), LocatorUtils.property(thatLocator, "programAffiliation", rhsProgramAffiliation), lhsProgramAffiliation, rhsProgramAffiliation, this.isSetProgramAffiliation(), that.isSetProgramAffiliation())) {
                return false;
            }
        }
        {
            String lhsProgramSpecificFacilityId;
            lhsProgramSpecificFacilityId = this.getProgramSpecificFacilityId();
            String rhsProgramSpecificFacilityId;
            rhsProgramSpecificFacilityId = that.getProgramSpecificFacilityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programSpecificFacilityId", lhsProgramSpecificFacilityId), LocatorUtils.property(thatLocator, "programSpecificFacilityId", rhsProgramSpecificFacilityId), lhsProgramSpecificFacilityId, rhsProgramSpecificFacilityId, this.isSetProgramSpecificFacilityId(), that.isSetProgramSpecificFacilityId())) {
                return false;
            }
        }
        {
            List<ProgramAffiliationType.ReportingStatus> lhsReportingStatus;
            lhsReportingStatus = (this.isSetReportingStatus()?this.getReportingStatus():null);
            List<ProgramAffiliationType.ReportingStatus> rhsReportingStatus;
            rhsReportingStatus = (that.isSetReportingStatus()?that.getReportingStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportingStatus", lhsReportingStatus), LocatorUtils.property(thatLocator, "reportingStatus", rhsReportingStatus), lhsReportingStatus, rhsReportingStatus, this.isSetReportingStatus(), that.isSetReportingStatus())) {
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
            ReferenceType theProgramAffiliation;
            theProgramAffiliation = this.getProgramAffiliation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programAffiliation", theProgramAffiliation), currentHashCode, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            String theProgramSpecificFacilityId;
            theProgramSpecificFacilityId = this.getProgramSpecificFacilityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programSpecificFacilityId", theProgramSpecificFacilityId), currentHashCode, theProgramSpecificFacilityId, this.isSetProgramSpecificFacilityId());
        }
        {
            List<ProgramAffiliationType.ReportingStatus> theReportingStatus;
            theReportingStatus = (this.isSetReportingStatus()?this.getReportingStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportingStatus", theReportingStatus), currentHashCode, theReportingStatus, this.isSetReportingStatus());
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
        if (draftCopy instanceof ProgramAffiliationType) {
            final ProgramAffiliationType copy = ((ProgramAffiliationType) draftCopy);
            {
                Boolean programAffiliationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProgramAffiliation());
                if (programAffiliationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceProgramAffiliation;
                    sourceProgramAffiliation = this.getProgramAffiliation();
                    ReferenceType copyProgramAffiliation = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "programAffiliation", sourceProgramAffiliation), sourceProgramAffiliation, this.isSetProgramAffiliation()));
                    copy.setProgramAffiliation(copyProgramAffiliation);
                } else {
                    if (programAffiliationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.programAffiliation = null;
                    }
                }
            }
            {
                Boolean programSpecificFacilityIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProgramSpecificFacilityId());
                if (programSpecificFacilityIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProgramSpecificFacilityId;
                    sourceProgramSpecificFacilityId = this.getProgramSpecificFacilityId();
                    String copyProgramSpecificFacilityId = ((String) strategy.copy(LocatorUtils.property(locator, "programSpecificFacilityId", sourceProgramSpecificFacilityId), sourceProgramSpecificFacilityId, this.isSetProgramSpecificFacilityId()));
                    copy.setProgramSpecificFacilityId(copyProgramSpecificFacilityId);
                } else {
                    if (programSpecificFacilityIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.programSpecificFacilityId = null;
                    }
                }
            }
            {
                Boolean reportingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetReportingStatus());
                if (reportingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ProgramAffiliationType.ReportingStatus> sourceReportingStatus;
                    sourceReportingStatus = (this.isSetReportingStatus()?this.getReportingStatus():null);
                    @SuppressWarnings("unchecked")
                    List<ProgramAffiliationType.ReportingStatus> copyReportingStatus = ((List<ProgramAffiliationType.ReportingStatus> ) strategy.copy(LocatorUtils.property(locator, "reportingStatus", sourceReportingStatus), sourceReportingStatus, this.isSetReportingStatus()));
                    copy.unsetReportingStatus();
                    if (copyReportingStatus!= null) {
                        List<ProgramAffiliationType.ReportingStatus> uniqueReportingStatusl = copy.getReportingStatus();
                        uniqueReportingStatusl.addAll(copyReportingStatus);
                    }
                } else {
                    if (reportingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetReportingStatus();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProgramAffiliationType();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ReportingStatus"/&gt;
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
        "reportingStatus"
    })
    public static class ReportingStatus
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ReportingStatus", required = true)
        protected ReportingStatusType reportingStatus;

        /**
         * Gets the value of the reportingStatus property.
         * 
         * @return
         *     possible object is
         *     {@link ReportingStatusType }
         *     
         */
        public ReportingStatusType getReportingStatus() {
            return reportingStatus;
        }

        /**
         * Sets the value of the reportingStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportingStatusType }
         *     
         */
        public void setReportingStatus(ReportingStatusType value) {
            this.reportingStatus = value;
        }

        public boolean isSetReportingStatus() {
            return (this.reportingStatus!= null);
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
                ReportingStatusType theReportingStatus;
                theReportingStatus = this.getReportingStatus();
                strategy.appendField(locator, this, "reportingStatus", buffer, theReportingStatus, this.isSetReportingStatus());
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
            final ProgramAffiliationType.ReportingStatus that = ((ProgramAffiliationType.ReportingStatus) object);
            {
                ReportingStatusType lhsReportingStatus;
                lhsReportingStatus = this.getReportingStatus();
                ReportingStatusType rhsReportingStatus;
                rhsReportingStatus = that.getReportingStatus();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "reportingStatus", lhsReportingStatus), LocatorUtils.property(thatLocator, "reportingStatus", rhsReportingStatus), lhsReportingStatus, rhsReportingStatus, this.isSetReportingStatus(), that.isSetReportingStatus())) {
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
                ReportingStatusType theReportingStatus;
                theReportingStatus = this.getReportingStatus();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportingStatus", theReportingStatus), currentHashCode, theReportingStatus, this.isSetReportingStatus());
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
            if (draftCopy instanceof ProgramAffiliationType.ReportingStatus) {
                final ProgramAffiliationType.ReportingStatus copy = ((ProgramAffiliationType.ReportingStatus) draftCopy);
                {
                    Boolean reportingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetReportingStatus());
                    if (reportingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                        ReportingStatusType sourceReportingStatus;
                        sourceReportingStatus = this.getReportingStatus();
                        ReportingStatusType copyReportingStatus = ((ReportingStatusType) strategy.copy(LocatorUtils.property(locator, "reportingStatus", sourceReportingStatus), sourceReportingStatus, this.isSetReportingStatus()));
                        copy.setReportingStatus(copyReportingStatus);
                    } else {
                        if (reportingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.reportingStatus = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ProgramAffiliationType.ReportingStatus();
        }

    }

}

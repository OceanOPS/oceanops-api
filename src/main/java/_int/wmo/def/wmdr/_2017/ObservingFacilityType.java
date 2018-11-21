
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for ObservingFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservingFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}AbstractEnvironmentalMonitoringFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilitySet" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="facilityType" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="dateEstablished" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateClosed" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="wmoRegion" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="territory" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}Territory"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="programAffiliation" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}ProgramAffiliation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="climateZone" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}ClimateZone"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="surfaceCover" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}SurfaceCover"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="surfaceRoughness" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}SurfaceRoughness"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="facilityLog" type="{http://def.wmo.int/wmdr/2017}FacilityLogPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="topographyBathymetry" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/wmdr/2017}TopographyBathymetry"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="observation" type="{http://def.wmo.int/wmdr/2017}ObservingCapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="equipment" type="{http://def.wmo.int/wmdr/2017}EquipmentPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservingFacilityType", propOrder = {
    "facilitySet",
    "facilityType",
    "dateEstablished",
    "dateClosed",
    "wmoRegion",
    "territory",
    "programAffiliation",
    "climateZone",
    "surfaceCover",
    "surfaceRoughness",
    "facilityLog",
    "topographyBathymetry",
    "observation",
    "equipment"
})
public class ObservingFacilityType
    extends AbstractEnvironmentalMonitoringFacilityType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected List<ReferenceType> facilitySet;
    protected ReferenceType facilityType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEstablished;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateClosed;
    @XmlElement(required = true)
    protected ReferenceType wmoRegion;
    @XmlElement(required = true)
    protected List<ObservingFacilityType.Territory> territory;
    @XmlElement(required = true)
    protected List<ObservingFacilityType.ProgramAffiliation> programAffiliation;
    protected List<ObservingFacilityType.ClimateZone> climateZone;
    protected List<ObservingFacilityType.SurfaceCover> surfaceCover;
    protected List<ObservingFacilityType.SurfaceRoughness> surfaceRoughness;
    protected FacilityLogPropertyType facilityLog;
    protected List<ObservingFacilityType.TopographyBathymetry> topographyBathymetry;
    protected List<ObservingCapabilityPropertyType> observation;
    protected List<EquipmentPropertyType> equipment;

    /**
     * Gets the value of the facilitySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilitySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilitySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getFacilitySet() {
        if (facilitySet == null) {
            facilitySet = new ArrayList<ReferenceType>();
        }
        return this.facilitySet;
    }

    public boolean isSetFacilitySet() {
        return ((this.facilitySet!= null)&&(!this.facilitySet.isEmpty()));
    }

    public void unsetFacilitySet() {
        this.facilitySet = null;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFacilityType(ReferenceType value) {
        this.facilityType = value;
    }

    public boolean isSetFacilityType() {
        return (this.facilityType!= null);
    }

    /**
     * Gets the value of the dateEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEstablished() {
        return dateEstablished;
    }

    /**
     * Sets the value of the dateEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEstablished(XMLGregorianCalendar value) {
        this.dateEstablished = value;
    }

    public boolean isSetDateEstablished() {
        return (this.dateEstablished!= null);
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClosed() {
        return dateClosed;
    }

    /**
     * Sets the value of the dateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClosed(XMLGregorianCalendar value) {
        this.dateClosed = value;
    }

    public boolean isSetDateClosed() {
        return (this.dateClosed!= null);
    }

    /**
     * Gets the value of the wmoRegion property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getWmoRegion() {
        return wmoRegion;
    }

    /**
     * Sets the value of the wmoRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setWmoRegion(ReferenceType value) {
        this.wmoRegion = value;
    }

    public boolean isSetWmoRegion() {
        return (this.wmoRegion!= null);
    }

    /**
     * Gets the value of the territory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingFacilityType.Territory }
     * 
     * 
     */
    public List<ObservingFacilityType.Territory> getTerritory() {
        if (territory == null) {
            territory = new ArrayList<ObservingFacilityType.Territory>();
        }
        return this.territory;
    }

    public boolean isSetTerritory() {
        return ((this.territory!= null)&&(!this.territory.isEmpty()));
    }

    public void unsetTerritory() {
        this.territory = null;
    }

    /**
     * Gets the value of the programAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingFacilityType.ProgramAffiliation }
     * 
     * 
     */
    public List<ObservingFacilityType.ProgramAffiliation> getProgramAffiliation() {
        if (programAffiliation == null) {
            programAffiliation = new ArrayList<ObservingFacilityType.ProgramAffiliation>();
        }
        return this.programAffiliation;
    }

    public boolean isSetProgramAffiliation() {
        return ((this.programAffiliation!= null)&&(!this.programAffiliation.isEmpty()));
    }

    public void unsetProgramAffiliation() {
        this.programAffiliation = null;
    }

    /**
     * Gets the value of the climateZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingFacilityType.ClimateZone }
     * 
     * 
     */
    public List<ObservingFacilityType.ClimateZone> getClimateZone() {
        if (climateZone == null) {
            climateZone = new ArrayList<ObservingFacilityType.ClimateZone>();
        }
        return this.climateZone;
    }

    public boolean isSetClimateZone() {
        return ((this.climateZone!= null)&&(!this.climateZone.isEmpty()));
    }

    public void unsetClimateZone() {
        this.climateZone = null;
    }

    /**
     * Gets the value of the surfaceCover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceCover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceCover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingFacilityType.SurfaceCover }
     * 
     * 
     */
    public List<ObservingFacilityType.SurfaceCover> getSurfaceCover() {
        if (surfaceCover == null) {
            surfaceCover = new ArrayList<ObservingFacilityType.SurfaceCover>();
        }
        return this.surfaceCover;
    }

    public boolean isSetSurfaceCover() {
        return ((this.surfaceCover!= null)&&(!this.surfaceCover.isEmpty()));
    }

    public void unsetSurfaceCover() {
        this.surfaceCover = null;
    }

    /**
     * Gets the value of the surfaceRoughness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceRoughness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceRoughness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingFacilityType.SurfaceRoughness }
     * 
     * 
     */
    public List<ObservingFacilityType.SurfaceRoughness> getSurfaceRoughness() {
        if (surfaceRoughness == null) {
            surfaceRoughness = new ArrayList<ObservingFacilityType.SurfaceRoughness>();
        }
        return this.surfaceRoughness;
    }

    public boolean isSetSurfaceRoughness() {
        return ((this.surfaceRoughness!= null)&&(!this.surfaceRoughness.isEmpty()));
    }

    public void unsetSurfaceRoughness() {
        this.surfaceRoughness = null;
    }

    /**
     * Gets the value of the facilityLog property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLogPropertyType }
     *     
     */
    public FacilityLogPropertyType getFacilityLog() {
        return facilityLog;
    }

    /**
     * Sets the value of the facilityLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLogPropertyType }
     *     
     */
    public void setFacilityLog(FacilityLogPropertyType value) {
        this.facilityLog = value;
    }

    public boolean isSetFacilityLog() {
        return (this.facilityLog!= null);
    }

    /**
     * Gets the value of the topographyBathymetry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topographyBathymetry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopographyBathymetry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingFacilityType.TopographyBathymetry }
     * 
     * 
     */
    public List<ObservingFacilityType.TopographyBathymetry> getTopographyBathymetry() {
        if (topographyBathymetry == null) {
            topographyBathymetry = new ArrayList<ObservingFacilityType.TopographyBathymetry>();
        }
        return this.topographyBathymetry;
    }

    public boolean isSetTopographyBathymetry() {
        return ((this.topographyBathymetry!= null)&&(!this.topographyBathymetry.isEmpty()));
    }

    public void unsetTopographyBathymetry() {
        this.topographyBathymetry = null;
    }

    /**
     * Gets the value of the observation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservingCapabilityPropertyType }
     * 
     * 
     */
    public List<ObservingCapabilityPropertyType> getObservation() {
        if (observation == null) {
            observation = new ArrayList<ObservingCapabilityPropertyType>();
        }
        return this.observation;
    }

    public boolean isSetObservation() {
        return ((this.observation!= null)&&(!this.observation.isEmpty()));
    }

    public void unsetObservation() {
        this.observation = null;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentPropertyType }
     * 
     * 
     */
    public List<EquipmentPropertyType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<EquipmentPropertyType>();
        }
        return this.equipment;
    }

    public boolean isSetEquipment() {
        return ((this.equipment!= null)&&(!this.equipment.isEmpty()));
    }

    public void unsetEquipment() {
        this.equipment = null;
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
            List<ReferenceType> theFacilitySet;
            theFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
            strategy.appendField(locator, this, "facilitySet", buffer, theFacilitySet, this.isSetFacilitySet());
        }
        {
            ReferenceType theFacilityType;
            theFacilityType = this.getFacilityType();
            strategy.appendField(locator, this, "facilityType", buffer, theFacilityType, this.isSetFacilityType());
        }
        {
            XMLGregorianCalendar theDateEstablished;
            theDateEstablished = this.getDateEstablished();
            strategy.appendField(locator, this, "dateEstablished", buffer, theDateEstablished, this.isSetDateEstablished());
        }
        {
            XMLGregorianCalendar theDateClosed;
            theDateClosed = this.getDateClosed();
            strategy.appendField(locator, this, "dateClosed", buffer, theDateClosed, this.isSetDateClosed());
        }
        {
            ReferenceType theWmoRegion;
            theWmoRegion = this.getWmoRegion();
            strategy.appendField(locator, this, "wmoRegion", buffer, theWmoRegion, this.isSetWmoRegion());
        }
        {
            List<ObservingFacilityType.Territory> theTerritory;
            theTerritory = (this.isSetTerritory()?this.getTerritory():null);
            strategy.appendField(locator, this, "territory", buffer, theTerritory, this.isSetTerritory());
        }
        {
            List<ObservingFacilityType.ProgramAffiliation> theProgramAffiliation;
            theProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
            strategy.appendField(locator, this, "programAffiliation", buffer, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            List<ObservingFacilityType.ClimateZone> theClimateZone;
            theClimateZone = (this.isSetClimateZone()?this.getClimateZone():null);
            strategy.appendField(locator, this, "climateZone", buffer, theClimateZone, this.isSetClimateZone());
        }
        {
            List<ObservingFacilityType.SurfaceCover> theSurfaceCover;
            theSurfaceCover = (this.isSetSurfaceCover()?this.getSurfaceCover():null);
            strategy.appendField(locator, this, "surfaceCover", buffer, theSurfaceCover, this.isSetSurfaceCover());
        }
        {
            List<ObservingFacilityType.SurfaceRoughness> theSurfaceRoughness;
            theSurfaceRoughness = (this.isSetSurfaceRoughness()?this.getSurfaceRoughness():null);
            strategy.appendField(locator, this, "surfaceRoughness", buffer, theSurfaceRoughness, this.isSetSurfaceRoughness());
        }
        {
            FacilityLogPropertyType theFacilityLog;
            theFacilityLog = this.getFacilityLog();
            strategy.appendField(locator, this, "facilityLog", buffer, theFacilityLog, this.isSetFacilityLog());
        }
        {
            List<ObservingFacilityType.TopographyBathymetry> theTopographyBathymetry;
            theTopographyBathymetry = (this.isSetTopographyBathymetry()?this.getTopographyBathymetry():null);
            strategy.appendField(locator, this, "topographyBathymetry", buffer, theTopographyBathymetry, this.isSetTopographyBathymetry());
        }
        {
            List<ObservingCapabilityPropertyType> theObservation;
            theObservation = (this.isSetObservation()?this.getObservation():null);
            strategy.appendField(locator, this, "observation", buffer, theObservation, this.isSetObservation());
        }
        {
            List<EquipmentPropertyType> theEquipment;
            theEquipment = (this.isSetEquipment()?this.getEquipment():null);
            strategy.appendField(locator, this, "equipment", buffer, theEquipment, this.isSetEquipment());
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
        final ObservingFacilityType that = ((ObservingFacilityType) object);
        {
            List<ReferenceType> lhsFacilitySet;
            lhsFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
            List<ReferenceType> rhsFacilitySet;
            rhsFacilitySet = (that.isSetFacilitySet()?that.getFacilitySet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilitySet", lhsFacilitySet), LocatorUtils.property(thatLocator, "facilitySet", rhsFacilitySet), lhsFacilitySet, rhsFacilitySet, this.isSetFacilitySet(), that.isSetFacilitySet())) {
                return false;
            }
        }
        {
            ReferenceType lhsFacilityType;
            lhsFacilityType = this.getFacilityType();
            ReferenceType rhsFacilityType;
            rhsFacilityType = that.getFacilityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityType", lhsFacilityType), LocatorUtils.property(thatLocator, "facilityType", rhsFacilityType), lhsFacilityType, rhsFacilityType, this.isSetFacilityType(), that.isSetFacilityType())) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDateEstablished;
            lhsDateEstablished = this.getDateEstablished();
            XMLGregorianCalendar rhsDateEstablished;
            rhsDateEstablished = that.getDateEstablished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateEstablished", lhsDateEstablished), LocatorUtils.property(thatLocator, "dateEstablished", rhsDateEstablished), lhsDateEstablished, rhsDateEstablished, this.isSetDateEstablished(), that.isSetDateEstablished())) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDateClosed;
            lhsDateClosed = this.getDateClosed();
            XMLGregorianCalendar rhsDateClosed;
            rhsDateClosed = that.getDateClosed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateClosed", lhsDateClosed), LocatorUtils.property(thatLocator, "dateClosed", rhsDateClosed), lhsDateClosed, rhsDateClosed, this.isSetDateClosed(), that.isSetDateClosed())) {
                return false;
            }
        }
        {
            ReferenceType lhsWmoRegion;
            lhsWmoRegion = this.getWmoRegion();
            ReferenceType rhsWmoRegion;
            rhsWmoRegion = that.getWmoRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wmoRegion", lhsWmoRegion), LocatorUtils.property(thatLocator, "wmoRegion", rhsWmoRegion), lhsWmoRegion, rhsWmoRegion, this.isSetWmoRegion(), that.isSetWmoRegion())) {
                return false;
            }
        }
        {
            List<ObservingFacilityType.Territory> lhsTerritory;
            lhsTerritory = (this.isSetTerritory()?this.getTerritory():null);
            List<ObservingFacilityType.Territory> rhsTerritory;
            rhsTerritory = (that.isSetTerritory()?that.getTerritory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "territory", lhsTerritory), LocatorUtils.property(thatLocator, "territory", rhsTerritory), lhsTerritory, rhsTerritory, this.isSetTerritory(), that.isSetTerritory())) {
                return false;
            }
        }
        {
            List<ObservingFacilityType.ProgramAffiliation> lhsProgramAffiliation;
            lhsProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
            List<ObservingFacilityType.ProgramAffiliation> rhsProgramAffiliation;
            rhsProgramAffiliation = (that.isSetProgramAffiliation()?that.getProgramAffiliation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programAffiliation", lhsProgramAffiliation), LocatorUtils.property(thatLocator, "programAffiliation", rhsProgramAffiliation), lhsProgramAffiliation, rhsProgramAffiliation, this.isSetProgramAffiliation(), that.isSetProgramAffiliation())) {
                return false;
            }
        }
        {
            List<ObservingFacilityType.ClimateZone> lhsClimateZone;
            lhsClimateZone = (this.isSetClimateZone()?this.getClimateZone():null);
            List<ObservingFacilityType.ClimateZone> rhsClimateZone;
            rhsClimateZone = (that.isSetClimateZone()?that.getClimateZone():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "climateZone", lhsClimateZone), LocatorUtils.property(thatLocator, "climateZone", rhsClimateZone), lhsClimateZone, rhsClimateZone, this.isSetClimateZone(), that.isSetClimateZone())) {
                return false;
            }
        }
        {
            List<ObservingFacilityType.SurfaceCover> lhsSurfaceCover;
            lhsSurfaceCover = (this.isSetSurfaceCover()?this.getSurfaceCover():null);
            List<ObservingFacilityType.SurfaceCover> rhsSurfaceCover;
            rhsSurfaceCover = (that.isSetSurfaceCover()?that.getSurfaceCover():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceCover", lhsSurfaceCover), LocatorUtils.property(thatLocator, "surfaceCover", rhsSurfaceCover), lhsSurfaceCover, rhsSurfaceCover, this.isSetSurfaceCover(), that.isSetSurfaceCover())) {
                return false;
            }
        }
        {
            List<ObservingFacilityType.SurfaceRoughness> lhsSurfaceRoughness;
            lhsSurfaceRoughness = (this.isSetSurfaceRoughness()?this.getSurfaceRoughness():null);
            List<ObservingFacilityType.SurfaceRoughness> rhsSurfaceRoughness;
            rhsSurfaceRoughness = (that.isSetSurfaceRoughness()?that.getSurfaceRoughness():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceRoughness", lhsSurfaceRoughness), LocatorUtils.property(thatLocator, "surfaceRoughness", rhsSurfaceRoughness), lhsSurfaceRoughness, rhsSurfaceRoughness, this.isSetSurfaceRoughness(), that.isSetSurfaceRoughness())) {
                return false;
            }
        }
        {
            FacilityLogPropertyType lhsFacilityLog;
            lhsFacilityLog = this.getFacilityLog();
            FacilityLogPropertyType rhsFacilityLog;
            rhsFacilityLog = that.getFacilityLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityLog", lhsFacilityLog), LocatorUtils.property(thatLocator, "facilityLog", rhsFacilityLog), lhsFacilityLog, rhsFacilityLog, this.isSetFacilityLog(), that.isSetFacilityLog())) {
                return false;
            }
        }
        {
            List<ObservingFacilityType.TopographyBathymetry> lhsTopographyBathymetry;
            lhsTopographyBathymetry = (this.isSetTopographyBathymetry()?this.getTopographyBathymetry():null);
            List<ObservingFacilityType.TopographyBathymetry> rhsTopographyBathymetry;
            rhsTopographyBathymetry = (that.isSetTopographyBathymetry()?that.getTopographyBathymetry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topographyBathymetry", lhsTopographyBathymetry), LocatorUtils.property(thatLocator, "topographyBathymetry", rhsTopographyBathymetry), lhsTopographyBathymetry, rhsTopographyBathymetry, this.isSetTopographyBathymetry(), that.isSetTopographyBathymetry())) {
                return false;
            }
        }
        {
            List<ObservingCapabilityPropertyType> lhsObservation;
            lhsObservation = (this.isSetObservation()?this.getObservation():null);
            List<ObservingCapabilityPropertyType> rhsObservation;
            rhsObservation = (that.isSetObservation()?that.getObservation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "observation", lhsObservation), LocatorUtils.property(thatLocator, "observation", rhsObservation), lhsObservation, rhsObservation, this.isSetObservation(), that.isSetObservation())) {
                return false;
            }
        }
        {
            List<EquipmentPropertyType> lhsEquipment;
            lhsEquipment = (this.isSetEquipment()?this.getEquipment():null);
            List<EquipmentPropertyType> rhsEquipment;
            rhsEquipment = (that.isSetEquipment()?that.getEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipment", lhsEquipment), LocatorUtils.property(thatLocator, "equipment", rhsEquipment), lhsEquipment, rhsEquipment, this.isSetEquipment(), that.isSetEquipment())) {
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
            List<ReferenceType> theFacilitySet;
            theFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilitySet", theFacilitySet), currentHashCode, theFacilitySet, this.isSetFacilitySet());
        }
        {
            ReferenceType theFacilityType;
            theFacilityType = this.getFacilityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilityType", theFacilityType), currentHashCode, theFacilityType, this.isSetFacilityType());
        }
        {
            XMLGregorianCalendar theDateEstablished;
            theDateEstablished = this.getDateEstablished();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateEstablished", theDateEstablished), currentHashCode, theDateEstablished, this.isSetDateEstablished());
        }
        {
            XMLGregorianCalendar theDateClosed;
            theDateClosed = this.getDateClosed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateClosed", theDateClosed), currentHashCode, theDateClosed, this.isSetDateClosed());
        }
        {
            ReferenceType theWmoRegion;
            theWmoRegion = this.getWmoRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wmoRegion", theWmoRegion), currentHashCode, theWmoRegion, this.isSetWmoRegion());
        }
        {
            List<ObservingFacilityType.Territory> theTerritory;
            theTerritory = (this.isSetTerritory()?this.getTerritory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "territory", theTerritory), currentHashCode, theTerritory, this.isSetTerritory());
        }
        {
            List<ObservingFacilityType.ProgramAffiliation> theProgramAffiliation;
            theProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programAffiliation", theProgramAffiliation), currentHashCode, theProgramAffiliation, this.isSetProgramAffiliation());
        }
        {
            List<ObservingFacilityType.ClimateZone> theClimateZone;
            theClimateZone = (this.isSetClimateZone()?this.getClimateZone():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "climateZone", theClimateZone), currentHashCode, theClimateZone, this.isSetClimateZone());
        }
        {
            List<ObservingFacilityType.SurfaceCover> theSurfaceCover;
            theSurfaceCover = (this.isSetSurfaceCover()?this.getSurfaceCover():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceCover", theSurfaceCover), currentHashCode, theSurfaceCover, this.isSetSurfaceCover());
        }
        {
            List<ObservingFacilityType.SurfaceRoughness> theSurfaceRoughness;
            theSurfaceRoughness = (this.isSetSurfaceRoughness()?this.getSurfaceRoughness():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceRoughness", theSurfaceRoughness), currentHashCode, theSurfaceRoughness, this.isSetSurfaceRoughness());
        }
        {
            FacilityLogPropertyType theFacilityLog;
            theFacilityLog = this.getFacilityLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilityLog", theFacilityLog), currentHashCode, theFacilityLog, this.isSetFacilityLog());
        }
        {
            List<ObservingFacilityType.TopographyBathymetry> theTopographyBathymetry;
            theTopographyBathymetry = (this.isSetTopographyBathymetry()?this.getTopographyBathymetry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topographyBathymetry", theTopographyBathymetry), currentHashCode, theTopographyBathymetry, this.isSetTopographyBathymetry());
        }
        {
            List<ObservingCapabilityPropertyType> theObservation;
            theObservation = (this.isSetObservation()?this.getObservation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "observation", theObservation), currentHashCode, theObservation, this.isSetObservation());
        }
        {
            List<EquipmentPropertyType> theEquipment;
            theEquipment = (this.isSetEquipment()?this.getEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipment", theEquipment), currentHashCode, theEquipment, this.isSetEquipment());
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
        if (draftCopy instanceof ObservingFacilityType) {
            final ObservingFacilityType copy = ((ObservingFacilityType) draftCopy);
            {
                Boolean facilitySetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilitySet());
                if (facilitySetShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ReferenceType> sourceFacilitySet;
                    sourceFacilitySet = (this.isSetFacilitySet()?this.getFacilitySet():null);
                    @SuppressWarnings("unchecked")
                    List<ReferenceType> copyFacilitySet = ((List<ReferenceType> ) strategy.copy(LocatorUtils.property(locator, "facilitySet", sourceFacilitySet), sourceFacilitySet, this.isSetFacilitySet()));
                    copy.unsetFacilitySet();
                    if (copyFacilitySet!= null) {
                        List<ReferenceType> uniqueFacilitySetl = copy.getFacilitySet();
                        uniqueFacilitySetl.addAll(copyFacilitySet);
                    }
                } else {
                    if (facilitySetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFacilitySet();
                    }
                }
            }
            {
                Boolean facilityTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilityType());
                if (facilityTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceFacilityType;
                    sourceFacilityType = this.getFacilityType();
                    ReferenceType copyFacilityType = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "facilityType", sourceFacilityType), sourceFacilityType, this.isSetFacilityType()));
                    copy.setFacilityType(copyFacilityType);
                } else {
                    if (facilityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.facilityType = null;
                    }
                }
            }
            {
                Boolean dateEstablishedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDateEstablished());
                if (dateEstablishedShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceDateEstablished;
                    sourceDateEstablished = this.getDateEstablished();
                    XMLGregorianCalendar copyDateEstablished = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "dateEstablished", sourceDateEstablished), sourceDateEstablished, this.isSetDateEstablished()));
                    copy.setDateEstablished(copyDateEstablished);
                } else {
                    if (dateEstablishedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateEstablished = null;
                    }
                }
            }
            {
                Boolean dateClosedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDateClosed());
                if (dateClosedShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceDateClosed;
                    sourceDateClosed = this.getDateClosed();
                    XMLGregorianCalendar copyDateClosed = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "dateClosed", sourceDateClosed), sourceDateClosed, this.isSetDateClosed()));
                    copy.setDateClosed(copyDateClosed);
                } else {
                    if (dateClosedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateClosed = null;
                    }
                }
            }
            {
                Boolean wmoRegionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetWmoRegion());
                if (wmoRegionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceWmoRegion;
                    sourceWmoRegion = this.getWmoRegion();
                    ReferenceType copyWmoRegion = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "wmoRegion", sourceWmoRegion), sourceWmoRegion, this.isSetWmoRegion()));
                    copy.setWmoRegion(copyWmoRegion);
                } else {
                    if (wmoRegionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wmoRegion = null;
                    }
                }
            }
            {
                Boolean territoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTerritory());
                if (territoryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingFacilityType.Territory> sourceTerritory;
                    sourceTerritory = (this.isSetTerritory()?this.getTerritory():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingFacilityType.Territory> copyTerritory = ((List<ObservingFacilityType.Territory> ) strategy.copy(LocatorUtils.property(locator, "territory", sourceTerritory), sourceTerritory, this.isSetTerritory()));
                    copy.unsetTerritory();
                    if (copyTerritory!= null) {
                        List<ObservingFacilityType.Territory> uniqueTerritoryl = copy.getTerritory();
                        uniqueTerritoryl.addAll(copyTerritory);
                    }
                } else {
                    if (territoryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetTerritory();
                    }
                }
            }
            {
                Boolean programAffiliationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProgramAffiliation());
                if (programAffiliationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingFacilityType.ProgramAffiliation> sourceProgramAffiliation;
                    sourceProgramAffiliation = (this.isSetProgramAffiliation()?this.getProgramAffiliation():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingFacilityType.ProgramAffiliation> copyProgramAffiliation = ((List<ObservingFacilityType.ProgramAffiliation> ) strategy.copy(LocatorUtils.property(locator, "programAffiliation", sourceProgramAffiliation), sourceProgramAffiliation, this.isSetProgramAffiliation()));
                    copy.unsetProgramAffiliation();
                    if (copyProgramAffiliation!= null) {
                        List<ObservingFacilityType.ProgramAffiliation> uniqueProgramAffiliationl = copy.getProgramAffiliation();
                        uniqueProgramAffiliationl.addAll(copyProgramAffiliation);
                    }
                } else {
                    if (programAffiliationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetProgramAffiliation();
                    }
                }
            }
            {
                Boolean climateZoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetClimateZone());
                if (climateZoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingFacilityType.ClimateZone> sourceClimateZone;
                    sourceClimateZone = (this.isSetClimateZone()?this.getClimateZone():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingFacilityType.ClimateZone> copyClimateZone = ((List<ObservingFacilityType.ClimateZone> ) strategy.copy(LocatorUtils.property(locator, "climateZone", sourceClimateZone), sourceClimateZone, this.isSetClimateZone()));
                    copy.unsetClimateZone();
                    if (copyClimateZone!= null) {
                        List<ObservingFacilityType.ClimateZone> uniqueClimateZonel = copy.getClimateZone();
                        uniqueClimateZonel.addAll(copyClimateZone);
                    }
                } else {
                    if (climateZoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetClimateZone();
                    }
                }
            }
            {
                Boolean surfaceCoverShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSurfaceCover());
                if (surfaceCoverShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingFacilityType.SurfaceCover> sourceSurfaceCover;
                    sourceSurfaceCover = (this.isSetSurfaceCover()?this.getSurfaceCover():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingFacilityType.SurfaceCover> copySurfaceCover = ((List<ObservingFacilityType.SurfaceCover> ) strategy.copy(LocatorUtils.property(locator, "surfaceCover", sourceSurfaceCover), sourceSurfaceCover, this.isSetSurfaceCover()));
                    copy.unsetSurfaceCover();
                    if (copySurfaceCover!= null) {
                        List<ObservingFacilityType.SurfaceCover> uniqueSurfaceCoverl = copy.getSurfaceCover();
                        uniqueSurfaceCoverl.addAll(copySurfaceCover);
                    }
                } else {
                    if (surfaceCoverShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetSurfaceCover();
                    }
                }
            }
            {
                Boolean surfaceRoughnessShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSurfaceRoughness());
                if (surfaceRoughnessShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingFacilityType.SurfaceRoughness> sourceSurfaceRoughness;
                    sourceSurfaceRoughness = (this.isSetSurfaceRoughness()?this.getSurfaceRoughness():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingFacilityType.SurfaceRoughness> copySurfaceRoughness = ((List<ObservingFacilityType.SurfaceRoughness> ) strategy.copy(LocatorUtils.property(locator, "surfaceRoughness", sourceSurfaceRoughness), sourceSurfaceRoughness, this.isSetSurfaceRoughness()));
                    copy.unsetSurfaceRoughness();
                    if (copySurfaceRoughness!= null) {
                        List<ObservingFacilityType.SurfaceRoughness> uniqueSurfaceRoughnessl = copy.getSurfaceRoughness();
                        uniqueSurfaceRoughnessl.addAll(copySurfaceRoughness);
                    }
                } else {
                    if (surfaceRoughnessShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetSurfaceRoughness();
                    }
                }
            }
            {
                Boolean facilityLogShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFacilityLog());
                if (facilityLogShouldBeCopiedAndSet == Boolean.TRUE) {
                    FacilityLogPropertyType sourceFacilityLog;
                    sourceFacilityLog = this.getFacilityLog();
                    FacilityLogPropertyType copyFacilityLog = ((FacilityLogPropertyType) strategy.copy(LocatorUtils.property(locator, "facilityLog", sourceFacilityLog), sourceFacilityLog, this.isSetFacilityLog()));
                    copy.setFacilityLog(copyFacilityLog);
                } else {
                    if (facilityLogShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.facilityLog = null;
                    }
                }
            }
            {
                Boolean topographyBathymetryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTopographyBathymetry());
                if (topographyBathymetryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingFacilityType.TopographyBathymetry> sourceTopographyBathymetry;
                    sourceTopographyBathymetry = (this.isSetTopographyBathymetry()?this.getTopographyBathymetry():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingFacilityType.TopographyBathymetry> copyTopographyBathymetry = ((List<ObservingFacilityType.TopographyBathymetry> ) strategy.copy(LocatorUtils.property(locator, "topographyBathymetry", sourceTopographyBathymetry), sourceTopographyBathymetry, this.isSetTopographyBathymetry()));
                    copy.unsetTopographyBathymetry();
                    if (copyTopographyBathymetry!= null) {
                        List<ObservingFacilityType.TopographyBathymetry> uniqueTopographyBathymetryl = copy.getTopographyBathymetry();
                        uniqueTopographyBathymetryl.addAll(copyTopographyBathymetry);
                    }
                } else {
                    if (topographyBathymetryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetTopographyBathymetry();
                    }
                }
            }
            {
                Boolean observationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObservation());
                if (observationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ObservingCapabilityPropertyType> sourceObservation;
                    sourceObservation = (this.isSetObservation()?this.getObservation():null);
                    @SuppressWarnings("unchecked")
                    List<ObservingCapabilityPropertyType> copyObservation = ((List<ObservingCapabilityPropertyType> ) strategy.copy(LocatorUtils.property(locator, "observation", sourceObservation), sourceObservation, this.isSetObservation()));
                    copy.unsetObservation();
                    if (copyObservation!= null) {
                        List<ObservingCapabilityPropertyType> uniqueObservationl = copy.getObservation();
                        uniqueObservationl.addAll(copyObservation);
                    }
                } else {
                    if (observationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetObservation();
                    }
                }
            }
            {
                Boolean equipmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEquipment());
                if (equipmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<EquipmentPropertyType> sourceEquipment;
                    sourceEquipment = (this.isSetEquipment()?this.getEquipment():null);
                    @SuppressWarnings("unchecked")
                    List<EquipmentPropertyType> copyEquipment = ((List<EquipmentPropertyType> ) strategy.copy(LocatorUtils.property(locator, "equipment", sourceEquipment), sourceEquipment, this.isSetEquipment()));
                    copy.unsetEquipment();
                    if (copyEquipment!= null) {
                        List<EquipmentPropertyType> uniqueEquipmentl = copy.getEquipment();
                        uniqueEquipmentl.addAll(copyEquipment);
                    }
                } else {
                    if (equipmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetEquipment();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ObservingFacilityType();
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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ClimateZone"/&gt;
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
        "climateZone"
    })
    public static class ClimateZone
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ClimateZone", required = true)
        protected ClimateZoneType climateZone;

        /**
         * Gets the value of the climateZone property.
         * 
         * @return
         *     possible object is
         *     {@link ClimateZoneType }
         *     
         */
        public ClimateZoneType getClimateZone() {
            return climateZone;
        }

        /**
         * Sets the value of the climateZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClimateZoneType }
         *     
         */
        public void setClimateZone(ClimateZoneType value) {
            this.climateZone = value;
        }

        public boolean isSetClimateZone() {
            return (this.climateZone!= null);
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
                ClimateZoneType theClimateZone;
                theClimateZone = this.getClimateZone();
                strategy.appendField(locator, this, "climateZone", buffer, theClimateZone, this.isSetClimateZone());
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
            final ObservingFacilityType.ClimateZone that = ((ObservingFacilityType.ClimateZone) object);
            {
                ClimateZoneType lhsClimateZone;
                lhsClimateZone = this.getClimateZone();
                ClimateZoneType rhsClimateZone;
                rhsClimateZone = that.getClimateZone();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "climateZone", lhsClimateZone), LocatorUtils.property(thatLocator, "climateZone", rhsClimateZone), lhsClimateZone, rhsClimateZone, this.isSetClimateZone(), that.isSetClimateZone())) {
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
                ClimateZoneType theClimateZone;
                theClimateZone = this.getClimateZone();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "climateZone", theClimateZone), currentHashCode, theClimateZone, this.isSetClimateZone());
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
            if (draftCopy instanceof ObservingFacilityType.ClimateZone) {
                final ObservingFacilityType.ClimateZone copy = ((ObservingFacilityType.ClimateZone) draftCopy);
                {
                    Boolean climateZoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetClimateZone());
                    if (climateZoneShouldBeCopiedAndSet == Boolean.TRUE) {
                        ClimateZoneType sourceClimateZone;
                        sourceClimateZone = this.getClimateZone();
                        ClimateZoneType copyClimateZone = ((ClimateZoneType) strategy.copy(LocatorUtils.property(locator, "climateZone", sourceClimateZone), sourceClimateZone, this.isSetClimateZone()));
                        copy.setClimateZone(copyClimateZone);
                    } else {
                        if (climateZoneShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.climateZone = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ObservingFacilityType.ClimateZone();
        }

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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}ProgramAffiliation"/&gt;
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
        "programAffiliation"
    })
    public static class ProgramAffiliation
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "ProgramAffiliation", required = true)
        protected ProgramAffiliationType programAffiliation;

        /**
         * Gets the value of the programAffiliation property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramAffiliationType }
         *     
         */
        public ProgramAffiliationType getProgramAffiliation() {
            return programAffiliation;
        }

        /**
         * Sets the value of the programAffiliation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramAffiliationType }
         *     
         */
        public void setProgramAffiliation(ProgramAffiliationType value) {
            this.programAffiliation = value;
        }

        public boolean isSetProgramAffiliation() {
            return (this.programAffiliation!= null);
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
                ProgramAffiliationType theProgramAffiliation;
                theProgramAffiliation = this.getProgramAffiliation();
                strategy.appendField(locator, this, "programAffiliation", buffer, theProgramAffiliation, this.isSetProgramAffiliation());
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
            final ObservingFacilityType.ProgramAffiliation that = ((ObservingFacilityType.ProgramAffiliation) object);
            {
                ProgramAffiliationType lhsProgramAffiliation;
                lhsProgramAffiliation = this.getProgramAffiliation();
                ProgramAffiliationType rhsProgramAffiliation;
                rhsProgramAffiliation = that.getProgramAffiliation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "programAffiliation", lhsProgramAffiliation), LocatorUtils.property(thatLocator, "programAffiliation", rhsProgramAffiliation), lhsProgramAffiliation, rhsProgramAffiliation, this.isSetProgramAffiliation(), that.isSetProgramAffiliation())) {
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
                ProgramAffiliationType theProgramAffiliation;
                theProgramAffiliation = this.getProgramAffiliation();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programAffiliation", theProgramAffiliation), currentHashCode, theProgramAffiliation, this.isSetProgramAffiliation());
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
            if (draftCopy instanceof ObservingFacilityType.ProgramAffiliation) {
                final ObservingFacilityType.ProgramAffiliation copy = ((ObservingFacilityType.ProgramAffiliation) draftCopy);
                {
                    Boolean programAffiliationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProgramAffiliation());
                    if (programAffiliationShouldBeCopiedAndSet == Boolean.TRUE) {
                        ProgramAffiliationType sourceProgramAffiliation;
                        sourceProgramAffiliation = this.getProgramAffiliation();
                        ProgramAffiliationType copyProgramAffiliation = ((ProgramAffiliationType) strategy.copy(LocatorUtils.property(locator, "programAffiliation", sourceProgramAffiliation), sourceProgramAffiliation, this.isSetProgramAffiliation()));
                        copy.setProgramAffiliation(copyProgramAffiliation);
                    } else {
                        if (programAffiliationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.programAffiliation = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ObservingFacilityType.ProgramAffiliation();
        }

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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}SurfaceCover"/&gt;
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
        "surfaceCover"
    })
    public static class SurfaceCover
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "SurfaceCover", required = true)
        protected SurfaceCoverType surfaceCover;

        /**
         * Gets the value of the surfaceCover property.
         * 
         * @return
         *     possible object is
         *     {@link SurfaceCoverType }
         *     
         */
        public SurfaceCoverType getSurfaceCover() {
            return surfaceCover;
        }

        /**
         * Sets the value of the surfaceCover property.
         * 
         * @param value
         *     allowed object is
         *     {@link SurfaceCoverType }
         *     
         */
        public void setSurfaceCover(SurfaceCoverType value) {
            this.surfaceCover = value;
        }

        public boolean isSetSurfaceCover() {
            return (this.surfaceCover!= null);
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
                SurfaceCoverType theSurfaceCover;
                theSurfaceCover = this.getSurfaceCover();
                strategy.appendField(locator, this, "surfaceCover", buffer, theSurfaceCover, this.isSetSurfaceCover());
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
            final ObservingFacilityType.SurfaceCover that = ((ObservingFacilityType.SurfaceCover) object);
            {
                SurfaceCoverType lhsSurfaceCover;
                lhsSurfaceCover = this.getSurfaceCover();
                SurfaceCoverType rhsSurfaceCover;
                rhsSurfaceCover = that.getSurfaceCover();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceCover", lhsSurfaceCover), LocatorUtils.property(thatLocator, "surfaceCover", rhsSurfaceCover), lhsSurfaceCover, rhsSurfaceCover, this.isSetSurfaceCover(), that.isSetSurfaceCover())) {
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
                SurfaceCoverType theSurfaceCover;
                theSurfaceCover = this.getSurfaceCover();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceCover", theSurfaceCover), currentHashCode, theSurfaceCover, this.isSetSurfaceCover());
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
            if (draftCopy instanceof ObservingFacilityType.SurfaceCover) {
                final ObservingFacilityType.SurfaceCover copy = ((ObservingFacilityType.SurfaceCover) draftCopy);
                {
                    Boolean surfaceCoverShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSurfaceCover());
                    if (surfaceCoverShouldBeCopiedAndSet == Boolean.TRUE) {
                        SurfaceCoverType sourceSurfaceCover;
                        sourceSurfaceCover = this.getSurfaceCover();
                        SurfaceCoverType copySurfaceCover = ((SurfaceCoverType) strategy.copy(LocatorUtils.property(locator, "surfaceCover", sourceSurfaceCover), sourceSurfaceCover, this.isSetSurfaceCover()));
                        copy.setSurfaceCover(copySurfaceCover);
                    } else {
                        if (surfaceCoverShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.surfaceCover = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ObservingFacilityType.SurfaceCover();
        }

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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}SurfaceRoughness"/&gt;
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
        "surfaceRoughness"
    })
    public static class SurfaceRoughness
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "SurfaceRoughness", required = true)
        protected SurfaceRoughnessType surfaceRoughness;

        /**
         * Gets the value of the surfaceRoughness property.
         * 
         * @return
         *     possible object is
         *     {@link SurfaceRoughnessType }
         *     
         */
        public SurfaceRoughnessType getSurfaceRoughness() {
            return surfaceRoughness;
        }

        /**
         * Sets the value of the surfaceRoughness property.
         * 
         * @param value
         *     allowed object is
         *     {@link SurfaceRoughnessType }
         *     
         */
        public void setSurfaceRoughness(SurfaceRoughnessType value) {
            this.surfaceRoughness = value;
        }

        public boolean isSetSurfaceRoughness() {
            return (this.surfaceRoughness!= null);
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
                SurfaceRoughnessType theSurfaceRoughness;
                theSurfaceRoughness = this.getSurfaceRoughness();
                strategy.appendField(locator, this, "surfaceRoughness", buffer, theSurfaceRoughness, this.isSetSurfaceRoughness());
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
            final ObservingFacilityType.SurfaceRoughness that = ((ObservingFacilityType.SurfaceRoughness) object);
            {
                SurfaceRoughnessType lhsSurfaceRoughness;
                lhsSurfaceRoughness = this.getSurfaceRoughness();
                SurfaceRoughnessType rhsSurfaceRoughness;
                rhsSurfaceRoughness = that.getSurfaceRoughness();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceRoughness", lhsSurfaceRoughness), LocatorUtils.property(thatLocator, "surfaceRoughness", rhsSurfaceRoughness), lhsSurfaceRoughness, rhsSurfaceRoughness, this.isSetSurfaceRoughness(), that.isSetSurfaceRoughness())) {
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
                SurfaceRoughnessType theSurfaceRoughness;
                theSurfaceRoughness = this.getSurfaceRoughness();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceRoughness", theSurfaceRoughness), currentHashCode, theSurfaceRoughness, this.isSetSurfaceRoughness());
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
            if (draftCopy instanceof ObservingFacilityType.SurfaceRoughness) {
                final ObservingFacilityType.SurfaceRoughness copy = ((ObservingFacilityType.SurfaceRoughness) draftCopy);
                {
                    Boolean surfaceRoughnessShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSurfaceRoughness());
                    if (surfaceRoughnessShouldBeCopiedAndSet == Boolean.TRUE) {
                        SurfaceRoughnessType sourceSurfaceRoughness;
                        sourceSurfaceRoughness = this.getSurfaceRoughness();
                        SurfaceRoughnessType copySurfaceRoughness = ((SurfaceRoughnessType) strategy.copy(LocatorUtils.property(locator, "surfaceRoughness", sourceSurfaceRoughness), sourceSurfaceRoughness, this.isSetSurfaceRoughness()));
                        copy.setSurfaceRoughness(copySurfaceRoughness);
                    } else {
                        if (surfaceRoughnessShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.surfaceRoughness = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ObservingFacilityType.SurfaceRoughness();
        }

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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}Territory"/&gt;
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
        "territory"
    })
    public static class Territory
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Territory", required = true)
        protected TerritoryType territory;

        /**
         * Gets the value of the territory property.
         * 
         * @return
         *     possible object is
         *     {@link TerritoryType }
         *     
         */
        public TerritoryType getTerritory() {
            return territory;
        }

        /**
         * Sets the value of the territory property.
         * 
         * @param value
         *     allowed object is
         *     {@link TerritoryType }
         *     
         */
        public void setTerritory(TerritoryType value) {
            this.territory = value;
        }

        public boolean isSetTerritory() {
            return (this.territory!= null);
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
                TerritoryType theTerritory;
                theTerritory = this.getTerritory();
                strategy.appendField(locator, this, "territory", buffer, theTerritory, this.isSetTerritory());
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
            final ObservingFacilityType.Territory that = ((ObservingFacilityType.Territory) object);
            {
                TerritoryType lhsTerritory;
                lhsTerritory = this.getTerritory();
                TerritoryType rhsTerritory;
                rhsTerritory = that.getTerritory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "territory", lhsTerritory), LocatorUtils.property(thatLocator, "territory", rhsTerritory), lhsTerritory, rhsTerritory, this.isSetTerritory(), that.isSetTerritory())) {
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
                TerritoryType theTerritory;
                theTerritory = this.getTerritory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "territory", theTerritory), currentHashCode, theTerritory, this.isSetTerritory());
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
            if (draftCopy instanceof ObservingFacilityType.Territory) {
                final ObservingFacilityType.Territory copy = ((ObservingFacilityType.Territory) draftCopy);
                {
                    Boolean territoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTerritory());
                    if (territoryShouldBeCopiedAndSet == Boolean.TRUE) {
                        TerritoryType sourceTerritory;
                        sourceTerritory = this.getTerritory();
                        TerritoryType copyTerritory = ((TerritoryType) strategy.copy(LocatorUtils.property(locator, "territory", sourceTerritory), sourceTerritory, this.isSetTerritory()));
                        copy.setTerritory(copyTerritory);
                    } else {
                        if (territoryShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.territory = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ObservingFacilityType.Territory();
        }

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
     *         &lt;element ref="{http://def.wmo.int/wmdr/2017}TopographyBathymetry"/&gt;
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
        "topographyBathymetry"
    })
    public static class TopographyBathymetry
        extends AbstractMemberType
        implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "TopographyBathymetry", required = true)
        protected TopographyBathymetryType topographyBathymetry;

        /**
         * Gets the value of the topographyBathymetry property.
         * 
         * @return
         *     possible object is
         *     {@link TopographyBathymetryType }
         *     
         */
        public TopographyBathymetryType getTopographyBathymetry() {
            return topographyBathymetry;
        }

        /**
         * Sets the value of the topographyBathymetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link TopographyBathymetryType }
         *     
         */
        public void setTopographyBathymetry(TopographyBathymetryType value) {
            this.topographyBathymetry = value;
        }

        public boolean isSetTopographyBathymetry() {
            return (this.topographyBathymetry!= null);
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
                TopographyBathymetryType theTopographyBathymetry;
                theTopographyBathymetry = this.getTopographyBathymetry();
                strategy.appendField(locator, this, "topographyBathymetry", buffer, theTopographyBathymetry, this.isSetTopographyBathymetry());
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
            final ObservingFacilityType.TopographyBathymetry that = ((ObservingFacilityType.TopographyBathymetry) object);
            {
                TopographyBathymetryType lhsTopographyBathymetry;
                lhsTopographyBathymetry = this.getTopographyBathymetry();
                TopographyBathymetryType rhsTopographyBathymetry;
                rhsTopographyBathymetry = that.getTopographyBathymetry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "topographyBathymetry", lhsTopographyBathymetry), LocatorUtils.property(thatLocator, "topographyBathymetry", rhsTopographyBathymetry), lhsTopographyBathymetry, rhsTopographyBathymetry, this.isSetTopographyBathymetry(), that.isSetTopographyBathymetry())) {
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
                TopographyBathymetryType theTopographyBathymetry;
                theTopographyBathymetry = this.getTopographyBathymetry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topographyBathymetry", theTopographyBathymetry), currentHashCode, theTopographyBathymetry, this.isSetTopographyBathymetry());
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
            if (draftCopy instanceof ObservingFacilityType.TopographyBathymetry) {
                final ObservingFacilityType.TopographyBathymetry copy = ((ObservingFacilityType.TopographyBathymetry) draftCopy);
                {
                    Boolean topographyBathymetryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTopographyBathymetry());
                    if (topographyBathymetryShouldBeCopiedAndSet == Boolean.TRUE) {
                        TopographyBathymetryType sourceTopographyBathymetry;
                        sourceTopographyBathymetry = this.getTopographyBathymetry();
                        TopographyBathymetryType copyTopographyBathymetry = ((TopographyBathymetryType) strategy.copy(LocatorUtils.property(locator, "topographyBathymetry", sourceTopographyBathymetry), sourceTopographyBathymetry, this.isSetTopographyBathymetry()));
                        copy.setTopographyBathymetry(copyTopographyBathymetry);
                    } else {
                        if (topographyBathymetryShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.topographyBathymetry = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ObservingFacilityType.TopographyBathymetry();
        }

    }

}

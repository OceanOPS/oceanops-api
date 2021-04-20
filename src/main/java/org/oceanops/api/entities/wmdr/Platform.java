/**
 * 
 */
package org.oceanops.api.entities.wmdr;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.oceanops.api.Utils;
import org.oceanops.api.orm.Agency;
import org.oceanops.api.orm.NetworkPtf;
import org.oceanops.api.orm.ProgramAgency;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.PtfPtfStatus;
import org.oceanops.api.orm.PtfVariable;
import org.oceanops.api.orm.SensorModel;
import org.oceanops.api.orm.Variable;
import org.oceanops.api.orm.Weblink;
import org.oceanops.api.orm.Wmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType;
import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation;
import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType.OnlineResource;
import _int.wmo.def.wmdr._2017.DataGenerationPropertyType;
import _int.wmo.def.wmdr._2017.DeploymentPropertyType;
import _int.wmo.def.wmdr._2017.DeploymentType;
import _int.wmo.def.wmdr._2017.EquipmentPropertyType;
import _int.wmo.def.wmdr._2017.EquipmentType;
import _int.wmo.def.wmdr._2017.GeospatialLocationType;
import _int.wmo.def.wmdr._2017.HeaderType;
import _int.wmo.def.wmdr._2017.ObservingCapabilityPropertyType;
import _int.wmo.def.wmdr._2017.ObservingCapabilityType;
import _int.wmo.def.wmdr._2017.ObservingFacilityType;
import _int.wmo.def.wmdr._2017.ObservingFacilityType.ProgramAffiliation;
import _int.wmo.def.wmdr._2017.ObservingFacilityType.Territory;
import _int.wmo.def.wmdr._2017.ProcessType;
import _int.wmo.def.wmdr._2017.ProgramAffiliationType;
import _int.wmo.def.wmdr._2017.ProgramAffiliationType.ReportingStatus;
import _int.wmo.def.wmdr._2017.ReportingStatusType;
import _int.wmo.def.wmdr._2017.ResponsiblePartyType;
import _int.wmo.def.wmdr._2017.TerritoryType;
import _int.wmo.def.wmdr._2017.WIGOSMetadataRecordType;
import net.opengis.gml.v_3_2.CodeType;
import net.opengis.gml.v_3_2.CodeWithAuthorityType;
import net.opengis.gml.v_3_2.DirectPositionType;
import net.opengis.gml.v_3_2.GeometryPropertyType;
import net.opengis.gml.v_3_2.MeasureType;
import net.opengis.gml.v_3_2.PointType;
import net.opengis.gml.v_3_2.ReferenceType;
import net.opengis.gml.v_3_2.StringOrRefType;
import net.opengis.gml.v_3_2.TimePeriodPropertyType;
import net.opengis.gml.v_3_2.TimePeriodType;
import net.opengis.gml.v_3_2.TimePositionType;
import net.opengis.iso19139.gco.v_20070417.CharacterStringPropertyType;
import net.opengis.iso19139.gco.v_20070417.CodeListValueType;
import net.opengis.iso19139.gmd.v_20070417.CIAddressPropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIAddressType;
import net.opengis.iso19139.gmd.v_20070417.CIContactPropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIContactType;
import net.opengis.iso19139.gmd.v_20070417.CIOnlineResourcePropertyType;
import net.opengis.iso19139.gmd.v_20070417.CIOnlineResourceType;
import net.opengis.iso19139.gmd.v_20070417.CIResponsiblePartyType;
import net.opengis.iso19139.gmd.v_20070417.CIRoleCodePropertyType;
import net.opengis.iso19139.gmd.v_20070417.CITelephonePropertyType;
import net.opengis.iso19139.gmd.v_20070417.CITelephoneType;
import net.opengis.iso19139.gmd.v_20070417.DQElementPropertyType;
import net.opengis.iso19139.gmd.v_20070417.URLPropertyType;
import net.opengis.om.v_2_0.OMObservationPropertyType;
import net.opengis.om.v_2_0.OMObservationType;
import net.opengis.om.v_2_0.OMProcessPropertyType;
import net.opengis.om.v_2_0.TimeObjectPropertyType;

/**
 * @author Anthonin Lizé
 *
 *         Main class respresenting a XML WIGOS Metadata Record.
 */
public class Platform {
	private ObjectContext cayenneContext;
	private JAXBContext jaxbContext;
	private _int.wmo.def.wmdr._2017.ObjectFactory wmdrOF;
	//private _int.wmo.def.opm._2013.ObjectFactory opmOF;
	//private _int.wmo.def.metce._2013.ObjectFactory metceOF;
	//private net.opengis.sampling.v_2_0.ObjectFactory samOF;
	//private net.opengis.samplingspatial.v_2_0.ObjectFactory samsOF;
	private net.opengis.om.v_2_0.ObjectFactory omOF;
	private net.opengis.gml.v_3_2.ObjectFactory gmlOF;
	private WIGOSMetadataRecordType rootElementType;
	private JAXBElement<WIGOSMetadataRecordType> rootElement;
	private net.opengis.iso19139.gmd.v_20070417.ObjectFactory gmdOF;
	private net.opengis.iso19139.gco.v_20070417.ObjectFactory gcoOF;

	private Integer ciResponsiblePartyCounter = 0;
	private final Logger logger = LoggerFactory.getLogger(Platform.class);


	/**
	 * Builds the final WIGOS identifier, based on the platform reference.
	 * 
	 * @param ptfRef String Platform's reference
	 * @return String The full WIGOS identifier
	 */
	private String getWIGOSIdentifier(Ptf ptf) {

		return ptf.getPtfIdentifiers().getWigosRef();
	}

	/**
	 * Constructor of this class. Initializes all the context variables. Should not be used directly.
	 * 
	 * @throws JAXBException
	 */
	public Platform() throws JAXBException {
		this.cayenneContext = Utils.getCayenneContext();
		this.jaxbContext = JAXBContext.newInstance("_int.wmo.def.wmdr._2017:_int.wmo.def.metce._2013:_int.wmo.def.opm._2013:net.opengis.gml.v_3_2:net.opengis.om.v_2_0:net.opengis.sampling.v_2_0:net.opengis.samplingspatial.v_2_0");
		this.wmdrOF = new _int.wmo.def.wmdr._2017.ObjectFactory();
		//this.opmOF = new _int.wmo.def.opm._2013.ObjectFactory();
		//this.metceOF = new _int.wmo.def.metce._2013.ObjectFactory();
		//this.samOF = new net.opengis.sampling.v_2_0.ObjectFactory();
		//this.samsOF = new net.opengis.samplingspatial.v_2_0.ObjectFactory();
		this.omOF = new net.opengis.om.v_2_0.ObjectFactory();
		this.gmlOF = new net.opengis.gml.v_3_2.ObjectFactory();
		this.gmdOF = new net.opengis.iso19139.gmd.v_20070417.ObjectFactory();
		this.gcoOF = new net.opengis.iso19139.gco.v_20070417.ObjectFactory();

		this.rootElementType = new WIGOSMetadataRecordType();
		this.rootElement = wmdrOF.createWIGOSMetadataRecord(this.rootElementType);
	}

	/**
	 * Main constructor of this class. It will instanciate the WMDR for the given platform
	 * 
	 * @param ptf An instance of a platform
	 * 
	 * @throws JAXBException
	 * @throws DatatypeConfigurationException
	 */
	public Platform(Ptf ptf) throws JAXBException, DatatypeConfigurationException {
		this();
		logger.debug("Instanciating Platform WMDR record for ptf_id = " + String.valueOf(ptf.getId()));
		String wigosRef = this.getWIGOSIdentifier(ptf);

		CodeWithAuthorityType identifier = new CodeWithAuthorityType();
		identifier.setValue(wigosRef);
		identifier.setCodeSpace("http://data.wmo.int/");

		StringOrRefType description = new StringOrRefType();
		description.setValue(ptf.getDescription());
		this.rootElementType.setId("record_" + wigosRef);
		this.rootElementType.setDescription(description);
		this.rootElementType.setIdentifier(identifier);
		this.rootElementType.setName(new ArrayList<CodeType>());
		this.rootElementType.setHeaderInformation(this.getHeaderInformation(ptf));
		List<WIGOSMetadataRecordType.Facility> facilities = this.rootElementType.getFacility();
		WIGOSMetadataRecordType.Facility facility = this.wmdrOF.createWIGOSMetadataRecordTypeFacility();
		ObservingFacilityType observingFacilityType = this.getObservingFacilityType(ptf);
		facility.setObservingFacility(observingFacilityType);
		facilities.add(facility);
	}

	/**
	 * Builds a CIResponsiblePartyType object from an agency database identifier and a given role.
	 * 
	 * @param agencyId The agency database identifier
	 * @param ciRoleCode The role of this responsible party
	 * @return the CIResponsiblePartyType representation of this agency
	 */
	private CIResponsiblePartyType getCIResponsibleParty(Integer agencyId, String ciRoleCode) {
		ciResponsiblePartyCounter++;
		CIResponsiblePartyType responsibleParty = new CIResponsiblePartyType();
		Agency agency;
		if (agencyId != null) {
			agency = Cayenne.objectForPK(this.cayenneContext, Agency.class, agencyId);
		} else {
			agencyId = Utils.OCEANOPS_AGENCY_ID;
			agency = Cayenne.objectForPK(this.cayenneContext, Agency.class, Utils.OCEANOPS_AGENCY_ID);
		}

		responsibleParty.setId("responsibleparty-" + agencyId.toString() + "-" + ciResponsiblePartyCounter.toString());
		if (agency.getRef() != null)
			responsibleParty.setUuid(agency.getRef());

		CharacterStringPropertyType organisationName = this.gcoOF.createCharacterStringPropertyType();
		organisationName.setCharacterString(this.gcoOF.createCharacterString(agency.getNameShort()));
		CIContactPropertyType contactInfo = this.gmdOF.createCIContactPropertyType();
		CIContactType contact = this.gmdOF.createCIContactType();
		ArrayList<CharacterStringPropertyType> list = new ArrayList<CharacterStringPropertyType>();
		CharacterStringPropertyType value;
		CITelephonePropertyType phoneProperty = this.gmdOF.createCITelephonePropertyType();
		CITelephoneType phone = this.gmdOF.createCITelephoneType();
		CIAddressPropertyType addressProperty = this.gmdOF.createCIAddressPropertyType();
		CIAddressType address = this.gmdOF.createCIAddressType();
		if (agency.getTel() != null) {
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getTel()));
			list.add(value);
			phone.setVoice(list);
			phoneProperty.setCITelephone(phone);
		}
		if (agency.getAddress() != null) {
			list.clear();
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getAddress().replaceAll("<br />|<br>", " - ").replaceAll("\\<.*?>", "")));
			list.add(value);
			address.setDeliveryPoint(list);
		}
		if (agency.getEmail() != null) {
			list.clear();
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getEmail()));
			list.add(value);
			address.setElectronicMailAddress(list);
		}
		if (agency.getCountry() != null) {
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getCountry().getCode3()));
			// Exception for international agencies
			if (agencyId == Utils.OCEANOPS_AGENCY_ID || agencyId == 1000540) // OceanOPS, EuroArgo
				value.setCharacterString(this.gcoOF.createCharacterString("FRA"));
			else if (agencyId == 14300) // EUMETNET
				value.setCharacterString(this.gcoOF.createCharacterString("BEL"));
			else if (agencyId == 14938) // EU-THOR
				value.setCharacterString(this.gcoOF.createCharacterString("DEU"));
			else if (agencyId == 6886 || agencyId == 14666) //  USA				
				value.setCharacterString(this.gcoOF.createCharacterString("USA"));

			address.setCountry(value);
		}

		addressProperty.setCIAddress(address);

		CIOnlineResourcePropertyType onlineRsrcProperty = this.gmdOF.createCIOnlineResourcePropertyType();
		CIOnlineResourceType onlineRsrc = this.gmdOF.createCIOnlineResourceType();
		URLPropertyType urlProperty = this.gmdOF.createURLPropertyType();
		if (agency.getWeblink() != null)
			urlProperty.setURL(agency.getWeblink().getUrl());
		onlineRsrc.setLinkage(urlProperty);
		onlineRsrcProperty.setCIOnlineResource(onlineRsrc);

		contact.setPhone(phoneProperty);
		contact.setAddress(addressProperty);
		contact.setOnlineResource(onlineRsrcProperty);
		contactInfo.setCIContact(contact);

		responsibleParty.setContactInfo(contactInfo);
		responsibleParty.setOrganisationName(organisationName);
		CIRoleCodePropertyType roleCodeProperty = this.gmdOF.createCIRoleCodePropertyType();
		CodeListValueType codeListValue = this.gcoOF.createCodeListValueType();
		codeListValue.setCodeList("http://www.isotc211.org/2005/resources/Codelist/gmxCodelists.xml#CI_RoleCode");
		codeListValue.setCodeListValue(ciRoleCode != null ? ciRoleCode : "pointOfContact");
		roleCodeProperty.setCIRoleCode(codeListValue);
		responsibleParty.setRole(roleCodeProperty);

		return responsibleParty;
	}

	/**
	 * Builds the HeaderInformation object for the given platform.
	 * 
	 * @param ptf The Ptf entity object from which data should be extracted
	 * @return the header information
	 * @throws DatatypeConfigurationException
	 */
	private WIGOSMetadataRecordType.HeaderInformation getHeaderInformation(Ptf ptf) throws DatatypeConfigurationException {
		WIGOSMetadataRecordType.HeaderInformation headerInfo = new WIGOSMetadataRecordType.HeaderInformation();
		HeaderType headerType = new HeaderType();

		HeaderType.RecordOwner recordOwner = this.wmdrOF.createHeaderTypeRecordOwner();

		recordOwner.setCIResponsibleParty(this.getCIResponsibleParty(Utils.OCEANOPS_AGENCY_ID, "custodian"));

		headerType.setRecordOwner(recordOwner);
		headerType.setFileDateTime(Utils.getDateAsXmlGregCal(ptf.getUpdateDate()));

		headerInfo.setHeader(headerType);

		return headerInfo;
	}
	/**
	 * Builds the SubEquipement list for the given platform. This correspond to the SensorModel database entity.
	 * 
	 * @param ptf The Ptf entity object from which data should be extracted
	 * @return the Equipement list
	 */
	@SuppressWarnings("unused")
	private List<EquipmentPropertyType> getSubEquipements(Ptf ptf) {
		List<PtfVariable> ptfVariables = ptf.getPtfVariables();
		ArrayList<EquipmentPropertyType> equipements = new ArrayList<>();

		EquipmentPropertyType currentEquipment;
		int sensorIncrement = 0;
		for (PtfVariable pv : ptfVariables) {
			if(pv.getSensorModel() != null && pv.getVariable().getWigosCode() != null){
				currentEquipment = this. getEquipmentPropertyType(pv, sensorIncrement);
				equipements.add(currentEquipment);
			}
		}

		return equipements;
	}

	private EquipmentPropertyType getEquipmentPropertyType(PtfVariable ptfV, int increment) {
		Variable variable = ptfV.getVariable();
		EquipmentPropertyType currentEquipment;
		EquipmentType currentEquipmentType;
		SensorModel sm = ptfV.getSensorModel();
		currentEquipment = this.wmdrOF.createEquipmentPropertyType();
		currentEquipmentType = this.wmdrOF.createEquipmentType();
		String id;
		if (increment == 0)
			id = "subequipment-" + ptfV.getObjectId().getIdSnapshot().get("ID").toString();
		else
			id = "subequipment-" + ptfV.getObjectId().getIdSnapshot().get("ID").toString() + "-" + String.valueOf(increment);
		currentEquipmentType.setId(id);
		CodeWithAuthorityType code = this.gmlOF.createCodeWithAuthorityType();
		if(variable != null && variable.getWigosCode() != null) {
			code.setCodeSpace("http://codes.wmo.int/wmdr/ObservedVariable/" + variable.getWigosCode());
			code.setValue(variable.getWigosCode());
		}
		else {
			code.setCodeSpace("http://codes.wmo.int/wmdr/ObservedVariable/unknown");
			code.setValue("unknown");
		}
		currentEquipmentType.setIdentifier(code);
		currentEquipmentType.setModel(sm.getName());
		if (sm.getAgency() != null)
			currentEquipmentType.setManufacturer(sm.getAgency().getNameShort());
		else
			currentEquipmentType.setManufacturer("unknown");
		currentEquipmentType.setObservableRange("unknown");
		currentEquipmentType.setSpecifiedAbsoluteUncertainty("unknown");
		currentEquipmentType.setSpecifiedRelativeUncertainty("unknown");
		currentEquipmentType.setDriftPerUnitTime("unknown");
		currentEquipmentType.setObservableRange("unknown");
		StringOrRefType value = new StringOrRefType();
		value.setValue(sm.getDescription());
		currentEquipmentType.setDescription(value);

		currentEquipmentType.setSerialNumber(ptfV.getSerialNo());

		if (sm.getWeblink() != null) {
			OnlineResource or = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeOnlineResource();
			CIOnlineResourceType onlineRsrc = this.gmdOF.createCIOnlineResourceType();
			URLPropertyType urlProperty = this.gmdOF.createURLPropertyType();
			urlProperty.setURL(sm.getWeblink().getUrl());
			onlineRsrc.setLinkage(urlProperty);
			or.setCIOnlineResource(onlineRsrc);
			currentEquipmentType.getOnlineResource().add(or);
			currentEquipmentType.setSpecificationLink(sm.getWeblink().getUrl());
		}
		else {
			currentEquipmentType.setSpecificationLink("unknown");
		}
		

		AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty responsibleParty = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeResponsibleParty();
		ResponsiblePartyType responsiblePartyType = this.wmdrOF.createResponsiblePartyType();
		ResponsiblePartyType.ResponsibleParty rp = this.wmdrOF.createResponsiblePartyTypeResponsibleParty();
		if (sm.getAgency() != null) {
			rp.setCIResponsibleParty(this.getCIResponsibleParty(Integer.parseInt(sm.getAgency().getObjectId().getIdSnapshot().get("ID").toString()), "pointOfContact"));

			currentEquipmentType.setManufacturer(sm.getAgency().getNameShort());
		} else
			rp.setCIResponsibleParty(this.getCIResponsibleParty(null, null));

		responsiblePartyType.setResponsibleParty(rp);
		responsibleParty.setResponsibleParty(responsiblePartyType);
		currentEquipmentType.getResponsibleParty().add(responsibleParty);

		ReferenceType refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/ObservingMethod/" + "341");
		currentEquipmentType.setObservingMethod(refType);

		currentEquipment.setEquipment(currentEquipmentType);

		return currentEquipment;
	}

	/**
	 * Builds the ObservingFacilityType object for the given platform.
	 * @param ptf  The Ptf entity object from which data should be extracted
	 * @return the ObervingFacilityType representation of the platform
	 * @throws DatatypeConfigurationException 
	 */
	private ObservingFacilityType getObservingFacilityType(Ptf ptf) throws DatatypeConfigurationException {
		ObservingFacilityType o = this.wmdrOF.createObservingFacilityType();
		String wigosID = getWIGOSIdentifier(ptf);
		o.setId("_" + wigosID);
		CodeWithAuthorityType value = new CodeWithAuthorityType();
		value.setValue(wigosID);
		value.setCodeSpace("http://data.wmo.int");
		o.setIdentifier(value);
		CodeType name = new CodeType();
		name.setValue(ptf.getRef());
		List<CodeType> nameList = new ArrayList<>();
		nameList.add(name);
		o.setName(nameList);
		StringOrRefType value1 = new StringOrRefType();
		value1.setValue(ptf.getDescription());
		o.setDescription(value1);
		
		List<OnlineResource> onlineResources = o.getOnlineResource();
		OnlineResource or = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeOnlineResource();
		CIOnlineResourceType onlineRsrc = this.gmdOF.createCIOnlineResourceType();
		URLPropertyType urlProperty = this.gmdOF.createURLPropertyType();
		urlProperty.setURL(Utils.getInspectPtfUrl() + ptf.getRef());
		onlineRsrc.setLinkage(urlProperty);
		or.setCIOnlineResource(onlineRsrc);
		onlineResources.add(or);
		
		for(Weblink w : ptf.getWeblinks()){
			or = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeOnlineResource();
			onlineRsrc = this.gmdOF.createCIOnlineResourceType();
			urlProperty = this.gmdOF.createURLPropertyType();
			urlProperty.setURL(w.getUrl());
			onlineRsrc.setLinkage(urlProperty);
			or.setCIOnlineResource(onlineRsrc);
			onlineResources.add(or);
		}
	
		
		// BEGIN - Latest location
		TimePeriodPropertyType timePeriodProperty = new TimePeriodPropertyType();
		TimePeriodType timePeriod = new TimePeriodType();
		TimePositionType timePosition = new TimePositionType();
		ReferenceType refType = this.gmlOF.createReferenceType();
		if(ptf.getLatestObs() != null) {
			List<GeospatialLocation> geospatialLocs = o.getGeospatialLocation();
			GeospatialLocation gsLoc = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeGeospatialLocation();
			GeospatialLocationType gsLocType = this.wmdrOF.createGeospatialLocationType();
	
			timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getLatestObs().getObsDate())));
			timePeriod.setId(o.getId() + "-LatestLocTimePeriod");
			timePeriod.setBeginPosition(timePosition);
			timePeriod.setEndPosition(new TimePositionType());
			timePeriodProperty.setTimePeriod(timePeriod);
			
			PointType geom = new PointType();
			geom.setId(o.getId() + "-LatestLocationGeometry");
			DirectPositionType posType = this.gmlOF.createDirectPositionType();
			ArrayList<Double> coords = new ArrayList<Double>();
			if(ptf.getLatestObs().getLat().doubleValue() == 0.0)
				coords.add(0.0001);
			else
				coords.add(ptf.getLatestObs().getLat().doubleValue());
			if(ptf.getLatestObs().getLon().doubleValue() == 0.0)
				coords.add(0.0001);
			else
				coords.add(ptf.getLatestObs().getLon().doubleValue());
			coords.add(0.0);
			posType.setValue(coords);
			geom.setPos(posType);
			geom.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4979");
	
			GeometryPropertyType geomProperty = new GeometryPropertyType();
			geomProperty.setAbstractGeometry(this.gmlOF.createPoint(geom));
		
			if(ptf.getTrackingSystem() != null)
				refType.setHref("http://codes.wmo.int/common/wmdr/GeopositioningMethod/" + ptf.getTrackingSystem().getWigosCode());
			else
				refType.setHref("http://codes.wmo.int/common/wmdr/GeopositioningMethod/unknown");
			
			gsLocType.setGeopositioningMethod(refType);
			gsLocType.setGeoLocation(geomProperty);
			gsLocType.setValidPeriod(timePeriodProperty);
			
			gsLoc.setGeospatialLocation(gsLocType);
			geospatialLocs.add(gsLoc);
		}
		// END - Latest location
		
		
		AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty responsibleParty = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeResponsibleParty();
		ResponsiblePartyType responsiblePartyType = this.wmdrOF.createResponsiblePartyType();
		ResponsiblePartyType.ResponsibleParty rp = this.wmdrOF.createResponsiblePartyTypeResponsibleParty();
		if(ptf.getProgram().getProgramAgencies().size() > 0){
			Integer agencyID = null;
			for(ProgramAgency prAgency: ptf.getProgram().getProgramAgencies()){
				if(prAgency.getLead().intValue() == 1)
					agencyID = prAgency.getAgency().getId().intValue();
			}
			
			if(agencyID == null)
				rp.setCIResponsibleParty(this.getCIResponsibleParty(ptf.getProgram().getProgramAgencies().get(0).getAgency().getId().intValue(), "pointOfContact"));
			else
				rp.setCIResponsibleParty(this.getCIResponsibleParty(agencyID, "pointOfContact"));
		}
		else
			rp.setCIResponsibleParty(this.getCIResponsibleParty(null, null));
		responsiblePartyType.setResponsibleParty(rp);
		responsibleParty.setResponsibleParty(responsiblePartyType);
		o.getResponsibleParty().add(responsibleParty);

		o.setDateEstablished(Utils.getDateAsXmlGregCal(ptf.getPtfDepl().getDeplDate()));
		
		if(ptf.getEndingDate() != null){
			o.setDateClosed(Utils.getDateAsXmlGregCal(ptf.getEndingDate()));
		}
		
		refType = this.gmlOF.createReferenceType();
		//refType.setHref("http://codes.wmo.int/common/wmdr/WMORegion/");
		o.setWmoRegion(refType);
		
		Territory territory = new Territory();
		TerritoryType territoryType = new TerritoryType();
		refType = this.gmlOF.createReferenceType();
		String country = "inapplicable";
		if(ptf.getProgram().getCountry() != null) {
			if(ptf.getProgram().getCountry().getCode3() != null)
				country = ptf.getProgram().getCountry().getCode3();
		}
		refType.setHref("http://codes.wmo.int/common/wmdr/TerritoryName/" + country);
		territoryType.setTerritoryName(refType);
		territory.setTerritory(territoryType);
		o.getTerritory().add(territory);

		// TODO : check WMO code tables
		
		ProgramAffiliation progAffiliation;
		ProgramAffiliationType progAffiliationType;
		int count = 1;
		for(NetworkPtf netPtf: ptf.getNetworkPtfs()) {
			if(netPtf.getNetwork().getRank().intValue() == 0) {
				progAffiliation = this.wmdrOF.createObservingFacilityTypeProgramAffiliation();
				progAffiliationType = this.wmdrOF.createProgramAffiliationType();
				refType = this.gmlOF.createReferenceType();
				refType.setHref("http://codes.wmo.int/common/wmdr/ProgramAffiliation/" + netPtf.getNetwork().getWigosCode());
				progAffiliationType.setProgramAffiliation(refType);
				ReportingStatus reportingStatus = null;
				ReportingStatusType reportingStatusType = null;
				/*for(PtfPtfStatus ptfPtfStatus: ptf.getPtfPtfStatuses()){
					reportingStatus = this.wmdrOF.createProgramAffiliationTypeReportingStatus();
					reportingStatusType = this.wmdrOF.createReportingStatusType();
					// TODO : check WMO code tables
					refType = new ReferenceType();
					refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + ptfPtfStatus.getPtfStatus().getWigosCode());
					reportingStatusType.setReportingStatus(refType);
					
					timePeriodProperty = new TimePeriodPropertyType();
					timePeriod = new TimePeriodType();
					timePosition = new TimePositionType();
					timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptfPtfStatus.getChangingDate())));
					timePeriod.setId(o.getId() + "-StatusChangingDateTimePeriod-" + count);
					timePeriod.setBeginPosition(timePosition);
					timePeriod.setEndPosition(new TimePositionType());
					timePeriodProperty.setTimePeriod(timePeriod);
					
					reportingStatusType.setValidPeriod(timePeriodProperty);
					reportingStatus.setReportingStatus(reportingStatusType);
					progAffiliationType.getReportingStatus().add(reportingStatus);
					count++;
				}*/
				
				PtfPtfStatus latestStatus = null;
				for(PtfPtfStatus ptfPtfStatus: ptf.getPtfPtfStatuses()){
					if(latestStatus == null || (latestStatus != null && latestStatus.getChangingDate().isBefore(ptfPtfStatus.getChangingDate())))
						latestStatus = ptfPtfStatus;
				}
				reportingStatus = this.wmdrOF.createProgramAffiliationTypeReportingStatus();
				reportingStatusType = this.wmdrOF.createReportingStatusType();
				refType = new ReferenceType();
				//if(latestStatus != null)
				//	refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + latestStatus.getPtfStatus().getWigosCode());
				//else
				refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + ptf.getPtfStatus().getWigosCode());
				reportingStatusType.setReportingStatus(refType);
				
				timePeriodProperty = new TimePeriodPropertyType();
				timePeriod = new TimePeriodType();
				timePosition = new TimePositionType();
				timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getPtfDepl().getDeplDate())));
				timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
				timePeriod.setBeginPosition(timePosition);
				timePosition = new TimePositionType();
				if(ptf.getEndingDate() != null)
					timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate())));
				timePeriod.setEndPosition(new TimePositionType());
				timePeriodProperty.setTimePeriod(timePeriod);
				
				reportingStatusType.setValidPeriod(timePeriodProperty);
				reportingStatus.setReportingStatus(reportingStatusType);
				
				if(netPtf.getNetwork().getId().intValue() == Utils.SOT_NETWORK_ID)
					progAffiliationType.setProgramSpecificFacilityId(ptf.getRef());
				else if(ptf.getLatestWmo() != null)
					progAffiliationType.setProgramSpecificFacilityId(ptf.getLatestWmo());
				
				progAffiliationType.getReportingStatus().add(reportingStatus);
				count++;
				progAffiliation.setProgramAffiliation(progAffiliationType);
				o.getProgramAffiliation().add(progAffiliation);
			}
		}
		List<Wmo> wmos = ptf.getWmos();
		// if several WMOs, ordering
		if(wmos.size() > 0) {
			for(Wmo wmo: wmos) {
				progAffiliation = this.wmdrOF.createObservingFacilityTypeProgramAffiliation();
				progAffiliationType = this.wmdrOF.createProgramAffiliationType();
				refType = this.gmlOF.createReferenceType();
				refType.setHref("http://codes.wmo.int/common/wmdr/ProgramAffiliation/" + ptf.getProgram().getWigosCode());
				progAffiliationType.setProgramAffiliation(refType);
				ReportingStatus reportingStatus = null;
				ReportingStatusType reportingStatusType = null;
				PtfPtfStatus latestStatus = null;
				for(PtfPtfStatus ptfPtfStatus: ptf.getPtfPtfStatuses()){
					if(latestStatus == null || (latestStatus != null && latestStatus.getChangingDate().isBefore(ptfPtfStatus.getChangingDate())))
						latestStatus = ptfPtfStatus;
				}
				reportingStatus = this.wmdrOF.createProgramAffiliationTypeReportingStatus();
				reportingStatusType = this.wmdrOF.createReportingStatusType();
				refType = new ReferenceType();
				//if(latestStatus != null)
				//	refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + latestStatus.getPtfStatus().getWigosCode());
				//else
				refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + ptf.getPtfStatus().getWigosCode());
				reportingStatusType.setReportingStatus(refType);
				
				timePeriodProperty = new TimePeriodPropertyType();
				timePeriod = new TimePeriodType();
				timePosition = new TimePositionType();
				if(wmo.getStartDate()!= null)
					timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(wmo.getStartDate())));
				else
					timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getPtfDepl().getDeplDate())));
				timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
				timePeriod.setBeginPosition(timePosition);

				timePosition = new TimePositionType();
				if(wmo.getEndDate()!= null)
					timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(wmo.getEndDate())));
				else if(ptf.getEndingDate() != null)
					timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate())));
				timePeriod.setEndPosition(timePosition);
				timePeriodProperty.setTimePeriod(timePeriod);
				
				reportingStatusType.setValidPeriod(timePeriodProperty);
				reportingStatus.setReportingStatus(reportingStatusType);
				progAffiliationType.getReportingStatus().add(reportingStatus);
				progAffiliationType.setProgramSpecificFacilityId(wmo.getWmo());
				count++;
				progAffiliation.setProgramAffiliation(progAffiliationType);
				o.getProgramAffiliation().add(progAffiliation);
		
				refType = new ReferenceType();
				refType.setHref("http://codes.wmo.int/common/wmdr/FacilityType/" + ptf.getPtfModel().getPtfType().getWigosCode());
				o.setFacilityType(refType);
			}
		}
		else {
			progAffiliation = this.wmdrOF.createObservingFacilityTypeProgramAffiliation();
			progAffiliationType = this.wmdrOF.createProgramAffiliationType();
			refType = this.gmlOF.createReferenceType();
			refType.setHref("http://codes.wmo.int/common/wmdr/ProgramAffiliation/" + ptf.getProgram().getWigosCode());
			progAffiliationType.setProgramAffiliation(refType);
			ReportingStatus reportingStatus = null;
			ReportingStatusType reportingStatusType = null;
			PtfPtfStatus latestStatus = null;
			for(PtfPtfStatus ptfPtfStatus: ptf.getPtfPtfStatuses()){
				if(latestStatus == null || (latestStatus != null && latestStatus.getChangingDate().isBefore(ptfPtfStatus.getChangingDate())))
					latestStatus = ptfPtfStatus;
			}
			reportingStatus = this.wmdrOF.createProgramAffiliationTypeReportingStatus();
			reportingStatusType = this.wmdrOF.createReportingStatusType();
			refType = new ReferenceType();
			//if(latestStatus != null)
			//	refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + latestStatus.getPtfStatus().getWigosCode());
			//else
			refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/" + ptf.getPtfStatus().getWigosCode());
			reportingStatusType.setReportingStatus(refType);
			
			timePeriodProperty = new TimePeriodPropertyType();
			timePeriod = new TimePeriodType();
			timePosition = new TimePositionType();
			if(latestStatus != null)
				timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(latestStatus.getChangingDate())));
			else
				timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getPtfDepl().getDeplDate())));
			timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
			timePeriod.setBeginPosition(timePosition);
			timePeriod.setEndPosition(new TimePositionType());
			timePeriodProperty.setTimePeriod(timePeriod);
			
			reportingStatusType.setValidPeriod(timePeriodProperty);
			reportingStatus.setReportingStatus(reportingStatusType);
			progAffiliationType.getReportingStatus().add(reportingStatus);
			count++;
			progAffiliation.setProgramAffiliation(progAffiliationType);
			o.getProgramAffiliation().add(progAffiliation);
	
			refType = new ReferenceType();
			refType.setHref("http://codes.wmo.int/common/wmdr/FacilityType/" + ptf.getPtfModel().getPtfType().getWigosCode());
			o.setFacilityType(refType);
		}
				
		/*List<EquipmentPropertyType> equipments = o.getEquipment();
		List<EquipmentPropertyType> equipmentList = this.getSubEquipements(ptf);
		equipments.addAll(equipmentList);*/
		
		// OM_Observations
		List<ObservingCapabilityPropertyType> obss = o.getObservation();
		obss.addAll(this.getObservations(ptf));
				
		return o;
	}

	/**
	 * Builds the OMObservationPropertyType list for the given platform.
	 * 
	 * @param ptf The Ptf entity object from which data should be extracted
	 * @return the OMObservationPropertyType of the platform
	 */
	private List<ObservingCapabilityPropertyType> getObservations(Ptf ptf) {
		List<ObservingCapabilityPropertyType> result = new ArrayList<ObservingCapabilityPropertyType>();
		ObservingCapabilityPropertyType ocp;
		ObservingCapabilityType oc;
		for (PtfVariable pv : ptf.getPtfVariables()) {
			Variable v = pv.getVariable();
			SensorModel sm = pv.getSensorModel();
			int sensorIncrement = 0;
			if (sm != null && v.getWigosCode() != null) {
				ocp = this.wmdrOF.createObservingCapabilityPropertyType();
				oc = this.wmdrOF.createObservingCapabilityType();
				oc.setId("oc-" + pv.getId());
				OMObservationPropertyType omobsp = this.omOF.createOMObservationPropertyType();
				OMObservationType omobs = this.omOF.createOMObservationType();
				omobsp.setOMObservation(omobs);
				omobs.setId("omobs-" + pv.getId());
				
				/*MDMetadataPropertyType mdmetadataprop = this.gmdOF.createMDMetadataPropertyType();
				MDMetadataType mdmetadata = this.gmdOF.createMDMetadataType();
				CharacterStringPropertyType value = this.gcoOF.createCharacterStringPropertyType();
				value.setCharacterString(this.gcoOF.createCharacterString("omobs-" + psm.getId() + "-" + st.getId()));
				mdmetadata.setFileIdentifier(value);
				
				value = this.gcoOF.createCharacterStringPropertyType();
				value.setCharacterString(this.gcoOF.createCharacterString("EN"));
				mdmetadata.setLanguage(value);
				
				MDCharacterSetCodePropertyType charSetCodeProp = this.gmdOF.createMDCharacterSetCodePropertyType();
				CodeListValueType codeListValue = this.gcoOF.createCodeListValueType();
				codeListValue.setValue("UTF-8");
				codeListValue.setCodeSpace("https://www.ansi.org");
				charSetCodeProp.setMDCharacterSetCode(codeListValue);
				codeListValue.setCodeList("UTF-8");
				codeListValue.setCodeListValue("UTF-8");
				mdmetadata.setCharacterSet(charSetCodeProp);
				
				value = this.gcoOF.createCharacterStringPropertyType();
				value.setCharacterString(this.gcoOF.createCharacterString("unknown"));
				mdmetadata.setParentIdentifier(value);
				
				CIResponsiblePartyPropertyType ciResponsiblePartyProp = this.gmdOF.createCIResponsiblePartyPropertyType();
				ciResponsiblePartyProp.setCIResponsibleParty(this.getCIResponsibleParty(null, null));
				mdmetadata.getContact().add(ciResponsiblePartyProp);
				
				DatePropertyType dateStampValue = this.gcoOF.createDatePropertyType();
				dateStampValue.setDate(Utils.GetIsoDateNoTime(ptf.getPtfDepl().getDeplDate()));
				mdmetadata.setDateStamp(dateStampValue );
				
				mdmetadataprop.setMDMetadata(mdmetadata);
				omobs.setMetadata(mdmetadataprop);*/

				ReferenceType refType = this.gmlOF.createReferenceType();
				refType.setHref("http://codes.wmo.int/wmdr/ObservedVariable/" + v.getWigosCode());
				omobs.setObservedProperty(refType);

				ProcessType process = this.wmdrOF.createProcessType();
				process.setId("process-" + pv.getId());

				DeploymentPropertyType deplP = this.wmdrOF.createDeploymentPropertyType();
				DeploymentType depl = this.wmdrOF.createDeploymentType();
				depl.setId("process-depl-" + pv.getId());
				depl.setDeployedEquipment(this.getEquipmentPropertyType(pv, sensorIncrement));
				sensorIncrement++;

				MeasureType mt = this.gmlOF.createMeasureType();
				mt.setUom("m");
				if (pv.getHeight() != null)
					mt.setValue(pv.getHeight().doubleValue());
				depl.setHeightAboveLocalReferenceSurface(mt);
				depl.setLocalReferenceSurface(this.gmlOF.createReferenceType());

				depl.getApplicationArea().add(this.gmlOF.createReferenceType());
				depl.setSourceOfObservation(this.gmlOF.createReferenceType());

				deplP.setDeployment(depl);
				process.setDeployment(deplP);

				OMProcessPropertyType omProcessType = this.omOF.createOMProcessPropertyType();
				omobs.setProcedure(omProcessType);
				JAXBElement<ProcessType> processList = this.wmdrOF.createProcess(process);
				omobsp.getOMObservation().getProcedure().setAny(processList);

				refType = this.gmlOF.createReferenceType();
				refType.setHref("http://codes.wmo.int/wmdr/featureOfInterest/point");
				omobs.setType(refType);

				TimeObjectPropertyType topt = this.omOF.createTimeObjectPropertyType();
				TimePeriodType atotype = this.gmlOF.createTimePeriodType();
				TimePositionType tptype = this.gmlOF.createTimePositionType();
				ArrayList<String> beginT = new ArrayList<String>();
				beginT.add(Utils.GetIsoDate(ptf.getPtfDepl().getDeplDate()));
				tptype.setValue(beginT);
				atotype.setId("omobs-timeperiod-" + pv.getId());
				atotype.setBeginPosition(tptype);
				atotype.setEndPosition(this.gmlOF.createTimePositionType());
				topt.setAbstractTimeObject(this.gmlOF.createTimePeriod(atotype));
				omobs.setPhenomenonTime(topt);

				TimePeriodPropertyType tppt = this.gmlOF.createTimePeriodPropertyType();
				atotype = this.gmlOF.createTimePeriodType();
				tptype = this.gmlOF.createTimePositionType();
				beginT = new ArrayList<String>();
				beginT.add(Utils.GetIsoDate(ptf.getPtfDepl().getDeplDate()));
				tptype.setValue(beginT);
				atotype.setId("omobs-timeperiod-validperiod-" + pv.getId());
				atotype.setBeginPosition(tptype);
				atotype.setEndPosition(this.gmlOF.createTimePositionType());
				tppt.setTimePeriod(atotype);
				depl.setValidPeriod(tppt);
				depl.getDataGeneration().add(new DataGenerationPropertyType());

				omobs.setResultTime(this.gmlOF.createTimeInstantPropertyType());
				omobs.setValidTime(this.gmlOF.createTimePeriodPropertyType());
				omobs.getResultQuality().add(new DQElementPropertyType());
				omobs.setResult(this.wmdrOF.createResultSetType());

				oc.getObservation().add(omobsp);
				refType = this.gmlOF.createReferenceType();
				refType.setHref(getWIGOSIdentifier(ptf));
				oc.setFacility(refType);

				for (NetworkPtf netPtf : ptf.getNetworkPtfs()) {
					if (netPtf.getNetwork().getRank().intValue() == 0) {
						if (!netPtf.getNetwork().getWigosCode().equals("DBCP")) {
							refType = this.gmlOF.createReferenceType();
							refType.setHref("http://codes.wmo.int/common/wmdr/ProgramAffiliation/" + netPtf.getNetwork().getWigosCode());

							oc.getProgramAffiliation().add(refType);
						}
					}
				}
				refType = this.gmlOF.createReferenceType();
				refType.setHref("http://codes.wmo.int/common/wmdr/ProgramAffiliation/" + ptf.getProgram().getWigosCode());
				oc.getProgramAffiliation().add(refType);

				ocp.setObservingCapability(oc);

				result.add(ocp);
			}			
		}

		return result;
	}

	/**
	 * Marshaller method of this class. Converts a WIGOSMetadataRecord object to its String XML representation.
	 */
	public String toString() {
		Marshaller m;
		StringWriter sw = new StringWriter();

		try {
			m = this.jaxbContext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://def.wmo.int/wmdr/2017 http://schemas.wmo.int/wmdr/1.0RC9/wmdr.xsd");
			m.marshal(this.rootElement, sw);
		} catch (JAXBException e) {
			sw.write(e.getMessage());
		}

		return sw.toString();
	}
}

/**
 * 
 */
package org.jcommops.api.entities.wmdr;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.exp.ExpressionParameter;
import org.apache.cayenne.query.SelectQuery;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jcommops.api.Utils;
import org.jcommops.api.accessors.PlatformAccessor;
import org.jcommops.api.orm.Agency;
import org.jcommops.api.orm.Obs;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfDeployment;
import org.jcommops.api.orm.PtfSensorModel;
import org.jcommops.api.orm.SensorModel;
import org.jcommops.api.orm.Weblink;

import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType;
import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation;
import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType.OnlineResource;
import _int.wmo.def.wmdr._2017.AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty;
import _int.wmo.def.wmdr._2017.EquipmentType;
import _int.wmo.def.wmdr._2017.FacilityLogPropertyType;
import _int.wmo.def.wmdr._2017.FacilityLogType;
import _int.wmo.def.wmdr._2017.HeaderType;
import _int.wmo.def.wmdr._2017.ObjectFactory;
import _int.wmo.def.wmdr._2017.ObservingFacilityType;
import _int.wmo.def.wmdr._2017.ResultSetType;
import _int.wmo.def.wmdr._2017.TimestampedLocationPropertyType;
import _int.wmo.def.wmdr._2017.TimestampedLocationType;
import _int.wmo.def.wmdr._2017.WIGOSMetadataRecordType;
import _int.wmo.def.wmdr._2017.WIGOSMetadataRecordType.Equipment;
import _int.wmo.def.wmdr._2017.WIGOSMetadataRecordType.Facility;
import net.opengis.gml.v_3_2_1.AbstractGeometryType;
import net.opengis.gml.v_3_2_1.AbstractTimeObjectType;
import net.opengis.gml.v_3_2_1.BoundingShapeType;
import net.opengis.gml.v_3_2_1.CodeType;
import net.opengis.gml.v_3_2_1.CodeWithAuthorityType;
import net.opengis.gml.v_3_2_1.DirectPositionType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;
import net.opengis.gml.v_3_2_1.GeometryPropertyType;
import net.opengis.gml.v_3_2_1.LocationPropertyType;
import net.opengis.gml.v_3_2_1.PointType;
import net.opengis.gml.v_3_2_1.ReferenceType;
import net.opengis.gml.v_3_2_1.StringOrRefType;
import net.opengis.gml.v_3_2_1.TimePeriodPropertyType;
import net.opengis.gml.v_3_2_1.TimePeriodType;
import net.opengis.gml.v_3_2_1.TimePositionType;
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
import net.opengis.iso19139.gmd.v_20070417.URLPropertyType;
import net.opengis.iso19139.gts.v_20070417.TMPeriodDurationPropertyType;
import net.opengis.om.v_2_0.OMObservationPropertyType;
import net.opengis.om.v_2_0.OMObservationType;
import net.opengis.om.v_2_0.TimeObjectPropertyType;
import net.opengis.samplingspatial.v_2_0.SFSpatialSamplingFeatureType;
import net.opengis.samplingspatial.v_2_0.ShapeType;

/**
 * @author alize
 *
 */
public class WIGOSMetadataRecord {
	private Log log = LogFactory.getLog(WIGOSMetadataRecord.class);
	private ServerRuntime cayenneRuntime = Utils.getCayenneRuntime();
	private ObjectContext cayenneContext = Utils.getCayenneRuntime().getContext();
	private JAXBContext jaxbContext;
	private _int.wmo.def.wmdr._2017.ObjectFactory wmdrOF;
	private _int.wmo.def.opm._2013.ObjectFactory opmOF;
	private _int.wmo.def.metce._2013.ObjectFactory metceOF;
	private net.opengis.sampling.v_2_0.ObjectFactory samOF;
	private net.opengis.samplingspatial.v_2_0.ObjectFactory samsOF;
	private net.opengis.om.v_2_0.ObjectFactory omOF;
	private net.opengis.gml.v_3_2_1.ObjectFactory gmlOF;
	private WIGOSMetadataRecordType rootElementType;
	private JAXBElement<WIGOSMetadataRecordType> rootElement;
	private net.opengis.iso19139.gmd.v_20070417.ObjectFactory gmdOF;
	private net.opengis.iso19139.gco.v_20070417.ObjectFactory gcoOF;
	
	public WIGOSMetadataRecord() throws JAXBException{
		this.cayenneRuntime = Utils.getCayenneRuntime();
		this.cayenneContext = this.cayenneRuntime.getContext();
		this.jaxbContext = JAXBContext.newInstance( "_int.wmo.def.wmdr._2017:_int.wmo.def.metce._2013:_int.wmo.def.opm._2013:net.opengis.gml.v_3_2_1:net.opengis.om.v_2_0:net.opengis.sampling.v_2_0:net.opengis.samplingspatial.v_2_0" );
		this.wmdrOF = new _int.wmo.def.wmdr._2017.ObjectFactory();
		this.opmOF = new _int.wmo.def.opm._2013.ObjectFactory();
		this.metceOF = new _int.wmo.def.metce._2013.ObjectFactory();
		this.samOF = new net.opengis.sampling.v_2_0.ObjectFactory();
		this.samsOF = new net.opengis.samplingspatial.v_2_0.ObjectFactory();
		this.omOF = new net.opengis.om.v_2_0.ObjectFactory();
		this.gmlOF = new net.opengis.gml.v_3_2_1.ObjectFactory();
		this.gmdOF = new net.opengis.iso19139.gmd.v_20070417.ObjectFactory();
		this.gcoOF = new net.opengis.iso19139.gco.v_20070417.ObjectFactory();
		
		this.rootElementType = new WIGOSMetadataRecordType();
		this.rootElement = wmdrOF.createWIGOSMetadataRecord(this.rootElementType);
	}
	
	public WIGOSMetadataRecord(Integer ptfId) throws JAXBException, DatatypeConfigurationException{
		this();
		Ptf ptf = Cayenne.objectForPK(this.cayenneContext, Ptf.class, (long)ptfId); 
		
		CodeWithAuthorityType identifier = gmlOF.createCodeWithAuthorityType();
		identifier.setValue(ptf.getRef());
		identifier.setCodeSpace("http://wigos.wmo.int");
		
		StringOrRefType description = gmlOF.createStringOrRefType();
		description.setValue(ptf.getDescription());
		
		this.rootElementType.setId("WMDR-" + ptf.getRef());
		this.rootElementType.setDescription(description);
		this.rootElementType.setIdentifier(identifier);
		this.rootElementType.setName(new ArrayList<CodeType>());
		this.rootElementType.setHeaderInformation(this.getHeaderInformation(ptf));
		
		List<WIGOSMetadataRecordType.Facility> facilities = this.rootElementType.getFacility();
		WIGOSMetadataRecordType.Facility facility = this.wmdrOF.createWIGOSMetadataRecordTypeFacility();
		ObservingFacilityType observingFacilityType = this.getObservingFacilityType(ptf);
		facility.setObservingFacility(observingFacilityType);
		facilities.add(facility);
		
		List<WIGOSMetadataRecordType.Equipment> equipments = this.rootElementType.getEquipment();
		List<WIGOSMetadataRecordType.Equipment> equipmentList = this.getEquipements(ptf);
		equipments.addAll(equipmentList);
		
		List<OMObservationPropertyType> obss = this.rootElementType.getObservation();
		List<OMObservationPropertyType> observations = this.getObservations(ptf);
		obss.addAll(observations);
	}

	private CIResponsiblePartyType getCIResponsibleParty(Integer agencyId, String ciRoleCode){
		CIResponsiblePartyType responsibleParty = this.gmdOF.createCIResponsiblePartyType();
		Agency agency;
		if(agencyId != null){
			agency = Cayenne.objectForPK(this.cayenneContext, Agency.class, agencyId); 
		}
		else{
			agencyId = Utils.JCOMMOPS_AGENCY_ID;
			agency = Cayenne.objectForPK(this.cayenneContext, Agency.class, Utils.JCOMMOPS_AGENCY_ID); 
		}
		
		responsibleParty.setId("responsibleparty-" + agencyId.toString());
		
		CharacterStringPropertyType organisationName = this.gcoOF.createCharacterStringPropertyType();
		organisationName.setCharacterString(this.gcoOF.createCharacterString(agency.getName()));
		CIContactPropertyType contactInfo = this.gmdOF.createCIContactPropertyType();
		CIContactType contact = this.gmdOF.createCIContactType();
		ArrayList<CharacterStringPropertyType> list = new ArrayList<CharacterStringPropertyType>();;
		CharacterStringPropertyType value;
		CITelephonePropertyType phoneProperty = this.gmdOF.createCITelephonePropertyType();
		CITelephoneType phone = this.gmdOF.createCITelephoneType();
		CIAddressPropertyType addressProperty = this.gmdOF.createCIAddressPropertyType();
		CIAddressType address = this.gmdOF.createCIAddressType();
		if(agency.getTel() != null){
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getTel()));
			list.add(value);
			phone.setVoice(list);
			phoneProperty.setCITelephone(phone);
		}
		if(agency.getAddress() != null){
			list.clear();
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getAddress()));
			list.add(value);
			address.setDeliveryPoint(list);
		}
		if(agency.getEmail() != null){
			list.clear();
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getEmail()));
			list.add(value);
			address.setElectronicMailAddress(list);
		}
		if(agency.getToCountry() != null){
			value = this.gcoOF.createCharacterStringPropertyType();
			value.setCharacterString(this.gcoOF.createCharacterString(agency.getToCountry().getNameLong()));
			address.setCountry(value);
		}
		
		addressProperty.setCIAddress(address);	
		
		CIOnlineResourcePropertyType onlineRsrcProperty = this.gmdOF.createCIOnlineResourcePropertyType();
		CIOnlineResourceType onlineRsrc = this.gmdOF.createCIOnlineResourceType();
		URLPropertyType urlProperty = this.gmdOF.createURLPropertyType();
		urlProperty.setURL(agency.getToWeblink().getUrl());
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
		codeListValue.setCodeListValue(ciRoleCode != null ? ciRoleCode : "custodian");
		roleCodeProperty.setCIRoleCode(codeListValue);
		responsibleParty.setRole(roleCodeProperty);

		return responsibleParty;
	}
	
	private WIGOSMetadataRecordType.HeaderInformation getHeaderInformation(Ptf ptf) throws DatatypeConfigurationException{
		WIGOSMetadataRecordType.HeaderInformation headerInfo = new WIGOSMetadataRecordType.HeaderInformation();
		HeaderType headerType = new HeaderType();
		
		HeaderType.RecordOwner recordOwner = this.wmdrOF.createHeaderTypeRecordOwner();
		
		recordOwner.setCIResponsibleParty(this.getCIResponsibleParty(Utils.JCOMMOPS_AGENCY_ID, "custodian"));		
		
		headerType.setRecordOwner(recordOwner);
		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		calendar.setTime(ptf.getUpdateDate());
		headerType.setFileDateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
		
		headerInfo.setHeader(headerType);
		
		return headerInfo;
	}
	
	private List<WIGOSMetadataRecordType.Deployment> getDeployments(Ptf ptf){
		PtfDeployment depl = ptf.getToPtfDeployment();
		ArrayList<WIGOSMetadataRecordType.Deployment> depls =  new ArrayList<>();
		
		
		return null;
	}
	
	private List<WIGOSMetadataRecordType.Equipment> getEquipements(Ptf ptf){
		List<PtfSensorModel> ptfSensorModels = ptf.getPtfSensorModelArray();
		ArrayList<WIGOSMetadataRecordType.Equipment> equipements = new ArrayList<>();
		
		WIGOSMetadataRecordType.Equipment currentEquipment;
		EquipmentType currentEquipmentType;
		for(PtfSensorModel ptfSM: ptfSensorModels){
			SensorModel sm = ptfSM.getToSensorModel();
			currentEquipment = this.wmdrOF.createWIGOSMetadataRecordTypeEquipment();
			currentEquipmentType = this.wmdrOF.createEquipmentType();
			
			currentEquipmentType.setId("equipment-" + sm.getObjectId().getIdSnapshot().get("ID").toString());
			
			ArrayList<CodeType> names = new ArrayList<CodeType>();
			CodeType name = this.gmlOF.createCodeType();
			name.setValue(sm.getName());
			names.add(name);
			currentEquipmentType.setName(names);
			StringOrRefType value = this.gmlOF.createStringOrRefType();
			value.setValue(sm.getDescription());
			currentEquipmentType.setDescription(value);
			
			currentEquipmentType.setSerialNumber(ptfSM.getSerialNo());
			
			if(sm.getToWeblink() != null){
				OnlineResource or = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeOnlineResource();
				CIOnlineResourceType onlineRsrc = this.gmdOF.createCIOnlineResourceType();
				URLPropertyType urlProperty = this.gmdOF.createURLPropertyType();
				urlProperty.setURL(sm.getToWeblink().getUrl());
				onlineRsrc.setLinkage(urlProperty);
				or.setCIOnlineResource(onlineRsrc);
				currentEquipmentType.getOnlineResource().add(or);
			}
			
			List<GeospatialLocation> geospatialLocs = currentEquipmentType.getGeospatialLocation();
			GeospatialLocation gsLoc = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeGeospatialLocation();
			TimestampedLocationType tsLoc = this.wmdrOF.createTimestampedLocationType();
			TimePeriodPropertyType timePeriodProperty = this.gmlOF.createTimePeriodPropertyType();
			TimePeriodType timePeriod = this.gmlOF.createTimePeriodType();
			TimePositionType timePosition = this.gmlOF.createTimePositionType();
			
			timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getToPtfLoc().getLocDate())));
			timePeriod.setId("equipment-" + sm.getObjectId().getIdSnapshot().get("ID").toString() + "-LatestLocationTimePeriod");
			timePeriod.setBeginPosition(timePosition);
			timePeriod.setEndPosition(this.gmlOF.createTimePositionType());
			timePeriodProperty.setTimePeriod(timePeriod);
			
			GeometryPropertyType geomProperty = this.gmlOF.createGeometryPropertyType();
			PointType geom = this.gmlOF.createPointType();
			DirectPositionType pos = this.gmlOF.createDirectPositionType();
			pos.setValue(Arrays.asList(ptf.getToPtfLoc().getLat().doubleValue(), ptf.getToPtfLoc().getLon().doubleValue(), ptf.getToPtfLoc().getElevation() == null ? 0: ptf.getToPtfLoc().getElevation().doubleValue()));
			geom.setId("equipment-" + sm.getObjectId().getIdSnapshot().get("ID").toString() + "-LatestLocationGeometry");
			geom.setPos(pos);
			geom.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4979");
			geomProperty.setAbstractGeometry(this.gmlOF.createPoint(geom));
			
			tsLoc.setValidTimePeriod(timePeriodProperty);
			tsLoc.setLocation(geomProperty);
			
			gsLoc.setTimestampedLocation(tsLoc);
			geospatialLocs.add(gsLoc);
			
			ReferenceType refType = this.gmlOF.createReferenceType();
			refType.setHref("http://codes.wmo.int/common/wmdr/GeopositioningMethod/VOCABULARYTERM");
			currentEquipmentType.setGeopositioningMethod(refType);

			AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty responsibleParty = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeResponsibleParty();
			if(sm.getToAgency() != null){
				responsibleParty.setCIResponsibleParty(this.getCIResponsibleParty(Integer.parseInt(sm.getToAgency().getObjectId().getIdSnapshot().get("ID").toString()), "custodian"));
				
				currentEquipmentType.setManufacturer(sm.getToAgency().getName());
			}
			else
				responsibleParty.setCIResponsibleParty(this.getCIResponsibleParty(null, null));
			
			currentEquipmentType.setResponsibleParty(responsibleParty);
			

			refType = this.gmlOF.createReferenceType();
			refType.setHref("http://codes.wmo.int/common/wmdr/ObservingMethod/VOCABULARYTERM");
			currentEquipmentType.setObservingMethod(refType);
			
			currentEquipment.setEquipment(currentEquipmentType);
			equipements.add(currentEquipment);
		}
		
		return equipements;
	}
	
	private ObservingFacilityType getObservingFacilityType(Ptf ptf) {
		ObservingFacilityType o = this.wmdrOF.createObservingFacilityType();
		
		o.setId("observingFacility-" + ptf.getRef());
		CodeWithAuthorityType value = this.gmlOF.createCodeWithAuthorityType();
		value.setValue(ptf.getRef());
		value.setCodeSpace("http://wigos.wmo.int");
		o.setIdentifier(value);
		StringOrRefType value1 = this.gmlOF.createStringOrRefType();
		value1.setValue(ptf.getRef());
		o.setDescription(value1);
		
		List<OnlineResource> onlineResources = o.getOnlineResource();
		for(Weblink w : ptf.getToWeblinks()){
			OnlineResource or = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeOnlineResource();
			CIOnlineResourceType onlineRsrc = this.gmdOF.createCIOnlineResourceType();
			URLPropertyType urlProperty = this.gmdOF.createURLPropertyType();
			urlProperty.setURL(w.getUrl());
			onlineRsrc.setLinkage(urlProperty);
			or.setCIOnlineResource(onlineRsrc);
			onlineResources.add(or);
		}
		
		List<GeospatialLocation> geospatialLocs = o.getGeospatialLocation();
		GeospatialLocation gsLoc = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeGeospatialLocation();
		TimestampedLocationType tsLoc = this.wmdrOF.createTimestampedLocationType();
		TimePeriodPropertyType timePeriodProperty = this.gmlOF.createTimePeriodPropertyType();
		TimePeriodType timePeriod = this.gmlOF.createTimePeriodType();
		TimePositionType timePosition = this.gmlOF.createTimePositionType();
		
		timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(ptf.getToPtfLoc().getLocDate())));
		timePeriod.setId("observingFacility-" + ptf.getRef() + "-LatestLocationTimePeriod");
		timePeriod.setBeginPosition(timePosition);
		timePeriod.setEndPosition(this.gmlOF.createTimePositionType());
		timePeriodProperty.setTimePeriod(timePeriod);
		
		GeometryPropertyType geomProperty = this.gmlOF.createGeometryPropertyType();
		PointType geom = this.gmlOF.createPointType();
		geom.setId("observingFacility-" + ptf.getRef() + "-LatestLocationGeometry");
		DirectPositionType pos = this.gmlOF.createDirectPositionType();
		pos.setValue(Arrays.asList(ptf.getToPtfLoc().getLat().doubleValue(), ptf.getToPtfLoc().getLon().doubleValue(), ptf.getToPtfLoc().getElevation() == null ? 0: ptf.getToPtfLoc().getElevation().doubleValue()));
		geom.setPos(pos);
		geom.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4979");
		geomProperty.setAbstractGeometry(this.gmlOF.createPoint(geom));
		
		tsLoc.setValidTimePeriod(timePeriodProperty);
		tsLoc.setLocation(geomProperty);
		
		gsLoc.setTimestampedLocation(tsLoc);
		geospatialLocs.add(gsLoc);
		
		ReferenceType refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/GeopositioningMethod/VOCABULARYTERM");
		o.setGeopositioningMethod(refType);
		
		AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty responsibleParty = this.wmdrOF.createAbstractEnvironmentalMonitoringFacilityTypeResponsibleParty();
		if(ptf.getToProgram().getToAgencies().size() > 0){
			responsibleParty.setCIResponsibleParty(this.getCIResponsibleParty(Integer.parseInt(ptf.getToProgram().getToAgencies().get(0).getObjectId().getIdSnapshot().get("ID").toString()), "custodian"));
		}
		else
			responsibleParty.setCIResponsibleParty(this.getCIResponsibleParty(null, null));
		o.setResponsibleParty(responsibleParty);

		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/WMORegion/VOCABULARYTERM");
		o.setWmoRegion(refType);
		
		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/TerritoryName/VOCABULARYTERM");
		o.setTerritoryName(refType);

		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/ProgramAffiliation/VOCABULARYTERM");
		refType.setTitle(ptf.getToProgram().getName());
		o.getProgramAffiliation().add(refType);
		
		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/ReportingStatus/VOCABULARYTERM");
		refType.setTitle(ptf.getToPtfStatus().getName());
		o.setReportingStatus(refType);
		
		o.setBelongsToSet("");

		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/FacilityType/VOCABULARYTERM");
		o.setFacilityType(refType);
		
		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/AltitudeOrDepth/VOCABULARYTERM");
		o.setAltitudeOrDepth(refType);

		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/LocalTopography/VOCABULARYTERM");
		o.setLocalTopography(refType);
		
		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/RelativeElevation/VOCABULARYTERM");
		o.setRelativeElevation(refType);

		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/SurfaceCoverIGBP/VOCABULARYTERM");
		o.setSurfaceCover(refType);
		
		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/SurfaceCoverClassification/VOCABULARYTERM");
		o.setSurfaceCoverClassification(refType);

		refType = this.gmlOF.createReferenceType();
		refType.setHref("http://codes.wmo.int/common/wmdr/TopographicContext/VOCABULARYTERM");
		o.setTopographicContext(refType);
		
		/*FacilityLogPropertyType facilityLogProperty = this.wmdrOF.createFacilityLogPropertyType();
		FacilityLogType facilityLog = this.wmdrOF.createFacilityLogType();
		facilityLogProperty.setFacilityLog(facilityLog);
		o.setFacilityLog(facilityLogProperty);*/
				
		return o;
	}
	
	private List<OMObservationPropertyType> getObservations(Ptf ptf){
		List<OMObservationPropertyType> result = new ArrayList();
		
		Expression qual = ExpressionFactory.matchExp("ptfId", Integer.parseInt(ptf.getObjectId().getIdSnapshot().get("ID").toString()));
		SelectQuery query = new SelectQuery(Obs.class, qual);
		List<Obs> observations = cayenneContext.performQuery(query);
		
		OMObservationPropertyType currentObsType;
		OMObservationType currentObs;
		for(Obs obs: observations){
			currentObsType = this.omOF.createOMObservationPropertyType();
			currentObs = this.omOF.createOMObservationType();
			
			currentObs.setId("obs-" + obs.getObjectId().getIdSnapshot().get("ID").toString());
			
			TimeObjectPropertyType timeObj = this.omOF.createTimeObjectPropertyType();
			TimePeriodType timePeriod = this.gmlOF.createTimePeriodType();
			TimePositionType timePosition = this.gmlOF.createTimePositionType();
			timePosition.setValue(Arrays.asList(Utils.ISO_DATE_FORMAT.format(obs.getObsDate())));
			timePeriod.setId("obs-" + obs.getObjectId().getIdSnapshot().get("ID").toString() + "-date");
			timePeriod.setBeginPosition(timePosition);
			timePeriod.setEndPosition(this.gmlOF.createTimePositionType());
			timeObj.setAbstractTimeObject(this.gmlOF.createAbstractTimeObject(timePeriod));
			currentObs.setPhenomenonTime(timeObj);
			
			currentObs.setResultTime(this.gmlOF.createTimeInstantPropertyType());
			currentObs.setValidTime(this.gmlOF.createTimePeriodPropertyType());
			
			PointType geom = this.gmlOF.createPointType();
			DirectPositionType pos = this.gmlOF.createDirectPositionType();
			pos.setValue(Arrays.asList(obs.getToPtfLoc().getLat().doubleValue(), obs.getToPtfLoc().getLon().doubleValue(), obs.getToPtfLoc().getElevation() == null ? 0: obs.getToPtfLoc().getElevation().doubleValue()));
			geom.setId("obs-" + obs.getObjectId().getIdSnapshot().get("ID").toString() + "-geometry");
			geom.setPos(pos);
			geom.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4979");
			ShapeType shape = this.samsOF.createShapeType();
			shape.setAbstractGeometry(this.gmlOF.createAbstractGeometry(geom));
			SFSpatialSamplingFeatureType samplFeature = this.samsOF.createSFSpatialSamplingFeatureType();
			samplFeature.setId("obs-" + obs.getObjectId().getIdSnapshot().get("ID").toString() + "-samplingfeature");
			LocationPropertyType loc = this.gmlOF.createLocationPropertyType();
			loc.setAbstractGeometry(this.gmlOF.createPoint(geom));
			samplFeature.setLocation(this.gmlOF.createLocation(loc));
			List<FeaturePropertyType> sampledFeatures = samplFeature.getSampledFeature();
			sampledFeatures.add(this.gmlOF.createFeaturePropertyType());
			samplFeature.setSampledFeature(sampledFeatures);
			samplFeature.setShape(shape);
			FeaturePropertyType featureProp = this.gmlOF.createFeaturePropertyType();
			featureProp.setAbstractFeature(this.samsOF.createSFSpatialSamplingFeature(samplFeature));
			currentObs.setFeatureOfInterest(featureProp);
			
			ArrayList<ResultSetType> results = new ArrayList<>();
			Marshaller m;
			StringWriter sw = new StringWriter();
			
			try {
				m = this.jaxbContext.createMarshaller();
				m.marshal(results, sw);
			} catch (JAXBException e) {
				sw.write(e.getMessage());
			}
			
			currentObs.setResult("");
			
			currentObsType.setOMObservation(currentObs);
			
			result.add(currentObsType);
		}
		
		return result;
	}
	
	public String toString(){
		Marshaller m;
		StringWriter sw = new StringWriter();
		
		try {
			m = this.jaxbContext.createMarshaller();
			m.marshal(this.rootElement, sw);
		} catch (JAXBException e) {
			sw.write(e.getMessage());
		}
		
		
		return sw.toString();
	}
}

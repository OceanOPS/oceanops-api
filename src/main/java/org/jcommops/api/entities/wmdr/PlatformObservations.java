/**
 * 
 */
package org.jcommops.api.entities.wmdr;

import java.io.StringWriter;
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
import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.query.SelectQuery;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jcommops.api.Utils;
import org.jcommops.api.orm.Agency;
import org.jcommops.api.orm.Obs;
import org.jcommops.api.orm.Ptf;
import _int.wmo.def.wmdr._2017.HeaderType;
import _int.wmo.def.wmdr._2017.ResultSetType;
import _int.wmo.def.wmdr._2017.WIGOSMetadataRecordType;
import net.opengis.gml.v_3_2_1.CodeType;
import net.opengis.gml.v_3_2_1.CodeWithAuthorityType;
import net.opengis.gml.v_3_2_1.DirectPositionType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;
import net.opengis.gml.v_3_2_1.PointType;
import net.opengis.gml.v_3_2_1.StringOrRefType;
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
import net.opengis.om.v_2_0.OMObservationPropertyType;
import net.opengis.om.v_2_0.OMObservationType;
import net.opengis.om.v_2_0.TimeObjectPropertyType;
import net.opengis.samplingspatial.v_2_0.SFSpatialSamplingFeatureType;
import net.opengis.samplingspatial.v_2_0.ShapeType;

/**
 * @author Anthonin Lizé
 *
 * Main class respresenting a XML WIGOS Metadata Record.
 */
public class PlatformObservations {
	private Log log = LogFactory.getLog(PlatformObservations.class);
	private ServerRuntime cayenneRuntime = Utils.getCayenneRuntime();
	private ObjectContext cayenneContext = Utils.getCayenneRuntime().getContext();
	private JAXBContext jaxbContext;
	private _int.wmo.def.wmdr._2017.ObjectFactory wmdrOF;
	private net.opengis.samplingspatial.v_2_0.ObjectFactory samsOF;
	private net.opengis.om.v_2_0.ObjectFactory omOF;
	private net.opengis.gml.v_3_2_1.ObjectFactory gmlOF;
	private WIGOSMetadataRecordType rootElementType;
	private JAXBElement<WIGOSMetadataRecordType> rootElement;
	private net.opengis.iso19139.gmd.v_20070417.ObjectFactory gmdOF;
	private net.opengis.iso19139.gco.v_20070417.ObjectFactory gcoOF;
	
	private Integer ciResponsiblePartyCounter = 0;
	
	/**
	 * Constructor of this class. Initializes all the context variables. Should not be used directly.
	 * @throws JAXBException
	 */
	public PlatformObservations() throws JAXBException{
		this.cayenneRuntime = Utils.getCayenneRuntime();
		this.cayenneContext = this.cayenneRuntime.getContext();
		this.jaxbContext = JAXBContext.newInstance( "_int.wmo.def.wmdr._2017:_int.wmo.def.metce._2013:_int.wmo.def.opm._2013:net.opengis.gml.v_3_2_1:net.opengis.om.v_2_0:net.opengis.sampling.v_2_0:net.opengis.samplingspatial.v_2_0" );
		this.wmdrOF = new _int.wmo.def.wmdr._2017.ObjectFactory();
		new _int.wmo.def.opm._2013.ObjectFactory();
		new _int.wmo.def.metce._2013.ObjectFactory();
		new net.opengis.sampling.v_2_0.ObjectFactory();
		this.samsOF = new net.opengis.samplingspatial.v_2_0.ObjectFactory();
		this.omOF = new net.opengis.om.v_2_0.ObjectFactory();
		this.gmlOF = new net.opengis.gml.v_3_2_1.ObjectFactory();
		this.gmdOF = new net.opengis.iso19139.gmd.v_20070417.ObjectFactory();
		this.gcoOF = new net.opengis.iso19139.gco.v_20070417.ObjectFactory();
		
		this.rootElementType = new WIGOSMetadataRecordType();
		this.rootElement = wmdrOF.createWIGOSMetadataRecord(this.rootElementType);
	}
	
	/**
	 * Main constructor of this class. It will instanciate the WMDR for the given platform ID.
	 * 
	 * @param ptfId  The platform database identifier from which data will be retrieved
	 * 
	 * @throws JAXBException
	 * @throws DatatypeConfigurationException
	 */
	public PlatformObservations(Integer ptfId) throws JAXBException, DatatypeConfigurationException{
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
			
		List<OMObservationPropertyType> obss = this.rootElementType.getObservation();
		List<OMObservationPropertyType> observations = this.getObservations(ptf);
		obss.addAll(observations);
	}

	/**
	 * Builds a CIResponsiblePartyType object from an agency database identifier and a given role.
	 * 
	 * @param agencyId  The agency database identifier
	 * @param ciRoleCode  The role of this responsible party
	 * @return the CIResponsiblePartyType representation of this agency
	 */
	private CIResponsiblePartyType getCIResponsibleParty(Integer agencyId, String ciRoleCode){
		ciResponsiblePartyCounter++;
		CIResponsiblePartyType responsibleParty = this.gmdOF.createCIResponsiblePartyType();
		Agency agency;
		if(agencyId != null){
			agency = Cayenne.objectForPK(this.cayenneContext, Agency.class, agencyId); 
		}
		else{
			agencyId = Utils.JCOMMOPS_AGENCY_ID;
			agency = Cayenne.objectForPK(this.cayenneContext, Agency.class, Utils.JCOMMOPS_AGENCY_ID); 
		}
		
		responsibleParty.setId("responsibleparty-" + agencyId.toString() + "-" + ciResponsiblePartyCounter.toString());
		if(agency.getRef() != null)
			responsibleParty.setUuid(agency.getRef());
		
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
	
	/**
	 * Builds the HeaderInformation object for the given platform.
	 * 
	 * @param ptf  The Ptf entity object from which data should be extracted
	 * @return the header information
	 * @throws DatatypeConfigurationException
	 */
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
	
	
	/**
	 * Builds the OMObservationPropertyType list for the given platform.
	 * @param ptf  The Ptf entity object from which data should be extracted
	 * @return the OMObservationPropertyType of the platform
	 */
	private List<OMObservationPropertyType> getObservations(Ptf ptf){
		List<OMObservationPropertyType> result = new ArrayList<OMObservationPropertyType>();
		
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
			timeObj.setAbstractTimeObject(this.gmlOF.createTimePeriod(timePeriod));
			currentObs.setPhenomenonTime(timeObj);
			
			currentObs.setResultTime(this.gmlOF.createTimeInstantPropertyType());
			currentObs.setValidTime(this.gmlOF.createTimePeriodPropertyType());
			
			PointType geom = this.gmlOF.createPointType();
			DirectPositionType pos = this.gmlOF.createDirectPositionType();
			pos.setValue(Arrays.asList(obs.getToPtfLoc().getLat().doubleValue(), obs.getToPtfLoc().getLon().doubleValue(), obs.getToPtfLoc().getElevation() == null ? 0: obs.getToPtfLoc().getElevation().doubleValue()));
			geom.setId("obs-" + obs.getObjectId().getIdSnapshot().get("ID").toString() + "-geometry-" + obs.getToPtfLoc().getObjectId().getIdSnapshot().get("ID").toString());
			geom.setPos(pos);
			geom.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4979");
			ShapeType shape = this.samsOF.createShapeType();
			shape.setAbstractGeometry(this.gmlOF.createPoint(geom));
			SFSpatialSamplingFeatureType samplFeature = this.samsOF.createSFSpatialSamplingFeatureType();
			samplFeature.setId("obs-" + obs.getObjectId().getIdSnapshot().get("ID").toString() + "-samplingfeature");
			
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
	
	/**
	 * Marshaller method of this class. Converts a WIGOSMetadataRecord object to its String XML representation.
	 */
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

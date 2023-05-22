/**
 * @author Anthonin Lizé
 * 
 * This code maps the different element of OceanOPS data model to the WMDR binding Java objects.
 */
package org.oceanops.api.entities.wmdr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.ObjectSelect;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlOptions;
import org.oceanops.api.Utils;
import org.oceanops.orm.Agency;
import org.oceanops.orm.ProgramAgency;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.PtfPtfStatus;
import org.oceanops.orm.PtfStatus;
import org.oceanops.orm.PtfVariable;
import org.oceanops.orm.SensorModel;
import org.oceanops.orm.SensorType;
import org.oceanops.orm.Variable;
import org.oceanops.orm.Weblink;
import org.oceanops.orm.Wmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xint.wmo.def.wmdr.x2017.AbstractEnvironmentalMonitoringFacilityType;
import xint.wmo.def.wmdr.x2017.AbstractEnvironmentalMonitoringFacilityType.Description;
import xint.wmo.def.wmdr.x2017.AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation;
import xint.wmo.def.wmdr.x2017.AbstractEnvironmentalMonitoringFacilityType.OnlineResource;
import xint.wmo.def.wmdr.x2017.DeploymentPropertyType;
import xint.wmo.def.wmdr.x2017.DeploymentType;
import xint.wmo.def.wmdr.x2017.DescriptionType;
import xint.wmo.def.wmdr.x2017.EquipmentPropertyType;
import xint.wmo.def.wmdr.x2017.EquipmentType;
import xint.wmo.def.wmdr.x2017.GeospatialLocationType;
import xint.wmo.def.wmdr.x2017.HeaderType;
import xint.wmo.def.wmdr.x2017.ObservingCapabilityPropertyType;
import xint.wmo.def.wmdr.x2017.ObservingCapabilityType;
import xint.wmo.def.wmdr.x2017.ObservingFacilityType;
import xint.wmo.def.wmdr.x2017.ProcessDocument;
import xint.wmo.def.wmdr.x2017.ObservingFacilityType.ProgramAffiliation;
import xint.wmo.def.wmdr.x2017.ObservingFacilityType.Territory;
import xint.wmo.def.wmdr.x2017.ProcessType;
import xint.wmo.def.wmdr.x2017.ProgramAffiliationType;
import xint.wmo.def.wmdr.x2017.ProgramAffiliationType.ReportingStatus;
import xint.wmo.def.wmdr.x2017.ReportingStatusType;
import xint.wmo.def.wmdr.x2017.ResponsiblePartyType;
import xint.wmo.def.wmdr.x2017.TerritoryType;
import xint.wmo.def.wmdr.x2017.WIGOSMetadataRecordDocument;
import xint.wmo.def.wmdr.x2017.WIGOSMetadataRecordType;
import net.opengis.gml.x32.CodeWithAuthorityType;
import net.opengis.gml.x32.DirectPositionType;
import net.opengis.gml.x32.MeasureType;
import net.opengis.gml.x32.PointPropertyType;
import net.opengis.gml.x32.PointType;
import net.opengis.gml.x32.ReferenceType;
import net.opengis.gml.x32.TimePeriodPropertyType;
import net.opengis.gml.x32.TimePeriodType;
import net.opengis.gml.x32.TimePositionType;
import org.isotc211.x2005.gco.CharacterStringPropertyType;
import org.isotc211.x2005.gco.CodeListValueType;
import org.isotc211.x2005.gmd.CIAddressType;
import org.isotc211.x2005.gmd.CIContactType;
import org.isotc211.x2005.gmd.CIOnlineResourceType;
import org.isotc211.x2005.gmd.CIResponsiblePartyType;
import org.isotc211.x2005.gmd.CIRoleCodePropertyType;
import org.isotc211.x2005.gmd.CITelephoneType;
import org.isotc211.x2005.gmd.URLPropertyType;
import net.opengis.om.x20.OMObservationPropertyType;
import net.opengis.om.x20.OMObservationType;
import net.opengis.om.x20.OMProcessPropertyType;

/**
 * @author Anthonin Lizé
 *
 *         Main class representing a XML WIGOS Metadata Record.
 */
public class Platform {
	private ObjectContext cayenneContext;
    private XmlOptions opts;
	private WIGOSMetadataRecordDocument rootElement;

	private Integer ciResponsiblePartyCounter = 0;
	private Integer sensorIncrement = 0;
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
	 * Main constructor of this class. It will instanciate the WMDR for the given platform
	 * 
	 * @param ptf An instance of a platform
	 * 
	 */
	public Platform(Ptf ptf) {
		this.cayenneContext = ptf.getObjectContext();
		logger.debug("Instanciating Platform WMDR record for ptf_id = " + String.valueOf(ptf.getId()));
		String wigosRef = this.getWIGOSIdentifier(ptf);
        
        this.rootElement = WIGOSMetadataRecordDocument.Factory.newInstance(opts);
		WIGOSMetadataRecordType rootElementType = this.rootElement.addNewWIGOSMetadataRecord();
        XmlCursor cursor = rootElementType.newCursor();
        cursor.toNextToken();
        cursor.insertNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
        cursor.insertNamespace("wmdr", "http://def.wmo.int/wmdr/2017");
        cursor.insertNamespace("gml", "http://www.opengis.net/gml/3.2");
        cursor.insertNamespace("xlink", "http://www.w3.org/1999/xlink");
        cursor.insertNamespace("gmd", "http://www.isotc211.org/2005/gmd");
        cursor.insertNamespace("gco", "http://www.isotc211.org/2005/gco");
        cursor.insertNamespace("sams", "http://www.opengis.net/samplingSpatial/2.0");
        cursor.insertNamespace("gts", "http://www.isotc211.org/2005/gts");
        cursor.insertNamespace("opm", "http://def.wmo.int/opm/2013");
        cursor.insertNamespace("metce", "http://def.wmo.int/metce/2013");
        cursor.insertNamespace("gmx", "http://www.isotc211.org/2005/gmx");
        cursor.insertNamespace("sam", "http://www.opengis.net/sampling/2.0");
        cursor.insertNamespace("om", "http://www.opengis.net/om/2.0");

		cursor.insertAttributeWithValue("schemaLocation", "http://www.w3.org/2001/XMLSchema-instance", 
			"http://def.wmo.int/wmdr/2017 http://schemas.wmo.int/wmdr/1.0RC9/wmdr.xsd");
        cursor.close();

		CodeWithAuthorityType identifier = rootElementType.addNewIdentifier();
		identifier.setStringValue(wigosRef);
		identifier.setCodeSpace("http://data.wmo.int/");

		rootElementType.setId("record_" + wigosRef);
		rootElementType.addNewName();
		rootElementType.addNewDescription();
		rootElementType.addNewBoundedBy().setNil();
		rootElementType.setHeaderInformation(this.getHeaderInformation(ptf));

		WIGOSMetadataRecordType.Facility facility = rootElementType.addNewFacility();
		ObservingFacilityType observingFacilityType = this.getObservingFacilityType(ptf);
		facility.setObservingFacility(observingFacilityType);
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
		CIResponsiblePartyType responsibleParty = CIResponsiblePartyType.Factory.newInstance();
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

		responsibleParty.addNewOrganisationName().setCharacterString(agency.getName());
		CIContactType contact = responsibleParty.addNewContactInfo().addNewCIContact();
		CharacterStringPropertyType value;
		CITelephoneType phone = contact.addNewPhone().addNewCITelephone();
		CIAddressType address = contact.addNewAddress().addNewCIAddress();
		if (agency.getTel() != null) {
			phone.addNewVoice().setCharacterString(agency.getTel());
		}
		if (agency.getAddress() != null) {
			address.addNewDeliveryPoint().setCharacterString(agency.getAddress().replaceAll("<br />|<br>", " - ").replaceAll("\\<.*?>", ""));
		}
		if (agency.getEmail() != null) {
			address.addNewElectronicMailAddress().setCharacterString(agency.getEmail());
		}
		if (agency.getCountry() != null) {
			value = address.addNewCountry();
			value.setCharacterString(agency.getCountry().getCode3());
			// Exception for international agencies
			if (agencyId == Utils.OCEANOPS_AGENCY_ID || agencyId == 1000540) // OceanOPS, EuroArgo
				value.setCharacterString("FRA");
			else if (agencyId == 14300) // EUMETNET
				value.setCharacterString("BEL");
			else if (agencyId == 14938) // EU-THOR
				value.setCharacterString("DEU");
			else if (agencyId == 6886 || agencyId == 14666) //  USA				
				value.setCharacterString("USA");
		}

		if (agency.getWeblink() != null){
			contact.addNewOnlineResource().addNewCIOnlineResource().addNewLinkage().setURL(agency.getWeblink().getUrl());
		}

		CIRoleCodePropertyType roleCodeProperty =  responsibleParty.addNewRole();
		CodeListValueType codeListValue = roleCodeProperty.addNewCIRoleCode();
		codeListValue.setCodeList("http://www.isotc211.org/2005/resources/Codelist/gmxCodelists.xml#CI_RoleCode");
		codeListValue.setCodeListValue(ciRoleCode != null ? ciRoleCode : "pointOfContact");

		return responsibleParty;
	}

	/**
	 * Builds the HeaderInformation object for the given platform.
	 * 
	 * @param ptf The Ptf entity object from which data should be extracted
	 * @return the header information
	 */
	private WIGOSMetadataRecordType.HeaderInformation getHeaderInformation(Ptf ptf) {
		WIGOSMetadataRecordType.HeaderInformation headerInfo = WIGOSMetadataRecordType.HeaderInformation.Factory.newInstance();
		HeaderType headerType = headerInfo.addNewHeader();
		HeaderType.RecordOwner recordOwner = headerType.addNewRecordOwner();

		recordOwner.setCIResponsibleParty(this.getCIResponsibleParty(Utils.OCEANOPS_AGENCY_ID, "custodian"));
		XmlDateTime dt = XmlDateTime.Factory.newInstance();
		dt.setStringValue(Utils.GetIsoDate(ptf.getUpdateDate()));
		headerType.xsetFileDateTime(dt);

		return headerInfo;
	}

	/**
	 * Builds the EquipmentPropertyType element
	 * @param pv a PtfVariable record
	 * @return The EquipmentPropertyType object built
	 */
	private EquipmentPropertyType getEquipmentPropertyType(PtfVariable ptfV) {
		EquipmentPropertyType currentEquipment = EquipmentPropertyType.Factory.newInstance();
		EquipmentType currentEquipmentType = currentEquipment.addNewEquipment();
		currentEquipmentType.addNewBoundedBy().setNil();
		Variable variable = ptfV.getVariable();
		SensorModel sm = ptfV.getSensorModel();
		String id;
		if (sensorIncrement == 0)
			id = "subequipment-" + ptfV.getObjectId().getIdSnapshot().get("ID").toString();
		else
			id = "subequipment-" + ptfV.getObjectId().getIdSnapshot().get("ID").toString() + "-" + String.valueOf(sensorIncrement);
		currentEquipmentType.setId(id);
		CodeWithAuthorityType code = currentEquipmentType.addNewIdentifier();
		if(variable != null && variable.getWigosCode() != null) {
			code.setCodeSpace(variable.getWigosCode());
			String[] uriSplit = variable.getWigosCode().split("/");
			code.setStringValue(uriSplit[uriSplit.length-1]);
		}

		currentEquipmentType.setModel(sm.getName());
		ReferenceType facilityLink = currentEquipmentType.addNewFacility();
		facilityLink.setHref("http://data.wmo.int/wigos/" + getWIGOSIdentifier(ptfV.getPtf()));
		if (sm.getAgency() != null)
			currentEquipmentType.setManufacturer(sm.getAgency().getName());
		else
			currentEquipmentType.setManufacturer("unknown");
		String range = "unknown";
		if(ptfV.getRange() != null)
			range = ptfV.getRange();
		
		currentEquipmentType.setObservableRange(range);
		currentEquipmentType.setSpecifiedAbsoluteUncertainty("unknown");
		currentEquipmentType.setSpecifiedRelativeUncertainty("unknown");
		currentEquipmentType.setDriftPerUnitTime("unknown");
		if(sm.getDescription() != null)
			currentEquipmentType.addNewDescription().setStringValue(sm.getDescription());

		if(ptfV.getSerialNo() != null)
			currentEquipmentType.setSerialNumber(ptfV.getSerialNo());

		if (sm.getWeblink() != null) {
			OnlineResource or = currentEquipmentType.addNewOnlineResource();//OnlineResource.Factory.newInstance();
			CIOnlineResourceType onlineRsrc = or.addNewCIOnlineResource();
			URLPropertyType urlProperty = onlineRsrc.addNewLinkage();
			urlProperty.setURL(sm.getWeblink().getUrl());	
			currentEquipmentType.setSpecificationLink(sm.getWeblink().getUrl());
		}
		else {
			currentEquipmentType.setSpecificationLink("unknown");
		}
		

		AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty responsibleParty = currentEquipmentType.addNewResponsibleParty();
		ResponsiblePartyType responsiblePartyType = responsibleParty.addNewResponsibleParty();
		ResponsiblePartyType.ResponsibleParty rp = responsiblePartyType.addNewResponsibleParty();
		if (sm.getAgency() != null) {
			rp.setCIResponsibleParty(this.getCIResponsibleParty(Integer.parseInt(sm.getAgency().getObjectId().getIdSnapshot().get("ID").toString()), "pointOfContact"));

			currentEquipmentType.setManufacturer(sm.getAgency().getNameShort());
		} else
			rp.setCIResponsibleParty(this.getCIResponsibleParty(null, null));

		// Find sensor type where same variable
		// Observing Method in WIGOS is similar to SensorType
		String obsMethod = null;
		if(ptfV.getVariable().getId() != null){
			int i = 0;
			SensorType st;
			while(obsMethod == null && i < sm.getSensorModelSensorTypes().size()){
				st = sm.getSensorModelSensorTypes().get(i).getSensorType();
				if(st.getVariable() != null){
					if(st.getVariable().getId().equals(ptfV.getVariable().getId()))
						obsMethod = st.getWigosCode();
				}
				i++;
			}
		}
		if(obsMethod == null)
			obsMethod = "http://codes.wmo.int/wmdr/ObservingMethodAtmosphere/unknown";
		ReferenceType refType = currentEquipmentType.addNewObservingMethod();
		refType.setHref(obsMethod);

		return currentEquipment;
	}

	/**
	 * Builds the ObservingFacilityType object for the given platform.
	 * @param ptf  The Ptf entity object from which data should be extracted
	 * @return the ObervingFacilityType representation of the platform
	 */
	private ObservingFacilityType getObservingFacilityType(Ptf ptf) {
		ObservingFacilityType o = ObservingFacilityType.Factory.newInstance();
		String wigosID = getWIGOSIdentifier(ptf);
		o.setId("_" + wigosID);
		CodeWithAuthorityType value = CodeWithAuthorityType.Factory.newInstance();
		value.setStringValue(wigosID);
		value.setCodeSpace("http://data.wmo.int");
		o.setIdentifier(value);
		o.addNewName().setStringValue(ptf.getRef());
		o.addNewBoundedBy().setNil();
		
		// Sorting WMO codes for that platform
		List<Wmo> wmos = ptf.getWmos();
		Comparator<Wmo> wmosRanking = Comparator.comparing(Wmo::getStartDate);
		wmos.sort(wmosRanking);

		String description = "";
		if(ptf.getDescription() != null)
			description = ptf.getDescription();
		if(wmos.size()>1){
			if(description.length() > 0)
				description += "\n";
			description += "GTS identifier changes:\n";
			for(Wmo wmo: wmos){
				description += "* " + wmo.getWmo() + " (from " + Utils.GetIsoDateNoTime(wmo.getStartDate());
				if(wmo.getEndDate() != null){
					description += " to " + Utils.GetIsoDateNoTime(wmo.getEndDate());
				}
				description += ")\n";
			}
		}
		if(ptf.getPtfDepl().getShip()!= null){
			if(description.length() > 0)
				description += "\n";
			if(ptf.getPtfDepl().getShip().getHideMetadata().intValue() == 1){
				description += "Ship masked";
			}
			else{
				description += (ptf.getPtfDepl().getShip().getShipType() != null ? ("Ship type: " + ptf.getPtfDepl().getShip().getShipType().getName()) : "");
			}
		}
		
		Description desc = o.addNewDescription2();
		DescriptionType descType = desc.addNewDescription();
		descType.setDescription(description);
		TimePeriodPropertyType descTimePeriodPropType = descType.addNewValidPeriod();
		TimePeriodType descTimePeriod = descTimePeriodPropType.addNewTimePeriod();
		descTimePeriod.setId("desc-timePeriod-" + ptf.getId());
		descTimePeriod.addNewBeginPosition().setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getPtfDepl().getDeplDate()));
		TimePositionType endTimePositionType = descTimePeriod.addNewEndPosition();
		if(ptf.getPtfStatus().getId().intValue() == 5 && ptf.getEndingDate() != null)
			endTimePositionType.setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate()));
		
		// Link to OceanOPS inspecy
		o.addNewOnlineResource().addNewCIOnlineResource().addNewLinkage().setURL(Utils.getInspectPtfUrl() + ptf.getRef());
		// Adding any weblinks stored in the database
		for(Weblink w : ptf.getWeblinks()){
			o.addNewOnlineResource().addNewCIOnlineResource().addNewLinkage().setURL(w.getUrl());
		}
	
		
		// BEGIN - Latest location
		TimePeriodPropertyType timePeriodProperty;
		TimePeriodType timePeriod;
		ReferenceType refType;
		if(ptf.getLatestObs() != null) {
			GeospatialLocation gsLoc = o.addNewGeospatialLocation();
			GeospatialLocationType gsLocType = gsLoc.addNewGeospatialLocation();
			timePeriodProperty = gsLocType.addNewValidPeriod();
			timePeriod = timePeriodProperty.addNewTimePeriod();
	
			timePeriod.setId(o.getId() + "-LatestLocTimePeriod");
			timePeriod.addNewBeginPosition().setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getLatestObs().getObsDate()));
			timePeriod.addNewEndPosition();
			
			PointType geom = PointType.Factory.newInstance();
			geom.setId(o.getId() + "-LatestLocationGeometry");
			DirectPositionType posType = geom.addNewPos();
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
			posType.setListValue(coords);
			geom.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4979");
	
			PointPropertyType geomProperty = PointPropertyType.Factory.newInstance();
			geomProperty.setPoint(geom);
		
			refType = gsLocType.addNewGeopositioningMethod();
			if(ptf.getLocSystem() != null)
				refType.setHref("http://codes.wmo.int/wmdr/GeopositioningMethod/" + ptf.getLocSystem().getWigosCode());
			else
				refType.setHref("http://codes.wmo.int/wmdr/GeopositioningMethod/unknown");
			
			// Overwriting AbstractGeom with Point
			gsLocType.addNewGeoLocation().set(geomProperty);
		}
		// END - Latest location
		
		
		AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty responsibleParty = o.addNewResponsibleParty();
		ResponsiblePartyType responsiblePartyType = responsibleParty.addNewResponsibleParty();
		ResponsiblePartyType.ResponsibleParty rp = responsiblePartyType.addNewResponsibleParty();
		if(ptf.getProgram().getProgramAgencies().size() > 0){
			Integer agencyID = null;
			for(ProgramAgency prAgency: ptf.getProgram().getProgramAgencies()){
				if(prAgency.getLead().intValue() == 1)
					agencyID = prAgency.getAgency().getId().intValue();
			}
			
			if(agencyID == null && ptf.getProgram().getProgramAgencies().size() == 1){
				rp.setCIResponsibleParty(this.getCIResponsibleParty(ptf.getProgram().getProgramAgencies().get(0).getAgency().getId().intValue(), "owner"));
			}
			else if(agencyID != null)
				rp.setCIResponsibleParty(this.getCIResponsibleParty(agencyID, "owner"));
			else
				rp.setCIResponsibleParty(this.getCIResponsibleParty(null, null));
		}
		else
			rp.setCIResponsibleParty(this.getCIResponsibleParty(null, null));

		
		XmlDate xdate = XmlDate.Factory.newInstance();
		xdate.setStringValue(Utils.GetIsoDateNoTime(ptf.getUpdateDate()) + "Z");
		o.xsetDateEstablished(xdate);
		
		if(ptf.getEndingDate() != null){
			xdate = XmlDate.Factory.newInstance();
			xdate.setStringValue(Utils.GetIsoDateNoTime(ptf.getEndingDate()) + "Z");
			o.xsetDateClosed(xdate);
		}
		
		refType = o.addNewWmoRegion();
		//refType.setHref("http://codes.wmo.int/wmdr/WMORegion/");
		
		Territory territory = o.addNewTerritory();
		TerritoryType territoryType = territory.addNewTerritory();
		refType = territoryType.addNewTerritoryName();
		String country = "inapplicable";
		if(ptf.getProgram().getCountry() != null) {
			if(ptf.getProgram().getCountry().getCode3() != null)
				country = ptf.getProgram().getCountry().getCode3();
		}
		refType.setHref("http://codes.wmo.int/wmdr/TerritoryName/" + country);

		TimePeriodPropertyType territoryTimePeriodPropType = territoryType.addNewValidPeriod();
		TimePeriodType territoryTimePeriod = territoryTimePeriodPropType.addNewTimePeriod();
		territoryTimePeriod.setId("territory-timePeriod-" + ptf.getId());
		territoryTimePeriod.addNewBeginPosition().setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getPtfDepl().getDeplDate()));
		endTimePositionType = territoryTimePeriod.addNewEndPosition();
		if(ptf.getPtfStatus().getId().intValue() == 5 && ptf.getEndingDate() != null)
			endTimePositionType.setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate()));

		refType = o.addNewFacilityType();
		refType.setHref("http://codes.wmo.int/wmdr/FacilityType/" + ptf.getPtfModel().getPtfType().getWigosCode());
		
		ProgramAffiliation progAffiliation;
		ProgramAffiliationType progAffiliationType;
		int count = 1;
		Comparator<PtfPtfStatus> ptfPtfStatusesRanking = Comparator.comparing(PtfPtfStatus::getChangingDate);
		List<PtfPtfStatus> ptfPtfStatuses = ptf.getPtfPtfStatuses();
		ptfPtfStatuses.sort(ptfPtfStatusesRanking);
		// WMOs: WMO start date/depl date, WMO end date/PTF end date for operational
		// PTF end date for closed
		if(wmos.size() > 0) {
			// Using latest WMO code and full timeline, only workable solution for now
			Wmo wmo = wmos.get(wmos.size()-1);
			progAffiliation = o.addNewProgramAffiliation();
			progAffiliationType = progAffiliation.addNewProgramAffiliation();
			refType = progAffiliationType.addNewProgramAffiliation();
			refType.setHref("http://codes.wmo.int/wmdr/ProgramAffiliation/" + ptf.getProgram().getWigosCode());
			progAffiliationType.setProgramSpecificFacilityId(wmo.getWmo());
			ReportingStatus reportingStatus = null;
			ReportingStatusType reportingStatusType = null;
			if(ptfPtfStatuses.size()>0){
				// Going through the timeline
				for(int i = 0; i < ptfPtfStatuses.size(); i++){
					PtfPtfStatus ptfPtfStatus = ptfPtfStatuses.get(i);
					if(ptfPtfStatus.getPtfStatus().getId().intValue() > 2){
						String startDate = Utils.ISO_DATE_FORMAT.format(ptfPtfStatus.getChangingDate());
						String endDate = null;
						if(i < ptfPtfStatuses.size() - 1){						
							PtfPtfStatus nextPtfPtfStatus = ptfPtfStatuses.get(i+1);
							endDate = Utils.ISO_DATE_FORMAT.format(nextPtfPtfStatus.getChangingDate().minusDays(1));
						}
						if(ptfPtfStatus.getPtfStatus().getId().intValue() == 5 && ptf.getEndingDate() != null)
							startDate = Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate());
						reportingStatus = progAffiliationType.addNewReportingStatus();
						reportingStatusType = reportingStatus.addNewReportingStatus();
						refType = reportingStatusType.addNewReportingStatus();
						refType.setHref("http://codes.wmo.int/wmdr/ReportingStatus/" + ptfPtfStatus.getPtfStatus().getWigosCode());
						
						timePeriodProperty = reportingStatusType.addNewValidPeriod();
						timePeriod = timePeriodProperty.addNewTimePeriod();
						timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
						timePeriod.addNewBeginPosition().setStringValue(startDate);
						endTimePositionType = timePeriod.addNewEndPosition();
						if(endDate != null)
							endTimePositionType.setStringValue(endDate);
						
						count++;
					}
				}
			}
			else{
				// No Timeline, should not happen
				// Operational status
				reportingStatus = progAffiliationType.addNewReportingStatus();
				reportingStatusType = reportingStatus.addNewReportingStatus();
				PtfStatus opStatus = ObjectSelect.query(PtfStatus.class).where(PtfStatus.ID.eq(6)).selectOne(cayenneContext);
				PtfStatus closedStatus = ObjectSelect.query(PtfStatus.class).where(PtfStatus.ID.eq(5)).selectOne(cayenneContext);

				refType = reportingStatusType.addNewReportingStatus();				
				refType.setHref("http://codes.wmo.int/wmdr/ReportingStatus/" + opStatus.getWigosCode());
				
				timePeriodProperty = reportingStatusType.addNewValidPeriod();
				timePeriod = timePeriodProperty.addNewTimePeriod();
				timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
				if(wmo.getStartDate()!= null)
					timePeriod.addNewBeginPosition().setStringValue(Utils.ISO_DATE_FORMAT.format(wmo.getStartDate()));
				else
					timePeriod.addNewBeginPosition().setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getPtfDepl().getDeplDate()));
				
				endTimePositionType = timePeriod.addNewEndPosition();
				if(wmo.getEndDate()!= null)
					endTimePositionType.setStringValue(Utils.ISO_DATE_FORMAT.format(wmo.getEndDate()));
				else if(ptf.getEndingDate() != null)
					endTimePositionType.setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate()));
					
				count++;

				// Closed status
				if(ptf.getPtfStatus().getId() == 5){
					reportingStatus = progAffiliationType.addNewReportingStatus();
					reportingStatusType = reportingStatus.addNewReportingStatus();

					refType = reportingStatusType.addNewReportingStatus();					
					refType.setHref("http://codes.wmo.int/wmdr/ReportingStatus/" + closedStatus.getWigosCode());
					
					timePeriodProperty = reportingStatusType.addNewValidPeriod();
					timePeriod = timePeriodProperty.addNewTimePeriod();
					timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
					timePeriod.addNewBeginPosition().setStringValue(Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate()));
					timePeriod.addNewEndPosition();
					
					reportingStatus.setReportingStatus(reportingStatusType);
					progAffiliationType.setProgramSpecificFacilityId(wmo.getWmo());
					count++;
				}
			}
			
			progAffiliation.setProgramAffiliation(progAffiliationType);
		}
		else {
			// No WMO code, probably never used
			progAffiliation = o.addNewProgramAffiliation();
			progAffiliationType = progAffiliation.addNewProgramAffiliation();
			refType = progAffiliationType.addNewProgramAffiliation();
			refType.setHref("http://codes.wmo.int/wmdr/ProgramAffiliation/" + ptf.getProgram().getWigosCode());
			
			ReportingStatus reportingStatus = null;
			ReportingStatusType reportingStatusType = null;
			for(int i = 0; i < ptfPtfStatuses.size(); i++){
				PtfPtfStatus ptfPtfStatus = ptfPtfStatuses.get(i);
				if(ptfPtfStatus.getPtfStatus().getId() > 2){
					String startDate = Utils.ISO_DATE_FORMAT.format(ptfPtfStatus.getChangingDate());
					String endDate = null;
					if(i < ptfPtfStatuses.size() - 1){						
						PtfPtfStatus nextPtfPtfStatus = ptfPtfStatuses.get(i+1);
						endDate = Utils.ISO_DATE_FORMAT.format(nextPtfPtfStatus.getChangingDate());
					}
					if(ptfPtfStatus.getPtfStatus().getId() == 5 & ptf.getEndingDate() != null)
						startDate= Utils.ISO_DATE_FORMAT.format(ptf.getEndingDate());
					reportingStatus = progAffiliationType.addNewReportingStatus();
					reportingStatusType = reportingStatus.addNewReportingStatus();
					refType = reportingStatusType.addNewReportingStatus();
					refType.setHref("http://codes.wmo.int/wmdr/ReportingStatus/" + ptfPtfStatus.getPtfStatus().getWigosCode());
					
					timePeriodProperty = reportingStatusType.addNewValidPeriod();
					timePeriod = timePeriodProperty.addNewTimePeriod();
					timePeriod.setId(o.getId() + "-SCDTimePeriod-" + count);
					timePeriod.addNewBeginPosition().setStringValue(startDate);
					endTimePositionType = timePeriod.addNewEndPosition();
					if(endDate != null)
						endTimePositionType.setStringValue(endDate);
					
					reportingStatus.setReportingStatus(reportingStatusType);
					count++;
				}
			}
		}
		
		// OM_Observations
		this.getObservations(o, ptf);
				
		return o;
	}

	/**
	 * Builds the DeploymentType element
	 * @param pv a PtfVariable record
	 * @return The DeploymentType object built
	 */
	private DeploymentType getDeploymentType(PtfVariable pv){
		DeploymentType currentDeplType = DeploymentType.Factory.newInstance();

		currentDeplType.addNewBoundedBy().setNil();
		currentDeplType.setId("process-depl-" + pv.getId());
		currentDeplType.setDeployedEquipment(this.getEquipmentPropertyType(pv));

		TimePeriodPropertyType tppt = currentDeplType.addNewValidPeriod();
		TimePeriodType atotype = tppt.addNewTimePeriod();
		atotype.setId("omobs-timeperiod-validperiod-" + pv.getId());

		TimePositionType tptype = atotype.addNewBeginPosition();
		if(pv.getStartDate() != null)
			tptype.setStringValue(Utils.GetIsoDate(pv.getStartDate()));
		else
			tptype.setStringValue(Utils.GetIsoDate(pv.getPtf().getPtfDepl().getDeplDate()));
		tptype = atotype.addNewEndPosition();
		if(pv.getEndDate() != null)
			tptype.setStringValue(Utils.GetIsoDate(pv.getEndDate()));
		else if(pv.getPtf().getEndingDate() != null)
			tptype.setStringValue(Utils.GetIsoDate(pv.getPtf().getEndingDate()));
		
		currentDeplType.addNewDataGeneration();

		MeasureType mt = currentDeplType.addNewHeightAboveLocalReferenceSurface();
		mt.setUom("m");
		if (pv.getHeight() != null)
			mt.setDoubleValue(pv.getHeight());
		else
			mt.setDoubleValue(0.0);

		currentDeplType.addNewLocalReferenceSurface();
		currentDeplType.addNewApplicationArea();
		currentDeplType.addNewSourceOfObservation();

		return currentDeplType;
	}

	/**
	 * Builds the OMObservationPropertyType list for the given platform.
	 * 
	 * @param ptf The Ptf entity object from which data should be extracted
	 * @return the OMObservationPropertyType of the platform
	 */
	private ObservingCapabilityPropertyType[] getObservations(ObservingFacilityType o, Ptf ptf) {
		ObservingCapabilityPropertyType ocp = null; 
		ObservingCapabilityType oc = null;
		List<PtfVariable> ptfVariables = ptf.getPtfVariables();
		ptfVariables.sort((a,b) -> a.getVariable().getId().compareTo(b.getVariable().getId()));
		Variable currentVar = null;
		for (PtfVariable pv : ptfVariables) {
			SensorModel sm = pv.getSensorModel();
			if (sm != null && pv.getVariable().getWigosCode() != null) {
				ReferenceType refType;
				// Different sensors measuring the same variable are listed under the same variable entry in WIGOS
				if(currentVar == null || !currentVar.equals(pv.getVariable())){
					currentVar = pv.getVariable();
					ocp = o.addNewObservation();
					oc = ocp.addNewObservingCapability();
					oc.addNewBoundedBy().setNil();
					oc.setId("oc-" + pv.getId());
					refType = ReferenceType.Factory.newInstance();
					refType.setHref(getWIGOSIdentifier(ptf));
					oc.setFacility(refType);

					refType = oc.addNewProgramAffiliation();
					refType.setHref("http://codes.wmo.int/wmdr/ProgramAffiliation/" + ptf.getProgram().getWigosCode());
				}
				// Adding to the same ObservingCapability if same variable, otherwise a new one would have been created
				OMObservationPropertyType omobsp = oc.addNewObservation();
				OMObservationType omobs = omobsp.addNewOMObservation();
				omobs.addNewBoundedBy().setNil();
				omobs.setId("omobs-" + pv.getId());

				omobs.addNewObservedProperty().setHref(currentVar.getWigosCode());

				// Procedure relationship from OM:obs is linked to wmdr:Process, which inherits from OM:Process
				// Creating relationship
				OMProcessPropertyType omProcessType = omobs.addNewProcedure();
				// Creating wmdr:Process
				ProcessDocument processDocument = ProcessDocument.Factory.newInstance();
				ProcessType process = processDocument.addNewProcess2();
				process.addNewBoundedBy().setNil();
				process.setId("process-" + pv.getId());
				DeploymentPropertyType deplP = DeploymentPropertyType.Factory.newInstance();
				DeploymentType depl = this.getDeploymentType(pv);
				deplP.setDeployment(depl);
				process.setDeployment(deplP);
				// Overwriting OM:Process with wmdr:Process
				omProcessType.set(processDocument);				

				omobs.addNewType().setHref("http://codes.wmo.int/wmdr/featureOfInterest/point");

				TimePeriodPropertyType tppt = TimePeriodPropertyType.Factory.newInstance();
				TimePeriodType atotype = tppt.addNewTimePeriod();
				atotype.setId("omobs-timeperiod-" + pv.getId());
				atotype.addNewBeginPosition().setStringValue(Utils.GetIsoDate(ptf.getPtfDepl().getDeplDate()));
				atotype.addNewEndPosition();
				// Overwriting AbstractTimePeriod with TimePeriod
				omobs.addNewPhenomenonTime().set(tppt);

				omobs.addNewFeatureOfInterest().setNil();
				omobs.addNewResultTime();
				omobs.addNewValidTime();
				omobs.addNewResultQuality();
				omobs.addNewResult();

				sensorIncrement++;
			}			
		}

		return o.getObservationArray();
	}

	/**
	 * Marshaller method of this class. Converts a WIGOSMetadataRecord object to its String XML representation.
	 */
	public String toString() {
        return this.rootElement.xmlText();
    }
}

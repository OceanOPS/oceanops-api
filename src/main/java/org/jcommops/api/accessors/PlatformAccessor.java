package org.jcommops.api.accessors;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.CayenneRuntimeException;
import org.apache.cayenne.DataObjectUtils;
import org.apache.cayenne.DataRow;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.map.EntityResult;
import org.apache.cayenne.map.SQLResult;
import org.apache.cayenne.query.SQLTemplate;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.Utils;
import org.jcommops.api.entities.AgencyPrg;
import org.jcommops.api.entities.Configuration;
import org.jcommops.api.entities.ContactPrg;
import org.jcommops.api.entities.CountryPtf;
import org.jcommops.api.entities.MasterProgramPtf;
import org.jcommops.api.entities.NetworkPtf;
import org.jcommops.api.entities.Platform;
import org.jcommops.api.entities.PlatformDeploy;
import org.jcommops.api.entities.PlatformFamily;
import org.jcommops.api.entities.PlatformLastLoc;
import org.jcommops.api.entities.PlatformModel;
import org.jcommops.api.entities.PlatformStatus;
import org.jcommops.api.entities.PlatformType;
import org.jcommops.api.entities.ProgramPtf;
import org.jcommops.api.entities.SensorModel;
import org.jcommops.api.entities.SensorType;
import org.jcommops.api.entities.Telecom;
import org.jcommops.api.entities.Variable;
import org.jcommops.api.orm.Config;
import org.jcommops.api.orm.Contact;
import org.jcommops.api.orm.Country;
import org.jcommops.api.orm.MasterProg;
import org.jcommops.api.orm.Network;
import org.jcommops.api.orm.Program;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfDeployment;
import org.jcommops.api.orm.PtfFamily;
import org.jcommops.api.orm.PtfHardware;
import org.jcommops.api.orm.PtfIdentifiers;
import org.jcommops.api.orm.PtfLoc;
import org.jcommops.api.orm.PtfModel;
import org.jcommops.api.orm.PtfStatus;
import org.jcommops.api.orm.PtfType;
import org.jcommops.api.orm.Ship;

import javassist.bytecode.analysis.Util;

public class PlatformAccessor {
	private ServerRuntime runtime = Utils.getCayenneRuntime();
	private ObjectContext context = Utils.getCayenneRuntime().getContext();

	public PlatformAccessor() {
		this.runtime = Utils.getCayenneRuntime();
		this.context = this.runtime.getContext();
	}
	
	/**
	 * Build the list of platform IDs/REFs.
	 * @return The list of Platform objects, filled with ID and REF only.
	 */
	public ArrayList<Platform> getAllPtfIdsRefs() { 
		// Fetching row data to increase performance/memory consumption
		SQLTemplate query = new SQLTemplate(Ptf.class, "select id, ref from PTF"); 
		query.setFetchingDataRows(true);
		List<DataRow> rows = context.performQuery(query);

		ArrayList<Platform> ptfs_list = new ArrayList<Platform>();

		Iterator<DataRow> ptf_itr = rows.iterator();

		while (ptf_itr.hasNext()) {
			DataRow row = ptf_itr.next();
			Platform ptf = new Platform();
			ptf.setId((Integer)row.get("ID"));
			ptf.setJcommopsRef((String)row.get("REF"));
			ptfs_list.add(ptf);
		}

		return ptfs_list;

	}

	/**
	 * Build the list of platforms.
	 * @return The list of Platform objects.
	 */
	public ArrayList<Platform> getAllPtfs() {

		SelectQuery query = new SelectQuery(Ptf.class);
		List<Ptf> platforms = context.performQuery(query);

		ArrayList<Platform> ptfs_list = new ArrayList<Platform>();

		Iterator<Ptf> ptf_itr = platforms.iterator();

		while (ptf_itr.hasNext()) {
			Ptf a = ptf_itr.next();
			Platform ptf = new Platform();
			ptf.setId(Cayenne.longPKForObject(a));
			ptf.setJcommopsRef(a.getRef());
			ptfs_list.add(ptf);
		}

		return ptfs_list;

	}

	/**
	 * Build the reference list of statuses.
	 * @return The list of PlatformStatus objects.
	 */
	public ArrayList<PlatformStatus> getPtfStatuses() {// List of Statuses
		SelectQuery Status_query = new SelectQuery(PtfStatus.class);
		List<PtfStatus> statuses = context.performQuery(Status_query);

		ArrayList<PlatformStatus> statuses_list = new ArrayList<PlatformStatus>();

		Iterator<PtfStatus> statuses_itr = statuses.iterator();

		while (statuses_itr.hasNext()) {
			PtfStatus a = statuses_itr.next();
			PlatformStatus status = new PlatformStatus();
			status.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			status.setNameShort(a.getNameShort());
			status.setName(a.getName());
			status.setDescription(a.getDescription());
			statuses_list.add(status);
		}
		return statuses_list;

	}

	public ArrayList<PlatformFamily> getPtfFamilies() { // List of platforms'
														// families
		SelectQuery Family_query = new SelectQuery(PtfFamily.class);
		List<PtfFamily> families = context.performQuery(Family_query);

		ArrayList<PlatformFamily> families_list = new ArrayList<PlatformFamily>();

		Iterator<PtfFamily> families_itr = families.iterator();

		while (families_itr.hasNext()) {
			PtfFamily a = families_itr.next();
			PlatformFamily family = new PlatformFamily();
			family.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			family.setNameShort(a.getNameShort());
			family.setName(a.getName());
			family.setDescription(a.getDescription());
			families_list.add(family);
		}

		return families_list;

	}

	public ArrayList<PlatformType> getPtfTypes() { // List of platforms' types
		SelectQuery Type_query = new SelectQuery(PtfType.class);
		List<PtfType> types = context.performQuery(Type_query);

		ArrayList<PlatformType> types_list = new ArrayList<PlatformType>();

		Iterator<PtfType> types_itr = types.iterator();

		while (types_itr.hasNext()) {
			PtfType a = types_itr.next();
			PlatformType type = new PlatformType();
			type.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			type.setNameShort(a.getNameShort());
			type.setName(a.getName());
			type.setDescription(a.getDescription());
			types_list.add(type);
		}
		return types_list;

	}

	public ArrayList<PlatformModel> getPtfModels() { // List of platforms'
														// models
		SelectQuery Model_query = new SelectQuery(PtfModel.class);
		List<PtfModel> models = context.performQuery(Model_query);

		ArrayList<PlatformModel> models_list = new ArrayList<PlatformModel>();

		Iterator<PtfModel> models_itr = models.iterator();

		while (models_itr.hasNext()) {
			PtfModel a = models_itr.next();
			PlatformModel model = new PlatformModel();
			model.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			model.setNameShort(a.getNameShort());
			model.setName(a.getName());
			model.setDescription(a.getDescription());
			models_list.add(model);
		}
		return models_list;

	}

	public ArrayList<ProgramPtf> getProgramPtf() { // List of platforms'
													// programs
		SelectQuery ProgramPtf_query = new SelectQuery(Program.class);
		List<Program> programs = context.performQuery(ProgramPtf_query);

		ArrayList<ProgramPtf> programs_list = new ArrayList<ProgramPtf>();

		Iterator<Program> programs_itr = programs.iterator();

		while (programs_itr.hasNext()) {
			Program a = programs_itr.next();
			ProgramPtf program = new ProgramPtf();
			program.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			program.setNameShort(a.getNameShort());
			program.setName(a.getName());
			program.setDescription(a.getDescription());
			programs_list.add(program);
		}
		return programs_list;

	}

	public ArrayList<MasterProgramPtf> getMasterProgram() { // List of
															// platforms' master
															// programs
		SelectQuery MasterProgram_query = new SelectQuery(MasterProg.class);
		List<MasterProg> mprograms = context.performQuery(MasterProgram_query);

		ArrayList<MasterProgramPtf> mprograms_list = new ArrayList<MasterProgramPtf>();

		Iterator<MasterProg> mprograms_itr = mprograms.iterator();

		while (mprograms_itr.hasNext()) {
			MasterProg a = mprograms_itr.next();
			MasterProgramPtf mprogram = new MasterProgramPtf();
			mprogram.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			mprogram.setNameShort(a.getNameShort());
			mprogram.setName(a.getName());
			mprogram.setDescription(a.getDescription());
			mprograms_list.add(mprogram);
		}
		return mprograms_list;

	}

	public ArrayList<NetworkPtf> getPtfNetworks() { // List of platforms'
													// Networks
		SelectQuery Network_query = new SelectQuery(Network.class);
		List<Network> networks = context.performQuery(Network_query);

		ArrayList<NetworkPtf> networks_list = new ArrayList<NetworkPtf>();

		Iterator<Network> networks_itr = networks.iterator();

		while (networks_itr.hasNext()) {
			Network a = networks_itr.next();
			NetworkPtf network = new NetworkPtf();
			network.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			network.setNameShort(a.getNameShort());
			network.setName(a.getName());
			network.setDescription(a.getDescription());
			networks_list.add(network);
		}
		return networks_list;

	}

	public ArrayList<SensorModel> getPtfSensorModel() { // List of platforms'
														// sensors model
		SelectQuery SensModel_query = new SelectQuery(org.jcommops.api.orm.SensorModel.class);
		List<org.jcommops.api.orm.SensorModel> SensModels = context.performQuery(SensModel_query);

		ArrayList<SensorModel> SensModels_list = new ArrayList<SensorModel>();

		Iterator<org.jcommops.api.orm.SensorModel> SensModels_itr = SensModels.iterator();

		while (SensModels_itr.hasNext()) {
			org.jcommops.api.orm.SensorModel a = SensModels_itr.next();
			SensorModel SensModel = new SensorModel();
			SensModel.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			SensModel.setNameShort(a.getNameShort());
			SensModel.setName(a.getName());
			SensModel.setDescription(a.getDescription());
			SensModels_list.add(SensModel);
		}
		return SensModels_list;

	}

	public ArrayList<SensorType> getPtfSensorType() { // List of platforms'
														// sensors type
		SelectQuery SensType_query = new SelectQuery(org.jcommops.api.orm.SensorType.class);
		List<org.jcommops.api.orm.SensorType> SensTypes = context.performQuery(SensType_query);

		ArrayList<SensorType> SensTypes_list = new ArrayList<SensorType>();

		Iterator<org.jcommops.api.orm.SensorType> SensTypes_itr = SensTypes.iterator();

		while (SensTypes_itr.hasNext()) {
			org.jcommops.api.orm.SensorType a = SensTypes_itr.next();
			SensorType SensType = new SensorType();
			SensType.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			SensType.setNameShort(a.getNameShort());
			SensType.setName(a.getName());
			SensType.setDescription(a.getDescription());
			SensTypes_list.add(SensType);
		}
		return SensTypes_list;

	}

	public ArrayList<Variable> getPtfVariables() { // List of platforms'
													// variables

		SelectQuery Variable_query = new SelectQuery(org.jcommops.api.orm.Variable.class);
		List<org.jcommops.api.orm.Variable> Variables = context.performQuery(Variable_query);

		ArrayList<Variable> Variables_list = new ArrayList<Variable>();

		Iterator<org.jcommops.api.orm.Variable> Variables_itr = Variables.iterator();

		while (Variables_itr.hasNext()) {
			org.jcommops.api.orm.Variable a = Variables_itr.next();
			Variable var = new Variable();
			var.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			var.setNameShort(a.getNameShort());
			var.setName(a.getName());
			var.setDescription(a.getDescription());
			Variables_list.add(var);
		}
		return Variables_list;

	}

	public ArrayList<CountryPtf>getPtfCountries() { // List of platforms'
		// variables

		SelectQuery Country_query = new SelectQuery(Country.class);
		List<Country> countries = context.performQuery(Country_query);

		ArrayList<CountryPtf> countries_list = new ArrayList<CountryPtf>();

		Iterator<Country> countries_itr = countries.iterator();

		while (countries_itr.hasNext()) {
			Country a = countries_itr.next();
			CountryPtf c = new CountryPtf();
			c.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			c.setIsoCode2(a.getCode2());
			c.setIsoCode3(a.getCode3());
			c.setNameShort(a.getNameShort());
			c.setName(a.getName());
			countries_list.add(c);
		}
		return countries_list;

	}

	public Platform getPtfbyID(long id) {// Platform's details by ID

		Ptf platform = Cayenne.objectForPK(context, Ptf.class, id); // Get the
																	// platform
		// Create and select the attributs and or object to "platform"
		Platform ptf = new Platform();
		try {
			ptf.setId(id);
		} catch (NullPointerException n) {
			ptf.setId(-1);
			ptf.setError_message("Invalid ID. The ID " + id + " doesn't correspond to a registered platform.");

		}
		try {
			ptf.setJcommopsRef(platform.getRef());
		} catch (Exception e) {
			ptf.setJcommopsRef("Platform not referenced yet!");
		}
		// Methodes
		MethodsAssociativeTables MAT = new MethodsAssociativeTables();
		// Add embedded objects one by one
		// 0.5) embedded object"Telecom"
		Telecom telc = new Telecom();
		// 1) embedded object"PlatformStatus"
		PlatformStatus ptfs = new PlatformStatus();
		// 2) embedded object"PlatformModel"
		PlatformModel ptfm = new PlatformModel();
		// 3) embedded object"PlatformFamily"
		PlatformFamily ptff = new PlatformFamily();
		// 4) embedded object"PlatformFamily"
		PlatformType ptft = new PlatformType();
		// 5) embedded object"PlatformLastLoc"
		PlatformLastLoc ptfll = new PlatformLastLoc();
		// 6) embedded object"PlatformDeploy"
		PlatformDeploy ptfdpl = new PlatformDeploy();
		// 7) embedded object"Program"
		ProgramPtf prgm = new ProgramPtf();
		// 7.1) embedded object"Agency"
		AgencyPrg agency = new AgencyPrg();
		// 8) embedded object"Country"
		CountryPtf country = new CountryPtf();
		// 9) embedded object"Master Programme"
		MasterProgramPtf masterprg = new MasterProgramPtf();
		// 10) embedded object"Contacts"
		ArrayList<ContactPrg> contacts = new ArrayList<ContactPrg>();
		// 10.1) embedded object"Role"
		// 10.2) embedded object"Role"

		try {

			ptf.setNotificationDate(Utils.GetIsoDate(platform.getENotificationDate()));
		} catch (Exception e) {
			ptf.setNotificationDate("");
		}
		try {
			ptf.setEndingDate(Utils.GetIsoDate(platform.getEndingDate()));
		} catch (Exception e) {
			ptf.setEndingDate("");
		}
		try {
			ptf.setAge(platform.getAge().toString());
		} catch (Exception e) {
			ptf.setEndingDate("");
		}

		try {
			// 1.0) embedded object"Telecom"
			String stringIDptfTelc = platform.getToTelecom1().getObjectId().toString();
			org.jcommops.api.orm.Telecom telecom = Cayenne.objectForPK(context, org.jcommops.api.orm.Telecom.class,
					Utils.ConvertIDStringtoLong(stringIDptfTelc));

			telc.setId(Cayenne.longPKForObject(telecom));
			telc.setTelecomType(telecom.getToTelecomType().getName());
			ptf.setTelecom(telc);
		} catch (Exception e) {
			telc.setTelecomType("");
			ptf.setTelecom(telc);
		}
		// Ajouter à platform
		try {
			// 1.0.1) embedded String attribute InternalRef (from
			// Ptf_Identifiers)
			String stringIDptfIdent = platform.getToPtfIdentifiers().getObjectId().toString();
			PtfIdentifiers Identifiers = Cayenne.objectForPK(context, PtfIdentifiers.class,
					Utils.ConvertIDStringtoLong(stringIDptfIdent));
			// Ajouter à platform
			ptf.setInternalRef(Identifiers.getInternalRef());
		} catch (Exception e) {
			ptf.setInternalRef("");
		}
		try {
			// 1.0.2) embedded String attribute SerialRef (from
			// Ptf_Hardware)
			String stringIDptfHard = platform.getToPtfHardware().getObjectId().toString();
			PtfHardware hardw = Cayenne.objectForPK(context, PtfHardware.class,
					Utils.ConvertIDStringtoLong(stringIDptfHard));
			// Ajouter à platform
			ptf.setSerialRef(hardw.getSerialRef());
		} catch (Exception e) {
			ptf.setSerialRef("");
		}

		try {
			// 1.1) embedded object"PlatformStatus"
			String stringIDptfs = platform.getToPtfStatus().getObjectId().toString();
			PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class,
					Utils.ConvertIDStringtoLong(stringIDptfs));
			ptfs.setId(Cayenne.longPKForObject(platformstatus));
			ptfs.setNameShort(platformstatus.getDescription());
			// Ajouter à platform
			ptf.setPtfStatus(ptfs);
		} catch (Exception e) {
			ptfs.setNameShort("");
			ptf.setPtfStatus(ptfs);

		}
		try {
			// 2) embedded object"PlatformModel"
			String stringIDptfm = platform.getToPtfModel().getObjectId().toString();
			PtfModel platformmodel = Cayenne.objectForPK(context, PtfModel.class,
					Utils.ConvertIDStringtoLong(stringIDptfm));

			ptfm.setId(Cayenne.longPKForObject(platformmodel));
			ptfm.setNameShort(platformmodel.getNameShort());
			ptfm.setName(platformmodel.getName());
			ptfm.setDescription(platformmodel.getDescription());
			// Ajouter à platform
			ptf.setPtfModel(ptfm);

			// 3) embedded object"PlatformType"
			PtfModel platformm = Cayenne.objectForPK(context, PtfModel.class, Cayenne.longPKForObject(platformmodel));
			String stringIDptft = platformm.getToPtfType().getObjectId().toString();
			PtfType platformtype = Cayenne.objectForPK(context, PtfType.class,
					Utils.ConvertIDStringtoLong(stringIDptft));
			ptft.setId(Cayenne.longPKForObject(platformtype));
			ptft.setNameShort(platformtype.getNameShort());
			ptft.setName(platformtype.getName());
			ptft.setDescription(platformtype.getDescription());
			// Ajouter à platform
			ptf.setPtfType(ptft);

			// 4) embedded object"PlatformFamily"
			PtfType platformt = Cayenne.objectForPK(context, PtfType.class, Cayenne.longPKForObject(platformtype));
			String stringIDptff = platformt.getToPtfFamily().getObjectId().toString();
			PtfFamily platformfamily = Cayenne.objectForPK(context, PtfFamily.class,
					Utils.ConvertIDStringtoLong(stringIDptff));
			ptff.setId(Cayenne.longPKForObject(platformfamily));
			ptff.setNameShort(platformfamily.getNameShort());
			ptff.setName(platformfamily.getName());
			ptff.setDescription(platformfamily.getDescription());
			ptf.setPtfFamily(ptff);
		} catch (Exception e) {
			ptfm.setNameShort("");
			ptfm.setName("");
			ptfm.setDescription("");
			ptf.setPtfModel(ptfm);
			// Ajouter à platform
			ptf.setPtfModel(ptfm);

			ptft.setNameShort("");
			ptft.setName("");
			ptft.setDescription("");
			ptf.setPtfType(ptft);
			// Ajouter à platform
			ptf.setPtfType(ptft);

			ptff.setNameShort("");
			ptff.setName("");
			ptff.setDescription("");
			ptf.setPtfFamily(ptff);
			// Ajouter à platform
			ptf.setPtfFamily(ptff);

		}

		// 5) embedded object"PlatformLastLoc"
		// PlatformLastLoc ptfll = new PlatformLastLoc();
		try {
			String stringIDptfll = platform.getToPtfLoc().getObjectId().toString();
			PtfLoc platformlastloc = Cayenne.objectForPK(context, PtfLoc.class,
					Utils.ConvertIDStringtoLong(stringIDptfll));
			ptfll.setId(Cayenne.longPKForObject(platformlastloc));
			ptfll.setLat(platformlastloc.getLat());
			ptfll.setLon(platformlastloc.getLon());
			ptfll.setLastLocationDate(Utils.GetIsoDate(platformlastloc.getLocDate()));
			// Ajouter à platform
			ptf.setLastLocation(ptfll);
		} catch (Exception e) {
			ptfll.setLat(null);
			ptfll.setLon(null);
			ptfll.setLastLocationDate("");
			// Ajouter à platform
			ptf.setLastLocation(ptfll);
		}
		try {
			// 6) embedded object"PlatformDeploy"
			// PlatformDeploy ptfdpl = new PlatformDeploy();

			String query_depl = "select * from PTF_DEPLOYMENT where id in(select PTF_DEPL_ID from ptf where id='" + id
					+ "')";
			SQLTemplate query_search = new SQLTemplate(PtfDeployment.class, query_depl);
			List<PtfDeployment> listdepl = context.performQuery(query_search);

			ptfdpl.setId(Cayenne.longPKForObject(listdepl.get(0)));
			ptfdpl.setDeployementDate(Utils.GetIsoDate(listdepl.get(0).getDeplDate()));
			ptfdpl.setLat(listdepl.get(0).getLat());
			ptfdpl.setLon(listdepl.get(0).getLon());
			ptfdpl.setDeployementDensity(listdepl.get(0).getDensity());
			ptfdpl.setDeployementScore(listdepl.get(0).getScore());
			ptfdpl.setShipName(listdepl.get(0).getShipName());
			ptfdpl.setCruiseName(listdepl.get(0).getCruiseName());

			try {
				String stringRefShip = listdepl.get(0).getToShip().getObjectId().toString();
				Ship ship = Cayenne.objectForPK(context, Ship.class, Utils.ConvertIDStringtoLong(stringRefShip));
				ptfdpl.setShipRef(ship.getRef());

			} catch (Exception e) {
				ptfdpl.setShipRef("");
			}

			// Ajouter à platform

		} catch (Exception e) {
			ptfdpl.setDeployementDate("");
			ptfdpl.setLat(null);
			ptfdpl.setLon(null);
			ptfdpl.setDeployementDensity(null);
			ptfdpl.setDeployementScore(null);
			ptfdpl.setShipName("");
			ptfdpl.setCruiseName("");

		}
		ptf.setDeployement(ptfdpl);

		// 7) embedded object"Program"
		// Program prgm = new Program();
		try {
			String stringIDprg = platform.getToProgram().getObjectId().toString();
			org.jcommops.api.orm.Program ptfprogram = Cayenne.objectForPK(context, org.jcommops.api.orm.Program.class,
					Utils.ConvertIDStringtoLong(stringIDprg));
			prgm.setActive(ptfprogram.getActive());
			prgm.setDescription(ptfprogram.getDescription());
			prgm.setId(Cayenne.longPKForObject(ptfprogram));
			prgm.setName(ptfprogram.getName());
			prgm.setNameShort(ptfprogram.getNameShort());
			// 7.1) l'objet "sous-imbriqué" "Agency" (to program)
			prgm.setAgencies(MAT.FindProgramAgencies(Cayenne.longPKForObject(ptfprogram)));//
			ptf.setProgram(prgm);

			// 8) embedded object"Country"
			// CountryPtf country= new CountryPtf();
			String stringIDcountry = ptfprogram.getToCountry().getObjectId().toString();
			Country ptfcountry = Cayenne.objectForPK(context, Country.class,
					Utils.ConvertIDStringtoLong(stringIDcountry));
			country.setId(Cayenne.longPKForObject(ptfcountry));
			country.setName(ptfcountry.getName());
			country.setIsoCode2(ptfcountry.getCode2());
			country.setIsoCode3(ptfcountry.getCode3());
			ptf.setCountry(country);

			// System.out.println(ptfcountry.getName());

			// 9) embedded object"Master Programme"
			// CountryPtf country= new CountryPtf();
			String stringIDmasterprg = ptfprogram.getToMasterProg().getObjectId().toString();
			MasterProg ptfmastprg = Cayenne.objectForPK(context, MasterProg.class,
					Utils.ConvertIDStringtoLong(stringIDmasterprg));
			masterprg.setId(Cayenne.longPKForObject(ptfmastprg));
			masterprg.setName(ptfmastprg.getName());
			masterprg.setNameShort(ptfmastprg.getNameShort());
			ptf.setMasterProgramme(masterprg);

			// 10) embedded object"Contacts"

			// 10.1) embedded object"Role"
			// 10.2) embedded object"Agency"
			contacts = MAT.FindProgramContacts(Cayenne.longPKForObject(ptfprogram));//
			ptf.setContacts(contacts);
		} catch (Exception e) {

		}
		// Ajouter à Platform
		ptf.setProgram(prgm);
		ptf.setCountry(country);
		ptf.setMasterProgramme(masterprg);
		ptf.setContacts(contacts);

		// 11) embedded object"Configuration"
		Configuration config = new Configuration();

		try {
			String query_config = " select * from CONFIG where ID IN "
					+ "(select CONFIG_ID from PTF_CONFIG  where PTF_ID='" + id + "')";
			SQLTemplate query_search = new SQLTemplate(Config.class, query_config);
			List<Config> listconfig = context.performQuery(query_search);
			config.setId(Cayenne.longPKForObject(listconfig.get(0)));
			config.setCycleTime(listconfig.get(0).getCycleTime());
			config.setDriftPressure(listconfig.get(0).getDriftPress());
			config.setProfilePressure(listconfig.get(0).getProfilePress());
			config.setIceDetection(listconfig.get(0).getIceDetection());
		} catch (Exception e) {

		}
		// Ajouter à platform
		ptf.setConfiguration(config);

		// 12) embedded object"sensorModel"
		SensorModel sensorm = new SensorModel();

		try {
			String query_sensorm = " select * from SENSOR_MODEL where ID IN "
					+ "(select SENSOR_MODEL_ID from PTF_SENSOR_MODEL where PTF_ID='" + id + "')";
			SQLTemplate query_search = new SQLTemplate(org.jcommops.api.orm.SensorModel.class, query_sensorm);
			List<org.jcommops.api.orm.SensorModel> listsensorm = context.performQuery(query_search);
			sensorm.setId(Cayenne.longPKForObject(listsensorm.get(0)));
			sensorm.setNameShort(listsensorm.get(0).getNameShort());
		}

		catch (Exception e) {

		}

		// 13) embedded object"sensorType"
		ArrayList<SensorType> sensort_list = new ArrayList<SensorType>();

		try {
			String query_sensort = " select * from SENSOR_TYPE where ID IN "
					+ "(select SENSOR_TYPE_ID from SENSOR_MODEL_SENSOR_TYPE where SENSOR_MODEL_ID='" + sensorm.getId()
					+ "')";
			SQLTemplate query_searcht = new SQLTemplate(org.jcommops.api.orm.SensorType.class, query_sensort);
			List<org.jcommops.api.orm.SensorType> listsensort = context.performQuery(query_searcht);
			int i = 0;
			while (i < listsensort.size()) {
				SensorType sensort = new SensorType();
				sensort.setId(Cayenne.longPKForObject(listsensort.get(i)));
				sensort.setNameShort(listsensort.get(i).getNameShort());
				i++;
				sensort_list.add(sensort);
			}

		}

		catch (Exception e) {

		}
		// Ajouter sensor types à sensor model
		sensorm.setSensorTypes(sensort_list);
		// Ajouter sensor model à platform
		ptf.setSensorModel(sensorm);

		// 14) embedded object"Variables"
		ArrayList<Variable> variables = new ArrayList<Variable>();
		try {

			variables = MAT.FindPtfVariables(id);
		} catch (Exception e) {

		}
		ptf.setVariables(variables);

		return ptf;

	}

	public ArrayList<Platform> getPtfbySelectedParam(String ptf_status, String ptf_family, String ptf_type,
			String ptf_model, String program, String network, String ptf_masterprg, String variable, String sensormod,
			String sensortyp, String ship, String country) {

		// QUERY PARAMETERS
		String query_model = "";
		String query_type = "";
		String query_family = "";
		String query_status = "";
		String query_program = "";
		String query_network = "";
		String query_masterprg = "";
		String query_ship = "";
		String query_country = "";
		String query_sensormod = "";
		String query_sensortyp = "";
		String query_variable = "";

		int intersect_index = 0;

		if (ptf_model != null && !ptf_model.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(ptf_model) == true) {// Check if it is
																// an integer ID
				query_model = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where ID  IN  (" + ptf_model + "))";
			} else {// Else it is a short name
				query_model = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(ptf_model.toUpperCase()) + "'))";
			}
		}

		if (ptf_type != null && !ptf_type.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(ptf_type) == true) {// Check if it is
																// an integer ID
				query_type = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN  (" + ptf_type + "))";
			} else {// Else it is a short name
				query_type = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
						+ "(select ID from PTF_TYPE where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(ptf_type.toUpperCase()) + "')))";
			}

		}

		if (ptf_family != null && !ptf_family.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(ptf_family) == true) {// Check if it
																// is an integer
																// ID
				query_family = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
						+ "(select ID from PTF_TYPE  where PTF_FAMILY_ID IN  (" + ptf_family + ")))";
			} else {// Else it is a short name
				query_family = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
						+ "(select ID from PTF_TYPE  where PTF_FAMILY_ID IN "
						+ "(select ID from PTF_FAMILY where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(ptf_family.toUpperCase()) + "'))))";
			}
		}

		if (program != null && !program.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(program) == true) {// Check if it is
																// an integer ID
				query_program = "intersect" + " select * from PTF where program_ID IN(" + program + ")";
			} else {
				query_program = "intersect" + " select * from PTF where program_ID IN "
						+ "(select ID from program where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(program.toUpperCase()) + "'))";
			}
		}

		if (network != null && !network.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(network) == true) {// Check if it is
																// an integer ID
				query_network = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from NETWORK_PTF where NETWORK_ID IN (" + network + "))";
			} else {
				query_network = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from NETWORK_PTF where NETWORK_ID IN "
						+ "(select ID from NETWORK where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(network.toUpperCase()) + "')))";
			}
		}

		if (ptf_masterprg != null && !ptf_masterprg.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(ptf_masterprg) == true) {// Check if
																	// it is an
																	// integer
				// ID
				query_masterprg = "intersect"
						+ " select * from PTF where Program_ID IN (select ID from Program where master_prog_id IN ("
						+ ptf_masterprg + "))";
			} else {
				query_masterprg = "intersect" + " select * from PTF where Program_ID IN "
						+ "(select ID from Program where master_prog_id IN "
						+ "(select ID from MASTER_PROG where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(ptf_masterprg.toUpperCase()) + "')))";
			}
		}

		if (ptf_status != null && !ptf_status.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(ptf_status) == true) {

				query_status = "intersect select * from PTF where PTF_STATUS_ID IN (" + ptf_status + ")";
			} else {
				query_status = "intersect select * from PTF where PTF_STATUS_ID IN (select ID from PTF_STATUS where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(ptf_status.toUpperCase()) + "'))";
			}

		}

		if (variable != null && !variable.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(variable) == true) {
				query_variable = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_VARIABLE where VARIABLE_ID IN (" + variable + "))";
			} else {
				query_variable = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_VARIABLE where VARIABLE_ID IN "
						+ "(select ID from VARIABLE where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(variable.toUpperCase()) + "')))";
			}

		}

		if (sensormod != null && !sensormod.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(sensormod) == true) {
				query_sensormod = "intersect" + " select * from PTF where ID IN (" + sensormod + "))";
			} else {
				query_sensormod = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
						+ "(select ID from SENSOR_MODEL where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(sensormod.toUpperCase()) + "')))";
			}

		}

		if (sensortyp != null && !sensortyp.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (Utils.CheckIntValueForSql(sensortyp) == true) {
				query_sensortyp = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
						+ "(select SENSOR_MODEL_ID from SENSOR_MODEL_SENSOR_TYPE where SENSOR_TYPE_ID IN(" + sensortyp
						+ ")))";
			} else {
				query_sensortyp = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
						+ "(select SENSOR_MODEL_ID from SENSOR_MODEL_SENSOR_TYPE where SENSOR_TYPE_ID IN "
						+ "(select ID from SENSOR_TYPE where UPPER(NAME_SHORT) IN ('"
						+ Utils.StrValueForSql(sensortyp.toUpperCase()) + "'))))";
			}
		}

		if (ship != null && !ship.isEmpty()) {// special case "Ship"
												// both name and ref are strings
			intersect_index = intersect_index + 1;
			/**
			 * if (Utils.CheckIntValueForSql(ship) == true) { query_ship =
			 * "intersect" + " select * from PTF where PTF_DEPL_ID IN (select ID
			 * from PTF_DEPLOYMENT where SHIP_ID IN(" + ship + ")) union" + "
			 * select * from PTF where PTF_DEPL_ID IN (select ID from
			 * PTF_DEPLOYMENT where UPPER(SHIP_NAME) IN (select name from SHIP
			 * where REF IN('" + ship +"')))"; System.out.println("I tested:
			 * "+ship.toUpperCase()+" value and it is int"); } else {
			 **/
			query_ship = "intersect"
					+ " ((select * from PTF where PTF_DEPL_ID IN (select ID from PTF_DEPLOYMENT where UPPER(SHIP_NAME) IN('"
					+ Utils.StrValueForSql(ship.toUpperCase()) + "'))) union"
					+ " (select * from PTF where PTF_DEPL_ID IN (select ID from PTF_DEPLOYMENT where UPPER(SHIP_NAME) IN (select name from SHIP where UPPER(REF) IN('"
					+ Utils.StrValueForSql(ship.toUpperCase()) + "')))))";
		}

		if (country != null && !country.isEmpty()) {
			intersect_index = intersect_index + 1;

			if (Utils.CheckIntValueForSql(country) == true) {
				query_country = "intersect"
						+ " select * from PTF where PROGRAM_ID IN (select ID from PROGRAM where COUNTRY_ID IN('"
						+ country + "'))";
			} else {
				query_country = "intersect ((select * from PTF where PROGRAM_ID  IN (select ID from PROGRAM where COUNTRY_ID IN (select ID from COUNTRY where UPPER(NAME_SHORT) IN('"
						+ Utils.StrValueForSql(country.toUpperCase()) + "'))))"
						+ " union (select * from PTF where PROGRAM_ID IN (select ID from PROGRAM where COUNTRY_ID IN (select ID from COUNTRY where UPPER(CODE2) IN('"
						+ Utils.StrValueForSql(country.toUpperCase()) + "')))))";
			}
		}

		String overall_query = query_model + query_type + query_family + query_status + query_program + query_network
				+ query_masterprg + query_variable + query_sensormod + query_sensortyp + query_ship + query_country;

		overall_query = overall_query.substring(10);// to omit the first
													// "intersect"
													// instruction ->10
													// characters

		SQLTemplate query_search = new SQLTemplate(Ptf.class, overall_query);
		List<Ptf> platforms = context.performQuery(query_search);

		ArrayList<Platform> ptfs_list = new ArrayList<Platform>();

		Iterator<Ptf> ptf_itr = platforms.iterator();

		while (ptf_itr.hasNext()) {
			Ptf a = ptf_itr.next();
			Platform ptf = new Platform();
			ptf.setId(Cayenne.longPKForObject(a));
			ptf.setJcommopsRef(a.getRef());
			ptfs_list.add(ptf);
		}

		return ptfs_list;
	}

	public String WritePtfCSV(long id) throws NullPointerException {
		String CVS;
		StringWriter strW = new StringWriter();

		Platform ptfm = getPtfbyID(id);
		strW.write(ptfm.getId() + ";" + Utils.CheckStringNull(ptfm.getJcommopsRef()) + ";"
				+ Utils.Checklong(ptfm.getTelecom().getId()) + ";"
				+ Utils.CheckStringNull(ptfm.getTelecom().getTelecomType()) + ";"
				+ Utils.CheckStringNull(ptfm.getInternalRef()) + ";" + Utils.CheckStringNull(ptfm.getSerialRef()) + ";"
				+ Utils.CheckStringNull(ptfm.getPtfFamily().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getPtfType().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getPtfModel().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getProgram().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getCountry().getName()) + ";"
				+ Utils.CheckStringNull((ptfm.getMasterProgramme().getName())) + ";"
				+ Utils.CheckStringNull(ptfm.getDeployement().getDeployementDate()) + ";"
				+ Utils.CheckBigDcm((ptfm.getDeployement().getLat())) + ";"
				+ Utils.CheckBigDcm(ptfm.getDeployement().getLon()) + ";"
				+ Utils.CheckBigDcm(ptfm.getDeployement().getDeployementScore()) + ";"
				+ Utils.CheckBigDcm(ptfm.getDeployement().getDeployementDensity()) + ";"
				+ Utils.CheckStringNull(ptfm.getNotificationDate()) + ";"
				+ Utils.CheckStringNull(ptfm.getDeployement().getShipName()) + ";"
				+ Utils.CheckStringNull(ptfm.getDeployement().getShipRef()) + ";"
				+ Utils.CheckStringNull(ptfm.getLastLocation().getLastLocationDate()) + ";"
				+ Utils.CheckBigDcm((ptfm.getLastLocation().getLat())) + ";"
				+ Utils.CheckBigDcm(ptfm.getLastLocation().getLon()) + ";" + Utils.CheckStringNull(ptfm.getAge()) + ";"
				+ Utils.CheckBigDcm(ptfm.getConfiguration().getCycleTime()) + ";"
				+ Utils.CheckBigDcm(ptfm.getConfiguration().getProfilePressure()) + ";"
				+ Utils.CheckBigDcm(ptfm.getConfiguration().getDriftPressure()) + ";"
				+ Utils.CheckInt(ptfm.getConfiguration().getIceDetection()) + ";"
				+ Utils.CheckStringNull(ptfm.getSensorModel().getNameShort()) + ";"
				+ Utils.GetSensorTypesListToString(ptfm.getSensorModel().getSensorTypes()) + ";"
				+ Utils.CheckStringNull(Utils.GetVariablesListToString(ptfm.getVariables())) + ";" + "\n");

		CVS = strW.toString();
		return CVS;

	}

}

package org.jcommops.api.accessors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SQLTemplate;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.Utils;
import org.jcommops.api.entities.AgencyPrg;
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
import org.jcommops.api.entities.Variable;
import org.jcommops.api.orm.Country;
import org.jcommops.api.orm.MasterProg;
import org.jcommops.api.orm.Network;
import org.jcommops.api.orm.Program;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfDeployment;
import org.jcommops.api.orm.PtfFamily;
import org.jcommops.api.orm.PtfLoc;
import org.jcommops.api.orm.PtfModel;
import org.jcommops.api.orm.PtfStatus;
import org.jcommops.api.orm.PtfType;

public class PlatformAccessor {
	private ServerRuntime runtime = Utils.getCayenneRuntime();
	private ObjectContext context = Utils.getCayenneRuntime().getContext();

	public PlatformAccessor() {
		this.runtime = Utils.getCayenneRuntime();
		this.context = this.runtime.getContext();
	}

	public ArrayList<Platform> getAllPtfs() { // "PRINCIPAL" List of Platforms

		SelectQuery query = new SelectQuery(Ptf.class);
		List<Ptf> platforms = context.performQuery(query);

		ArrayList<Platform> ptfs_list = new ArrayList<Platform>();

		Iterator<Ptf> ptf_itr = platforms.iterator();

		while (ptf_itr.hasNext()) {
			Ptf a = ptf_itr.next();
			Platform ptf = new Platform();
			ptf.setId(Cayenne.longPKForObject(a));
			ptf.setJcommpsRef(a.getRef());
			ptfs_list.add(ptf);
		}

		return ptfs_list;

	}

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
														// Networks
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
														// Networks
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

	public ArrayList<Variable> getPtfVariables() { // List of platforms' variables
		
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

	public Platform getPtfbyID(long id) {// Platform's details by ID

		Ptf platform = Cayenne.objectForPK(context, Ptf.class, id); // Get the
																	// platform
		// Create and select the attributs and or object to "platform"
		Platform ptf = new Platform();
		try {
			ptf.setId(id);
			ptf.setJcommpsRef(platform.getRef());
		} catch (NullPointerException n) {
			ptf.setId(-1);
			ptf.setError_message("Invalid ID. The ID " + id + " doesn't correspond to a registered platform.");
			;
		}
		// Methodes
		MethodsAssociativeTables MAT = new MethodsAssociativeTables();
		// Add embedded objects one by one
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
		// 10) embedded object"Contact"
		// 10.1) embedded object"Role"
		// 10.2) embedded object"Role"

		try {
			ptf.getEndingDate();
			// 1) embedded object"PlatformStatus"
			String stringIDptfs = platform.getToPtfStatus().getObjectId().toString();
			PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class,
					Utils.ConvertIDStringtoLong(stringIDptfs));// Get the
																// platform
																// Status by its
																// PK
			ptfs.setId(Cayenne.longPKForObject(platformstatus));
			ptfs.setNameShort(platformstatus.getDescription());
			// Ajouter à platform
			ptf.setPtfStatus(ptfs);

			// 2) embedded object"PlatformModel"
			String stringIDptfm = platform.getToPtfModel().getObjectId().toString();
			PtfModel platformmodel = Cayenne.objectForPK(context, PtfModel.class,
					Utils.ConvertIDStringtoLong(stringIDptfm));// Get the
																// platform
																// Model by its
																// PK
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
					Utils.ConvertIDStringtoLong(stringIDptft));// Get
																// the
																// platform
																// Type
																// by
																// its
																// PK
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
					Utils.ConvertIDStringtoLong(stringIDptff));// Get the
																// platform
																// Family by its
																// PK
			ptff.setId(Cayenne.longPKForObject(platformfamily));
			ptff.setNameShort(platformfamily.getNameShort());
			ptff.setName(platformfamily.getName());
			ptff.setDescription(platformfamily.getDescription());
			ptf.setPtfFamily(ptff);

			// 5) embedded object"PlatformLastLoc"
			// PlatformLastLoc ptfll = new PlatformLastLoc();
			String stringIDptfll = platform.getToPtfLoc().getObjectId().toString();
			PtfLoc platformlastloc = Cayenne.objectForPK(context, PtfLoc.class,
					Utils.ConvertIDStringtoLong(stringIDptfll));// Get the
																// platform
																// Last Location
																// by its PK
			ptfll.setId(Cayenne.longPKForObject(platformlastloc));
			ptfll.setLat(platformlastloc.getLat());
			ptfll.setLon(platformlastloc.getLon());
			ptfll.setLastLocationDate(platformlastloc.getLocDate());
			// Ajouter à platform
			ptf.setLastLocation(ptfll);

			// 6) embedded object"PlatformDeploy"
			// PlatformDeploy ptfdpl = new PlatformDeploy();
			String stringIDptfdpl = platform.getToPtfDeployment().getObjectId().toString();
			PtfDeployment platformDeploy = Cayenne.objectForPK(context, PtfDeployment.class,
					Utils.ConvertIDStringtoLong(stringIDptfdpl));// Get the
																	// platform
																	// Deployment
																	// by
																	// its PK
			ptfdpl.setId(Cayenne.longPKForObject(platformDeploy));
			ptfdpl.setDeployementDate(platformDeploy.getDeplDate());
			ptf.setDeployement(ptfdpl);

			// 7) embedded object"Program"
			// Program prgm = new Program();

			String stringIDprg = platform.getToProgram().getObjectId().toString();
			org.jcommops.api.orm.Program ptfprogram = Cayenne.objectForPK(context, org.jcommops.api.orm.Program.class,
					Utils.ConvertIDStringtoLong(stringIDprg));// Get the
																// platform
																// Program by
																// its PK
			prgm.setActive(ptfprogram.getActive());
			prgm.setDescription(ptfprogram.getDescription());
			prgm.setId(Cayenne.longPKForObject(ptfprogram));
			prgm.setName(ptfprogram.getName());
			// 7.1) l'objet "sous-imbriqué" "Agency" (to program)
			prgm.setAgencies(MAT.FindProgramAgencies(Cayenne.longPKForObject(ptfprogram)));//
			ptf.setProgram(prgm);

			// 8) embedded object"Country"
			// CountryPtf country= new CountryPtf();
			String stringIDcountry = ptfprogram.getToCountry().getObjectId().toString();
			Country ptfcountry = Cayenne.objectForPK(context, Country.class,
					Utils.ConvertIDStringtoLong(stringIDcountry));// Get
																	// the
																	// platform
																	// country
																	// by
																	// its
																	// PK
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
					Utils.ConvertIDStringtoLong(stringIDmasterprg));// Get the
																	// platform
																	// country
																	// by its PK
			masterprg.setId(Cayenne.longPKForObject(ptfmastprg));
			masterprg.setName(ptfmastprg.getName());
			masterprg.setNameShort(ptfmastprg.getNameShort());
			ptf.setMasterProgramme(masterprg);

			// 10) embedded object"Contacts"
			ArrayList<ContactPrg> contacts = new ArrayList<ContactPrg>();
			// 10.1) embedded object"Role"
			// 10.2) embedded object"Agency"
			contacts = MAT.FindProgramContacts(Cayenne.longPKForObject(ptfprogram));//
			ptf.setContacts(contacts);

			// 11) embedded object"Variables"
			ArrayList<Variable> variables = new ArrayList<Variable>();
			variables = MAT.FindPtfVariables(id); // for reminder here id is ptf
													// id
			ptf.setVariables(variables);

		} catch (NullPointerException n) {

		}

		return ptf;

	}

	public ArrayList<Platform> getPtfbySelectedParam(String ptf_status, String ptf_family, String ptf_type,
			String ptf_model, String program, String network, String ptf_masterprg, String variable, String sensormod,
			String sensortyp) {

		// QUERY PARAMETERS
		String query_model = "";
		String query_type = "";
		String query_family = "";
		String query_status = "";
		String query_program = "";
		String query_network = "";
		String query_masterprg = "";
		String query_variable = "";
		String query_sensormod = "";
		String query_sensortyp = "";

		int intersect_index = 0;

		if (ptf_model != null && !ptf_model.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (ptf_model.matches("^-?\\d+$")) {// Check if it is an integer ID
				query_model = "intersect" + " select * from PTF where PTF_MODEL_ID= " + Integer.parseInt(ptf_model);
			} else {// Else it is a short name
				query_model = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where UPPER(NAME_SHORT)='" + ptf_model.toUpperCase() + "')";
			}
		}

		if (ptf_type != null && !ptf_type.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (ptf_type.matches("^-?\\d+$")) {// Check if it is an integer ID
				query_type = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID= " + Integer.parseInt(ptf_type) + ")";
			} else {// Else it is a short name
				query_type = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
						+ "(select ID from PTF_TYPE where UPPER(NAME_SHORT)='" + ptf_type.toUpperCase() + "'))";
			}

		}

		if (ptf_family != null && !ptf_family.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (ptf_family.matches("^-?\\d+$")) {// Check if it is an integer ID
				query_family = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
						+ "(select ID from PTF_TYPE  where PTF_FAMILY_ID=" + Integer.parseInt(ptf_family) + "))";
			} else {// Else it is a short name
				query_family = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
						+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
						+ "(select ID from PTF_TYPE  where PTF_FAMILY_ID IN "
						+ "(select ID from PTF_FAMILY where UPPER(NAME_SHORT)='" + ptf_family.toUpperCase() + "')))";
			}
		}

		if (program != null && !program.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (program.matches("^-?\\d+$")) {// Check if it is an integer ID
				query_program = "intersect" + " select * from PTF where program_ID" + Integer.parseInt(program);
			} else {
				query_program = "intersect" + " select * from PTF where program_ID IN "
						+ "(select ID from program where UPPER(NAME_SHORT)='" + program.toUpperCase() + "')";
			}
		}

		if (network != null && !network.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (network.matches("^-?\\d+$")) {// Check if it is an integer ID
				query_network = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from NETWORK_PTF where NETWORK_ID=" + Integer.parseInt(network) + ")";
			} else {
				query_network = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from NETWORK_PTF where NETWORK_ID IN "
						+ "(select ID from NETWORK where UPPER(NAME_SHORT)='" + network.toUpperCase() + "'))";
			}
		}

		if (ptf_masterprg != null && !ptf_masterprg.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (ptf_masterprg.matches("^-?\\d+$")) {// Check if it is an integer
													// ID
				query_masterprg = "intersect"
						+ " select * from PTF where Program_ID IN (select ID from Program where master_prog_id ="
						+ Integer.parseInt(ptf_masterprg) + ")";
			} else {
				query_masterprg = "intersect" + " select * from PTF where Program_ID IN "
						+ "(select ID from Program where master_prog_id IN "
						+ "(select ID from MASTER_PROG where UPPER(NAME_SHORT)='" + ptf_masterprg.toUpperCase() + "'))";
			}
		}

		if (ptf_status != null && !ptf_status.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (ptf_status.matches("^-?\\d+$")) {
				query_status = "intersect select * from PTF where PTF_STATUS_ID=" + Integer.parseInt(ptf_status);
			} else {
				query_status = "intersect select * from PTF where PTF_STATUS_ID IN (select ID from PTF_STATUS where UPPER(NAME_SHORT)='"
						+ ptf_status.toUpperCase() + "')";
			}

		}

		if (variable != null && !variable.isEmpty()) {
			intersect_index = intersect_index + 1;
			if (variable.matches("^-?\\d+$")) {
				query_variable = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_VARIABLE where VARIABLE_ID =" + Integer.parseInt(variable) + ")";
			} else {
				query_variable = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_VARIABLE where VARIABLE_ID IN "
						+ "(select ID from VARIABLE where UPPER(NAME_SHORT)='" + variable.toUpperCase() + "'))";
			}

		}

		if (sensormod != null && !sensormod.isEmpty()) {
			if (sensormod.matches("^-?\\d+$")) {
				query_sensormod = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID =" + Integer.parseInt(sensormod)
						+ ")";
			} else {
				query_sensormod = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
						+ "(select ID from SENSOR_MODEL where UPPER(NAME_SHORT)='" + sensormod.toUpperCase() + "'))";
			}

		}

		if (sensortyp != null && !sensortyp.isEmpty()) {
			if (sensortyp.matches("^-?\\d+$")) {
				query_sensortyp = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
						+ "(select SENSOR_MODEL_ID from SENSOR_MODEL_SENSOR_TYPE where SENSOR_TYPE_ID ="
						+ Integer.parseInt(sensortyp) + "))";
			} else {
				query_sensortyp = "intersect" + " select * from PTF where ID IN "
						+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
						+ "(select SENSOR_MODEL_ID from SENSOR_MODEL_SENSOR_TYPE where SENSOR_TYPE_ID IN "
						+ "(select ID from SENSOR_TYPE where UPPER(NAME_SHORT)='" + sensortyp.toUpperCase() + "'))";
			}
		}

		String overall_query = query_model + query_type + query_family + query_status + query_program + query_network
				+ query_masterprg + query_variable + query_sensormod + query_sensortyp;

		overall_query = overall_query.substring(10);// to omit intersect
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
			ptf.setJcommpsRef(a.getRef());
			ptfs_list.add(ptf);
		}

		return ptfs_list;
	}

}

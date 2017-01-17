package org.jcommops.api.accessors;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.DataRow;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SQLTemplate;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.Utils;
import org.jcommops.api.entities.CountryEntity;
import org.jcommops.api.entities.MasterProgramEntity;
import org.jcommops.api.entities.NetworkPtfEntity;
import org.jcommops.api.entities.PlatformEntity;
import org.jcommops.api.entities.PlatformFamilyEntity;
import org.jcommops.api.entities.PlatformModelEntity;
import org.jcommops.api.entities.PlatformStatusEntity;
import org.jcommops.api.entities.PlatformTypeEntity;
import org.jcommops.api.entities.ProgramEntity;
import org.jcommops.api.entities.SensorModelEntity;
import org.jcommops.api.entities.SensorTypeEntity;
import org.jcommops.api.entities.VariableEntity;
import org.jcommops.api.orm.Country;
import org.jcommops.api.orm.MasterProg;
import org.jcommops.api.orm.Network;
import org.jcommops.api.orm.Program;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfFamily;
import org.jcommops.api.orm.PtfModel;
import org.jcommops.api.orm.PtfStatus;
import org.jcommops.api.orm.PtfType;
import org.jcommops.api.orm.SensorModel;
import org.jcommops.api.orm.SensorType;
import org.jcommops.api.orm.Variable;

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
	public ArrayList<PlatformEntity> getAllPtfIdsRefs() { 
		// Fetching row data to increase performance/memory consumption
		SQLTemplate query = new SQLTemplate(Ptf.class, "select id, ref from PTF"); 
		query.setFetchingDataRows(true);
		List<DataRow> rows = context.performQuery(query);

		ArrayList<PlatformEntity> ptfs_list = new ArrayList<PlatformEntity>();

		Iterator<DataRow> ptf_itr = rows.iterator();

		while (ptf_itr.hasNext()) {
			DataRow row = ptf_itr.next();
			PlatformEntity ptf = new PlatformEntity();
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
	public ArrayList<PlatformEntity> getAllPtfs() {

		SelectQuery query = new SelectQuery(Ptf.class);
		List<Ptf> platforms = context.performQuery(query);

		ArrayList<PlatformEntity> ptfs_list = new ArrayList<PlatformEntity>();

		Iterator<Ptf> ptf_itr = platforms.iterator();

		while (ptf_itr.hasNext()) {
			Ptf a = ptf_itr.next();
			PlatformEntity ptf = new PlatformEntity();
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
	public ArrayList<PlatformStatusEntity> getPtfStatuses() {// List of Statuses
		SelectQuery Status_query = new SelectQuery(PtfStatus.class);
		List<PtfStatus> statuses = context.performQuery(Status_query);

		ArrayList<PlatformStatusEntity> statuses_list = new ArrayList<PlatformStatusEntity>();

		Iterator<PtfStatus> statuses_itr = statuses.iterator();

		while (statuses_itr.hasNext()) {
			PtfStatus a = statuses_itr.next();
			PlatformStatusEntity status = new PlatformStatusEntity();
			status.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			status.setNameShort(a.getNameShort());
			status.setName(a.getName());
			status.setDescription(a.getDescription());
			statuses_list.add(status);
		}
		return statuses_list;

	}

	public ArrayList<PlatformFamilyEntity> getPtfFamilies() { // List of platforms'
														// families
		SelectQuery Family_query = new SelectQuery(PtfFamily.class);
		List<PtfFamily> families = context.performQuery(Family_query);

		ArrayList<PlatformFamilyEntity> families_list = new ArrayList<PlatformFamilyEntity>();

		Iterator<PtfFamily> families_itr = families.iterator();

		while (families_itr.hasNext()) {
			PtfFamily a = families_itr.next();
			PlatformFamilyEntity family = new PlatformFamilyEntity(a);
			families_list.add(family);
		}

		return families_list;

	}

	public ArrayList<PlatformTypeEntity> getPtfTypes() { // List of platforms' types
		SelectQuery Type_query = new SelectQuery(PtfType.class);
		List<PtfType> types = context.performQuery(Type_query);

		ArrayList<PlatformTypeEntity> types_list = new ArrayList<PlatformTypeEntity>();

		Iterator<PtfType> types_itr = types.iterator();

		while (types_itr.hasNext()) {
			PtfType a = types_itr.next();
			PlatformTypeEntity type = new PlatformTypeEntity(a);
			types_list.add(type);
		}
		return types_list;

	}

	public ArrayList<PlatformModelEntity> getPtfModels() { // List of platforms'
														// models
		SelectQuery Model_query = new SelectQuery(PtfModel.class);
		List<PtfModel> models = context.performQuery(Model_query);

		ArrayList<PlatformModelEntity> models_list = new ArrayList<PlatformModelEntity>();

		Iterator<PtfModel> models_itr = models.iterator();

		while (models_itr.hasNext()) {
			PtfModel a = models_itr.next();
			PlatformModelEntity model = new PlatformModelEntity(a);
			models_list.add(model);
		}
		return models_list;

	}

	public ArrayList<ProgramEntity> getProgram() { // List of platforms'
													// programs
		SelectQuery ProgramPtf_query = new SelectQuery(Program.class);
		List<Program> programs = context.performQuery(ProgramPtf_query);

		ArrayList<ProgramEntity> programs_list = new ArrayList<ProgramEntity>();

		Iterator<Program> programs_itr = programs.iterator();

		while (programs_itr.hasNext()) {
			Program a = programs_itr.next();
			ProgramEntity program = new ProgramEntity(a);
			programs_list.add(program);
		}
		return programs_list;

	}

	public ArrayList<MasterProgramEntity> getMasterProgram() { // List of
															// platforms' master
															// programs
		SelectQuery MasterProgram_query = new SelectQuery(MasterProg.class);
		List<MasterProg> mprograms = context.performQuery(MasterProgram_query);

		ArrayList<MasterProgramEntity> mprograms_list = new ArrayList<MasterProgramEntity>();

		Iterator<MasterProg> mprograms_itr = mprograms.iterator();

		while (mprograms_itr.hasNext()) {
			MasterProg a = mprograms_itr.next();
			MasterProgramEntity mprogram = new MasterProgramEntity(a);
			mprograms_list.add(mprogram);
		}
		return mprograms_list;

	}

	public ArrayList<NetworkPtfEntity> getPtfNetworks() { // List of platforms'
													// Networks
		SelectQuery Network_query = new SelectQuery(Network.class);
		List<Network> networks = context.performQuery(Network_query);

		ArrayList<NetworkPtfEntity> networks_list = new ArrayList<NetworkPtfEntity>();

		Iterator<Network> networks_itr = networks.iterator();

		while (networks_itr.hasNext()) {
			Network a = networks_itr.next();
			NetworkPtfEntity network = new NetworkPtfEntity();
			network.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			network.setNameShort(a.getNameShort());
			network.setName(a.getName());
			network.setDescription(a.getDescription());
			networks_list.add(network);
		}
		return networks_list;

	}

	public ArrayList<SensorModelEntity> getPtfSensorModel() { // List of platforms'
														// sensors model
		SelectQuery SensModel_query = new SelectQuery(SensorModel.class);
		List<SensorModel> SensModels = context.performQuery(SensModel_query);

		ArrayList<SensorModelEntity> SensModels_list = new ArrayList<SensorModelEntity>();

		Iterator<SensorModel> SensModels_itr = SensModels.iterator();

		while (SensModels_itr.hasNext()) {
			SensorModel a = SensModels_itr.next();
			SensorModelEntity SensModel = new SensorModelEntity();
			SensModel.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			SensModel.setNameShort(a.getNameShort());
			SensModel.setName(a.getName());
			SensModel.setDescription(a.getDescription());
			SensModels_list.add(SensModel);
		}
		return SensModels_list;

	}

	public ArrayList<SensorTypeEntity> getPtfSensorType() { // List of platforms'
														// sensors type
		SelectQuery SensType_query = new SelectQuery(SensorType.class);
		List<SensorType> SensTypes = context.performQuery(SensType_query);

		ArrayList<SensorTypeEntity> SensTypes_list = new ArrayList<SensorTypeEntity>();

		Iterator<SensorType> SensTypes_itr = SensTypes.iterator();

		while (SensTypes_itr.hasNext()) {
			SensorType a = SensTypes_itr.next();
			SensorTypeEntity SensType = new SensorTypeEntity();
			SensType.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			SensType.setNameShort(a.getNameShort());
			SensType.setName(a.getName());
			SensType.setDescription(a.getDescription());
			SensTypes_list.add(SensType);
		}
		return SensTypes_list;

	}

	public ArrayList<VariableEntity> getPtfVariables() { // List of platforms'
													// variables

		SelectQuery Variable_query = new SelectQuery(Variable.class);
		List<Variable> Variables = context.performQuery(Variable_query);

		ArrayList<VariableEntity> Variables_list = new ArrayList<VariableEntity>();

		Iterator<Variable> Variables_itr = Variables.iterator();

		while (Variables_itr.hasNext()) {
			Variable a = Variables_itr.next();
			VariableEntity var = new VariableEntity();
			var.setId(Utils.ConvertIDStringtoLong(a.getObjectId().toString()));
			var.setNameShort(a.getNameShort());
			var.setName(a.getName());
			var.setDescription(a.getDescription());
			Variables_list.add(var);
		}
		return Variables_list;

	}

	public ArrayList<CountryEntity>getPtfCountries() { // List of platforms'
		// variables

		SelectQuery Country_query = new SelectQuery(Country.class);
		List<Country> countries = context.performQuery(Country_query);

		ArrayList<CountryEntity> countries_list = new ArrayList<CountryEntity>();

		Iterator<Country> countries_itr = countries.iterator();

		while (countries_itr.hasNext()) {
			Country a = countries_itr.next();
			CountryEntity c = new CountryEntity(a);			
			countries_list.add(c);
		}
		return countries_list;

	}

	public PlatformEntity getPtfbyID(long id) {// Platform's details by ID

		Ptf platform = Cayenne.objectForPK(context, Ptf.class, id); // Get the
																	// platform
		// Create and select the attributs and or object to "platform"
		PlatformEntity ptf = new PlatformEntity(platform);

		return ptf;

	}

	public ArrayList<PlatformEntity> getPtfbySelectedParam(String ptfStatus, String ptfFamily, String ptfType,
			String ptfModel, String program, String network, String masterProg, String variable, String sensorModel,
			String sensorType, String ship, String country) {

		// QUERY PARAMETERS
		StringBuilder query = new StringBuilder("select ptf.id from ptf where 1=1");
		
		if(ptfStatus != null && !ptfStatus.isEmpty()){
			// Adding status clause
			
		}

		
		SQLTemplate query_search = new SQLTemplate(Ptf.class, query.toString());
		List<Ptf> platforms = context.performQuery(query_search);

		ArrayList<PlatformEntity> ptfs_list = new ArrayList<PlatformEntity>();

		Iterator<Ptf> ptf_itr = platforms.iterator();

		while (ptf_itr.hasNext()) {
			Ptf a = ptf_itr.next();
			PlatformEntity ptf = new PlatformEntity();
			ptf.setId(Cayenne.longPKForObject(a));
			ptf.setJcommopsRef(a.getRef());
			ptfs_list.add(ptf);
		}

		return ptfs_list;
	}

	public String WritePtfCSV(long id) throws NullPointerException {
		String CVS;
		StringWriter strW = new StringWriter();

		PlatformEntity ptfm = getPtfbyID(id);
		strW.write(ptfm.getId() + ";" + Utils.CheckStringNull(ptfm.getJcommopsRef()) + ";"
				+ Utils.CheckStringNull(ptfm.getTelecom().getTelecomNum()) + ";"
				+ Utils.CheckStringNull(ptfm.getTelecom().getTelecomType()) + ";"
				+ Utils.CheckStringNull(ptfm.getInternalRef()) + ";" + Utils.CheckStringNull(ptfm.getSerialRef()) + ";"
				+ Utils.CheckStringNull(ptfm.getPtfFamily().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getPtfType().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getPtfModel().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getProgram().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getProgram().getCountry().getName()) + ";"
				+ Utils.CheckStringNull((ptfm.getProgram().getMasterProgram().getNameShort()) + ";"
				+ Utils.CheckStringNull(ptfm.getDeployement().getDeployementDate()) + ";"
				+ Utils.CheckBigDcm((ptfm.getDeployement().getLat())) + ";"
				+ Utils.CheckBigDcm(ptfm.getDeployement().getLon()) + ";"
				+ Utils.CheckBigDcm(ptfm.getDeployement().getDeployementScore()) + ";"
				+ Utils.CheckBigDcm(ptfm.getDeployement().getDeployementDensity()) + ";"
				+ Utils.CheckStringNull(ptfm.getNotificationDate()) + ";"
				+ Utils.CheckStringNull(ptfm.getDeployement().getShip().getName()) + ";"
				+ Utils.CheckStringNull(ptfm.getDeployement().getShip().getRef()) + ";"
				+ Utils.CheckStringNull(ptfm.getLatestLocation().getDate())) + ";"
				+ Utils.CheckBigDcm((ptfm.getLatestLocation().getLat())) + ";"
				+ Utils.CheckBigDcm(ptfm.getLatestLocation().getLon()) + ";" + Utils.CheckInt(ptfm.getAge()) + ";"
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

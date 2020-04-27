package org.jcommops.api.accessors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.BadRequestException;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.DataRow;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.SQLTemplate;
import org.apache.cayenne.query.SelectById;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.Utils;
import org.jcommops.api.entities.CountryEntity;
import org.jcommops.api.entities.NetworkEntity;
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
import org.jcommops.api.orm.Network;
import org.jcommops.api.orm.Program;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfFamily;
import org.jcommops.api.orm.PtfIdentifiers;
import org.jcommops.api.orm.PtfModel;
import org.jcommops.api.orm.PtfStatus;
import org.jcommops.api.orm.PtfType;
import org.jcommops.api.orm.SensorModel;
import org.jcommops.api.orm.SensorType;
import org.jcommops.api.orm.Variable;
import org.jcommops.api.exceptions.PtfNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlatformAccessor {
	private final Logger logger = LoggerFactory.getLogger(PlatformAccessor.class);
	private ObjectContext context;

	public PlatformAccessor() {
		this.context = Utils.getCayenneContext();
	}
	

	/**
	 * Query the database to retrieve a platform's details, based on its database
	 * ID.
	 * 
	 * @param id long The database identifier
	 * @return A ORM Ptf object
	 * @throws PtfNotFoundException
	 */
	public Ptf getPtfbyID(long id) throws PtfNotFoundException {
		// Find the platform
		Ptf ptf = SelectById.query(Ptf.class, id).selectOne(this.context);
		if (ptf == null)
			throw new PtfNotFoundException("No platform found for ID = " + String.valueOf(id));
		return ptf;
	}
	
	/**
	 * Query the database to retrieve a platform's details, based on its database
	 * ID.
	 * 
	 * @param id long The database identifier
	 * @return A ORM Ptf object
	 * @throws PtfNotFoundException
	 */
	public Ptf getPtfbyRef(String ref) throws PtfNotFoundException {
		// Find the platform
		Ptf ptf = SelectQuery.query(Ptf.class, Ptf.REF.eq(ref)).selectOne(this.context);
		if (ptf == null)
			throw new PtfNotFoundException("No platform found for ref = " + ref);
		return ptf;
	}

	/**
	 * Query the database to retrieve a platform's details, based on its WIGOS ID
	 * 
	 * @param wigosid the WIGOS identifier
	 * @return A ORM Ptf object
	 * @throws PtfNotFoundException
	 */
	public Ptf getPtfbyWigosID(String wigosid) throws PtfNotFoundException {
		// Find the platform
		Ptf ptf = SelectQuery.query(Ptf.class, Ptf.PTF_IDENTIFIERS.dot(PtfIdentifiers.WIGOS_REF).eq(wigosid)).selectOne(this.context);

		if (ptf == null)
			throw new PtfNotFoundException("No platform found for WIGOS ID = " + wigosid);
		
		return ptf;
	}


	/**
	 * Build the list of platform IDs/REFs.
	 * 
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
			ptf.setId((Integer) row.get("ID"));
			ptf.setJcommopsRef((String) row.get("REF"));
			ptfs_list.add(ptf);
		}

		return ptfs_list;

	}

	/**
	 * Build the reference list of statuses.
	 * 
	 * @return The list of PlatformStatus objects.
	 */
	public ArrayList<PlatformStatusEntity> getPtfStatuses() {
		SelectQuery Status_query = new SelectQuery(PtfStatus.class);
		List<PtfStatus> statuses = context.performQuery(Status_query);

		ArrayList<PlatformStatusEntity> statuses_list = new ArrayList<PlatformStatusEntity>();

		Iterator<PtfStatus> statuses_itr = statuses.iterator();

		while (statuses_itr.hasNext()) {
			PtfStatus a = statuses_itr.next();
			PlatformStatusEntity status = new PlatformStatusEntity(a);
			statuses_list.add(status);
		}
		return statuses_list;

	}

	/**
	 * Query the database to retrieve all platform families
	 * @return	The platform families list
	 */
	public ArrayList<PlatformFamilyEntity> getPtfFamilies() {
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

	/**
	 * Query the database to retrieve all platform types
	 * @return	The platform types list
	 */
	public ArrayList<PlatformTypeEntity> getPtfTypes() {
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

	/**
	 * Query the database to retrieve all platform models
	 * @return	The platform models list
	 */
	public ArrayList<PlatformModelEntity> getPtfModels() {
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

	/**
	 * Query the database to retrieve all programs
	 * @return	The programs list
	 */
	public ArrayList<ProgramEntity> getProgram() { 
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

	/**
	 * Query the database to retrieve all master networks
	 * @return	The master networks list
	 */
	public ArrayList<NetworkEntity> getMasterNetworks() {
		SelectQuery Network_query = new SelectQuery(Network.class);
		List<Network> networks = context.performQuery(Network_query);

		ArrayList<NetworkEntity> nets_list = new ArrayList<NetworkEntity>();

		Iterator<Network> networks_itr = networks.iterator();

		while (networks_itr.hasNext()) {
			Network a = networks_itr.next();
			if(a.getRank() == 0) {
				NetworkEntity net = new NetworkEntity(a);
				nets_list.add(net);
			}
		}
		return nets_list;

	}

	/**
	 * Query the database to retrieve all networks
	 * @return	The networks list
	 */
	public ArrayList<NetworkEntity> getPtfNetworks() {
		SelectQuery Network_query = new SelectQuery(Network.class);
		List<Network> networks = context.performQuery(Network_query);

		ArrayList<NetworkEntity> networks_list = new ArrayList<NetworkEntity>();

		Iterator<Network> networks_itr = networks.iterator();

		while (networks_itr.hasNext()) {
			Network a = networks_itr.next();
			NetworkEntity network = new NetworkEntity(a);
			networks_list.add(network);
		}
		return networks_list;

	}

	/**
	 * Query the database to retrieve all sensor models
	 * @return	The sensor models list
	 */
	public ArrayList<SensorModelEntity> getPtfSensorModel() {
		SelectQuery SensModel_query = new SelectQuery(SensorModel.class);
		List<SensorModel> SensModels = context.performQuery(SensModel_query);

		ArrayList<SensorModelEntity> SensModels_list = new ArrayList<SensorModelEntity>();

		Iterator<SensorModel> SensModels_itr = SensModels.iterator();

		while (SensModels_itr.hasNext()) {
			SensorModel a = SensModels_itr.next();
			SensorModelEntity SensModel = new SensorModelEntity(a);
			SensModels_list.add(SensModel);
		}
		return SensModels_list;

	}

	/**
	 * Query the database to retrieve all sensor types
	 * @return	The sensor types list
	 */
	public ArrayList<SensorTypeEntity> getPtfSensorType() { 
		SelectQuery SensType_query = new SelectQuery(SensorType.class);
		List<SensorType> SensTypes = context.performQuery(SensType_query);

		ArrayList<SensorTypeEntity> SensTypes_list = new ArrayList<SensorTypeEntity>();

		Iterator<SensorType> SensTypes_itr = SensTypes.iterator();

		while (SensTypes_itr.hasNext()) {
			SensorType a = SensTypes_itr.next();
			SensorTypeEntity SensType = new SensorTypeEntity(a);
			SensTypes_list.add(SensType);
		}
		return SensTypes_list;

	}

	/**
	 * Query the database to retrieve all variables
	 * @return	The variables list
	 */
	public ArrayList<VariableEntity> getPtfVariables() { 		
		SQLTemplate select = new SQLTemplate(Variable.class, "select * from variable where exists (select null from ptf_variable where variable_id = variable.id) and name_short not like 'GEN%'"); 
		List<Variable> Variables = context.performQuery(select);

		ArrayList<VariableEntity> Variables_list = new ArrayList<VariableEntity>();

		Iterator<Variable> Variables_itr = Variables.iterator();

		while (Variables_itr.hasNext()) {
			Variable a = Variables_itr.next();
			VariableEntity var = new VariableEntity(a);
			Variables_list.add(var);
		}
		return Variables_list;

	}

	/**
	 * Query the database to retrieve all countries
	 * @return	The countries list
	 */
	public ArrayList<CountryEntity> getPtfCountries() { 
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

	/**
	 * Filters and returns a subset of platform based on the given parameters.
	 * Parameters can be multi-valued. For and intersection, "." symbol will be
	 * used. For an union, "," symbol will be used (where applicable)
	 * 
	 * @param ptfStatus
	 * @param ptfFamily
	 * @param ptfType
	 * @param ptfModel
	 * @param program
	 * @param network
	 * @param variable
	 * @param sensorModel
	 * @param sensorType
	 * @param ship
	 * @param country
	 * @param insertDate 
	 * @param updateDate 
	 * @return A HashMap containing the database identifiers as keys, the JCOMMOPS reference as values
	 */
	public HashMap<Integer, HashMap<String, String>> getPtfbySelectedParam(String ptfStatus, String ptfFamily, String ptfType,
			String ptfModel, String gtsid, String program, String network, String variable, String sensorModel,
			String sensorType, String ship, String country, String wigosReady, String updateDate, String insertDate) {
		
		// Sanitize all parameters
		ptfStatus = Utils.basicSanitize(ptfStatus);
		ptfFamily = Utils.basicSanitize(ptfFamily);
		ptfType = Utils.basicSanitize(ptfType);
		ptfModel = Utils.basicSanitize(ptfModel);
		gtsid = Utils.basicSanitize(gtsid);
		program = Utils.basicSanitize(program);
		network = Utils.basicSanitize(network);
		variable = Utils.basicSanitize(variable);
		sensorModel = Utils.basicSanitize(sensorModel);
		sensorType = Utils.basicSanitize(sensorType);
		ship = Utils.basicSanitize(ship);
		country = Utils.basicSanitize(country);
		wigosReady = Utils.basicSanitize(wigosReady);
		updateDate = Utils.basicSanitize(updateDate);
		insertDate = Utils.basicSanitize(insertDate);

		// QUERY PARAMETERS
		String intersectionSymbol = ".", unionSymbol = ",";
		StringBuilder query = new StringBuilder("select ptf.id, ptf.ref, ptfids.wigos_ref from ptf left join ptf_identifiers ptfids on (ptfids.id = ptf.ptf_identifiers_id) where 1=1");
		StringBuilder whereClause = new StringBuilder();
		boolean usingID = false;
		boolean wigos = false;
		
		// Dates
		if(updateDate != null){
			whereClause.append(buildWhereClauseForDateParam(updateDate, "ptf.update_date"));
		}
		if(insertDate != null){
			whereClause.append(buildWhereClauseForDateParam(insertDate, "ptf.insert_date"));
		}
		
		// WIGOS filtering
		if(wigosReady != null) {
			whereClause.append(" and (ptfids.wigos_ref is not null)");
		}

		// GTS ID
		if(gtsid != null){
			whereClause.append(" and (exists (select null from wmo where wmo.ptf_id = ptf.id and wmo.wmo = '");
			whereClause.append(gtsid);
			whereClause.append("'))");
		}

		// Platform status
		if (ptfStatus != null && !ptfStatus.isEmpty()) {
			String[] parts = ptfStatus.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_status_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_status_id in (select id from ptf_status where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))");
			if (!usingID)
				whereClause.append(")");
		}

		// Platform family
		if (ptfFamily != null && !ptfFamily.isEmpty()) {
			String[] parts = ptfFamily.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (select id from ptf_type where ptf_family_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (select id from ptf_type where ptf_family_id in (select id from ptf_family where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))))");
			if (!usingID)
				whereClause.append(")");
		}

		// Platform Type
		if (ptfType != null && !ptfType.isEmpty()) {
			String[] parts = ptfType.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where ptf_type_id in (select id from ptf_type where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append(")))");
			if (!usingID)
				whereClause.append(")");
		}

		// Platform Model
		if (ptfModel != null && !ptfModel.isEmpty()) {
			String[] parts = ptfModel.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.ptf_model_id in (");
			} else {
				whereClause.append(" and (ptf.ptf_model_id in (select id from ptf_model where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))");
			if (!usingID)
				whereClause.append(")");
		}

		// Program
		if (program != null && !program.isEmpty()) {
			String[] parts = program.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			if (usingID) {
				whereClause.append(" and (ptf.program_id in (");
			} else {
				whereClause.append(" and (ptf.program_id in (select id from program where lower(name_short) in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i].toLowerCase());
				if (!usingID)
					whereClause.append("'");
			}
			whereClause.append("))");
			if (!usingID)
				whereClause.append(")");
		}

		// Network
		if (network != null && !network.isEmpty()) {
			// Intersection
			if (network.contains(intersectionSymbol)) {
				String[] parts = network.split("\\" + intersectionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from network_ptf np where np.ptf_id = ptf.id and np.network_id =");
					if (!usingID) {
						whereClause.append("(select id from network where lower(name_short) = '");
					}

					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("')");

					whereClause.append(")");
				}

			}
			// Union
			else {
				String[] parts = network.split(unionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);
				whereClause.append(" and exists (select null from network_ptf np where np.ptf_id = ptf.id and np.network_id in (");
				if (!usingID) {
					whereClause.append("select id from network where lower(name_short) in (");
				}

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					if (!usingID)
						whereClause.append("'");
					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("'");
				}
				whereClause.append("))");
				if (!usingID)
					whereClause.append(")");
			}
		}

		// Variable
		if (variable != null && !variable.isEmpty()) {
			// Intersection
			if (variable.contains(intersectionSymbol)) {
				String[] parts = variable.split("\\" + intersectionSymbol);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from ptf_variable pv where pv.ptf_id = ptf.id and pv.variable_id =");
					whereClause.append(parts[i].toLowerCase());
					whereClause.append(")");
				}

			}
			// Union
			else {
				String[] parts = variable.split(unionSymbol);

				whereClause.append(" and exists (select null from ptf_variable pv where pv.ptf_id = ptf.id and pv.variable_id in (");

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					whereClause.append(parts[i].toLowerCase());
				}
				whereClause.append("))");
			}
		}

		// Sensor Model
		if (sensorModel != null && !sensorModel.isEmpty()) {
			// Intersection
			if (sensorModel.contains(intersectionSymbol)) {
				String[] parts = sensorModel.split("\\" + intersectionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id =");
					if (!usingID) {
						whereClause.append("(select id from sensor_model where lower(name_short) = '");
					}

					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("')");

					whereClause.append(")");
				}

			}
			// Union
			else {
				String[] parts = sensorModel.split(unionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);
				whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id in (");
				if (!usingID) {
					whereClause.append("select id from sensor_model where lower(name_short) in (");
				}

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					if (!usingID)
						whereClause.append("'");
					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("'");
				}
				whereClause.append("))");
				if (!usingID)
					whereClause.append(")");
			}
		}

		// Sensor Type
		if (sensorType != null && !sensorType.isEmpty()) {
			// Intersection
			if (sensorType.contains(intersectionSymbol)) {
				String[] parts = sensorType.split("\\" + intersectionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);

				for (int i = 0; i < parts.length; i++) {
					whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id = (select sensor_model_id from sensor_model_sensor_type smst where smst.sensor_model_id = psm.sensor_model_id and smst.sensot_type_id = ");
					if (!usingID) {
						whereClause.append("(select id from sensor_type where lower(name_short) = '");
					}

					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("')");

					whereClause.append("))");
				}

			}
			// Union
			else {
				String[] parts = sensorType.split(unionSymbol);
				// Testing if name or ID are used
				usingID = Utils.isInt(parts[0]);
				whereClause.append(" and exists (select null from ptf_sensor_model psm where psm.ptf_id = ptf.id and psm.sensor_model_id = (select sensor_model_id from sensor_model_sensor_type smst where smst.sensor_model_id = psm.sensor_model_id and smst.sensot_type_id in (");
				if (!usingID) {
					whereClause.append("select id from sensor_type where lower(name_short) in (");
				}

				for (int i = 0; i < parts.length; i++) {
					if (i > 0) {
						whereClause.append(",");
					}
					if (!usingID)
						whereClause.append("'");
					whereClause.append(parts[i].toLowerCase());
					if (!usingID)
						whereClause.append("'");
				}
				if (!usingID)
					whereClause.append(")");
				whereClause.append(")))");
			}
		}

		// Ship
		if (ship != null && !ship.isEmpty()) {
			String[] parts = ship.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			whereClause.append(" and ((select d.ship_id from ptf_deployment d where d.id = ptf.ptf_depl_id) in (");
			if (!usingID) {
				whereClause.append("select id from ship where ref in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i]);
				if (!usingID)
					whereClause.append("'");
			}
			if (!usingID)
				whereClause.append(")");
			whereClause.append("))");
		}

		// Ship
		if (country != null && !country.isEmpty()) {
			String[] parts = country.split(unionSymbol);
			// Testing if name or ID are used
			usingID = Utils.isInt(parts[0]);
			whereClause.append(" and ((select pr.country_id from program pr where pr.id = ptf.program_id) in (");
			if (!usingID) {
				whereClause.append("select id from country where code2 in (");
			}

			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					whereClause.append(",");
				}
				if (!usingID)
					whereClause.append("'");
				whereClause.append(parts[i]);
				if (!usingID)
					whereClause.append("'");
			}
			if (!usingID)
				whereClause.append(")");
			whereClause.append("))");
		}

		query.append(whereClause);
		
		SQLTemplate query_search = new SQLTemplate(Ptf.class, query.toString());
		query_search.setFetchingDataRows(true);
		List<DataRow> rows = context.performQuery(query_search);

		HashMap<Integer, HashMap<String, String>> ptfList = new HashMap<>();

		Iterator<DataRow> ptf_itr = rows.iterator();

		while (ptf_itr.hasNext()) {
			HashMap<String, String> ptfIds = new HashMap<String, String>();
			DataRow row = ptf_itr.next();
			ptfIds.put("ref", (String)row.get("REF"));
			if(row.get("WIGOS_REF") != null)
				ptfIds.put("wigos_ref", (String)row.get("WIGOS_REF"));
			else
				ptfIds.put("wigos_ref", "");
				
				
			ptfList.put((Integer) row.get("ID"), ptfIds);
		}

		return ptfList;
	}

	public String WritePtfCSV(long id) throws PtfNotFoundException {
		String csv = null;
		
		PlatformEntity ptfm = new PlatformEntity(getPtfbyID(id));
		csv = ptfm.toCSV();
		
		return csv;

	}
	
	
	/**
	 * From an input date parameter query string and a database path, computes the corresponding where clause.
	 * @param dateParam	Date query string parameter, following the mathematical ineterval syntax
	 * @param sqlParam	Database path for the concerned field
	 * @return	String	The expected where clause
	 * @throws BadRequestException	When the date format is incorrect
	 */
	public String buildWhereClauseForDateParam(String dateParam, String sqlParam) throws BadRequestException{
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		StringBuilder whereClause = new StringBuilder();
		
		if(dateParam != null){
			String startSymbol = null, endSymbol = null;
			String sqlStartSymbol = null, sqlEndSymbol = null;
			String[] updateDatesString;
			
			// Identifying symbols
			if(dateParam.startsWith("[") || dateParam.startsWith("]")){
				startSymbol = dateParam.substring(0, 1);
				if(startSymbol.equals("["))
					sqlStartSymbol = ">=";
				else if (startSymbol.equals("]"))
					sqlStartSymbol = ">";
				dateParam = dateParam.substring(1);
			}

			if(dateParam.endsWith("[") ||  dateParam.endsWith("]")){
				endSymbol = dateParam.substring(dateParam.length()-1);
				if(endSymbol.equals("]"))
					sqlEndSymbol = "<=";
				else if (endSymbol.equals("["))
					sqlEndSymbol = "<";
				dateParam = dateParam.substring(0, dateParam.length() - 1);
			}
			
			// Default: considering date as a left side bounder (looking for more recent or equal to that date)
			if(startSymbol == null && endSymbol == null){
				sqlStartSymbol = ">=";
			}
			
			// Guessing if there is one date or an interval
			if(dateParam.contains(",")){
				updateDatesString = dateParam.split(",");
			}
			else{
				updateDatesString = new String[1];
				updateDatesString[0] = dateParam;
			}

			try{
				// Tryinig to parse the date-s
				if(updateDatesString.length == 1){
					Date updateDateDate = dateFormatter.parse(updateDatesString[0]);
					if(sqlStartSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlStartSymbol);
						whereClause.append(" to_date('" + updateDatesString[0] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
					if(sqlEndSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlEndSymbol);
						whereClause.append(" to_date('" + updateDatesString[0] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
				}
				else if(updateDatesString.length == 2){
					Date updateDateDate = dateFormatter.parse(updateDatesString[0]);
					updateDateDate = dateFormatter.parse(updateDatesString[1]);
					if(sqlStartSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlStartSymbol);
						whereClause.append(" to_date('" + updateDatesString[0] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
					if(sqlEndSymbol != null){
						whereClause.append(" and (" + sqlParam + " ");
						whereClause.append(sqlEndSymbol);
						whereClause.append(" to_date('" + updateDatesString[1] + "','YYYY-MM-DD\"T\"HH24:MI:SS'))");
					}
				}
			}
			catch (ParseException e) {
				throw new BadRequestException("Date parameter is not well formatted. Date should be given in the following format: YYYY-MM-DDTHH:MI:SS");
			}
		}
		
		return whereClause.toString();
	}
}

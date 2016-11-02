package org.jcommops.api.accessors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.relation.Role;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SQLTemplate;
import org.apache.cayenne.query.SelectQuery;
import org.jcommops.api.Utils;
import org.jcommops.api.entities.AgencyPrg;
import org.jcommops.api.entities.ContactPrg;
import org.jcommops.api.entities.CountryPtf;
import org.jcommops.api.entities.MasterProgram;
import org.jcommops.api.entities.Platform;
import org.jcommops.api.entities.PlatformDeploy;
import org.jcommops.api.entities.PlatformFamily;
import org.jcommops.api.entities.PlatformLastLoc;
import org.jcommops.api.entities.PlatformModel;
import org.jcommops.api.entities.PlatformStatus;
import org.jcommops.api.entities.PlatformType;
import org.jcommops.api.entities.ProgramPtf;
import org.jcommops.api.entities.RoleContact;
import org.jcommops.api.entities.Variable;
import org.jcommops.api.orm.Agency;
import org.jcommops.api.orm.Country;
import org.jcommops.api.orm.MasterProg;
import org.jcommops.api.orm.Ptf;
import org.jcommops.api.orm.PtfDeployment;
import org.jcommops.api.orm.PtfFamily;
import org.jcommops.api.orm.PtfLoc;
import org.jcommops.api.orm.PtfModel;
import org.jcommops.api.orm.PtfStatus;
import org.jcommops.api.orm.PtfType;

public class PlatformAccessor {

	ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
	// Getting Object Context
	ObjectContext context = runtime.getContext();

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
		// runtime.shutdown();
		return ptfs_list;

	}

	public ArrayList<Platform> getPtfbySelectedParam(String ptf_status, String ptf_family, String ptf_type,
			String ptf_model, String program, String network, String ptf_masterprg, String variable, String sensormod, String sensortyp) {

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
			query_model = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
					+ "(select ID from PTF_Model where UPPER(NAME_SHORT)='" + ptf_model.toUpperCase() + "')";
			intersect_index = intersect_index + 1;
		}

		if (ptf_type != null && !ptf_type.isEmpty()) {
			query_type = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
					+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
					+ "(select ID from PTF_TYPE where UPPER(NAME_SHORT)='" + ptf_type.toUpperCase() + "'))";
			
			intersect_index = intersect_index + 1;
		}

		if (ptf_family != null && !ptf_family.isEmpty()) {
			query_family = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
					+ "(select ID from PTF_Model where PTF_TYPE_ID IN "
					+ "(select ID from PTF_TYPE  where PTF_FAMILY_ID IN "
					+ "(select ID from PTF_FAMILY where UPPER(NAME_SHORT)='" + ptf_family.toUpperCase() + "')))";
			intersect_index = intersect_index + 1;
		}

		if (program != null && !program.isEmpty()) {
			query_program = "intersect" + " select * from PTF where program_ID IN "
					+ "(select ID from program where UPPER(NAME_SHORT)='" + program.toUpperCase() + "')";
			intersect_index = intersect_index + 1;
		}
		
		if (network != null && !network.isEmpty()) {
			query_network = "intersect" + " select * from PTF where ID IN "
					+ "(select PTF_ID from NETWORK_PTF where NETWORK_ID IN "
					+ "(select ID from NETWORK where UPPER(NAME_SHORT)='" + network.toUpperCase() + "'))";
			intersect_index = intersect_index + 1;
		}

		
		if (ptf_masterprg != null && !ptf_masterprg.isEmpty()) {
			query_masterprg = "intersect" + " select * from PTF where Program_ID IN "
					+ "(select ID from Program where master_prog_id IN "
					+ "(select ID from MASTER_PROG where UPPER(NAME_SHORT)='" + ptf_masterprg.toUpperCase() + "'))";
			intersect_index = intersect_index + 1;
		}
	

		if (ptf_status != null && !ptf_status.isEmpty()) {
			query_status = "intersect"
					+ " select * from PTF where PTF_STATUS_ID IN (select ID from PTF_STATUS where UPPER(NAME_SHORT)='"
					+ ptf_status.toUpperCase() + "')";
			intersect_index = intersect_index + 1;
		}

		if (variable != null && !variable.isEmpty()) {
			query_variable = "intersect" + " select * from PTF where ID IN "
					+ "(select PTF_ID from PTF_VARIABLE where VARIABLE_ID IN "
					+ "(select ID from VARIABLE where UPPER(NAME_SHORT)='" + variable.toUpperCase() + "'))";
			intersect_index = intersect_index + 1;
		}
		
		if (sensormod != null && !sensormod.isEmpty()) {
			query_sensormod = "intersect" + " select * from PTF where ID IN "
					+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
					+ "(select ID from SENSOR_MODEL where UPPER(NAME_SHORT)='" + sensormod.toUpperCase() + "'))";
			intersect_index = intersect_index + 1;
		}

		if (sensortyp != null && !sensortyp.isEmpty()) {
			query_sensortyp= "intersect" + " select * from PTF where ID IN "
					+ "(select PTF_ID from PTF_SENSOR_MODEL where SENSOR_MODEL_ID IN "
					+ "(select SENSOR_MODEL_ID from SENSOR_MODEL_SENSOR_TYPE where SENSOR_TYPE_ID IN "
					+ "(select ID from SENSOR_TYPE where UPPER(NAME_SHORT)='" + sensortyp.toUpperCase() + "'))";
			intersect_index = intersect_index + 1;
		}
		
		String overall_query = query_model + query_type + query_family + query_status +  query_program +
		 query_network+ query_masterprg + query_variable+query_sensormod+query_sensortyp;
		
		overall_query = overall_query.substring(10);// to omit intersect instruction ->10 characters

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
		// runtime.shutdown();
		return ptfs_list;
	}

	public Platform getPtfbyID(long id) {// Platform's details by ID

		Ptf platform = Cayenne.objectForPK(context, Ptf.class, id); // Get the
																	// platform
		// Crate and select the attributs and or object to "platform"
		Platform ptf = new Platform();
		try {
			ptf.setId(id);
			ptf.setJcommpsRef(platform.getRef());
		} catch (NullPointerException n) {
			ptf.setId(-1);
			ptf.setError_message("Invalid ID. The ID "+id+" doesn't correspond to a registered platform.");;
		}
		// Methodes
		Utils mu = new Utils();
		MethodsAssociativeTables MAT = new MethodsAssociativeTables();
		// Ajouter des objects imbriqués un par un

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
		MasterProgram masterprg = new MasterProgram();
		// 10) embedded object"Contact"
		// 10.1) embedded object"Role"
		// 10.2) embedded object"Role"

		try {
			ptf.getEndingDate();
			// 1) embedded object"PlatformStatus"
			String stringIDptfs = platform.getToPtfStatus().getObjectId().toString();
			PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class,
					mu.ConvertIDStringtoLong(stringIDptfs));// Get the platform
															// Status by its PK
			ptfs.setId(Cayenne.longPKForObject(platformstatus));
			ptfs.setStatus(platformstatus.getDescription());
			// Ajouter à platform
			ptf.setPtfStatus(ptfs);

			// 2) embedded object"PlatformModel"
			String stringIDptfm = platform.getToPtfModel().getObjectId().toString();
			PtfModel platformmodel = Cayenne.objectForPK(context, PtfModel.class,
					mu.ConvertIDStringtoLong(stringIDptfm));// Get the platform
															// Model by its PK
			ptfm.setId(Cayenne.longPKForObject(platformmodel));
			ptfm.setNameShort(platformmodel.getNameShort());
			ptfm.setName(platformmodel.getName());
			ptfm.setDescription(platformmodel.getDescription());
			// Ajouter à platform
			ptf.setPtfModel(ptfm);

			// 3) embedded object"PlatformType"
			PtfModel platformm = Cayenne.objectForPK(context, PtfModel.class, Cayenne.longPKForObject(platformmodel));
			String stringIDptft = platformm.getToPtfType().getObjectId().toString();
			PtfType platformtype = Cayenne.objectForPK(context, PtfType.class, mu.ConvertIDStringtoLong(stringIDptft));// Get
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
					mu.ConvertIDStringtoLong(stringIDptff));// Get the platform
															// Family by its PK
			ptff.setId(Cayenne.longPKForObject(platformfamily));
			ptff.setNameShort(platformfamily.getNameShort());
			ptff.setName(platformfamily.getName());
			ptff.setDescription(platformfamily.getDescription());
			ptf.setPtfFamily(ptff);

			// 5) embedded object"PlatformLastLoc"
			// PlatformLastLoc ptfll = new PlatformLastLoc();
			String stringIDptfll = platform.getToPtfLoc().getObjectId().toString();
			PtfLoc platformlastloc = Cayenne.objectForPK(context, PtfLoc.class,
					mu.ConvertIDStringtoLong(stringIDptfll));// Get the platform
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
					mu.ConvertIDStringtoLong(stringIDptfdpl));// Get the
																// platform
																// Deployment by
																// its PK
			ptfdpl.setId(Cayenne.longPKForObject(platformDeploy));
			ptfdpl.setDeployementDate(platformDeploy.getDeplDate());
			ptf.setDeployement(ptfdpl);

			// 7) embedded object"Program"
			// Program prgm = new Program();

			String stringIDprg = platform.getToProgram().getObjectId().toString();
			org.jcommops.api.orm.Program ptfprogram = Cayenne.objectForPK(context, org.jcommops.api.orm.Program.class,
					mu.ConvertIDStringtoLong(stringIDprg));// Get the platform
															// Program by its PK
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
			Country ptfcountry = Cayenne.objectForPK(context, Country.class, mu.ConvertIDStringtoLong(stringIDcountry));// Get
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
					mu.ConvertIDStringtoLong(stringIDmasterprg));// Get the
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

		// runtime.shutdown();
		return ptf;

	}

}

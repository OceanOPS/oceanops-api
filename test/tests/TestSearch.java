package tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.SQLTemplate;
import org.jcommops.api.accessors.PlatformAccessor;
import org.jcommops.api.entities.Platform;
import org.jcommops.api.orm.Ptf;

public class TestSearch {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
		// Getting Object Context
		ObjectContext context = runtime.getContext();

		PlatformAccessor m = new PlatformAccessor();
		System.out.println("Début");
		/**
		 * SQLTemplate query_search = new SQLTemplate(Ptf.class, "select * from
		 * PTF");
		 **/

		String ptf_model = "";
		String ptf_type = "";
		String ptf_family = "";
		String ptf_status = "";
		String ptf_masterprg = "DBCP";
		String variable = "";

		// QUERY PARAMETERS
		String query_model = "";
		String query_type = "";
		String query_family = "";
		String query_status = "";
		String query_masterprg = "";
		String query_variable = "";

		int intersect_index = 0;
		if (ptf_model != null && !ptf_model.isEmpty()) {
			query_model = " select * from PTF where PTF_MODEL_ID IN " + "(select ID from PTF_Model where NAME_SHORT ='"
					+ ptf_model + "')";
			intersect_index = intersect_index + 1;
		}

		if (ptf_type != null && !ptf_type.isEmpty()) {
			query_type = " select * from PTF where PTF_MODEL_ID IN " + "(select ID from PTF_Model where NAME_SHORT IN "
					+ "(select NAME_SHORT  from PTF_MODEL where PTF_TYPE_ID IN "
					+ "(select ID from PTF_TYPE where NAME_SHORT ='" + ptf_type + "')))";
			intersect_index = intersect_index + 1;
		}

		if (ptf_family != null && !ptf_family.isEmpty()) {
			query_family = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
					+ "(select ID from PTF_Model where NAME_SHORT IN "
					+ "(select NAME_SHORT  from PTF_MODEL where PTF_TYPE_ID IN "
					+ "(select ID from PTF_TYPE where NAME_SHORT IN"
					+ "(select NAME_SHORT  from PTF_TYPE where PTF_FAMILY_ID IN "
					+ "(select ID from PTF_FAMILY where NAME_SHORT ='" + ptf_family + "'))))  )";
			intersect_index = intersect_index + 1;
		}

		if (ptf_masterprg != null && !ptf_masterprg.isEmpty()) {
			query_masterprg = "intersect" + " select * from PTF where PTF_MODEL_ID IN "
					+ "(select ID from PTF_Model where NAME_SHORT IN "
					+ "(select NAME_SHORT  from PTF_MODEL where MASTER_PROG_ID IN "
					+ "(select ID from MASTER_PROG where NAME_SHORT ='" + ptf_masterprg + "')))";
			intersect_index = intersect_index + 1;
		}

		if (ptf_status != null && !ptf_status.isEmpty()) {
			query_status = "intersect"
					+ " select * from PTF where PTF_STATUS_ID IN (select ID from PTF_STATUS where NAME_SHORT ='"
					+ ptf_status + "')";
			intersect_index = intersect_index + 1;
		}

		if (variable != null && !variable.isEmpty()) {
			query_variable = "intersect" + " select * from PTF where ID IN "
					+ "(select PTF_ID from PTF_VARIABLE where VARIABLE_ID IN "
					+ "(select ID from VARIABLE where NAME_SHORT ='" + variable + "'))";
			intersect_index = intersect_index + 1;
		}

		String overall_query = query_model + query_type + query_family + query_status + query_masterprg
				+ query_variable;
		if (intersect_index == 1 && ptf_model.equals(null) || ptf_model.isEmpty()) {
			overall_query = overall_query.substring(10);// to omit intersect
														// instruction
		}
		System.out.println("index= "+ intersect_index);
		System.out.println(overall_query);

		SQLTemplate query_search = new SQLTemplate(Ptf.class, overall_query);

		// List<Ptf> platforms = context.performQuery(query_search);
		int size = context.performQuery(query_search).size();
		// platforms.get(0).getRef();

		System.out.println("Size =" + size);
		// ArrayList<Platform> ptfs_list = new ArrayList<Platform>();

	}
}

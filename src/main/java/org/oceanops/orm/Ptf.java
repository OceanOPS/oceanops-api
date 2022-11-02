package org.oceanops.orm;

import org.oceanops.orm.auto._Ptf;

import org.apache.cayenne.DataRow;
import org.apache.cayenne.QueryResponse;
import org.apache.cayenne.query.ProcedureQuery;

import io.agrest.annotation.AgAttribute;
import io.agrest.annotation.AgRelationship;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ptf extends _Ptf {
	private static final long serialVersionUID = 1L;

	/**
	 * Age sub-class
	 */
	public class Age {
		private Ptf ptf;

		public Age(Ptf ptf){
			this.ptf = ptf;
		}

		@SuppressWarnings("unchecked")
		@AgAttribute
		public double getAgeWeight(){
			Double age = null;
			ProcedureQuery query = new ProcedureQuery("PTF_INFO.GET_PTF_AGE_WEIGHT");
			query.addParameter("PTF_ID", this.ptf.getId().intValue());

			QueryResponse result = this.ptf.getObjectContext().performGenericQuery(query);
			if(result.next() && result.isList()){
				List<DataRow> objList = (List<DataRow>) result.currentList();
				Iterator<DataRow> it = objList.iterator();
				DataRow row = it.next();
				age = (Double)row.get("AGE_WEIGHT");
			}
			return age;
		}

		@SuppressWarnings("unchecked")
		@AgAttribute
		public double getAge(){
			Double age = null;
			ProcedureQuery query = new ProcedureQuery("PTF_INFO.GET_PTF_AGE");
			query.addParameter("PTF_ID", this.ptf.getId().intValue());

			QueryResponse result = this.ptf.getObjectContext().performGenericQuery(query);
			if(result.next() && result.isList()){
				List<DataRow> objList = (List<DataRow>) result.currentList();
				Iterator<DataRow> it = objList.iterator();
				DataRow row = it.next();
				age = (Double)row.get("AGE");
			}
			return age;
		}
	}

	/**
	 * Age relationship. Heavy to compute, so only including it as a relationship to optimise default query performance.
	 * @return an Age object, including age and AgeWeight properties
	 */
	@AgRelationship
	public Age getAge(){
		return new Age(this);
	}
	

	/**
	 * Returns the latest record of Wmo (most recent start date)
	 * @return a Wmo record
	 */
	public String getLatestWmo() {
		String result = null;
		List<Wmo> wmos = this.getWmos();
		if(wmos.size() > 1) {
			// if several WMOs, taking the latest one
			Collections.sort(wmos, new Comparator<Wmo>() {
				 public int compare(Wmo o1, Wmo o2) {
				
				 int v = o2.getStartDate().compareTo(o1.getStartDate());
				 // Bad metadata management
				 if(o2.getStartDate().equals(o1.getStartDate())) {
					 // comparing on the end date if start dates are equal - should not happen
					 o2.getEndDate().compareTo(o1.getEndDate());
					 // if at least one of them has a null end date, taking it
					 if(o2.getEndDate() == null) {
						 return 1;
					 }
					 else {
						 if(o1.getEndDate() == null) {
							 return -1;
						 }
					 }
				 }
				
				 return v;           
				 	}
	        	}    
			);
			result = wmos.get(0).getWmo();
		}
		else if(wmos.size() == 1) {
			result = wmos.get(0).getWmo();
		}
		return result;
	}
}

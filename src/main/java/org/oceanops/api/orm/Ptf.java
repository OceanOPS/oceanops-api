package org.oceanops.api.orm;

import org.oceanops.api.orm.auto._Ptf;

import io.agrest.annotation.ClientReadable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ClientReadable(id = true, value = {
	"id","ref","refParent","endingDate","lastUpdate","activityCriterion","closureCriterion","validated","description","eNotificationDate","program",
	"retrieval","ptfDepl","ptfHardware","ptfIdentifiers","endingCause","telecom","trackingSystem","backupTrackingSystem","ptfStatus","dataStatus","ptfModel",
	"backupTelecom","insertDate","updateDate","nokReason","age","ageWeight","name","ptfAutomation","ptfInspection","ptfSoftware", "latestObs", 
	"ptfPtfStatuses", "agencyPtfs", "networkPtfs", "lines", "wmos", "ptfVariables"})
public class Ptf extends _Ptf {
	private static final long serialVersionUID = 1L;

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

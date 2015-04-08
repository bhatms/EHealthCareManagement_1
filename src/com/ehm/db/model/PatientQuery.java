package com.ehm.db.model;

import java.util.Date;

public class PatientQuery {

	private int patientId;
	private int queryId;
	private String queryDesc; 
	private Date queryDate;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getQueryId() {
		return queryId;
	}
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}
	public String getQueryDesc() {
		return queryDesc;
	}
	public void setQueryDesc(String queryDesc) {
		this.queryDesc = queryDesc;
	}
	public Date getQueryDate() {
		return queryDate;
	}
	public void setQueryDate(Date queryDate) {
		this.queryDate = queryDate;
	}
	public String getIsAns() {
		return isAns;
	}
	public void setIsAns(String isAns) {
		this.isAns = isAns;
	}
	private String isAns;
	
}

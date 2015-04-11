package com.ehm.db.model;

import java.util.Date;

public class PatientQuery {

	private int patientId;
	private int queryId;
	private int subQueryId;
	private String queryCategory;
	private String queryDescription;
	private String queryStatus;
	private Date queryDate;
	private int doctorId;
	private String doctorsReply;
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
	public int getSubQueryId() {
		return subQueryId;
	}
	public void setSubQueryId(int subQueryId) {
		this.subQueryId = subQueryId;
	}
	public String getQueryCategory() {
		return queryCategory;
	}
	public void setQueryCategory(String queryCategory) {
		this.queryCategory = queryCategory;
	}
	public String getQueryDescription() {
		return queryDescription;
	}
	public void setQueryDescription(String queryDescription) {
		this.queryDescription = queryDescription;
	}
	public String getQueryStatus() {
		return queryStatus;
	}
	public void setQueryStatus(String queryStatus) {
		this.queryStatus = queryStatus;
	}
	public Date getQueryDate() {
		return queryDate;
	}
	public void setQueryDate(Date queryDate) {
		this.queryDate = queryDate;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorsReply() {
		return doctorsReply;
	}
	public void setDoctorsReply(String doctorsReply) {
		this.doctorsReply = doctorsReply;
	}
	
	
}

package com.ehm.db.model;

import java.util.Date;

public class PatientQuery {

	private int patient_id;
	private int query_id;
	private int sub_query_id;
	private String query_category;
	private String query_description;
	private String query_status;
	private Date query_date;
	private int doctor_id;
	private String doctors_reply;
	
	public int getPatientId() {
		return patient_id;
	}
	public void setPatientId(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getQueryId() {
		return query_id;
	}
	public void setQueryId(int query_id) {
		this.query_id = query_id;
	}
	public String getQueryDesc() {
		return query_description;
	}
	public void setQueryDesc(String query_description) {
		this.query_description = query_description;
	}
	public Date getQueryDate() {
		return query_date;
	}
	public void setQueryDate(Date query_date) {
		this.query_date = query_date;
	}
	public int getSubQueryId() {
		return sub_query_id;
	}
	public void setSubQueryId(int sub_query_id) {
		this.sub_query_id = sub_query_id;
	}
	public String getQueryCategory() {
		return query_category;
	}
	public void setQuerycategory(String query_category) {
		this.query_category = query_category;
	}
	public String getQueryStatus() {
		return query_status;
	}
	public void setQueryStatus(String query_status) {
		this.query_status = query_status;
	}
	public int getDoctorId() {
		return doctor_id;
	}
	public void setDoctorId(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctorsReply() {
		return doctors_reply;
	}
	public void setDoctorsReply(String doctors_reply) {
		this.doctors_reply = doctors_reply;
	}

	
}

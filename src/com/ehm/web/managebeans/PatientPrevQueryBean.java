package com.ehm.web.managebeans;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

import com.ehm.db.impl.DoctorDao;
import com.ehm.db.impl.DoctorDaoImpl;
import com.ehm.db.impl.PatientPrevQueryDao;
import com.ehm.db.impl.PatientPrevQueryDaoImpl;
import com.ehm.db.model.Doctor;
import com.ehm.db.model.Patient;

public class PatientPrevQueryBean {

	private int patientId;
	private List<Patient> prevQueryList;
	private int queryId;
	private String queryDesc;
	private Date queryDate;
	

	public PatientPrevQueryBean() {
		resetFields();
	}

	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the queryId
	 */
	public int getQueryId() {
		return queryId;
	}

	/**
	 * @param queryId
	 *            the queryId to set
	 */
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public List<Patient> getPrevQueryList() {
		return prevQueryList;
	}

	public void setPrevQueryList(List<Patient> prevQueryList) {
		this.prevQueryList = prevQueryList;
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

	public String dispalyPrevQuery() {

		PatientPrevQueryDao patientprevqueryDao = new PatientPrevQueryDaoImpl();
		try {
		}
			prevQueryList = patientprevqueryDao.getSearchDoctorRecords(specialization,
					firstName, lastName);
			if (prevQueryList != null && !prevQueryList.isEmpty()) {
				showSearch = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String goToDetailProfile() {

		DoctorDao doctorDao = new DoctorDaoImpl();
		String result = null;
		try {
			String selectedDoctorId = FacesContext.getCurrentInstance()
					.getExternalContext().getRequestParameterMap()
					.get("doctorId");

			if (selectedDoctorId != null && !selectedDoctorId.trim().isEmpty()) {
				int docId = Integer.valueOf(selectedDoctorId);
				doctorProfileList = doctorDao.getDoctorProfile(docId);
				result = "navigateToDoctorProfile";
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static void main(String[] args) {
		PatientPrevQueryDao patientprevqueryDao = new PatientPrevQueryDaoImpl();
		try {
			List<Patient> prevqueryList = patientprevqueryDao.getSearchDoctorRecords(null,
					"S", null);

			for (Patient patient : prevqueryList) {
				System.out.println("**" + doctor.getFirstName() + ","
						+ doctor.getLastName() + ","
						+ doctor.getSpecialization());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the showSearch
	 */
	public boolean isShowSearch() {
		return showSearch;
	}

	/**
	 * @param showSearch
	 *            the showSearch to set
	 */
	public void setShowSearch(boolean showSearch) {
		this.showSearch = showSearch;
	}

	/**
	 * @return the doctorId
	 */
	public int getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId
	 *            the doctorId to set
	 */
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	/**
	 * @return the doctorProfileList
	 */
	public Doctor getDoctorProfileList() {
		return doctorProfileList;
	}

	/**
	 * @param doctorProfileList
	 *            the doctorProfileList to set
	 */
	public void setDoctorProfileList(Doctor doctorProfileList) {
		this.doctorProfileList = doctorProfileList;
	}

	private void resetFields() {

		patientId = 0;

	}

	/**
	 * @return the loginError
	 */

}

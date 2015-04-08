package com.ehm.web.managebeans;

import java.sql.SQLException;
import java.util.List;

import com.ehm.db.impl.PatientQueryDao;
import com.ehm.db.impl.PatientQueryDaoImpl;
import com.ehm.db.model.PatientQuery;

public class PatientBean {
	
	private int patientId;
	private List<PatientQuery> patientQueryList;

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

	public List<PatientQuery> getPatientQueryList() {
		return patientQueryList;
	}

	public void setPatientQueryList(List<PatientQuery> patientQueryList) {
		this.patientQueryList = patientQueryList;
	}

	public String dispalyQuery() {

		PatientQueryDao patientqueryDao = new PatientQueryDaoImpl();

		try {
			patientQueryList = patientqueryDao.patientQuery(patientId);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return "navigateToQueryPage";
	}

}

package com.ehm.db.impl;

import java.sql.SQLException;
import java.util.List;

import com.ehm.db.model.Patient;


public interface PatientPrevQueryDao {

	List<Patient> previousQuery(int patientId) throws SQLException, ClassNotFoundException;
	
}

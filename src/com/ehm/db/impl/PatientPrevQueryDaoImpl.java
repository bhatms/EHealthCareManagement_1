package com.ehm.db.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ehm.db.config.EHMDataConnect;
import com.ehm.db.model.Patient;

public class PatientPrevQueryDaoImpl implements PatientPrevQueryDao {

	public List<Patient> previousQuery(int patientId) throws SQLException, ClassNotFoundException {

		/*
		 * Class.forName("com.mysql.jdbc.Driver"); connection =
		 * DriverManager.getConnection
		 * ("jdbc:mysql://127.0.0.1:3306/ssdi","root","123456");
		 */

		PreparedStatement ps = EHMDataConnect.getDataConn().prepareStatement(
				"Select * from query where patientId = ? and is_ans = 'Y'");
		
		ps.setInt(1, patientId);

		ResultSet resultSet = ps.executeQuery();
		
		if(resultSet != null && resultSet.next()){
			Patient pat = new Patient();
			pat.setQueryDesc(resultSet.getString("queryDesc"));
			pat.setQueryDate(resultSet.getString("queryDate"));
			list.add(pat);
			
		}
		
		return logedinPatient;
	}

}

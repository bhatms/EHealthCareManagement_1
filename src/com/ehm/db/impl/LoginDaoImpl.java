package com.ehm.db.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehm.db.config.EHMDataConnect;
import com.ehm.db.model.Patient;

public class LoginDaoImpl implements LoginDao {

	public Patient validate(String userEmail, String password) throws ClassNotFoundException, SQLException {

		/*
		 * Class.forName("com.mysql.jdbc.Driver"); connection =
		 * DriverManager.getConnection
		 * ("jdbc:mysql://127.0.0.1:3306/ssdi","root","123456");
		 */
		Patient logedinPatient = null;

		PreparedStatement ps = EHMDataConnect.getDataConn().prepareStatement(
				"Select * from patient where email = ? and password = ?");
		
		ps.setString(1, userEmail);
		ps.setString(2, password);

		ResultSet resultSet = ps.executeQuery();
		
		if(resultSet != null && resultSet.next()){
			logedinPatient = new Patient();
			logedinPatient.setFirstName(resultSet.getString("first_name"));
			logedinPatient.setLastName(resultSet.getString("last_name"));
			logedinPatient.setAddrLine1(resultSet.getString("address_line1"));
			logedinPatient.setCity(resultSet.getString("address_city"));
			logedinPatient.setZip(resultSet.getString("address_zip"));
			logedinPatient.setState(resultSet.getString("address_state"));
			logedinPatient.setEmailId(resultSet.getString("email"));
			logedinPatient.setPhoneNum(resultSet.getString("phone_no"));
			logedinPatient.setPatientId(resultSet.getInt("patient_id"));
			logedinPatient.setDob(resultSet.getString("dob"));
			logedinPatient.setGender(resultSet.getString("gender"));
			logedinPatient.setPassword(resultSet.getString("password"));
		}
		
		return logedinPatient;
	}

}

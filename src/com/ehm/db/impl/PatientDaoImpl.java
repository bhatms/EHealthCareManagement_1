package com.ehm.db.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehm.db.config.EHMDataConnect;
import com.ehm.db.model.Patient;

public class PatientDaoImpl {


	public Patient ceateNewAccount(Patient insertPatient) throws SQLException,
			ClassNotFoundException {

		String insertTableSQL = " INSERT INTO patient "
				+ " (first_name, last_name, address_line1, address_city,address_state, address_zip , "
				+ "phone_no , email , password, dob, gender ) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ;";

		PreparedStatement preparedStatement = EHMDataConnect.getDataConn()
				.prepareStatement(insertTableSQL);
		preparedStatement.setString(1, insertPatient.getFirstName());
		preparedStatement.setString(2, insertPatient.getLastName());
		preparedStatement.setString(3, insertPatient.getAddrLine1());
		preparedStatement.setString(4, insertPatient.getCity());
		preparedStatement.setString(5, insertPatient.getState());
		preparedStatement.setString(6, insertPatient.getZip());
		preparedStatement.setString(7, insertPatient.getPhoneNum());
		preparedStatement.setString(8, insertPatient.getEmailId());
		preparedStatement.setString(9, insertPatient.getPassword());
		preparedStatement.setString(10, insertPatient.getDob());
		preparedStatement.setString(11, insertPatient.getGender());

		preparedStatement.executeUpdate();

		return getNewCreatedPatient(insertPatient.getEmailId());
	}

	private Patient getNewCreatedPatient(String emailId)
			throws ClassNotFoundException, SQLException {

		String sqlStr = "select * from patient where email = ?";

		Patient newPatient = null;
		PreparedStatement ps = EHMDataConnect.getDataConn().prepareStatement(
				sqlStr);
		ps.setString(1, emailId);

		ResultSet result = ps.executeQuery();

		while(result.next()){
			
			newPatient = new Patient();
			newPatient.setPatientId(result.getInt("patient_id"));
			newPatient.setFirstName(result.getString("first_name"));
			newPatient.setLastName(result.getString("last_name"));
			newPatient.setAddrLine1(result.getString("address_line1"));
			newPatient.setCity(result.getString("address_city"));
			newPatient.setState(result.getString("address_state"));
			newPatient.setZip(result.getString("address_zip"));
			newPatient.setPhoneNum(result.getString("phone_no"));
			newPatient.setEmailId(result.getString("email"));
			newPatient.setDob(result.getString("dob"));
			newPatient.setGender(result.getString("gender"));
			newPatient.setPassword(result.getString("password"));
		}
		
		return newPatient;
	}

}

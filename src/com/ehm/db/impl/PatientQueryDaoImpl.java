package com.ehm.db.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ehm.db.config.EHMDataConnect;
import com.ehm.db.model.PatientQuery;

public class PatientQueryDaoImpl implements PatientQueryDao {

	public List<PatientQuery> patientQuery(int patientId) throws SQLException, ClassNotFoundException {

		/*
		 * Class.forName("com.mysql.jdbc.Driver"); connection =
		 * DriverManager.getConnection
		 * ("jdbc:mysql://127.0.0.1:3306/ssdi","root","123456");
		 */

		PreparedStatement ps = EHMDataConnect.getDataConn().prepareStatement(
				"Select * from query where patientId = ? and is_ans = 'Y'");
		
		ps.setInt(1, patientId);
		
		List<PatientQuery> list = new ArrayList<PatientQuery>();

		ResultSet resultSet = ps.executeQuery();
		
		if(resultSet != null && resultSet.next()){
			PatientQuery patque = new PatientQuery();
			patque.setQueryDesc(resultSet.getString("queryDesc"));
			patque.setQueryDate(resultSet.getDate("queryDate"));
			patque.setIsAns(resultSet.getString("isAns"));
			list.add(patque);
			
		}
		
		return list;
	}

}

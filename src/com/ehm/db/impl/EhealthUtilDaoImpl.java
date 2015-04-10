package com.ehm.db.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.ehm.db.config.EHMDataConnect;

public class EhealthUtilDaoImpl implements EhealthUtilDao{

	public List<SelectItem> getStateList() throws ClassNotFoundException,
			SQLException {
		StringBuffer sqlBuf = new StringBuffer("select code, name from state ");


		PreparedStatement ps = EHMDataConnect.getDataConn().prepareStatement(sqlBuf.toString());
		// get customer data from database
		ResultSet result = ps.executeQuery();

		List<SelectItem> list = new ArrayList<SelectItem>();
		while (result.next()) {
			SelectItem item = new SelectItem();
			item.setValue(result.getString("code"));
			item.setLabel(result.getString("name"));
			list.add(item);
		}

		return list;
	}

	public List<SelectItem> getSpecializationList()
			throws ClassNotFoundException, SQLException {
		StringBuffer sqlBuf = new StringBuffer("select * from specializations ");


		PreparedStatement ps = EHMDataConnect.getDataConn().prepareStatement(sqlBuf.toString());
		// get customer data from database
		ResultSet result = ps.executeQuery();

		List<SelectItem> list = new ArrayList<SelectItem>();
		list.add(new SelectItem("all","All"));
		while (result.next()) {
			SelectItem item = new SelectItem();
			item.setValue(result.getString("special_id"));
			item.setLabel(result.getString("special_title"));
			list.add(item);
		}

		return list;
	}

}

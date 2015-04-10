package com.ehm.web.managebeans;

import java.sql.SQLException;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.ehm.db.impl.DoctorDao;
import com.ehm.db.impl.DoctorDaoImpl;
import com.ehm.db.impl.EhealthUtilDao;
import com.ehm.db.impl.EhealthUtilDaoImpl;
import com.ehm.db.model.Doctor;

public class DoctorBean {

	private String firstName;
	private String lastName;
	private String qualification;
	private String registrationNum;
	private String specialization;
	private String designation;
	private String visitingDays;
	private String visitingHours;
	private String emailId;
	private String phoneNum;
	private List<SelectItem> specializationList;

	private List<Doctor> doctorSearchList;
	private boolean showSearch;
	private int doctorId;
	private Doctor doctorProfileList;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification
	 *            the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the registrationNum
	 */
	public String getRegistrationNum() {
		return registrationNum;
	}

	/**
	 * @param registrationNum
	 *            the registrationNum to set
	 */
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization
	 *            the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the visitingDays
	 */
	public String getVisitingDays() {
		return visitingDays;
	}

	/**
	 * @param visitingDays
	 *            the visitingDays to set
	 */
	public void setVisitingDays(String visitingDays) {
		this.visitingDays = visitingDays;
	}

	/**
	 * @return the visitingHours
	 */
	public String getVisitingHours() {
		return visitingHours;
	}

	/**
	 * @param visitingHours
	 *            the visitingHours to set
	 */
	public void setVisitingHours(String visitingHours) {
		this.visitingHours = visitingHours;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum
	 *            the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the doctorSearchList
	 */
	public List<Doctor> getDoctorSearchList() {
		return doctorSearchList;
	}

	/**
	 * @param doctorSearchList
	 *            the doctorSearchList to set
	 */
	public void setDoctorSearchList(List<Doctor> doctorSearchList) {
		this.doctorSearchList = doctorSearchList;
	}

	/**
	 * @return the specializationList
	 */
	public List<SelectItem> getSpecializationList() {

		EhealthUtilDao doctorDao = new EhealthUtilDaoImpl();
		try {
			specializationList = doctorDao.getSpecializationList();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return specializationList;
	}

	/**
	 * @param specializationList
	 *            the specializationList to set
	 */
	public void setSpecializationList(List<SelectItem> specializationList) {
		this.specializationList = specializationList;
	}

	public String searchDoctor() {

		DoctorDao doctorDao = new DoctorDaoImpl();
		try {
			if ("all".equals(specialization)) {
				specialization = null;
			}
			doctorSearchList = doctorDao.getSearchDoctorRecords(specialization,
					firstName, lastName);
			if (doctorSearchList != null && !doctorSearchList.isEmpty()) {
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
		DoctorDao doctorDao = new DoctorDaoImpl();
		try {
			List<Doctor> doctorList = doctorDao.getSearchDoctorRecords(null,
					"S", null);

			for (Doctor doctor : doctorList) {
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

	public void reset() {

		showSearch = false;
		firstName = null;
		lastName = null;
		doctorProfileList = null;

	}
}

package com.ehm.web.managebeans;

import java.sql.SQLException;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.ehm.db.impl.PatientDaoImpl;
import com.ehm.db.model.Patient;

public class NewAccountBean {

	private String firstName;
	private String lastName;
	private String addressLine;
	private String zip;
	private String emailId;
	private String city;
	private String state;
	private String phoneNo;
	private String password;
	private String gender;
	private String dateOfBirth;

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
	 * @return the addressLine
	 */
	public String getAddressLine() {
		return addressLine;
	}

	/**
	 * @param addressLine
	 *            the addressLine to set
	 */
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String saveAccount() {

		String saveResult = null;
		Patient newPatient = new Patient();
		newPatient.setFirstName(firstName);
		newPatient.setLastName(lastName);
		newPatient.setGender(gender);
		newPatient.setDob(dateOfBirth);
		newPatient.setPhoneNum(phoneNo);
		newPatient.setAddrLine1(addressLine);
		newPatient.setState(state);
		newPatient.setCity(city);
		newPatient.setZip(zip);
		newPatient.setEmailId(emailId);
		newPatient.setPassword(password);

		PatientDaoImpl patientDaoObj = new PatientDaoImpl();

		try {

			Patient addedPatient = patientDaoObj.ceateNewAccount(newPatient);
			saveResult = "success";
			
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context
					.getExternalContext().getSession(true);
			session.setAttribute("loggedInPatient", addedPatient);
			session.setAttribute("username", addedPatient.getEmailId());
			session.setAttribute("userfName", addedPatient.getFirstName());
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveResult;
	}
}

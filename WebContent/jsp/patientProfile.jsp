<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Healthcare Management</title>
<link href="/EHealthcareManagement/resources/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
</head>


<body>

	<f:view>
		<h:graphicImage value="/images/logo1.PNG" width="98%" height="150"
			style="margin-left: 10%, margin-right: 10%;"></h:graphicImage>
		<br>
		<h2>Profile</h2>
		<h:form>
			<table>
				<tr>
					<td><h:outputLabel value="Personal Information:"
							style="font-weight: bold;" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="First Name"></h:outputLabel></td>
					<td><h:inputText
							value="#{newAccountBean.currentPatient.firstName}" id="new_fname"
							required="true" requiredMessage="Please Enter first name"></h:inputText></td>
					<td><h:message for="new_fname" style="color:red" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="Last Name"></h:outputLabel></td>
					<td><h:inputText
							value="#{newAccountBean.currentPatient.lastName}" id="new_lname"
							required="true" requiredMessage="Please Enter last name"></h:inputText></td>
					<td><h:message for="new_lname" style="color:red" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="Date Of Birth"></h:outputLabel></td>
					<td><h:inputText value="#{newAccountBean.currentPatient.dob}"
							id="new_dob" required="true"
							requiredMessage="Please date of birth">
						</h:inputText> <h:outputLabel value="mm/dd/yyyy" /></td>
					<td><h:message for="new_dob" style="color:red" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="Phone No"></h:outputLabel></td>
					<td><h:inputText
							value="#{newAccountBean.currentPatient.phoneNum}" id="phone_no"
							required="true" requiredMessage="Please Enter phone no."></h:inputText></td>

					<td><h:message for="phone_no" style="color:red" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="Address Information:"
							style="font-weight: bold;" /></td>
				</tr>

				<tr>

					<td><h:outputLabel value="Address Line"></h:outputLabel></td>
					<td><h:inputText
							value="#{newAccountBean.currentPatient.addrLine1}" id="addrLine"
							required="true" requiredMessage="Please Enter address line"></h:inputText></td>
					<td><h:message for="addrLine" style="color:red" /></td>
				</tr>
				<tr>

					<td><h:outputLabel value="State"></h:outputLabel></td>
					<td><h:inputText
							value="#{newAccountBean.currentPatient.state}" id="state"
							required="true" requiredMessage="Please Enter state."></h:inputText>
					</td>
					<td><h:message for="state" style="color:red" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="City"></h:outputLabel></td>
					<td><h:inputText value="#{newAccountBean.currentPatient.city}"
							id="city" required="true" requiredMessage="Please Enter city"></h:inputText>
					</td>
					<td><h:message for="City" style="color:red" /></td>
				</tr>
				<tr>
					<td><h:outputLabel value="Zip"></h:outputLabel></td>
					<td><h:inputText value="#{newAccountBean.currentPatient.zip}"
							id="zip" maxlength="5" required="true"
							requiredMessage="Please Enter zip">
						</h:inputText></td>
					<td><h:message for="Zip" style="color:red" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><h:commandButton value="Update Profile"
							action="#{newAccountBean.updateSaveProfile}" styleClass="btn btn-success"/></td>
					<td><h:commandButton value="Cancel"
							action="#{newAccountBean.backToHome}" styleClass="btn btn-success"/></td>
					<td></td>
				</tr>
			</table>

		</h:form>


	</f:view>
</body>
</html>
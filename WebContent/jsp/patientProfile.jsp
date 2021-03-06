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

<script type="text/javascript">
	function cancelPage() {

		document.getElementById("profileForm:cmdLnkIdSuppliers").click();

	}
</script>
</head>


<body>

	<f:view>
		<h:graphicImage value="/images/logo1.PNG" width="98%" height="150"
			style="margin-left: 10%, margin-right: 10%;"></h:graphicImage>
		<br>

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">Pofile</h3>
			</div>
		</div>	
			<!-- <div class="panel-body"> -->
			<h:form id="profileForm">
				<h:message for="profileForm"></h:message>
				<table>
					<tr>
						<td><h:outputLabel value="First Name"></h:outputLabel></td>
						<td><h:inputText styleClass="form-control"
								value="#{newAccountBean.firstName}" id="new_fname"
								required="true" requiredMessage="Please Enter first name"></h:inputText></td>
						<td><h:message for="new_fname" style="color:red" /></td>
					</tr>
					<tr>
						<td><h:outputLabel value="Last Name"></h:outputLabel></td>
						<td><h:inputText styleClass="form-control"
								value="#{newAccountBean.lastName}" id="new_lname"
								required="true" requiredMessage="Please Enter last name"></h:inputText></td>
						<td><h:message for="new_lname" style="color:red" /></td>
					</tr>
					<tr>
						<td><h:outputLabel value="Date Of Birth"></h:outputLabel></td>
						<td><h:inputText value="#{newAccountBean.dateOfBirth}"
								id="new_dob" required="true" styleClass="form-control"
								requiredMessage="Please date of birth">
							</h:inputText> <h:outputLabel value="mm/dd/yyyy" /></td>
						<td><h:message for="new_dob" style="color:red" /></td>
					</tr>
					<tr>
						<td><h:outputLabel value="Phone No"></h:outputLabel></td>
						<td><h:inputText styleClass="form-control"
								value="#{newAccountBean.phoneNo}" id="phone_no" required="true"
								requiredMessage="Please Enter phone no."></h:inputText></td>

						<td><h:message for="phone_no" style="color:red" /></td>
					</tr>
					<tr>

						<td><h:outputLabel value="Address Line"></h:outputLabel></td>
						<td><h:inputText styleClass="form-control"
								value="#{newAccountBean.addressLine}" id="addrLine"
								required="true" requiredMessage="Please Enter address line"></h:inputText></td>
						<td><h:message for="addrLine" style="color:red" /></td>
					</tr>
					<tr>

						<td><h:outputLabel value="State"></h:outputLabel></td>
						<td>
							<%-- <h:inputText styleClass="form-control"
							value="#{newAccountBean.state}" id="state" required="true"
							requiredMessage="Please Enter state."></h:inputText> --%> <h:selectOneMenu
								value="#{newAccountBean.state}" id="state" required="true"
								requiredMessage="Please Enter state." styleClass="form-control">
								<f:selectItems value="#{newAccountBean.stateList}" />
							</h:selectOneMenu>
						</td>
						<td><h:message for="state" style="color:red" /></td>
					</tr>
					<tr>
						<td><h:outputLabel value="City"></h:outputLabel></td>
						<td><h:inputText value="#{newAccountBean.city}"
								styleClass="form-control" id="city" required="true"
								requiredMessage="Please Enter city"></h:inputText></td>
						<td><h:message for="City" style="color:red" /></td>
					</tr>
					<tr>
						<td><h:outputLabel value="Zip"></h:outputLabel></td>
						<td><h:inputText value="#{newAccountBean.zip}" id="zip"
								maxlength="5" required="true" requiredMessage="Please Enter zip"
								styleClass="form-control">
							</h:inputText></td>
						<td><h:message for="Zip" style="color:red" /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td><h:commandButton value="Update Profile"
								action="#{newAccountBean.updateSaveProfile}"
								styleClass="btn btn-success" /></td>
						<td>&nbsp;<input type="button" value="Cancel"
							onclick="cancelPage();" class="btn btn-success" /></td>
						<td></td>
					</tr>
				</table>
				<h:commandLink id="cmdLnkIdSuppliers" immediate="true"
					action="#{newAccountBean.backToHome}" value="">
					<f:verbatim></f:verbatim>
				</h:commandLink>
			</h:form>

		





	</f:view>
</body>
</html>
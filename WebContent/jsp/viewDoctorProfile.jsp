<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Healthcare Management</title>
</head>


<body>

	<f:view>
		<h:graphicImage value="/images/logo1.PNG" width="98%" height="150"
			style="margin-left: 10%, margin-right: 10%;"></h:graphicImage>
		<br>
		<br>
		<h2>Doctor Profile</h2>
		<h:form id="viewDoctorProfileForm">



			<table>
				<tr>
					<td><h:outputText value="Name:" /></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.firstName}"></h:outputText>&nbsp;
						<h:outputText value="#{doctorBean.doctorProfileList.lastName}"></h:outputText></td>
				</tr>
				<tr>
					<td><h:outputText value="Qualification" /></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.qualification}" /></td>
				</tr>
				<tr>
					<td><h:outputText value="Specialization" /></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.specialization}" /></td>
				</tr>
				<tr>
					<td><h:outputText value="Designation" /></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.designation}" /></td>
				</tr>
				<tr>
					<td><h:outputText value="Visiting Days:"/></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.visitingDays}" /></td>
				</tr>
				<tr>
					<td><h:outputText value="Visiting Hours:"/></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.visitingHours}" /></td>
				</tr>

				<tr>
					<td><h:outputText value="Email ID:" /></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.emailId}" /></td>
				</tr>
				<tr>
					<td><h:outputText value="Phone:" /></td>
					<td><h:outputText
							value="#{doctorBean.doctorProfileList.phoneNum}" /></td>
				</tr>
			<tr>
			<td>
			<h:commandButton value="Back to search" action="#{welcomeBean.goToSearchDoctor}"/>
			</td>
			<td>
			</td>
			</tr>
			</table>
			



		</h:form>


	</f:view>
</body>
</html>
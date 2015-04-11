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
		<br>

		<h:outputText value="Patient Queries" style="font-weight:bold;"></h:outputText>
		<h:form id="PatientQueries">
			<h:dataTable id="patientQueryTable" value="#{patientBean.patientQueryList}"
				var="patque"  border="1">

				<h:column>
					<f:facet name="header">
						<h:outputText value="Query Category" />
					</f:facet>
						<h:outputText value="#{patque.queryCategory}"></h:outputText>

				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Query Description" />
					</f:facet>
					<h:outputText value="#{patque.queryDescription}"></h:outputText>

				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Query Status" />
					</f:facet>
					<h:outputText value="#{patque.queryStatus}"></h:outputText>

				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Query Date" />
					</f:facet>
					<h:outputText value="#{patque.queryDate}"></h:outputText>

				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Doctors Reply" />
					</f:facet>
					<h:outputText value="#{patque.doctorsReply}"></h:outputText>

				</h:column>

			</h:dataTable>

		</h:form>
	</f:view>
</body>
</html>
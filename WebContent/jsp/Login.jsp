<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>
	<html>
<head>
<title>Login E-healthCare</title>
<link href="/EHealthcareManagement/resources/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<h:form>
		<h:graphicImage value="/images/logo1.PNG" width="98%" height="150"
			style="margin-left: 10%, margin-right: 10%;"></h:graphicImage>

		<h:messages style="color:red;" />
		<table>
			<tr>
				<td><h:outputLabel value="Enter Email id: "></h:outputLabel></td>
				<td><h:inputText id="email" value="#{loginBean.email}"
						required="true" requiredMessage="Please enter user email id."></h:inputText>
				</td>
			</tr>
			<tr>
				<td><h:outputLabel value="Enter Password: "></h:outputLabel></td>
				<td><h:inputSecret id="password" value="#{loginBean.password}"
						required="true" requiredMessage="Please enter password."></h:inputSecret>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><h:commandButton value="Login"
						action="#{loginBean.validAndLoginUser}"></h:commandButton></td>
			</tr>
		</table>
	</h:form>
</body>
	</html>
</f:view>
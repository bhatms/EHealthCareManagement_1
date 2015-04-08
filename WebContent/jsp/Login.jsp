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

	
	
	<div class="container">
			<h:messages style="color:red;"></h:messages>
			<br>
			<table>
				<tr>
					<td><h:outputLabel value="Enter Email id: "></h:outputLabel></td>
					<td><h:inputText id="email" value="#{loginBean.email}" required="true"
							requiredMessage="Please Enter User Name" 
							validatorMessage="Username value is invalid."
							styleClass="form-control">
							</h:inputText>
							</td>
				</tr>
				<tr><td>&nbsp;</td><td>&nbsp;</td></tr>
				<tr>
					<td><h:outputLabel value="Enter Password: "></h:outputLabel></td>
					<td><h:inputSecret id="password" value="#{loginBean.password}"
						 required="true" requiredMessage="Please Enter Password." styleClass="form-control"
							validatorMessage="Password value is invalid.">
							</h:inputSecret>
							</td>
				</tr>
				<tr><td>&nbsp;</td><td>&nbsp;</td></tr>
				<tr><td></td>
					<td><h:commandButton value="Login"
						action="#{loginBean.validAndLoginUser}" 
						styleClass="btn btn-success"></h:commandButton> &nbsp;</td>
					
				</tr>
			</table>
		</div>
		</h:form>
	
	
</body>
	</html>
</f:view>
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
	<h1 style="font:san-serif;">Welcome To E-Healthcare</h1>
	<f:view>

		<h:form>
			<table>
				<tr>
					<td><h:commandLink action="#{welcomeBean.goToSearchDoctor}"
							value="Find Doctor"></h:commandLink></td>
					<td>&nbsp;</td>		
					<td><h:commandLink action="#{welcomeBean.goToCreateAccount}"
							value="Create Account"></h:commandLink></td>
					<td>&nbsp;</td>
					<td><h:commandLink action="#{welcomeBean.goToLogin}"
							value="Login"></h:commandLink></td>
					<td>&nbsp;</td>
					
					<td><h:commandLink action="#{welcomeBean.goToCreateAccount}"
							value="Create New Account"></h:commandLink></td>
					<td>&nbsp;</td>
				</tr>
			</table>
		</h:form>
	</f:view>

</body>
</html>

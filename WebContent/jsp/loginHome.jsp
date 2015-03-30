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
		<h:form>
			<table>
				<tr>
					<td>
						<h2>
							Welcome&nbsp;
							<%=session.getAttribute("userfName")%></h2>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
					<td>&nbsp;&nbsp;</td>
					<td align="right"><h:commandLink value="Logout"
							action="#{loginBean.userLogout }" /></td>
				</tr>
			</table>

			<h:panelGrid>
				<h:commandLink value="Profile"></h:commandLink>
				<h:commandLink value="History"></h:commandLink>

			</h:panelGrid>
		</h:form>
	</f:view>

</body>
</html>
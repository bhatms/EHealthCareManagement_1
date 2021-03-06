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

<link
	href="/EHealthcareManagement/resources/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
</head>


<body>
	<f:view>
		<h:form>
			<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<div class="container">
				<div class="navbar-header">
				<a class="navbar-brand" href="#"> <img alt="Brand" src="/EHealthcareManagement/images/eHealthLog.png"
				style="max-width:100%;max-height:100%;">
						</a>
				</div>
					<div class="navbar-header">
						
						<h3 style="color: white;">EHealthcare</h3>
					</div>

				</div>
			</div>

			<!-- Main jumbotron for a primary marketing message or call to action -->
			<div class="jumbotron">
				<div class="container">

					<div class="row">
						<div class="col-md-4">
							<h3>Explore</h3>

							<ul class="nav">
								<li><h:commandLink action="#{welcomeBean.goToSearchDoctor}"
										value="Find Doctor"></h:commandLink></li>
								<li><h:commandLink action="#{welcomeBean.goToLogin}"
										value="Login"></h:commandLink></li>
								<li><h:commandLink
										action="#{welcomeBean.goToCreateAccount}"
										value="Create New Account"></h:commandLink></li>
							</ul>
						</div>
						<div class="col-md-4">
							<h:graphicImage value="/images/ol_doct.jpg"
								style="max-width:100%;max-height:100%;"></h:graphicImage>
						</div>
						<div class="col-md-4">
							<h3>About Us</h3>
							<p style="font-size: small; text-align: justify;">At
								EHealthcare, we are committed to improving the health care
								system. EHealthcare is an operating division of EHealth Group,
								the largest single health carrier in the E States. As a
								recognized leader in the health and well-being industry, we
								strive to: Improve the quality and effectiveness of health care
								for all Americans Enhance access to health benefits Create
								products and services that make health care more affordable Use
								technology to make the health care system easier to navigate Our
								family of companies delivers innovative products and services to
								approximately 70 million Americans. EHealthcare's nationwide
								network includes 595,000 physicians and other health care
								professionals, 80,000 dentists and 4,965 hospitals. Our
								pharmaceutical management programs provide more affordable
								access to drugs for 13 million people. We're committed to the
								delivery of quality care and its continual improvement. In fact,
								EHealth Group made significant investments in research and
								development, technology and business process improvements -
								nearly $3 billion in the past five years. These investments led
								to changes that are improving the way care is delivered and
								administered across the entire industry.</p>
						</div>
					</div>

				</div>
			</div>

			<div class="container">
				<!-- Example row of columns -->


				<hr />

				<footer>
				<p>&copy; Company 2015</p>
				</footer>
			</div>
			<!-- /container -->
		</h:form>
	</f:view>

</body>
</html>
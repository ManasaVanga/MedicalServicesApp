<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Medical Services Portal</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
</head>
<body>
	<div class="container">
		<form class="form-group" action="login.htm">
			<div class="jumbotron">
				<h1>Medical Management</h1>

				<a href="${pageContext.request.contextPath}/admin/login" ><img
					src="${pageContext.request.contextPath}/resources/images/admin_img.png"
					width="300" height="300" class="img-circle" alt="Cinque Terre"></a>
					
				<a href="${pageContext.request.contextPath}/doctor/login" ><img
					src="${pageContext.request.contextPath}/resources/images/doctor_img.jpg"
					width="300" height="300" class="img-circle" alt="Cinque Terre"></a>
					
				<a href="${pageContext.request.contextPath}/user/login" ><img
					src="${pageContext.request.contextPath}/resources/images/user_img.png"
					width="300" height="300" class="img-circle" alt="Cinque Terre"></a>
				<br>
				<br>
			</div>
		</form>
	</div>

</body>
</html>
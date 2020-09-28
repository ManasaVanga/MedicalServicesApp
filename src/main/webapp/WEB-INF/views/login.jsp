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
            <div class="row">
                <div class="col-sm-6">

                    <form>

                        <div class="form-group">
                            <h3> Already a Member?</h3>
                            <p>Please note that the username and password fields are case sensitive</p>
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                        </div>
                        <div class="form-check">
                            <input type="checkbox" class="form-check-input" id="rememberme">
                            <label class="form-check-label" for="rememberme">Remember me</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>

                </div>

                <div class="col-sm">
                     <form action="/">
                    <p>I am new Here</p>
                    <ul>
                        <li> Have you been provided an enrollement token </li>
                        <li> Do u have a temporary username or password? </li>
                    </ul>
                    <button type="submit" class="btn btn-primary">I am new here</button>
                     </form>
                </div>
                <div class="col-sm">
                    <img src="${pageContext.request.contextPath}/resources/images/patient1.jpg" width="300" height="300" class="img-circle" alt="Cinque Terre">
                </div>
            </div>
        </div>

</body>
</html>
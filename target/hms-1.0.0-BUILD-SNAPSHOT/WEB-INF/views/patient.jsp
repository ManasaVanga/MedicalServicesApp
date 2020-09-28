<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>

<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Patient Registration</title>

        <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
        <link rel="stylesheet" href="//unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css" type="text/css" />
        <link rel="stylesheet" href="//unpkg.com/bootstrap-select@1.12.4/dist/css/bootstrap-select.min.css" type="text/css" />
        <link rel="stylesheet" href="//unpkg.com/bootstrap-select-country@4.0.0/dist/css/bootstrap-select-country.min.css" type="text/css" />

        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <!--        <script src="//unpkg.com/jquery@3.4.1/dist/jquery.min.js"></script> -->
        <script src="//unpkg.com/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script> 
        <script src="//unpkg.com/bootstrap-select@1.12.4/dist/js/bootstrap-select.min.js"></script> 
        <script src="//unpkg.com/bootstrap-select-country@4.0.0/dist/js/bootstrap-select-country.min.js"></script> 

        <script>
            $(document).ready(function () {
                var date_input = $('input[name="date"]');
                var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                var options = {
                    format: 'mm/dd/yyyy',
                    container: container,
                    todayHighlight: true,
                    autoclose: true,
                };
                date_input.datepicker(options);
            })
            $(document).ready(function () {
                var date = new Date();
                var today = new Date(date.getFullYear(), date.getMonth(), date.getDate());
                var optSimple = {
                    format: 'mm/dd/yyyy',
                    todayHighlight: true,
                    orientation: 'bottom right',
                    autoclose: true,
                    container: '#registrationdate'
                };
                $('#simple').datepicker(optSimple);
                $('#simple').datepicker('setDate', today);

                $('.countrypicker').countrypicker();

            })
        </script>
    </head>
    <body>
        <h1>New User Registration Form</h1>
        <div class="container">
             
            <form class="form-group" action="patient/add" method="GET">
                
                <div class="form-group">
                    <label for="email">PatientID</label>
                    <input type="number" class="form-control" id="pid" placeholder="ID" name="pid">
                </div>
                <div class="form-group">
                    <h3>Patient Details</h3>
                    <div id="registrationdate">
                        <label class="control-label" for="simple">Registartion Date</label>
                        <input id="simple" type="text" class="form-control">
                    </div><br><br>
                    First Name<input type="text" id="patientFname" name="pfirstname">
                    Last Name<input type="text" id="patientLname" name="plastname"><br><br>
                    Gender<input type="text" id="patientgender" name="pgender">
                    Occupation<input type="text" id="patientOccupation" name="pOccupation">
                    <br><br> 
                    <label class="control-label" for="date"> Date of Birth</label>
                    <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
                    Age<input type="number" id="page" name="age"><br><br>
                    Blood Group<input type="text" id="pgroup" name="bloodgroup">
                    Marital Status<select class="mdb-select md-form">
                        <option value="" disabled selected>Select</option>
                        <option value="married">Married</option>
                        <option value="unmarried">UnMarried</option>
                    </select>   
                </div>
                <br>
                <div class="form-group">
                    <h3>Contact Details</h3>
                    Address<input type="text" id="patientAddress" name="pAddress">
                    City<input type="text" id="patientcity" name="pcity">
                    Country<select class="selectpicker countrypicker" data-flag="true" ></select>
                    <br><br>
                    Zipcode<input type="number" id="page" name="age">
                    <label for="phone">Contact Number</label>
                    <input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
                    <small>Format: xxx-xxx-xxxx</small>

                </div>
                <div class="form-group">
                    <h3>Doctor Details</h3>
                    Specialization/Department<select class="mdb-select md-form">
                        <option value="" disabled selected>Select</option>
                        <option value="Eye">Eye</option>
                        <option value="dental">Dental</option>
                    </select> <br><br>
                    Consultant Name<select class="mdb-select md-form">
                        <option value="" disabled selected>Select</option>
                        <option value="Doc1">Doctor1</option>
                        <option value="doc2">Doctor2</option>
                    </select> 

                </div>
                <br>
                <button type="submit" class="btn btn-default">Save</button>

            </form>
        </div>

    </body>

</html>
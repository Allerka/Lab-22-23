<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/style.css"%></style>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<legend>Gimme Your Deets</legend>
	<br>
	<br>
	<form action="submission">
     <label class="col-form-label" for="inputDefault">First Name</label>
  <input type="text" class="form-control" placeholder="First Name" name="firstName"> <br>
     <label class="col-form-label" for="inputDefault">Last Name</label>
  <input type="text" class="form-control" placeholder="Last Name" name="lastName"> <br> 
     <label class="col-form-label" for="inputDefault">Age</label>
  <input type="number" class="form-control" placeholder="Enter your age" name="personAge"> <br>
    <label for="emailInput">Email address</label>
      <input type="email" class="form-control" name="emailInput" aria-describedby="emailHelp" placeholder="Enter email">
      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>

	<br>
	<h3>Choose One</h3> <div id="inputText">
		<input type="radio" name="button" value="Power"> Power<br>
		<input type="radio" name="button" value="Wisdom"> Wisdom<br>
		<input type="radio" name="button" value="Courage"> Courage<br>
		</div>
	<br>
	<h3>What do you drink?</h3><div id="inputText">
		<input type="checkbox" name="drink" value="tea">Tea  
		<br><input type="checkbox" name="drink" value="coffee">Coffee 
		<br><input type="checkbox" name="drink" value="energy">Energy Drinks
		</div>  
<br>
	<h3>Sign up for the newsletter?</h3>
		<select name="news">
			<option value="true">Yes</option>
			<option value="false">No</option>
		</select> 
		<br><br>
		<input type="submit" value="Submit" class="btn btn-success">
	</form>
	<br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/style.css"%></style>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Confirmation Page</title>
</head>
<body>
<h3>Thanks, ${name}!
<br><br>
Info you Entered:</h3>
<br><h4>
Full Name: ${fullName }
<br>
Age: ${age }
<br>
Email: ${emailInput }
<br>
Triforce: ${button }
<br>
Drink choices: ${drinks }
<br>
Newsletter: ${newsletter }
<br></h4>

</body>
</html>
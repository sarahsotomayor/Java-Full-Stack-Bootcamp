<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Book Club</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="/css/main.css"> change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <!--<script type="text/javascript" src="/js/app.js"></script> change to match your file/naming structure -->

</head>

<body class="container">

	<header>
		<h1>Book Club</h1>
		<h2 class="text-danger"><c:out value="${error}"/></h2>
		<p>A place for friends to share thoughts on books.</p>
	</header>
	<main class="row">
		<div class="col">
			<form:form action="/register" method="POST" modelAttribute="user">
				<h2>Register:</h2>
				<div>
					<form:label path="username" class="form-label">Username:</form:label>
					<form:input path="username" class="form-control"/>
					<form:errors path="username"/>
				</div>
				<div>
					<form:label path="email" class="form-label">Email:</form:label>
					<form:input path="email" class="form-control"/>
					<form:errors path="email"/>				
				</div>
				<div>
					<form:label path="password" class="form-label">Password:</form:label>
					<form:input path="password" class="form-control"/>
					<form:errors path="password"/>				
				</div>
				<div>
					<form:label path="confirmPassword" class="form-label">Confirm Password:</form:label>
					<form:input path="confirmPassword" class="form-control"/>
					<form:errors path="confirmPassword"/>					
				</div>
				<br>
				<button class="btn btn-primary">Submit</button>				
			</form:form>
		</div>
		
		<div class="col">
			<form:form action="/login" method="POST" modelAttribute="loginUser">
				<h2>Log In:</h2>
				<div>
					<form:label path="email" class="form-label">Email:</form:label>
					<form:input path="email" class="form-control"/>
					<form:errors path="email"/>				
				</div>
				<div>
					<form:label path="password" class="form-label">Password:</form:label>
					<form:input path="password" class="form-control"/>
					<form:errors path="password"/>				
				</div>
				<br>
				<button class="btn btn-primary">Submit</button>				
			</form:form>
		</div>
	</main>

</body>

</html>
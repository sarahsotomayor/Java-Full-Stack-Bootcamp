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
	<title>Hello</title>
</head>

<body>

	<header>
		<h1>Hello!</h1>
	</header>
	<main>
		<div>
			<form:form action="/register" method="POST" modelAttribute="user">
				<h2>Register:</h2>
				<div>
					<form:label path="username">Username:</form:label>
					<form:input path="username"/>
					<form:errors path="username"/>
				</div>
				<div>
					<form:label path="email">Email:</form:label>
					<form:input path="email"/>
					<form:errors path="email"/>				
				</div>
				<div>
					<form:label path="password">Password:</form:label>
					<form:input path="password"/>
					<form:errors path="password"/>				
				</div>
				<div>
					<form:label path="confirmPassword">Confirm Password:</form:label>
					<form:input path="confirmPassword"/>
					<form:errors path="confirmPassword"/>					
				</div>
				<button>Register</button>
			</form:form>
		</div>
		
		<div>
			<form:form action="/login" method="POST" modelAttribute="loginUser">
				<h2>Login:</h2>
				<div>
					<form:label path="email">Email:</form:label>
					<form:input path="email"/>
					<form:errors path="email"/>				
				</div>
				<div>
					<form:label path="password">Password:</form:label>
					<form:input path="password"/>
					<form:errors path="password"/>				
				</div>
				<button>Login</button>				
			</form:form>
		</div>
	</main>



</body>

</html>
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
<title>New Dojo</title>
</head>
<body>
	<header>
		<h1>New Dojo</h1>
	</header>
	<main>
		<form:form action="/dojos/new/create" method="POST" modelAttribute="newDojo">
        	<div>
        		<form:label path="name">Dojo Name:</form:label>
        		<form:input path="name"/>
        		<form:errors path="name"/>
			</div>
        	<br>
        	<button type="submit">Submit</button>
        </form:form>
	</main>
</body>
</html>
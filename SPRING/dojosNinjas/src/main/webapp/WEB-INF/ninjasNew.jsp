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
<title>New Ninja</title>
</head>
<body>
	<header>
		<h1>New Ninja</h1>
	</header>
	<main>
		<form:form action="/ninjas/new/create" method="POST" modelAttribute="newNinja">
        	<div>
        		<form:label path="dojo">Dojo:</form:label>
        		<form:select path="dojo" name="dojo" id="dojo">
        			<c:forEach var="dojo" items="${allDojos}">
        				<form:option value="${dojo.id}"><c:out value="${dojo.name}"></c:out></form:option>
        			</c:forEach>
        		</form:select>
			</div>
        	<br>
        	<div>
        		<form:label path="firstName">First Name:</form:label>
        		<form:input path="firstName"/>
        		<form:errors path="firstName"/>
			</div>
        	<br>
        	<div>
        		<form:label path="lastName">Last Name:</form:label>
        		<form:input path="lastName"/>
        		<form:errors path="lastName"/>
			</div>
        	<br>
        	<div>
        		<form:label path="age">Age:</form:label>
        		<form:input path="age"/>
        		<form:errors path="age"/>
			</div>
        	<br>
        	<button type="submit">Submit</button>
        </form:form>
	</main>
</body>
</html>
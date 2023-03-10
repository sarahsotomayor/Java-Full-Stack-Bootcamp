<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Ninjas</title>
</head>
<body>
	<header>
		<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
	</header>
		<main>
		<table>
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
					<td><c:out value="${ninja.firstName}"></c:out></td>
					<td><c:out value="${ninja.lastName}"></c:out></td>
					<td><c:out value="${ninja.age}"></c:out></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
	<section>
		<a href="/ninjas/new">Add Ninja</a>
	</section>
</body>
</html>
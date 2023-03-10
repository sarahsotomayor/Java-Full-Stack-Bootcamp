<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojos</title>
</head>
<body>
	<header>
		<h1>Dojos</h1>
	</header>
	<main>
		<table>
			<thead>
				<tr>
					<th>Dojo Locations</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dojo" items="${allDojos}">
				<tr>
					<td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
	<section>
		<a href="/dojos/new">Create Dojo</a>
	</section>
</body>
</html>
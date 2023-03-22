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
	<header class="row">
		<div class="col">
			<h1>Welcome, <c:out value="${userLoggedIn.username}"/></h1>
			<p>Books from everyone's shelves.</p>
		</div>
		<div class="col d-flex align-items-end flex-column">
			<div><a href="/logout">Logout</a></div>
			<div><a href="/books/new">+ Add a book to my shelf!</a></div>
		</div>
	</header>
	<main>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Title</th>
					<th>Author Name</th>
					<th>Posted By</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${allBooks}">
				<tr>
					<td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.user.username}"></c:out></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
</body>

</html>
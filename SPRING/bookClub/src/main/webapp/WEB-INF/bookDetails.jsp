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
			<h1><c:out value="${book.title}"></c:out></h1>		</div>
		<div class="col d-flex align-items-end flex-column">
			<a href="/books">Back to the shelves</a>
		</div>
	</header>
	<main class="mt-5 w-75">
		<h2><c:out value="${book.user.username}"></c:out> read <c:out value="${book.title}"></c:out> by <c:out value="${book.author}">.</c:out></h2>
		<h2>Here are <c:out value="${book.user.username}"></c:out>'s thoughts:</h2>
		<article class="mt-5 mb-5 border-top border-bottom">
			<p><c:out value="${book.thoughts}"></c:out></p>
		</article>
		<!-- ONLY USER THAT MATCHES USER THAT ADDED BOOK CAN VIEW EDIT/DELETE-->
		<c:if test="${user.id == book.user.id}">
		<section class="d-flex justify-content-end">
			<a href="/books/${book.id}/edit" class="btn btn-warning">Edit</a>
    		<a href="/books/${book.id}/delete" class="btn btn-danger">Delete</a>
    	</section>
    	</c:if>
	</main>
</body>

</html>
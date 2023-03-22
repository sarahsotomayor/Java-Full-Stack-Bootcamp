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
			<h1>Change Your Book Entry</h1>
		</div>
		<div class="col d-flex align-items-end flex-column">
			<a href="/books">Back to the shelves</a>
		</div>
	</header>
	<main>
		<form:form action="/books/${book.id}/update" method="POST" modelAttribute="book">
			<input type="hidden" name="_method" value="PUT"/>
        	<div>
        		<form:label path="title" class="form-label">Title:</form:label>
        		<form:input path="title" class="form-control"/>
        		<form:errors path="title"/>
			</div>
			<div>
        		<form:label path="author" class="form-label">Author:</form:label>
        		<form:input path="author" class="form-control"/>
        		<form:errors path="author"/>
			</div>
			<div>
        		<form:label path="thoughts" class="form-label">My thoughts:</form:label>
        		<form:input path="thoughts" class="form-control"/>
        		<form:errors path="thoughts"/>
			</div>
        	<br>
			<button class="btn btn-primary">Submit</button>				
        </form:form>
	</main>
</body>

</html>
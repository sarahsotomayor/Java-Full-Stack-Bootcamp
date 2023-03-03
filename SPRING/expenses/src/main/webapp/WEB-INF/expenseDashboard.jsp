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
	<title>Expenses</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="/css/main.css"> change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <!--<script type="text/javascript" src="/js/app.js"></script> change to match your file/naming structure -->

</head>
<body class="container">

	<h1 class="text-primary">Save Expenses</h1>
	<table class="table table-striped">
		<thead>
    		<tr>
    			<th>Expense</th>
    			<th>Vendor</th>
    			<th>Amount</th>
    			<th>Actions</th>
    		</tr>
		</thead>
		<tbody>
    		<c:forEach var="expense" items="${allExpenses}">
    		<tr>
    			<td><a href="/expenses/view/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
    			<td><c:out value="${expense.vendor}"></c:out></td>
    			<td><c:out value="${expense.amount}"></c:out></td>
    			<td><a href="/expenses/edit/${expense.id}">Edit</a></td>
    			<td><a href="/expenses/${expense.id}/delete" class="btn btn-danger">Delete</a>
    		</tr>
    		</c:forEach>
		</tbody>
	</table>
	<h2 class="text-primary d-flex justify-content-center">Add an Expense:</h2>
	<section class="d-flex justify-content-center">
        <form:form action="/expenses/new" method="POST" modelAttribute="newExpense">
        	<div>
        		<form:label path="name" class="form-label" for="form1Example1">Expense Name:</form:label>
        		<form:input path="name" id="form1Example1" class="form-control"/>
        		<form:errors path="name"/>
        	</div>
        	<div>
        		<form:label path="vendor" class="form-label" for="form1Example1">Vendor:</form:label>
        		<form:input path="vendor" id="form1Example1" class="form-control"/>
        		<form:errors path="vendor"/>
        	</div>
        	<div>
        		<form:label path="amount" class="form-label" for="form1Example1">Amount</form:label>
        		<form:input path="amount" id="form1Example1" class="form-control"/>
        		<form:errors path="amount"/>
        	</div>
        	<div>
        		<form:label path="description" class="form-label" for="form1Example1">Description</form:label>
        		<form:input path="description" id="form1Example1" class="form-control"/>
        		<form:errors path="description"/>
        	</div>
        	<br>
        	<button type="submit" class="btn btn-primary btn-block">Submit</button>
        </form:form>
	</section>
</body>
</html>
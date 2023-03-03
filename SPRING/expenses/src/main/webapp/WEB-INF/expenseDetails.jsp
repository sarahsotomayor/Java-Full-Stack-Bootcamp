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
	<title>Expense Details</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="/css/main.css"> change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <!--<script type="text/javascript" src="/js/app.js"></script> change to match your file/naming structure -->

</head>
<body class="container">
	<div>
		<h1 class="text-primary d-flex justify-content-start">Edit Expense</h1>
		<a href="/expenses" class="d-flex justify-content-end">Go Back</a>
	</div>
	<table>
    	<tbody>
			<tr>
				<td>Expense Name:</td>
				<td style="padding-left: 24px;"><c:out value="${expense.name}"></c:out></td>
			</tr>
			<tr>
				<td>Expense Description:</td>
				<td style="padding-left: 24px;"><c:out value="${expense.description}"></c:out></td>
			</tr>
			<tr>
				<td>Vendor:</td>
				<td style="padding-left: 24px;"><c:out value="${expense.vendor}"></c:out></td>
			</tr>
			<tr>
				<td>Amount Spent:</td>
				<td style="padding-left: 24px;">$<fmt:formatNumber type="number" minFractionDigits="2" value="${expense.amount}"/></td>
			</tr>	
    	</tbody>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>                                                           
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>                                                                              
                                                                                                                                                 
<!DOCTYPE html>                                                                                                                                  
<html lang="en">                                                                                                                                 
                                                                                                                                                 
<head>                                                                                                                                           
    <meta charset="UTF-8">                                                                                                                       
    <meta http-equiv="X-UA-Compatible" content="IE=edge">                                                                                        
    <meta name="viewport" content="width=device-width, initial-scale=1.0">                                                                       
    <title>Omikuji</title>                                                                                                                   
    <!-- for Bootstrap CSS -->                                                                                                                   
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />                                                                    
	<!-- YOUR own local CSS -->                                                                                                                  
	<link rel="stylesheet" href="/css/style.css"/>                                                                                               
	<!-- For any Bootstrap that uses JS -->                                                                                                      
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>                                                                               
	<!-- YOUR own local JS -->                                                                                                                   
	<script type="text/javascript" src="app.js"></script>                                                                                        
</head>  

<body class="container-md">
	<header>
		<h1 class="d-flex justify-content-center p-3">Here's your Omikuji!</h1>
	</header>  
	<div class="box border border-dark border-5 p-3">
		<p class="d-flex justify-content-center">
			<c:out value="${results}"/>
		</p>
	</div>
	<a href="/omikuji" class="d-flex justify-content-center">Go Back</a>
</body>

</html>
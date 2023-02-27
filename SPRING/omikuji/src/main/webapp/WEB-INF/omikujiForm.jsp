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
		<h1 class="d-flex justify-content-center p-3">Send an Omikuji!</h1>
	</header>   
	<form action="/form" method="post" class="box border border-dark border-5 p-5">
		<label for="number">Pick any number from 5 to 25:</label>
		<input type="number" name="number" id="form1Example1" class="form-control"><br>
	
		<label for="city" class="form-label" for="form1Example1">Enter the name of any city:</label>
		<input type="text" name="city" id="form1Example1" class="form-control"/><br>
		
		<label for="name" class="form-label" for="form1Example1">Enter the name of any real person:</label>
		<input type="text" name="name" id="form1Example1" class="form-control"/><br>
		
		<label for="hobby" class="form-label" for="form1Example1">Enter professional endeavor or hobby:</label>
		<input type="text" name="hobby" id="form1Example1" class="form-control"/><br>
		
		<label for="livingThing" class="form-label" for="form1Example1">Enter any type of living thing:</label>
		<input type="text" name="livingThing" id="form1Example1" class="form-control"/><br>
		
		<label for="compliment" class="form-label" for="form1Example1">Say something nice to someone:</label>
		<textarea cols="30" rows="5" name="compliment" id="form1Example1" class="form-control"></textarea><br>
		
		<label for="send" class="form-label d-flex justify-content-center" for="form1Example1">Send and show a friend!</label><br>
		
		<div class="d-flex justify-content-center">
			<button type="submit" class="btn btn-primary btn-block">Send</button>
		</div>
	</form>                                                                                                                                                                                                                                                                  
</body>                                                                                                                                          
                                                                                                                                                 
</html>                                                                                                                                          
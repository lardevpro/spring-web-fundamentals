<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- carga la librería de form mvc tags -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form User Register</title>
</head>
<body>
	
	<!-- utiliza el objeto del controlador para recoger los datos -->
	<form:form action="userConfirmation" modelAttribute="currentUser">
	<br><br>
	Nombre: <form:input  path="name"/> <!-- debe coincidir con el atributo pero en minúsculas -->
	<br><br><br>
	Apellido: <form:input path="lastName"/>
	<br><br><br>
	<input type="submit">
	
	</form:form> 
	
	

</body>
</html>
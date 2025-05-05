<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user registration confirmation</title>
</head>
<body>

	<h2>Datos del Usuario Registrado: </h2>

	<p><strong>Nombre:</strong> ${currentUser.name}</p>
    <p><strong>Apellido:</strong> ${currentUser.lastName}</p>
    <p><strong>Edad:</strong> ${currentUser.age}</p>
    <p><strong>E-Mail:</strong> ${currentUser.email}</p>
    <p><strong>Sexo:</strong> ${currentUser.sex.label}</p>
    <p><strong>País:</strong> ${currentUser.country}</p>
    
    
</body>
</html>
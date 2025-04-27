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
    <p><strong>Sexo:</strong> ${currentUser.sex}</p>
    
</body>
</html>
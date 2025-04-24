<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/styles.css">
</head>
<body>

	<p><br>
		<h2>Demostración de cómo se comunica modelo, vista y controlador</h2>
		
		${message}
		<br>
						<!-- devuelve la raiz del proyecto -->
	<img alt="imagen fondo" src="${pageContext.request.contextPath}/resources/images/spring.jpg">


</body>
</html>
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
	  <div>
           <form:label path="name">Nombre:</form:label>
           <form:input path="name" /><!-- debe coincidir con el atributo pero en minúsculas -->
           <form:errors path="name"/>
      </div>
	  <br><br>
	  
	  <div>
            <form:label path="lastName">Apellido:</form:label>
            <form:input path="lastName" />
            <form:errors path="lastName"/>
      </div>
	  <br><br>
	
	  <div>
	       <form:label path="sex">Sexo:</form:label>
        	<form:radiobuttons path="sex" items="${sexOptions}" />
        	<form:errors path="sex" cssClass="error" />
      </div>
	  <br><br>
	  <div>
		  	<form:label path="country">País:</form:label>
		    <form:select path="country" items="${countryOptions}" />
	  </div>
      <br><br>
	   <div>
            <input type="submit" value="Enviar" />
       </div>
	
	
	</form:form> 
	
	

</body>
</html>
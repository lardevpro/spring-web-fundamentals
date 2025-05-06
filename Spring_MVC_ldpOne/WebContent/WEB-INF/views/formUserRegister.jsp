<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- carga la librer�a de form mvc tags -->
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
           <form:input path="name" /><!-- debe coincidir con el atributo pero en min�sculas -->
           <form:errors path="name" style="color:red"/>
      </div>
	  <br><br>
	  
	  <div>
            <form:label path="lastName">Apellido:</form:label>
            <form:input path="lastName" />
            <form:errors path="lastName" style="color:red"/>
      </div>
	  <br><br>
	  
	   <div>
            <form:label path="age">Edad:</form:label>
            <form:input path="age" />
             <form:errors path="age" style="color:red"/>
      </div>
	  <br><br>
	  
	  <div>
            <form:label path="email">E-mail:</form:label>
            <form:input path="email" />
             <form:errors path="email" style="color:red"/>
      </div>
	  <br><br>
	  
	  <div>
            <form:label path="cp">C�digo Postal:</form:label>
            <form:input path="cp" />
             <form:errors path="cp" style="color:red"/>
      </div>
	  <br><br>
	
	  <div>
	       <form:label path="sex">Sexo:</form:label>
        	<form:radiobuttons path="sex" items="${sexOptions}" />
        	<form:errors path="sex" cssClass="error" style="color:red"/>
      </div>
	  <br><br>
	  <div>
	    <form:label path="country">Pa�s:</form:label>
		    <form:select path="country" items="${countryOptions}">
		        <form:option value="" label="-- Selecciona un pa�s --" />
		    </form:select>
	  </div>
      <br><br>
	   <div>
            <input type="submit" value="Enviar" />
       </div>
	
	
	</form:form> 
	
	

</body>
</html>
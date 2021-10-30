<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.ejercicioServletsDos.dao.*, maven.ejercicioServletsDos.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar Roles</title>
</head>
	<body>
		<%@ include file="vHeader.jsp" %>
		<form method="post" action="../AltaRol">
	    	<div>
	    		<label for="nombreRol">Nombre</label>
	    		<input type="text" name="nombreRol" placeholder="">
	    </div>
	    <br>
	    	<div>
	    		<button type="submit" name="crearRol">Crear Rol</button>
	    	</div>
	    </form>
	    <br>
	    	<a href="vInicio.jsp"><button>Volver al index</button></a>
	</body>
</html>
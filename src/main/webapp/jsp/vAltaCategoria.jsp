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
		<form method="post" action="../AltaCategoria">
	    	<div>
	    		<label for="nombreCategoria">Nombre: </label>
	    		<input type="text" name="nomCategoria" placeholder="">
	    	</div>
	    <br>
	    	<div>
	    		<label for="descCategoria">Descripcion: </label>
	    		<input type="text" name="descCategoria" placeholder="">
	    	</div>
	    <br>
	    	<div>
	    		<button type="submit" name="crearCategoria">Crear Categoria</button>
	    	</div>
	    </form>
	    <br>
	    	<a href="vInicio.jsp"><button>Volver al index</button></a>
	</body>
</html>
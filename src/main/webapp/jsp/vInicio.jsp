<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.ejercicioServletsDos.dao.*, maven.ejercicioServletsDos.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>
	<%@ include file="vHeader.jsp" %>
	<a href="vAltaRol.jsp">1 - Dar de alta un rol</a>
	<br><br>
	<a href="vMostrarListado.jsp">2 - Mostrar listado de roles</a>
	<br><br>
	<a href="vAltaCategoria.jsp">3 - Dar de alta una categoria</a>
	<br><br>
	<a href="vMostrarListadoCategoria.jsp">4 - Mostrar listado de categorias</a>
</body>
</html>
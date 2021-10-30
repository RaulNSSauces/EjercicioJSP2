<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.ejercicioServletsDos.dao.*, maven.ejercicioServletsDos.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.time.*, java.time.format.*" %>
<%@page import="java.util.*" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
	<header>		
            <h4>Usuario conectado: <c:out value="${usr}"></c:out></h4>
            <h4>Hora de inicio de sesion: <c:out value="${hora}"></c:out></h4>
            
            <form method="post" action="/ejercicioServletsDos/CloseSession">
            	<input type="submit" value="Logout"/>
        	</form>
        	<br>
        	<form method="post" action="">
        		<input type=<%= (request.getRequestURI().endsWith("vInicio.jsp")) ? "hidden" : "button"%> value="Atras" onClick="history.go(-1);" >
        	</form>
    </header>
</body>
</html>
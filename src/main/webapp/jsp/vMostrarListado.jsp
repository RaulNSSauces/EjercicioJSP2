<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.ejercicioServletsDos.dao.*, maven.ejercicioServletsDos.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de roles</title>
</head>
	<body>
		<%@ include file="vHeader.jsp" %>
		
		<%
		
		List<Rol> listadoRoles = RolDAO.getRoles();
		

		%>
		
		<%pageContext.setAttribute("listadoRoles", listadoRoles);%>
		
		<h2>Roles: </h2>
			<form action="" method="post">
				<table border="2">
					<tr>
					    <th>ID</th>
					    <th>ROL</th>
				    </tr>
				    <c:forEach items="${pageScope.listadoRoles}" var="rol" varStatus="status" begin="0" end="${pageScope.listadoRoles.size() -1}">
				        <tr>
				        	<td>${rol.id}</td>
				            <td>${rol.rol}</td>           
				        </tr>
				    </c:forEach>
				</table>
			</form>
			<br>
			<a href="vInicio.jsp"><button>Volver al index</button></a>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.ejercicioServletsDos.dao.*, maven.ejercicioServletsDos.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de categorias</title>
</head>
	<body>
		<%@ include file="vHeader.jsp" %>
		
		<%
		
		List<Categoria> listadoCategorias = CategoriaDAO.getCategorias();
		

		%>
		
		<%pageContext.setAttribute("listadoCategorias", listadoCategorias);%>
		
		<h2>Roles: </h2>
			<form action="" method="post">
				<table border="2">
					<tr>
					    <th>ID</th>
					    <th>CATEGORIA</th>
					    <th>DESCRIPCION</th>
				    </tr>
				    <c:forEach items="${pageScope.listadoCategorias}" var="categoria" varStatus="status" begin="0" end="${pageScope.listadoCategorias.size() -1}">
				        <tr>
				        	<td>${categoria.id}</td>
				            <td>${categoria.nombre}</td>   
				            <td>${categoria.descripcion}</td>         
				        </tr>
				    </c:forEach>
				</table>
			</form>
			<br>
			<a href="vInicio.jsp"><button>Volver al index</button></a>
	</body>
</html>
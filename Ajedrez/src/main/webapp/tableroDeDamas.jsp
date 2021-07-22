<?xml version="1.0" encoding ="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tablero de Damas</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/checkerboard.css" />
</head>
<body>
	<div class="container"><% int width=0; int height=0;
if(request.getParameter("width") != null){
	width = Integer.parseInt(request.getParameter("width"));	
}
if(request.getParameter("height") != null){
	height = Integer.parseInt(request.getParameter("height"));
} %>
	<h1>Tablero de Damas <%= width %> ancho por <%= height %> alto</h1>
	<% for(int i=0; i<height; i++){
		if(i%2 == 0){%>
		<div class="roweven">
			<%for(int j=0; j<width; j++){
				if(j%2 == 0){%>
					<div class="one"></div>
				<%} else {%>
					<div class="two"></div>
				<%}
			}%>
			</div>
		<%} else{%>
			<div class="rowodd">
			<%for(int j=0; j<width; j++){
				if(j%2 == 0){%>
					<div class="one"></div>
				<%} else {%>
					<div class="two"></div>
				<%}
			}%>
			</div>
		<%} %>
	<%} %>
	</div>
	<%-- http://localhost:8080/Ajedrez/tableroDeDamas.jsp?width=10&&height=10 --%>
</body>
</html>
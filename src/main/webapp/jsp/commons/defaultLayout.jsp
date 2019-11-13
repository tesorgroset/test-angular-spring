<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/rest-angular/css/lib/bootstrap-4.0.0/bootstrap.min.css">
<script src="/rest-angular/js/lib/jquery-3.4.1.min.js"></script>
<script src="/rest-angular/js/lib/bootstrap-4.0.0/bootstrap.min.js"></script>
<title><fmt:message key="application.title" /></title>
</head>
<body>
	<div class="container">
		<!-- Menu  -->
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		    <a class="navbar-brand" href="#"><fmt:message key="menu.seleccionaopcion" /></a>
		    <div class="collapse navbar-collapse">
		        <ul class="navbar-nav mr-auto">
		            <li class="nav-item-active">
		                <a class="nav-link" href="/rest-angular/person/list"><fmt:message key="menu.listapersonas" /><span class="sr-only">(current)</span></a>
		            </li>
		        </ul>
		        <ul class="navbar-nav nav-flex-icons">
		            <li class="nav-item">
		                <span style="cursor:pointer" onclick="cambiarIdioma('es')" class="flag-icon flag-icon-es"></span>
		            </li> 
		            <li class="nav-item">
		                <span style="cursor:pointer" onclick="cambiarIdioma('en')" class="flag-icon flag-icon-gb"></span>
		            </li> 
		        </ul>           
		    </div>
		</nav>
		
		<!-- Mensajes de error -->
		<c:forEach items="${errorMessages}" var="err">
			<div class="alert alert-danger" role="alert"><fmt:message key="${err}" /></div>
		</c:forEach>
		
		<!-- <div *ngFor="let msgError of errorMessages" class="alert alert-danger" role="alert">
		      {{msgError | translate}}
		</div> -->  		
		
		<!-- cuerpo principal de la pagina -->
		<tiles:insertAttribute name="body" />
	</div>
</body>
</html>
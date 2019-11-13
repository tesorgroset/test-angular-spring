<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th style="width:35%"><fmt:message key="personas.nombre" />modificado</th>
      <th style="width:10%"><fmt:message key="personas.edad" /></th>
      <th style="width:20%"><fmt:message key="personas.matricula" /></th>
      <th style="width:25%"><fmt:message key="personas.modelo" /></th>
      <th style="width:5%"></th>
      <th style="width:5%"></th>
    </tr>
  </thead>
  <tbody>
	<c:forEach items="${personList}" var="person">
    <tr>
      <td><a class="badge badge-light" href="/rest-angular/person/query/${person.id}">${person.firstName} - ${person.lastName}</a></td>
      <td>${person.edad}</td>
      <td onmouseover="getAnioMatricula(persona)">${person.matricula}</td>
      <td>${person.modeloCoche}</td>
      <td><a class="badge badge-primary" href="/rest-angular/person/edit/${person.id}"><fmt:message key="botones.modificar" /></a></td>
      <td><a class="badge badge-primary" onclick="deletePerson(${persona.id})"><fmt:message key="botones.borrar" /></a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<button class="btn btn-dark" href="anadir-persona"><fmt:message key="botones.anadir" /></button><br>
<a href="/rest-angular/alastria/register"><button class="btn btn-dark">ALASTRIA</button></a> 

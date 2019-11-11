<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<c:url var="baseurl" value="" />
<div class="card" style="width: 18rem;">
  <div class="card-header">
    <fmt:message key="detallepersona.persona" />
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">${personObj.firstName} - ${personObj.lastName}</li>
    <li class="list-group-item">${personObj.direccion}</li>
    <li class="list-group-item">${personObj.edad}</li>
    <li class="list-group-item">${personObj.modeloCoche}</li>
    <li class="list-group-item">${personObj.matricula}</li>
  </ul>
 </div>
 <button class="btn btn-dark" href="${baseurl}person/list"><fmt:message key="botones.cancelar" /></button>
 
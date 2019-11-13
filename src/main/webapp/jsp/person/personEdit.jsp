<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<h3><fmt:message key="personas.modificarpersona" /></h3>
<form:form modelAttribute="personBean" method="post" action="/rest-angular/person/edit">
<div>
	<form:hidden path="id" />
    <div class="form-row"> 
      <div class="form-group col-md-4"><label><fmt:message key="personas.nombre" />:</label>&nbsp;<form:input path="firstName" type="text" minlength="3" maxlength="17" class="form-control" /></div>
      <div class="form-group col-md-8"><label><fmt:message key="personas.apellido" />:</label><form:input path="lastName" type="text" required="true" minlength="3" maxlength="35" class="form-control" /></div>
    </div>  
    <div class="form-row"><div class="form-group has-warning col-md-1"><label><fmt:message key="personas.edad" />:</label><form:input class="form-control" path="edad" type="number" min="0" max="135" /></div>
    <div class="form-group col-md-11"><label><fmt:message key="personas.direccion" />:</label><form:input path="direccion" class="form-control" type="text" /></div></div>
    <div class="form-row"> <div class="form-group col-md-4"><label><fmt:message key="personas.modelo" />:</label><form:input path="modeloCoche" class="form-control" type="text" /></div>
    <div class="form-group col-md-2"><label><fmt:message key="personas.matricula"/>:</label><form:input path="matricula" required="true" class="form-control" type="text" /></div></div>
    <button class="btn btn-dark mr-1" type="submit" ><fmt:message key="botones.enviar" /></button>
    <a href="/rest-angular/person/list"><button class="btn btn-dark" formnovalidate="formnovalidate" type="button"><fmt:message key="botones.cancelar" /></button></a> 
</div>
</form:form>
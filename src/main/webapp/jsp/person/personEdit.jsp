<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<h3><fmt:message key="personas.modificarpersona" /></h3>
<div>
    <div class="form-row"> 
      <div class="form-group col-md-4"><label><fmt:message key="personas.nombre" />:</label>&nbsp;<input required minlength="3" maxlength="17" class="form-control" type="text" value = "${personObj.firstName}" /></div>
      <div class="form-group col-md-8"><label><fmt:message key="personas.apellido" />:</label><input required minlength="3" maxlength="35" class="form-control" type="text" value = "${personObj.lastName}" /></div>
    </div>  
    <div class="form-row"><div class="form-group has-warning col-md-1"><label><fmt:message key="personas.edad" />:</label><input class="form-control" type="number" min="0" max="135" value = "${personObj.edad}"/></div>
    <div class="form-group col-md-11"><label><fmt:message key="personas.direccion" />:</label><input class="form-control" type="text" value = "${personObj.direccion}"/></div></div>
    <div class="form-row"> <div class="form-group col-md-4"><label><fmt:message key="personas.modelo" />:</label><input class="form-control" type="text" value = "${personObj.modeloCoche}"/></div>
    <div class="form-group col-md-2"><label><fmt:message key="personas.matricula"/>:</label><input required class="form-control" type="text" value = "${personObj.matricula}"/></div></div>
    <button class="btn btn-dark mr-1" type="submit" onclick="modificarPersona()"><fmt:message key="botones.enviar" /></button>
    <button class="btn btn-dark" href="/personas"><fmt:message key="botones.cancelar" /></button>
</div>
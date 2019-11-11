<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${baseurl}/css/lib/bootstrap-4.0.0/bootstrap.min.css">
<script src="${baseurl}/js/lib/jquery-3.4.1.min.js"></script>
<script src="${baseurl}/js/lib/bootstrap-4.0.0/bootstrap.min.js"></script>
<title><fmt:message key="application.title" /></title>
</head>
<body>
	<tiles:insertAttribute name="body" />
</body>
</html>
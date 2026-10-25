<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Result</title>
	</head>
	<body>
		<h1>Liste des personnes</h1>
		<c:forEach items="${personnes}" var="personne">
		<div>
		<c:out value="${personne.prenom } ${personne.nom }"></c:out>
		</div>
		</c:forEach>
	</body>
</html>

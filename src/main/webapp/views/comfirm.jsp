<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<metacharset="ISO-8859-1">
		<title>Comfirm</title>
	</head>
	<body>
		<h1>Welcome</h1>
		Person named ${ nom } ${ prenom } has been successfully added.
		<form action="/showAll" method="get"><br>
			<button type="submit">Afficher tout</button>
		</form>
	</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Adding a new person</title>
	</head>
	
	<body>
		<h2>Adding a new person</h2>
		<form action="/addPerson" method="post"><br>
			Nom : <input type="text" name="nom"><br>
			Prenom : <input type="text" name="prenom">
			<button type="submit">Envoyer</button>
		</form>
	</body>
</html>
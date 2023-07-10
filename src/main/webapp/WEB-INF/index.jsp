<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css"
	href="<%= request.getServletContext().getContextPath() %>/static/css/index.css"/>
	<title>Cours JEE</title>
</head>
<body>
	Bienvenue ${nom}
<%-- 	<% String nom = (String) request.getAttribute("nom"); %> --%>
<%-- 	<%= nom %> --%>

	<form action="<%= request.getServletContext().getContextPath() %>/" method="post">
		<div>
			<label for="prenom">Prénom : </label>
			<div>
				<input id="prenom" name="prenom" type="text"/>
			</div>
		</div>
		<div>
			<button>Valider</button>
		</div>
	</form>
	
</body>
</html>
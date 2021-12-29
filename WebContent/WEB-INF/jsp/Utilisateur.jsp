<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<style><%@ include file="/style/Liste_uilisateur.css"%></style>
<%@ page import="fr.eni.zylim.encheres.bo.Utilisateur"%>
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<% String id=request.getParameter("id");
String un=request.getParameter("uname");
%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>LIste utilisateurs</title>
<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico2"  src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>
</head>

<body>
	<%

	List<Utilisateur> listeUtilisateurs = (List<Utilisateur>)request.getAttribute("mesUtilisateur");

%>
	<div class="container">
		<h1>Liste tous Les utilisateurs</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>identifiant
					</td>
					<th>pseudo
					</td>
					<th>nom
					</td>
					<th>Prenom
					</td>
					<th>email
					</td>

					<th>telephone
					</td>
					<th>credit
					</td>
				</tr>
			</thead>
			<%
    
      for (Utilisateur utils : listeUtilisateurs) {
    %>
			<tbody>
				<tr>
					<th scope="row"><%= utils.getNo_utilisateur()%></th>
					<td><%= utils.getPseudo() %></td>
					<td><%= utils.getNom() %></td>
					<td><%= utils.getPrenom() %></td>
					<td><%= utils.getEmail() %></td>

					<td><%= utils.getTelephone() %></td>
					<td><%= utils.getCredit() %></td>
					<td><a
						href="<%=getServletContext().getContextPath()%>/visualisationUtilisateurServlet">Details</a></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
	</body>
</html>

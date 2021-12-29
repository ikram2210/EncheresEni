<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="fr.eni.zylim.encheres.bo.Utilisateur"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style>
<%@ include file="/style/Profil.css"%></style>
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap"
	rel="stylesheet">
<title>Profil</title>
<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico"   src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>
</head>
<%
	Utilisateur utilisateur;
%>
<body>


	<h3>
		<a href="/WEB-INF/jsp/Inscription.jsp">Troc-enchères.org</a>
	</h3>

	<h4>votre profile</h4>
	<br>
<%

Utilisateur user = (Utilisateur)request.getAttribute("userprofile");

%>

	<%
		if (session != null) {
			if (session.getAttribute("user") != null) {
				String name = (String) session.getAttribute("user");
				out.print("Hello, " + name + "  Welcome to ur Profile");
			} else {
				response.sendRedirect("login.html");
			}
		}
	%>
	</br>
	</br>



	<form action="<%=request.getContextPath()%>/ModifierUtilisateurServlet.java" method="POST">

		
		<tr ><%= user.getNo_utilisateur()%></tr>
					<tr><%= user.getPseudo() %></tr>
					<tr><%= user.getNom() %></tr>
					<tr><%= user.getPrenom() %></tr>
					<tr><%= user.getEmail() %></tr>

					<tr><%= user.getTelephone() %></tr>
					<tr><%= user.getCredit() %></tr>

		<div class="Profil">


			<table align=center cellspacing=10>

				<tr>
					<td class="column1">Pseudo:</td>
					<td>Pseudo</td>
				</tr>


				<tr>
					<td class="column1">Nom:</td>
					<td>nom</td>
				</tr>


				<tr>
					<td class="column1">Prenom:</td>
					<td>Prenom</td>
				</tr>


				<tr>
					<td class="column1">Email :</td>
					<td>email</td>
				</tr>


				<tr>
					<td class="column1">Téléphone :</td>
					<td>telephone></td>
				</tr>


				<tr>
					<td class="column1">Rue :</td>
					<td>rue</td>
				</tr>


				<tr>
					<td class="column1">Code Postal:</td>
					<td>code_postal</td>
				</tr>


				<tr>
					<td class="column1">Ville :</td>
					<td>ville</td>
				</tr>

			</table>
		</div>

		<div></div>

		<DIV>
			<form action="modifierprofil">
				<button class="btn-enregistrer">Modifier</button>
			</form>

		</DIV>
</body>
</html>
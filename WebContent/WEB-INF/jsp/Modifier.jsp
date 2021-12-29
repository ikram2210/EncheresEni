<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style>
<%@ include file="/style/Modifier.css"%>
</style>
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap"
	rel="stylesheet">
<title>Modifier</title>


</head>
<body>

	<h3>
		<a href="/WEB-INF/jsp/Utilisateur.jsp">Troc-enchères.org</a>
	</h3>
	<h4>Modifier Profil</h4>
<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico" src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>
	<div class=Inscription>
		<form action="modifierutilisateur" method="POST">
			<div class="formulaire">

				<table align=center cellspacing=10>

					<tr>
						<td class="column1">Pseudo:</td>
						<td><input type="text" placeholder="Pseudo" name="pseudo"></td>
					</tr>


					<tr>
						<td class="column1">Nom:</td>
						<td><input type="text" placeholder="Nom" name="nom"></td>
					</tr>


					<tr>
						<td class="column1">Prenom:</td>
						<td><input type="text" placeholder="Prénom" name="prenom"></td>
					</tr>


					<tr>
						<td class="column1">Email :</td>
						<td><input type="text" placeholder="Email" name="email"></td>
					</tr>


					<tr>
						<td class="column1">Téléphone :</td>
						<td><input type="text" placeholder="Téléphone"
							name="telephone"></td>
					</tr>


					<tr>
						<td class="column1">Rue :</td>
						<td><input type="text" placeholder="Rue" name="rue"></td>
					</tr>


					<tr>
						<td class="column1">Code Postal:</td>
						<td><input type="text" placeholder="Code Postal"
							name="code_postal"></td>
					</tr>


					<tr>
						<td class="column1">Ville :</td>
						<td><input type="text" placeholder="Ville" name="ville"></td>
					</tr>


					<tr>
						<td class="column1">Mot de passe :</td>
						<td><input type="password" placeholder="Mot de passe"
							name="mot_de_passe"></td>
					</tr>


					<tr>
						<td class="column1">Confirmation :</td>
						<td><input type="password" placeholder="Confirmation"
							name="mot_de_passe"></td>
					</tr>
				</table>
			</div>
		</form>


		<div class="boutonsEnregistreSupprimerrAnnuler">
			<form class="boutonsEnregistreSupprimerrAnnuler"
				action="modifierutilisateur">
				<button type="submit" class="btn-enregistrer">Enregistrer</button>
			</form>
			<form class="boutonsEnregistreSupprimerrAnnuler"
				action="supprimerutilisateur">
				<button type="submit" class="btn-supprimer">Supprimer mon
					compte</button>
			</form>
			<form class="boutonsEnregistreSupprimerrAnnuler"
				action="connexionutilisateur">
				<button class="btn-retour">Retour</button>
			</form>

		</div>



	</div>



</body>
</html>
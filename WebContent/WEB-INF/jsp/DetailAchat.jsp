<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style>
<%@ include file ="/style/responsive_style_marion.css"%></style>

<title>Detail Achat</title>
</head>
<body>
	<div id="wrapper">

		<div class="form_div">
			<p class="form_label">
				<a href="#">Troc-enchères</a>
			</p>
			<form method="post" action="">
			<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico"  src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>
				<div class="title">
					<p>Détail vente</p>
				</div>

				<p>
					<img src="/*****" class="picture" alt="PC gamer pour travailler">
				</p>
				<table style="width: 100%">
					<tbody>
						<tr>
							<th scope="row">Description :</th>
							<td>************</td>
						</tr>
						<tr>
							<th scope="row">Catégorie :</th>
							<td>Informatique</td>
						</tr>
						<tr>
							<th scope="row">Meilleure offre :</th>
							<td>210 points par Bob</td>
						</tr>
						<tr>
							<th scope="row">Mise à prix :</th>
							<td>185 points</td>
						</tr>
						<tr>
							<th scope="row">Fin de l'enchère :</th>
							<td>09/10/2018</td>
						</tr>
						<tr>
							<th scope="row">Retrait :</th>
							<td>10 allée des Alouettes<br>44800 Saint-Herblain
							</td>
						</tr>
						<tr>
							<th scope="row">Vendeur :</th>
							<td>jojo44</td>
						</tr>
						<tr>
							<th scope="row">Ma proposition :</th>
							<td><input type="number" min="0" max="100000"></td>
							<!--  <td><input type="submit" value="Enchérir"></td> pb : mettre le button à right-->
						</tr>
					</tbody>
				</table>
				<div class="container column">
					<div class="item">
						<p>
							<input type="button" value="Retour">
						</p>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
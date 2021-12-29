<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>


<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style>
<%@ include file ="/style/responsive_style_marion.css"%>
</style>

<title>Detail vente</title>
</head>
<body>

	<div id="wrapper">

		<div class="form_div">
			<p class="form_label">
				<a href="#">Troc-enchères</a>
			</p>
			<form method="post" action="">
			<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico"  src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>

				<p>
					<img src="/*****" class="picture"
						alt="Rocket stove pour riz et pâtes">
				</p>
				<table style="width: 100%">
					<tbody>
						<tr>
							<th scope="row">Meilleure offre :</th>
							<td>210 pts par <a href="#" class="card-link">jojo44</a></td>
						</tr>
						<tr>
							<th scope="row">Mise à prix :</th>
							<td>175 points</td>
						</tr>
						<tr>
							<th scope="row">Fin de l'enchère :</th>
							<td>09/10/2018</td>
						</tr>
						<tr>
							<th scope="row">Retrait :</th>
							<td>5 rue des Pinsons<br>44000 Nantes
							</td>
						</tr>
						<tr>
							<th scope="row">Vendeur :</th>
							<td>NineJea</td>
						</tr>
					</tbody>
				</table>
				<div class="container column">
					<div class="item">
						<p>
							<input type="submit" value="Annuler la vente">
						</p>
					</div>

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
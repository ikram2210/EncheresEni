<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>

<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style>
<%@ include file ="/style/responsive_style_marion.css"%></style>

<title>Achat</title>
</head>

<body>
	<div id="wrapper">

		<div class="form_div">
			<p class="form_label">
			<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico"  src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>
				<a href="#">Troc-enchères</a>
			</p>
			<form method="post" action="">
			
				<div class="title">
					<p>Vous avez remporté l'enchère !</p>
				</div>

				<p>
					<img src="/*****" class="picture" alt="PC gamer pour travailler">
				</p>
				<table style="width: 100%">
					<tbody>
						<tr>
							<th scope="row">Meilleure offre :</th>
							<td>210 points</td>
						</tr>
						<tr>
							<th scope="row">Mise à prix :</th>
							<td>185 points</td>
						</tr>
					</tbody>
				</table>
			</form>
			<form method="post" action="">
				<fieldset>
					<legend>Retrait</legend>
					<div>
						<label for="name">10 allée des Alouettes<br>44800
							Saint-Herblain
						</label>
						<table style="width: 100%">
							<tbody>
								<tr>
									<th scope="row">Vendeur :</th>
									<td>jojo44</td>
								</tr>

								<tr>
									<th scope="row">Tel :</th>
									<td>0606060606</td>
								</tr>
							</tbody>
						</table>
					</div>
				</fieldset>
				<div class="container column">

					<div class="item">
						<p>
							<input type="button" value="Retrait effectué">
						</p>
					</div>
				</div>

			</form>

		</div>
	</div>
</body>
</html>
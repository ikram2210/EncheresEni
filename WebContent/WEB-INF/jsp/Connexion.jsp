<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>

<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style><%@ include file="/style/responsive_style.css"%></style>

<title>Page connexion</title>
</head>
<body>
	<div id="wrapper">
	

		<div class="form_div">
		<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico"  src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>
		
			<p class="form_label">Troc-enchères</p>
			
	<!-- 	envoyer la forme ver login servlet  avec la method post-->
	
	
			<form method="post" action="/encheres/Login">

				<p>
					<input type="text" name="userName" /placeholder="pseudo">
				</p>

				<p>
					<input type="password" name="password" placeholder="**********">
				</p>

				<div>
					<input type="checkbox" checked="checked"> <span
						class="checkmark">se souvenir de moi</span>
				</div>
				<a href="https://example.com">Mot de passe oublier</a>
				</li>
				<div class="container column">
					<div class="item">
						<p>
							<input type="submit" value="connexion">
						</p>
					</div>
				</div>
			</form>

			<DIV class="item"">
				<form name="main0" action="ajouterutilisateur" method="get">
					<input type="submit" value="cree un compte">
				</form>
			</DIV>
</body>
</html>
<!-- partial -->



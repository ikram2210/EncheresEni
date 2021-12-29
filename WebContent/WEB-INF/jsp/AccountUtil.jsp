<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
<%@ include file="/style/Profil.css"%></style>
</head>
<body>
	<br>
<a href="<%="/encheres/consulteraccueilconnexion"%>"><img class="ico"  src="<%=getServletContext().getContextPath()%>/images/icone.png"></a>

	<%
      if (session != null) {
         if (session.getAttribute("user") != null) {
            String name = (String) session.getAttribute("user");
            out.print("Bienvenue  " + name + "  ");
         } else {
            response.sendRedirect("/WEB-INF/jsp/AccountUtil.jsp");
         }
      }
   %>
   
   <br><a href="<%="/encheres/vendrearticle"%>">Vendre un article</a>
     <br> <a href="<%="/encheres/profile"%>">Mon profil</a>
       <br> <a href="<%="/encheres/consulteraccueilconnexion"%>">Déconexion</a>
	</br>
	</br>
	<form action="/encheres/Logout" method="post">
		<input type="submit" value="Logout">
	</form>
	<form method="post" action="*******">
<div id="input_container">
<div class="barre_de_recherche">
    <input type="text" id="input_search" value="Le nom de l'article contient">
    <img src=/encheres/images/icon_search.jfif id="input_img">
    </div>
    
    
    
    
    
</div>
<!-- <p class="les_categories">Catégories</p> -->

   <p>
       <label for="categories">Catégories</label><br />
       <select name="categories" id="categories">
           <option value="informatique">Informatique</option>
           <option value="ameublement">Ameublement</option>
           <option value="vetement">Vetement</option>
           <option value="sport">Sport</option>
           <option value="loisirs">Loisirs</option>
           
       </select>
   </p>
   <input type="submit" value="Rechercher">
</form>
	
</body>
</html>


<%@page import="fr.eni.zylim.encheres.bo.ArticleVendu"%>
<%@page import="fr.eni.zylim.encheres.bll.ArticleVenduManager"%>

<%@ page import="java.util.List" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<style><%@include file="/style/Accueil.css"%></style>
<%-- <style><%@include file="/style/responsive_style.css"%></style> --%>

<title>Accueil</title>
</head>
<body>
<div class ="titre_logo_connexion_inscription">
<div class= "logo">
    <a href="<%="/encheres/consulteraccueilconnexion"%>"><img src="<%=getServletContext().getContextPath()%>/images/icone.png"  class="ico2" ></a>
</div>

<div class= "titre">
<h1 >Troc-enchères</h1>
</div>
<div class="inscription_connexion">
<a href=/encheres/ajouterutilisateur>S'inscrire</a>
<a href=/encheres/connexionutilisateur>Se connecter</a>
</div>
</div>

<div class ="filtre_recherche">

<div class = "filtre_categorie">
<p>Filtres</p>
<!--  <form method="post" action="">  -->

 <form action="${pageContext.request.contextPath}/consulteraccueilconnexion" method="get">
   
                    <input type="text" name="nomArticle" id="input_search" placeholder="Le nom de l'article contient" value="${nomArticle}">
              
                <div class="filtre_categories">
                 <label for="categories">Catégories</label>
                    <select name="ListeCategories" id="categories" >
                        <option value="0" <c:if test="${ListeCategories == 0}"> </c:if>>Toutes les catégories</option>
                        <c:forEach items="${listeCategories}" var="categorie">
                            <option value="${categorie.noCategorie}" <c:if test="${ListeCategories == categorie.noCategorie}"> </c:if>>${categorie.libelle}</option>
                        </c:forEach>
                       
                    </select>
  
                </div>
                 </div>
   <div = "rechercher_submit">
   <input  type="submit" value="Rechercher" class = input_submit>
   </div>
    </form> 
    
  </div>
 
 
<div class = "les_articles">


 <c:forEach items="${lesArticles}" var="article">
     <div class = "affiche_article">
     <div class ="image_article_affiche">
     
              <img src= "${article.imageArticle}" id ="image_article"/>
       </div>  
          <div class ="affiche"> 	
        
           <h3><a href ="/encheres/detailachatservlet">${article.nomArticle}</a></h3> 
<p>${article.description}</p>



<fmt:parseDate pattern="yyyy-MM-dd" value="${article.dateDebutEncheres}" var="parsedDate" />
<p>Date début d'enchère :<fmt:formatDate  value="${parsedDate}" pattern= "dd-MM-yyyy"  /></p>

<fmt:parseDate pattern="yyyy-MM-dd" value="${article.dateFinEncheres}" var="parsedDate" />
<p>Date fin d'enchère :<fmt:formatDate  value="${parsedDate}" pattern= "dd-MM-yyyy"  /></p>

<p>${article.prixInitial} pts</p> 
<p>${article.utilisateur.pseudo}<p>
<p>${article.utilisateur.rue}<p>
<p>${article.utilisateur.codePostal}<p>
<p>${article.utilisateur.ville}<p>  
          
    </div>   
   </div>
    
   </c:forEach> 
        </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
 <form method="post" action="/encheres/consulteraccueilconnexion"> 


    <input type="text" id="input_search" value="Le nom de l'article contient">
    <img src=/encheres/images/icon_search.jfif id="input_img">

    

<div class="filtre_categories">
       <label for="categories">Catégories</label>
       <select name="categories" id="categories">
           <option value="informatique">Informatique</option>
           <option value="ameublement">Ameublement</option>
           <option value="vetement">Vetement</option>
           <option value="sport">Sport</option>
           <option value="loisirs">Loisirs</option>
           
       </select>
</div>
   </div>
 
   <div = "rechercher_submit">
   <input  type="submit" value="Rechercher" class = input_submit>
   </div>
   </div>
 </form> 

 
 
 
 
 
 
 
<div class = "les_articles">


 <c:forEach items="${lesArticlesFiltres}" var="articleFiltre">
     <div class = "affiche_article">
     <div class ="image_article_affiche">
     
              <img src= "${articleFiltre.imageArticle}" id ="image_article"/>
       </div>  
          <div class ="affiche"> 	
        
           <h3><a href ="/encheres/detailachatservlet">${articleFiltre.nomArticle}</a></h3> 
<p>${articleFiltre.description}</p>
<p>${articleFiltre.dateDebutEncheres}</p>
<p>${articleFiltre.dateFinEncheres}</p>
<p>${articleFiltre.prixInitial}pts</p> 


            

           
          
          
    </div>   
    </div>
    
       
           
    </c:forEach> 
        
 
    
    
    </div>
  <!--   
    <form action="upload" method="post" enctype="multipart/form-data">
    <input type="text" name="description" />
    <input type="file" name="file" />
    <input type="submit" />
</form> -->
    
  
    




</body>
</html>
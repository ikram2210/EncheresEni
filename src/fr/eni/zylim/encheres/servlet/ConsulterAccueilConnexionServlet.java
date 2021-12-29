package fr.eni.zylim.encheres.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.eni.zylim.encheres.bll.ArticleVenduManager;
import fr.eni.zylim.encheres.bll.BLLException;
import fr.eni.zylim.encheres.bll.CategorieManager;
import fr.eni.zylim.encheres.bo.ArticleVendu;
import fr.eni.zylim.encheres.dal.DALException;


/**
 * Servlet implementation class ConsulterAvecConnexion
 */
@WebServlet("/consulteraccueilconnexion")
public class ConsulterAccueilConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsulterAccueilConnexionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int categorieIdSelect =0;
		String motRecherche = "";
		 List<ArticleVendu> listearticlefiltre = null;
	        List<ArticleVendu> listeAAfficher = new ArrayList<>();

            // récupérer les articles par filtre mot Clé
	        
	        if (request.getParameter("nomArticle") != null) {
	        	motRecherche = request.getParameter("nomArticle");
	           
	        }
	        // récupérer les catégories
	        
	        request.setAttribute("ListeCategories", request.getParameter("ListeCategories"));
	        
	        try {

	            request.setAttribute("listeCategories", CategorieManager.getInstance().selectAll());
	            if (request.getParameter("ListeCategories") != null) {
	            	categorieIdSelect  = Integer.parseInt(request.getParameter("ListeCategories"));  // récupérer l'id de la catégorie sélectionnée//
	            }

	            if (motRecherche.equals("")) {
	                if (categorieIdSelect == 0) {
	                    listearticlefiltre = ArticleVenduManager.getInstance().selectAllArticleVendu();
	                } else {
	                    listearticlefiltre = ArticleVenduManager.getInstance().AfficherArticlesParCategorie(categorieIdSelect); // affiche tous les articles par catégorie
	                }
	            } else {
	                if (categorieIdSelect == 0) {
	                    listearticlefiltre = ArticleVenduManager.getInstance().afficherByMotCle(motRecherche);
	                   
	                }else{
	                	 listearticlefiltre = ArticleVenduManager.getInstance().afficherLesArticlesParMotCleEtCategorie(motRecherche, categorieIdSelect);
	                }
	            }
	            listeAAfficher = listearticlefiltre;    

    		System.out.println("Liste articles" +listeAAfficher );
    		request.setAttribute("lesArticles", listeAAfficher);
	        } catch (BLLException e) {
	           

	        } catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
  
//    		request.setAttribute("lesArticles", listeAAfficher);
	
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/Accueil.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

}

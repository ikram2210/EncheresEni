package fr.eni.zylim.encheres.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zylim.encheres.bo.ArticleVendu;

import fr.eni.zylim.encheres.dal.ArticleVenduDAO;
import fr.eni.zylim.encheres.dal.DALException;
import fr.eni.zylim.encheres.dal.DAOFactory;


public class ArticleVenduManager {
	
private static ArticleVenduManager instance;
	
	private static ArticleVenduDAO articleVenduDAO;
	
	private ArticleVenduManager() {
		articleVenduDAO = DAOFactory.getArticleVenduDAO();
	};

	public static ArticleVenduManager getInstance() {
		if(instance == null) {
			instance = new ArticleVenduManager();
		}
		return instance;
	}
	
	public static List<ArticleVendu> selectAllArticleVendu(){
		List<ArticleVendu> lesArticles = new ArrayList<ArticleVendu>();
		try {
		lesArticles = articleVenduDAO.selectAllArticleVendu();
		} catch (DALException e) {
			e.printStackTrace();
			
		}
		return lesArticles;
	}
	public static List<ArticleVendu> afficherByMotCle(String motCle) throws BLLException{
        List<ArticleVendu> listeArticlesVendus = null;

        try {
            listeArticlesVendus =articleVenduDAO.selectByMotCle(motCle);
            if (listeArticlesVendus.isEmpty()) {
                throw new BLLException("Il n'existe pas d'article contenant ce mot");
            }
        } catch (DALException e) {
            e.printStackTrace();
            throw new BLLException("Problème :sélection d'articles par nom");
        }
        return listeArticlesVendus;
	}
	   public List<ArticleVendu> AfficherArticlesParCategorie(Integer categorieId) throws BLLException {
	        List<ArticleVendu> articleVenduList = null;
	        try {
	            articleVenduList = articleVenduDAO.selectByCategorie(categorieId);
	            if (articleVenduList.isEmpty()) {
	                throw new BLLException("Pas d'article pour cette catégorie");
	            }
	        } catch (DALException e) {
	            e.printStackTrace();
	            throw new BLLException("Problème: Article par catégorie");
	        }

	        return articleVenduList;
	    }

	   public List<ArticleVendu> afficherLesArticlesParMotCleEtCategorie(String nomArticleRecherche, int idCategorieSelect) throws BLLException {
	        List<ArticleVendu> listeArticlesVendus = null;

	        try {
	            listeArticlesVendus = this.articleVenduDAO.selectArticleAvecMotCleEtCategorie(nomArticleRecherche, idCategorieSelect);
	            if (listeArticlesVendus.isEmpty()) {
	                throw new BLLException(" pas d'article contenant ce mot pour cette catégorie");
	            }

	        } catch (DALException e) {
	            e.printStackTrace();
	            throw new BLLException("Problème sélection d'articles par nom et categorie");
	        }
	        return listeArticlesVendus;

	    }
}














	



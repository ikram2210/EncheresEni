
package fr.eni.zylim.encheres.dal;

import java.util.List;


import fr.eni.zylim.encheres.bo.ArticleVendu;




public interface ArticleVenduDAO {
	
	ArticleVendu selectArticleById(int no_article) throws DALException;
	List<ArticleVendu> selectAllArticleVendu() throws DALException;
	List<ArticleVendu> selectArticleAvecMotCleEtCategorie(String nomArticleRecherche, int idCategorieSelect) throws DALException;
	List<ArticleVendu> selectByMotCle(String motCle) throws DALException;
	List<ArticleVendu> selectByCategorie(int categorieId) throws DALException;
	void insertArticleVendu(ArticleVendu nouveauArticle) throws DALException;
	
	
}

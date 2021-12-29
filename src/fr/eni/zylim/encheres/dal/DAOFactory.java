package fr.eni.zylim.encheres.dal;

import fr.eni.zylim.encheres.dal.jdbc.ArticleVenduDAOJdbcImpl;
import fr.eni.zylim.encheres.dal.jdbc.CategorieDAOJdbcImpl;
import fr.eni.zylim.encheres.dal.jdbc.EnchereDAOJdbcImpl;
import fr.eni.zylim.encheres.dal.jdbc.RetraitDAOJdbcImpl;
import fr.eni.zylim.encheres.dal.jdbc.UtilisateurDAOJdbcImpl;

public class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl() ;
	}
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOJdbcImpl();
	}
	public static CategorieDAO getCategorieDAO() {return new CategorieDAOJdbcImpl(); }
	public static EnchereDAO getEnchereDAO() {
		return new  EnchereDAOJdbcImpl();
	}
	public static RetraitDAO  getRetraitDAO(){
		
		return new RetraitDAOJdbcImpl();
	}


}

package fr.eni.zylim.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import fr.eni.zylim.encheres.bo.ArticleVendu;
import fr.eni.zylim.encheres.bo.Categorie;
import fr.eni.zylim.encheres.bo.Retrait;
import fr.eni.zylim.encheres.bo.Utilisateur;
import fr.eni.zylim.encheres.dal.ArticleVenduDAO;
import fr.eni.zylim.encheres.dal.CategorieDAO;
import fr.eni.zylim.encheres.dal.DALException;
import fr.eni.zylim.encheres.dal.DAOFactory;
import fr.eni.zylim.encheres.dal.UtilisateurDAO;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {
//	private static final String SELECT_FILTER_MOT_CLE = "SELECT * FROM ARTICLES_VENDUS WHERE nomArticle LIKE '%"+motCle+"%' OR description LIKE  '%"+motCle+"%'";
	
	private static final String SELECT_ALL ="SELECT * FROM ARTICLES_VENDUS" ;
private static final String SELECT_ARTICLE_BY_CATEGORIE = "SELECT * FROM ARTICLES_VENDUS WHERE noCategorie= ?";
private static final String SELECT_ARTICLE_PAR_MOT_CLE = "SELECT * FROM ARTICLES_VENDUS WHERE nomArticle LIKE ?";
private static final String SELECT_ARTICLE_PAR_MOT_CLE_ET_CATEGORIE = "SELECT * FROM ARTICLES_VENDUS WHERE nomArticle LIKE ? AND noCategorie= ? ";
	

	
	 public List<ArticleVendu>  selectAllArticleVendu() throws DALException {
	
		 List<ArticleVendu> listeArticlesVendus = new ArrayList<>();

	        try (
	                Connection connection = ConnectionProvider.getConnection();
	                Statement stmt = connection.createStatement();
	                ResultSet rs = stmt.executeQuery(SELECT_ALL);
	        ) {
	            while (rs.next()) {
	                ArticleVendu article = new ArticleVendu();
	            
	                article.setNoArticle(rs.getInt("noArticle"));
	                article.setNomArticle(rs.getString("nomArticle"));
	                article.setDescription(rs.getString("description"));
	                article.setDateDebutEncheres(rs.getDate("dateDebutEncheres").toLocalDate());
	                article.setDateFinEncheres(rs.getDate("dateFinEncheres").toLocalDate());
	                article.setPrixInitial(rs.getInt("prixInitial"));
	                article.setPrixVente(rs.getInt("prixVente"));
	                article.setImageArticle(rs.getString("imageArticle"));

	                UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO(); 
	                Utilisateur utilisateur = new Utilisateur();
	                utilisateur = utilisateurDAO.selectById(rs.getInt("noUtilisateur"));
	                article.setUtilisateur(utilisateur);
	                listeArticlesVendus.add(article);
	            }
	            rs.close();
	        } catch (SQLException e) {
	            throw new DALException("Erreur: sélection des articles vendus");
	        }

	        return listeArticlesVendus;
		
//			List<ArticleVendu> tousLesArticles = new ArrayList<>();
//			Connection cnx = ConnectionProvider.getConnection();
//			Statement ordre = null;
//			try {
//			ordre = cnx.createStatement();
//			ResultSet resultat = null;
//			resultat = ordre.executeQuery(SELECT_ALL);
	//
//			while (resultat.next()) {
	//
//			tousLesArticles.add(ReduireCode(resultat));
	//
//			}
//			}
//			catch (SQLException e) {
//			System.out.println("Echec");
//			e.printStackTrace();
//			throw new DALException(e.getMessage());
//			}
//			return tousLesArticles;
		
		
		
	}



	@Override
	public ArticleVendu selectArticleById(int no_article) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

	

	@Override
	public void insertArticleVendu(ArticleVendu nouveauArticle) throws DALException {
		// TODO Auto-generated method stub
		
	}


//	@Override
//	public List<ArticleVendu> selectByMotCle(String motCle) throws DALException {
//		
//		List<ArticleVendu> tousLesArticles = new ArrayList<>();
//		Connection cnx = ConnectionProvider.getConnection();
//		Statement ordre = null;
//		try {
//		ordre = cnx.createStatement();
//		ResultSet resultat = null;
//		resultat = ordre.executeQuery(SELECT_FILTER_MOT_CLE);
//		while (resultat.next()) {
//		
//		tousLesArticles.add(ReduireCode(resultat));
//
//		}
//		}
//		catch (SQLException e) {
//		System.out.println("Echec");
//		e.printStackTrace();
//		throw new DALException(e.getMessage());
//		}
//		return tousLesArticles;	
//		
//	}



	
//	private ArticleVendu ReduireCode(ResultSet resultat) throws SQLException{
//		return new ArticleVendu(
//				resultat.getInt("noArticle"),
//				resultat.getString("nomArticle"),
//				resultat.getString("description"),
//			    resultat.getDate("dateDebutEncheres").toLocalDate(),
//			    resultat.getDate("dateFinEncheres").toLocalDate(),
//				resultat.getInt("prixInitial"),
//				resultat.getInt("prixVente"),
//				resultat.getInt("noUtilisateur"),
//			    resultat.getInt("noCategorie"),
//			    resultat.getBoolean("etatVente"),
//				resultat.getString("imageArticle")
//				);
//	}



	@Override
	public List<ArticleVendu> selectByMotCle(String motRecherche) throws DALException {
		  List<ArticleVendu> listeArticlesVendus = new ArrayList<>();
	        try (
	                Connection cnx = ConnectionProvider.getConnection();
	                PreparedStatement pstt = cnx.prepareStatement(SELECT_ARTICLE_PAR_MOT_CLE);
	        ) {
	            pstt.setString(1, '%' + motRecherche + '%'); 
	            ResultSet rs = pstt.executeQuery();

	            while (rs.next()) {
	            	  ArticleVendu article = new ArticleVendu();
	  	            
		                article.setNoArticle(rs.getInt("noArticle"));
		                article.setNomArticle(rs.getString("nomArticle"));
		                article.setDescription(rs.getString("description"));
		                article.setDateDebutEncheres(rs.getDate("dateDebutEncheres").toLocalDate());
		                article.setDateFinEncheres(rs.getDate("dateFinEncheres").toLocalDate());
		                article.setPrixInitial(rs.getInt("prixInitial"));
		                article.setPrixVente(rs.getInt("prixVente"));
		                article.setImageArticle(rs.getString("imageArticle"));

		                UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO(); // return new UtilisateurDAOJdbcimpl();
		                Utilisateur utilisateur = new Utilisateur();
		                utilisateur = utilisateurDAO.selectById(rs.getInt("noUtilisateur"));
		                article.setUtilisateur(utilisateur);
		               
	                CategorieDAO categorieDAO = DAOFactory.getCategorieDAO(); // return new CategorieDAOImpl();
	                Categorie categorie = new Categorie();
	                categorie = categorieDAO.selectById(rs.getInt(10));
	                article.setCategorie(categorie);

	                listeArticlesVendus.add(article);
	            }
	            rs.close();
	        } catch (SQLException | DALException sqlException) {
	            sqlException.printStackTrace();
	            throw new DALException("Erreur recherche article par nom.");
	        }

	        return listeArticlesVendus;
	}



	@Override
	public List<ArticleVendu> selectArticleAvecMotCleEtCategorie(
			String nomArticleRecherche, int idCategorieSelect) throws DALException {
		 List<ArticleVendu> listeArticlesVendus = new ArrayList<>();
	        try (
	                Connection cnx = ConnectionProvider.getConnection();
	                PreparedStatement pstt = cnx.prepareStatement(SELECT_ARTICLE_PAR_MOT_CLE_ET_CATEGORIE );
	        ) {
	            pstt.setString(1, '%' + nomArticleRecherche + '%');
	            pstt.setInt(2, idCategorieSelect);
	            ResultSet rs = pstt.executeQuery();

	            while (rs.next()) {
	            	  ArticleVendu article = new ArticleVendu();
	  	            
		                article.setNoArticle(rs.getInt("noArticle"));
		                article.setNomArticle(rs.getString("nomArticle"));
		                article.setDescription(rs.getString("description"));
		                article.setDateDebutEncheres(rs.getDate("dateDebutEncheres").toLocalDate());
		                article.setDateFinEncheres(rs.getDate("dateFinEncheres").toLocalDate());
		                article.setPrixInitial(rs.getInt("prixInitial"));
		                article.setPrixVente(rs.getInt("prixVente"));
		                article.setImageArticle(rs.getString("imageArticle"));

		                UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO(); // return new UtilisateurDAOJdbcimpl();
		                Utilisateur utilisateur = new Utilisateur();
		                utilisateur = utilisateurDAO.selectById(rs.getInt("noUtilisateur"));
		                article.setUtilisateur(utilisateur);
		               
	                CategorieDAO categorieDAO = DAOFactory.getCategorieDAO(); // return new CategorieDAOImpl();
	                Categorie cat = new Categorie();
	                cat = categorieDAO.selectById(rs.getInt(9));
	                article.setCategorie(cat);

	                listeArticlesVendus.add(article);
	            }
	            rs.close();
	        } catch (SQLException sqlException) {
	            sqlException.printStackTrace();
	            throw new DALException("Erreur recherche article par nom et catégorie");
	        }

	        return listeArticlesVendus;

	}



	@Override
	public List<ArticleVendu> selectByCategorie(int categorieId) throws DALException {
		  List<ArticleVendu> listeArticlesVendus = new ArrayList<>();
	        try (
	                Connection cnx = ConnectionProvider.getConnection();
	                PreparedStatement pstt = cnx.prepareStatement(SELECT_ARTICLE_BY_CATEGORIE);
	        ) {

	            pstt.setInt(1, categorieId);
	            ResultSet rs = pstt.executeQuery();

	            while (rs.next()) {
	                ArticleVendu article = new ArticleVendu();
	              
	                article.setNoArticle(rs.getInt("noArticle"));
	                article.setNomArticle(rs.getString("nomArticle"));
	                article.setDescription(rs.getString("description"));
	                article.setDateDebutEncheres(rs.getDate("dateDebutEncheres").toLocalDate());
	                article.setDateFinEncheres(rs.getDate("dateFinEncheres").toLocalDate());
	                article.setPrixInitial(rs.getInt("prixInitial"));
	                article.setPrixVente(rs.getInt("prixVente"));
	                article.setImageArticle(rs.getString("imageArticle"));

	                UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO(); 
	                Utilisateur utilisateur = new Utilisateur();
	                utilisateur = utilisateurDAO.selectById(rs.getInt("noUtilisateur"));
	                article.setUtilisateur(utilisateur);
	               

	                CategorieDAO categorieDAO = DAOFactory.getCategorieDAO();
	                Categorie cat = new Categorie();
	                cat = categorieDAO.selectById(rs.getInt(9));
	                article.setCategorie(cat);

	                listeArticlesVendus.add(article);
	            }
	            rs.close();
	        } catch (SQLException sqlException) {
	            sqlException.printStackTrace();
	            throw new DALException("Erreur recherche article par catégorie");
	        }

	        return listeArticlesVendus;
	}


	
	

}

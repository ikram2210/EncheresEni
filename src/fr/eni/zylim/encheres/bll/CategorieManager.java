package fr.eni.zylim.encheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.zylim.encheres.bo.Categorie;
import fr.eni.zylim.encheres.dal.CategorieDAO;
import fr.eni.zylim.encheres.dal.DALException;
import fr.eni.zylim.encheres.dal.DAOFactory;
import fr.eni.zylim.encheres.dal.jdbc.CategorieDAOJdbcImpl;

public class CategorieManager {

private static CategorieManager instance;
	
	private static CategorieDAO categorieDAO;
	
	private CategorieManager() {
		 categorieDAO = DAOFactory.getCategorieDAO();
	};

	public static CategorieManager getInstance() {
		if(instance == null) {
			instance = new CategorieManager();
		}
		return instance;
	}


	    public List<Categorie> selectAll() throws BLLException, DALException {

	    	 try {
	             return categorieDAO.selectAll();
	         } catch (DALException e) {
	             e.printStackTrace();
	             throw new BLLException("Erreur d'affichage des catégories");
	         }
	    }

	    public Categorie selectById(int id_categorie) throws DALException{
	        return categorieDAO.selectById(id_categorie);
	    }



}

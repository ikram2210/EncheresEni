package fr.eni.zylim.encheres.dal.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.zylim.encheres.bo.Categorie;
import fr.eni.zylim.encheres.dal.CategorieDAO;
import fr.eni.zylim.encheres.dal.DALException;


public class CategorieDAOJdbcImpl implements CategorieDAO {
	public static final String SELECT_BY_ID = "SELECT noCategorie, libelle FROM CATEGORIES WHERE noCategorie = ?";
	public static final String SELECT_ALL = "SELECT noCategorie, libelle FROM CATEGORIES ";


	@Override
	public Categorie selectById(int numCategorie) throws DALException {
		ResultSet rs = null;
        Categorie categorie = null;

        try (
                Connection connection = ConnectionProvider.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(SELECT_BY_ID);
        )
        {
            pStmt.setInt(1, numCategorie);
            rs = pStmt.executeQuery();

            while (rs.next()) {
            	
            	
                categorie = new Categorie(rs.getInt("noCategorie"), rs.getString("libelle"));
            }

		} catch (SQLException e) {
			throw new DALException("Echec de la sélection par numéro de la catégorie - numéro = " + numCategorie);
		}
		return categorie;
	
	}


	@Override
	public List<Categorie> selectAll() throws DALException {
		 List<Categorie> listeCategories = new ArrayList<>();



	        try (
	                Connection connection = ConnectionProvider.getConnection();
	                Statement stmt = connection.createStatement();
	                ResultSet rs = stmt.executeQuery(SELECT_ALL);
	        ) {

	            while (rs.next()) {
	                Categorie categorie = new Categorie();

	                categorie.setNoCategorie(rs.getInt(1));
	                categorie.setLibelle(rs.getString(2));

	                listeCategories.add(categorie);
	            }
	            rs.close();
	        } catch (SQLException e) {
	            throw new DALException("Erreur à la sélection des catégories");
	        }
	        return listeCategories;
	}

}

package fr.eni.zylim.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import fr.eni.zylim.encheres.bo.Utilisateur;
import fr.eni.zylim.encheres.dal.DALException;
import fr.eni.zylim.encheres.dal.UtilisateurDAO;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String SELECT_BY_ID = "SELECT noUtilisateur, pseudo, nom, prenom, email, " +
            "telephone, rue, codePostal, ville, motDePasse, credit, administrateur " +
            "FROM UTILISATEURS WHERE noUtilisateur=?";


	@Override
	public List<Utilisateur> selectAllUtilisateurs() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur selectUtilisateurByPseudo(String pseudo) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur selectUtilisateurById(int id_Utilisateur) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate_Pseudo(String pseudo, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Utilisateur ProfileBy_Pseudo(String pseudo, String password) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate_Mail(String eMail, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteUtilisateur(int id_Utilisateur) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur insertUtilisateur(Utilisateur nouvelUtilisateur) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUtilisateur(Utilisateur user) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> getAllPseudos() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	public Utilisateur selectById(int id) throws DALException {
		
		        Utilisateur utilisateur = new Utilisateur();
		        try (Connection cnx = ConnectionProvider.getConnection();
		        PreparedStatement psmt = cnx.prepareStatement(SELECT_BY_ID);) {
		            psmt.setInt(1, id);
		            ResultSet rs = psmt.executeQuery();

		            while (rs.next()) {
		                utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
		                utilisateur.setPseudo(rs.getString("pseudo"));
		                utilisateur.setNom(rs.getString("nom"));
		                utilisateur.setPrenom(rs.getString("prenom"));
		                utilisateur.setEmail(rs.getString("email"));
		                utilisateur.setTelephone(rs.getString("telephone"));
		                utilisateur.setRue(rs.getString("rue"));
		                utilisateur.setCodePostal(rs.getString("codePostal"));
		                utilisateur.setVille(rs.getString("ville"));
		                utilisateur.setMotDePasse(rs.getString("motDePasse"));
		                utilisateur.setCredit(rs.getInt("credit"));
		                utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
		            }

		        } catch (SQLException sqlException) {
		            sqlException.printStackTrace();
		            throw new DALException("Impossible de récupérer l'utilisateur de cet ID.");
		        }

		        return utilisateur;
	
	}

}

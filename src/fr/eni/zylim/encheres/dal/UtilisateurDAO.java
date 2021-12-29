package fr.eni.zylim.encheres.dal;

import java.sql.SQLException;
import java.util.List;

import fr.eni.zylim.encheres.bo.Utilisateur;



public interface UtilisateurDAO {

	List<Utilisateur> selectAllUtilisateurs() throws DALException;

	Utilisateur selectUtilisateurByPseudo(String pseudo) throws DALException;

	Utilisateur selectUtilisateurById(int id_Utilisateur) throws DALException;

	boolean authenticate_Pseudo(String pseudo, String password);

	Utilisateur ProfileBy_Pseudo(String pseudo, String password) throws DALException;

	boolean authenticate_Mail(String eMail, String password);

	void deleteUtilisateur(int id_Utilisateur) throws DALException;

	Utilisateur insertUtilisateur(Utilisateur nouvelUtilisateur) throws DALException;

	void updateUtilisateur(Utilisateur user) throws DALException;

	List<String> getAllPseudos() throws DALException;
	
	Utilisateur selectById(int id) throws DALException;
	
	





	
	
	

	
	


	

}

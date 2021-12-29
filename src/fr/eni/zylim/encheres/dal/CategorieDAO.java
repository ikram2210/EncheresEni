package fr.eni.zylim.encheres.dal;

import java.util.List;

import fr.eni.zylim.encheres.bo.Categorie;


public interface CategorieDAO {
 Categorie selectById(int numCategorie) throws DALException;


List<Categorie> selectAll() throws DALException;
		
	

}

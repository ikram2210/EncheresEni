package fr.eni.zylim.encheres.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zylim.encheres.dal.DALException;

public class BLLException extends Exception {
	
	private List<Exception> erreurs = new ArrayList<Exception>();

	public BLLException() {
	}

	public BLLException(String message) {
		super(message);
	}

	public BLLException(Throwable cause) {
		super(cause);
	}

	public BLLException(String message, Throwable cause) {
		super(message, cause);
	}



	public void ajouterErreur(DALException e) {
		// TODO Auto-generated method stub


	/**
	 * Ajoute une exception � la liste d'exception.
	 * @param e L'exception � ajouter.
	 */
	
	
	/**
	 * Indique si la liste des erreurs est vide ou non
	 * @return true s'il y a des erreurs, false sinon.
	 */




}

	public void ajouterErreur(ParameterException parameterException) {
		// TODO Auto-generated method stub
		
	}

	public boolean hasErreur() {
		// TODO Auto-generated method stub
		return false;
	}
}

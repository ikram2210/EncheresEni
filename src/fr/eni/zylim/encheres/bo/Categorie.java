package fr.eni.zylim.encheres.bo;

import java.util.List;

public class Categorie {

	private int noCategorie;
	private String libelle;
	private List<ArticleVendu> listeArticles;
	public Categorie(int noCategorie, String libelle) {
		this.noCategorie= noCategorie;
		this.libelle= libelle;
	}
	public Categorie() {
	
	}
	public int getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<ArticleVendu> getListeArticles() {
		return listeArticles;
	}
	public void setListeArticles(List<ArticleVendu> listeArticles) {
		this.listeArticles = listeArticles;
	}
	

	

}

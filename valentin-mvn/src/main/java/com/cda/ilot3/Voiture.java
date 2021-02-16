package com.cda.ilot3;

public class Voiture {
	private int puissance;
	private String nom;

	/**
	 * @param puissance
	 */
	public Voiture(int puissance, String nom) {
		this.puissance = puissance;
		this.setNom(nom);
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}

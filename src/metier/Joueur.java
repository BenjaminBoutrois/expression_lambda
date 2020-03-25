package metier;

import interfaces.IJeu;

public class Joueur {
	private String nom;
	
	public Joueur()
	{
		this.nom = "anonyme";
	}
	
	public Joueur(String nom)
	{
		this.nom = nom;
	}
	
	public void jouer(IJeu iJeu)
	{
		iJeu.jouer(nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}

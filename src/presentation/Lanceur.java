package presentation;

import interfaces.IJeu;
import metier.Joueur;

public class Lanceur {

	public static void main(String[] args) {
		
		Joueur joueur = new Joueur("Benjamin");
		
		// Sans expression lambda
		joueur.jouer(new IJeu() {
			@Override
			public void jouer(String nom) {
				System.out.println(nom + " joue sans expression lambda.");
			}
		});
		
		// Avec expression lambda (et argument)
		joueur.jouer(n -> System.out.println(n + " joue avec une expression lambda."));
	}
}

package fr.pizzeria.console;

import java.util.Scanner;

import pizzeria.ihm.Menu;
import pizzeria.ihm.Stockage;
import pizzeria.ihm.StockageTableau;

public class App {

	public static void main(String[] args) {

		// Objectif 1=Afficher le menu
		// Objectif2=Récupérer la saisie

		Scanner scanner = new Scanner(System.in);

		Stockage stockage = new StockageTableau(); // je choisis le stockage
													// tableau

		Menu menuPrincipal = new Menu(stockage, scanner);
		menuPrincipal.start();

		scanner.close();
	}
}

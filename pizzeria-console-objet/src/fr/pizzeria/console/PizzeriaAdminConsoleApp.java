package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static Scanner sc = new Scanner(System.in);
	public static int reponse;
	public static int i;
	public static Pizza[] listePizza = { getPizza("PEP", "P�p�roni", 12.50), getPizza("MAR", "Margherita", 14) };

	/*
	 * {{"PEP","P�p�roni","12,50"}, {"MAR","Margherita","14,00"},
	 * {"REI","La Reine","11,50"}, {"FRO","La 4 fromages","12,00"},
	 * {"CAN","La cannibale","12,50"}, {"SAV","La savoyarde","13,00"},
	 * {"ORI","L'orientale","13,50"}, {"IND","L'indienne","14,00"}};
	 */
	public static Pizza getPizza(String code, String nom, double prix) {
		Pizza p = new Pizza();
		p.setCode(code);
		p.setNom(nom);
		p.setPrix(prix);
		return p;
	}

	public static void main(String[] args) {
		/*
		 * Pizza peperoni = new Pizza(); peperoni.code = "PEP"; peperoni.nom =
		 * "P�p�roni"; peperoni.prix = 12.50;
		 * 
		 * Pizza peperoni2 = getPizza("PEP", "P�p�roni", 12.50);
		 * 
		 * Pizza margherita = new Pizza(); margherita.code = "MAR";
		 * margherita.nom = "Margherita"; margherita.prix = 14;
		 * 
		 * Pizza[] pizzaTab = {getPizza("PEP", "P�p�roni", 12.50),
		 * getPizza("MAR", "Margherita", 14)};
		 */

		boolean fin = false;

		menu();
		reponse = sc.nextInt();

		do { // tant que le signal de sortie n'est pas donn�, on continue
				// d'afficher le menu
			switch (reponse) {
			case 1: // affichage de la liste des pizzas
				System.out.println("Liste des pizzas");
				System.out.println(" ");
				afficherPizzas();
				menu();
				reponse = sc.nextInt();
				break;
			case 2: // ajout d'une nouvelle pizza
				System.out.println("Ajout d'une nouvelle pizza");
				System.out.println(" ");
				listePizza = ajouterPizza(); // on remplace l'ancien tableau par
												// le nouveau
				menu();
				reponse = sc.nextInt();
				break;
			case 3: // mis � jour des informations d'une pizza
				System.out.println("Mise � jour d'une pizza");
				System.out.println(" ");
				majPizza();
				menu();
				reponse = sc.nextInt();
				break;
			case 4: // suppression d'une pizza
				System.out.println("Suppression d'une pizza");
				System.out.println(" ");
				supprimerPizza(); // on remplace l'ancien tableau par le nouveau
				menu();
				reponse = sc.nextInt();
				break;
			case 99: // sortie du programme (signal de sortie)
				System.out.println("Au revoir :(");
				fin = true; // signal de sortie
				break;
			default: // pas de r�ponse convenable, on r�affiche le menu
				menu();
				reponse = sc.nextInt();
				break;
			}
		} while (fin == false);

		sc.close();
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		PizzeriaAdminConsoleApp.sc = sc;
	}

	public static int getReponse() {
		return reponse;
	}

	public static void setReponse(int reponse) {
		PizzeriaAdminConsoleApp.reponse = reponse;
	}

	public static Pizza[] getListePizza() {
		return listePizza;
	}

	public static void setListePizza(Pizza[] listePizza) {
		PizzeriaAdminConsoleApp.listePizza = listePizza;
	}

	public static void menu() {

		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre � jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		System.out.println(" ");
	}

	public static void afficherPizzas() {

		for (i = 0; i < listePizza.length; i++) { // parcourt et affichage de la
													// liste
			System.out.println(
					i + ". " + listePizza[i].code + " -> " + listePizza[i].getNom() + " (" + listePizza[i].prix + ")");
		}
		System.out.println(" ");
	}

	public static Pizza[] ajouterPizza() {
		System.out.println("Veuillez saisir le code");
		String code = sc.next();
		System.out.println("Veuillez saisir le nom (sans espaces)");
		String nom = sc.next();
		System.out.println("Veuillez saisir le prix");
		String prix = sc.next();

		Pizza listeProvisoire[] = new Pizza[listePizza.length + 1]; // tableau
																	// provisoire
																	// incr�ment�
																	// de 1
		for (i = 0; i < listePizza.length; i++) { // on recopie les informations
													// du tableau existant
			listeProvisoire[i] = listePizza[i];
		}
		// on ajoute la nouvelle pizza
		listeProvisoire[listePizza.length] = getPizza(code, nom, Double.valueOf(prix));
		return listeProvisoire;
	}

	public static void majPizza() {
		afficherPizzas(); // on affiche la liste
		System.out.println("Veuillez choisir la pizza � modifier");
		System.out.println("(99 pour abandonner)");
		int index = sc.nextInt(); // on utilise l'index du tableau pour la
									// s�lection
		if (index != 99 && index < listePizza.length) {
			System.out.println("Veuillez saisir le code");
			String code = sc.next();
			System.out.println("Veuillez saisir le nom (sans espaces)");
			String nom = sc.next();
			System.out.println("Veuillez saisir le prix");
			String prix = sc.next();
			// on mets � jour les informations de la pizza modifi�e
			listePizza[index] = getPizza(code, nom, Double.valueOf(prix));
		}
	}

	public static Object supprimerPizza() {
		int newIndex;

		afficherPizzas(); // on affiche la liste
		System.out.println("Veuillez choisir la pizza � supprimer");
		System.out.println("(99 pour abandonner)");
		int index = sc.nextInt(); // on utilise l'index du tableau pour la
									// s�lection
		if (index != 99 && index < listePizza.length) { // on parcourt la liste
			String listeProvisoire[][] = new String[listePizza.length - 1][3]; // tableau
																				// provisoire
																				// d�cr�ment�
																				// de
																				// 1

			for (i = 0; i < listePizza.length - 1; i++) {
				if (i >= index) {
					newIndex = i + 1;
				} // on modifie l'index pour passer la pizza � modifier
				else {
					newIndex = i;
				}
				// on copie les informations de l'ancienne liste sauf la pizza
				// supprim�e
				listeProvisoire[i][0] = listePizza[newIndex][0];
				listeProvisoire[i][1] = listePizza[newIndex][1];
				listeProvisoire[i][2] = listePizza[newIndex][2];
			}

			return listeProvisoire;
		} else {
			return listePizza; // si aucune pizza n'est supprim�e, on retourne
								// la liste originale
		}
	}
}
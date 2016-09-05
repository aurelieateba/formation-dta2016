package pizzeria.console;

import java.util.Scanner;

/**
 * @author ETY
 *
 */
public class PizzeriaAdminConsoleApp {
	private static Object ajouter;

	public static void main(String[] args) {
		boolean etat = false;
		Scanner sc = new Scanner(System.in);
		String [][] maListeDePizzas = new String [][]{{"PEP","Pépéroni" , "12.50"},{"MAR","Margherita","14.00"},{"REI","La Reine","11.50"},{"FRO","La 4 fromages","12.00"},{"CAN","La cannibale","12.50"},{"SAV","La savoyarde","13.00"},{"ORI","L'orientale","13.50"},{"IND","L'indienne","14.00"}};
		do {
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99.Sortir");
			
			int choix = sc.nextInt();
			switch (choix) {
			case 1:
				System.out.println("Lister de pizzas");
				for (int i = 0; i < maListeDePizzas.length; i++) {
					System.out.println(maListeDePizzas[i][0]+" -> "+maListeDePizzas[i][1]+" "+maListeDePizzas[i][2]+"€");
				}
				break;
			case 2:
				System.out.println("Ajouter une nouvelle pizza");
				System.out.println("");
				maListeDepizzas=ajouter pizzas;
				break;
			case 3:	// mis à jour des informations d'une pizza
				System.out.println("Mise à jour d'une pizza");
				System.out.println(" ");
				majPizza();
				menu();
				int reponse = sc.nextInt();
				break;
			case 4:
				break;
			case 99:
				System.exit(0);
				break;
			default:
				etat = false;
				break;
			}
			
		}while (!etat);
	}

	private static void menu() {
		// TODO Auto-generated method stub

	}

	private static void majPizza() {
		// TODO Auto-generated method stub

	}
}

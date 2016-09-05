package pizzeria.ihm;

import java.util.Scanner;

public class SavePizzaException {

	public static void main(String[] args) throws SavePizzaException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir une pizza de la liste,puis l'enregistrer");
		int choix = sc.nextInt();
		try {
			valider(choix);

			System.out.println("Mes félicitations ! Vous avez sauvegardé !");
		} catch (MonException e) {
			System.out.println("Choix non valide, veuillez le modifier");
		}

		sc.close();
	}

	public static void valider(int choix) {
		System.out.println("Choix");
		validerChoix(choix);

	}

	public static void validerChoix(int choix) throws SavePizzaException {
		if (choix < 1 || choix > 5) {
			// déclencher exception
			SavePizzaException e = new SavePizzaException();
			throw e;
		}
	}

}

public class SavePizzaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

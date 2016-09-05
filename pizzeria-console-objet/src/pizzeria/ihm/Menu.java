package pizzeria.ihm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

	private static final int CHOIX_SORTIR = 99;

	private Map<Integer, Action> actions = new HashMap<>();
	private Scanner scanner;

	public Menu(Stockage stockage, Scanner scanner) {

		this.actions.put(1, new ListerPizzasAction(stockage));
		this.actions.put(2, new AjouterPizzaAction(stockage, scanner));
		this.actions.put(3, new Action("Modifier une pizza"));
		this.actions.put(4, new Action("Supprimer une pizza"));

		this.scanner = scanner;
	}

	public void start() {
		boolean result = false;
		do {
			afficher();
			result = choisir();
		} while (!result);

	}

	public void afficher() {
		System.out.println("*** Application Pizzeria ***");

		for (Integer numero : actions.keySet()) {
			Action actionEnCours = actions.get(numero);
			System.out.println(numero + "." + actionEnCours.getLibelle());
		}
		System.out.println(CHOIX_SORTIR + ". Quitter");
	}

	public boolean choisir() {
		System.out.println("Veuillez choisir une option");
		int choix = scanner.nextInt();

		if (!actions.containsKey(choix)) {
			if (choix != CHOIX_SORTIR) {
				System.out.println("Veuillez nettoyer vos lunettes !! Choisissez une option valide !");
			}
		} else {
			Action laBonneAction = actions.get(choix);
			laBonneAction.execute();
		}

		return choix == CHOIX_SORTIR;
	}

}
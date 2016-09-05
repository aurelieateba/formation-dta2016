package pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ModifierPizzaAction extends Action {

	private Stockage stockage;
	private Scanner scanner;

	public ModifierPizzaAction(Stockage stockage, Scanner scanner) {
		super("Modifier une pizza");
		this.stockage = stockage;
		this.scanner = scanner;

	}

	public void execute() {
		System.out.println("Modifier une pizza");

		// Récupération de la saisie
		String nom = scanner.next();
		String code = scanner.next();
		double prix = 0.0;

		// création de la nouvelle pizza
		Pizza newPizza = new Pizza(0, code, nom, prix);

		// sauvegarde de la pizza
		stockage.savePizza(newPizza);
	}
}

package pizzeria.ihm;

import java.util.Scanner;

public class SupprimerPizzaAction {

	private Stockage stockage;
	private Scanner scanner;

	public SupprimerPizzaAction(Stockage stockage, Scanner scanner) {
		super();
		this.stockage = stockage;
		this.scanner = scanner;

	}

	public void execute() {
		System.out.println("Supprimer une pizza");

	}
}

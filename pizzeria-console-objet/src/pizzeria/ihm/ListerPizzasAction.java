package pizzeria.ihm;

import fr.pizzeria.model.Pizza;

public class ListerPizzasAction extends Action {

	private Stockage stockage;

	public ListerPizzasAction(Stockage stockage) {
		super("Lister les pizzas");
		this.stockage = stockage;
	}

	public void execute() {
		System.out.println("*** Lister Pizzas ****");
		Pizza[] pizzas = this.stockage.findAllPizzas();
		for (int i = 0; i < pizzas.length; i++) {
			Pizza p = pizzas[i];
			System.out.println(p.getCode() + " " + p.getNom());
		}

	}

}

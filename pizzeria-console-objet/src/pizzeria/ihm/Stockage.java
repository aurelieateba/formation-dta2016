package pizzeria.ihm;

import fr.pizzeria.model.Pizza;

public interface Stockage {

	public Pizza[] findAllPizzas();

	public void savePizza(Pizza newPizza);
}
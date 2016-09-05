package fr.pizzeria.model;

import java.util.Comparator;

public class PizzaComparatorParCode implements Comparator<Pizza> {

	public int compare(Pizza o1, Pizza o2) {
		int result = o1.getCode().compareTo(o2.getCode());
	}
}

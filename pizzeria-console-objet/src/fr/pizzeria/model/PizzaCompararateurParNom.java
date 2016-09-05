package fr.pizzeria.model;

import java.util.Comparator;

public class PizzaComparateurParNom implements Comparator<Pizza> {

	public int compare (Pizza o1,Pizzao2){
		
	   int result =o1.getNom().compareTo(o2.getNom());
	   return result;
  }
}

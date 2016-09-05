package fr.pizzeria.model;

import java.util.Comparator;

public class PizzaComparatorByPrice implements Comparator<Pizza> {

	public int compare (Pizza o1,Pizza o2){
	   int result=String.valueOf(o1.getprix()).compareTo(String.valueOf(o2.getPrix());
   }

}

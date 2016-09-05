package fr.pizzeria.exception;

import java.util.Scanner;

public class ExempleException {

	public static void main(String[] args) throws MonException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un entier entre 1 et 5");
		int choix = sc.nextInt();
		try {
			valider(choix);

			System.out.println("Mes félicitations ! Vous savez compter !");
		} catch (MonException e) {
			System.out.println("Choix non valide, veuillez le modifier");
		}

		sc.close();
	}

	public static void valider(int choix) {
		System.out.println("Choix");
		validerChoix(choix);

	}

	public static void validerChoix(int choix) throws MonException {
		if (choix < 1 || choix > 5) {
			// déclencher exception
			MonException e = new MonException();
			throw e;
		}
	}

}

public class MonException extends RuntimeException {

}
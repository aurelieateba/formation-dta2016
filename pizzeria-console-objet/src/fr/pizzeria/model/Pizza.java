package fr.pizzeria.model;

public class Pizza {
	protected int id;
	public String code;
	public String nom;
	public double prix;

	public static int NB_PIZZAS;

	public Pizza() {
		this("NOM PAR DEFAUT", 0);
	}

	public Pizza(String unNom, double unPrix) {
		this.nom = unNom;
		this.prix = unPrix;
	}

	public Pizza(int id, String code, String nom, double prix) {
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}

	public double doublerPrixInstance() {
		return prix * 2;
	}

	public static double doublerPrixStatic(double unPrix) {
		return unPrix * 2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}

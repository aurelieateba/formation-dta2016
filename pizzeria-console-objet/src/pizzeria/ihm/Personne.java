package pizzeria.ihm;

public class Personne {

	public String nom;
	public String prenom;
	public int adresse;

	public Personne(String n, String p, int a) {
		this.nom = n;
		this.prenom = p;
		this.adresse = a;
	}

	public void afficher() {
		System.out.println("Nom : " + nom + " prenom : " + prenom + " adresse : " + adresse);
	}

}

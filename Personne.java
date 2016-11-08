
/**TP Programmation orientéé objet POO1
Création d'une classe personne :
Attributs de personne :
	prenon
	nom
	age
	adresse
	femme ?
Comportements de personne :
	une personne décline son identité
	une personne fête son anniversaire
	une personne déménage
Règles de Gestion :
	changement de sexe direct
	changement de prenom direct
	changement d'adresse direct
	changement de nom indirect
	changement d'âge indirect*/
	
public class Personne {
	// Création des attributs
	private String prenom;
	private String nom;
	private int age;
	private boolean femme;
	private Adresse nextadresse;
	
	// Création des Getters et setters
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFemme() {
		return femme;
	}
	public void setFemme(boolean femme) {
		this.femme = femme;
	}
	
	//Affiche la chaîne de caractère qui décrit l'objet
	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", femme=" + femme + " + nextadresse=" + nextadresse + "]";
	}
	//constructeur
	public Personne(String prenom, String nom, int age, boolean femme) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.femme = femme;
		
	}
	public Adresse getNextadresse() {
		return nextadresse;
	}
	public void setNextadresse(Adresse nextadresse) {
		this.nextadresse = nextadresse;
	}
	
	
}	
	
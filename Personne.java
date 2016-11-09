/**
 * TP Programmation orient�� objet POO1 Cr�ation d'une classe personne :
 * Attributs de personne : prenon nom age adresse femme ? Comportements de
 * personne : une personne d�cline son identit� une personne f�te son
 * anniversaire une personne d�m�nage R�gles de Gestion : changement de sexe
 * direct changement de prenom direct changement d'adresse direct changement de
 * nom indirect changement d'�ge indirect
 */

public class Personne {
	// Cr�ation des attributs
	protected String prenom;
	protected String nom;
	protected int age;
	protected boolean femme;
	protected Adresse adresse;

	// Cr�ation des Getters et setters
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse nextadresse) {
		this.adresse = nextadresse;
	}

	// Affiche la cha�ne de caract�re qui d�crit l'objet
	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", femme=" + femme + " , + nextadresse=" + adresse + "]";
	}

	// constructeur
	public Personne(String prenom, String nom, int age, boolean femme) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.femme = femme;

	}
	
	public void Identifie (String prenom, String nom){
		System.out.println("Je suis" + prenom + nom);
		
	
	}
	public void Demenage(Adresse nvlleadresse) {
		System.out.println("d�m�nagement de" + prenom + "vers" + nvlleadresse);
		this.adresse = nvlleadresse;
	}

	public void Feteanniversaire() {
		age = age+1;                              
	}
}

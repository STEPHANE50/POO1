
/**TP Programmation orient�� objet POO1
Cr�ation d'une classe personne :
Attributs de personne :
	prenon
	nom
	age
	adresse
	femme ?
Comportements de personne :
	une personne d�cline son identit�
	une personne f�te son anniversaire
	une personne d�m�nage
R�gles de Gestion :
	changement de sexe direct
	changement de prenom direct
	changement d'adresse direct
	changement de nom indirect
	changement d'�ge indirect*/
	
public class Personne {
	// Cr�ation des attributs
	private String prenom;
	private String nom;
	private int age;
	private boolean femme;
	private Adresse nextadresse;
	
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
	
	//Affiche la cha�ne de caract�re qui d�crit l'objet
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
	
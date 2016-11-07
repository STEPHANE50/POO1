
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
	public String prenom;
	private String nom;
	private int age;
	public String nomville;
	public boolean femme;
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", nomville=" + nomville + ", femme=" + femme + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	//Cr�ation du constructeur
	public Personne(String prenom, String nom, int age, String nomville,
			boolean femme) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.nomville = nomville;
		this.femme = femme;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}
	
	public void setNomville(String nomville) {
	   this.nomville = nomville;
		
	}

	public void setFemme(boolean estUneFemme) {
		this.femme = estUneFemme;

	}
	public String getPrenom() {
		return prenom;
	}
	public String getNomville() {
		return nomville;
	}
	public boolean isFemme() {
		return femme;
	}
	
}

	
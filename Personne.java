
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
	//Création du constructeur
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

	
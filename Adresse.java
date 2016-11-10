
public class Adresse {
	
	// Informations de adresse
	private int numrue;
    private String nomvoie;
    private int codepostal;
    private String ville;
    
// Création des Getters et Setters pour récupérer les attributs et les modifier
public int getNumrue() {
	return numrue;
}


public void setNumrue(int numrue) {
	this.numrue = numrue;
}

public String getNomvoie() {
	return nomvoie;
}

public void setNomvoie(String nomvoie) {
	this.nomvoie = nomvoie;
}


public int getCodepostal() {
	return codepostal;
}

public void setCodepostal(int codepostal) {
	this.codepostal = codepostal;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

//Affiche la chaîne de caractère qui décrit l'objet
@Override
public String toString() {
	return "Adresse [numrue=" + numrue + ", nomvoie=" + nomvoie + ", codepostal=" + codepostal
			+ ", ville=" + ville + " ]";
}	  
    

public Adresse(int numrue, String nomvoie, int codepostal, String ville) {
	super();
	this.numrue = numrue;
	this.nomvoie = nomvoie;
	this.codepostal = codepostal;
	this.ville = ville;
}

}    

//STEP 5
//Classe spécialisée définissant les personnes réfugiées
//Date limite autorisation induit un contrôle
//Demande Asile affiche un message "Je demande l'asile pour l'adresse (...)"
//et associe l'adresse au réfugié et je régularise mon réfugié boolean).
//RG spécifique le déménagement est limité à la ville à la ville/CP d'assignation et que le réfugié est déjà régularisé.
//RG la demande d'asile n'est possible qu'avant la date limite.
//RG le réfugié au départ n'a pas d'adresse et n'est pas régularisé.*/

import java.util.Date;
public class Step5 extends Personne {
	//création des attributs propres à STEP5
	private Date datelimite; //date limite autorisation
	private boolean regularise;
	//-----------------------------------------------------------------------------------------------------	
	//création des getters et setters
	public Date getDatelimite() {
		return datelimite;
	}

	public void setDatelimite(Date datelimite) {
		this.datelimite = datelimite;
	}
	
	public boolean isRegularise() {
		return regularise;
	}

	public void setRegularise(boolean regularise) {
		this.regularise = regularise;
	}
	//-------------------------------------------------------------------------------------------------------
	//Affiche la chaîne de caractère qui décrit l'objet
	@Override	
	public String toString(){
		return "Step5 [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", femme=" + femme + " , + nextadresse=" + nextadresse + "]";
	}
	
	//Constructeur 
	
	public Step5(String prenom, String nom, int age, boolean femme,
		Date datelimite, boolean regularise) {
		super(prenom, nom, age, femme);
		this.datelimite = datelimite;
		this.regularise = regularise;
	}
	//--------------------------------------------------------------------------------------------------------
}
//////////

	

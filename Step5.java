
//STEP 5
//Classe sp�cialis�e d�finissant les personnes r�fugi�es
//Date limite autorisation induit un contr�le
//Demande Asile affiche un message "Je demande l'asile pour l'adresse (...)"
//et associe l'adresse au r�fugi� et je r�gularise mon r�fugi� boolean).
//RG sp�cifique le d�m�nagement est limit� � la ville � la ville/CP d'assignation et que le r�fugi� est d�j� r�gularis�.
//RG la demande d'asile n'est possible qu'avant la date limite.
//RG le r�fugi� au d�part n'a pas d'adresse et n'est pas r�gularis�.*/

import java.util.Date;
public class Step5 extends Personne {
	//cr�ation des attributs propres � STEP5
	private Date datelimite; //date limite autorisation
	private boolean regularise;
	//-----------------------------------------------------------------------------------------------------	
	//cr�ation des getters et setters
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
	//Affiche la cha�ne de caract�re qui d�crit l'objet
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

	

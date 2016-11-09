/**STEP 5
 Classe sp�cialis�e d�finissant les personnes r�fugi�es
 Date limite autorisation induit un contr�le
 Demande Asile affiche un message "Je demande l'asile pour l'adresse (...)"
 et associe l'adresse au r�fugi� et je r�gularise mon r�fugi� boolean).
 RG sp�cifique le d�m�nagement est limit� � la ville � la ville/CP d'assignation et que le r�fugi� est d�j� r�gularis�.
 RG la demande d'asile n'est possible qu'avant la date limite.
 RG le r�fugi� au d�part n'a pas d'adresse et n'est pas r�gularis�.*/

import java.util.Date;
import java.text.SimpleDateFormat;


public class Step5 extends Personne {
	private Date datelimite;
	private Date datedujour = new Date();
	private boolean regularise = false;

	// -------------------------------------------------------------------------------------------------------
	public Date getDatelimite() {
		return datelimite;
	}

	public boolean setDatelimite(Date datelimite) {
		this.datelimite = datelimite;
		return regularise;
	}

	public Date getDatedujour() {
		return datedujour;
	}

	public void setDatedujour(Date datedujour) {
		this.datedujour = datedujour;
	}

	public boolean isRegularise() {
		return regularise;
	}

	public void setRegularise(boolean regularise) {
		this.regularise = regularise;
	}

	// -----------------------------------------------------------------------------------------------------------
	// Affiche la cha�ne de caract�re qui d�crit l'objet
	@Override
	public String toString() {
		return "Step5 [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", femme=" + femme + " , + adresse=" + adresse + " ]";
	}

	// Constructeurs

		public Step5(String prenom, String nom, int age, boolean femme,
				Date datelimite, boolean regularise) {
			super(prenom, nom, age, femme);
			this.datelimite = datelimite;
			this.regularise= regularise;
				
	}
    //------------------------------------------------------------------------------------------------------------------------   		
		// Appel des methodes de la classe mere
		@Override
		public void Identifie (String prenom, String nom) {
			//Tests pour comparer datelimite et regularise
			
		}

		@Override
		public void Demenage(Adresse nvlleadresse) {
			//TODO test sur code postal pour valider la demande
			System.out.println("Je demande l'asile pour :" + nvlleadresse);
			this.adresse = nvlleadresse;
		}
			

	
}

// --------------------------------------------------------------------------------------------------------


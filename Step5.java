/**STEP 5
 Classe spécialisée définissant les personnes réfugiées
 Date limite autorisation induit un contrôle
 Demande Asile affiche un message "Je demande l'asile pour l'adresse (...)"
 et associe l'adresse au réfugié et je régularise mon réfugié boolean).
 RG spécifique le déménagement est limité à la ville à la ville/CP d'assignation et que le réfugié est déjà régularisé.
 RG la demande d'asile n'est possible qu'avant la date limite.
 RG le réfugié au départ n'a pas d'adresse et n'est pas régularisé.*/

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
	// Affiche la chaîne de caractère qui décrit l'objet
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


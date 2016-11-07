
public class Etatcivil {

	public static void main(String[] args) {
		//Créer une personne  
        Personne stephane = new Personne("Stéphane", "LEVASSEUR", 57, "Cherbourg", false);
        System.out.println(stephane);
        stephane.setPrenom("Stéphane,Bernard");
        stephane.setFemme(false);
        stephane.setNomville("Nantes");
        System.out.println(stephane);
	    
	}
}

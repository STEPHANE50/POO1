
public class Etatcivil {

	public static void main(String[] args) {
		//Cr�er une personne  
        Personne stephane = new Personne("St�phane", "LEVASSEUR", 57, "Cherbourg", false);
        System.out.println(stephane);
        stephane.setPrenom("St�phane,Bernard");
        stephane.setFemme(false);
        stephane.setNomville("Nantes");
        System.out.println(stephane);
	    
	}
}

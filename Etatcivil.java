
public class Etatcivil {

	public static void main(String[] args) {
		//Cr�er une personne  
        Personne stephane = new Personne("St�phane", "LEVASSEUR", 57, false);
        System.out.println(stephane);
        //Modifer une personne
        stephane.setPrenom("St�phane,Bernard");
        stephane.setFemme(false);
        System.out.println(stephane);
		
        //Cr�er une adresse
        Adresse adresse = new Adresse(15 ,"rue des Bastions",50100,"Cherbourg");
        System.out.println(adresse);
        //Modifier une adresse
        adresse.setNumrue(32);
        adresse.setNomvoie("rue des Colibris");
        adresse.setCodepostal(50110);
        adresse.setVille("Tourlaville");
        System.out.println(adresse);
	}
}
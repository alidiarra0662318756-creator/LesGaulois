package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int habitant;
	private Gaulois chef;
	private String[] villageois;
	
	public Village(String nom, int habitant, Gaulois gaulois) {
		this.chef= gaulois;
		this.nom = nom;
		this.villageois = new String[habitant];
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public String getNom() {
		return nom;
	}
	
}

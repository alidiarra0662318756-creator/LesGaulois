package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 8);
		System.out.print(asterix);
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	public String toString() {
		return nom;
	}
	
	public void frapper (Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom+" envoie un grand coup a la machoire de "+ nomRomain);
		int forceCoup= force/3;
		romain.recevoirCoup(forceCoup);
	}
	
}

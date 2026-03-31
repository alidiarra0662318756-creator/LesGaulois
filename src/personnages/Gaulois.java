package personnages;

import objets.Equipement;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	/*private int force;*/
	private int force;
	private int  nbTrophees;
	private Equipement[] trophees = new Equipement[100];
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
	
	/*private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}*/

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
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

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		trophees = romain.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	/*public String toString() {
		return nom;
	}*/
	
	/*public void frapper (Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom+" envoie un grand coup a la machoire de "+ nomRomain);
		int forceCoup= force/3;
		romain.recevoirCoup(forceCoup);
	}*/
	
}

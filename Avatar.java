package polymock;


import java.util.Random;

public class Avatar {
	//******************attributs*********************************
	private String name;
	private int attaque;
	private int defense;
	private int capture;
	private int zone;
	private int vie;
	private int critique;
	private int hauteur;
	private int largeur;
	private boolean degat;
	
	
	//******************constructeur******************************
	
	public Avatar(String pname) {
		name = pname;
		Random nb = new Random();
		attaque = 25 + nb.nextInt(80-25);
		defense = 25 + nb.nextInt(80-25);
		capture = 25 + nb.nextInt(80-25);
		hauteur = 0;
		largeur = 0;
		zone = 1;
		vie = 10+nb.nextInt(15-10);
		critique = 1+nb.nextInt(15-1);
		degat = false;
		
	}
	
	//******************getter/accesseur************************************
	public String getName() {
		return name;
	}
	public int getAttaque() {
		return attaque;
	}
	public int getDefense() {
		return defense;
	}
	public int getCapture() {
		return capture;
	}
	public int getZone() {
		return zone;
	}
	public int getVie() {
		return vie;
	}
	public int getCritique() {
		return critique;
	}
	public int getHauteur() {
		return hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	public boolean getDegat() {
		return degat;
	}
	
	//******************setter/mutateur************************************
	public void setName(String pName) {
		name = pName;
	}
	public void setAttaque(int pAttaque) {
		attaque = pAttaque;
	}
	public void setDefense(int pDefense) {
		defense = pDefense;
	}
	public void setCapture(int pCapture) {
		capture = pCapture;
	}	
	public void setZone(int pZone) {
		zone = pZone;
	}
	public void setVie(int pVie) {
		vie = pVie;
	}
	public void setCrittique(int pCritique) {
		critique = pCritique;
	}
	public void setHauteur(int pHauteur) {
		hauteur = pHauteur;
	}
	public void setLargeur(int pLargeur) {
		largeur = pLargeur;
	}
	public void setDegat(boolean pDegat) {
		degat = pDegat;
	}
	//******************methodes**********************************
	
	public void combat(Avatar a1) {
		Random dés = new Random();
		int lancer = dés.nextInt(100);
		
		if (lancer<05) {
			System.out.println(this.name+" une attaque critique quel artiste !!!!");
			this.degat = true;
			a1.vie = a1.vie - 8;
			
		}
		else if (lancer>05 && lancer<attaque) {
			System.out.println(this.name+" attaque réussit ! ");
			this.degat = true;
			a1.vie = a1.vie - 2;
		}
		else {
			System.out.println(this.name+" c'est raté ");
			this.degat = false;
		}
	}
	public void deplacement(int pHa , int pLa) {
		hauteur = hauteur+pHa;
		largeur = largeur+pLa;
	}
	public void info() {
		System.out.println(" \n Nom= "+name+
							"\n attaque= "+attaque+
							"\n defense= "+defense+
							"\n capture= "+capture+
							"\n zone= "+zone+
							"\n vie= "+vie+
							"\n critique= "+critique);
							
	}
	
	

}

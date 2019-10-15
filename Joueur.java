package polymock;

import java.util.Scanner;

public class Joueur {
	//******************attributs*************************
	private String joueurName;
	private int score;
	private int experience;
	private boolean etat;
	private Avatar attaquant;
		
	//*****************constructeur**********************
	public Joueur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez le nom du nouveau joueur :");
		joueurName = sc.nextLine();
		score = 0;
		experience = 0;
		etat = false;
	}
	
	//******************getteur/accesseur*****************
	public String getJoueurName() {
		return joueurName;
	}
	public int getScore() {
		return score;
	}
	public int getExperience() {
		return experience;
	}
	public boolean getEtat() {
		return etat;
	}
	public Avatar getAttaquant() {
		return attaquant;
	}
	
	//*****************setteur/mutateur****************
	public void setJoueurName(String pJoueurName) {
		joueurName = pJoueurName;
	}
	public void setScore(int pScore) {
		score = pScore;
	}
	public void setExperience(int pExperience) {
		experience = pExperience;
	}
	public void setEtat(boolean pEtat) {
		etat = pEtat;
	}
	
	//***************methodes***************************
	public void info() {
		System.out.println("le joueur : "+joueurName+" a un score de : "+score+" points et une experience de "+experience);
	
	}
	public void createAvatar() {
		Scanner sc = new Scanner(System.in);
		System.out.println(joueurName+"ventrez le nom de votre avatar:");
		String avatarName = sc.nextLine();
		this.attaquant = new Avatar(avatarName);
		
	}
	
}

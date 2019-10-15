package polymock;

import java.util.Scanner;

public class Partie {
	//******************attributs***********************
	private int difficulte;
	private boolean etat;
	
	//****************constructeur*************************
	public Partie(int pDifficulte) {
		difficulte = pDifficulte;
		etat = true;
			
	}
	//*****************getteur/accesseur***************
	public int getDifficulte() {
		return difficulte;
	}
	public boolean getEtat() {
		return etat;
	}
	//****************setteur/mutateur*******************
	public void setDifficulte(int pDifficulte) {
		difficulte = pDifficulte;
	}
	public void setEtat(boolean pEtat) {
		etat = pEtat;
	}
	//***************methodes****************************
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("voulez vous Commencez une partie ? (y/n)");
		char rep = sc.nextLine().charAt(0);	
		System.out.println(rep);
		
		if (rep == 'y')	
		{
			System.out.println("la partie commence !!!");
			Joueur player1 = new Joueur();
			Joueur player2 = new Joueur();
			Plateau damier = new Plateau();
			player1.createAvatar();
			Avatar avatar1 = player1.getAttaquant();
			player2.createAvatar();
			Avatar avatar2 = player2.getAttaquant();
			System.out.println("le Monde de "+player1.getJoueurName()+" sera defendu par "+avatar1.getName());
			System.out.println("le Monde de "+player2.getJoueurName()+" sera defendu par "+avatar2.getName());
			avatar1.info();
			avatar2.info();
		}			
		else {
			System.out.println("merci et aurevoir !!!");
		}			
				
	}
	
	
	

}

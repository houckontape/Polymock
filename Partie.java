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
		//System.out.println(rep);
		
		while (rep == 'y')	
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
			
			//boucle du jeu 
			player1.setEtat(true);
			//while vie avatr1>0 et vie avatar2>0
			while (avatar1.getVie()>0 && avatar2.getVie()>0) {
				//System.out.println("debut de la boucle");
				//break;
				if(player1.getEtat()){
					System.out.println(player1.getJoueurName()+"entrez : attaque entrer a deplacement d ?");
					char choix=sc.nextLine().charAt(0);
					switch (choix)
					{
					case 'a':
						avatar1.combat(avatar2);
						System.out.println("point de vie de"+avatar2.getName()+" "+avatar2.getVie());
						player1.setEtat(false);
						break;
					case 'd':
						System.out.println("vous bougez");
					}
				}
				else {
					System.out.println(player2.getJoueurName()+"entrez : attaque entrer a deplacement d ?");
					char choix=sc.nextLine().charAt(0);
					switch (choix)
					{
					case 'a':
						avatar2.combat(avatar1);
						System.out.println("point de vie de"+avatar1.getName()+" "+avatar1.getVie());
						player1.setEtat(true);
						break;
					case 'd':
						System.out.println("vous bougez");
					}
				}
			}
			if (avatar1.getVie()<= 0) {
				System.out.println(player1.getJoueurName()+" votre avatar vient de perir");
			}
			else{
				System.out.println(player2.getJoueurName()+" votre bien aimé "+avatar2.getName()+"vient de s'eteindre ");
			}
			
			System.out.println("voulez-vous rejouez? (y/n)");
			rep = sc.nextLine().charAt(0);
				
		}			
		
		System.out.println("merci et aurevoir !!!");
		
		
				
	}
	
	
	

}

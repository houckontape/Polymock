package polymock;

import java.util.ArrayList;

public class Plateau {
	//****************attribut*******************
	private int socle[][]= new int [9][9];
	//****************constructeur***************
	public Plateau() {
		for (int i=0; i<9 ; i++) {
			for (int j=0; j<9 ; j++) {
				socle[i][j]= 0 ;
			}
		}		
	}
	//****************getteur//accesseur************
	public void getSocle() {
		for (int i=0; i<9 ; i++) {
			for (int j=0; j<9 ; j++) {
				System.out.println("pour la ligne "+i+" et la colone "+j+" vaut "+socle[i][j]);
			}
		}
				
	}
	public int getCase(int i, int j) {
		return socle[i][j];
	}
}
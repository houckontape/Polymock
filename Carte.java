package polymock;

public class Carte {
	//**************attributs***************************
	private String name;
	private String affinite;
	private int bonus;
	
	//**************constructeur*************************
	public Carte(String pName,String pAffinite, int pBonus ) {
		name = pName;
		affinite = pAffinite;
		bonus = pBonus;		
	}
	//**************getteur/accesseur********************
	public String getName() {
		return name;
	}
	public String getAffinite() {
		return affinite;
	}
	public int getBonus() {
		return bonus;
	}	
	//**************setteur/mutateur*********************
	public void setName(String pName) {
		name = pName;
	}
	public void setAffinite(String pAffinite) {
		affinite = pAffinite;
	}
	public void setBonus (int pBonus) {
		bonus = pBonus;
	}	
	//**************methodes*****************************
	
	

}

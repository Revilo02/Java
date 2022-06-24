package Kaszino;

public class Nyuszi extends Jatekos{
	private String szin;
	public Nyuszi(String s) {
		this.szin=s;
	}
	public String toString() {return szin;}
	public void lep() {
		System.out.println(asztal.getKor());
		System.out.println(this.toString());
		if(asztal.getTet()<50) {
			asztal.emel(5);
		}
		else {
			System.out.println("Tyûha");
		}
	}

}
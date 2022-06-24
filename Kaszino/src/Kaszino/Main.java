package Kaszino;

public class Main {
	public static void main(String[] args) {
		Asztal ujasztal=new Asztal();
		Kezdo j1=new Kezdo("Béla");
		Robot j2=new Robot();
		Robot j3=new Robot();
		j1.setAsztal(ujasztal);
		j2.setAsztal(ujasztal);
		j3.setAsztal(ujasztal);
		
		ujasztal.Addjatekos(j1);
		ujasztal.Addjatekos(j2);
		ujasztal.Addjatekos(j3);

		ujasztal.ujJatek();
		for(int i=0;i<10;i++) {
			ujasztal.kor();
		}
	}
}

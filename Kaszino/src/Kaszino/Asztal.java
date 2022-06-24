package Kaszino;
import java.util.Random;



import java.util.ArrayList;
public class Asztal {
	private ArrayList<Jatekos> Jatekosok=new ArrayList<Jatekos>(); 
	private double tet;
	private int kor ;
	private double goal;
	
	public void ujJatek() {
		tet=0;
		kor=0;
		Random rand = new Random();
		this.goal=rand.nextDouble(101);
		
		
	}
	public  void Addjatekos(Jatekos j) {
		Jatekosok.add(j);
		
	}
	public void kor() {
		for(int i=0;i<Jatekosok.size();i++) {
			Jatekosok.get(i).lep();
			System.out.println(i+".jatekos");
		
		}
		kor++ ;
	}
	public int getKor() {return kor;}
	public double getTet() {return this.tet;}
	public void emel(double d) {tet=tet+d; }
	
}

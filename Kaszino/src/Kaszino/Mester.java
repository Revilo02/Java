	package Kaszino;

import java.util.Scanner;

public class Mester extends Jatekos {
	private  int fokozat;
	public Mester(int f) {
		fokozat=f;
	}
	public int getFokozat(){ return fokozat;}
	public String toString() {return "Mester "+fokozat;}
	public void lep() {
		System.out.println(asztal.getKor());
		System.out.println(asztal.getTet());
		System.out.println(this.toString());
		asztal.emel(asztal.getTet()/100*this.getFokozat());
		
	}
}

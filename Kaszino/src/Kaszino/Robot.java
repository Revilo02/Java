package Kaszino;

import java.util.Random;

public class Robot extends Jatekos{
	private String name;
	private int ID;
	private static int IDn�vekszik;
	public Robot() {
		this.name="Robot";
		ID=++IDn�vekszik;
	}
	public String toString() {
		return name+""+ID;
	}
	public void lep() {
		System.out.println(this.toString());
		System.out.println(asztal.getKor());
		Random s=new Random();
		double sa=s.nextDouble(10);
		asztal.emel(sa);
		System.out.println(asztal.getTet());
		
	}
}

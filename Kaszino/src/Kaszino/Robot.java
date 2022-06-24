package Kaszino;

import java.util.Random;

public class Robot extends Jatekos{
	private String name;
	private int ID;
	private static int IDnövekszik;
	public Robot() {
		this.name="Robot";
		ID=++IDnövekszik;
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

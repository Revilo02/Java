package Kaszino;
import java.util.Scanner;
public class Ember extends Jatekos {
	private String name;
	public Ember(String n) {
		this.name=n;
	}
	public String toString() {return name;}
	public void lep() {
		Scanner sc=new Scanner(System.in);
		double emelés=sc.nextDouble();
		System.out.println(asztal.getKor());
		
		sc.close();
	}
}

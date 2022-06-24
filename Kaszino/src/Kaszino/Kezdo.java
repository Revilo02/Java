package Kaszino;

import java.util.Scanner;
import java.util.Random;
public class Kezdo extends Jatekos{
	String name;
	public Kezdo(String name) {
		this.name=name;
	}
	
	public String toString() {return this.name;}
	public void lep() {
		Scanner sc=new Scanner(System.in);
		System.out.println(this.toString());
		System.out.println(asztal.getKor());
		System.out.println("Ha nem kíván emelni írjon 0-t tétnek");
		Random s=new Random();
		double sa=s.nextDouble(6);
		asztal.emel(sa);
		System.out.println(asztal.getTet());
		sc.close();
		
	}
}

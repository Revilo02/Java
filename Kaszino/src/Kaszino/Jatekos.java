package Kaszino;
import java.util.*;
public abstract class Jatekos {
	protected Asztal asztal;
	public void setAsztal(Asztal a) {
		this.asztal=a;
	}
	public void lep() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(asztal.getKor());
		double s=sc.nextDouble();
		asztal.emel(s);
		System.out.println(asztal.getTet());
		sc.close();
		
	}
}

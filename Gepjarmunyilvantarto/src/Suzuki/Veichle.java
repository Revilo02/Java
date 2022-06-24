package Suzuki;

import java.util.* ;
public class Veichle {
	private int made;
	private String rendszam;
	private String type;
	private Person Owner;
	public Veichle(String tip ,String rszam,int gyev){
		made=gyev;
		rendszam=rszam;
		type=tip;
	}
	public Veichle(String tip,String rszam){
		made=0;
		rendszam=rszam;
		type=tip;
	}
	public String getRendszam() {return rendszam;}
	public int getMade() {return made;}
	public String getType() {return type;}
    public void setOwner(Person o) { Owner =o;}
	public Person getOwner() {return Owner;}

	public String toString() {
		String s=type+" "+rendszam+" "+made+"";
		return s;
		
	}
	static public int oldCars(ArrayList<Veichle> l,int t) {
		int db=0;
		for(int i=0;i<l.size();i++) {
			if(l.get(i).made==t) {
				db++;
			}
		}
		return db;
		
	}

}

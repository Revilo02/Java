package Suzuki;

import java.util.ArrayList;



public class Person {
	private int szulev;
	private String nev;
	private String  lakcim;
	private ArrayList<Veichle> cars=new ArrayList<Veichle>(); 
	Person(String name,String lakhely,int birth){
		szulev=birth;
		nev=name;
		lakcim=lakhely;
		
	}
	public int getSzulev() {return szulev;}
	public String getNev() {return nev;}
	public String getLakcim() {return lakcim; }
	public String toString() {return nev+" "+szulev+" "+lakcim;}
	public Person getPerson(Person p) {return p;}
	public void AddCar(Veichle v) {
		Veichle v1=new Veichle("Suzuki","JZC-068",1995 );
		cars.add(v1);
	
	}	
				
	
	public void ListCars()
	{
		for(int i=0; i<cars.size();i++) {
			System.out.print(cars.get(i)+" ");
		}
		System.out.println();
	}
	public void RemoveCar(String Platenum)throws Exception
	{
		for(int i=0;i<cars.size();i++) {
			if(cars.get(i).getRendszam().equals(Platenum))
			{	
				cars.get(i).setOwner(null);
				cars.remove(i);
				return;
			}
		}
		throw new Exception("hibás rendszám");
	}
	/*public ArrayList<Veichle> getCars() {
		return cars;
	}
	*/
	
	 static public void oldOwners(ArrayList<Person> p,int t) {
		int db=0;
	
		for(int i=0;i<p.size();i++)
			{
				for(int j=0;j<p.get(i).cars.size();j++) {
					if(p.get(i).cars.get(i).getMade()<2022-t) {
					   db++;
					   
					}
			
			}
		
			}	
		System.out.println(db);
	 }
	 
	}
	
	
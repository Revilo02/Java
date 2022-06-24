package Suzuki;
import java.util.*;
public class Main {
	static public void main(String[] args) {
		Person p1=new Person("László Olivér","2768,Újszilvás Mátyás Király utca 44/b",2002);
		Person p2=new Person("László Napsugár","2768,Újszilvás Mátyás Király utca 44/b",2007);
		Veichle v1=new Veichle("Suzuki","JZC-068",1995 );
		Veichle v2=new Veichle("Fiat","GVK-954",1989 );
		p2.AddCar(v2);
		v1.setOwner(p2);
		ArrayList<Person> embik=new ArrayList<Person>();
		embik.add(p2);
		embik.add(p1);
		ArrayList<Veichle>occokocsik=new ArrayList<Veichle>();
		occokocsik.add(v1);
		occokocsik.add(v2);
		try
		{p2.RemoveCar("SAJTBUR");
		
		}catch (Exception e) {
		System.err.println(e.getMessage());
		e.printStackTrace();}
		p2.ListCars();
		p1.oldOwners(embik, 0);	
	
		System.out.println(p1);
		System.out.println(v1.getOwner());
	}
}

package libraryregistry;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class Menu {
	
	static ArrayList<Book> books = new ArrayList<Book>();
	static ArrayList<Reader> profiles = new ArrayList<Reader>();
	
	//protected static void add(String[] sor) {
	//	double szazalek = Double.parseDouble(sor[3]);
	//	valasztek.add(new Beer(sor[1],sor[2],szazalek));
	//}
	
	//protected static void list(String[] line) {
	//	if(sor[1].equals("name")){
	//		Collections.sort(valasztek, new NameComparator());
	//	}else if(sor[1].equals("style")){
	//		Collections.sort(valasztek, new StyleComparator());
	//	}else if(sor[1].equals("strength")){
	//		Collections.sort(valasztek, new StrenghtComparator());
	//	}else {
	//		System.out.println("Nincs ilyen kateg�ria");
	//	}
	//	
	//	for (int i = 0; i <valasztek.size(); i++) {
	//		System.out.println(valasztek.get(i));
	//		}
	//}
	
	static public void main(String[] args) {
		Book b1 = new Book("George Orwell", "1984", "reg�ny", 1949);
		Book b2 = new Book("Mad�ch Imre","Az ember trag�di�ja","dr�ma", 1980);
		
		Reader r1 = new Reader("Szeifert N�ri", "ABCD12", 1996);
		Reader r2 = new Reader("Kov�cs B�la", "DCBA21", 1994);
		
		System.out.println(b1); 
		System.out.println(b2);
		
		System.out.println(r1);
		System.out.println(r2);
		
		books.add(b1);
		books.add(b2);
		profiles.add(r1);
		profiles.add(r2);
		
		System.out.println("1 K�nyvek\n2 Olvas�k\n3 Kil�p�s �s ment�s");
		
		Scanner input = new Scanner(System.in);
		String l = input.nextLine();
		String[] line = l.split(" ");
		
		while(!line[0].equals("3")) {
			if(line[0].equals("1")) {
				System.out.println("11 K�nyv keres�se\n12 �j k�nyv hozz�ad�sa\n00 Vissza");
				//ide ha be�rom a printbe hogy 3-kil�p ment�s?
				
				
			}else if(line[0].equals("2")) {
				System.out.println("21 Olvas� keres�se\\n12 �j olvas� regisztr�l�sa\n00 Vissza");
			}else {
				System.err.println("Error");
			}
			l = input.nextLine();
			line = l.split(" ");
		}
		input.close();
	}
}

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
	//		System.out.println("Nincs ilyen kategória");
	//	}
	//	
	//	for (int i = 0; i <valasztek.size(); i++) {
	//		System.out.println(valasztek.get(i));
	//		}
	//}
	
	static public void main(String[] args) {
		Book b1 = new Book("George Orwell", "1984", "regény", 1949);
		Book b2 = new Book("Madách Imre","Az ember tragédiája","dráma", 1980);
		
		Reader r1 = new Reader("Szeifert Nóri", "ABCD12", 1996);
		Reader r2 = new Reader("Kovács Béla", "DCBA21", 1994);
		
		System.out.println(b1); 
		System.out.println(b2);
		
		System.out.println(r1);
		System.out.println(r2);
		
		books.add(b1);
		books.add(b2);
		profiles.add(r1);
		profiles.add(r2);
		
		System.out.println("1 Könyvek\n2 Olvasók\n3 Kilépés és mentés");
		
		Scanner input = new Scanner(System.in);
		String l = input.nextLine();
		String[] line = l.split(" ");
		
		while(!line[0].equals("3")) {
			if(line[0].equals("1")) {
				System.out.println("11 Könyv keresése\n12 Új könyv hozzáadása\n00 Vissza");
				//ide ha beírom a printbe hogy 3-kilép mentés?
				
				
			}else if(line[0].equals("2")) {
				System.out.println("21 Olvasó keresése\\n12 Új olvasó regisztrálása\n00 Vissza");
			}else {
				System.err.println("Error");
			}
			l = input.nextLine();
			line = l.split(" ");
		}
		input.close();
	}
}

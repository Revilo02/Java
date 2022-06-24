package libraryregistry;

import java.util.Scanner;

public class Main {
	static public void main(String[] args) {
		Book b1 = new Book("George Orwell", "1984", "regény", 1949);
		Book b2 = new Book("Madách Imre","Az ember tragédiája","dráma", 1980);
		
		Reader r1 = new Reader("Szeifert Nóri", "ABCD12", 1996);
		Reader r2 = new Reader("Kovács Béla", "DCBA21", 1994);
		
		System.out.println(b1); 
		System.out.println(b2);
		
		System.out.println(r1);
		System.out.println(r2);
	
		BookMenu.books.add(b1);
		BookMenu.books.add(b2);
		BookMenu.profiles.add(r1);
		BookMenu.profiles.add(r2);
		ReaderMenu.dataOfReader() ;
		System.out.println(BookMenu.profiles.size());
		System.out.println(BookMenu.profiles.get(0));
		System.out.println("1 Könyvek\n2 Olvasók\n3 Kilépés és mentés");
		
		Scanner input = new Scanner(System.in);
		String l = input.nextLine();
	
		while(!l.equals("3")) {
			//System.out.println("1 Könyvek\n2 Olvasók\n3 Kilépés és mentés");
			if(l.equals("1")) {
				System.out.println("11 Könyv keresése\n12 Új könyv hozzáadása\n00 Vissza");
				String l1 = input.nextLine();
				while(true){
					if(l1.equals("11")) {
						BookMenu.modifyBook();
						//mentés
						break;
					}else if(l1.equals("12")) {
						BookMenu.newBook();
						//mentés
						break;
					}else if(l1.equals("00")) {
						break;
					}else {
						System.err.println("Nincs ilyen menüpont. Próbálja újra");
						l1 = input.nextLine();
					}
					
				}
				//ide ha beírom a printbe hogy 3-kilép mentés?
				
			}else if(l.equals("2")) {
				System.out.println("21 Olvasó keresése\\n12 Új olvasó regisztrálása\n00 Vissza");
			}else {
				System.err.println("Nincs ilyen menüpont.");
			}
			System.out.println("1 Könyvek\n2 Olvasók\n3 Kilépés és mentés");
			l = input.nextLine();
		}
		input.close();
	}

}

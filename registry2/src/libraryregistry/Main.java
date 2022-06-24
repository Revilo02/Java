package libraryregistry;

import java.util.Scanner;

public class Main {
	static public void main(String[] args) {
		Book b1 = new Book("George Orwell", "1984", "reg�ny", 1949);
		Book b2 = new Book("Mad�ch Imre","Az ember trag�di�ja","dr�ma", 1980);
		
		Reader r1 = new Reader("Szeifert N�ri", "ABCD12", 1996);
		Reader r2 = new Reader("Kov�cs B�la", "DCBA21", 1994);
		
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
		System.out.println("1 K�nyvek\n2 Olvas�k\n3 Kil�p�s �s ment�s");
		
		Scanner input = new Scanner(System.in);
		String l = input.nextLine();
	
		while(!l.equals("3")) {
			//System.out.println("1 K�nyvek\n2 Olvas�k\n3 Kil�p�s �s ment�s");
			if(l.equals("1")) {
				System.out.println("11 K�nyv keres�se\n12 �j k�nyv hozz�ad�sa\n00 Vissza");
				String l1 = input.nextLine();
				while(true){
					if(l1.equals("11")) {
						BookMenu.modifyBook();
						//ment�s
						break;
					}else if(l1.equals("12")) {
						BookMenu.newBook();
						//ment�s
						break;
					}else if(l1.equals("00")) {
						break;
					}else {
						System.err.println("Nincs ilyen men�pont. Pr�b�lja �jra");
						l1 = input.nextLine();
					}
					
				}
				//ide ha be�rom a printbe hogy 3-kil�p ment�s?
				
			}else if(l.equals("2")) {
				System.out.println("21 Olvas� keres�se\\n12 �j olvas� regisztr�l�sa\n00 Vissza");
			}else {
				System.err.println("Nincs ilyen men�pont.");
			}
			System.out.println("1 K�nyvek\n2 Olvas�k\n3 Kil�p�s �s ment�s");
			l = input.nextLine();
		}
		input.close();
	}

}

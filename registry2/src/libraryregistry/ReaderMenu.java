package libraryregistry;
import java.util.Scanner;

public class ReaderMenu extends FilesIO{
	
	public static Reader searchReader() throws ReaderNotFoundException {
		System.out.println("Írja be mi alapján szeretne keresni, enter nyomása után egybõl a keresett nevet/évet/személyiszámot(nagybetûvel pl:ABCD12),\nmajd a felsoroltak közül válassza ki a keresett profil sorszámát a további lépésekhez.\n0.Név alapján\n1 Születési év alapján\n2 Személyiszám alapján keresés");
		int n = -1;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		while(true) {
			if(s.equals("0")) {
				try{
					n = searchReaderName();
				}
				catch(ReaderNotFoundException e) {
					break;
				}
				
				break;
			}else if(s.equals("1")) {
				try{
					n = searchReaderYob();
				}
				catch(ReaderNotFoundException e) {
					break;
				}
				
				break;
			}else if(s.equals("2")) {
				try{
					n = searchReaderID();
				}
				catch(ReaderNotFoundException e) {
					break;
				}
				
				break;
			}else {
				System.err.println("Nincs ilyen lehetõség. Próbálja újra");
			}
			s = input.nextLine();
		}
		if(n == -1) {
			throw new ReaderNotFoundException();
		}else {
			return profiles.get(n);
		}
	}
	
	public static int searchReaderName() throws ReaderNotFoundException{
		int osszes = 0;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();						//
		for (int i = 0; i < profiles.size(); i++) {
			if (profiles.get(i).getName().contains(s)) {
				System.out.println(i+". "+profiles.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			throw new ReaderNotFoundException();
		}
		int n = input.nextInt();
		
		if(n>profiles.size()-1) {
			throw new ReaderNotFoundException();
		}
		if(!profiles.get(n).getName().contains(s)) {
			throw new ReaderNotFoundException();
		}
		
		System.out.println(n);
		return n;
	}
	
	public static int searchReaderYob() throws ReaderNotFoundException{
		int osszes = 0;
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();								//kell hibakezelés ha nem számot ad be
		for (int i = 0; i < profiles.size(); i++) {
			if (profiles.get(i).getYob() == s) {
				System.out.println(i+". "+profiles.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			throw new ReaderNotFoundException();
		}
		int n = input.nextInt();
		
		if(n>profiles.size()-1) {
			throw new ReaderNotFoundException();
		}
		if(profiles.get(n).getYob() != s) {
			throw new ReaderNotFoundException();
		}
		
		System.out.println(n);
		return n;
	}
	
	public static int searchReaderID() throws ReaderNotFoundException{
		int osszes = 0;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		for (int i = 0; i < profiles.size(); i++) {
			if (profiles.get(i).getID().equals(s)) {
				System.out.println(i+". "+profiles.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			throw new ReaderNotFoundException();
		}
		int n = input.nextInt();
		
		if(n>profiles.size()-1) {
			throw new ReaderNotFoundException();
		}
		if(!profiles.get(n).getID().equals(s)) {
			throw new ReaderNotFoundException();
		}
		
		System.out.println(n);
		return n;
	}
	
	public static void dataOfReader() {
		Scanner input = new Scanner(System.in);
		try{
			Reader r = searchReader();
			while(true) {
				System.out.println("2111 Olvasó adatai és könyvei\n2112 Profil törlése\n000 Vissza");
				String s = input.nextLine();
				if(s.equals("2111")) {
					booksOfReader(r);
					break;
		
				}else if(s.equals("2112")) {
					
						deleteReader(r);
					
					break;
		
				}else if(s.equals("000")) {
					break;
				}else {
					//hiba
				}
			}
		}
		catch(ReaderNotFoundException e) {
			System.err.println(e.getMessage());
			return;
		}
	}
	
	public static void booksOfReader(Reader r){
		System.out.println(r);
		int osszes = 0;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getOwner().equals(r.getID())) {
				System.out.println(books.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			System.out.println("Nincsenek kölcsönzött könyvei");
		}
		
	}
	
	public static void deleteReader(Reader r) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getOwner().equals(r.getID())) {
				books.get(i).setOwner("free");
			}
		profiles.remove(r);
		System.out.println("Sikeres törlés");
		}
	}
	
}

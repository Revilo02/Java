package libraryregistry;
import java.util.Scanner;

public class ReaderMenu extends FilesIO{
	
	public static Reader searchReader() throws ReaderNotFoundException {
		System.out.println("�rja be mi alapj�n szeretne keresni, enter nyom�sa ut�n egyb�l a keresett nevet/�vet/szem�lyisz�mot(nagybet�vel pl:ABCD12),\nmajd a felsoroltak k�z�l v�lassza ki a keresett profil sorsz�m�t a tov�bbi l�p�sekhez.\n0.N�v alapj�n\n1 Sz�let�si �v alapj�n\n2 Szem�lyisz�m alapj�n keres�s");
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
				System.err.println("Nincs ilyen lehet�s�g. Pr�b�lja �jra");
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
		int s = input.nextInt();								//kell hibakezel�s ha nem sz�mot ad be
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
				System.out.println("2111 Olvas� adatai �s k�nyvei\n2112 Profil t�rl�se\n000 Vissza");
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
			System.out.println("Nincsenek k�lcs�nz�tt k�nyvei");
		}
		
	}
	
	public static void deleteReader(Reader r) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getOwner().equals(r.getID())) {
				books.get(i).setOwner("free");
			}
		profiles.remove(r);
		System.out.println("Sikeres t�rl�s");
		}
	}
	
}

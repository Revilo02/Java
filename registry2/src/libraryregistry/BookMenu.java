package libraryregistry;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu extends FilesIO{
	
	public static Book searchBookBase() throws BookNotFoundException {
		System.out.println("Írja be mi alapján szeretne keresni, enter nyomása után egybõl a keresett nevet/szót/évet,\nmajd a felsoroltak közül válassza ki a keresett könyv számát a további lépésekhez.\n0.Író alapján\n1 Cím alapján\n2 Kiadási év alapján keresés");
		int n = -1;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		while(true) {
			if(s.equals("0")) {
				try{
					n = searchBookWriter();
				}
				catch(BookNotFoundException e) {
					break;
				}
				
				break;
			}else if(s.equals("1")) {
				try{
					n = searchBookTitle();
				}
				catch(BookNotFoundException e) {
					break;
				}
				
				break;
			}else if(s.equals("2")) {
				try{
					n = searchBookRelyear();
				}
				catch(BookNotFoundException e) {
					break;
				}
				
				break;
			}else {
				System.err.println("Nincs ilyen lehetõség. Próbálja újra");
			}
			s = input.nextLine();
		}
		if(n == -1) {
			throw new BookNotFoundException();
		}else {
			return books.get(n);
		}
	}
	
	
	public static int searchBookWriter() throws BookNotFoundException{
		int osszes = 0;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();						//
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getWriter().contains(s)) {
				System.out.println(i+". "+books.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			throw new BookNotFoundException();
		}
		int n = input.nextInt();
		
		if(n>books.size()-1) {
			throw new BookNotFoundException();
		}
		if(!books.get(n).getWriter().contains(s)) {
			throw new BookNotFoundException();
		}
		
		System.out.println(n);
		return n;
	}
	
	public static int searchBookTitle() throws BookNotFoundException{
		int osszes = 0;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();						//
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().contains(s)) {
				System.out.println(i+". "+books.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			throw new BookNotFoundException();
		}
		int n = input.nextInt();
		
		if(n>books.size()-1){
			throw new BookNotFoundException();
		}
		if(!books.get(n).getTitle().contains(s)) {
			throw new BookNotFoundException();
		}
		
		System.out.println(n);
		return n;
	}
	
	public static int searchBookRelyear() throws BookNotFoundException{
		int osszes = 0;
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();								//kell hibakezelés ha nem számot ad be
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getRelyear()== s) {
				System.out.println(i+". "+books.get(i));
				osszes +=1;
			}
		}
		if(osszes == 0) {
			throw new BookNotFoundException();
		}
		int n = input.nextInt();
		
		if(n>books.size()-1) {
			throw new BookNotFoundException();
		}
		if(books.get(n).getRelyear() != s) {
			throw new BookNotFoundException();
		}
		
		System.out.println(n);
		return n;
	}
	
	public static void modifyBook() {
		Scanner input = new Scanner(System.in);
		try{
			Book b = searchBookBase();
			if(b.getOwner().equals("free")) {
				while(true) {
					System.out.println("1110 Könyv kölcsönzése\n1111 Könyv adatainak módosítása\n1112 Könyv törlése\n000 Vissza");
					String s = input.nextLine();
					if(s.equals("1110")) {
						try{
							rentingBook(b);
						}
						catch(ReaderNotFoundException e) {
							System.err.println(e.getMessage());
							break;
						}
						break;
						
					}else if(s.equals("1111")) {
						try{
							modifyBookData(b);
						}
						catch(FailedModificationException e) {
							System.err.println(e.getMessage());
							break;
						}
						break;
						
					}else if(s.equals("1112")) {
						books.remove(b);
						System.out.println("Sikeres törlés");
						break;
						
					}else if(s.equals("000")) {
						break;
					}else {
						//hiba
					}
				}
				
			}else{
				while(true) {
					System.out.println("1110 Könyv visszaadása\n1111 Könyv adatainak módosítása\n1112 Könyv törlése\n000 Vissza");
					String s = input.nextLine();
					if(s.equals("1110")) {
						try{
							rentingBook(b);
						}
						catch(ReaderNotFoundException e) {
							System.err.println(e.getMessage());
							break;
						}
						break;
					}else if(s.equals("1111")) {
						try{
							modifyBookData(b);
						}
						catch(FailedModificationException e) {
							System.err.println(e.getMessage());
							break;
						}
						break;
						
					}else if(s.equals("1112")) {
						books.remove(b);
						System.out.println("Sikeres törlés");
						break;
					}else if(s.equals("000")) {
						break;
					}else {
						//hiba
					}
				}
			}
		}
		catch(BookNotFoundException e) {
			System.err.println(e.getMessage());
			return;
		}
		
	}
	
	public static void rentingBook(Book b) throws ReaderNotFoundException{
		if(b.getOwner().equals("free")) {
			Scanner input = new Scanner(System.in);
			System.out.println("Írja be a személyiszámát nagybetûkkel:");
			String num = input.nextLine();
			int x = 0;
			for(int i = 0; i<profiles.size();i++) {
				if(profiles.get(i).getID().equals(num)) {
					b.setOwner(num);
					System.out.println("Sikeres módosítás");
					return;
				}
			}
			throw new ReaderNotFoundException();
			
		}else {
			b.setOwner("free");
		}
	}
	
	public static void modifyBookData(Book b) throws FailedModificationException{
		while(true) {
			System.out.println("Írja be a mit szeretne módosítani, majd adja meg helyesen.\n0 Szerzõ\n1 Cím\n2 Kiadási év\n3 Mûfaj módosítása.\n00 Mégse.");
			Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			
			if(s.equals("0")) {
				String l = input.nextLine();
				b.setWriter(l);
				System.out.println("Sikeres módosítás");
				return;
				
			}else if(s.equals("1")) {
				String l = input.nextLine();
				b.setTitle(l);
				System.out.println("Sikeres módosítás");
				return;
				
			}else if(s.equals("2")) {
				int l = input.nextInt();				//hibakezelés ha nem évet írbe
				b.setRelyear(l);
				System.out.println("Sikeres módosítás");
				return;
				
			}else if(s.equals("3")) {
				String l = input.nextLine();
				b.setType(l);
				System.out.println("Sikeres módosítás");
				return;
				
			}else if(s.equals("00")) {
				return;
				
			}else {
				throw new FailedModificationException();
			}
		}
	}
	
	public static void newBook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Írja be enterrel elválasztva a következõ adatokat egymás után:\nSzerzõ \nCím \nMûfaj \nKiadási év");
		String a = input.nextLine();
		String b = input.nextLine();
		String c = input.nextLine();
		int d = input.nextInt();
		
		Book B = new Book(a,b,c,d);
		
		books.add(B);
		
	}
}

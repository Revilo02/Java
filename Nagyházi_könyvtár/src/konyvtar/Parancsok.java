package konyvtar;

import java.io.*;
import java.util.*;


public class Parancsok {
	
	
	
	/**
	 * 
	 * Ez a függvény azt ellenõrzi hogy az adott könyvet kivették-e már.
	 *
	 */
	public static boolean elerhetoKonyv(Konyvek k) {
		
		if (k.getKiadva()==true)
			return false;
		else return true;
	}
	/**
	 * *Kiadható 
	 * A függvény bekéri egy könyv címét közben elindít egy számlálót ha a számláló 0 lesz a ciklus végére akkor
	 * Hibát dob mert nincs találat 
	 * ha 1 vagy több találat van akkor bekér egy egész számot ami az adott könyv ID-ját jelöli, hogy ne legyen problémás hogy nem a feldobott ID-kból választ
	 * az miatt a kiadID-nak a visszatérésének feltétele hogy a könyv nevét tartalmaznia kell az adott ID-jú könyvnek
	 * , ha nincs találat akkor hibát dob a program
	 * @return 
	 *
	 */
	public static int kiadhato() throws BookNotFoundException, IDNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg a kivenni kívánt könyv címét: ");
		String kivesz=sc.nextLine();
		int kiadID=-1;
		int cnt=0;
		for(int i=0;i<Tarolo.BooksListSize();i++) {
			if(Tarolo.getBooksElement(i).getName().contains(kivesz) & elerhetoKonyv(Tarolo.getBooksElement(i))) {
				cnt++;
				System.out.println(Tarolo.getBooksElement(i));
			}
		}
		if(cnt==0)throw new BookNotFoundException(kivesz);
		else {
			System.out.println("Adja mega kivenni kívánt könyv ID-ját");
			try {
			kiadID=sc.nextInt();}
			catch (Exception e) {
				throw new IDNotFoundException(kiadID);
			}
			for(int i=0;i<Tarolo.BooksListSize();i++) {
				if(Tarolo.getBooksElement(i).getName().contains(kivesz) & elerhetoKonyv(Tarolo.getBooksElement(i)) &kiadID==Tarolo.getBooksElement(i).getID()) {
					return kiadID;
				}
			}throw new IDNotFoundException(kiadID);
		}
		
	}
	/**
	 * 
	 * A kiadott könyvek visszahozataláért felelõs ez a függvény elõször bekéri az olvasó nevét 
	 * Majd leelenõrzi hogy van-e könyv az olvasónál ha az olvasólista adattagja üres akkor hibadobódik és visszatérünk a fõmenübe
	 * ha 1 vagy több könyve van akkor kilistázza azokat és ID alapján választhat hogy melyiket törli
	 * Itt ha rossz ID-t ad meg ( rossz ID=Nem létezõ vagy nem kilistázott elemek közül ad meg ID-t)
	 * Ha Sikeres a könyvviszavétel a felhasználót egy üzenet formájában értesítjük
	 */
	public static void KonyvVisszavesz() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg az olvasónak a nevét aki könyvet hozott vissza: ");
		int sv=OlvasoSearch();
		int i=0;
		for( i=0;i<Tarolo.LatogtoListSize();i++) {
			if(Tarolo.getLatogatokElement(i).getID()==sv ) {
				
				break;
			}
	
		}
		if (Tarolo.getLatogatokElement(i).listaz().size()==0) {
			throw new NotOwnerException();
		}else {
			for(int j=0;j<Tarolo.getLatogatokElement(i).listaz().size();j++) {
				System.out.println(Tarolo.getLatogatokElement(i).listaz().get(j));
			}
			System.out.println("Adja meg a visszahozni kívánt könyv ID-ját");
			int id=sc.nextInt();
			for(int j=0;j<Tarolo.getLatogatokElement(i).listaz().size();j++) {
				if(Tarolo.getLatogatokElement(i).listaz().get(j).getID()==id) {
					Tarolo.getLatogatokElement(i).listaz().get(j).setKiadva(false);
					Tarolo.getLatogatokElement(i).listaz().remove(j);
				System.out.println("Sikeres könyv visszavétel");
				return;
				}
			}System.err.println("Sikertelen könyv visszavétel");
			
			//return;
		}
	
}
	/**
	 * 
	 *Ez a függvény akkor lép életbe ha a két segédfüggvénye a kiadhato és azelerhetõkönyv visszatér a megfelelõ visszatérési értékekkel és akkor kiadja a megfelelõ könyvet az olvasónak
	 */
	public static void KonyvKiad() throws Exception {
	
		int kiad=kiadhato();
		System.out.println("Adja meg az olvasó nevét aki ki kívánja venni a könyvet: ");
		int vevo=OlvasoSearch();
		for(int i=0;i<Tarolo.LatogtoListSize();i++) {
			if(Tarolo.getLatogatokElement(i).getID()==vevo ) {
				for(int j=0; j<Tarolo.BooksListSize();j++) {
					if(Tarolo.getBooksElement(j).getID()==kiad) {
						Tarolo.getBooksElement(j).setKiadva(true);
						Tarolo.getLatogatokElement(i).konyvadd(Tarolo.getBooksElement(j));;
						return;
				}
			}
		}
	}
}	
	
	
	
	/**
	 * Új olvasót hoz létre és menti bele az olvasókat tároló listába az adattagokat
	 */
	public static void OlvasoLetrehoz() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kérem adja meg az olvasó TELJES nevét: ");
		String nev=sc.nextLine();
		System.out.println("Kérem adja meg az olvasó elérhetõségét:");
		String elerh=sc.nextLine();
		Tarolo.addLatogato(new Latogato(nev,elerh));
		System.out.println("Olvasó sikeresen hozzáadva");
	}
	/**
	 * Olvasó kereséséért felel ha nincs találat hibát dob különben visszatér a keresett olvasó ID-jával
	 * @return Olvasót keres vagy az Olvasó ID-jával tér vissza vagy hiba dobódik
	 * @throws Exception hibadobódik ha nem találjuk  a keresett halmazon a keresett ID-jú olvasót
	 */
	static int OlvasoSearch() throws Exception {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		String nev=sc.nextLine();
		for(int i=0; i<Tarolo.LatogtoListSize();i++) {
			if(Tarolo.getLatogatokElement(i).getName().contains(nev)) {
				System.out.println(Tarolo.getLatogatokElement(i).getID()+" "+Tarolo.getLatogatokElement(i));
				cnt++;
			}
		}
		if (cnt==0) {
			throw new ReaderNotFoundException();
		}
		int id=sc.nextInt();
		for(int i=0; i<Tarolo.LatogtoListSize();i++) {
			if(Tarolo.getLatogatokElement(i).getName().contains(nev)  & Tarolo.getLatogatokElement(i).getID()==id) {
				return id;
			}
		}throw new ReaderIDNotFoundException();
	}
	/**
	 * Azon olvasó Adatainak módosítása amelyet az OlvsaóSearch függvényben találtunk meg
	 * A különbözõ menüpontok kiválasztása során lehetõségünk van csak 1 , de akár az összes adattagját KIVÉVE a kivett könyveket átírni
	 * 
	 */
	public static void Olvasomodify() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kérem adja meg a módosítani kívánt olvasó nevét: ");
		int a=OlvasoSearch();
		System.out.println("Kérem válasszon az alábbi menüpontok közül: ");
		Menu.readermodify();
		while (true) {
			String cmd=sc.nextLine();
			
			if(cmd.equals("1")) {
				System.out.println("Adja meg az olvasó új nevét");
				String ujnev=sc.nextLine();
				Tarolo.getLatogatoList().get(a).namemodosit(ujnev);
				System.out.println("Sikeres módosítás");
				break;
			}else if(cmd.equals("2")) {
				System.out.println("Adja meg az olvasó új elérhetõségét");
				String ujelerh=sc.nextLine();
				Tarolo.getLatogatoList().get(a).elerhetosegmodosit(ujelerh);
				System.out.println("Sikeres módosítás");
				break;
			}else if(cmd.equals("3")) {
				System.out.println("Adja meg az olvasó új nevét");
				String ujnev=sc.nextLine();
				Tarolo.getLatogatoList().get(a).namemodosit(ujnev);
				System.out.println("Adja meg az olvasó új elérhetõségét");
				String ujelerh=sc.nextLine();
				Tarolo.getLatogatoList().get(a).elerhetosegmodosit(ujelerh);
				break;
			}else if(cmd.equals(4)) {
				break;
			}
		}
	}
	
	/**
	 * 
	 * @return könyv törléshez segédfüggvény megfelelõ találat esetén visszatér a törölni kívánt könyv listájának i. elemével 
	 * ha nincs találat hibát dob  abba az esetbe sincs visszatérési érték ha lenne találat de a könyv ki van adva
	 */
	public static int keres(int talalat,String cim) throws Exception{
		for(int i=0;i<Tarolo.BooksListSize();i++) {
			if(Tarolo.getBooksElement(i).getID()==talalat &Tarolo.getBooksElement(i).getName().contains(cim) &elerhetoKonyv(Tarolo.getBooksElement(i))) {
				return i;
			}	
		}throw new IDNotFoundException(talalat);
		//	return -1;
	}
	
	
	/**
	 * Könyvtörlés függvénye 
	 * Keres könyvet ha NINCS TALÁLAT akkor hibaüzenetet dob
	 * 1 vagy több találat esetén ID-t választ a felhasználó
	 * ha megfelelõ ID-t választott akkor törlõdik a könyv az adatbázisból feltéve hogy nincs kiadva
	 * @throws Exception
	 */
	public static void DeleteBook() throws Exception {
		int cnt=0;
		System.out.println("Írja be a törölni kívánt könyv címét");
		Scanner sc=new Scanner(System.in);
		String cim=sc.nextLine();
		
		for(int i=0;i<Tarolo.BooksListSize();i++) {
		
			if(Tarolo.getBooksElement(i).getName().contains(cim) & !Tarolo.getBooksElement(i).getKiadva()) {
				cnt++;
				System.out.println(Tarolo.getBooksElement(i));
			}
		}
		if(cnt==0) {
			throw new BookNotFoundException(cim);
			//System.out.println("Nincs találat vissza iránytottuk   a fõmenübe");
		}else {
			System.out.println("Adja meg a törölni kívánt könyv ID-ját");
			int torol;
			try {
				 torol=sc.nextInt();
			}catch (Exception e) {
				  System.err.println("nem megfelelõ bemenet") ;
				  return;  };
			
			keres(torol,cim);
			Tarolo.removeBooks(keres(torol,cim));
			System.out.println("Sikeres törlés");
			}
		}
	/**
	 * 
	 * @return Könyvre szûrési lehetõséget biztosít  a könyv címének/címének részletének megadásával ha 
	 * nincs találat a címszerinti keresésre hibadobódik
	 * ha van találat ,de rossz ID-t adunk meg hibadobódik
	 * ha van találat és jó ID-t adunk meg  akkor a lista i. elemével térünk vissza
	 */
	private static int searchbyname() throws BookNotFoundException, IDNotFoundException {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		String cim=sc.nextLine();
		for(int i=0;i<Tarolo.BooksListSize();i++) {
			if(Tarolo.getBooksElement(i).getName().contains(cim)) {
				cnt++;
				System.out.println(Tarolo.getBooksElement(i));
			}
		}
		if(cnt==0) {
			throw new BookNotFoundException(cim);
		}
		System.out.println("Adja meg a találatok közül a keresett könyv ID-ját:");
		int a=sc.nextInt();
		for(int i=0;i<Tarolo.BooksListSize();i++) {
			if(Tarolo.getBooksElement(i).getName().contains(cim)&Tarolo.getBooksElement(i).getID()==a ) {
				return i;
			}
		}throw new IDNotFoundException(a);
		
	}
	/**
	 * Könyv adatainak módosítása megfelelõ adattagonként
	 * @throws Exception
	 * @params a könyv adatainak különbözõ paraméterenkénti való módosítását teszi lehetõvé
	 */
	public static void Bookmodify() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg a módosítani kívánt könyv címét: ");
		int modosit =searchbyname();
		Menu.bookmodify();
		System.out.println("Adja meg mi alapján szeretne módosítani");
		while(true) {
			String cmd=sc.nextLine();
			if(cmd.equals("1")) {
				System.out.println("Adja meg a könyv új címét: ");
				String name=sc.nextLine();
				Tarolo.getBooksElement(modosit).setName(name);
				break;
			}else if(cmd.equals("2")) {
				System.out.println("Adja meg a könyv új szerzõjét: ");
				String author=sc.nextLine();
				Tarolo.getBooksElement(modosit).setSzerzo(author);
				break;
			}else if(cmd.equals("3")) {
				System.out.println("Adja meg a könyv új mûfaját: ");
				String mufaj=sc.nextLine();
				Tarolo.getBooksElement(modosit).setMufaj(mufaj);
				break;
			}else if(cmd.equals("4")) {
				System.out.println("Adja meg a könyv új Kiadási évét ");
				int kiadaseve=0;
				try {
				 kiadaseve=sc.nextInt();
				} catch(Exception e) {
					  System.err.println("A könyv módosítása sikertelen nem megfelelõ bemenet") ;
				}
				Tarolo.getBooksElement(modosit).setKiadaseve(kiadaseve);
				break;
			}else if(cmd.equals("5")) {
				System.out.println("Adja meg a könyv új címét: ");
				String name=sc.nextLine();
				Tarolo.getBooksElement(modosit).setName(name);
				System.out.println("Adja meg a könyv új szerzõjét: ");
				String author=sc.nextLine();
				Tarolo.getBooksElement(modosit).setSzerzo(author);
				System.out.println("Adja meg a könyv új mûfaját: ");
				String mufaj=sc.nextLine();
				Tarolo.getBooksElement(modosit).setMufaj(mufaj);
				System.out.println("Adja meg a könyv új Kiadási évét ");
				int kiadaseve=0;
				try {
				 kiadaseve=sc.nextInt();
				} catch(Exception e) {
					  System.err.println("A könyv módosítása sikertelen nem megfelelõ bemenet") ;
				}
				System.out.println("Adja meg a könyv új leírását:");
				String leiras=sc.nextLine();
				Tarolo.getBooksElement(modosit).setLeiras(leiras);
				Tarolo.getBooksElement(modosit).setKiadaseve(kiadaseve);
				break;
			
			}else if(cmd.equals(6)) {break;}
		}
		System.out.println("Sikeres módosítás");
	}	
	/**
	 * Kilistázza az összes könyvet az adatbázisban mindenféle szûrés nélkül
	 */
	private static void kilistaz() {
		for(int i=0; i < Tarolo.BooksListSize();i++) {
			System.out.println(Tarolo.getBooksElement(i).toString());
			System.out.println();
		}
	}
	/**
	 * 
	 * Comparátorok segítségével rendezi a listát majd kiiírja az eredményt a kimenetre
	 */
	public  static void Booksearch() throws Exception  {
		Scanner sc=new Scanner(System.in);
		Menu.booksearch();
		while (true) {
			String cmd=sc.nextLine();
			
			if(cmd.equals("1")) {
				Collections.sort(Tarolo.getBooksList(), new NameComparator());	
				kilistaz();
				break;
			}else if( cmd.equals("2")){
				Collections.sort(Tarolo.getBooksList(), new AuthorComparator());
				kilistaz();
				break;
			}else if(cmd.equals("3")) {
				Collections.sort(Tarolo.getBooksList(), new MufajComparator());
				kilistaz();
				break;
			}else if(cmd.equals("4")) {break;}
			
			}
		
		}
	
	/**
*		Könyv hozzáadásához használatos függvény
*		bekéri az adattagokat  egyesével
*		ha az evszam adattagot rosszul adjuk meg akkor hibaüzenet és a könyv hozzáadása sikertelen , tehát nem jön létre új könyv típúsú eleme a listának
*	 */
	public static void Letrehoz() throws Exception {
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Ön az új könyv hozzáadása menüpontot választotta kérjük adja meg a könyv adatait");
		System.out.print("Adja meg a létrehozni kívánt könyv címét: ");
		String name=sc.nextLine();
		System.out.print("Adja meg a könyv szerzõjét/szerzõit: ");
		String szerzo=sc.nextLine();
		System.out.print("Adja meg a könyv mûfaját: ");
		String mufaj=sc.nextLine();
		System.out.print("Adja meg a könyv kiadási évszámát: ");
		int evszam=0;
		try {
			 evszam=sc.nextInt();
		}catch (Exception e) {
			  System.err.println("A könyv hozzáadása sikertelen nem megfelelõ bemenet") ;
			  return;  };
		System.out.println("Kíván leírást hozzáadni? (igen/nem)");
		String disc="Nincs leírás hozzáadva";
		while(true) {
			String cmd=sc.nextLine();
			if(cmd.equals("igen")) {
				System.out.println("Adja meg a könyv leírását");
				disc=sc.nextLine();
				break;
			}else if(cmd.equals("nem")){
				break;
			}
		}
		Konyvek k=(new Konyvek(name,szerzo,mufaj,evszam));
		k.setLeiras(disc);
		Tarolo.addBook(k);
		System.out.println("Sikeres könyv hozzáadás");
	}
}

	

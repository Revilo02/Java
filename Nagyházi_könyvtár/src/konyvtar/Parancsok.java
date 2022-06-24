package konyvtar;

import java.io.*;
import java.util.*;


public class Parancsok {
	
	
	
	/**
	 * 
	 * Ez a f�ggv�ny azt ellen�rzi hogy az adott k�nyvet kivett�k-e m�r.
	 *
	 */
	public static boolean elerhetoKonyv(Konyvek k) {
		
		if (k.getKiadva()==true)
			return false;
		else return true;
	}
	/**
	 * *Kiadhat� 
	 * A f�ggv�ny bek�ri egy k�nyv c�m�t k�zben elind�t egy sz�ml�l�t ha a sz�ml�l� 0 lesz a ciklus v�g�re akkor
	 * Hib�t dob mert nincs tal�lat 
	 * ha 1 vagy t�bb tal�lat van akkor bek�r egy eg�sz sz�mot ami az adott k�nyv ID-j�t jel�li, hogy ne legyen probl�m�s hogy nem a feldobott ID-kb�l v�laszt
	 * az miatt a kiadID-nak a visszat�r�s�nek felt�tele hogy a k�nyv nev�t tartalmaznia kell az adott ID-j� k�nyvnek
	 * , ha nincs tal�lat akkor hib�t dob a program
	 * @return 
	 *
	 */
	public static int kiadhato() throws BookNotFoundException, IDNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg a kivenni k�v�nt k�nyv c�m�t: ");
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
			System.out.println("Adja mega kivenni k�v�nt k�nyv ID-j�t");
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
	 * A kiadott k�nyvek visszahozatal��rt felel�s ez a f�ggv�ny el�sz�r bek�ri az olvas� nev�t 
	 * Majd leelen�rzi hogy van-e k�nyv az olvas�n�l ha az olvas�lista adattagja �res akkor hibadob�dik �s visszat�r�nk a f�men�be
	 * ha 1 vagy t�bb k�nyve van akkor kilist�zza azokat �s ID alapj�n v�laszthat hogy melyiket t�rli
	 * Itt ha rossz ID-t ad meg ( rossz ID=Nem l�tez� vagy nem kilist�zott elemek k�z�l ad meg ID-t)
	 * Ha Sikeres a k�nyvviszav�tel a felhaszn�l�t egy �zenet form�j�ban �rtes�tj�k
	 */
	public static void KonyvVisszavesz() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg az olvas�nak a nev�t aki k�nyvet hozott vissza: ");
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
			System.out.println("Adja meg a visszahozni k�v�nt k�nyv ID-j�t");
			int id=sc.nextInt();
			for(int j=0;j<Tarolo.getLatogatokElement(i).listaz().size();j++) {
				if(Tarolo.getLatogatokElement(i).listaz().get(j).getID()==id) {
					Tarolo.getLatogatokElement(i).listaz().get(j).setKiadva(false);
					Tarolo.getLatogatokElement(i).listaz().remove(j);
				System.out.println("Sikeres k�nyv visszav�tel");
				return;
				}
			}System.err.println("Sikertelen k�nyv visszav�tel");
			
			//return;
		}
	
}
	/**
	 * 
	 *Ez a f�ggv�ny akkor l�p �letbe ha a k�t seg�df�ggv�nye a kiadhato �s azelerhet�k�nyv visszat�r a megfelel� visszat�r�si �rt�kekkel �s akkor kiadja a megfelel� k�nyvet az olvas�nak
	 */
	public static void KonyvKiad() throws Exception {
	
		int kiad=kiadhato();
		System.out.println("Adja meg az olvas� nev�t aki ki k�v�nja venni a k�nyvet: ");
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
	 * �j olvas�t hoz l�tre �s menti bele az olvas�kat t�rol� list�ba az adattagokat
	 */
	public static void OlvasoLetrehoz() {
		Scanner sc=new Scanner(System.in);
		System.out.println("K�rem adja meg az olvas� TELJES nev�t: ");
		String nev=sc.nextLine();
		System.out.println("K�rem adja meg az olvas� el�rhet�s�g�t:");
		String elerh=sc.nextLine();
		Tarolo.addLatogato(new Latogato(nev,elerh));
		System.out.println("Olvas� sikeresen hozz�adva");
	}
	/**
	 * Olvas� keres�s��rt felel ha nincs tal�lat hib�t dob k�l�nben visszat�r a keresett olvas� ID-j�val
	 * @return Olvas�t keres vagy az Olvas� ID-j�val t�r vissza vagy hiba dob�dik
	 * @throws Exception hibadob�dik ha nem tal�ljuk  a keresett halmazon a keresett ID-j� olvas�t
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
	 * Azon olvas� Adatainak m�dos�t�sa amelyet az Olvsa�Search f�ggv�nyben tal�ltunk meg
	 * A k�l�nb�z� men�pontok kiv�laszt�sa sor�n lehet�s�g�nk van csak 1 , de ak�r az �sszes adattagj�t KIV�VE a kivett k�nyveket �t�rni
	 * 
	 */
	public static void Olvasomodify() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("K�rem adja meg a m�dos�tani k�v�nt olvas� nev�t: ");
		int a=OlvasoSearch();
		System.out.println("K�rem v�lasszon az al�bbi men�pontok k�z�l: ");
		Menu.readermodify();
		while (true) {
			String cmd=sc.nextLine();
			
			if(cmd.equals("1")) {
				System.out.println("Adja meg az olvas� �j nev�t");
				String ujnev=sc.nextLine();
				Tarolo.getLatogatoList().get(a).namemodosit(ujnev);
				System.out.println("Sikeres m�dos�t�s");
				break;
			}else if(cmd.equals("2")) {
				System.out.println("Adja meg az olvas� �j el�rhet�s�g�t");
				String ujelerh=sc.nextLine();
				Tarolo.getLatogatoList().get(a).elerhetosegmodosit(ujelerh);
				System.out.println("Sikeres m�dos�t�s");
				break;
			}else if(cmd.equals("3")) {
				System.out.println("Adja meg az olvas� �j nev�t");
				String ujnev=sc.nextLine();
				Tarolo.getLatogatoList().get(a).namemodosit(ujnev);
				System.out.println("Adja meg az olvas� �j el�rhet�s�g�t");
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
	 * @return k�nyv t�rl�shez seg�df�ggv�ny megfelel� tal�lat eset�n visszat�r a t�r�lni k�v�nt k�nyv list�j�nak i. elem�vel 
	 * ha nincs tal�lat hib�t dob  abba az esetbe sincs visszat�r�si �rt�k ha lenne tal�lat de a k�nyv ki van adva
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
	 * K�nyvt�rl�s f�ggv�nye 
	 * Keres k�nyvet ha NINCS TAL�LAT akkor hiba�zenetet dob
	 * 1 vagy t�bb tal�lat eset�n ID-t v�laszt a felhaszn�l�
	 * ha megfelel� ID-t v�lasztott akkor t�rl�dik a k�nyv az adatb�zisb�l felt�ve hogy nincs kiadva
	 * @throws Exception
	 */
	public static void DeleteBook() throws Exception {
		int cnt=0;
		System.out.println("�rja be a t�r�lni k�v�nt k�nyv c�m�t");
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
			//System.out.println("Nincs tal�lat vissza ir�nytottuk   a f�men�be");
		}else {
			System.out.println("Adja meg a t�r�lni k�v�nt k�nyv ID-j�t");
			int torol;
			try {
				 torol=sc.nextInt();
			}catch (Exception e) {
				  System.err.println("nem megfelel� bemenet") ;
				  return;  };
			
			keres(torol,cim);
			Tarolo.removeBooks(keres(torol,cim));
			System.out.println("Sikeres t�rl�s");
			}
		}
	/**
	 * 
	 * @return K�nyvre sz�r�si lehet�s�get biztos�t  a k�nyv c�m�nek/c�m�nek r�szlet�nek megad�s�val ha 
	 * nincs tal�lat a c�mszerinti keres�sre hibadob�dik
	 * ha van tal�lat ,de rossz ID-t adunk meg hibadob�dik
	 * ha van tal�lat �s j� ID-t adunk meg  akkor a lista i. elem�vel t�r�nk vissza
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
		System.out.println("Adja meg a tal�latok k�z�l a keresett k�nyv ID-j�t:");
		int a=sc.nextInt();
		for(int i=0;i<Tarolo.BooksListSize();i++) {
			if(Tarolo.getBooksElement(i).getName().contains(cim)&Tarolo.getBooksElement(i).getID()==a ) {
				return i;
			}
		}throw new IDNotFoundException(a);
		
	}
	/**
	 * K�nyv adatainak m�dos�t�sa megfelel� adattagonk�nt
	 * @throws Exception
	 * @params a k�nyv adatainak k�l�nb�z� param�terenk�nti val� m�dos�t�s�t teszi lehet�v�
	 */
	public static void Bookmodify() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg a m�dos�tani k�v�nt k�nyv c�m�t: ");
		int modosit =searchbyname();
		Menu.bookmodify();
		System.out.println("Adja meg mi alapj�n szeretne m�dos�tani");
		while(true) {
			String cmd=sc.nextLine();
			if(cmd.equals("1")) {
				System.out.println("Adja meg a k�nyv �j c�m�t: ");
				String name=sc.nextLine();
				Tarolo.getBooksElement(modosit).setName(name);
				break;
			}else if(cmd.equals("2")) {
				System.out.println("Adja meg a k�nyv �j szerz�j�t: ");
				String author=sc.nextLine();
				Tarolo.getBooksElement(modosit).setSzerzo(author);
				break;
			}else if(cmd.equals("3")) {
				System.out.println("Adja meg a k�nyv �j m�faj�t: ");
				String mufaj=sc.nextLine();
				Tarolo.getBooksElement(modosit).setMufaj(mufaj);
				break;
			}else if(cmd.equals("4")) {
				System.out.println("Adja meg a k�nyv �j Kiad�si �v�t ");
				int kiadaseve=0;
				try {
				 kiadaseve=sc.nextInt();
				} catch(Exception e) {
					  System.err.println("A k�nyv m�dos�t�sa sikertelen nem megfelel� bemenet") ;
				}
				Tarolo.getBooksElement(modosit).setKiadaseve(kiadaseve);
				break;
			}else if(cmd.equals("5")) {
				System.out.println("Adja meg a k�nyv �j c�m�t: ");
				String name=sc.nextLine();
				Tarolo.getBooksElement(modosit).setName(name);
				System.out.println("Adja meg a k�nyv �j szerz�j�t: ");
				String author=sc.nextLine();
				Tarolo.getBooksElement(modosit).setSzerzo(author);
				System.out.println("Adja meg a k�nyv �j m�faj�t: ");
				String mufaj=sc.nextLine();
				Tarolo.getBooksElement(modosit).setMufaj(mufaj);
				System.out.println("Adja meg a k�nyv �j Kiad�si �v�t ");
				int kiadaseve=0;
				try {
				 kiadaseve=sc.nextInt();
				} catch(Exception e) {
					  System.err.println("A k�nyv m�dos�t�sa sikertelen nem megfelel� bemenet") ;
				}
				System.out.println("Adja meg a k�nyv �j le�r�s�t:");
				String leiras=sc.nextLine();
				Tarolo.getBooksElement(modosit).setLeiras(leiras);
				Tarolo.getBooksElement(modosit).setKiadaseve(kiadaseve);
				break;
			
			}else if(cmd.equals(6)) {break;}
		}
		System.out.println("Sikeres m�dos�t�s");
	}	
	/**
	 * Kilist�zza az �sszes k�nyvet az adatb�zisban mindenf�le sz�r�s n�lk�l
	 */
	private static void kilistaz() {
		for(int i=0; i < Tarolo.BooksListSize();i++) {
			System.out.println(Tarolo.getBooksElement(i).toString());
			System.out.println();
		}
	}
	/**
	 * 
	 * Compar�torok seg�ts�g�vel rendezi a list�t majd kii�rja az eredm�nyt a kimenetre
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
*		K�nyv hozz�ad�s�hoz haszn�latos f�ggv�ny
*		bek�ri az adattagokat  egyes�vel
*		ha az evszam adattagot rosszul adjuk meg akkor hiba�zenet �s a k�nyv hozz�ad�sa sikertelen , teh�t nem j�n l�tre �j k�nyv t�p�s� eleme a list�nak
*	 */
	public static void Letrehoz() throws Exception {
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("�n az �j k�nyv hozz�ad�sa men�pontot v�lasztotta k�rj�k adja meg a k�nyv adatait");
		System.out.print("Adja meg a l�trehozni k�v�nt k�nyv c�m�t: ");
		String name=sc.nextLine();
		System.out.print("Adja meg a k�nyv szerz�j�t/szerz�it: ");
		String szerzo=sc.nextLine();
		System.out.print("Adja meg a k�nyv m�faj�t: ");
		String mufaj=sc.nextLine();
		System.out.print("Adja meg a k�nyv kiad�si �vsz�m�t: ");
		int evszam=0;
		try {
			 evszam=sc.nextInt();
		}catch (Exception e) {
			  System.err.println("A k�nyv hozz�ad�sa sikertelen nem megfelel� bemenet") ;
			  return;  };
		System.out.println("K�v�n le�r�st hozz�adni? (igen/nem)");
		String disc="Nincs le�r�s hozz�adva";
		while(true) {
			String cmd=sc.nextLine();
			if(cmd.equals("igen")) {
				System.out.println("Adja meg a k�nyv le�r�s�t");
				disc=sc.nextLine();
				break;
			}else if(cmd.equals("nem")){
				break;
			}
		}
		Konyvek k=(new Konyvek(name,szerzo,mufaj,evszam));
		k.setLeiras(disc);
		Tarolo.addBook(k);
		System.out.println("Sikeres k�nyv hozz�ad�s");
	}
}

	

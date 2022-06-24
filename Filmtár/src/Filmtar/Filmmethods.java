package Filmtar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Filmmethods {
	

	protected static  void add() throws Exception{
		System.out.println("�rja be az �j filmet amit hozz�s szeretne "+"\n"
				+ "0= vissza a fomenube");
		
		Scanner be1 = new Scanner(System.in);
		
		System.out.println("Film c�me: "); String uj_title = be1.nextLine() ;
		System.out.println("Kateg�ri�ja: "); String uj_category = be1.nextLine(); 
		System.out.println("H�res sz�n�sz: "); String uj_actors = be1.nextLine(); 
		System.out.println("Film hossza: "); String uj_playtime = be1.nextLine() ;
		System.out.println("Filme kiad�si �ve: "); String uj_premier = be1.nextLine();
		System.out.println("Film korhat�ra "); String uj_agelimit = be1.nextLine() ;
		
		if (uj_title.equals("0") || uj_category.equals("0") || uj_actors.equals("0")|| uj_playtime.equals("0")
				|| uj_premier.equals("0") || uj_agelimit.equals("0")) {
			FoMenu.FoMenu();
		}
		
		
		
		Films new_film = new Films(uj_title, Double.parseDouble(uj_playtime), Double.parseDouble(uj_premier), Double.parseDouble(uj_agelimit), uj_category, uj_actors);
		Main.filmek.add(new_film);
		
	}



	protected static void search() {
		System.out.println("Mi szerint szeretne keresni?"+"\n"+
							"1=N�v"+"\n"+
							"2=Kateg�ria"+"\n"+
							"3=Kiadsi �v"+"\n"+
							"4=Szin�sz");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if ("1".equals(input)) {
			System.out.println("Mi a film c�me: "); String nev_keres = sc.nextLine(); 
			for (int i = 0; i < Main.filmek.size(); i++) {
					if (Main.filmek.get(i).getTitle().equals(nev_keres)) {
						System.out.println(Main.filmek.get(i));}
					}
				}
		
		if ("2".equals(input)) {
			System.out.println("Mi a film kateg�ri�ja: "); String kategoria_keres = sc.nextLine(); 
			for (int i = 0; i < Main.filmek.size(); i++) {
				if (Main.filmek.get(i).getCategory().equals(kategoria_keres)) {
					System.out.println(Main.filmek.get(i));}
				}
			}
		if ("3".equals(input)) {
				System.out.println("Mi a film kiad�si �ve: "); String kiadasiev_keres = sc.nextLine(); 
				for (int i = 0; i < Main.filmek.size(); i++) {
					if (Main.filmek.get(i).getPremier()==(Double.parseDouble(kiadasiev_keres))) {
						System.out.println(Main.filmek.get(i));}
					}
				}
		if ("4".equals(input)) {
			System.out.println("Ki az a szin�sz akit keres: "); String szinesz_keres = sc.nextLine(); 
			for (int i = 0; i < Main.filmek.size(); i++) {
				if (Main.filmek.get(i).getActors().equals(szinesz_keres)) {
					System.out.println(Main.filmek.get(i));}
				}
			}	
		
		
	}
	
	
	
	protected static void delete() throws Exception {
	
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< Main.filmek.size();i++) {
			System.out.println(Main.filmek.get(i));
		}
		System.out.println("Melyik filmet szeretn� t�r�lni: (�rja be a c�m�t))");
		String be = sc.nextLine();
		for (int i = 0; i<Main.filmek.size();i++) {
			if (be.equals(Main.filmek.get(i).getTitle())) {
				System.out.println("Biztosan t�r�lni szeretn� (Y/N)");
				String be2= sc.nextLine();
				if (be2.equals("Y")) {
					Main.filmek.remove(i);
				}
				else if(be2.equals("N"))  {
					FoMenu.FoMenu();
				}
			}
		}
					
				
		}
	
	
	protected static void remove() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< Main.filmek.size();i++) {
			System.out.println(Main.filmek.get(i));
			//kiiratom a filmeket
		}
		
		System.out.println("Melyik filmnek meilyik adat�t szeretn� t�r�lni");
		String be = sc.nextLine();
		for (int i = 0; i<Main.filmek.size();i++) {
			if (be.equals(Main.filmek.get(i).getTitle())) {
				System.out.println(Main.filmek.get(i));
				System.out.println("Melyik adat�t szeretn� m�dos�tani");
				System.out.println("cim/lejatszasi ido/kiadasi ev/kategoria/szinesz/korhatar");
				String be2 = sc.nextLine();
				if  ("cim".equals(be2)) {
					System.out.println("�rja be mire sszeretn� m�ds�tani");
					String change_title = sc.nextLine();
					Main.filmek.get(i).setTitle(change_title);
					}
				else if ("lejatszasi ido".equals(be2)) {
					System.out.println("�rja be mire sszeretn� m�ds�tani");
					String change_playtime = sc.nextLine();
					Main.filmek.get(i).setPlaytime(Double.parseDouble(change_playtime));
					}
					
				
				else if ("kiadasi ev".equals(be2)) {
					System.out.println("�rja be mire szeretn� m�ds�tani");
					String change_premier = sc.nextLine();
					Main.filmek.get(i).setPremier(Double.parseDouble(change_premier));
					
					
				}
				else if ("kategoria".equals(be2)){
					System.out.println("�rja be mire sszeretn� m�ds�tani");
					String change_category = sc.nextLine();
					Main.filmek.get(i).setCategory(change_category);
				}
				
				else if ("szinesz".equals(be2)){
					System.out.println("�rja be mire sszeretn� m�ds�tani");
					String change_actor = sc.nextLine();
					Main.filmek.get(i).setActor(change_actor);
				
				
					
				}
				else if ("korhatar".equals(be2)){
					System.out.println("�rja be mire sszeretn� m�ds�tani");
					String change_agelimit = sc.nextLine();
					Main.filmek.get(i).setAgelimit(Double.parseDouble(change_agelimit));
				
				
					
				}
			}
	
		}
		
	}
		
}
		
		





package Filmtar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Filmmethods {
	

	protected static  void add() throws Exception{
		System.out.println("Írja be az új filmet amit hozzás szeretne "+"\n"
				+ "0= vissza a fomenube");
		
		Scanner be1 = new Scanner(System.in);
		
		System.out.println("Film címe: "); String uj_title = be1.nextLine() ;
		System.out.println("Kategóriája: "); String uj_category = be1.nextLine(); 
		System.out.println("Híres színész: "); String uj_actors = be1.nextLine(); 
		System.out.println("Film hossza: "); String uj_playtime = be1.nextLine() ;
		System.out.println("Filme kiadási éve: "); String uj_premier = be1.nextLine();
		System.out.println("Film korhatára "); String uj_agelimit = be1.nextLine() ;
		
		if (uj_title.equals("0") || uj_category.equals("0") || uj_actors.equals("0")|| uj_playtime.equals("0")
				|| uj_premier.equals("0") || uj_agelimit.equals("0")) {
			FoMenu.FoMenu();
		}
		
		
		
		Films new_film = new Films(uj_title, Double.parseDouble(uj_playtime), Double.parseDouble(uj_premier), Double.parseDouble(uj_agelimit), uj_category, uj_actors);
		Main.filmek.add(new_film);
		
	}



	protected static void search() {
		System.out.println("Mi szerint szeretne keresni?"+"\n"+
							"1=Név"+"\n"+
							"2=Kategória"+"\n"+
							"3=Kiadsi év"+"\n"+
							"4=Szinész");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if ("1".equals(input)) {
			System.out.println("Mi a film címe: "); String nev_keres = sc.nextLine(); 
			for (int i = 0; i < Main.filmek.size(); i++) {
					if (Main.filmek.get(i).getTitle().equals(nev_keres)) {
						System.out.println(Main.filmek.get(i));}
					}
				}
		
		if ("2".equals(input)) {
			System.out.println("Mi a film kategóriája: "); String kategoria_keres = sc.nextLine(); 
			for (int i = 0; i < Main.filmek.size(); i++) {
				if (Main.filmek.get(i).getCategory().equals(kategoria_keres)) {
					System.out.println(Main.filmek.get(i));}
				}
			}
		if ("3".equals(input)) {
				System.out.println("Mi a film kiadási éve: "); String kiadasiev_keres = sc.nextLine(); 
				for (int i = 0; i < Main.filmek.size(); i++) {
					if (Main.filmek.get(i).getPremier()==(Double.parseDouble(kiadasiev_keres))) {
						System.out.println(Main.filmek.get(i));}
					}
				}
		if ("4".equals(input)) {
			System.out.println("Ki az a szinész akit keres: "); String szinesz_keres = sc.nextLine(); 
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
		System.out.println("Melyik filmet szeretné törölni: (Írja be a címét))");
		String be = sc.nextLine();
		for (int i = 0; i<Main.filmek.size();i++) {
			if (be.equals(Main.filmek.get(i).getTitle())) {
				System.out.println("Biztosan törölni szeretné (Y/N)");
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
		
		System.out.println("Melyik filmnek meilyik adatát szeretné törölni");
		String be = sc.nextLine();
		for (int i = 0; i<Main.filmek.size();i++) {
			if (be.equals(Main.filmek.get(i).getTitle())) {
				System.out.println(Main.filmek.get(i));
				System.out.println("Melyik adatát szeretné módosítani");
				System.out.println("cim/lejatszasi ido/kiadasi ev/kategoria/szinesz/korhatar");
				String be2 = sc.nextLine();
				if  ("cim".equals(be2)) {
					System.out.println("Írja be mire sszeretné módsítani");
					String change_title = sc.nextLine();
					Main.filmek.get(i).setTitle(change_title);
					}
				else if ("lejatszasi ido".equals(be2)) {
					System.out.println("Írja be mire sszeretné módsítani");
					String change_playtime = sc.nextLine();
					Main.filmek.get(i).setPlaytime(Double.parseDouble(change_playtime));
					}
					
				
				else if ("kiadasi ev".equals(be2)) {
					System.out.println("Írja be mire szeretné módsítani");
					String change_premier = sc.nextLine();
					Main.filmek.get(i).setPremier(Double.parseDouble(change_premier));
					
					
				}
				else if ("kategoria".equals(be2)){
					System.out.println("Írja be mire sszeretné módsítani");
					String change_category = sc.nextLine();
					Main.filmek.get(i).setCategory(change_category);
				}
				
				else if ("szinesz".equals(be2)){
					System.out.println("Írja be mire sszeretné módsítani");
					String change_actor = sc.nextLine();
					Main.filmek.get(i).setActor(change_actor);
				
				
					
				}
				else if ("korhatar".equals(be2)){
					System.out.println("Írja be mire sszeretné módsítani");
					String change_agelimit = sc.nextLine();
					Main.filmek.get(i).setAgelimit(Double.parseDouble(change_agelimit));
				
				
					
				}
			}
	
		}
		
	}
		
}
		
		





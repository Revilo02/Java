package Filmtar.src;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;

public class Videoanyagok {
	ArrayList <Videoanyag> lista =new ArrayList<Videoanyag>();
	/**
	 * ide jön majd a fájlból olvasás
	 * */
	public Videoanyagok() {
		/**
		 * ide jön majd a fájlból olvasás*/
		try {
			File f= new File("adatbazis.txt");
			Scanner sc=new Scanner(f,"UTF-8");
		
			while (true) {
				boolean b = sc.hasNextLine(); 
				//System.out.println(b);
				if (!b) {
					break;
				}
				String a=sc.nextLine();
				//System.out.println(a);
				String t[]=a.split(";");
				if (t[0].equals("Film")) {
					lista.add(new Film(t[1],t[2],Integer.parseInt(t[3]),Integer.parseInt(t[4]),Integer.parseInt(t[5]),t[6]));
				}
				else {
					lista.add(new Sorozat(t[1],t[2],Integer.parseInt(t[3]),Integer.parseInt(t[4])));
				}
			}
			sc.close();
		}catch (Exception e){
			System.out.println("Nem mûkszik");
		}
		
	}
	
	public String toString() {
		String s="";
		for (int i=0; i<lista.size();i++) {
			s+=lista.get(i);
		}
		return s;
	}
	
	public void Fajlbair() {
		try {
			FileWriter w=
			  new FileWriter(new File("adatbazis.txt"), StandardCharsets.UTF_8);

			String s;

			s="";
			for (int i=0;i<lista.size();i++) {
				
				System.out.println(lista.get(i).getClass().toString());
				if (lista.get(i).getClass().toString().equals("class Filmtar.Film")) {
					s+=lista.get(i).toFajlba();
					
				}else {
					s+=lista.get(i).toFajlba();
				}
				
			}
			System.out.println(s);
			w.write(s);
			w.close();
			
			
		}catch(Exception e) {
			System.out.println("Nem mûködik :c");
		}
	}

}

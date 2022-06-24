package Filmtar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Beolvasas extends Films {

		public Beolvasas(String title, double playtime, double premier, double agelimit, String category, String actors) {
			super(title, playtime, premier, agelimit, category, actors);
		}

		public static ArrayList<Films> beolvas(ArrayList<Films> filmek) {
			try {
				System.setProperty("file.endcoding", "UTF8");
				FileReader fajl = new FileReader("adatok.txt");
				BufferedReader br = new BufferedReader(fajl);
				String sor = null;
				while((sor = br.readLine()) !=null)
				{
					String[] darabok = sor.split(";");
					String title = darabok[0];
					double playtime = Double.parseDouble(darabok[1]);
					double premier = Double.parseDouble(darabok[2]);
					double agelimit = Double.parseDouble(darabok[3]);
					String category = darabok[4];
					String actors = darabok[5];
					
					Films F1 = new Films(title, playtime, premier, agelimit,category,actors);
					filmek.add(F1);
				}
				br.close();
			}
			catch(IOException e) {
				System.err.println("Hiba a beolvasás:"+ " "+e);
			}
		
			return filmek;
		}	
	}
		



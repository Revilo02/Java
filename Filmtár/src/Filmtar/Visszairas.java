package Filmtar;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Visszairas extends Films {

	public Visszairas(String title, double playtime, double premier, double agelimit, String category, String actors) {
		super(title, playtime, premier, agelimit, category, actors);
		}
	
	
	
	public static  ArrayList<Films> visszair(ArrayList<Films> filmek){
		try {
			System.setProperty("file.endcoding", "UTF8");
			FileWriter fajl = new FileWriter("adatok.txt");
			BufferedWriter bw = new BufferedWriter(fajl);
			
			for(int i = 0; i<filmek.size();i++){
				String sor = filmek.get(i).toString();
				bw.write(sor+"\n");
			}
			bw.close();
		}
		catch(IOException ex) {
			System.err.println("Hiba a beolvasás:"+ " "+ex);
		}
		

		return filmek;


		
	}

	
}

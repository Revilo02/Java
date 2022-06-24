package Filmtar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Films> filmek = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		//1.Fájl elkészítése//
		File myObj = new File("adatok.txt");
		CreateFile.kezsites(myObj);
			 
		 //2.Fájból való beolvasás + Az ArrayList elkészytése amibe olvasunk //
		Beolvasas.beolvas(filmek);
		
			
		//4.Ebbe játszódknak le a  methodusok , vagyis a fõmenü methodusom
		FoMenu.FoMenu();
		
		
		
	}
}

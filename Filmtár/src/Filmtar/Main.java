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
		
		//1.F�jl elk�sz�t�se//
		File myObj = new File("adatok.txt");
		CreateFile.kezsites(myObj);
			 
		 //2.F�jb�l val� beolvas�s + Az ArrayList elk�szyt�se amibe olvasunk //
		Beolvasas.beolvas(filmek);
		
			
		//4.Ebbe j�tsz�dknak le a  methodusok , vagyis a f�men� methodusom
		FoMenu.FoMenu();
		
		
		
	}
}

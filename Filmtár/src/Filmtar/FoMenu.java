package Filmtar;

import java.util.Scanner;

public class FoMenu {
	
	
	
	
	public static void FoMenu() throws Exception {
		System.out.println("0=Kilép és ment"+"\n"
				+"Exit= Kilépés a programból"+"\n"
				+ "1=Hozzáadaás"+"\n"
				+ "2=Keresés"+"\n"
				+ "3=Törlés"+"\n"
				+ "4=Módosítás");
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			
			if ("0".equals(input)) {break;}
			else if ("Exit".equals(input)) {System.exit(0);}
			else if ("1".equals(input)) { Filmmethods.add();}
			else if ("2".equals(input)){ Filmmethods.search();}
			else if ("3".equals(input)){ Filmmethods.delete();}
			else if ("4".equals(input)){Filmmethods.remove();}
		
		}
		System.out.println("Exit= Kilépés a programból"+"\n"
							+ "1=vissza lépés a fõmenübe "+"\n");
		String input2 = sc.nextLine();
		if ("Exit".equals(input2)) {
			Visszairas.visszair(Main.filmek);
			System.exit(0);
		}
		else if ("1".equals(input2)) { FoMenu();}
		
	}


	
	
}

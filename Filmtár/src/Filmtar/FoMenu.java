package Filmtar;

import java.util.Scanner;

public class FoMenu {
	
	
	
	
	public static void FoMenu() throws Exception {
		System.out.println("0=Kil�p �s ment"+"\n"
				+"Exit= Kil�p�s a programb�l"+"\n"
				+ "1=Hozz�ada�s"+"\n"
				+ "2=Keres�s"+"\n"
				+ "3=T�rl�s"+"\n"
				+ "4=M�dos�t�s");
		
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
		System.out.println("Exit= Kil�p�s a programb�l"+"\n"
							+ "1=vissza l�p�s a f�men�be "+"\n");
		String input2 = sc.nextLine();
		if ("Exit".equals(input2)) {
			Visszairas.visszair(Main.filmek);
			System.exit(0);
		}
		else if ("1".equals(input2)) { FoMenu();}
		
	}


	
	
}

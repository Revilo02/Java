package Filmtar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String elozo="0:0";
		
		//Videoanyagok v1= new Videoanyagok();
		Videoanyagok a= new Videoanyagok();
		System.out.println(a);
		a.Fajlbair();
		
		while (true) {
			if (elozo=="0:0") {
				System.out.println("[1] Film/sorozat hozz�ad�sa \n"
						+ "[2] Filmek/sorozatok list�z�sa �v/m�faj alapj�n \n"
						+ "[3] Film/sorozat t�rl�se \n"
						+ "[4] N�v szerinti keres�s \n"
						+ "[5] Ment�s �s kil�p�s");
				try {
				int beker= input.nextInt();
				
				if (beker==1) {elozo="1:0";} 
				else if(beker==2) {elozo="2:0";} 
				else if(beker==3) {elozo="3:0";} 
				else if(beker==4) {elozo="4:0";} 
				else if(beker==5) {elozo="5:0";} 
				else{System.out.println("Ilyen parancs nincs!");} 
				}catch (Exception e){
					System.out.println("Ilyen parancs nincs!");
				}
			}
			else if (elozo=="1:0") {		
				System.out.println("[1] Film hozz�ad�sa \n"
						+ "[2] Sorozat hozz�ad�sa \n"
						+ "[3] Vissza a f�men�be");
				try {
					int beker= input.nextInt();
					
					if (beker==1) {} 
					else if(beker==2) {} 
					else if(beker==3) {elozo="0:0";} 
					else{System.out.println("Ilyen parancs nincs!");} 
					}catch (Exception e){
						System.out.println("Ilyen parancs nincs!");
					}
			}
		
			else if (elozo=="2:0") {
				System.out.println("[1] Film keres�se \n"
						+ "[2] Sorozat keres�se \n"
						+ "[3] Vissza a f�men�be");
				try {
					int beker= input.nextInt();
					
					if (beker==1) {elozo="2:1";} 
					else if(beker==2) {elozo="2:2";} 
					else if(beker==3) {elozo="0:0";} 
					else{System.out.println("Ilyen parancs nincs!");} 
					}catch (Exception e){
						System.out.println("Ilyen parancs nincs!");
					}
			}
			else if(elozo=="2:1"||elozo=="2:2") {
				System.out.println("[1] �v szerinti keres�s \n"
						+ "[2] M�faj szerinti keres�s \n"
						+ "[3] Vissza");
				try {
					int beker= input.nextInt();
					
					if (beker==1) {} 
					else if(beker==2) {} 
					else if(beker==3) {elozo="2:0";} 
					else{System.out.println("Ilyen parancs nincs!");} 
					}catch (Exception e){
						System.out.println("Ilyen parancs nincs!");
					}
			}
			
			else if (elozo=="3:0") {
				System.out.println("[1] Film t�rl�se \n"
						+ "[2] Sorozat t�rl�se \n"
						+ "[3] Vissza a f�men�be");
				try {
					int beker= input.nextInt();
					
					if (beker==1) {} 
					else if(beker==2) {} 
					else if(beker==3) {elozo="0:0";} 
					else{System.out.println("Ilyen parancs nincs!");} 
					}catch (Exception e){
						System.out.println("Ilyen parancs nincs!");
					}
			}
			else if (elozo=="4:0") {
				try {
					 
					}catch (Exception e){
						System.out.println("Hib�s input!");
					}
				
			}
			else if (elozo=="5:0") {
				System.out.println("A program bez�r.");
				break;
			}
		
		}	
	}

}

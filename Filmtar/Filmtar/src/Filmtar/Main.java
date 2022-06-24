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
				System.out.println("[1] Film/sorozat hozzáadása \n"
						+ "[2] Filmek/sorozatok listázása év/mûfaj alapján \n"
						+ "[3] Film/sorozat törlése \n"
						+ "[4] Név szerinti keresés \n"
						+ "[5] Mentés és kilépés");
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
				System.out.println("[1] Film hozzáadása \n"
						+ "[2] Sorozat hozzáadása \n"
						+ "[3] Vissza a fõmenübe");
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
				System.out.println("[1] Film keresése \n"
						+ "[2] Sorozat keresése \n"
						+ "[3] Vissza a fõmenübe");
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
				System.out.println("[1] Év szerinti keresés \n"
						+ "[2] Mûfaj szerinti keresés \n"
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
				System.out.println("[1] Film törlése \n"
						+ "[2] Sorozat törlése \n"
						+ "[3] Vissza a fõmenübe");
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
						System.out.println("Hibás input!");
					}
				
			}
			else if (elozo=="5:0") {
				System.out.println("A program bezár.");
				break;
			}
		
		}	
	}

}

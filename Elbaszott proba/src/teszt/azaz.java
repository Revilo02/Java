package teszt;

import java.util.Scanner;

public class azaz {
	static public void benne() {
		Scanner sc=new Scanner(System.in);
		//String cmd=sc.nextLine();
		while (true) {
			String cmd=sc.nextLine();

			if (cmd.equals("1")){
				azaz1();
				
			}
			if (cmd.equals("2")){
				break;
			}
			System.out.println("Benne");
		}
				
	}
	static public void azaz1() {
		Scanner sc=new Scanner(System.in);
		while (true) {
			String cmd=sc.nextLine();
			
			if (cmd.equals("1")){
				benne();
			}
			if (cmd.equals("2")){
				break;
			}
			System.out.println("Azaz");
		}
				
	}
	static public void main(String[] args) {
		benne();
	}
}

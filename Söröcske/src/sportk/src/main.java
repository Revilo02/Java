package sportk.src;

import java.util.Scanner;

public class main {
	static public void main(String[] args)
	{
		Sportolok s1= new Sportolok("Nagy Jakab",2000,"njakab@gmail.com");
		Sportolok s2= new Sportolok("Fehér Jázmin",1997,"feher97@gmail.com");
		
		Tanar t1= new Tanar("Rend Elek",1991,"rendel@gmail.com");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Sajt");
		while(true) {
			String line=s.nextLine();
			String[] cmd = line.split(" ");
			if(cmd[0].equals("exit")) {
				s.close();
			}
			
		}

	}
}


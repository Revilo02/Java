package Labor;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
public class Main {
	
	protected static File wd = new File(System.getProperty("user.dir"));
	protected static File [] pwd() {
		
		
		
        File[] fa = wd.listFiles();
		//System.out.println(wd+" "+fa.length);
		return fa;
	}
	
	protected static void ls(String s)  {
		if(s.equals("f")) {
	        String[] pathnames;

	        File f = wd;
	        pathnames = f.list();
	        for (String pathname : pathnames) {
	            
	            System.out.println(pathname);
	        }
	     }
		 if(s.equals("d")) {
	    
			for (int i=0;i<pwd().length;i++) {
				 if(pwd()[i].isDirectory()) {
					 System.out.println(pwd()[i]);
				 }
			 }
	    }
}
	protected static void cd(String s) {
		if(s.equals("..")) {
			wd = wd.getParentFile();
			return;
		}
		File[] fileok2 = wd.listFiles();
		//System.out.println(fileok2.length);
		for (int i = 0; i < fileok2.length; i++) {

			if (fileok2[i].getName().equals(s)) {
				wd = fileok2[i];
				return;
			}
		}
		System.out.println("Nem letezo mappa!");
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true){
			String l=sc.nextLine();
			String cmd[]=l.split(" ");
			if (cmd[0].equals("exit")){
				sc.close();
				break;
			
			}
			else if(cmd[0].equals("pwd")) {
				pwd( );
			}
			else if(cmd[0].equals("ls")) {
				ls(cmd[1]);
			}else if(cmd[0].equals("cd")) {
				cd(cmd[1]);
			}
		}
	}
}

package Filmtar;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static File kezsites(File fajl) {
	try {
		 File myObj = new File("adatok.txt");
	     if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	     } else {
	        System.out.println("File already exists.");}}
	 	catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	return fajl;
	}
}

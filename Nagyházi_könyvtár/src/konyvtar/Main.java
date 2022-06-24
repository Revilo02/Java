package konyvtar;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class Main{
	
	static public void main(String[] args) throws Exception {
		try{IO.beolvas("Könyvek.txt");IO.beolvas("Olvasok.txt");}catch ( FileNotFoundException e) {
			  System.err.println(e.getMessage());}
		
		Scanner sc=new Scanner(System.in);
	
		while(true) {

			Menu.Fomenu();
			System.out.println();
			String cmd = sc.nextLine();
			
			if(cmd.equals("9")) {
				sc.close();
				break;
			} else if(cmd.equals("0")) {
				Parancsok.Letrehoz();
			} else if(cmd.equals("1")) {
				try{Parancsok.DeleteBook();}
				catch (BookNotFoundException e) {
					  System.err.println(e.getMessage());}
				catch (IDNotFoundException e) {
					System.err.println(e.getMessage());
				}
			} else if(cmd.equals("2")) {
				try{Parancsok.Bookmodify();}
				catch (BookNotFoundException e) {
					  System.err.println(e.getMessage());
				}catch (IDNotFoundException e) {
					System.err.println(e.getMessage());
				}
			} else if(cmd.equals("3")) {
				try{Parancsok.KonyvKiad();}
				catch (BookNotFoundException e) {
					  System.err.println(e.getMessage());}
				catch (IDNotFoundException e) {
					System.err.println(e.getMessage());
				}
				catch (ReaderNotFoundException e) {
					  System.err.println(e.getMessage());}
				catch (ReaderIDNotFoundException e) {
					  System.err.println(e.getMessage());}
			}else if(cmd.equals("4")) {
				try{Parancsok.KonyvVisszavesz();}
				catch (NotOwnerException e) {
					  System.err.println(e.getMessage());}
			}else if(cmd.equals("5")){
				try{Parancsok.Booksearch();}
				catch (BookNotFoundException e) {
					  System.err.println(e.getMessage());}
			}else if(cmd.equals("6")){
				Parancsok.OlvasoLetrehoz();
			}else if(cmd.equals("7")){
				try{Parancsok.Olvasomodify();}
				catch (ReaderNotFoundException e) {
					  System.err.println(e.getMessage());}
				catch (ReaderIDNotFoundException e) {
					  System.err.println(e.getMessage());}
			}else if(cmd.equals("8")){
				IO.Fajlbair();
			}
			System.out.println();
		}

		
	}
}



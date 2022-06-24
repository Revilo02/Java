package konyvtar;

import java.util.ArrayList;

public class Tarolo {
	/**
	 * K�nyveket t�rol� ArrayList minden k�nyvel kapcsolatos m�velet ezen a list�n t�rt�nik
	 */
	private static ArrayList<Konyvek> books=new ArrayList<Konyvek>();
	/**
	 * Olvas�kat t�rol� ArrList minden olvas�val kapcsolatos m�velet ezen a list�n t�rt�nik
	 */
	 private static ArrayList<Latogato> latogatok=new ArrayList<Latogato>();
	 
	 public static ArrayList<Konyvek> getBooksList() {return books;}
	 public static ArrayList<Latogato> getLatogatoList(){return latogatok;}
	 /***
	  * 
	  * @param  eg�sz sz�mot v�r el bemenetnek majd a lista i. elem�t t�rli 
	  */
	 public static void removeBooks(int i) {
		 books.remove(i);
	 }
	 /**
	  * 
	  * @param eg�sz sz�mot v�r el bemenetnek majd a lista i. elem�t t�rli 
	  */
	 public static void removeLatogato(int i) {
		 latogatok.remove(i);
	 }
	 /**
	  * 
	  * @param K�nyv t�p�s� objektumot v�r el bemenetnek amit hozz�f�z majd a K�nyvek list�hoz
	  */
	 public static void addBook(Konyvek k) {
		books.add(k); 
	 }
	 /**
	  * 
	  * @param latogat� t�p�s� objektumot v�r el bemenetnek amit hozz�f�z majd a l�togat�k list�hoz
	  */
	 public static void addLatogato(Latogato l) {
		 latogatok.add(l);
	 }
	 /**
	  * 
	  * @param eg�sz sz�mot v�r el bemenetnek 
	  * @return visszat�r a k�nyvek lista i. elem�vel
	  */
	 public static Konyvek getBooksElement(int i) {
		 return books.get(i);
	 }
	 /**
	  * 
	  * @param eg�sz sz�mot v�r el param�ter�l ami a lista i. elem�t fogja visszaadni
	  * @return visszat�r a lista i. elem�vel
	  */
	 public static Latogato getLatogatokElement(int i) {
		 return latogatok.get(i);
	 }
	 /**
	  * 
	  * @return visszat�r a l�togat�kat tartalmaz� lista elemeivel
	  */
	 public static int LatogtoListSize() {
		 return latogatok.size();
	 }
	 /**
	  * 
	  * @return visszat�r a K�nyveket tartalmaz� lista elemeivel
	  */
	 public static int BooksListSize() {
		 return books.size();
	 }
}

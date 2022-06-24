package konyvtar;

import java.util.ArrayList;

public class Tarolo {
	/**
	 * Könyveket tároló ArrayList minden könyvel kapcsolatos mûvelet ezen a listán történik
	 */
	private static ArrayList<Konyvek> books=new ArrayList<Konyvek>();
	/**
	 * Olvasókat tároló ArrList minden olvasóval kapcsolatos mûvelet ezen a listán történik
	 */
	 private static ArrayList<Latogato> latogatok=new ArrayList<Latogato>();
	 
	 public static ArrayList<Konyvek> getBooksList() {return books;}
	 public static ArrayList<Latogato> getLatogatoList(){return latogatok;}
	 /***
	  * 
	  * @param  egész számot vár el bemenetnek majd a lista i. elemét törli 
	  */
	 public static void removeBooks(int i) {
		 books.remove(i);
	 }
	 /**
	  * 
	  * @param egész számot vár el bemenetnek majd a lista i. elemét törli 
	  */
	 public static void removeLatogato(int i) {
		 latogatok.remove(i);
	 }
	 /**
	  * 
	  * @param Könyv típúsú objektumot vár el bemenetnek amit hozzáfûz majd a Könyvek listához
	  */
	 public static void addBook(Konyvek k) {
		books.add(k); 
	 }
	 /**
	  * 
	  * @param latogató típúsú objektumot vár el bemenetnek amit hozzáfûz majd a látogatók listához
	  */
	 public static void addLatogato(Latogato l) {
		 latogatok.add(l);
	 }
	 /**
	  * 
	  * @param egész számot vár el bemenetnek 
	  * @return visszatér a könyvek lista i. elemével
	  */
	 public static Konyvek getBooksElement(int i) {
		 return books.get(i);
	 }
	 /**
	  * 
	  * @param egész számot vár el paraméterül ami a lista i. elemét fogja visszaadni
	  * @return visszatér a lista i. elemével
	  */
	 public static Latogato getLatogatokElement(int i) {
		 return latogatok.get(i);
	 }
	 /**
	  * 
	  * @return visszatér a látogatókat tartalmazó lista elemeivel
	  */
	 public static int LatogtoListSize() {
		 return latogatok.size();
	 }
	 /**
	  * 
	  * @return visszatér a Könyveket tartalmazó lista elemeivel
	  */
	 public static int BooksListSize() {
		 return books.size();
	 }
}

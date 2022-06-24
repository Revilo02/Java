package konyvtar;

public class IDNotFoundException extends Exception{
	
	int id;
	/**
	 * 
	 * Akkor Dobódik ez a hiba ha egy Könyvnek/olvasónak az  ID-ját nem találjuk az adatbázisban ( felhasználó által megadott ID esetén dobódhat)
	 */
	IDNotFoundException(int a){
		id =a;
	}
	 public String getMessage() {
	    	return "Ilyen ID-val rendelkezõ könyv nem található/nem módosítható az elem a keresett halmazon. ";
	   }
}

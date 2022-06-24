package konyvtar;

public class ReaderNotFoundException extends Exception {
	
	 public String getMessage() {
	    	return "Ilyen nevû olvasó nem található az adatbázisban ";
	  }
}

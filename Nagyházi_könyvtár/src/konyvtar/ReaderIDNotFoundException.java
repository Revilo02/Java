package konyvtar;

public class ReaderIDNotFoundException extends Exception {
	
	 public String getMessage() {
	    	return "Ilyen ID-jú olvasó a keresett paraméterek mellett NINCS az adatbázisban ";
	  }
}

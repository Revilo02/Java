package konyvtar;

public class ReaderNotFoundException extends Exception {
	
	 public String getMessage() {
	    	return "Ilyen nev� olvas� nem tal�lhat� az adatb�zisban ";
	  }
}

package konyvtar;

public class ReaderIDNotFoundException extends Exception {
	
	 public String getMessage() {
	    	return "Ilyen ID-j� olvas� a keresett param�terek mellett NINCS az adatb�zisban ";
	  }
}

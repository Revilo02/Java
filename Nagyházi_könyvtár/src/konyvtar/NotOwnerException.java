package konyvtar;

public class NotOwnerException extends Exception {
	  public String getMessage() {
	    	return "Nem birtokol könyvet";
	    }
	    
}

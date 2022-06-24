package konyvtar;

public class BookNotFoundException extends Exception{
	String s;
	/**
	 * 
	 * @ akkor dobódik ez a hiba ha a könyvet valamilyenn keresési /módosítási kisérlet során nem találjuk az adatbázisban
	 */
	BookNotFoundException(String s ){
	this.s=s;
	}
    public String getMessage() {
    	return "Ilyen címmel könyv nem található";
    }
    
}

package konyvtar;

public class BookNotFoundException extends Exception{
	String s;
	/**
	 * 
	 * @ akkor dob�dik ez a hiba ha a k�nyvet valamilyenn keres�si /m�dos�t�si kis�rlet sor�n nem tal�ljuk az adatb�zisban
	 */
	BookNotFoundException(String s ){
	this.s=s;
	}
    public String getMessage() {
    	return "Ilyen c�mmel k�nyv nem tal�lhat�";
    }
    
}

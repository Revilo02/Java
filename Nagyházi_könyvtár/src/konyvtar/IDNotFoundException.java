package konyvtar;

public class IDNotFoundException extends Exception{
	
	int id;
	/**
	 * 
	 * Akkor Dob�dik ez a hiba ha egy K�nyvnek/olvas�nak az  ID-j�t nem tal�ljuk az adatb�zisban ( felhaszn�l� �ltal megadott ID eset�n dob�dhat)
	 */
	IDNotFoundException(int a){
		id =a;
	}
	 public String getMessage() {
	    	return "Ilyen ID-val rendelkez� k�nyv nem tal�lhat�/nem m�dos�that� az elem a keresett halmazon. ";
	   }
}

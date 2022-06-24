package konyvtar;

import java.util.Comparator;
/**
 * 
 * @return ID-k alapján szûr ugyanazon logika mentén mint az Author Comparator csak számokkal
 *@parameters két könyvet vesz át a függvény attribótumul
 */
public class IDComparator implements Comparator<Konyvek> {
	public int compare(Konyvek b1, Konyvek b2){
		Double n1 = (double) b1.getID();
		Double n2 = (double) b2.getID();
	return n1.compareTo(n2);
	}
}
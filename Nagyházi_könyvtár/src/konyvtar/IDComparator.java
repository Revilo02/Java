package konyvtar;

import java.util.Comparator;
/**
 * 
 * @return ID-k alapj�n sz�r ugyanazon logika ment�n mint az Author Comparator csak sz�mokkal
 *@parameters k�t k�nyvet vesz �t a f�ggv�ny attrib�tumul
 */
public class IDComparator implements Comparator<Konyvek> {
	public int compare(Konyvek b1, Konyvek b2){
		Double n1 = (double) b1.getID();
		Double n2 = (double) b2.getID();
	return n1.compareTo(n2);
	}
}
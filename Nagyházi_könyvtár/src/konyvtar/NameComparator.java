package konyvtar;

import java.util.Comparator;
/**
	/**
	 * Könyveket rendez mûfaj szerint a függvény
	 * @param két könyvet vesz át attribótumául a függvény
	 * @return egész számmal tér vissza ami reprezentálja hogy az elsõ vagy a második könyv van elõrébb az ABC sorrend alapján névvel való rendezés miatt
	 */
 
public class NameComparator implements Comparator<Konyvek> {
	public int compare(Konyvek b1, Konyvek b2){
	return b1.getName().compareTo(b2.getName());
	}
}

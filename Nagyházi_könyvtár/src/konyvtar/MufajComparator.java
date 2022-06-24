package konyvtar;

import java.util.Comparator;

public class MufajComparator implements Comparator<Konyvek> {
	/**
	 * Könyveket rendez mûfaj szerint a függvény
	 * @param két könyvet vesz át attribótumául a függvény
	 * @return egész számmal tér vissza ami reprezentálja hogy az elsõ vagy a második könyv van elõrébb az ABC sorrend alapján való mûfaj rendezés miatt
	 */
	public int compare(Konyvek b1, Konyvek b2){
	return b1.getMufaj().compareTo(b2.getMufaj());
	}
}

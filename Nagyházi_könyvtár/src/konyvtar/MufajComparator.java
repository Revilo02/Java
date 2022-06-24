package konyvtar;

import java.util.Comparator;

public class MufajComparator implements Comparator<Konyvek> {
	/**
	 * K�nyveket rendez m�faj szerint a f�ggv�ny
	 * @param k�t k�nyvet vesz �t attrib�tum�ul a f�ggv�ny
	 * @return eg�sz sz�mmal t�r vissza ami reprezent�lja hogy az els� vagy a m�sodik k�nyv van el�r�bb az ABC sorrend alapj�n val� m�faj rendez�s miatt
	 */
	public int compare(Konyvek b1, Konyvek b2){
	return b1.getMufaj().compareTo(b2.getMufaj());
	}
}

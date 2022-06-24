package konyvtar;

import java.util.Comparator;
/**
	/**
	 * K�nyveket rendez m�faj szerint a f�ggv�ny
	 * @param k�t k�nyvet vesz �t attrib�tum�ul a f�ggv�ny
	 * @return eg�sz sz�mmal t�r vissza ami reprezent�lja hogy az els� vagy a m�sodik k�nyv van el�r�bb az ABC sorrend alapj�n n�vvel val� rendez�s miatt
	 */
 
public class NameComparator implements Comparator<Konyvek> {
	public int compare(Konyvek b1, Konyvek b2){
	return b1.getName().compareTo(b2.getName());
	}
}

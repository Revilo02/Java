package konyvtar;

import java.util.Comparator;

 /**
  * 
  * @author Ez a f�ggv�ny eld�nti k�t k�nyv szerz� ABC-ben elfoglalt sorrendje alapj�n hogy melyik legyen el�bb
  * @return Visszat�r�si �rt�k 0 eset�n megegyezik egy �s m�nusz egy eset�n  az egyik nagyobb a m�sikn�l
  *
  */
public class AuthorComparator implements Comparator<Konyvek> {
		public int compare(Konyvek b1, Konyvek b2){
		return b1.getSzerzo().compareTo(b2.getSzerzo());
		}
}

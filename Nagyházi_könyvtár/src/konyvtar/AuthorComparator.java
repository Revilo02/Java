package konyvtar;

import java.util.Comparator;

 /**
  * 
  * @author Ez a függvény eldönti két könyv szerzõ ABC-ben elfoglalt sorrendje alapján hogy melyik legyen elõbb
  * @return Visszatérési érték 0 esetén megegyezik egy és mínusz egy esetén  az egyik nagyobb a másiknál
  *
  */
public class AuthorComparator implements Comparator<Konyvek> {
		public int compare(Konyvek b1, Konyvek b2){
		return b1.getSzerzo().compareTo(b2.getSzerzo());
		}
}

package Beer;

import java.util.Comparator;

public class StrengthComparator implements Comparator<Beer> {
		public int compare(Beer b1, Beer b2){
		Double n1 = b1.getStrength();
		Double n2 = b2.getStrength();
		return n1.compareTo(n2);
		}
}
package S;

import java.util.Comparator;

public class StyleComparator implements Comparator<Beer> {
		public int compare(Beer b1, Beer b2){
		return b1.getStyle().compareTo(b2.getStyle());
		}
}
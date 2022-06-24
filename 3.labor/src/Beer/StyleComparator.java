package Beer;
import java.util.*;
public class StyleComparator implements Comparator<Beer> {
	public int compare(Beer o1, Beer o2) {
		return o1.getType().compareTo(o2.getType());
	}

}

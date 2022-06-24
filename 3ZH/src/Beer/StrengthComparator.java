package labor8;

import java.util.Comparator;

public class StrengthComparator implements Comparator<Beer>
{

	@Override
	public int compare(Beer o1, Beer o2) {
		Double a = o1.getStrength();
		Double b = o2.getStrength();
		return a.compareTo(b);
	}


}

package konyvtar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

public class NameComparatorTest {
	ArrayList<Konyvek> params = new ArrayList<Konyvek>();
	@Before
	public void setUp() {
		
		params.add(new Konyvek("Könyv1", "cim1", "cim2", 0));
		params.add( new Konyvek("Könyv2", "cim3", "cim3", 0));
		params.add( new Konyvek("Könyv1", "cim1", "cim2", 0));
		params.add(new Konyvek("Könyv3", "cim1", "cim2", 0));
		params.add(new Konyvek("Könyvs", "cim1", "cim2", 0));
		
	}
	@Test
	public void testEqual() {
	    
		Collections.sort(params, new NameComparator());
		assertTrue("expected to be equal", params.get(0).getName().equals(params.get(1).getName()));
		Assert.assertEquals(false,params.get(0).getName().equals(params.get(3).getName()));

	}
	

	
}

	


package masodik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FractionTest {

/*	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}*/

	Fraction f1, f2;
	 @Before
	 public void setUp() {
	 f1 = new Fraction(5,2);
	 f2 = new Fraction(3,2);
	 }
	 @Test
	 public void testAdd() {
	 f1 = f1.Add(f2);
	 	assertEquals("add f1.num", 8, f1.getNum());
	 	assertEquals("add f1.den", 2, f1.getDen());
	 	assertEquals("add f2.num", 3, f2.getNum());
	 	assertEquals("add f2.den", 2, f2.getDen());
	 }
	private void assertEquals(String string, int i, int num) {
		// TODO Auto-generated method stub
		
	}
}




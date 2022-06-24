package konyvtar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

public class KönyvekTest {
	
	Konyvek k;
	
	@Before
	public void setUp() {
		k=new Konyvek("Egri csillagok","Gárdonyi Géza","Történelmi",1994);
	
	}

	@Test
	public void testGetName() {
		String name="Egri csillagok";
		Assert.assertEquals(name, k.getName());
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testSetID() {
		int a=5;
		k.setID(a);
		Assert.assertEquals(k.getID(),a);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void ToString() {
		String a="1, Egri csillagok, Gárdonyi Géza, Történelmi, 1994, Még nincs leírás hozzáadva";
		Assert.assertEquals(a,k.toString());
	}
	@Test
	public void setLeiras() {
		k.setLeiras("Ez egy tesztleírás");
		Assert.assertEquals(k.getLeiras(), "Ez egy tesztleírás");
	}
	@Test
	public void legyenmegatizediktesztvegre() {
		k.setSzerzo("Megvan a tizedik JUnit teszt véééééégre");
		Assert.assertEquals(k.getSzerzo(), "Megvan a tizedik JUnit teszt véééééégre");
	}
}
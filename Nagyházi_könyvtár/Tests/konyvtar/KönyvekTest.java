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

public class K�nyvekTest {
	
	Konyvek k;
	
	@Before
	public void setUp() {
		k=new Konyvek("Egri csillagok","G�rdonyi G�za","T�rt�nelmi",1994);
	
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
		String a="1, Egri csillagok, G�rdonyi G�za, T�rt�nelmi, 1994, M�g nincs le�r�s hozz�adva";
		Assert.assertEquals(a,k.toString());
	}
	@Test
	public void setLeiras() {
		k.setLeiras("Ez egy tesztle�r�s");
		Assert.assertEquals(k.getLeiras(), "Ez egy tesztle�r�s");
	}
	@Test
	public void legyenmegatizediktesztvegre() {
		k.setSzerzo("Megvan a tizedik JUnit teszt v������gre");
		Assert.assertEquals(k.getSzerzo(), "Megvan a tizedik JUnit teszt v������gre");
	}
}
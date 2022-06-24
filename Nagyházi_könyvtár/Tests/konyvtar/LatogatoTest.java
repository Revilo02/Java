package konyvtar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class LatogatoTest {
	Konyvek k;
	Konyvek k2;
	Latogato l;
	Latogato l1;
	@Before
	public void setUp() {
		l1=new Latogato("Tesztalany","nincsen mert bez�rtuk");;
		l=new Latogato("Albert Einstein","Einstein@einsten.einstein");
		k=new Konyvek("Relativit�s elm�let","Einstein","Tudom�nyos",1940);
		k2=new Konyvek("Relativit�s elm�let visszav�g","Einstein","Tudom�nyos",1940);
	}
	@Test
	public  void testToString() {
	Assert.assertEquals("171, Tesztalany, nincsen mert bez�rtuk",l1.toString());
	}
	@Test
	public final void testNamemodosit() {
		l.namemodosit("Albert");
	    Assert.assertEquals("Albert", l.getName());
	}

	@Test
	public void testElerhetosegmodosit() {
		l.elerhetosegmodosit("einstein@gmail.com");
		Assert.assertEquals(l.getElerhetoseg(),"einstein@gmail.com");
	}

	@Test
	public  void testSetID() {
		int a =l.getID();
		l.setID(170);
		Assert.assertEquals(l.getID()!=a,l.getID()==170);
	}



}

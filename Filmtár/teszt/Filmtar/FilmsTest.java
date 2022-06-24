package Filmtar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;



	

class FilmsTest {
	Films f;
	@Before	
	public void setUp() {
		f=new Films("Egri csillagok",4.5,4.5,4.5,"sajt","Történelmi");
	}
	@Test
	public void mukodj() {
		Assert.assertEquals(f.getTitle(), "Egri csillagok");
	}
}

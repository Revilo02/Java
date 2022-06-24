package junitbuli;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

public class test {

	double a;
	double b;
	Calculator calc;
	public CalculatorTest(double a, double b) {
	this.a = a;
	this.b = b;
	}
	@Before
	public void setUp() {
	calc = new Calculator();
	}
	@Test
	public void testMultiply() {
	double result = calc.multiply(a, b);
	Assert.assertEquals(a * b, result, 0);
	}
	@Test
	public void testDivide() throws Exception {
	double result = calc.divide(a, b);
	Assert.assertEquals(a / b, result, 0);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDivideByZero() throws Exception {
	calc.divide(a, 0.0);
	}
	@Parameters
	public static List<Object[]> parameters() {
	List<Object[]> params = new ArrayList<Object[]>();
	params.add(new Object[] {0.0, 0.0});
	params.add(new Object[] {10.0, 0.0});
	params.add(new Object[] {10.0, 3.0});
	params.add(new Object[] {20.0, 4.0});
	params.add(new Object[] {40.0, 5.0});
	return params;
	}

}

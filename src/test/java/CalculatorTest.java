package test.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.flexon.calc.Calculator1;




//since class methods and variables are static I can use that here without instantiating

public class CalculatorTest {
	
	@ Test
	public void testSum() {
	    System.out.println("Sum");
	    Integer x = 15;
	    Integer y = 15;
	    Integer expResult = 30;
	    Integer result = Calculator1.sum(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator1.sum(15, null));
	    assertEquals(null, Calculator1.sum(null, 15));
	    assertEquals(null, Calculator1.sum(null, null));
	  }
	
	@ Test
	public void testdiff() {
	    System.out.println("Difference");
	    Integer x = 15;
	    Integer y = 15;
	    Integer expResult = 0;
	    Integer result = Calculator1.difference(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator1.difference(15, null));
	    assertEquals(null, Calculator1.difference(null, 15));
	    assertEquals(null, Calculator1.difference(null, null));
	  }
	
	@ Test
	public void testmultiply() {
	    System.out.println("Multiply");
	    Integer x = 5;
	    Integer y = 5;
	    Integer expResult = 25;
	    Integer result = Calculator1.multiply(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator1.multiply(5, null));
	    assertEquals(null, Calculator1.multiply(null, 5));
	    assertEquals(null, Calculator1.multiply(null, null));
	  }
	
	@Test
	public void testdivision() {
	    System.out.println("Division");
	    Integer x = 15;
	    Integer y = 1;
	    Integer expResult = 15;
	    Integer result = Calculator1.division(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator1.division(15, null));
	    assertEquals(null, Calculator1.division(null, 15));
	    assertEquals(null, Calculator1.division(null, null));
	  }
	
	
	}

package test.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.flexon.calc.Calculator;




//since class methods and variables are static I can use that here without instantiating

public class CalculatorTest {
	
	@ Test
	public void testSum() {
	    System.out.println("Sum");
	    Integer x = 15;
	    Integer y = 15;
	    Integer expResult = 30;
	    Integer result = Calculator.sum(x, y);
	    assertEquals(expResult, result);
	 //   assertEquals(null, Calculator1.sum(15, null));
	 //   assertEquals(null, Calculator1.sum(null, 15));
	 //   assertEquals(null, Calculator1.sum(null, null));
	  }
	
	@ Test
	public void testdiff() {
	    System.out.println("Difference");
	    Integer x = 15;
	    Integer y = 15;
	    Integer expResult = 0;
	    Integer result = Calculator.difference(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator.difference(15, null));
	    assertEquals(null, Calculator.difference(null, 15));
	    assertEquals(null, Calculator.difference(null, null));
	  }
	
	@ Test
	public void testmultiply() {
	    System.out.println("Multiply");
	    Integer x = 5;
	    Integer y = 5;
	    Integer expResult = 25;
	    Integer result = Calculator.multiply(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator.multiply(5, null));
	    assertEquals(null, Calculator.multiply(null, 5));
	    assertEquals(null, Calculator.multiply(null, null));
	  }
	
	@Test
	public void testdivision() {
	    System.out.println("Division");
	    Integer x = 15;
	    Integer y = 1;
	    Integer expResult = 15;
	    Integer result = Calculator.division(x, y);
	    assertEquals(expResult, result);
	    assertEquals(null, Calculator.division(15, null));
	    assertEquals(null, Calculator.division(null, 15));
	    assertEquals(null, Calculator.division(null, null));
	  }
	
	
	
}

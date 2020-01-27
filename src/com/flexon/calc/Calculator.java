package com.flexon.calc;
import java.util.*;

public class Calculator {
	
	private static int firstnumber=8;
	private static int secondnumber=4;
	
	public static Integer sum(Integer x, Integer y)
	{
	 if (x == null || y == null)
	 return null;
	// System.out.println(x+y);
	 return x + y;
		}
	
	public static Integer difference(Integer x, Integer y)
	{
	 if (x == null || y == null)
	 return null;
	 return x - y;
	}
	
	public static Integer multiply(Integer x, Integer y)
	{
		 if (x == null || y == null)
		 return null;
		 return x * y;
		}

	public static Integer division(Integer x, Integer y)
	{
		 if (x == null || y == null)
		 return null;
		 return x / y;
		} 

	public static void calculator() {
	    System.out.println("Basic calculator");
	    System.out.println("1. Addition");
	    System.out.println("2. Subtraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.println("Choose one:");
	
}
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 calculator();
		 int choice = input.nextInt();
		 input.close();
		 switch(choice){
		 case 1:
			   System.out.println(sum(firstnumber,secondnumber));
			    break;
		 case 2:
			   System.out.println(difference(firstnumber,secondnumber));
			    break;
		 case 3: 
			 System.out.println(multiply(firstnumber,secondnumber));
			    break;
		 case 4:
			 System.out.println(division(firstnumber,secondnumber));
			    break;
		 default:
			    System.out.println("Wrong Choice");
		    	break;
		 }
	 }
		 
	}
	    
	

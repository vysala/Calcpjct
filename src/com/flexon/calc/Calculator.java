package com.flexon.calc;
import java.util.*;

public class Calculator {
	
	private static int firstnumber;
	private static int secondnumber;
	
	public static int getFirstnumber() {
		return firstnumber;
	}

	public static void setFirstnumber(int firstnumber) {
		Calculator.firstnumber = firstnumber;
	}

	public static int getSecondnumber() {
		return secondnumber;
	}

	public static void setSecondnumber(int secondnumber) {
		Calculator.secondnumber = secondnumber;
	}

	
	
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

	public static void calcfunctions() {
	    System.out.println("Basic calculator");
	    System.out.println("1. Addition");
	    System.out.println("2. Subtraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.println("Choose one:");
	
}
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 calcfunctions();
		 int choice = input.nextInt();
		 //input.close();
		 System.out.println("Enter the first number");
		 int number1=input.nextInt();
		 System.out.println("Enter the second number");
		 int number2=input.nextInt();
	     	Calculator.setFirstnumber(number1);
	     	Calculator.setSecondnumber(number2);
		 switch(choice){
		 case 1:
			   System.out.println(sum(getFirstnumber(),getSecondnumber()));
			    break;
		 case 2:
			   System.out.println(difference(getFirstnumber(),getSecondnumber()));
			    break;
		 case 3: 
			 System.out.println(multiply(getFirstnumber(),getSecondnumber()));
			    break;
		 case 4:
			 System.out.println(division(getFirstnumber(),getSecondnumber()));
			    break;
		 default:
			    System.out.println("Wrong Choice");
		    	break;
		 }
	 }
		 
	}
	    
	

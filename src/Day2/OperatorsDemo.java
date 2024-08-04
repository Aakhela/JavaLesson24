package Day2;

import javax.print.DocFlavor.STRING;

public class OperatorsDemo {
	
	
	public static void main (String[] args) { 
	//Arithmetic Operators + - * / %
		int a = 20, b = 10;
		System.out.println("sum of a and b is: " + (a+b));//30
		System.out.println("sum of a and b is: " + (a+b));//30
		System.out.println("diif of a and b is: " + (a-b));//10
		System.out.println("div of a and b is: " + (a/b));//2
		System.out.println("modulous of a and b is: " + (a%b));//0
		
		
		
		// Relational/Comparison Operators > < >= <= != ==
		// Returns Booiean Value - True or false 
		
		
		//int a = 20, b = 10;
		
		System.out.println(a>b);// true
		System.out.println(a<b);//false
		System.out.println(a>=b); //true
		System.out.println(a<=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		
		//Logical Operators && || !
           //returns a booiean value
		   //works between 2 booiean values
		
		boolean x = true, y = false;
		System.out.println(x && y); // false		
		System.out.println(x || y); //true
		System.out.println(!x); // false
		System.out.println(!y); // true

	
	}
	
	
	
	
	
	
	
	

}

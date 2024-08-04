package day4;

public class ActionItem2 {

	public static void main(String[] args) {
		
		System.out.println("Factorial is: " + doFactorial (5)); 
		System.out.println("Fahrenheit value is:" + convertToFahrenheit(42));
				
		
	}
	

	public static int doFactorial (int number) {
		//declare a new int type variable
		int factorial = 1; 
		while(number > 1) {
			factorial *=number; 
			number --; 
				
			
			
			
		}
		return factorial;
	}
	
	public static double convertToFahrenheit(int celcius) {
		double fahrenheit; 
		fahrenheit = ((celcius * 9)/5) +32;
		return fahrenheit;  
	}
	
}

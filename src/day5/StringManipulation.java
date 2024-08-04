package day5;

public class StringManipulation {

	public static void main(String[] args) {
		//Strings are immutable - it can not be changed]
		String s = "Welcome 123"; //string literal
		String s2 = new String("Welcome"); // through string object
		//to learn important methods of String class
		
		//length () -- counts all the characters in a string and returns the number
		int length = s2.length(); 
		System.out.println("The length is:" + length);
		System.out.println(s.length()); //11
		//concat() join multiple strings 
		String s1 = "Welcome"; 
		String s3 = "to java"; 
		String s4 = "programming"; 
		System.out.println(s1 + s3); 
		System.out.println(s.length()); 
		s.trim();
		System.out.println(s.trim().length());
		
		//charAt()-- return a single character our of a sting from a specific index 
		
			s = "Java Selenium"	; 
			System.out.println(s.charAt(5)); 
			System.out.println(s.charAt(5)); 
// contains()--returns a boolean(true/false)
			//check a string is the part of the main string or not 
			
			System.out.println(s.contains("Jav")); //true
			System.out.println(s.contains("Sel")); //true
			System.out.println(s.concat("ium")); //true 
			System.out.println(s.contains("Sli")); //false 
			System.out.println(s.contains("a S")); //true 
			
			//equals (), equalsIgnorecase() ---> compares two strings and return true/false
			s1 = "welcome"; 
			s2 = "Welcome"; 
			System.out.println(s1.equals("welcome")); // false
			System.out.println(s1.equalsIgnoreCase(s2)); //true
			
			//replace () - it replaces a single character or character sequence
			s= "welcome to java selenium automattion"; 
			System.out.println(s.replace("w", "W")); 
			System.out.println(s.replace("java","Java")); 
			
			//substring()-- ectracts substring from the main string

	}
	
	
	
	
	
	
	
}

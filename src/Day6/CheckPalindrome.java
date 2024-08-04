package Day6;

public class CheckPalindrome {
//Q6. Remove Junk or Special character from a String.
	public static void main(String[] args) {
		//Q5. Check to see if a string is palindrome or not
		String input = "Oracle"; 
		System.out.println("Given string is a palindrome=" +isPalindrome(input)); 
		String doubtfullInput = "This is my string with special characters: _*&^%$#@!"; 
		String result= doubtfullInput.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(result); 
		}
	
	public static boolean isPalindrome(String str) {
		String reversed = ""; 
		for(int i= str.length() -1; i>=0; i--) {
			reversed += str.charAt(i); 
		}
		// //boolean would give you a true or false
		// it will tell you if it is palindrome or not with this method 
	

	return str.equals(reversed); 
}
	
}

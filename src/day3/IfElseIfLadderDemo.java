package day3;

public class IfElseIfLadderDemo {

	
	public static void main(String [] args) {
		// if result -----> >=90 grade A
		//// if result <9- >=70grade B
		// if result >=60 >70 grade C
		//rest= grade F
		
		int result = 65;
		if(result<=100 && result >=90) {
			System.out.println("Grade A"); 
		} else if(result <90 && result >=70 ) {
			System.out.println("Grade B");
		
		} else if (result <70 && result >=60 ) {
			System.out.println("Grade C");
			
		} else {
		System.out.println("Grade f");
	} 

	
	}
}
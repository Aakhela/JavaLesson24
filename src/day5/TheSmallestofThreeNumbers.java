package day5;

public class TheSmallestofThreeNumbers {

	//ActionItem3 Questions 
	public static void main(String[] args) {
	int a = 89, b=67, c=37, smallest; 
	//comparing between a and b and extracting the smallest
	int temp = (a<b) ? a : b; 
	//compare temp with c and store the result 
	
	smallest= (c < temp) ? c : temp; 
	System.out.print(" The smallest number is:" + smallest);
	
	
	//more concise approach for brain storming 
	smallest= c < (a<b? a: b) ? c: (a < b ? a:b); 
	System.out.println(" The smallest number is:" + smallest ); 
}


}

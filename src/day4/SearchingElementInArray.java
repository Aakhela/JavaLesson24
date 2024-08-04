package day4;
import java.util.Scanner;
public class SearchingElementInArray {
	//SEARCHING AN ELEMENT FROM AN ARRAY
	public static void main (String[] args) {
		
		
		// create an array
		int a[]= {10,40,20,30,6050,90,80};
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please type a number to search for.");
		
		
		boolean status = false; //create a flag/status state 
		//declare a number to search for 
		int search_num = sc.nextInt(); 
		
		
		for (int i=0; i<a.length; i++) { 
			if(search_num== a[i]) {
				System.out.println("Element found!!"); 
				status = true; 
						break; 
			}
		}
		
		if(status ==false) {
			System.out.println("Sorry!!! Element not found."); 
		}
	}

}

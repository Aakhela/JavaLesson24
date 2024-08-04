package Day6;
import java.util.Arrays; 
public class SortElementOfAnArray {
public static void main(String[] args) {

	//Q3. Sort elements of an array. 
	int array[] = {89,76,2,34,5,7,56}; 
	// using predefined class
	Arrays.sort(array);
	System.out.println("Elements of array  in ascending order: "); 
	for (int value : array) {
		System.out.print(value + "     ");
	}
	
	System.out.println(); 
	sortMyarray(array);
}
//using bubble sort technique 

public static void sortMyarray(int [] givenArray) {
	int length = givenArray.length; 
	for (int i=0; i < length; i++) {
		for(int j=0; j<length; j++) {
			if(givenArray[j]>givenArray[j+1]) {
				int temp = givenArray[j];
				givenArray[j]=givenArray[j+1]; 
				givenArray[j+1] = temp;  
			}
		}
	}

	
	
	
}
	
}

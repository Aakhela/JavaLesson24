package day5;

import java.util.Arrays;

public class ReversingAnArray {
	
	public static void main(String[] args) {
		
//declaring a array and assign values 
		int a [] = {10,45,23,76,35,90,35}; 
		int size = a.length; 
		for(int i =0; i<a.length /2; i++) {
			int temp = a[i];  
			a[i] = a[size -i -1]; 
			a [size -i -1] = temp; 

}
		System.out.println("reversed array:"); 
		System.out.println(Arrays.toString(a)); 
		
}
}
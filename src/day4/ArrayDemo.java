package day4;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
	//declaring an array
	int myArray[]= new int [5];
	//assigns value to the array
	myArray [0] =10; 
	myArray[1] =20;
	myArray[2] =30;
	myArray[3]=40;
	myArray[4]=50;
	//extract value from the array
	System.out.println(myArray[4]);//50 
	//finding out length of an array - you can use the variable name 
	int length = myArray.length;
	System.out.println ("The length is " +length); 
	
	int a[] = {1, 2, 3, 4, 5}; 
	System.out.println(a[4]);
	System.out.println(Arrays.toString(myArray)); 
	
	System.out.println("*****using enhanced for loop****"); 
	//use enhanced for loop to print all the values of our of an array
	for(int mA :myArray) { 
		System.out.println(mA); 
	}
	
}
	
	
	
	
	
	
	
	
}
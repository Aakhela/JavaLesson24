package Day6;

public class ActionItem4 {
public static void main(String[] args) {
//Q1 : Find sum of elements in the int Array: 
	
/*	int [] myArray = {23,6,8,34,87,53,88};
	int sum = 0; 
	for(int value: myArray) {
		sum += value; 
	//	sum = sum +value; 
	}
	System.out.println("The sum of all the elements of myArray is: "+ sum);

*/	

	
	//Q2. Print even and odd numbers from an Array.
	int[] arr = {2,7,3,78,23,44,66,35};
for (int i=0; i<arr.length; i++) {
	if(arr[i] %  2 !=0){ 
		System.out.println(arr[i]); 
	}
}
	
System.out.println(); 
System.out.println("Print all the even numbers:");
for (int i=0; i<arr.length; i++) {
	if (arr[i] % 2==0) {
		System.out.print(arr[i] + " ");
	}
}
	
	
	
}
	
}


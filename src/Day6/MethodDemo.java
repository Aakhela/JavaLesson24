package Day6;
/*Method name is a user defined name 
 * but it should display the intent of performing an action
 * 
 * Method may or may not return any value 
 * 
 * Method may or may not accept parameters 
 * 
 * Methods can be invoked through objects 
 * 
 * A method is created to perform certain actions 
 * 
 * There are 4 Types of methods 
 */
public class MethodDemo {
//No params and no return 
	public void methodOne() {
		System.out.println("Hey we are learning method!");		
	}
// No params Retun value 
	public String methodTwo() {
String a = "Hello."; 
String b = " How are you?"; 
		return a + b ; 
	}
	//Accepts a param but does not return 
	public void methodThree(String name) {
		System.out.println(name + " , how are you? "); 
		
		
		
	}
	//Accepting paramters and returning values
	public int add(int a, int b) {
		return (a+b); 
		
	}
}

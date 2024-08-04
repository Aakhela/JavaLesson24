package day3;

public class SwitchStatementDemo {
	
	               public static void main(String[] args) {
	            	   /* =Conditional statements = 
	            	   =
	            	   =if
	            	   =if else
	            	   =switch statement
	            	 
	            	   
	            	   
	            	   =if (booieann condition)
	            	  = block of code or statemeny 
	            	   
	            	   block code or statement 
	            	   =   
	            	   )
	            	   =*/
	            	   
	            	   
	            	   
int num = 1;
switch(num) {
case 1: {
	System.out.println("Monday");
	break;
} 
case 2: {
	System.out.println("Tuesday");
	break;
}
	
case 3: {
	System.out.println("Thursday");
	break;
}
default: {
	System.out.println("This number is not any day of the week") ; 
}
}
System.out.println("Out of switch statement");	    



determineBrowser("chrome");






	               
	     }
	
	
	
	
	
	
	public static void determineBrowser(String browserName) {
		switch(browserName) {
		case "chrome": {
			System.out.println("Launch chrome browswer.");
			break;
		}
		case "firefox": {
			System.out.println("Launch firefox browswer.");
			break;
		}
	
		case "edge": {
			System.out.println("Launch edge browswer.");
			break;
		}
		
		default: {
			System.out.println("This browser is not supported");
		
		}
	}
	
	
	
	
	
	
	}	
	
	

}

package Day6;

public class ConstructerDemo {
// this program is going to give an address of a person
	//we need constructors to assign values to the variables 
	// Constructors do not have any return type and constructors may or may not have parameters w/o is default constructor 
	String name;
	String streetName; 
	int houseNumber; 
	String zipCode; 
	public ConstructerDemo(String name, String streetName, int houseNumber, String zipCode) { 
		//we use the same variable name it will refer to the class variable not local the "this" lets it be same name different variable 
		this.name = name; 
		this.streetName = streetName; 
		this.houseNumber=houseNumber; 
		this.zipCode = zipCode; 
		
	}
	public String declareAddress() {
		return (name +"/" + houseNumber + "/" +streetName + "/" + zipCode ); 
	}

}

//The customers select the items that they want from a list of products
//Your customers must be included in your system
//You keep information about your customers such as name, address, and telephone number. 
//You also assign a unique customer ID to each new customer. 
//For customers that are companies, you track a contact person and provide for a discount on company purchases. 
import java.util.Scanner;

public class Customer {
	String name;
	String address;
	long telephoneNumber;
	int id = 0;
	int[] order = new int[12];		//the actual items in the order
	
	//class constructor
	public Customer() {}
	
	public void setID() {
		id++;
	}	
	
	
	//assigns the customer's address to the field address
	public void setAddress(String custAddress) {
		address = custAddress;
	}
	
	//assigns the customer's telephone number to the field
	public void setNumber(int custNumber) {
		telephoneNumber = custNumber;
	}
	
	//assigns customer's name
	public void setName(String custName) {
		name = custName;
	}

	//gets customers info
	public void getInfo() {
		Scanner in = new Scanner(System.in);
		
		this.setID();
		
		System.out.println("Enter your name: ");
		String nameInput = in.nextLine();
		this.setName(nameInput);
		
		System.out.println("Enter your address: ");
		String addrInput = in.nextLine();
		this.setAddress(addrInput);		
		
		System.out.println("Enter your telephone number: ");
		int numInput = in.nextInt();
		this.setNumber(numInput);
	}

/*
	//prints customers info
	public void printCustomer() {
		System.out.println("\nID number: " + id);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Telephone number: " + telephoneNumber);
		
	}
*/
	
}


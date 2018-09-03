package assignment2_1;
/*
 *
 * Use the Reference Example introduced in Lesson 2 as a starting point to create your own
Customer class. A Customer has a firstName, lastName, socSecurityNum (which you can
represent as a String), a billingAddress and a shippingAddress. Define a Java class
Customer that has these attributes and has a constructor, getter, and setter methods just
like the Employee class in the Reference Example. You may re-use the Address class
from the Reference Example – billingAddress and shippingAddress should both have
type Address. Your Customer class should have a toString method that provides a string
representation of the customer. A typical toString output would be "[Joe, Smith, ssn: 332-
221-4444]".
In the main method of a Main class, create two instances of Customer (be sure to create
instances of Address to populate their billingAddress and shippingAddress fields). Add
these instances to an array. Then loop through the array and print to the console all those
Customers whose billingAddress is located in the city of Chicago (when you create
instances of Customer initially, be sure to create at least one Customer whose billing
address is in Chicago). 
 *
 */
public class Main {
	//static Customer customer;
	//static Address address;
	public static void main(String[] args) {
		
		Address addressBillAndShipping = new Address("Ohio", "first street", "#4", "343433");
		Address addressBilling = new Address("Chicago", "Central street", "#9/2", "90936");
		Address addressShipping = new Address("Chicago", "Future avenue", "#9", "90953");
		Customer[] customer = new Customer[2];
		customer[0]= new Customer("John", "Travolta", "1234567890", addressBillAndShipping, addressBillAndShipping);
		customer[1] = new Customer("Mark", "Burn", "9876543210", addressBilling, addressShipping);
		System.out.println("Hi");
		for(Customer c : customer) 
		{
			if (c.getBillingAddress().getCity().toString() == "Chicago") {
					System.out.println(c.toString());
			}
		}
		
	}
}

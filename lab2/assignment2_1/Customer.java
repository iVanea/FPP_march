package assignment2_1;

public class Customer {
	 private String firstName;
	 private String lastName;
	 private String socSecurityNum; 
	 private Address billingAddress;
	 private Address shippingAddress;
	
	 
	public Customer(String firstName, String lastName, String socSecurityNum, Address billingAddress, Address shippingAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
		this.setBillingAddress(billingAddress);
		this.setshippingAddress(shippingAddress);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", socSecurityNum=" + socSecurityNum
				+ ", billingAddress=" + billingAddress + ", shippingAddress=" + shippingAddress + "]";
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getshippingAddress() {
		return shippingAddress;
	}

	public void setshippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}



	
}

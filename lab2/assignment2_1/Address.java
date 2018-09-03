package assignment2_1;

public class Address {
	private String city;
	 private String street;
	 private String unit;
	 private String zipCode;
	public Address(String city, String street, String unit, String zipCode) {
		this.city = city;
		this.street = street;
		this.unit = unit;
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", unit=" + unit + ", zipCode=" + zipCode + "]";
	}


}

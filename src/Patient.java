
public class Patient {
	// Write a class named Patient that has fields for the following data:
	// •	First name, middle name, and last name
	// •	Street Address, city, state, and ZIP code
	// •	Phone number (example 301-123-4567)
	// •	Name and phone number of emergency contact
	String firstName;
	String middleName;
	String lastName;
	String streetAddress;
	String city;
	String state;
	String zip;
	String phNumber;
	String emergencyContactName;
	String emergencyContactPhone;
	
	// The Patient class should have: a no-arg constructor
	public Patient() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.phNumber = "";
		this.emergencyContactName = "";
		this.emergencyContactPhone = "";
	}
	
	// parametrized constructor that initializes patient’s first, middle and last name to the given values
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	// a parametrized constructor that initializes all attributes of the patient to the given values
	public Patient(String firstName, String middleName, String lastName, String streetAddress, 
			String city, String state, String zip, String phNumber, String emergencyContactName, 
			String emergencyContactPhone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phNumber = phNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhone = emergencyContactPhone;
	}
	
	// •	a mutator for each attribute - Setter (also known as Mutator):
	// A method used to modify the value of a private instance variable in a class.
	// •	an accessor for each attribute - Accessor (also known as Getter):
	// A method used to retrieve the value of a private instance variable from a class.
	//-------------
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {return firstName;}
	//-------------
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getMiddleName() {return middleName;}
	//-------------
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {return lastName;}
	//-------------
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getStreetAddress() {return streetAddress;}
	//-------------
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {return city;}
	//-------------
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {return state;}
	//-------------
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZip() {return zip;}
	//-------------
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getPhNumber() {return phNumber;}
	//-------------
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	public String getEmergencyContactName() {return emergencyContactName;}
	//-------------
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}
	public String getEmergencyContactPhone() {return emergencyContactPhone;}
	
	// •	a method name buildFullName that returns a String which is the concatenation 
	// of first, middle and last name separated by space.
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	// •	a method named buildAddress that returns a String which is the concatenation 
	// of address, city, state and zip separated by space. 
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zip;
	}
	
	//•	a method named buildEmergencyContact that returns a String which is the concatenation of 
	// emergency name and emergency phone separated by space.
	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhone;
	}
	
	// •	a toString method that display all information of a patient; use the above build methods in your 
	// toString method to display the information.
	public String toString() {
		return "\tName: " + buildFullName() + 
				"\n\tAddress: " + buildAddress()+
				"\n\tPhone Number: " + phNumber 
				+ "\n\tEmergency Contact: " + buildEmergencyContact();
	}
}

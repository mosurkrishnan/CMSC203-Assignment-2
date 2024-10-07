# CMSC203-Assignment-2
PatientDriverApp Class, Patient Class, &amp; Procedure Class
Patient Class:
Patient Class:
Write a class named Patient that has fields for the following data:
•	First name, middle name, and last name
•	Street Address, city, state, and ZIP code
•	Phone number (example 301-123-4567)
•	Name and phone number of emergency contact

The Patient class should have:
•	a no-arg constructor
•	a parametrized constructor that initializes patient’s first, middle and last name to the given values
•	a parametrized constructor that initializes all attributes of the patient to the given values
•	an accessor for each attribute
•	a mutator for each attribute 
•	a method name buildFullName that returns a String which is the concatenation of first, middle and last name separated by space.
•	a method named buildAddress that returns a String which is the concatenation of address, city, state and zip separated by space. 
•	a method named buildEmergencyContact that returns a String which is the concatenation of emergency name and emergency phone separated by space.
•	a toString method that display all information of a patient; use the above build methods in your toString method to display the information.
Procedure Class:
Write a class named Procedure that represents a medical procedure that has been performed on a patient. The Procedure class should have fields for the following data:
•	Name of the procedure
•	Date of the procedure (for example 06/12/2023)
•	Name of the practitioner who performed the procedure.
•	Charges for the procedure
The Procedure class should have:
•	a no-arg constructor
•	a parametrized constructor that initializes procedure’s name and date to the given values
•	a parametrized constructor that initializes all attributes of the procedure to the given values
•	an accessor for each attribute
•	a mutator for each attribute 
•	a toString method that display all information of a procedure
PatientDriverApp Class:
Create a class name PatientDriverApp that creates an instance of the Patient class, initialized with sample data that a user entered from keyboard. Then, create three instances of the Procedure class. Make sure to create each instance using one of each constructor. Note that if you create an instance using constructors other than the one that initializes all attributes, you must set the values of all attributes.

The class should have the following methods:
•	displayPatient: This method given a patient object will display patient’s information.
•	displayProcedure: This method given a procedure object will display procedure’s information.
•	calculateTotalCharges: this method takes three procedures as parameter and returns the total charges of these procedures.
A sample screenshot has been provided for more details.

The program should display the following information:
•	the patient’s information
•	information about all three of the procedures, each procedure is displayed tab separated.
•	the total charges of the three procedures displayed in comma separated with two decimal points.

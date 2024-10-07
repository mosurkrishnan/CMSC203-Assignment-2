import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor:
 * Description: write a prgram with 3 classes : a) main - PatientDriver App, b) Patient and c) Procedure
 * prints out patient data input, with 3 procedures (name, date of procedure, practitioner name, cost of charge
 * Due: 10/1/2024
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chandra S. Krishnan
*/

public class PatientDriverApp {

	public static void main(String[] args) {
		Scanner keypad = new Scanner(System.in);

        // Create a patient object using user input
        System.out.print("Enter patient first name: ");
        String firstName = keypad.nextLine();

        System.out.print("Enter patient middle name: ");
        String middleName = keypad.nextLine();

        System.out.print("Enter patient last name: ");
        String lastName = keypad.nextLine();

        System.out.print("Enter patient street address: ");
        String streetAddress = keypad.nextLine();
        
        System.out.print("Enter patient city: ");
        String city = keypad.nextLine();

        System.out.print("Enter patient state: ");
        String state = keypad.nextLine();

        System.out.print("Enter patient ZIP code: ");
        String zip = keypad.nextLine();

        System.out.print("Enter patient phone number: ");
        String phNumber = keypad.nextLine();

        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = keypad.nextLine();

        System.out.print("Enter emergency contact phone number: ");
        String emergencyContactPhone = keypad.nextLine();
        
        keypad.close();
        
        // creates an instance of the Patient class, initialized with sample data that a user 
        // entered from keyboard. 
        //WE ARE USING 1ST CONSTRUCTOR IN THIS CASE - WITHIN PATIENT.JAVA
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city,
        		state, zip, phNumber, emergencyContactName, emergencyContactPhone);
               
        //create three instances of the Procedure class. Make sure to create each instance 
        // USING ONE OF EACH CONSTRUCTOR. Note that if you create an instance using constructors other 
        // than the one that initializes all attributes, you must set the values of all attributes.
        
        //using no-arg constructor for 1st instance
        Procedure procedure1 = new Procedure("Physical Exam", "07/20/2019", "Dr. Irvine", 3250.00);
        
        // using 2nd constructor in this case
        // Dr's name and charges are being sent thru SETTER or MUTATOR
        Procedure procedure2 = new Procedure("X-Ray", "07/20/2019");
        procedure2.setPractitionerName("Dr. Jameson");
        procedure2.setProcedureCharges(5500.43);

        // BYPASS CONSTRUCTOR - Set each individually thru SETTER
        Procedure procedure3 = new Procedure();
        procedure3.setProcedure("Blood Test");
        procedure3.setDateOfProcedure("07/20/2019");
        procedure3.setPractitionerName("Dr. Smith");
        procedure3.setProcedureCharges(1400.75);
        
        // DISPLAYING PATINET INFO
        displayPatient(patient);
        
        // DISPLAYING 3 PROCEDURES
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);
        
        // CALCULATING AND DISPLAY OF TOTAL CHARGE
        double totalCharge = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("\nTotal Charges: $" + String.format("%,.2f", totalCharge));
        
        System.out.println("\nStudent Name: Chandra S. Krishnan");
        System.out.println("MC#: 212059975, CMSC 203 Student");
        System.out.println("Due Date: 10/1/2024");
             

	}
	
	// Create 3 methods - METHOD 1 - DISPLAYINFO
    // Using "Patient.java" toString Method

		public static void displayPatient(Patient patient) {
			System.out.println("Patient Information: ");
	        System.out.println(patient.toString());	
		}
	
	// METHOD 2 - DISPLAYPROCEDURE
	    public static void displayProcedure(Procedure procedure) {
	    	 
		        System.out.println(procedure.toString());
	    }
	    
	 // METHOD 3 - calculateTotalCharges
	    public static double calculateTotalCharges(Procedure procedure1, 
	    		Procedure procedure2, Procedure procedure3) {
	        return procedure1.getProcedureCharges()+ procedure2.getProcedureCharges()
	        + procedure3.getProcedureCharges();
	    }
	    
}

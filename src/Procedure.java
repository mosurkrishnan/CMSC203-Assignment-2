
public class Procedure {
	// Write a class named Procedure that represents a medical procedure that has been performed on a patient. 
	// The Procedure class should have fields for the following data:
	// •	Name of the procedure
	// •	Date of the procedure (for example 06/12/2023)
	// •	Name of the practitioner who performed the procedure.
	// •	Charges for the procedure
	String procedure;
	String dateOfProcedure;
	String practitionerName;
	double procedureCharges;
	
	// •	a no-arg constructor
	public Procedure() {
		this.procedure = "";
		this.dateOfProcedure = "";
		this.practitionerName = "";
		this.procedureCharges = 0.0;
	}
	
	// •	a parametrized constructor that initializes procedure’s name and date to the given values
	public Procedure(String procedure, String dateOfProcedure) {
		this.procedure = procedure;
		this.dateOfProcedure = dateOfProcedure;
	}
	
	// •	a parametrized constructor that initializes all attributes of the procedure to the given values
	public Procedure(String procedure, String dateOfProcedure, String practitionerName, double procedureCharges) {
		this.procedure = procedure;
		this.dateOfProcedure = dateOfProcedure;
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
	}
		
	// •	an accessor for each attribute - Accessor (also known as Getter)
	// •	a mutator for each attribute - Setter (also known as Mutator)
	
	//-------------
	public void setProcedure(String procedure) {
			this.procedure = procedure;
	}
	public String getProcedure() {return procedure;}
	//-------------
	public void setDateOfProcedure(String dateOfProcedure) {
		this.dateOfProcedure = dateOfProcedure;
	}
	public String getDateOfProcedure() {return dateOfProcedure;}
	//-------------
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	public String getPractitionerName() {return practitionerName;}
	//-------------
	public void setProcedureCharges(double procedureCharges) {
		this.procedureCharges = procedureCharges;
	}
	public double getProcedureCharges() {return procedureCharges;}
	
	// •	a toString method that display all information of a procedure
	
	public String toString() {
		return "\n\t\t Procedure: " + getProcedure() +
				"\n\t\t Procedure Date: " + getDateOfProcedure() +
				"\n\t\t Practitioner Name: " + getPractitionerName() +
				"\n\t\t Charges: $" + String.format("%.2f", procedureCharges);
				
		}

}

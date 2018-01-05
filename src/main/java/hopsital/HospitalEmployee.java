package hopsital;

public abstract class HospitalEmployee {
	
	protected String empName; // protected means it is visible if there is an extension in a sub class. This is different than private. 
	protected String empNumber; //Protected is visible to anything in the same package. 
	
	protected int patientHealth = 10;
	
	public HospitalEmployee(String empName, String empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
		
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpNumber() {
		return empNumber;
	}
	abstract double calculatePay(); // by being abstract it has to be used in all of the child classes
	
	@Override
	public String toString() {
	return empName + "\t" + empNumber;
}
}

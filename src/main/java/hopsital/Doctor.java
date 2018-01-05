package hopsital;

public class Doctor extends HospitalEmployee {

	protected String specialty;

	public Doctor(String empName, String empNumber, String specialty) {
		super(empName, empNumber); // Ask for them to explain what "super" does. It's a constructor. It's saying
									// whatever the superclass does, pass it on.
		this.specialty = specialty;
	}

	@Override
	double calculatePay() {
		return 90000;
	}
	
	public boolean drawBlood() {
		return true;
	}
	
	public void careForPatient () {
		patientHealth *=2;
	}
	@Override 
	public String toString() {
		return super.toString() + "\t" + specialty;
	}
	
}

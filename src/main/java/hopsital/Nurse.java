package hopsital;

public class Nurse extends HospitalEmployee {

	protected int numPatients;

	public Nurse(String empName, String empNumber, int numPatients) {
		super(empName, empNumber);
		this.numPatients = numPatients;
	}

	@Override
	double calculatePay() {
		return 45000;
	}
	public int getNumPatients () {
	return numPatients;
	
}

	public boolean drawBlood() {
		return true;
	}

	public void careForPatient() {
		patientHealth *= 2;
	}
}

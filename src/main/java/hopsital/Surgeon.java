package hopsital;

public class Surgeon extends Doctor{

	protected Boolean isOperating;
	public Surgeon(String empName, String empNumber, String specialty, Boolean isOperating) {
		super(empName, empNumber, specialty);
		
		this.isOperating = isOperating;
		
	}
	
	public boolean checkIfOperating() { // ???? why do we need this method to create this method if isOperating is a boolean?
		return isOperating;
	}
	
	@Override
	double calculatePay() {
		return 120000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + isOperating;
	}

}

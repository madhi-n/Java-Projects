
public class FullTimeEmployee extends EmployeeInfo {
	
	protected double yearlySalary;

	public FullTimeEmployee (int eN, String fN, String lN, double gN, double wL, double dR, double yS)
	{
		super (eN, fN, lN, gN, wL, dR);
		yearlySalary = yS;
	}
	
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public double calcAnnualGrossIncome() {
		return yearlySalary;
	}
	
	public double calcAnnualNetIncome() {
		return yearlySalary * (1 - deductionRate);
	}
}

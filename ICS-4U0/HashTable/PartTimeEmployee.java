
public class PartTimeEmployee extends EmployeeInfo {
	
	protected double hourlyWage;
	protected double hourPerWeek;
	protected double weeksPerYear;

	public PartTimeEmployee (int eN, String fN, String lN, double gN, double wL, double dR, double hW, double hPW, double wPY)
	{
		super (eN, fN, lN, gN, wL, dR);
		hourlyWage = hW;
		hourPerWeek = hPW;
		weeksPerYear = wPY;
	}
	
	public double getHourlyWage (){
		return hourlyWage;
	}
	
	public double getHoursPerWeek (){
		return hourPerWeek;
	}
	
	public double getWeeksPerYear (){
		return weeksPerYear;
	}
	
	public double calcAnnualGrossIncome() {
		return (hourlyWage*hourPerWeek*weeksPerYear);
	}
	
	public double calcAnnualNetIncome() {
		return (hourlyWage*hourPerWeek*weeksPerYear) * (1 - deductionRate);
	}
}


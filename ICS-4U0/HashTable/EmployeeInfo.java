
public class EmployeeInfo {
	protected int empNumber;
	protected String firstName;
	protected String lastName;
	protected double gender;
	protected double workLocation;	
	protected double deductionRate;
        
	public EmployeeInfo (int eN, String fN, String lN, double gN, double wL, double dR)
	{
		empNumber = eN;
		firstName = fN;
		lastName = lN;
		gender = gN;
		workLocation = wL;
		deductionRate = dR;
	}
	
	public double calcAnnualGrossIncome() {
		return 0;
	}
	
	public double calcAnnualNetIncome() {
		return 0;
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee Number : " + this.empNumber);
		System.out.println("Last Name : " + this.lastName);
		System.out.println("First Name : " + this.firstName);
		System.out.println("Last Name : " + this.lastName);
		System.out.println("Employee Number : " + this.empNumber);
		System.out.println("Gender : " + this.gender);
		System.out.println("Work Location : " + this.workLocation);
		System.out.println("Deduction Rate : " + this.deductionRate);
		if (this instanceof FullTimeEmployee) {
			FullTimeEmployee thisFTE = (FullTimeEmployee) this;
			System.out.println("Annual Income : " + thisFTE.getYearlySalary());
			System.out.println("Annual Gross Income : " + thisFTE.getYearlySalary());
			System.out.println("Annual NET Income : " + thisFTE.calcAnnualNetIncome());
		}
		if (this instanceof PartTimeEmployee) {
			PartTimeEmployee thisPTE = (PartTimeEmployee) this;
			System.out.println("Hourly Wage : " + thisPTE.getHourlyWage());
			System.out.println("Hours/Week : " + thisPTE.getHoursPerWeek());
			System.out.println("Weeks/Year : " + thisPTE.getWeeksPerYear());
			System.out.println("Annual Gross Income : " + thisPTE.calcAnnualGrossIncome());
			System.out.println("Annual NET Income : " + thisPTE.calcAnnualNetIncome());
		}
		System.out.println("");
	}
	
	
}

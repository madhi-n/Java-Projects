
public class FullTimeEmployee extends EmployeeInfo {

        private double yearlySalary;
        
        public FullTimeEmployee (int eN, String fN, String lN, int s, int wL, double dR, double yS)
        {
                        super(eN, fN, lN, s, wL, dR);
                        yearlySalary = yS;
                                
        }
                   public double getYS() {
                   return yearlySalary;
           }

}

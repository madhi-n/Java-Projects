
public class PartTimeEmployee extends EmployeeInfo{

        private double hourlyWage;
        private double hoursPerWeek;
        private double weeksPerYear;
        
        public PartTimeEmployee (int eN, String fN, String lN, int s, int wL, double dR, double hW, double hPW, double wPY)
        {
                super(eN, fN, lN, s, wL, dR);
                hourlyWage = hW;
                hoursPerWeek = hPW;
                weeksPerYear = wPY;
                        
        }
        
           public double getHW() {
           return hourlyWage;
   }
   
   public double getHPW() {
           return hoursPerWeek;
   }
   
   public double getWPW() {
           return weeksPerYear;
   }
   
}

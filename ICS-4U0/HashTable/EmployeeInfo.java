public class EmployeeInfo {
            private int empNum;
            private String firstName;
            private String lastName;
            private int gender; // encode e.g. 0 for M, 1 for F, etc.
            private int workLoc; // encode e.g. 0 for Mississauga, etc.
            private double deductRate; // e.g. 0.21 for 21%
                                
            
            // Constructors
            
            public EmployeeInfo (int eN, String fN, String lN, int s, int wL, double dR){
                empNum = eN;
                firstName = fN;
                lastName = lN;
                gender = s;
                workLoc = wL;
                deductRate = dR; 
                }

        //getters and setters

                public int getempNum() {
                        return empNum;
                }
                
                public String getfirstName() {
                        return firstName;
                }
                
                public String getlastName() {
                        return lastName;
                }
                
                public int getSex() {
                    return gender;
            }
            
                

            public void displayContents() {
                
                
                // Print the employee numbers for the employees stored in each bucket's ArrayList,
                // starting with bucket 0, then bucket 1, and so on.
            }
}

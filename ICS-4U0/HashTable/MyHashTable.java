import java.util.ArrayList;

public class MyHashTable {

    private ArrayList<EmployeeInfo>[] buckets;

    
    public MyHashTable(int howManyBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
                buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
        }
}
            
              // METHODS

    public int calcBucket(int keyValue) {
            // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
            return(keyValue % buckets.length);
    }
    
    public boolean addEmployee(EmployeeInfo theEmployee) {

        // Add the employee to the hash table.  Return true if employee is added successfully,
        // return false otherwise.
                    
    if (theEmployee == null){
            return false;
    }
    else {
            int bnum = calcBucket (theEmployee.getempNum());
            buckets[bnum].add(theEmployee);
            return true;
    }
}



    public int searchByEmployeeNumber(int employeeNum) {
        int bnum = calcBucket(employeeNum);
        int pos = -1;
    
        for (int y = 0; y < buckets[bnum].size(); y++){
                    if (employeeNum == buckets[bnum].get(y).getempNum()) {
                    pos = y;
                    }
    }
    return pos;
        // Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
        // If the employee is not found, return -1.
}

    public void employeeData(EmployeeInfo theEmployee) {
    	System.out.println("First Name: " + theEmployee.getfirstName());
    	System.out.println("Last Name: " + theEmployee.getlastName());
    	if (theEmployee.getSex() == 0) { 
    		System.out.println("Gender: Male");
    	}
    	else { 
    		System.out.println("Gender: Female");
    	}
    	
    	
    	if (theEmployee instanceof PartTimeEmployee) {
    		System.out.println("Part Time Employee Data:");
    	}
    	else if (theEmployee instanceof FullTimeEmployee) {
    		System.out.println("Full Time Employee Data:");
    	}
    	
    	
    	
    }


    public EmployeeInfo removeEmployee(int employeeNum) {
        int bnum = calcBucket(employeeNum);
        EmployeeInfo temp = null;
    
        for (int z = 0; z < buckets[bnum].size(); z++){
            if (buckets[bnum].get(z).getempNum() == employeeNum) {
                    temp = buckets[bnum].get(z);
                    buckets[bnum].remove(z);
                    System.out.println("The Employee removed: " );
                    System.out.println("  Employee " + employeeNum);
                                        
                    }
    }
    return temp; 
        // Remove the employee from the hash table and return the reference to that employee.
        // If the employee is not in the hash table, return null.
    }
  
    public void displayContents() {
        
        // Print the employee numbers for the employees stored in each bucket's ArrayList,
        // starting with bucket 0, then bucket 1, and so on.
        
    for (int i = 0; i < buckets.length; i++) {

        // For the current bucket, print out the emp num for each item
        // in its ArrayList.
   
        System.out.println("\nExamining the ArrayList for bucket " + i);
        int listSize = buckets[i].size();
        if (listSize == 0) {
            System.out.println("  Nothing in its ArrayList!");
        }
        else {
            for (int j = 0; j < listSize; j++) {
               int theEmpNum = buckets[i].get(j).getempNum();
               System.out.println("  Employee " + theEmpNum);
               
            }
        }

    }

    
}

}  

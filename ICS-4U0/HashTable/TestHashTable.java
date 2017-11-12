
public class TestHashTable {
        public static void main(String[] args) {
                
                //creation of new hashtable
           MyHashTable newTable = new MyHashTable(3);
                           
           EmployeeInfo someEmployee = new PartTimeEmployee (13, "Bugs", "Bunny", 0, 2, 0.14, 12.5, 20.0, 30.0);
           newTable.addEmployee(someEmployee);
           
           EmployeeInfo someEmployee2 = new FullTimeEmployee (24, "Foghorn", "Leghorn", 0, 2, 0.51,50000.0);
           newTable.addEmployee(someEmployee2);
           
           EmployeeInfo someEmployee3 = new EmployeeInfo (11, "Daffy", "Duck", 0, 2, 0.25);
           newTable.addEmployee(someEmployee3);
           
           EmployeeInfo someEmployee4 = new EmployeeInfo (9, "Sylvester", "Cat", 1, 2, 0.4);
           newTable.addEmployee(someEmployee4);
           
           EmployeeInfo someEmployee5 = new EmployeeInfo (18, "Lola", "Bunny", 1, 2, 0.15);
           newTable.addEmployee(someEmployee5);
           
           
           
                //output code
           
           
           
           newTable.displayContents();
           
           int empSearch = newTable.searchByEmployeeNumber(9);
           System.out.println("\nAn Employee is being removed in bucket " + empSearch);  
           
           EmployeeInfo empDelete = newTable.removeEmployee(9);         
           System.out.println("  " + empDelete);
         
           
        }



}

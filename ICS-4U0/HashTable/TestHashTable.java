
public class TestHashTable {
        public static void main(String[] args) {
                
                //creation of new hashtable
           MyHashTable newTable = new MyHashTable(3);
                           
           EmployeeInfo someEmployee = new PartTimeEmployee (13, "Bugs", "Bunny", 0, 2, 0.14, 12.5, 20.0, 30.0);
           newTable.addToTable(someEmployee);
           
           EmployeeInfo someEmployee2 = new FullTimeEmployee (24, "Foghorn", "Leghorn", 0, 2, 0.51,50000.0);
           newTable.addToTable(someEmployee2);
           
           EmployeeInfo someEmployee3 = new EmployeeInfo (11, "Daffy", "Duck", 0, 2, 0.25);
           newTable.addToTable(someEmployee3);
           
           EmployeeInfo someEmployee4 = new EmployeeInfo (9, "Sylvester", "Cat", 1, 2, 0.4);
           newTable.addToTable(someEmployee4);
           
           EmployeeInfo someEmployee5 = new EmployeeInfo (18, "Lola", "Bunny", 1, 2, 0.15);
           newTable.addToTable(someEmployee5);
           
           
           
                //output code
           
           
           
           newTable.printTable();
           System.out.println("Found: " );
           EmployeeInfo empSearch = newTable.searchByEmployeeNumber(13);
           
           System.out.println("Removing: ");
           EmployeeInfo empDelete = newTable.removeEmployee(18);         
                    
           
        }



}

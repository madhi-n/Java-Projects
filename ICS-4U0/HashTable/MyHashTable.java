
import java.util.ArrayList;

public class MyHashTable {

	public ArrayList<EmployeeInfo>[] hashTable;

	public MyHashTable (int addressSize)
	{
		hashTable = new ArrayList[addressSize];
		
		for (int b = 0; b < addressSize; b++)
		{
			hashTable[b] = new ArrayList<EmployeeInfo>();
		}
	}
	
	public int calcBucket(int keyValue) {
		return (keyValue % hashTable.length);
	}
	
	public boolean addToTable (EmployeeInfo employee)
	{
		boolean addStatus = hashTable[calcBucket(employee.empNumber)].add(employee);
		return addStatus;
	}
	
	public EmployeeInfo removeEmployee (int empNum)
	{
		ArrayList <EmployeeInfo> i;
		i = hashTable[calcBucket(calcBucket(empNum))];
		
		for (int b = 0; b < i.size(); b++)
		{
			if (i.get(b).empNumber == empNum)
			{
				EmployeeInfo removing = i.get(b);
				i.remove(b);
				removing.displayEmployee();
				return removing;
			}
		}
		System.out.println("Employee is not in the database!");
		return null; // That employee is not in the ArrayList so not in the hash table.
	}
	
	public EmployeeInfo searchByEmployeeNumber (int empNum)
	{
		ArrayList<EmployeeInfo> i;
		i = hashTable[calcBucket(empNum)];
		for (int b = 0; b < i.size(); b++)
		{
			if (i.get(b).empNumber == empNum)
			{
				EmployeeInfo searchedEmployee = i.get(b);
				searchedEmployee.displayEmployee();
				
			    if (searchedEmployee instanceof PartTimeEmployee) {
			    	System.out.println("Part Time Employee!");
			    }
			    else if (searchedEmployee instanceof FullTimeEmployee) {
			    	System.out.println("Full Time Employee!");
			    }
			    else {
			    	System.out.println("Not Either!");
			    }
			    System.out.println(" ");
				return searchedEmployee;
			}
		}
		System.out.println("Employee is not in the database!");
		return null; // Employee is not in the stored in the table;
	}
	
	
	
	
	
	public void printTable ()
	{
		for (int b = 0; b < hashTable.length; b++)
		{
			ArrayList <EmployeeInfo> i = hashTable[b];
			for (int c = 0; c < i.size(); c++)
			{
				EmployeeInfo currentEmployee = i.get(c);
				currentEmployee.displayEmployee();
			}
		}
	}
}
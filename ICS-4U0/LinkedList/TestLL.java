
public class TestLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyLL theLL = new MyLL();
		theLL.displayLL();
		
		StudentInfo someStudent;
		boolean addStatus;
		
		someStudent = new StudentInfo(123456, "Daffy", "Duck");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
		
		someStudent = new StudentInfo(888888, "Lola", "Bunny");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
			
		someStudent = new StudentInfo(555555, "Foghorn", "Leghorn");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
			
		someStudent = new StudentInfo(222222, "Marvin", "Martian");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
			
		someStudent = new StudentInfo(777777, "Bugs", "Bunny");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
		
		someStudent = new StudentInfo(111111, "Sylvester", "Cat");
		addStatus = theLL.addToFront(someStudent);
		theLL.displayLL();
			
		someStudent = new StudentInfo(314, "Tweety", "Bird");
		addStatus = theLL.addToFront(someStudent);
		theLL.displayLL();
				
		
		
		StudentInfo removedItem;
		
		removedItem = theLL.removeFromFront();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromRear();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		
		
		someStudent = new StudentInfo(123456, "Daffy", "Duck");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
		
		someStudent = new StudentInfo(888888, "Lola", "Bunny");
		addStatus = theLL.addToRear(someStudent);        
		theLL.displayLL();
		
		
		
		removedItem = theLL.removeFromFront();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();	
				
		removedItem = theLL.removeFromFront();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();
		
		removedItem = theLL.removeFromFront();
		if (removedItem != null) {
		    System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
		}
		else {
			System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
		}
		theLL.displayLL();

	} // end main

} // end TestLL

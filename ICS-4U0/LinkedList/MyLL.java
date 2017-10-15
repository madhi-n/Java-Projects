
public class MyLL {


    // ATTRIBUTES
    
    private StudentInfo frontOfList;
    private int numInList;
    
    
    // CONSTRUCTORS
    
    public MyLL() {
    	// Make the list initially empty.
    	frontOfList = null;
    	numInList = 0;
    }
    
    
    // METHODS
    
    public boolean addToRear (StudentInfo itemToAdd) {
	// Adds itemToAdd to the rear of the linked list.
    
	if (numInList == 0) {
	    // Let's add the item to the empty list.
	    frontOfList = itemToAdd;
	}
	else {
	    // There is at least one item already in the list.
	    StudentInfo currentItem = frontOfList;
	    // Head down to the current rear of the list.
	    for (int i = 1; i < numInList; i++) {
	    	currentItem = currentItem.getNext();
	    	}
	    // currentItem should be pointing at the current rear of the list.
	    // Make itemToAdd the new rear item, the old rear item becomes the
	    // second last item.
	    currentItem.setNext(itemToAdd);
	}
	numInList++;
	return(true);
	
    } // end addToRear
    
    
    public boolean addToFront(StudentInfo itemToAdd) {
	// Add itemToAdd to the front of the linked list.
    	
	if (numInList > 0) {
	    itemToAdd.setNext(frontOfList);
	}
	frontOfList = itemToAdd;
	numInList++;
	return(true);
    } // end addToFront
    
    
    public StudentInfo removeFromRear() {
	// Remove the current rear item from the LL and
	// return its reference value to the caller.
	// Return null if the LL is empty and nothing to remove.
    	
	if (numInList == 0) {
	    return(null);
	}
	if (numInList == 1) {
	    StudentInfo itemToRemove = frontOfList;
	    frontOfList = null; // Because list will be empty.
	    numInList--;
	    return(itemToRemove);
	}
	else {
	    // There are at least two items already in the list.
	    StudentInfo currentItem = frontOfList;
	    // Head down to the current second last item in the list.
	    for (int i = 2; i < numInList; i++) {
	    	currentItem = currentItem.getNext();
	    }
	    // currentItem should be pointing at the current second last of the list.
	    StudentInfo itemToRemove = currentItem.getNext();
	    currentItem.setNext(null); // It's now the last item.
	    numInList--;
	    return(itemToRemove);
	}
	
    } // end removeFromRear
	
    
    public StudentInfo removeFromFront() {
	// Remove the current front item from the LL and
	// return its reference value to the caller.
	// Return null if the LL is empty and nothing to remove.
    	
	if (numInList == 0) {
	    return(null);
	}
	else {
	    StudentInfo itemBeingRemoved = frontOfList;
	    frontOfList = frontOfList.getNext(); // Will have value null if only item in list is being removed.
	    itemBeingRemoved.setNext(null);
	    numInList--;
	    return(itemBeingRemoved);
	}
	
    } // end removeFromFront
    
    
    public void displayLL() {
	// Display the contents of the linked list from front to rear.
    	
    System.out.println("\nDisplaying the contents of the list...");
	System.out.println("frontOfList has value " + frontOfList);
	if (numInList == 0) {
	    System.out.println("The list is empty!!!");
	}
	else {
	    StudentInfo currentItem = frontOfList;
	    System.out.println("There are " + numInList + " students in the list!  From front to rear they are:");
	    for (int i = 0; i < numInList; i++) {
	    	System.out.println("    " + currentItem + "  " + currentItem.getFirstName());
	    	currentItem = currentItem.getNext();
	    }   
	}
	
    } // end displayLL

    
}  // end MyLL

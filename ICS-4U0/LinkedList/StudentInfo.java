
public class StudentInfo {

    // ATTRIBUTES

    private int studentNum;
    private String firstName;
    private String lastName;
    private StudentInfo next; // Points at the next student in a linked list.  Value is null if student not in a linked list.
    
    
    // CONSTRUCTORS
    
    public StudentInfo(){
    	studentNum = -1;
    	firstName = "a";
    	lastName = "z";
    	next = null; // By default not in a linked list!
    }
    
    public StudentInfo(int studentNum, String fN, String lN){
    	this.studentNum = studentNum;
    	firstName = fN;
    	lastName = lN;
    	next = null; // By default not in a linked list!
    }
    
    
    // METHODS
    
    public String getFirstName() {
    	return(firstName);
    }
    
    public StudentInfo getNext() {
    	return(next);
    }
    
    public void setNext(StudentInfo newNext) {
    	next = newNext;
    }
    
} // end StudentInfo

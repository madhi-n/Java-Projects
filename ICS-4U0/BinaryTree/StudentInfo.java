
public class StudentInfo {
	  
	//Attributes
	
	private int studentNum;
	String firstName,lastName;
	private StudentInfo leftChild; // Points at the left of the binary tree. Value is null if no number on the left
	private StudentInfo rightChild; // Points at the right of the binary tree. Value is null if no number on the right


// CONSTRUCTORS

public StudentInfo(int studentNum, String firstName, String lastName){
	 firstName = null;
     lastName = null;
     leftChild = null;
     rightChild = null;
     
     this.studentNum = studentNum;
}


	public StudentInfo getLeft() {
		return this.leftChild;	
	}

	public void setLeft(StudentInfo leftChild) {
		this.leftChild = leftChild; 
	}
	
	
	public StudentInfo getRight() {
		return this.rightChild;	
	}
	
	public void setRight(StudentInfo rightChild) {
		this.rightChild = rightChild; 	
	}


	public int getStudentNum() {
		return this.studentNum;	
	}
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;		
	}
	
	

	
}
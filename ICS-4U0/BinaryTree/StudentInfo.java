/* Madhi Nagarajan, 614386
 * ICS-4UE
 * Mr. Dutton
 */


public class StudentInfo {
	  
	//Attributes
	
	private int studentNum;
	String firstName,lastName; 
	private StudentInfo leftChild, rightChild; 
	// leftChild points at the left of binary tree, rightChild points at the right of binary tree
	//its value is null if there is no number on the left/right


	//Constructors
	
	public StudentInfo(int studentNum, String firstName, String lastName){
		firstName = null;
		lastName = null;
		this.studentNum = studentNum;
}


	//Getter and Setter methods
	
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
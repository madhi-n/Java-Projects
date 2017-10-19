/* Madhi Nagarajan, 614386
 * ICS-4UE
 * Mr. Dutton
 */

public class TestBinaryTree {

	public static void main(String[] args) {
		
		//creation of new binary tree
		MyBinaryTree theTree = new MyBinaryTree();
		StudentInfo someStudent; 
		
		//students' data entered below
		
		someStudent = new StudentInfo (11, "Elmer", "Fudd");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo (16, "Daffy", "Duck");
		theTree.addToTree(theTree.getRoot(), someStudent);        
		
		someStudent = new StudentInfo (13, "Lola", "Bunny");
		theTree.addToTree(theTree.getRoot(), someStudent);        
		
		someStudent = new StudentInfo (5, "Bugs", "Bunny");
		theTree.addToTree(theTree.getRoot(), someStudent);        
		
		someStudent = new StudentInfo (2, "Foghorn", "Leghorn");
		theTree.addToTree(theTree.getRoot(), someStudent);        
	    
		someStudent = new StudentInfo (14, "Tweety", "Bird");
		theTree.addToTree(theTree.getRoot(), someStudent);  
		
		someStudent = new StudentInfo (17, "Sylvester", "Cat");
		theTree.addToTree(theTree.getRoot(), someStudent); 
		
		someStudent = new StudentInfo (1, "Marvin", "Martian");
		theTree.addToTree(theTree.getRoot(), someStudent); 
		
		someStudent = new StudentInfo (12, "Miss", "Prissy");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		//output of the traversals
		System.out.println("Binary Tree Traversal of Data");
		System.out.println("Preorder: ");
		theTree.preOrder(theTree.getRoot());
		System.out.println(" ");
		System.out.println("Inorder: ");
		theTree.inOrder(theTree.getRoot());
		System.out.println(" ");
		System.out.println("Postorder: ");
		theTree.postOrder(theTree.getRoot());
		
	}

	}



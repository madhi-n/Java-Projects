/* Madhi Nagarajan, 614386
 * ICS-4UE
 * Mr. Dutton
 */


public class MyBinaryTree {
	
	//Attributes
	
    private int numInTree = 0; //number of values (nodes) starts at 0, since no values are in the tree yet
    private StudentInfo root; 

    //Methods
    
    // this procedure determines whether to add the new node to the left or right of the target node
    // if less than, the new node will go to the left of the target node
    // if greater than, the new node will go to the right of the target node
   public void addToTree (StudentInfo targetNode, StudentInfo itemToAdd) {
       if (numInTree == 0) {
       root = itemToAdd; // The first value is added to the tree
   }
       else if (numInTree > 0){ 
           if (itemToAdd.getStudentNum() < targetNode.getStudentNum() ) {
        	 
                   if (targetNode.getLeft() == null){
                           targetNode.setLeft(itemToAdd); //the new node is now added to the left of the tree
                   }
                   else { 
                	addToTree (targetNode.getLeft(), itemToAdd); //now the left child of the target node becomes the new target node; new node is not added
                	   
                   }
                   
           }
           else 
                   if (targetNode.getRight() == null) {
                           targetNode.setRight(itemToAdd);//the new node is now added to the right of the tree
                   }
                   else {
                	   addToTree (targetNode.getRight(), itemToAdd); //now the right child of the target node becomes the new target node; new node is not added yet
                   }
       }
       numInTree++; //number of values increments every time a new value is added to tree
 }
   
   // Pre Order Traversal
   public void preOrder(StudentInfo targetNode) {
	   	if (targetNode != null) {
	   	   System.out.print(targetNode.getStudentNum() + "  ");
		   preOrder (targetNode. getLeft());
		   preOrder (targetNode. getRight());
	   	}
	   
   }
   
   // In Order Traversal
   public void inOrder(StudentInfo targetNode) {
	   	if (targetNode != null) {
		   inOrder (targetNode. getLeft());
		   System.out.print(targetNode.getStudentNum() + "  ");
		   inOrder (targetNode. getRight());
		   
	   }
	   
   }
   
   // Post Order Traversal
   public void postOrder(StudentInfo targetNode) {
	   	if (targetNode != null) {
		   postOrder (targetNode. getLeft());
		   postOrder (targetNode. getRight());
		   System.out.print(targetNode.getStudentNum() + "  "); 
	   }  
	   
   }
	
   //Getter and Setter Methods
   
   public int getNumInTree() {
		return this.numInTree;
	}

	public void setNumInTree(int numInTree) {
		this.numInTree = numInTree;
	}
   
	
	public StudentInfo getRoot() {
		return this.root;	
	}
	
		public void setRoot(StudentInfo root) {
		this.root = root;		
	}

	
	
    
}
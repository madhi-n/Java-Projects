
public class MyBinaryTree {
	
	//Attributes
    private int numInTree = 0;
    private StudentInfo root;     

           
   public void addToTree (StudentInfo targetNode, StudentInfo itemToAdd) {
       if (numInTree == 0) {
       root = itemToAdd;
   }
       else if (numInTree > 0){ 
           if (itemToAdd.getStudentNum() < targetNode.getStudentNum() ) {
        	 
                   if (targetNode.getLeft() == null){
                           targetNode.setLeft(itemToAdd);
                   }
                   else { 
                	addToTree (targetNode.getLeft(), itemToAdd);
                	   
                   }
                   
           }
           else 
                   if (targetNode.getRight() == null) {
                           targetNode.setRight(itemToAdd);
                   }
                   else {
                	   addToTree (targetNode.getRight(), itemToAdd);
                   }
       }
       numInTree++;
 }
   
   public void preOrder(StudentInfo targetNode) {
	   	if (targetNode != null) {
	   	   System.out.print(targetNode.getStudentNum() + "  ");
		   preOrder (targetNode. getLeft());
		   preOrder (targetNode. getRight());
	   	}
	   
   }
   
   public void inOrder(StudentInfo targetNode) {
	   	if (targetNode != null) {
		   inOrder (targetNode. getLeft());
		   System.out.print(targetNode.getStudentNum() + "  ");
		   inOrder (targetNode. getRight());
		   
	   }
	   
   }
   
   public void postOrder(StudentInfo targetNode) {
	   	if (targetNode != null) {
		   postOrder (targetNode. getLeft());
		   postOrder (targetNode. getRight());
		   System.out.print(targetNode.getStudentNum() + "  "); 
	   }  
	   
   }
	
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
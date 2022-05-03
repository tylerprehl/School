public class TreeTraversal {
	public static void main(String[] args) {
		BinaryTreeNode root 
			= new BinaryTreeNode(55,
									new BinaryTreeNode(29,
											new BinaryTreeNode(-3, null, null),
											new BinaryTreeNode(42, null, null)),												
									new BinaryTreeNode(87,
											new BinaryTreeNode(60, null, null),
											new BinaryTreeNode(91, null, null)));
                                 
      /* Tree Visual Image
                        55
                   29        87
                 -3  42    60  91
      */
      MyBinaryTree tree = new MyBinaryTree(root);
      tree.traversePreOrder();
      tree.traversePostOrder();
      tree.traverseInOrder();
	}
}

class BinaryTreeNode {
	public Integer data = null;
	public BinaryTreeNode parent = null;
	public BinaryTreeNode left = null;
	public BinaryTreeNode right = null;

	public BinaryTreeNode(Integer data, BinaryTreeNode left, BinaryTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
		if(this.left != null) this.left.parent = this;
		if(this.right != null) this.right.parent = this;
	}
}

class MyBinaryTree {
    private BinaryTreeNode root;
	 	
    public MyBinaryTree(BinaryTreeNode root) {
		this.root = root;
    }
	
	public void traversePreOrder() {
      traversePreOrder(root);
      System.out.println();
	}
    
    private void traversePreOrder(BinaryTreeNode node) {
      System.out.print(node.data.intValue() + " "); // this is the visit
      if (node.left != null) traversePreOrder(node.left);
      if (node.right != null) traversePreOrder(node.right);
	}
   public void traversePostOrder() {
      traversePostOrder(root);
      System.out.println();
   }
   public void traversePostOrder(BinaryTreeNode node) {
      if (node.left != null) traversePostOrder(node.left);
      if (node.right != null) traversePostOrder(node.right);
      System.out.print(node.data.intValue() + " "); // this is the visit
   }
   
   public void traverseInOrder() {
      traverseInOrder(root);
      System.out.println();
   }
   public void traverseInOrder(BinaryTreeNode node) {
      if (node.left != null) traverseInOrder(node.left);
      System.out.print(node.data.intValue() + " "); // this is the visit
      if (node.right != null) traverseInOrder(node.right);
   }
}

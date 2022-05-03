/**
 * CSC 241 Assignment #5
 * 
 * On my honor, Tyler Prehl, this assignment is my own work.  
 * I, Tyler Prehl, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */
 
/***  DO NOT ADD ANY IMPORT DECLARATIONS  ***/

/***  DO NOT MAKE ANY CHANGES TO CLASS A5 EXCEPT THE PLACEHOLDER TO FILL IN  ***/
/***  YOU CANNOT ADD ANY FIELD VARIABLES  ***/	
/***  YOU CANNOT ADD ANY METHOD DECLARATIONS  ***/	
public class A5 {
	public static void main(String[] args) {
		//---------------------------------------------------------------------
		//
		// FILL IN HERE -- encode a tree described in A5.pdf
		//
		TreeNode<Integer> root = new TreeNode(1);
      TreeNode<Integer> node2 = new TreeNode(2);
      TreeNode<Integer> node3 = new TreeNode(3);
      TreeNode<Integer> node4 = new TreeNode(4);
      TreeNode<Integer> node5 = new TreeNode(5);
      TreeNode<Integer> node6 = new TreeNode(6);
      TreeNode<Integer> node7 = new TreeNode(7);
      TreeNode<Integer> node8 = new TreeNode(8);
      TreeNode<Integer> node9 = new TreeNode(9);
      TreeNode<Integer> node10 = new TreeNode(10);
      TreeNode<Integer> node11 = new TreeNode(11);
      TreeNode<Integer> node12 = new TreeNode(12);
      TreeNode<Integer> node13 = new TreeNode(13);
      TreeNode<Integer> node14 = new TreeNode(14);
      
      node2.parent = root;
      node3.parent = root;
      node4.parent = root;
      node5.parent = node2;
      node6.parent = node2;
      node7.parent = node6;
      node8.parent = node6;
      node9.parent = node6;
      node10.parent = node4;
      node11.parent = node4;
      node12.parent = node10;
      node13.parent = node12;
      node14.parent = node12;
      
      MyGenericLinkedList<TreeNode<Integer>> row1 = new MyGenericLinkedList();
      MyGenericLinkedList<TreeNode<Integer>> row2 = new MyGenericLinkedList();
      MyGenericLinkedList<TreeNode<Integer>> row4 = new MyGenericLinkedList();
      MyGenericLinkedList<TreeNode<Integer>> row6 = new MyGenericLinkedList();
      MyGenericLinkedList<TreeNode<Integer>> row10 = new MyGenericLinkedList();
      MyGenericLinkedList<TreeNode<Integer>> row12 = new MyGenericLinkedList();
      row1.add(node2);
      row1.add(node3);
      row1.add(node4);
      row2.add(node5);
      row2.add(node6);
      row4.add(node10);
      row4.add(node11);
      row6.add(node7);
      row6.add(node8);
      row6.add(node9);
      row10.add(node12);
      row12.add(node13);
      row12.add(node14);
      
      root.children = row1;
      node2.children = row2;
      node4.children = row4;
      node6.children = row6;
      node10.children = row10;
      node12.children = row12;
		
		
		//
		//---------------------------------------------------------------------
		
		/***  DO NOT MAKE ANY CHANGES TO THE FOLLOWING CODE  ***/
		MyGenericTree<Integer> tree = new MyGenericTree<Integer>(root);
		tree.traversePostOrder();
	}
}

/***  DO NOT MAKE ANY CHANGE TO CLASS MyGenericTree EXCEPT THE PLACEHOLDER TO FILL IN  ***/
class MyGenericTree<T> {
	/***  YOU CANNOT ADD ANY FIELD VARIABLES  ***/	
	/***  YOU CANNOT ADD ANY METHOD DECLARATIONS  ***/	
	private TreeNode<T> root = null;
	
	public MyGenericTree(TreeNode<T> root) {
		this.root = root;
	}
    
    public void traversePostOrder() {
    	traversePostOrder(root);
    }
    
    public void traversePostOrder(TreeNode<T> node) {    	
    	//---------------------------------------------------------------------
		//
		// FILL IN HERE -- implement post-order tree traversal
		//
		if (node.children==null) {
         System.out.println(node.data);
         return;
      }
      
      int i = 0;
      Node currentNode = node.children.front;
      while (currentNode!=null) {
         TreeNode currentTreeNode = node.children.get(i);
         traversePostOrder(currentTreeNode);
         i++;
         currentNode = currentNode.next;
      }
		System.out.println(node.data);
		
		//
		//---------------------------------------------------------------------
    }
}

/***  DO NOT MAKE ANY CHANGES TO CLASS TreeNode  ***/
class TreeNode<N> {
    N data = null;
    TreeNode<N> parent = null;
    MyGenericLinkedList<TreeNode<N>> children = null;

    public TreeNode(N data) {
        this.data = data;
    }
    
    public void setChildren(MyGenericLinkedList<TreeNode<N>> children) {
        this.children = children;
    }
}

/***  DO NOT MAKE ANY CHANGES TO CLASS MyGenericLinkedList  ***/
class MyGenericLinkedList<S> {
    Node<S> front;

    public MyGenericLinkedList() {
        front = null;
    }

    public void add(S value) {
        if (front == null) {
            front = new Node<S>(value);
        } else {
            Node<S> current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<S>(value);
        }
    }
    
	public S get(int index) {
		Node<S> current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return (S)current.data;
	}

	public void remove(int index) {
		if (index == 0) {
			front = front.next;
		} else {
			Node<S> current = front;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
	}
}

/***  DO NOT MAKE ANY CHANGES TO CLASS Node  ***/
class Node<X> {
	X data;
	Node<X> next;

	public Node(X data) {
		this.data = data;
		this.next = null;
	}

	public Node(X data, Node<X> next) {
		this.data = data;
		this.next = next;
	}
}
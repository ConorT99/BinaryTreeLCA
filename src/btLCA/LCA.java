package btLCA;

public class LCA {

	// Variable names for the two nodes whose Lowest Common Ancestor is to be found
	int pointA;
	int pointB;
	int lowestCommonAncestor;
	BT binaryTree;

  class BT {

	  class Node {
  		int val;
  		Node left;
  		Node right;

  		 public Node(int val) {
  			 this.val = val;
  			 this.left = null;
  			 this.right = null;
  		}

	  }
		// Instantiate root node of Binary Tree
		Node root;

		// Constructor method for binary Tree BT
		BT() {
			root = null;
		}

		// Recursive method to insert a new value val into a BST
		Node insertRecursive(Node root, int val) {
			// Return a new node if the tree is empty
			if(root == null) {
				root = new Node(val);
				return root;
			}
			// If tree isn't empty, traverse it recursively until you find the value
			if(val > root.val) {
				root.right = insertRecursive(root.right, val);
			} else if(val < root.val) {
				root.left = insertRecursive(root.left, val);
			}
			return root;
		}

		// Method to insert a value into BST which calls the recursive method
		// and returns its result
		void insert(int val) {
			root = insertRecursive(root, val);
		}

		// Recursive method which enables inorder traversal of the BST
		void inorderRecursive(Node root) {
			if(root != null) {
				inorderRecursive(root.left);
				System.out.println(root.val);
				inorderRecursive(root.right);
			}
		}

		// Method to call the Recursive Inorder Traversal method
		void inorder() {
			inorderRecursive(root);
		}
	}

	public LCA(int pointA, int pointB, BT binaryTree) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.binaryTree = binaryTree;
	}

	public int findLowestCommonAncestor() {
		// Traverse the tree while both nodes being checked are to the same side of the
		// current node being searched against, when the two nodes pointA and pointB are
		// on opposite sides, the LCA has been found
		int lowestCA = lowestCARecursive(binaryTree.root).val;
		return lowestCA;
	}

	public BT.Node lowestCARecursive(BT.Node node) {
		if(node == null) {
			return null;
		}
		if(pointA > node.val && pointB > node.val) {
			return lowestCARecursive(node.right);
		} else if(pointA < node.val && pointB < node.val) {
			return lowestCARecursive(node.left);
		} else {
			return node;
		}
	}

	public int returnLCA() {
		return lowestCommonAncestor;
	}

}

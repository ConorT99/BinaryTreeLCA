package btLCA;

public class LCA {

	// Variable names for the two nodes whose Lowest Common Ancestor is to be found
	int pointA;
	int pointB;
	int lowestCommonAncestor;
	BT binaryTree;

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

import java.util.ArrayList;

public class DAG {
  public class DAGNode {
    int val;
    ArrayList<DAGNode> parentList;
    ArrayList<DAGNode> childList;

    public DAGNode(int val) {
      this.val = val;
      parentList = new ArrayList<DAGNode>();
      childList = new ArrayList<DAGNode>();
    }
  }
}

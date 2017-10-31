
public class RedBlackTreeNode<T extends Comparable<T>> {
	  
  T data;
  RedBlackTreeNode<T> left = null;
  RedBlackTreeNode<T> right = null;
  boolean red = true;


  public RedBlackTreeNode(T newData) {
    data = newData;
  }
	  
  public boolean isLeaf() {
    return (left == null) && (right == null);
  }
}

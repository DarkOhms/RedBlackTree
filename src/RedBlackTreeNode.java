
public class RedBlackTreeNode<T extends Comparable<T>> {
	  
	  T data;
	  RedBlackTreeNode<T> left = null;
	  RedBlackTreeNode<T> right = null;
	  int height;


	  public RedBlackTreeNode(T newData) {
	    data = newData;
	  }
}

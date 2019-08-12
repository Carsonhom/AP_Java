public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(T datum) {
		left = new BST<T>(datum);
	}
 
	public void setRight(T datum) {
		right = new BST<T>(datum);
	}
	
	public void insert(T datum) {
		if(datum.compareTo(getDatum()) >= 0){
			this.getRight().insert(datum);
		} 
		else if(this.getDatum() == datum || this.getDatum() == null){
			this.datum = datum;
		} 
		else {
			this.getLeft().insert(datum);
		}
	}
	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}
	
	public int depth(BST<T> datum){
		if(datum == null){
			return 0;
		}
		else { 
			int leftDepth = depth(datum.getLeft());
			int rightDepth = depth(datum.getRight());
			
			if (leftDepth > rightDepth){
				return (leftDepth + 1);
			}
			else return (rightDepth + 1);
				
			
		}
	}
}
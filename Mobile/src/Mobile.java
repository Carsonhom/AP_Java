// You write this.
//
// If you make Structure a class, Mobile must extend it.
// If you make Structure an interface, Mobile must implement it.

public class Mobile extends Structure {	
	private Branch left;
	private Branch right;
	// This constructor is mandatory by problem specification
	// You have to figure out how to handle it

	public Mobile(Branch left, Branch right) {
		// You write this
		this.left = left;
		this.right = right;
	}
	
	public Branch getLeft(){
		return left;
	}
	
	public Branch getRight(){
		return right;
	}
}
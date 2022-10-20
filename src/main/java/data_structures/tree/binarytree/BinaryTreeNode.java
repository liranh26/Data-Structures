package data_structures.tree.binarytree;

public class BinaryTreeNode <T> {
	public T val;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	BinaryTreeNode(){}
	
	BinaryTreeNode(T val){
		this.val = val;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + "]";
	}
	
}

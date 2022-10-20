package data_structures.tree.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeNodeTest {

	@Test
	void createNewNode() {
		BinaryTreeNode<String> node = new BinaryTreeNode<>();
		assertNotNull(node);
		assertNull(node.val);
		
		BinaryTreeNode<String> node2 = new BinaryTreeNode<>("Hi");
		assertNotNull(node2);
		assertNotNull(node2.val);
		
		assertNull(node2.left);
		assertNull(node2.right);
	}

}

package data_structures.tree.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	_BinaryTree<Integer> tree;
	
	@BeforeEach
	void setUp() throws Exception {
		tree = new _BinaryTree<>();
	}

	@Test
	void createTreeTest() {
		assertNotNull(tree);
		assertNull(tree.root);
		
		tree.root = new BinaryTreeNode<>();
		assertNotNull(tree.root);
		
		tree = new _BinaryTree<>(3);
		assertNotNull(tree);
		assertNotNull(tree.root);
	}

}

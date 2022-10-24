package data_structures.tree.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	_BinarySearchTree<Integer> tree;
	
	@BeforeEach
	void setUp() throws Exception {
		tree = new _BinarySearchTree<>();
	}

	@Test
	void createTreeTest() {
		assertNotNull(tree);
		assertNull(tree.root);
		
		tree.root = new BinaryTreeNode<>();
		assertNotNull(tree.root);
		
		tree = new _BinarySearchTree<>(3);
		assertNotNull(tree);
		assertNotNull(tree.root);
	}
	
	@Test
	void convertListToBinarySearchTree() {
		List<Integer> list = Arrays.asList(3,4,7,1,8,2,0,5);//{0,1,2,3,4,5,7,8}

		tree.convertListToBinarySearchTree(list);
	}
}

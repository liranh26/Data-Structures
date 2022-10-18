package data_structures.lists.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackNodeTest {

	
	
	@Test
	void newEmptyNode() {
		StackNode<Integer> node = new StackNode<>();
		assertNotNull(node);
		assertNull(node.val);
		assertNull(node.next);
	}
	
	@Test
	void newNode() {
		StackNode<String> node = new StackNode<>("Hola");
		assertNotNull(node);
		assertNotNull(node.val);
		assertNull(node.next);
	}

	@Test
	void equals() {
		StackNode<String> node = new StackNode<>("Hola");
		StackNode<Integer> node2 = new StackNode<>(2);
		StackNode<String> node3 = new StackNode<>("Hola");
		
		assertTrue(node.equals(node3));
		assertFalse(node == node3);
		assertFalse(node.equals(node2));
	}
	
}

package data_structures.lists.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListNodeTest {
	
	
	@Test
	void newLinkedListNode() {
		LinkedListNode<Integer> node = new LinkedListNode<Integer>();
		assertNull(node.val);
		assertNull(node.next);
	}
	
	@Test
	void newLinkedListNodeWithValue() {
		LinkedListNode<Integer> node = new LinkedListNode<>(3);
		assertEquals(3, node.val);
		assertNull(node.next);
	}
	
	@Test
	void equalsNodes() {
		LinkedListNode<Integer> node = new LinkedListNode<>(3);
		LinkedListNode<Integer> node2 = new LinkedListNode<>(3); 
		LinkedListNode<Integer> node3 = new LinkedListNode<>();
		
		assertTrue(node.equals(node2));
		assertFalse(node.equals(node3));
		assertFalse(node == node2);
	}

}

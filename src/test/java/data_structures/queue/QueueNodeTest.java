package data_structures.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueNodeTest {

	@Test
	void createQueueNode() {
		QueueNode<Integer> node = new QueueNode<>();
		assertNotNull(node);
		assertNull(node.val);
		
		node = new QueueNode<>(3);
		assertNotNull(node);
		assertNotNull(node.val);

	}

	@Test
	void checkNodes() {
		QueueNode<Integer> node = new QueueNode<>(1);
		QueueNode<Integer> node2 = new QueueNode<>(2);
		QueueNode<Integer> node3 = new QueueNode<>(1);

		assertTrue(node.equals(node3));
		assertFalse(node.equals(node2));
		assertFalse(node == node3);
		
	}
}

package data_structures.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class _QueueTest {

	_Queue<Integer> queue;
	
	@BeforeEach
	void setUp() throws Exception {
		queue = new _Queue<>();
	}

	@Test
	void createQueue() {
		assertNotNull(queue);
		assertNull(queue.top);
		
		queue = new _Queue<>(3);
		assertNotNull(queue);
		assertNotNull(queue.top);
	}
	
	@Test
	void addNodeTest() {
		int first =7, top = 9;
		QueueNode<Integer> n1 = new QueueNode<>(first);
		
		queue.push(n1);
		assertTrue(queue.top.val == first);
		
		QueueNode<Integer> n2 = new QueueNode<>(8);
		QueueNode<Integer> n3 = new QueueNode<>(top);
		
		queue.push(n2);
		assertTrue(queue.top.next.equals(n1));
		queue.push(n3);
		
		assertTrue(queue.top.val == top);
	}


	@Test
	void popNodeTest() {
		try {
			queue.pop();
			fail();
		}catch(NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
		
		int first =7, top = 9;
		QueueNode<Integer> n1 = new QueueNode<>(first);
		QueueNode<Integer> n2 = new QueueNode<>(8);
		QueueNode<Integer> n3 = new QueueNode<>(top);		
		
		queue.push(n1);
		queue.push(n2);		
		queue.push(n3);
		
		QueueNode<Integer> n = queue.pop();
		assertEquals(n3, n);
		n = queue.pop();
		assertEquals(n2, n);
		assertEquals(n1, queue.pop());
		
		
	}
}

package data_structures.lists.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class _StackTest {

	_Stack<Integer> stack;
	Integer number = 2;
	StackNode<Integer> node;
	
	@BeforeEach
	void initStack() {
		stack = new _Stack<>();
		node = new StackNode<>(number);
	}
	
	@Test
	void newEmptyStack() {
		assertNotNull(stack);
		assertNull(stack.top);
	}
	
	@Test
	void newStack() {
		_Stack<Integer> stack = new _Stack(number);
		assertNotNull(stack);
		assertNotNull(stack.top);
		assertTrue(stack.top.equals(node));
		assertFalse(stack.top==node);
	}
	
	@Test
	void pushTest() {
		assertNull(stack.top);
		stack.push(number);
		assertTrue(stack.top.equals(node));
		
		int tmp=7;
		stack.push(tmp);
		assertTrue(stack.top.equals(new StackNode<>(tmp)));
	}
	
	@Test
	void isEmpty() {
		assertNull(stack.top);
		stack.push(number);
		assertNotNull(stack.top);
		
		assertFalse(stack.isEmpty());
	}
	
	@Test
	void popTest() {
		assertNull(stack.top);
		stack.push(number);
		assertNotNull(stack.top);
		
		StackNode<Integer> poped = stack.pop();
		assertEquals(node, poped);
		
		assertTrue(stack.isEmpty());
		assertNull(stack.pop());
	}

}

package data_structures.lists.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class _LinkedListTest {
	
	_LinkedList<Integer> list;
	LinkedListNode<Integer> head;
	
	@BeforeEach
	void initLinkedList() {
		list = new _LinkedList<>();
		head = new LinkedListNode<>(3);
	}
	
	@Test
	void newEmptyLinkedList() {
		assertNotNull(list);
		assertNull(list.head);
		assertNull(list.tail);
	}
	
	@Test
	void newLinkedList() {
		_LinkedList<Integer> list = new _LinkedList<>(head);
		
		assertNotNull(list);
		assertNotNull(list.head);
		assertNotNull(list.tail);
	}
	
	@Test
	void isEmpty() {
		assertTrue(list.isEmpty());
		list.add(head);
		assertFalse(list.isEmpty());
	}
	
	@Test
	void addNewNode(){
		assertNull(list.head);
		assertNull(list.tail);
		
		list.add(head);
		assertTrue(list.head.equals(head));
		assertTrue(list.tail.equals(head));
		
		LinkedListNode<Integer> node = new LinkedListNode<>(7);
		list.add(node);
		assertFalse(list.head.equals(node));
		assertTrue(list.tail.equals(node));
	}
	
	

}

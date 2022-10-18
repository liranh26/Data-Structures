package data_structures.lists.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class _ArrayListTest {

	_ArrayList<Integer> arraylist;

	@BeforeEach
	void initArray() {
		arraylist = new _ArrayList<>();
	}

	@Test
	void createNewArray() {
		assertNotNull(arraylist);
		arraylist = new _ArrayList<Integer>(20);
		assertNotNull(arraylist);
	}

	@Test
	void isEmptyTest() {
		assertTrue(arraylist.isEmpty());
	}

	@Test
	void addElement() {
		int element = 3;
		arraylist.add(element);
		assertFalse(arraylist.isEmpty());
		assertEquals(1, arraylist.getSize());

		int elementsToAdd = 20;
		for (int i = 0; i < elementsToAdd; i++) {
			arraylist.add(i);
		}

		assertEquals(elementsToAdd + 1, arraylist.getSize());

	}

	@Test
	void removeElement() {
		int elementsToAdd = 20;
		for (int i = 0; i < elementsToAdd; i++) {
			arraylist.add(i);
		}

		assertEquals(elementsToAdd, arraylist.getSize());
		int removed = arraylist.remove(0);
		assertEquals(elementsToAdd - 1, arraylist.getSize());

		assertEquals(0, removed);
	}

}

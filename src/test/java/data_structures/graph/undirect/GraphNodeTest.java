package data_structures.graph.undirect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraphNodeTest {

	
	@Test
	void emptyNode() {
		GraphNode<String> node = new GraphNode<>();
		assertNotNull(node);
		assertNotNull(node.children);
		assertNull(node.val);
	}
	
	@Test
	void createNode() {
		GraphNode<String> node = new GraphNode<>("hi");
		assertNotNull(node);
		assertNotNull(node.children);
		assertNotNull(node.val);
	}
	
	@Test
	void equals() {
		GraphNode<String> node = new GraphNode<>("hi");
		GraphNode<Integer> node2 = new GraphNode<>(3);
		GraphNode<String> node3 = new GraphNode<>("hi");
		
		assertFalse(node.equals(node2));
		assertTrue(node.equals(node3));
		assertFalse(node == node3);
	}

}

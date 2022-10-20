package data_structures.graph.undirect;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectGraphTest {

	DirectGraph<Character> graph;
	List<GraphNode<Character>> nodes;
	
	@BeforeEach
	void setUp() throws Exception {
		graph = new DirectGraph<>();
		nodes = Arrays.asList(new GraphNode<>('a'),
								new GraphNode<>('b'),
								new GraphNode<>('c'));
	}

	@Test
	void createGraph() {
		assertNotNull(graph);
		assertNotNull(graph.nodes);
	}

	
	@Test
	void connectNodesTest() {
		GraphNode<Character> a = nodes.get(0);
		GraphNode<Character> b = nodes.get(1);
		GraphNode<Character> c = nodes.get(2);
		
		graph.connectNodes(a, b);
		assertTrue(graph.nodes.get(a).contains(b));
		assertFalse(graph.nodes.get(a).contains(c));
		
		graph.connectNodes(a, c);
		assertTrue(graph.nodes.get(a).contains(c));
		
		graph.connectNodes(b, c);
		assertTrue(graph.nodes.get(b).contains(c));

		try {
			graph.connectNodes(a, null);
			fail();
		}catch (NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
		try {
			graph.connectNodes(null, b);
			fail();
		}catch (NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
		
	}
	
	@Test
	void printGraph() {
		GraphNode<Character> a = nodes.get(0);
		GraphNode<Character> b = nodes.get(1);
		GraphNode<Character> c = nodes.get(2);
		
		graph.connectNodes(a, b);
		graph.connectNodes(a, c);
		graph.connectNodes(b, c);
		
		graph.print();
	}
	
	@Test
	void hasPathBFSTest() {
		GraphNode<Character> a = nodes.get(0);
		GraphNode<Character> b = nodes.get(1);
		GraphNode<Character> c = nodes.get(2);
		
		graph.connectNodes(a, b); //a->b
		assertTrue(graph.hasPathBFS(a,b));
		
		graph.connectNodes(b, a); //b->a
		assertTrue(graph.hasPathBFS(b,a));
		
		graph.connectNodes(b,c);
		assertTrue(graph.hasPathBFS(a,c)); //a -> b -> c
		assertFalse(graph.hasPathBFS(c,b));

		try {
			graph.hasPathBFS(a, null);
			fail();
		}catch (NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
	}

	@Test
	void hasPathDFSTest() {
		GraphNode<Character> a = nodes.get(0);
		GraphNode<Character> b = nodes.get(1);
		GraphNode<Character> c = nodes.get(2);
		
		graph.connectNodes(a, b); //a->b
		assertTrue(graph.hasPathBFS(a,b));
		
		graph.connectNodes(b, a); //b->a
		assertTrue(graph.hasPathBFS(b,a));
		
		graph.connectNodes(b,c);
		assertTrue(graph.hasPathBFS(a,c)); //a -> b -> c
		assertFalse(graph.hasPathBFS(c,b));

		try {
			graph.hasPathBFS(a, null);
			fail();
		}catch (NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
	}
}

package data_structures.graph.undirect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectGraph<T> {
	public Map<GraphNode<T>, List<GraphNode<T>>> nodes;
	
	DirectGraph(){
		nodes = new HashMap<>();
	}
	
	public void connectNodes(GraphNode<T> a, GraphNode<T> b) throws NullPointerException {
		
		if(a == null || b == null) throw new NullPointerException();
		nodes.putIfAbsent(a, new ArrayList<>());
		nodes.putIfAbsent(b, new ArrayList<>());
		
		nodes.get(a).add(b); 
	}
	
	public void print() {
		
		for (GraphNode<T> graphNode : nodes.keySet()) {
			System.out.print(graphNode + " - [" + nodes.get(graphNode));
			System.out.print("]");
			System.out.println();
		}
	}
	
	
	
}

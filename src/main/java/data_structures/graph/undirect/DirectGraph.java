package data_structures.graph.undirect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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
	
	public boolean hasIsland() {
		Queue<GraphNode<T>> queue = new LinkedList<>();
		List<GraphNode<T>> keys = nodes.keySet().stream().toList();
		Set<GraphNode<T>> visited = new HashSet<>(); //handle cyclic case
		
		queue.add(keys.get(0));
		
		while(!queue.isEmpty()) {
			GraphNode<T> curr = queue.poll(); 
			visited.add(curr);
			
			for (GraphNode<T> n : nodes.get(curr)) {
				if(!visited.contains(n))
					queue.add(n);
			}
		}
		
		return visited.size() != keys.size();
	}
	
	public boolean hasPathBFS(GraphNode<T> start, GraphNode<T> node) {
		Queue<GraphNode<T>> queue = new LinkedList<>();
		Set<GraphNode<T>> visited = new HashSet<>(); //handle cyclic case
		
		if(start == null || node == null) throw new NullPointerException();
		
		queue.add(start);
		
		while(!queue.isEmpty()) {
			GraphNode<T> curr = queue.poll();
			visited.add(curr);
			
			if(curr.equals(node))
				return true;
			
			for (GraphNode<T> n : nodes.get(curr)) {
				if(!visited.contains(n))
					queue.add(n);
			}
		}
		
		return false;
	}
	
}

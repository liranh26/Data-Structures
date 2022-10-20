package data_structures.graph.undirect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
	
	
	public boolean hasPathBFS(GraphNode<T> start, GraphNode<T> node) {
		if(start == null || node == null) throw new NullPointerException();
		
		Queue<GraphNode<T>> queue = new LinkedList<>();
		Set<GraphNode<T>> visited = new HashSet<>(); //handle cyclic case		
		
		queue.add(start);
		
		while(!queue.isEmpty()) {
			GraphNode<T> curr = queue.poll();
			visited.add(curr);
			
			if(curr.equals(node))
				return true;
			
			for (GraphNode<T> n : nodes.get(curr)) 
				if(!visited.contains(n))
					queue.add(n);
			
		}
		
		return false;
	}
	
	public boolean hasPathDFS(GraphNode<T> start, GraphNode<T> node) {
		if(start == null || node == null) throw new NullPointerException();
		
		Stack<GraphNode<T>> stack = new Stack<>();
		Set<GraphNode<T>> visited = new HashSet<>();
				
		stack.push(start);
		
		while(!stack.isEmpty()) {
			GraphNode<T> curr = stack.pop();
			visited.add(curr);
			
			if(curr.equals(node)) return true;
			
			for (GraphNode<T> n : curr.children) 
				if(!visited.contains(n))
					stack.push(n);
		}
		
		return false;
	}
	
}

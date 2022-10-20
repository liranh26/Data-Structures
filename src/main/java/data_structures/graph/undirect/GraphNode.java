package data_structures.graph.undirect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GraphNode<T> {
	public T val;
	public List<GraphNode<T>> children;

	GraphNode() {
		children = new ArrayList<>();
	}
	
	GraphNode(T val) {
		this();
		this.val = val;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		GraphNode<T> other = (GraphNode<T>) obj;
		return Objects.equals(val, other.val);
	}

	@Override
	public String toString() {
		return "GraphNode [val=" + val + "]";
	}

}

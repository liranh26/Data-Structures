package data_structures.lists.stack;

import java.util.Objects;

public class StackNode<T> {
	
	public StackNode<T> next;
	public T val;
	
	StackNode(){}
	
	StackNode(T val){
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
		StackNode<T> other = (StackNode<T>) obj;
		return Objects.equals(val, other.val);
	}

	@Override
	public String toString() {
		return "StackNode [val=" + val + "]";
	}
	
}

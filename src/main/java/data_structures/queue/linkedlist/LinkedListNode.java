package data_structures.queue.linkedlist;

import java.util.Objects;

public class LinkedListNode<T> {
	
	public LinkedListNode<T> next;
	public T val;
	
	LinkedListNode(){}
	
	LinkedListNode(T val){
		this.val = val;
	}
	
	LinkedListNode(T val, LinkedListNode<T> n){
		this.val = val;
		next = n;
	}

	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListNode<T> other = (LinkedListNode<T>) obj;
		return Objects.equals(val, other.val);
	}

	@Override
	public String toString() {
		return "LinkedListNode [val=" + val + "]";
	}	
	
	
	
}

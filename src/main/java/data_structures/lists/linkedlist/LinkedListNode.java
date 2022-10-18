package data_structures.lists.linkedlist;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((val == null) ? 0 : val.hashCode());
		return result;
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
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LinkedListNode [next=" + next + ", val=" + val + "]";
	}	
	
	
	
}

package data_structures.queue;

import java.util.Objects;

public class QueueNode<T> {
	public T val;
	public QueueNode<T> next;
	
	public QueueNode() {}
	
	public QueueNode(T val) {
		this.val = val;
	}

	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueueNode other = (QueueNode) obj;
		return Objects.equals(val, other.val);
	}

	@Override
	public String toString() {
		return "QueueNode [val=" + val + "]";
	}

}

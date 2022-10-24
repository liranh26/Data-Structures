package data_structures.queue;

public class _Queue<T> {
	QueueNode<T> top;
	
	public _Queue() {}
	
	public _Queue(T val) {
		top = new QueueNode<>(val);
	}
	
	public void push(QueueNode<T> node) {
		if(top == null)
			top = node;
		else {
			QueueNode<T> tmp = top;
			top = node;
			top.next = tmp;
		}
	}

	public QueueNode<T> pop()throws NullPointerException {
		if(top == null) throw new NullPointerException();
		
		QueueNode<T> n = top;
		top = top.next;
		
		return n;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}

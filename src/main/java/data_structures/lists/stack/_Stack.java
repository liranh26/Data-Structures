package data_structures.lists.stack;

public class _Stack<T> {
	
	public StackNode<T> top;
	
	_Stack(){}
	
	_Stack(T val){
		top = new StackNode<>(val);
	}
	
	public void push(T val) {
		if(top == null)
			top = new StackNode<>(val);
		else {
			top.next = new StackNode<>(val);
			top = top.next;
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public StackNode<T> pop(){
		StackNode<T> tmp = top;
		if(top != null)
			top = top.next;
		return tmp;
	}
}

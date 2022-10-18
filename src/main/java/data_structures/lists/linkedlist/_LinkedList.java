package data_structures.lists.linkedlist;

public class _LinkedList<T> {
	
	public LinkedListNode<T> head;
	public LinkedListNode<T> tail;
	
	_LinkedList(){}
	
	_LinkedList(LinkedListNode<T> head){
		this.head = head;
		this.tail = head;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(LinkedListNode<T> n) {
		LinkedListNode<T> nodeToAdd = new LinkedListNode<T>(n.val);
		
		if(head == null) {
			head = nodeToAdd;
			tail = head;
		} else {
			tail.next = nodeToAdd;
			tail = tail.next;
		}
	}
	
	
	
	
	
	
}

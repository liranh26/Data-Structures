package data_structures.queue.linkedlist;

public class _LinkedList<T> {
	
	public LinkedListNode<T> head;
	public LinkedListNode<T> tail;
	
	_LinkedList(){}
	
	_LinkedList(LinkedListNode<T> head){
		this.head = head;
		this.tail = head;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
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
	
	public LinkedListNode<T> remove(LinkedListNode<T> n){
		LinkedListNode<T> res = new LinkedListNode<>();
		LinkedListNode<T> curr = new LinkedListNode<>();
		curr.next = head;
		
		while(curr.next != null) {
			if(curr.next.equals(n)) {
				res = curr.next;
				
				if(head == curr.next) {
					if(tail == head)
						tail = tail.next;
					head = head.next;
				}
				
				curr.next = curr.next.next;
				
				break;
			}
			
			curr = curr.next;
		}
		
		
		return res;
	}
	
	public void print() {
		LinkedListNode<T> curr = head;
		System.out.print("My Linked List: [");
		while(curr!=null && curr.next!=null) {
			System.out.print(curr+", ");
			curr = curr.next;
		}
		System.out.println(curr + "]");
	}
	
	
	
	
}

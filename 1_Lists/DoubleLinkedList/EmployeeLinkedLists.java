package DoubleLinkedList;

public class EmployeeLinkedLists {

	private EmployeeNodes head;
	private EmployeeNodes tail;
	private int size;
	
	public void addToFront(Employee e) {
		
		EmployeeNodes node = new EmployeeNodes(e);
		node.setNext(head);
		
		if (head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		
		head = node;
		size++;
		
	}
	
	public void addToEnd(Employee e) {
		
		EmployeeNodes node = new EmployeeNodes(e);
		node.setPrevious(tail);
		
		if (tail == null) {
			head = node;
		}
		else {
			tail.setNext(node);
		}
		
		tail = node;
		size++;
		
	}
	
	public EmployeeNodes removeFromFront() {
		
		if (this.isEmpty()) {
			return null;
		}
		else {
			EmployeeNodes removedNode = head;
			
			if (head.getNext() == null) {
				tail = null;
			}
			else {
				head.getNext().setPrevious(null);
			}
			
			head = head.getNext();
			size--;
			removedNode.setNext(null);
			return removedNode;
		}
		
	}
	
	public EmployeeNodes removeFromEnd() {
		
		if (this.isEmpty()) {
			return null;
		}
		else {
			EmployeeNodes removedNode = tail;
			
			if (tail.getPrevious() == null) {
				head = null;
			}
			else {
				tail.getPrevious().setNext(null);
			}
			
			tail = tail.getPrevious();
			size--;
			removedNode.setPrevious(null);
			return removedNode;
			
		}
		
	}
	
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		EmployeeNodes current = head;
		System.out.println("HEAD -> ");
		
		while (current != null) {
			System.out.println(current);
			System.out.println(" <=> ");
			current = current.getNext();
		}
		
		System.out.println("null");
		
	}
	
}

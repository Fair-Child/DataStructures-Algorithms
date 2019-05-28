package SingleLinkedList;

public class EmployeeLinkedLists {

	private EmployeeNodes head;
	private int size;
	
	public void addToFront(Employee e) {
		
		EmployeeNodes node = new EmployeeNodes(e);
		node.setNext(head);
		head = node;
		size++;
		
	}
	
	public EmployeeNodes removeFromFront() {
		if (this.isEmpty()) {
			return null;
		}
		else {
			EmployeeNodes removedNode = head;
			head = head.getNext();
			size--;
			removedNode.setNext(null);
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
			System.out.println(" -> ");
			current = current.getNext();
		}
		
		System.out.println("null");
		
	}
	
}

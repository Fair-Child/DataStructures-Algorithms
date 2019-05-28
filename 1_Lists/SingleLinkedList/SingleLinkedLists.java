package SingleLinkedList;

public class SingleLinkedLists {

	public static void main(String[] args) {
		
		Employee Ami = new Employee("Ami", "Smith", 123);
		Employee Brent = new Employee("Brent", "Liang", 456);
		Employee Carl = new Employee("Carl", "Vincent", 789);
		
		EmployeeLinkedLists list = new EmployeeLinkedLists();
		list.addToFront(Ami);
		list.addToFront(Brent);
		list.addToFront(Carl);
		
		System.out.println(list.getSize());
		
		list.printList();
		
		list.removeFromFront();
		
		list.printList();

	}

}

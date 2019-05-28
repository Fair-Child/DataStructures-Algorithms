package linkedListStack;

public class Main {

	public static void main(String[] args) {
		
		Employee Ami = new Employee("Ami", "Smith", 123);
		Employee Brent = new Employee("Brent", "Liang", 456);
		//Employee Carl = new Employee("Carl", "Vincent", 789);
		
		LinkedListStack<Employee> stack = new LinkedListStack<>();
		
		System.out.println("This is for push:");
		stack.push(Ami);
		stack.push(Brent);
		stack.printStack();
		System.out.println("--------------------------");
		
		System.out.println("This is for peek:");
		Employee e = stack.peek();
		System.out.println(e);
		//stack.printStack();
		System.out.println("---------------------------");
		
		System.out.println("This is for pop:");
		stack.pop();
		stack.printStack();
		System.out.println("---------------------------");
		
	}

}

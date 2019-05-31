package arrayQueues;



public class Main {

	public static void main(String[] args) {
		
		Employee Ami = new Employee("Ami", "Smith", 123);
		Employee Brent = new Employee("Brent", "Liang", 456);
		//Employee Carl = new Employee("Carl", "Vincent", 789);
		
		ArrayQueue queue = new ArrayQueue(5);
		
		queue.add(Ami);
		queue.add(Brent);
		
		queue.printQueue();
		
		queue.remove();
		
		queue.printQueue();
		
		System.out.println(queue.peek());
		
		queue.printQueue();

	}

}

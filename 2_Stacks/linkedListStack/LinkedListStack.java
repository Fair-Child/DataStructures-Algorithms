package linkedListStack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack <T> {
	
	private LinkedList<T> stack;
	
	
	public LinkedListStack() {
		stack = new LinkedList<T>();
	}
	
	public void push(T t) {
		stack.push(t);
	}
	
	public T pop() {
		return stack.pop();
	}

	public T peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<T> iter = stack.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}

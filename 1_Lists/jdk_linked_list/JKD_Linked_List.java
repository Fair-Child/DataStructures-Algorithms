package jdk_linked_list;

// Using JDK provided double linked list and its methods
//NOTE: JDK provided double linked list is NOT synchronized !!!

import java.util.Iterator;
import java.util.LinkedList;

public class JKD_Linked_List {

	public static void main(String[] args) {
		
		Employee Ami = new Employee("Ami", "Smith", 123);
		Employee Brent = new Employee("Brent", "Liang", 456);
		Employee Cathy = new Employee("Cathy", "Wei", 789);
		
		LinkedList<Employee> list = new LinkedList<>();
		
		list.addFirst(Ami);
		list.addFirst(Brent);
		list.add(1, Cathy);
		
		//Using iterator to iterate the LinkedList
		Iterator<Employee> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}

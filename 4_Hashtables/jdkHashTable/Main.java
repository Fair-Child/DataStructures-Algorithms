package jdkHashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Employee Ami = new Employee("Ami", "Smith", 123);
		Employee Brent = new Employee("Brent", "Liang", 456);
		Employee Vincent = new Employee("Vincent", "vanGogh", 789);
		
		Map<String, Employee> hashmap = new HashMap<String, Employee>();
		
		hashmap.put("ami", Ami);
		hashmap.put("brent", Brent);
		hashmap.put("vincent", Vincent);
		
		System.out.println(hashmap.containsKey("ami"));
		System.out.println(hashmap.containsValue(Brent));
		
		System.out.println(hashmap.get("ami"));
		
//		Iterator<Employee> iterator = hashmap.values().iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		hashmap.forEach((k, v) -> System.out.println("Key = "+k+", Employee = "+v));
		
		System.out.println(hashmap.remove("vincent"));
		
		hashmap.forEach((k, v) -> System.out.println("Key = "+k+", Employee = "+v));

		
	}
	
}

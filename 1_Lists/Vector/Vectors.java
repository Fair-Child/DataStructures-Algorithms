package Vector;

//good for random access, iterating, but not good for inserting, removing, and
//searching for specific element(ie: you don't have index of that element)
//Vector is synchronized version ArrayList

import java.util.List;
import java.util.Vector;

import ArrayList.Employee;

public class Vectors {

	public static void main(String[] args) {
		
List<Employee> employeeList = new Vector<>();
		
		employeeList.add(new Employee("Peter", "Park", 123));
		employeeList.add(new Employee("John", "Doe", 456));
		employeeList.add(new Employee("Ami", "Smith", 789));
		
		
		//Using lambda function to out print the list
		//employeeList.forEach(employee -> System.out.println(employee));
				
		//Use get(index) to return the specific object in list
		//System.out.println(employeeList.get(0));
				
		//Use isEmpty() to check if the list is empty
		//System.out.println(employeeList.isEmpty());
				
		//Use set(index, new Object) to set the new Object in list
		//employeeList.set(1, new Employee("John", "Adam", 666));
				
		//Use size() to display the list size
		 //System.out.println(employeeList.size());
				
		 //Use add(index, new Element) to add object in specific index
		 //employeeList.add(1, new Employee("Brent", "Liang", 999));
		 //employeeList.forEach(employee -> System.out.println(employee));
		 		
		 //Use toArray() to change the list to array
		 //add the Object type in toArray() to make the array the type you want 
		//Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		//for (Employee e : employeeArray) {
		//	System.out.println(e);
		//}
		 		
		 //see if the list contains the specific element, must override equals() first
		 //System.out.println(employeeList.contains(new Employee("Ami", "Smith", 789)));
		 		
		 //check the index of specific element, must override equals()
		 //System.out.println(employeeList.indexOf(new Employee("Ami", "Smith", 789)));
		 		
		 //remove a specific element
		 employeeList.remove(0);
		 System.out.println(employeeList.size());
		 employeeList.forEach(employee -> System.out.println(employee));

	}

}

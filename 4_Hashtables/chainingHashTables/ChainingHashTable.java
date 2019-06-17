package chainingHashTables;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainingHashTable {

	private LinkedList<Storing>[] hashtable;
	
	public ChainingHashTable() {
		hashtable = new LinkedList[10];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<Storing>();
		}
	}
	
	public void put(String key, Employee employee) {
		int hashKey = hashKey(key);
		hashtable[hashKey].add(new Storing(key, employee));
	}
	
	public Employee get(String key) {
		int hashKey = hashKey(key);
		ListIterator<Storing> iterator = hashtable[hashKey].listIterator();
		Storing employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.key.equals(key)) {
				return employee.employee;
			}
		}
		return null;
	}
	
	public Employee remove(String key) {
		int hashKey = hashKey(key);
		ListIterator<Storing> iterator = hashtable[hashKey].listIterator();
		Storing employee = null;
		int index = -1;
		while (iterator.hasNext()) {
			employee = iterator.next();
			index++;
			if (employee.key.equals(key)) {
				break;
			}
		}
		
		if (employee == null||!employee.key.equals(key)) {
			return null;
		}
		else {
			hashtable[hashKey].remove(index);
			return employee.employee;
		}
	}
	
	private int hashKey(String key) {
		return key.length()%hashtable.length;
	}
	
	public void printHashTable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i].isEmpty()) {
				System.out.println("Position "+ i + ": empty");
			}
			else {
				System.out.print("Position "+ i + ": ");
				ListIterator<Storing> iterator = hashtable[i].listIterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next().employee);
					System.out.print(" -> ");
				}
				System.out.println("null");
			}
		}
	}
	
}

package hashTable;

public class ArrayHashTable {
	
	private Employee[] hashtable;
	
	public ArrayHashTable() {
		hashtable = new Employee[10];
	}
	
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		
		if (occupied(hashedKey)) {
			int stopIndex = hashedKey;
			if (hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			}
			else {
				hashedKey++;
			}
			
			while (occupied(hashedKey)&&hashedKey != stopIndex) {
				hashedKey = (hashedKey+1) % hashtable.length;
			}
		}
		
		if (hashtable[hashedKey] != null) {
			System.out.println("Sorry, position "+hashedKey+ "have already been taken.");
		}
		else {
			hashtable[hashedKey] = employee;
		}
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashtable[hashedKey];
	}
	
	private boolean occupied(int index) {
		return hashtable[index] != null;
	}
	
	public void printHashTable() {
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}

}

package chainingHashTables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Ami = new Employee("Ami", "Smith", 123);
		Employee Brent = new Employee("Brent", "Liang", 456);
		Employee Vincent = new Employee("Vincent", "vanGogh", 789);
		
		ChainingHashTable ht = new ChainingHashTable();
		ht.put("ami", Ami);
		ht.put("brent", Brent);
		ht.put("vincent", Vincent);
		ht.put("vincent", Vincent);

		ht.printHashTable();
		
		ht.remove("vincent");
		
		System.out.println(ht.get("ami"));
		
		ht.printHashTable();
		
	}

}

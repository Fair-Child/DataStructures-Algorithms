package binarySearchTrees;

public class Main {

	public static void main(String[] args) {
		
		Tree newtree = new Tree();
		newtree.insert(25);
		newtree.insert(20);
		newtree.insert(12);
		newtree.insert(21);
		newtree.insert(28);
		newtree.insert(32);

		newtree.traverseInOrder();
		System.out.println();
		newtree.traversePreOrder();
		System.out.println();
		newtree.traversePostOrder();
		
		System.out.println();
//		System.out.println(newtree.get(25));
//		System.out.println(newtree.get(29));
		
//		System.out.println(newtree.min());
//		System.out.println(newtree.max());
		
//		newtree.delete(28);
//		newtree.delete(21);
//		newtree.traverseInOrder();
//		

	}

}

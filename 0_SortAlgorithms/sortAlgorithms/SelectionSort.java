package sortAlgorithms;

//time complexity: O(n^2);

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		selectionSort(array);
		
		for (int i : array) {
			System.out.print(i + ", ");
		}
		
	}
	
	
	public static void swap(int[]array, int i, int j) {
		
		if (i == j) {
			return;
		}
		else {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
	}
	
	
	public static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[smallest]) {
					smallest = j;
				}
				
			}
			swap(array, smallest, i);
		}
		
	}
	
}

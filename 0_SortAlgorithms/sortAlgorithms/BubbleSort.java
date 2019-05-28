package sortAlgorithms;

//time complexity: O(n^2);

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		bubbleSort(array);
		
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
	
	public static void bubbleSort(int[]array) {
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
	}

}

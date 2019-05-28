package sortAlgorithms;

//time complexity: O(n^2);

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i;  j > 0 && array[j-1] > temp; j--) {
				array[j] = array[j-1];
			}
			array[j] = temp;
			
		}
		
		
		for(int i : array) {
			System.out.print(i+", ");
		}

	}

}

package sortAlgorithms;

//time complexity: O() *** only work with non-negative discrete values

public class CountingSort {

	public static void main(String[] args) {
		
		int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		
		countingSort(array, 1, 10);
		
		for (int i : array) {
			System.out.print(i+", ");
		}
		
	}
	
	
	public static void countingSort(int[] array, int min, int max) {
		
		int[] countArray = new int[(max - min) +1];
		
		for (int i = 0; i < array.length; i++) {
			countArray[array[i] - min]++;
		}
		
		int j = 0;
		for (int i = min; i < max; i++) {
			while (countArray[i - min] >0) {
				array[j++] = i;
				countArray[i - min]--;
			}
			
		}
		
	}
	
}

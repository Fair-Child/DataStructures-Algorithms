package sortAlgorithms;

//time complexity: O(n^2). 
//If the array is almost sorted, time complexity could be linearly O(n), but not guaranteed;

public class ShellSort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		for (int gap = array.length/2; gap > 0; gap /= 2) {
			
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];
				int j = i;
				
				while(j >= gap && array[j - gap] > temp) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = temp;
			}
			
		}
		
		for(int i : array) {
			System.out.print(i+", ");
		}

	}

}

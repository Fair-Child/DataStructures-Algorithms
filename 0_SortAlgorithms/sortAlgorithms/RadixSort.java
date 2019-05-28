package sortAlgorithms;

//time complexity: O(n): make assumptions about the data that will to sort: 
// must have same radix!

public class RadixSort {

	public static void main(String[] args) {
	
		int[] array = {4725, 4586, 1330, 8792, 1594, 5729};
		
		radixSort(array, 10, 4);
		
		for (int i : array) {
			System.out.print(i+", ");
		}

	}
	
	public static void radixSort(int[] array, int radix, int width) {
		
		for (int i = 0; i < width; i++) {
			radixSingleSort(array, i, radix);
		}
		
	}
	
	public static void radixSingleSort(int[] array, int position, int radix) {
		
		int numItems = array.length;
		
		int[] countArray = new int[radix];
		
		for (int value : array) {
			countArray[getDigit(position, value, radix)]++;
		}
		
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}
		
		int[] temp = new int[numItems];
		
		for (int k = numItems - 1; k >= 0; k--) {
			temp[--countArray[getDigit(position, array[k], radix)]] = array[k];
		}
		
		for (int l = 0; l < numItems; l++) {
			array[l] = temp[l];
		}
		
	}
	
	public static int getDigit(int position, int value, int radix) {
		
		return value / (int)Math.pow(radix, position) % radix;
		
	}

}

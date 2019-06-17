package sortAlgorithms;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//time complexity: O(n);

public class BucketSort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, 15, 7, 55, 1, 22, 27, 58, 36, 25};

		bucketSort(array);
		
		for (int i : array) {
			System.out.print(i + ", ");
		}

	}
	
	public static void bucketSort(int[] input) {
		
		List<Integer>[] buckets = new List[10];
		
		for (int i = 0; i < buckets.length; i++) {
			
			//using ArrayList as buckets
			//buckets[i] = new ArrayList<Integer>();
			
			//using LinkedList as buckets
			buckets[i] = new LinkedList<Integer>();
			
		}
		
		for (int j = 0; j < input.length; j++) {
			buckets[hash(input[j])].add(input[j]);
		}
		
		for (List bucket : buckets) {
			Collections.sort(bucket);
		}
		
		int k = 0;
		for (int l = 0; l < buckets.length; l++) {
			for (int value: buckets[l]) {
				input[k++] = value;
			}
		}
		
		
	}
	
	private static int hash(int value) {
		return value/(int)10 % 10;
	}

}

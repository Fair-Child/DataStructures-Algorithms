package sortAlgorithms;
import java.util.Arrays;

//Using JDK provided sort methods

public class JDKsort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		
		
		Arrays.sort(array);
		
		//or
		
		Arrays.parallelSort(array);
		
		
		
		for (int i : array) {
			System.out.print(i+", ");
		}
		
	}

}

package sortAlgorithms;

//time complexity: O(nlogn), but faster than other O(nlogn) sort algorithm.

public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		quickSort(array, 0, array.length-1);
		
		for (int i : array) {
			System.out.print(i+", ");
		}
		
	}
	
	public static void quickSort(int[] array, int start, int end) {
		
		  int i = start, j = end;
		  int pivot = array[i];
		  int emptyIndex = i; // 表示空位的位置索引，默认为被取出的基准元素的位置
		  
		  while (i < j) {
			// j 开始从右向左一个个地查找小于基准元素的元素
		    while (i < j && pivot <= array[j]) {
		    	j--;
		    }
		    // 如果 j 在遇到 i 之前就找到了小于基准元素的元素，就将该元素给 i 的"空位"，j成了空位
		    if (i < j) {
		    	array[emptyIndex] = array[emptyIndex = j];
		    }
		    // i 开始从左向右一个个地查找大于基准元素的元素
		    while (i < j && array[i] <= pivot) {
		    	i++;
		    }
		    // 如果 i 在遇到 j 之前就找到了大于基准元素的元素，就将该元素给 j 的"空位"，i成了空位
		    if (i < j) {
		    	array[emptyIndex] = array[emptyIndex = i];
		    }
			    
		  }    
		// i 和 j 相遇后会停止循环，将最初取出的基准值给最后的空位
		  array[emptyIndex] = pivot;
		   
		  // =====本轮快速排序完成=====
		   
		  // 如果分割点i左侧有2个以上的元素，递归调用继续对其进行快速排序
		  if (i - start > 1) {
		    quickSort(array, 0, i - 1);
		  }
		  // 如果分割点j右侧有2个以上的元素，递归调用继续对其进行快速排序
		  if (end - j > 1) {
		    quickSort(array, j + 1, end);
		  }
		}

}

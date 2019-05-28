package sortAlgorithms;

//time complexity: 

public class Recrusion {

	public static void main(String[] args) {
		
		
		long result = factorial(10);
		
		System.out.println(result);
		

	}
	
	public static int factorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		else {
			return num * factorial(num - 1);
		}
		
	}

}

package exercise;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(palindrome("Was it a car or a cat i saw?"));
		
		System.out.println(palindrome("I did, did I?"));
		
		System.out.println(palindrome("Hello?"));
		

	}
	
	public static boolean palindrome(String s) {
		
		LinkedList<Character> stack = new LinkedList<Character>();
		LinkedList<Character> queue = new LinkedList<Character>();
		
		String lowerCase = s.toLowerCase();
		
		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				queue.addLast(c);
				stack.push(c);
			}
		}
		
		while (!stack.isEmpty()) {
			if (!stack.pop().equals(queue.removeFirst())) {
				return false;
			}
		}
		
		return true;
		
	}

}

package ohoz.aa01;

import java.util.Arrays;

/*
 * Print second frequently occurring number in given series

Example :

Input: 1 1 2 3 1 2 4
Output: 2
Explanation: 1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time and 4 occurs 1 time. Hence second frequently occurring number in given series is 2

 */
public class AAA011 {
	
	public static void main(String[] args) {
		String input = "1 1 2 3 1 2 4";
		char[] inputArray = input.replaceAll("\\s", "").toCharArray();
		
		System.out.println(Arrays.toString(inputArray));
	}

}

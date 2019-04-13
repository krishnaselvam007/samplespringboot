package ohoz.aa00;

/*
 * Input: 13,2, 4,15,12,10,5
Output: 13,2,12,10, 5,15,4
Input: 1,2,3,4,5,6,7,8,9
Output: 9,2,7,4,5,6,3,8,1
 */

import java.util.Arrays;
import java.util.Scanner;

public class AAA002 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] input = new int[5];
		System.out.println("enter integer");
		for (int i = 0; i < input.length; i++) {
			
			input[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(input));
		
		int oddSize = 0, evenSize = 0;
		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 1) {
				evenSize++;
			} else {
				oddSize++;
			}
		}
		int[] oddArray = new int[oddSize], evenArray = new int[evenSize];
		for (int i = 0, j = 0, k = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				int oddPlaceValue = input[i];
				oddArray[j] = oddPlaceValue;
				j++;
			} else {
				int evenPlaceValue = input[i];
				evenArray[k] = evenPlaceValue;
				k++;
			}
		}
		int temp;
		for (int i = 0; i < oddArray.length-1; i++) {
			for (int j = 0; j < oddArray.length-1; j++) {
				if (oddArray[j] < oddArray[j+1]) {
					temp = oddArray[j+1];
					oddArray[j+1] = oddArray[j];
					oddArray[j] = temp;
				}
			}
			
		}
		int temp2;
		for (int i = 0; i < evenArray.length-1; i++) {
			for (int j = 0; j < evenArray.length-1; j++) {
				if(evenArray[j] > evenArray[j+1]){   
                    temp2 = evenArray[j+1];
                    evenArray[j+1] = evenArray[j];
                    evenArray[j]=temp2;
                }
			}
			
		}
		int[] finalArray = new int[input.length];
		for (int i = 0,j=0; i < oddArray.length ; i++,j++) {
			finalArray[i+j] = oddArray[i];
		}
		for (int i = 0,j=1; i < evenArray.length; i++,j++) {
			finalArray[i+j] = evenArray[i];
		}
		
		System.out.println(Arrays.toString(oddArray));
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(finalArray));
	}
}

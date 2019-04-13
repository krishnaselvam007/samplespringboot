package ohoz.aa00;

import java.util.HashSet;
import java.util.Set;

/*
 * Given two sorted arrays, merge them such that the elements are not repeated

Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
 */
public class AAA005 {

	public static void main(String[] args) {
		int[] input1 = {2,4,5,6,7,9,10,13}, input2 = {2,3,4,5,6,7,8,9,11,15};

	    Set<Integer> nodupes = new HashSet<Integer>();

	    for(int i=0;i<input1.length;i++){
	        nodupes.add(input1[i]);
	    }
	    for (int i = 0; i < input2.length; i++) {
	    	nodupes.add(input2[i]);
		}

	    System.out.println(nodupes);
	    
	}
}

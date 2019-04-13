package ohoz.aa00;

/*
 * Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
 */
public class AAA004 {

	public static void main(String[] args) {
		String input1 = "test123string";
		String input2 = "1234";

		char[] inArray1 = input1.toCharArray();
		char[] inArray2 = input2.toCharArray();

		int matchCount = 0,firstIndex = 0;
		for (int i = 0, j = 0; i < inArray1.length; i++) {
			if (inArray1[i] == inArray2[j]) {
				matchCount ++;
				if(j==0) {
					firstIndex = i;
				}
				if(j<inArray2.length-1) {
					j++;
				}
			} 
		}
		if(inArray2.length == matchCount) {
			System.out.println(firstIndex);
		}else {
			System.out.println("-1");
		}
	}

}

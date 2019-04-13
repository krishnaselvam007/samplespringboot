package ohoz.aa00;

/*You can assume the string is of odd length

Input: 12345
Output:
1       5
  2   4
    3
  2  4
1      5 */

public class AAA003 {

	public static void main(String[] args) {

		String input = "1234567";
		char[] inArray = input.toCharArray();
		for (int i = 0,k=inArray.length-1; i < inArray.length; i++,k--) {
			for (int j = 0; j < inArray.length; j++) {
				if (j==i || j==k) {
					System.out.print(inArray[j]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

package ohoz.aa01;

/*
 * Print pattern like this

Example:
Input: 1
Output: 0

Input: 2
Output: 
0 0
0 1
1 0
1 1

Input: 3
Output:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
 */
public class AAA013 {

	public static void main(String[] args) {
		int input = 2;
		int temp = 1;
		if (input == 1 || input == 0) {
			System.out.println(0);
		} else {
			for (int i = 0; i < input; i++) {
				temp = temp * 2;
			}
		}
		
		for (int i = 0; i < temp; i++) {
			System.out.println(i + " " +i);
			System.out.println(i + " " +i+1);
		}
		
		System.out.println(temp);
	}

}

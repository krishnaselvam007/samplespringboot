package ohoz.aa00;

/*
 * Using Recursion reverse the string such as

Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I 
 */
public class AAA006 {

	public static void main(String[] args) {
		String input1 = "I love india";
		
		String[] inputArray = input1.split("\\s");
		
		StringBuilder output =  new StringBuilder();
		
		for (int i = inputArray.length-1; i >= 0; i--) {
			output.append(inputArray[i]+" ");
		}
		
		System.out.println(output);
	}
}

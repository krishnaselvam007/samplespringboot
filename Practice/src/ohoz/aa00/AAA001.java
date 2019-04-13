package ohoz.aa00;

/*
Input: a1b10
Output: abbbbbbbbbb
Input: b3c6d15
Output: bbbccccccddddddddddddddd
 */
public class AAA001 {

	public static void main(String[] args) {

		String input = "a4b5n11nyyo22";

		byte[] inputArray = input.toLowerCase().getBytes();
		for (int i = 0, lengthToPrint = 0; i < inputArray.length; i++) {
			if (inputArray[i] > 96 && inputArray[i] < 123) {
			} else {
				char firstChar = input.charAt(i), prevChar = input.charAt(i - 1);
				if (i < inputArray.length - 1) {
					if (inputArray[i + 1] > 47 && inputArray[i + 1] < 58) {

						char nextchar = input.charAt(i + 1);
						int firstInt = Character.getNumericValue(firstChar);
						int nextInt = Character.getNumericValue(nextchar);
						lengthToPrint = (firstInt * 10) + nextInt;
						i++;
					} else {
						lengthToPrint = Character.getNumericValue(firstChar);
					}
				} else {
					lengthToPrint = Character.getNumericValue(firstChar);
				}

				for (int j = 0; j < lengthToPrint; j++) {
					System.out.print(prevChar);
				}
			}
		}

	}
}

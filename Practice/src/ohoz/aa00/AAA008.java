package ohoz.aa00;

/*
Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	  
And print the start and ending index as

Start index : <1,2>

End index: <3, 2>

 */
public class AAA008 {
	
	public static void main(String[] args) {
		String input = "WELCOMETOZOHOCORPORATION";
		for (int i = 0; i < input.toCharArray().length; i++) {
			System.out.print(input.charAt(i)+ " ");
		}
	}

}

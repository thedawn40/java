package masking;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Mask mask = new Mask();
		Scanner scan = new Scanner(System.in);
		String output = "";
		System.err.print("input = ");
		String input = scan.nextLine();
		output = mask.mask(input);
		System.err.print("output = "+output);
	}
	
}

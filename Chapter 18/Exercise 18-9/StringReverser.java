/*
 * Author: Joshua Gray
 * Date: 9/8/21
 * 
 * This program reverses a string value using recursion.
 */

import java.util.Scanner;
public class StringReverser {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Enter a string value: ");
		String word = input.next();
		
		// Invoke reverseDisplay()
		reverseDisplay(word);
	}
	
	public static void reverseDisplay(String value) {
		if (value.length() <= 1) {
			System.out.print(value);
		}
		else {
			 System.out.print(value.charAt(value.length() - 1));
			 reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}

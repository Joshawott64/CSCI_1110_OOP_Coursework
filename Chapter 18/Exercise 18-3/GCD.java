/*
 * Author: Joshua Gray
 * Date: 9/8/21
 * 
 * This program prompts the user to enter two integers and displays 
 * their greatest common divisor (GCD) using recursion.
 */

import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Please input 2 integers separated by a space: ");
		int first = input.nextInt();
		int second = input.nextInt();
		
		// Invoke getGCD()
		System.out.print("The GCD of " + first + " and " + second + 
			" is " + getGCD(first, second));

	}
	
	// Returns GCD
	public static int getGCD(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		else {
			return getGCD(n, m % n);
		}
	}

}

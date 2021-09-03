/*
 * Author: Joshua Gray
 * Date: 9/1/21
 * 
 * This program creates a file named "Exercise17_01.txt" and writes 
 * 100 integers created randomly into the file using text I/O.
 */
import java.io.*;
import java.util.Scanner;

public class Exercise17_01 {

	public static void main(String[] args) throws IOException {
		// Create file
		PrintWriter output = new PrintWriter("Exercise17_01.txt");
		
		// Assign 100 random integers to file
		for (int i = 0; i < 100; i++) {
			int number = (int) (Math.random() * (100 + 1));
			output.print(number + " ");
		}
		
		// Close output
		output.close();
		
		// Create input and display file content
		Scanner input = new Scanner(new File("Exercise17_01.txt"));
		System.out.println(input.nextLine());
	}

}

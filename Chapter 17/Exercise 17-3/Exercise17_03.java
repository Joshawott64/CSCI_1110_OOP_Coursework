/*
 * Author: Joshua Gray
 * Date: 9/1/21
 * 
 * This program creates a file named "Exercise17_03.dat" and writes 100 
 * randomly generated integers into the file. It then reads the file 
 * and returns the sum of the integers.
 */

import java.io.*;

public class Exercise17_03 {

	public static void main(String[] args) throws IOException {
		// Invoke create method
		create();
		
		// Invoke sum() method
		sum();
	}

	public static void create() throws FileNotFoundException, IOException {
		try ( 
			DataOutputStream output = 
			new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
		) {
			// Write random integers
			for (int i = 0; i < 100; i++) {
				int number = (int)(Math.random() * (100 + 1));
				output.writeInt(number);
				output.writeUTF(" ");
			}
		}
	}
	
	public static void sum() throws FileNotFoundException, IOException {
		int sum = 0;
		try (
			DataInputStream input =
				new DataInputStream(new FileInputStream("Exercise17_03.dat"));
		) {
			// Read integers from file and add them together
			for (int i = 0; i < 100;) {
				sum += input.readInt();
				input.readUTF();
			}
			System.out.println("The sum is: " + sum);
			
		}
		catch (EOFException ex) {
			System.out.println("All data has been read");
			System.out.println("The sum is: " + sum);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}

/*
 * Author: Joshua Gray
 * Date: 9/2/21
 * 
 * This program encrypts a file by adding a 5 to every byte in the file. 
 * The program prompts the user to enter an input file name and an 
 * output file name and saves the encrypted version of the input 
 * file to the output file.
 */
import java.io.*;
import java.util.Scanner;

public class Exercise17_14 {

	public static void main(String[] args) throws IOException {
		// Set up scanner
		Scanner e = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Enter (1) for Encrypt, or (2) for Decrypt: ");
		int mode = e.nextInt();
		switch (mode) {
		case 1: mode = 1;
				encrypt();
				break;
		case 2: mode = 1;
				decrypt();
				break;
		}
		
		if (mode != 1 && mode != 2) {
			System.out.println("Invalid input");
		}
			
	}
	public static void encrypt() throws FileNotFoundException, IOException {
		// Set up scanner
		Scanner e = new Scanner(System.in);
				
		// Prompt user for input file name
		System.out.print("Enter a name for the source file: ");
		String sourceFileName = e.next().trim();
		File sourceFile = new File(sourceFileName);
		sourceFile.createNewFile();
		System.out.println();
						
		// Prompt user for output file name
		System.out.print("Enter a name for the target file: ");
		String targetFileName = e.next().trim();
		File targetFile = new File(targetFileName);
		targetFile.createNewFile();
		System.out.println();
		
		try (
			// Create input stream
			BufferedInputStream input =
				new BufferedInputStream(new FileInputStream(sourceFile));
				
			// Create output stream
			BufferedOutputStream output =
				new BufferedOutputStream(new FileOutputStream(targetFile));
		) {
			// Continuously read a byte from the input and add a 5 to it
			int r, numberOfBytesCopied = 0;
			while ((r = input.read()) != -1) {
				output.write(((byte)r) + 5);
				numberOfBytesCopied++;
			}
				
			// Display file size
			System.out.println(numberOfBytesCopied + " bytes copied");
		}
	}
	
	public static void decrypt() throws FileNotFoundException, IOException {
		// Set up scanner
		Scanner e = new Scanner(System.in);
						
		// Prompt user for input file name
		System.out.print("Enter a name for the source file: ");
		String sourceFileName = e.next().trim();
		File sourceFile = new File(sourceFileName);
		sourceFile.createNewFile();
		System.out.println();
								
		// Prompt user for output file name
		System.out.print("Enter a name for the target file: ");
		String targetFileName = e.next().trim();
		File targetFile = new File(targetFileName);
		targetFile.createNewFile();
		System.out.println();
				
		try (
			// Create input stream
			BufferedInputStream input =
				new BufferedInputStream(new FileInputStream(sourceFile));
						
			// Create output stream
			BufferedOutputStream output =
				new BufferedOutputStream(new FileOutputStream(targetFile));
		) {
			// Continuously read a byte from the input and add a 5 to it
			int r, numberOfBytesCopied = 0;
			while ((r = input.read()) != -1) {
				output.write(((byte)r) - 5);
				numberOfBytesCopied++;
			}
						
			// Display file size
			System.out.println(numberOfBytesCopied + " bytes copied");
		}
	}
}

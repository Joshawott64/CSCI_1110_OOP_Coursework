/* Author: rmazorow, modified by Joshua Gray
 * Date: 9/2/21
 * 
 * This program modifies previous work. The program stores Loan objects
 *  in a file called "Exercise17_07.dat" and adds/displays the total
 *   loan amount for all of them.
 */
import java.io.*;
public class Exercise17_07 {    
	public static void main(String[] args) throws IOException {        
		Loan loan1 = new Loan();        
		Loan loan2 = new Loan(1.8, 10, 10000);  
		Loan loan3 = new Loan(2.5, 15, 7500);
		Loan loan4 = new Loan(1.0, 8, 275);
		try (                
				ObjectOutputStream output = new ObjectOutputStream(new 
	FileOutputStream("Exercise17_07.dat"));        
				) {            
					output.writeObject(loan1);            
					output.writeObject(loan2);  
					output.writeObject(loan3);
					output.writeObject(loan4);
				}         
				catch (IOException ex) {            
					System.out.println("File could not be opened");        
				} 
		// Invoke outputData() method
		outputData();
	}
	
	public static void outputData() throws FileNotFoundException, IOException {
		double totalLoan = 0;
		try (ObjectInputStream input = 
				new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
			) {
			// Read loan object and get total loan amount
			for (int i = 0; i < 10;) {
				Loan loan = (Loan) input.readObject();
				totalLoan += loan.getLoanAmount();
			}
		}
		catch (EOFException ex) {
			System.out.println("All data has been read");
			System.out.println("Total loan amount: $" + totalLoan);
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Class not found");
		}
	}
}
 

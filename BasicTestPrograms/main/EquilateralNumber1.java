
package BasicTestPrograms.main;
import java.util.Scanner;


public class EquilateralNumber1 {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to print space
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			// print new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}
}


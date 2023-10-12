package scannerclass.main;

import java.util.Scanner;

public class ScannerClass {
	static int a;
	static float b;
	static String c;
	public static void main(String[] inputs) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string :: ");
		c=input.nextLine();
		System.out.println("entered string is :: "+c);
		System.out.println("Enter a float number :: ");
		b=input.nextFloat();
		System.out.println("entered float number is :: "+b);
		System.out.println("Enter an integer :: ");
		a=input.nextInt();
		System.out.println("Entered integer is :: "+a);
		
		
		
		
	}

}

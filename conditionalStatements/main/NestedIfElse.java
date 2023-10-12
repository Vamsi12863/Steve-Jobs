package conditionalStatements.main;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :: ");
		int a = 3;
		System.out.println("Enter second number :: ");
		int b = sc.nextInt();
		System.out.println("Enter third number :: ");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is greatest number");
			
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greatest number");
			
		}
		else {
			System.out.println(c+" is greatest number");
		}
		
		

	}

}

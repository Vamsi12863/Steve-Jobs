package conditionalStatements.main;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :: ");
		int a=sc.nextInt();
		
	
		if(a%2==0) {
			System.out.println(a+" is even");
		}
			else {
				System.out.println(a+" is odd");
				
			}
			
			
		}

	}



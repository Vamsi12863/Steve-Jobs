import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer :: ");
		int input1 = sc.nextInt();
		System.out.println("Enter second integer :: ");
		int input2=sc.nextInt();
		System.out.println("Enter choice :: + -> addition - -> subtraction * -> multiplication / -> division ");
		String opr = sc.next();
		switch(opr) {
		 
		case "+":
			System.out.println("addition");
			System.out.println("the addition of two numbers " + (input1+input2));
			break;
		case "-":
			System.out.println("subtraction");
			System.out.println("the subtraction of two numbers " + (input1-input2));
			break;
		case "*":
			System.out.println("multiplication");
			System.out.println("the multiplication of two numbers " + (input1*input2));
			break;
		case "/":
			float input11=input1;
			float input12=input2;
			float v = input11/input12;
			System.out.println("division");
			System.out.println("the division of two numbers " + v);
			break;
		default:
			System.out.println("Enter a valid number");
			
		}
	}

}

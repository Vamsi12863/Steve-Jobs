import java.util.Scanner;

public class RightHalf {
	
	public static String printPattern(int n)
	{
		int i, j;

		
		for (i = 1; i <= n; i++) {

			
			for (j = 1; j <= i; j++) {
				return "*";
			}

			
			System.out.println();
		}
		return i;
	}

	
	public static void main(String args[])
	{
		int choice=1;
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        while(choice==1) {
        	
        	System.out.print(printPattern(input));
        
        System.out.println("enter the choice :: ");
        choice=scanner.nextInt();
	}
        System.out.println("Exit the program :: ");
	}
}

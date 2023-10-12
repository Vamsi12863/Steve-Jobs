package BasicTestPrograms.main;
import java.util.Scanner;
public class Gcd   
{  
public static void main(String[] args)   
{  
//x and y are the numbers to find the GCF 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter input 1");
int input1 = sc.nextInt();
System.out.println("enter input 2");
int input2 = sc.nextInt();
int gcd = 1;  
//running loop form 1 to the smallest of both numbers  
for(int i = 1; i <= input1 && i <= input2; i++)  
{  
//returns true if both conditions are satisfied   
if(input1%i==0 && input2%i==0)  
//storing the variable i in the variable gcd  
gcd = i;  
}  
//prints the gcd  
System.out.printf("GCD of %d and %d is: %d", input1, input2, gcd);  
}  
} 

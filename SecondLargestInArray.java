import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestInArray {

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
System.out.println("Enter number of integers");
    int n=sc.nextInt();
    System.out.println("enter integers :: ");
    int a[]=new int[n];

    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();

    Arrays.sort(a);
    System.out.print("The second largest number: "+a[n-2]);
  }
}
package BasicTestPrograms.main;

import java.util.Scanner;

public class PalindromeMain {
	
PalindromeNumber pn = new PalindromeNumber();

	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
   
    boolean isPalindrome = isPalindrome(input);

    if (isPalindrome) {
        System.out.println(input + " is a palindrome.");
    } else {
        System.out.println(input + " is not a palindrome.");
    }
}


private static boolean isPalindrome(String input) {
	// TODO Auto-generated method stub
	return true;
}
}
package BasicTestPrograms.main;


public class PalindromeNumber {


    public static boolean isPalindrome(String input) {
        
        char[] charArray = input.toCharArray();

 
        StringBuilder reversed = new StringBuilder();

        
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }

        
        return input.equals(reversed.toString());
    }

   
}

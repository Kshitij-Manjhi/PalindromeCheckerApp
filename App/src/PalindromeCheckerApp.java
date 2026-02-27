import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC3
         *
         * This is a Palindrome Checker App Welcome Message
         *
         * @author Developer
         * @version 3.0
        */
        String input = "madam";
        String reversed = "";
        boolean isPalindrome = false;
        System.out.println("Input text: " + input);
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (input.equals(reversed)){
            isPalindrome = true;
        }
        System.out.println("Is it Palindrome? : "+ isPalindrome);
    }
}

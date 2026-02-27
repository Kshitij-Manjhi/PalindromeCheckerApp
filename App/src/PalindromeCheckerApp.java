import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC2
         *
         * This is a Palindrome Checker App Welcome Message
         *
         * @author Developer
         * @version 2.0
        */
        String input = "madam";
        boolean isPalindrome = false;
        System.out.println("Input text: " + input);
        for (int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i)!= input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it Palindrome? : "+ isPalindrome);
    }
}

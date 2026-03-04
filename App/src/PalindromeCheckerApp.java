import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC5
         *
         * This is a Palindrome Checker App using STACK
         *
         * @author Developer
         * @version 5.0
        */
        String input = "noon";
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        
        System.out.println("Input : " + input);
        
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it Palindrome? : "+ isPalindrome);
    }
}

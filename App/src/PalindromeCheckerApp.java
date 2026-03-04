
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC13
         *
         * This is a Palindrome Checker App Performance Comparison
         *
         * @author Developer
         * @version 13.0
        */

        String input = "level";
        String normalized = input.toLowerCase();

        long startTime = System.nanoTime();

        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        long endTime = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");
    }
}

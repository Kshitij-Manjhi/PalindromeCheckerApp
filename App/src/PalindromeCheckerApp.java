
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC9
         *
         * This is a Palindrome Checker App Recursive
         *
         * @author Developer
         * @version 9.0
        */

        String input = "madam";

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is it Palindrome? : " + isPalindrome);
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return check(s, start + 1, end - 1);
    }
}

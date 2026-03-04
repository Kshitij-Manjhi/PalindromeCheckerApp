
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC11
         *
         * This is a Palindrome Checker App Case-Insensitive & Space-Ignored
         *
         * @author Developer
         * @version 11.0
        */

        String input = "racecar";

        PalindromeService service = new PalindromeService();
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

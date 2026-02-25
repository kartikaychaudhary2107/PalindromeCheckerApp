public class PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Original String
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
=======
        // Hardcoded string literal
        String word = "madam";

        // Reverse the string manually
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program exits automatically after main ends
>>>>>>> 87fcea5db0e9f90b1cedbc9fd88a863ebeda6990
    }
}
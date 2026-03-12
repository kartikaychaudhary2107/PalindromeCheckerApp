 feature/UC13
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    // Stack-based palindrome check
    public static boolean stackPalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // Simple two-pointer palindrome check
    public static boolean simplePalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {

 feature/UC11
import java.util.Scanner;

// Service class that handles palindrome logic
class PalindromeChecker {


    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {

 feature/UC10
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
 develop
 develop
                return false;
            }
            start++;
            end--;
feature/UC13
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Stack strategy
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long stackTime = System.nanoTime() - startTime;

        // Deque strategy
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long dequeTime = System.nanoTime() - startTime;

        // Simple two-pointer strategy
        startTime = System.nanoTime();
        boolean simpleResult = simplePalindrome(input);
        long simpleTime = System.nanoTime() - startTime;

        System.out.println("\nPalindrome Results:");
        System.out.println("Stack: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two-pointer: " + simpleResult + " | Time: " + simpleTime + " ns");

        scanner.close();
    }


 feature/UC11
        }

        return true;
    }


}

// Main application class
public class UseCase11PalindromeCheckerApp {


    public static void main(String[] args) {



class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    // Convert string to linked list
    public static Node createLinkedList(String str) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < str.length(); i++) {
            Node newNode = new Node(str.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Check palindrome using linked list
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using fast & slow pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        // Compare halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
 develop
        }

        return true;
    }

    public static void main(String[] args) {

 feature/UC10
 develop
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

 feature/UC11
        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");

        // Normalize the string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
 develop
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
 feature/UC11
    }


    }


        String input = "madam";   // example input

        Node head = createLinkedList(input);

        if (isPalindrome(head))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
 develop
 develop
 develop
}

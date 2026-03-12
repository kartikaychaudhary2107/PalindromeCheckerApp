 feature/UC9
import java.util.Scanner;
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
develop

public class UseCase9PalindromeCheckerApp {

= feature/UC9
```
// Recursive method to check palindrome
public static boolean isPalindrome(String str, int start, int end) {

    // Base condition
    if (start >= end) {
        return true;
    }

    // If characters are not equal, not a palindrome
    if (str.charAt(start) != str.charAt(end)) {
        return false;
    }

    // Recursive call
    return isPalindrome(str, start + 1, end - 1);
}

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    boolean result = isPalindrome(input, 0, input.length() - 1);

    if (result) {
        System.out.println("The given string is a palindrome.");
    } else {
        System.out.println("The given string is not a palindrome.");
    }

    scanner.close();
}
```
=
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
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";   // example input

        Node head = createLinkedList(input);

        if (isPalindrome(head))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
 develop
}

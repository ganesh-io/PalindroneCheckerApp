public class PalindromeCheckerApp {

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    public static Node createLinkedList(String str) {
        Node head = null, temp = null;

        for(char c : str.toCharArray()) {
            Node newNode = new Node(c);

            if(head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        String input = "madam";

        Node head = createLinkedList(input);

        System.out.println("Linked List created for: " + input);
    }
}
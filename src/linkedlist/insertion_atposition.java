package linkedlist;

public class insertion_atposition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insertAtPosition(Node head, int value, int pos) {

        Node newNode = new Node(value);

        // Insert at beginning
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        // Reach node before position
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        // Connect new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}

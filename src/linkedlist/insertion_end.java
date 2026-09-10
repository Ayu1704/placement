package linkedlist;

public class insertion_end {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insertEnd(Node head, int value) {

        Node newNode = new Node(value);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }
}

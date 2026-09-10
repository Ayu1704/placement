package linkedlist;

public class DELETION_begin {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node deleteBeginning(Node head) {

        if (head == null) {
            return null;
        }

        head = head.next;

        return head;
    }
}

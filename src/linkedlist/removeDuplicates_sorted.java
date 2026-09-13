package linkedlist;

public class removeDuplicates_sorted {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node removeDuplicates(Node head) {

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        // 1 -> 1 -> 2 -> 3 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);

        // Remove duplicates
        head = removeDuplicates(head);

        // Print list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
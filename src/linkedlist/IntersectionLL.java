package linkedlist;

public class IntersectionLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node findIntersection(Node headA, Node headB) {

        Node a = headA;
        Node b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        // Common part
        Node common1 = new Node(40);
        Node common2 = new Node(50);

        common1.next = common2;

        // List A
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = new Node(30);

        // Connect A to common part
        headA.next.next.next = common1;


        // List B
        Node headB = new Node(5);
        headB.next = new Node(15);

        // Connect B to same common part
        headB.next.next = common1;


        // Find intersection
        Node answer = findIntersection(headA, headB);

        if (answer != null) {
            System.out.println("Intersection = " + answer.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
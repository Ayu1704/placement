package linkedlist;

public class Insertion_beginning {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        public static void main(String[] args) {

            Node head = new Node(10);

            Node second = new Node(20);
            Node third = new Node(30);

            head.next = second;
            second.next = third;

            // Insert 5 at beginning
            Node newNode = new Node(5);

            newNode.next = head;
            head = newNode;
            //call method
            //why don't we use System.out.println() (sout) to call the method?
            //Because insertBeginning() returns a Node, not a value that we want to print.
            head=insertBeginning(head,5);
            // Print
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
    // if function

    public static Node insertBeginning(Node head, int value) {

        Node newNode = new Node(value);

        newNode.next = head;

        head = newNode;

        return head;
    }
    }


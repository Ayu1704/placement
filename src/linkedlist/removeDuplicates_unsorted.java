package linkedlist;

import java.util.HashSet;

public class removeDuplicates_unsorted {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

    public static Node removeDuplicate(Node head) {

        if (head == null) {
            return null;
        }

        HashSet<Integer> set = new HashSet<>();

        set.add(head.data);

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (set.contains(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                set.add(temp.next.data);
                temp = temp.next;
            }
        }

        return head;
    }

        public static void main(String[] args) {

            // 1 -> 2 -> 1-> 3 -> 2-> 4
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(1);
            head.next.next.next = new Node(3);
            head.next.next.next.next = new Node(2);
            head.next.next.next.next.next = new Node(4);

            // Remove duplicates
            head = removeDuplicate(head);

            // Print list
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

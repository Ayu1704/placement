package linkedlist;

public class deletion_at_specifiedpos {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node dele(Node head,int pos){
        if(head==null){ // list empty
            return null;
        }
        // delete first node
        if(pos==0){
            return head.next;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec= new Node(20);
        Node thir = new Node(30);
        head.next=sec;
        sec.next=thir;
        thir.next=null;
        head = dele(head,2);
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
}

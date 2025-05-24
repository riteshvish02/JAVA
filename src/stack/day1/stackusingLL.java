package stack.day1;

public class stackusingLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head;
    public void push(int data){
        Node nn = new  Node(data);
        nn.next = this.head;
        this.head = nn;
    }
    public int pop(){
        if(head == null){
            System.out.println("stack is empty");
            return -1;
        }
        int dets = this.head.data;
        this.head = this.head.next;
        return dets;
    }
}

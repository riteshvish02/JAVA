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
    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp  = temp.next;
        }
        System.out.println();
    }
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
    public boolean isEmpty(){
        return this.head == null;
    }
    public int peek(){
        if(head == null){
            System.out.println("stack is already empty");
            return -1;
        }
        return this.head.data;
    }
}

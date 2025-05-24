package stack.day1;

public class Queueimp {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp  = temp.next;
        }
        System.out.println();
    }
    public void enqueue(int data){
        Node nn = new Node(data);
        if(head == null){
            this.tail = this.head = nn;
            return;
        }
        this.tail.next = nn;
        this.tail = nn;
    }
    public int dequeue(){
      if(head == null){
          System.out.println("queue is already empty");
          return -1;
      }
      int rv = this.head.data;
      this.head = this.head.next;
      return rv;
    }
}

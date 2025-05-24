package linkedlist.class1;

public class Doublylinkedlist {
   class Node {
       Node next;
       int data;
       Node prev;
       Node(int data){
         this.data = data;
         next = null;
         prev = null;
       }
   }
   Node head;
   public void print(){
       Node curr = this.head;
       while(curr != null){
           System.out.print(curr.data + " ");
           curr = curr.next;
       }
       System.out.println();
   }
   public void addfirst(int data){
       Node nn = new Node(data);
       nn.next = this.head;
       if(head != null){
           head.prev = nn;
       }
       this.head = nn;
   }
   public  void addlast(int data){
       Node nn = new Node(data);
       Node temp  = this.head;
       if(head == null){
           addfirst(data);
           return;
       }
       while(temp.next != null){
           temp = temp.next;
       }
       nn.prev = temp;
       temp.next = nn;
   }
   public void addAt(int idx ,int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node nn = new Node(data);
        Node temp = this.head;
        for(int i = 0;i < idx-1;i++){
            temp = temp.next;
        }
        Node forward = temp.next;
        temp.next = nn;
        nn.prev = temp;
        nn.next = forward;
        forward.prev = nn;
   }
   public int removefirst(){
       if(this.head == null){
           return -1;
       }
       int data = this.head.data;
       this.head = this.head.next;
       this.head.next.prev = null;
       return data;
   }
   public int removelast(){
       if(this.head == null){
           return -1;
       }
       if(this.head.next == null){
           return removefirst();
       }
       Node temp = this.head;
       while(temp.next.next != null){
           temp = temp.next;
       }
       int data = temp.next.data;
       temp.next = null;
       return data;
   }
   public int removeat(int idx){
       if(idx == 0){
           return removefirst();
       }
       Node temp = this.head;
       for(int i = 0; i < idx - 1;i++){
         temp = temp.next;
       }
       if (temp.next == null) return -1;
       int data = temp.next.data;
       temp.next = temp.next.next;
       temp.next.next.prev = temp;
       return data;
   }
}

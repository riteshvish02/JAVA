package linkedlist.class1;

public class Linkedlist {

  class Node {
      int data;
      Node next;
      Node(int data){
          this.data = data;
          this.next = null;
      }
  }
  Node head;
  public void print(){
      Node temp = this.head;
      while(temp != null){
          System.out.print(temp.data + " ");
          temp = temp.next;
      }
      System.out.println();
      System.out.println("-------------------");
  }
  public void addFirst(int data){
      Node nn = new Node(data);
      nn.next = this.head;
      this.head = nn;
  }
  public void addLast(int data){
      if(this.head == null){
          addFirst(data);
          return;
      }
      Node nn = new Node(data);
      Node temp = this.head;
      while(temp.next != null){
          temp = temp.next;
      }
      temp.next = nn;
  }
  public void addAt(int data,int idx){
      if(idx < 0){
          return;
      }
      if(idx == 0){
          addFirst(data);
          return;
      }

      Node n = new Node(data);
      Node temp = this.head;
      for(int i =0;i < idx-1;i++){
          temp = temp.next;
      }
      Node forward = temp.next;
      temp.next = n;
      n.next = forward;
  }

}

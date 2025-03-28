package linkedlist.class1;

public class operations {
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addFirst(1);
        l1.addFirst(5);
        l1.print();
        l1.addLast(8);
        l1.print();
        l1.addAt(15,1);
        l1.print();
    }
}

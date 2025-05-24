package stack.day1;

import java.util.Stack;

public class create {
    public static void main(String[] args) {
        stackusingLL stack = new stackusingLL();
        stack.push(5);
        stack.push(8);
        stack.display();
        //builtin stacks
        Stack<Integer> s = new Stack<>();
        Queueimp queue = new Queueimp();
        queue.enqueue(5);
        queue.enqueue(8);
        queue.dequeue();
        queue.enqueue(8);
        queue.display();
    }
}

package stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class que1 {
    public static void main(String[] args) {
        //given a number you have to a program to generate all binary from decimal 1-n;
        int n = 5;
        generate(n);
    }
    public static void generate(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.remove();
            System.out.println(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }
}

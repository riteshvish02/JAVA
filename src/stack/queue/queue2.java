package stack.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class queue2 {
    public static void main(String[] args) {
        //given a streams of character find first non repeating character form stream
        String stream = "aabcbb";
        generate(stream);

    }
    public static void generate(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
            q.offer(c);
            while(!q.isEmpty() && freq.get(q.peek()) > 1){
                q.poll();
            }
            if(q.isEmpty()){
                System.out.print("- ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
    }
}

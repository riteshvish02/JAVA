package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
//        f(str,"");
        List<Integer> arr = List.of(1,2,3);
        permt(arr,"");
    }
    public static void f(String str, String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }
        for(int i = 0;i < str.length();i++){
            String st = str.substring(0,i) + str.substring(i+1);
            f(st,output + str.charAt(i));
        }
    }
    public static void permt(List<Integer> arr,String output){
        if(arr.isEmpty()){
            System.out.println(output);
            return;
        }
        for(int i =0;i < arr.size();i++){
            List<Integer> remaining = new ArrayList<>(arr);
            int removed = remaining.remove(i);
            permt(remaining,output+removed);
        }
    }
}

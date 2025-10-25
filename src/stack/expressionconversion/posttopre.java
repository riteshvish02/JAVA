package stack.expressionconversion;

import java.util.Scanner;
import java.util.Stack;

public class posttopre {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.print("Enter the postexp ");
       String str = inp.next();
       Stack<String> st = new Stack<>();
       for(int i = 0;i < str.length();i++){
           char c = str.charAt(i);
           if(isoperator(c)){
               String op1 = st.pop();
               String op2 = st.pop();
               String res = c + op2 + op1;
               st.push(res);
           }else{
               st.push(Character.toString(c));
           }
       }
        System.out.println(st.pop());
    }
    public static boolean isoperator(char c){
        if(c == '^' || c == '/' || c == '*' || c == '+' || c == '-'){
            return true;
        }
        return false;
    }
}

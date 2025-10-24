package stack.expressionconversion;

import java.util.Scanner;
import java.util.Stack;

public class prefixtopost {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter prefix ");
        String strr = inp.next();
        StringBuilder str = new StringBuilder(strr);
        str.reverse();
        System.out.println(str);
        Stack<String> st = new Stack<>();
        for(int i =0;i < str.length();i++){
            char c = str.charAt(i);
            if(isoperator(c)){
                String a = st.pop();
                String b = st.pop();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                String res =  a + b + c;
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

package stack.expressionconversion;

import java.util.Scanner;
import java.util.Stack;

public class infixtopost {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str ;
        System.out.print("Enter String ");
        str = inp.next();
        inp.close();
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if(isoperand(c)){
                res += c;
            }else if(c == '('){
                st.push(c);
            }
            else if(c == ')'){
                while(st.peek() != '('){
                    res += st.pop();
                }
                st.pop();
            }else{
                while(!st.empty() && precedence(c) <= precedence(st.peek())){
                    res += st.pop();
                }
                st.push(c);
            }
        }
        while(!st.empty()){
            res += st.pop();
        }
        System.out.println(res);
    }
    public static boolean isoperand(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }
    public static int precedence(char c){
        switch (c){
            case '^':
                return 3;
            case '*':
                return 2;
            case '/':
                return 2;
            case '+':
                return 1;
            case '-':
                return 1;
        }
        return 0;
    }
}

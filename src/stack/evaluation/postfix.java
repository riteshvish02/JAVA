package stack.evaluation;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String str = "23*54*+9-";
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < str.length();i++){
            char c  = str.charAt(i);
            if(Character.isDigit(c)){
                st.push(c - '0');
            }else{
                int op2 = st.pop();
                int op1 = st.pop();
                switch (c){
                    case '+':
                        st.push(op1 + op2);
                        break;
                    case '-':
                        st.push(op1 - op2);
                        break;
                    case '*':
                        st.push(op1 * op2);
                        break;
                    case '/':
                        st.push(op1 / op2);
                        break;
                }
            }

        }
        System.out.println(st.pop());
    }
}

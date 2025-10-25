package stack.evaluation;

import java.util.Stack;

public class infix {
    public static void main(String[] args) {
      String str = "2*(5*(3+6))/5-2";
      Stack<Integer> operand = new Stack<>();
      Stack<Character> operator  =new Stack<>();
      for(int i = 0;i < str.length();i++){
          char c = str.charAt(i);
          if(Character.isDigit(c)){
              operand.push(c-'0');
          }else if(c == '('){
              operator.push(c);
          }else if(c == ')'){
              while(!operator.empty() && operator.peek() != '('){
                  int op2 = operand.pop();
                  int op1 = operand.pop();
                  char opr = operator.pop();
                  operand.push(operation(opr,op1,op2));
              }
              operator.pop();
          }else{
              while(!operator.empty() && precedence(c) <= precedence(operator.peek())){
                  int op2 = operand.pop();
                  int op1 = operand.pop();
                  char opr = operator.pop();
                  operand.push(operation(opr,op1,op2));
              }
              operator.push(c);
          }
      }
      while(!operator.empty()){
          int op2 = operand.pop();
          int op1 = operand.pop();
          char opr = operator.pop();
          operand.push(operation(opr,op1,op2));
      }
        System.out.println(operand.pop());
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
    public static int operation(char c,int op1,int op2){
        switch (c){
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '/':
                return op1 / op2;
            case '*':
                return op1 * op2;
        }
        return 0;
    }
}

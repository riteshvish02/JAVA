package stack.day2;

import java.util.Stack;

public class nextgreaterelem {
    public static void main(String[] args) {
        int arr[] = {4,5,8,15};
        Stack<Integer> st = new Stack<>();
        int[] output = new int[arr.length];
        for(int i =0; i < arr.length;i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                output[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            output[st.pop()] = -1;
        }
        for (int val :output){
            System.out.print(val + " ");
        }
    }
}

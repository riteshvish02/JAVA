package stack.day2;

import java.util.Stack;

public class nextsmaller {
    public static void main(String[] args) {
        int arr[] = {5,4,2,3,6,9};
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i =1;i < arr.length;i++){
                while(!st.empty() && arr[st.peek()] >= arr[i]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.empty()){
            res[st.pop()] = -1;
        }
        for(int val : res){
            System.out.print(val + " ");
        }
    }
}

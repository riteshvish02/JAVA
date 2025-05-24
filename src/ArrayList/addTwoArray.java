package ArrayList;

import java.util.ArrayList;

public class addTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1};
        int[] arr2 = {3,3,3,3,3};
        System.out.println(AddTwoArray(arr1,arr2));
    }
    public static ArrayList<Integer> AddTwoArray(int a[], int b[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int  i = a.length - 1;
        int  j = b.length - 1;
        int carry = 0;
        while(i>=0 || j >= 0){
            int sum = 0;
            if(i >= 0){
               sum += a[i] ;
            }
            if(j >= 0){
                sum += b[j];
            }
            sum += carry;
            int rem = sum%10;
            carry = sum/10;
            ans.add(0,rem);
            i--;
            j--;
        }
        if(carry != 0){
            ans.add(0,carry);
        }
        return ans;
    }

}

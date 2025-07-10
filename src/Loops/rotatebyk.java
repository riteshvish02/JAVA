package Loops;
import java.util.Scanner;

public class rotatebyk {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int[] arr = {1,2,3,4};
        int k = 2;
        int n = arr.length;

        reverse(arr,0,n-1);    // <- Set breakpoint here
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

//        System.out.println("Program Ended");
//        new Scanner(System.in).nextLine();  // Pause to observe
        for(int val:arr){
            System.out.println(val);
        }
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];         // <- Set breakpoint here to inspect values
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
